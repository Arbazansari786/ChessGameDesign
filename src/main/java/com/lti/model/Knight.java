package com.lti.model;

import com.lti.board.ChessBoard;

public class Knight implements ChessPiece{

    private final PieceName name;

    private final Color color;
    private boolean isDead;

    public Knight(PieceName name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard board) {

        int x_diff=Math.abs(source.getX()-destination.getX());
        int y_diff=Math.abs(source.getY()-destination.getY());

        // InValid Move
        if(!(Math.max(x_diff,y_diff)==2 && Math.min(x_diff,y_diff)==1))
            throw new IllegalArgumentException("Illegal move for Knight");
        //Make Move

        if(destination.getChessPiece().isPresent()){
            if(destination.getChessPiece().get().getColor().equals(getColor()))
                throw new IllegalArgumentException("Can't MOve since your piece i sthere in destination");
        }

        board.removePiece(source.getX(), source.getY());
        board.setChessPiece(this,destination.getX(), destination.getY());
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
