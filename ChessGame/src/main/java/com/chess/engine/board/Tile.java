package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public abstract class Tile {

    private final int tileCoordinate;

    public Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

}
