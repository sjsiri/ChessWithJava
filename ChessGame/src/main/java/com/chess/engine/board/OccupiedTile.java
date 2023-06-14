package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public class OccupiedTile extends Tile {

    private final Piece pieceOnTile;

    public OccupiedTile(int tileCoordinate, Piece pieceOnTile) {
        super(tileCoordinate);
        this.pieceOnTile = pieceOnTile;
    }

    @Override
    public boolean isTileOccupied() {
        return true;
    }

    @Override
    public Piece getPiece() {
        return null;
    }
}
