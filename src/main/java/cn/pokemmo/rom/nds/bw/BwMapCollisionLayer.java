package cn.pokemmo.rom.nds.bw;

import java.nio.ByteBuffer;

/**
 * 黑白（BW）地图双层碰撞网格数据单元
 */
public class BwMapCollisionLayer {
    public final int Mr0;
    public final int Sg0;
    public final short[][][] UH;

    public BwMapCollisionLayer(byte layerIndex, ByteBuffer buffer, short mapId) {
        int width = buffer.getShort();
        int height = buffer.getShort();
        this.Mr0 = height;
        if (mapId == 9 && layerIndex == 30) {
            width += 2;
        }

        this.Sg0 = width;
        this.UH = new short[2][height][width];

        for (int y = 0; y < this.Mr0; ++y) {
            for (int x = 0; x < this.Sg0; ++x) {
                if (mapId != 9 || layerIndex != 30 || (x != 0 && x != this.Sg0 - 1)) {
                    for (int layer = 0; layer < 2; ++layer) {
                        this.UH[layer][y][x] = buffer.getShort();
                    }
                } else {
                    this.UH[0][y][x] = 1;
                    this.UH[1][y][x] = 129;
                }
            }
        }
    }

    public int getHeight() {
        return this.Mr0;
    }

    public int getWidth() {
        return this.Sg0;
    }

    public short[][][] getCollisionData() {
        return this.UH;
    }
}
