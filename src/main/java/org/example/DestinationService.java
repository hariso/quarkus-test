package org.example;

import io.conduit.grpc.Destination;
import io.conduit.grpc.DestinationPluginGrpc;
import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;

@GrpcService
public class DestinationService extends DestinationPluginGrpc.DestinationPluginImplBase {
    @Override
    public void configure(Destination.Configure.Request request, StreamObserver<Destination.Configure.Response> responseObserver) {
        super.configure(request, responseObserver);
    }

    @Override
    public void start(Destination.Start.Request request, StreamObserver<Destination.Start.Response> responseObserver) {
        super.start(request, responseObserver);
    }
}
