package ma.enset.service;

import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Game;
import ma.enset.stubs.gameGrpc;

import java.util.HashMap;
import java.util.Random;

public class service extends gameGrpc.gameImplBase{

    //Initialize magic number between 0 & 100
    int nb_Magic = new Random().nextInt(100);

    HashMap<String, StreamObserver<Game.respMsg>> players=new HashMap<>();

    @Override
    public StreamObserver<Game.tentative> requestResponse(StreamObserver<Game.respMsg> responseObserver) {
        return new StreamObserver<Game.tentative>() {
            @Override
            public void onNext(Game.tentative tentative) {

                System.out.println(nb_Magic);

                String player=tentative.getUsername();
                //Add player a new player 
                if(!players.containsKey(player)){
                    players.put(player,responseObserver);
                }
                int nb_Entered= (int) tentative.getNumber();

                if(nb_Entered==nb_Magic){
                    for(String Player:players.keySet()){
                        Game.respMsg response;
                        if(Player.equals(player)){
                            response = Game.respMsg.newBuilder()
                                    .setContent("You WIN ✔\uD83D\uDC4F\uD83D\uDC4F.... ")
                                    .build();
                        }
                        else {
                            response = Game.respMsg.newBuilder()
                                    .setContent("<" + player +
                                            "> WIN This part..\uD83D\uDE10\uD83D\uDE10..Try Later")
                                    .build();
                        }
                        players.get(Player).onNext(response);
                        players.get(Player).onCompleted();
                    }
                }
                else if(nb_Entered<nb_Magic){
                    Game.respMsg response=Game.respMsg.newBuilder()
                            .setContent("NB entered LESS than The Mag Number")
                            .build();
                    responseObserver.onNext(response);
                }else{
                    Game.respMsg response=Game.respMsg.newBuilder()
                            .setContent("NB entered GREATER than The Mag Number")
                            .build();
                    responseObserver.onNext(response);
                }
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.toString());
            }

            @Override
            public void onCompleted() {
                System.out.println("End Game....");
            }
        };
    }
}
