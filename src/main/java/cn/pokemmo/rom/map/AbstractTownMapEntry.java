package cn.pokemmo.rom.map;

/**
 * 城镇地图条目抽象基类
 * 存储地图方块坐标、区域 ID、显示标记与地名解析信息
 */
public abstract class AbstractTownMapEntry {
    public short l40;
    public short fQ;
    public short Yr0;
    public byte eW;
    public boolean MF0;
    public byte ZD0;
    public short At0;
    public short Jx;
    public short HI0 = (short) -1;

    public String zh0() {
        return "";
    }

    public final void rt0(byte by, short s) {
        this.MF0 = true;
        this.ZD0 = by;
        this.Jx = s;
    }

    public short getX() {
        return this.l40;
    }

    public short getY() {
        return this.fQ;
    }

    public short getTileId() {
        return this.Yr0;
    }

    public byte getType() {
        return this.eW;
    }

    public boolean isMarked() {
        return this.MF0;
    }
}
