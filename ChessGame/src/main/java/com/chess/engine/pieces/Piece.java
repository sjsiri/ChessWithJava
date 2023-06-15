package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Piece {

    final int piecePosition;

    private final Alliance pieceAlliance;

    public Piece(int piecePosition, Alliance pieceAlliance) {
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
    }

    public Alliance getPieceAlliance() {
        return pieceAlliance;
    }

    public Collection<Move> calculateLegalMoves(Board board) {
        List<Move> availableMoves = new ArrayList<>();

        return availableMoves;
    }
}
