package com.lti.model;

import com.lti.board.ChessBoard;

public class Pawn implements ChessPiece{
    private final PieceName name;

    private final Color color;

    @Override
    public Color getColor() {
        return color;
    }

    private boolean isDead;

    public Pawn(PieceName name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard board) {

    }

    @Override
    public PieceName getPieceName() {
        return name;
    }

    @Override
    public boolean isDead() {
        return isDead;
    }

    @Override
    public void setDead(boolean isDead) {
            this.isDead=isDead;
    }
}
