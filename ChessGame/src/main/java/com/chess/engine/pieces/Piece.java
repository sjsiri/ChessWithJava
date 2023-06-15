package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

import java.util.List;

public class Piece {

    private final int piecePosition;

    private final Alliance pieceAlliance;

    public Piece(int piecePosition, Alliance pieceAlliance) {
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
    }

    public List<Move> calculateLegalMoves(Board board) {
        
    }
}
