package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public class EmptyTile extends Tile {

    public EmptyTile(final int tileCoordinate) {
        super(tileCoordinate);
    }

    @Override
    public boolean isTileOccupied() {
        return false;
    }

    @Override
    public Piece getPiece() {
        return null;
    }
}
