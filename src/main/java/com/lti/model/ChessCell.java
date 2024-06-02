package com.lti.model;

import java.util.Optional;

public class ChessCell {

    private final Integer x;
    private final Integer y;

    public ChessCell(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        chessPiece=Optional.empty();

    }
    private Optional<ChessPiece> chessPiece;

    public void setChiecePiece(Optional<ChessPiece> chessPiece){
        this.chessPiece=chessPiece;
    }

    public void removeChessPiece(){
        this.chessPiece=Optional.empty();
    }
    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Optional<ChessPiece> getChessPiece() {
        return chessPiece;
    }
}
