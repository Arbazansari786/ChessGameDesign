package com.lti.board;

import com.lti.model.PieceName;
import com.lti.player.ChessPlayer;
import com.lti.player.Player;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Chess extends BoardGame{

    private final ChessPlayer player1;
    private final ChessPlayer player2;


    
    public Chess(ChessPlayer player1, ChessPlayer player2, ChessBoard chessBoard) {

        super(new ArrayDeque<>(Arrays.asList(player1,player2)),chessBoard );
        this.player1 = player1;
        this.player2 = player2;

    }

    @Override
    public boolean isOver() {
        return player1.getPiece(PieceName.KING).isDead() ||
                player2.getPiece(PieceName.KING).isDead();
    }
}
