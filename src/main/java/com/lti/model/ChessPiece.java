package com.lti.model;

import com.lti.board.ChessBoard;

public interface ChessPiece {

    void move(ChessCell source, ChessCell destination, ChessBoard board);

    PieceName getPieceName();

    boolean isDead();

    void setDead(boolean isDead);

    Color getColor();

}
