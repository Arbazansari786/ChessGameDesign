package com.lti.player;

import com.lti.board.ChessBoard;
import com.lti.model.ChessPiece;
import com.lti.model.Move;
import com.lti.model.Pair;
import com.lti.model.PieceName;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer {
    public HumanChessPlayer(ChessBoard chessBoard, Map<PieceName, ChessPiece> pieces, String name) {
        super(chessBoard, pieces, name);
    }

    @Override
    public Move makeMove() {

        getChessBoard().display();
        System.out.println("Enter Source pair");
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        Pair src = new Pair(sx, sy);

        //Validation for source
        Optional<ChessPiece> piece = getChessBoard().getChessPiece(src);
        if (piece.isEmpty())
            throw new IllegalArgumentException("Empty Piece");
        if (!piece.get().equals(getPiece(piece.get().getPieceName())))
            throw new IllegalArgumentException("Wrong Piece You have picked");

        System.out.println("Enter destination Points");
        int dx = sc.nextInt();
        int dy = sc.nextInt();
        Pair dest = new Pair(dx, dy);

        //Validation for Destination

        return new Move(src,dest);
    }
}
