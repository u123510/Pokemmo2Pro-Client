package cn.pokemmo.rom.nds.terrain;

import f.Ae;
import java.nio.ByteBuffer;

/**
 * DPPt / HGSS 地图地形网格与浮点高程抽取器
 * 
 * 职责:
 * 解析第 4 世代卡带中地形网格的索引图层、碰撞矩阵，并将字节高度除以 8.0f 转换为真实 3D 世界高度图。
 * 
 * 原混淆类: f.coN / con__3
 */
public class DpptHgssMapTerrainGrid extends AbstractNdsMapTerrainGrid {
    public float[][] Wm0;
    public final boolean uf0;

    public DpptHgssMapTerrainGrid(short mode, Ae asset) {
        super();
        this.SM = mode;
        ByteBuffer buffer = asset.j90();
        this.It0 = (short) buffer.get();
        this.WH = (short) buffer.get();
        boolean indexed = buffer.get() == 1;
        boolean floating = buffer.get() == 1;
        this.uf0 = floating;
        if (indexed != floating) {
            throw new RuntimeException();
        }
        byte[] name = new byte[buffer.get()];
        buffer.get(name);
        new String(name);
        if (indexed) {
            this.l1 = new int[this.It0][this.WH];
            for (int y = 0; y < this.WH; y++) {
                for (int x = 0; x < this.It0; x++) {
                    this.l1[x][y] = buffer.getShort();
                }
            }
        }
        if (this.uf0) {
            this.Wm0 = new float[this.It0][this.WH];
            for (int y = 0; y < this.WH; y++) {
                for (int x = 0; x < this.It0; x++) {
                    this.Wm0[x][y] = buffer.get() / 8.0F;
                }
            }
        }
        this.M70 = new int[this.It0][this.WH];
        for (int y = 0; y < this.WH; y++) {
            for (int x = 0; x < this.It0; x++) {
                this.M70[x][y] = buffer.getShort();
            }
        }
    }
}
