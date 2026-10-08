package cn.pokemmo.world.entity;

import f.*;

/**
 * 大世界地图实体放置与交互点抽象基类 (Abstract Map Entity Placement)
 *
 * 原始混淆类: f.LT
 */
public abstract class AbstractMapEntityPlacement {
    public final short op0;
    public final short ev0;
    public es_1 Sg = null;

    public AbstractMapEntityPlacement(short x, short y) {
        this.op0 = x;
        this.ev0 = y;
    }

    public abstract _else F2();

    public boolean gr0() {
        return this instanceof nC0;
    }

    public short Tz() {
        return this.op0;
    }

    public short HR() {
        return this.ev0;
    }

    public abstract byte Es();

    public float S80() {
        return 0.0F;
    }

    public void DZ(float value) {
    }

    public float XC0() {
        return 0.0F;
    }

    public abstract byte uj();

    public abstract byte re();

    public abstract nt_1 u40();

    public void Mw(nt_1 value) {
        throw new RuntimeException();
    }

    public abstract boolean LPt1();

    public boolean V50(byte value) {
        return false;
    }

    public boolean XC0(byte value) {
        return true;
    }

    public boolean ut() {
        return false;
    }

    public boolean rK0() {
        return false;
    }

    public boolean fV() {
        return false;
    }

    public db0_2 B3() {
        return null;
    }

    public short xl0() {
        return 0;
    }

    public final boolean lW() {
        es_1 effects = this.Sg;
        if (effects == null || effects.KB == 0) {
            return false;
        }

        I2 iterator = effects.ZD();
        while (iterator.hasNext()) {
            gj_0 effect = (gj_0) iterator.next();
            if (effect == null || effect.qR()) {
                iterator.remove();
            }
        }
        return this.Sg.KB != 0;
    }

    public final void ZD0(gj_0 effect) {
        if (this.Sg == null) {
            this.Sg = new es_1(false, 4);
        }
        if (this.Sg.KB <= 3) {
            this.Sg.Ue0(effect);
            this.F2().b60((LT) this);
        }
    }

    public boolean Og(LT target, bi0_1 entity, byte direction, byte unused) {
        return this.u40().fu(target, entity, direction);
    }

    public boolean lpT2(LT target, bi0_1 entity, byte direction, byte value) {
        return this.u40().aH(target, entity, direction, value);
    }

    public nk_0 Oo(bi0_1 entity) {
        return this.u40().new$();
    }

    public LT JG0(byte value) {
        return null;
    }

    public C8 Ki() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean Wb0();

    
    public short getX() {
        return this.op0;
    }

    public short getY() {
        return this.ev0;
    }

    public float getRotationAngle() {
        return S80();
    }

    public void setRotationAngle(float angle) {
        DZ(angle);
    }

    @Override
    public final String toString() {
        return "{" + this.Tz() + ", " + this.HR() + " " + this.S80() + "}";
    }

    public void HU(byte value, short ignored) {
    }

    public void Nn0(byte value, Ll0 tile) {
        throw new UnsupportedOperationException();
    }
}
