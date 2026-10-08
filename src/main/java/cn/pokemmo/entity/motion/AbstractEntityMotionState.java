package cn.pokemmo.entity.motion;

import java.nio.ByteBuffer;

/**
 * 实体位移与运动状态抽象基类 (Abstract Entity Motion State)
 * <p>
 * 原始混淆类: {@code f.bH0}
 */
public abstract class AbstractEntityMotionState {
    public short xX;
    public byte iA;
    public byte Lm;
    public boolean Zv;
    public short r1;
    public short l80;
    public short vd;
    public short YI0;
    public short JI0;
    public short G90;
    public short uB0 = 1;
    public short SO = 1;

    public static byte Wy0(byte by) {
        switch (by) {
            default: {
                return -1;
            }
            case 4: {
                return 2;
            }
            case 3: {
                return 3;
            }
            case 2: {
                return 1;
            }
            case 1:
        }
        return 0;
    }

    public AbstractEntityMotionState(ByteBuffer byteBuffer) {
        byteBuffer.position();
    }

    public boolean SZ() {
        byte by = this.Lm;
        return by == 1 || by == 35;
    }

    public short r30() {
        return this.r1;
    }

    public void g70(short s) {
        this.r1 = s;
    }

    public short Ij() {
        return this.l80;
    }

    public void Zo0(short s) {
        this.l80 = s;
    }

    public float uc() {
        return this.vd;
    }

    public void x80(float f) {
        this.vd = (short) f;
    }

    public void DS() {
        this.Lm = (byte) 3;
    }
}
