package com.lti.player;

import com.lti.board.ChessBoard;
import com.lti.model.ChessCell;
import com.lti.model.ChessPiece;
import com.lti.model.Move;
import com.lti.model.PieceName;

import java.util.Map;

public abstract class ChessPlayer implements Player {

    private final ChessBoard chessBoard;
    private final Map<PieceName, ChessPiece> pieces;

    public ChessPiece getPiece(PieceName piece) {
        if (!pieces.containsKey(piece))
            throw new IllegalArgumentException("No Valid Arguments");
        return pieces.get(piece);

    }

    private final String name;

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public Map<PieceName, ChessPiece> getPieces() {
        return pieces;
    }

    public ChessPlayer(ChessBoard chessBoard, Map<PieceName, ChessPiece> pieces, String name) {
        this.chessBoard = chessBoard;
        this.pieces = pieces;
        this.name = name;

    }


    @Override
    public String getName() {
        return name;
    }
}
