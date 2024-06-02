package com.lti.board;

import com.lti.model.Move;
import com.lti.player.Player;

import java.util.List;
import java.util.Queue;

public abstract class BoardGame {

    private final Queue<Player> players;

    private final Board board;

    public BoardGame(Queue<Player> players, Board board) {
        this.players = players;
        this.board = board;
    }

    public void startGame(){

        while (true){
           Player currPlayer=players.poll();
           Move move=currPlayer.makeMove();
           board.applyMove(move);
           if(isOver()){
               System.out.println(currPlayer.getName() +" Wins!");
           }
        }
    }

    public abstract boolean isOver();

}
