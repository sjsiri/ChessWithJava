package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public abstract class Tile {

    private final int tileCoordinate;

    private final Map<Integer, EmptyTile> EMPTY_TILES = createAllPossibleEmptyTiles();

    private Map<Integer, EmptyTile> createAllPossibleEmptyTiles() {
        //Create a map to hold all tiles in a chess board
        Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();
        //Go through the board and put all the empty tiles in the hashmap
        for (int i = 0; i < 64; i++) {
            emptyTileMap.put(i, new EmptyTile(i));
        }

        return emptyTileMap;
    }

    public Tile createTile(final int tileCoordinate, final Piece piece) {
        return piece != null ? new OccupiedTile(tileCoordinate, piece) : EMPTY_TILES.get(tileCoordinate);
    }

    private Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

}
