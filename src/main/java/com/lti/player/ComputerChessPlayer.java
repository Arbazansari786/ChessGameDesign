package com.lti.player;

import com.lti.board.ChessBoard;
import com.lti.model.ChessPiece;
import com.lti.model.Move;
import com.lti.model.PieceName;

import java.util.Map;

public class ComputerChessPlayer extends ChessPlayer{
    public ComputerChessPlayer(ChessBoard chessBoard, Map<PieceName, ChessPiece> pieces, String name) {
        super(chessBoard, pieces, name);
    }

    @Override
    public Move makeMove() {
        return null;
    }
}
