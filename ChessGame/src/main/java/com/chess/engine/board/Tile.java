package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class Tile {

    private final int tileCoordinate;

    private final Map<Integer, EmptyTile> EMPTY_TILES_CACHE = createAllPossibleEmptyTiles();

    private Map<Integer, EmptyTile> createAllPossibleEmptyTiles() {
        //Create a map to hold all tiles in a chess board
        Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();
        //Go through the board and put all the empty tiles in the hashmap
        for (int i = 0; i < 64; i++) {
            emptyTileMap.put(i, new EmptyTile(i));
        }

        //return emptyTileMap;
        // Returns copy of the emptyTileMap that's unmodifiable
        return Collections.unmodifiableMap(emptyTileMap);
    }

    public Tile createTile(final int tileCoordinate, final Piece piece) {
        return piece != null ? new OccupiedTile(tileCoordinate, piece) : EMPTY_TILES_CACHE.get(tileCoordinate);
    }

    public Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

}
