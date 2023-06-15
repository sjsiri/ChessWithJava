package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import com.chess.engine.board.Tile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Knight extends Piece {

    private final int[] candidateMoveCoordinates = { -17, -15, -10, -6, 6, 10, 15, 17 };

    public Knight(final int piecePosition, Alliance pieceAlliance) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {
        // Go through all the options of moves
        int candidateDestinationCoordinate;
        List<Move> legalMoves = new ArrayList<>();

        for (int currentCandidate : candidateMoveCoordinates) {
            candidateDestinationCoordinate = this.piecePosition + currentCandidate;

            if(true) {
                Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);

                if (!candidateDestinationTile.isTileOccupied()) {
                  legalMoves.add(new Move());
                } else {
                    Piece pieceAtDestination = candidateDestinationTile.getPiece();
                    Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();

                    if(getPieceAlliance() != pieceAlliance) {
                        legalMoves.add(new Move());
                    }
                }

            }
        }

        return Collections.unmodifiableList(legalMoves);
    }
}
