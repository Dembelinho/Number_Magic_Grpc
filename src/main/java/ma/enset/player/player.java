package ma.enset.player;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Game;
import ma.enset.stubs.gameGrpc;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.Thread.sleep;

public class player {
    public static void main(String[] args) throws InterruptedException {

        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 5151)
                .usePlaintext().build();
        gameGrpc.gameStub gameStub = gameGrpc.newStub(managedChannel);

        String username;
        System.out.print("Enter ur name : ");
        Scanner scanner = new Scanner(System.in);
        username=scanner.next();

        StreamObserver<Game.tentative> tentativeStreamObserver = gameStub.requestResponse(new StreamObserver<Game.respMsg>() {
            @Override
            public void onNext(Game.respMsg repMsg) {
                System.out.println(repMsg.getContent());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.toString());
            }

            @Override
            public void onCompleted() {
                exit(0);
            }
        });

        while(true) {
            sleep(1000);
            System.out.println("Try to find the Number: ");
            int number=scanner.nextInt();
            Game.tentative build = Game.tentative.newBuilder()
                    .setUsername(username)
                    .setNumber(number)
                    .build();
            tentativeStreamObserver.onNext(build);
        }
    }
}
