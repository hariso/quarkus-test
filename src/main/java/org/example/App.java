package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Arrays;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class App {
    public static void main(String... args) {
        int port;
        try (ServerSocket socket = new ServerSocket(0)) {
            port = socket.getLocalPort();
        } catch (IOException e) {
            System.err.println("Port is not available");
            System.exit(1);
            return;
        }

        String[] newArgs = Arrays.copyOf(args, args.length + 1);
        newArgs[newArgs.length - 1] = String.format("-Dquarkus.grpc.server.port=%d", port);

        System.out.printf("1|1|tcp|localhost:%d|grpc%n", port);
        Quarkus.run(newArgs);
    }
}
