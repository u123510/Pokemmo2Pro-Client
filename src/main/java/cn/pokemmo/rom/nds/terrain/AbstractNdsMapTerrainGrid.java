package cn.pokemmo.rom.nds.terrain;

import java.util.Arrays;

/**
 * NDS 地图地形网格与碰撞高程抽象基类
 * 
 * 职责:
 * 管理 NDS 地图块的网格尺寸 (It0, WH)、碰撞属性 (M70)、图块索引 (l1) 与高程原点偏移。
 * 
 * 原混淆类: f.wa0_2
 */
public abstract class AbstractNdsMapTerrainGrid implements Cloneable {
    public short SM;
    public short It0;
    public short WH;
    public int[][] l1;
    public int[][] M70;
    public short Iz0;
    public short Ig;

    public AbstractNdsMapTerrainGrid() {
        this.l1 = null;
        this.M70 = null;
        this.Iz0 = 0;
        this.Ig = 0;
    }

    public AbstractNdsMapTerrainGrid xI0() {
        try {
            AbstractNdsMapTerrainGrid copy = (AbstractNdsMapTerrainGrid) super.clone();
            if (this.l1 == null) {
                copy.l1 = null;
            } else {
                copy.l1 = new int[this.l1.length][];
                for (int index = 0; index < this.l1.length; index++) {
                    copy.l1[index] = Arrays.copyOf(this.l1[index], this.l1[index].length);
                }
            }
            if (this.M70 == null) {
                copy.M70 = null;
            } else {
                copy.M70 = new int[this.M70.length][];
                for (int index = 0; index < this.M70.length; index++) {
                    copy.M70[index] = Arrays.copyOf(this.M70[index], this.M70[index].length);
                }
            }
            return copy;
        } catch (CloneNotSupportedException error) {
            return null;
        }
    }

    public float GF0(int first, int second) {
        return 0.0f;
    }

    public boolean sq0() {
        return false;
    }

    @Override
    public final Object clone() {
        return this.xI0();
    }
}
