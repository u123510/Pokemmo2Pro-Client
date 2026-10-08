package cn.pokemmo.world.tile;

import f.pg_0;

public class TileMatrix2D {
    public final int o2;
    public final int yB0;
    public final pg_0[][] an;
    public short Mv0;

    public TileMatrix2D(int width, int height) {
        this.Mv0 = -1;
        this.o2 = width;
        this.yB0 = height;
        this.an = new pg_0[width][height];
    }

    public pg_0 wr0(short x, short y) {
        if (x < 0 || x >= this.an.length || y < 0 || y >= this.an[x].length) {
            return null;
        }
        return this.an[x][y];
    }
}
