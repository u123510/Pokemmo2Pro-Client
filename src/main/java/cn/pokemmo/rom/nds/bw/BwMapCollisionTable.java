package cn.pokemmo.rom.nds.bw;

import f.Pq0;
import java.nio.ByteBuffer;

/**
 * 黑白（BW）地图双层碰撞网格表
 * 包含地图各层的碰撞网格单元
 */
public class BwMapCollisionTable {
    public final int s4;
    public final Pq0[] h80;

    public BwMapCollisionTable(short mapId, ByteBuffer buffer) {
        this.s4 = buffer.getInt();
        buffer.position();
        this.h80 = new Pq0[this.s4];
        for (int i = 0; i < this.s4; i = (byte) (i + 1)) {
            this.h80[i] = new Pq0((byte) i, buffer, mapId);
        }
    }

    public int getLayerCount() {
        return this.s4;
    }

    public Pq0[] getLayers() {
        return this.h80;
    }
}
