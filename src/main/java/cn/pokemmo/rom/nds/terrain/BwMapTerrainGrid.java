package cn.pokemmo.rom.nds.terrain;

import f.Ae;
import java.nio.ByteBuffer;

/**
 * 黑白 (BW) 地图地形图块与多层图元矩阵解析器
 * 
 * 职责:
 * 解析第 5 世代卡带地形数据结构中的多层图块碰撞矩阵。
 * 
 * 原混淆类: f.dd_2
 */
public class BwMapTerrainGrid extends AbstractNdsMapTerrainGrid {

    public BwMapTerrainGrid(short mode, Ae asset) {
        super();
        this.SM = mode;
        ByteBuffer buffer = asset.j90();
        int flag = buffer.getInt();
        this.It0 = buffer.getShort();
        this.WH = buffer.getShort();
        this.M70 = new int[this.It0][this.WH];
        for (int row = 0; row < this.WH; row++) {
            for (int col = 0; col < this.It0; col++) {
                this.M70[col][row] = buffer.getInt();
            }
        }
        if (flag == 1) {
            this.l1 = new int[this.It0][this.WH];
            for (int row = 0; row < this.WH; row++) {
                for (int col = 0; col < this.It0; col++) {
                    this.l1[col][row] = buffer.getInt();
                }
            }
        }
    }
}
