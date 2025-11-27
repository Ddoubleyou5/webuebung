package edu.fra.uas.webapp.service.grpc;
import java.util.List;
import java.util.Random;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.DoubleValue;

import edu.fra.uas.webapp.grpc.GradesServiceGrpc.GradesServiceImplBase;
import edu.fra.uas.webapp.grpc.GradingService.GradesRequest;
import edu.fra.uas.webapp.grpc.GradingService.GradesResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import edu.fra.uas.webapp.service.GradingService;

@GrpcService
public class GradesServiceGrpc extends GradesServiceImplBase {
    private final GradingService gradingService;

    public GradesServiceGrpc(GradingService gradingService) {
        this.gradingService = gradingService;
    }

    @Override
    public void listGrades(GradesRequest request, StreamObserver<GradesResponse> responseObserver) {
        List<Double> grades = gradingService.getGrades();
        GradesResponse.Builder responsBuilder = GradesResponse.newBuilder();
        for (Double grade : grades){
            responsBuilder.addGrades(DoubleValue.newBuilder().setValue(grade).build());
        }
        responseObserver.onNext(responsBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void findGradeByIndex(Int64Value request, StreamObserver<DoubleValue> responseObserver) {
        int index = (int) request.getValue();
        Double grade = Double.valueOf(gradingService.getGrades().get(index));
        DoubleValue response = DoubleValue.newBuilder().setValue(grade).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addGrade(DoubleValue request, StreamObserver<BoolValue> responseObserver) {
        Double grade = request.getValue();
        BoolValue response = BoolValue.newBuilder().setValue(gradingService.addGrade(grade)).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateGrade(Int64Value request, StreamObserver<BoolValue> responseObserver) {
        Random rand = new Random();
        int index = (int) request.getValue();
        double newGrade = 1.0 + (rand.nextDouble() * 5.0);
        gradingService.getGrades().set(index, newGrade);
        boolean success = false;

        if (gradingService.getGrades().get(index) == newGrade){
            success = true;
        }
        BoolValue response = BoolValue.newBuilder().setValue(success).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteGrade(Int64Value request, StreamObserver<BoolValue> responseObserver) {
        int index = (int) request.getValue();
        gradingService.getGrades().remove(index);
        boolean success = true;
        BoolValue response = BoolValue.newBuilder().setValue(success).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
