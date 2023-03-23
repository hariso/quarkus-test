package org.example;

import io.conduit.grpc.Specifier;
import io.conduit.grpc.SpecifierPluginGrpc;
import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;

@GrpcService
public class SpecifierService extends SpecifierPluginGrpc.SpecifierPluginImplBase {
    @Override
    public void specify(Specifier.Specify.Request request, StreamObserver<Specifier.Specify.Response> responseObserver) {
        responseObserver.onNext(Specifier.Specify.Response.newBuilder()
                .setName("apache-iceberg")
                .setSummary("Apache Iceberg connector.")
                .setDescription("Apache Iceberg connector.")
                .setVersion("v0.1.0")
                .setAuthor("Meroxa, Inc.")
            .build());
    }
}
