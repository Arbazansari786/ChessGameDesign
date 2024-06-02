package com.lti.board;

import com.lti.model.ChessCell;
import com.lti.model.ChessPiece;
import com.lti.model.Move;
import com.lti.model.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChessBoard implements Board {


    private final List<List<ChessCell>> chessBoard;
    private static final Integer rowCount = 8;
    private static final Integer colCount = 8;

    public ChessBoard() {

        chessBoard = new ArrayList<>();

        for (int i = 0; i < rowCount; i++) {
            List<ChessCell> chessCells = new ArrayList<ChessCell>();
            for (int j = 0; j < colCount; j++) {
                ChessCell chessCell = new ChessCell(i, j);
                chessCells.add(chessCell);
            }
            chessBoard.add(chessCells);
        }
    }

    @Override
    public void applyMove(Move move) {
        Pair src = move.getSource();
        Pair dest = move.getDestination();
        ChessPiece srcPiece=getCell(src).getChessPiece().get();
        srcPiece.move(getCell(src),getCell(dest),this);
    }

    private ChessCell getCell(Pair pair){
        return chessBoard.get(pair.getX()).get(pair.getY());
    }

    @Override
    public void display() {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                Optional<ChessPiece> piece = getChessPiece(new Pair(i, j));
                if (piece.isPresent()) {
                    System.out.print(piece.get().getPieceName() + " | ");
                } else {
                    System.out.println(" 0 | ");
                }
            }
            System.out.println();
        }

    }

    public void removePiece(int row,int col){
        chessBoard.get(row).get(col).setChiecePiece(Optional.empty());
    }
    public void setChessPiece(ChessPiece piece,int row, int col){
        chessBoard.get(row).get(col).setChiecePiece(Optional.of(piece));
    }

    public Optional<ChessPiece> getChessPiece(Pair pair) {
        return chessBoard.get(pair.getX()).get(pair.getY()).getChessPiece();

    }
}
