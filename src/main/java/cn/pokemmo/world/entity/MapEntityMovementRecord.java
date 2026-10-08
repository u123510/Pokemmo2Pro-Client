package cn.pokemmo.world.entity;

import f.*;

/**
 * 大世界实体位置、朝向与图层状态记录 (Map Entity Movement Record)
 *
 * 原始混淆类: f.zv_2
 */
public class MapEntityMovementRecord implements Cloneable {
    public byte uS;
    public byte o0;
    public byte ID0;
    public boolean Lpt2;
    public short Lq0;
    public short B5;
    public byte JT;
    public byte Y30;
    public byte Fc0;
    public LT pq;

    public MapEntityMovementRecord(byte b, byte b2, byte b3, boolean z, short s, short s2, byte b4, byte b5) {
        this.pq = null;
        this.uS = b;
        this.o0 = b2;
        this.ID0 = b3;
        this.Lpt2 = z;
        this.Lq0 = s;
        this.B5 = s2;
        this.JT = b4;
        this.Y30 = b5;
        this.Fc0 = b5;
    }

    public MapEntityMovementRecord(MapEntityMovementRecord zv_22) {
        this.Lpt2 = false;
        this.pq = null;
        V2(zv_22);
    }

    public byte Qa0() {
        return this.uS;
    }

    public float Com6() {
        LT lt = LPt1();
        if (lt == null) {
            return 0.0f;
        }
        return lt.S80();
    }

    public void V2(MapEntityMovementRecord zv_22) {
        this.uS = zv_22.uS;
        this.o0 = zv_22.o0;
        this.ID0 = zv_22.ID0;
        this.Lq0 = zv_22.Lq0;
        this.B5 = zv_22.B5;
        this.JT = zv_22.JT;
        this.Lpt2 = zv_22.Lpt2;
        this.Y30 = zv_22.Y30;
        this.pq = null;
    }

    public void PX(boolean z, short s, short s2, byte b, byte b2) {
        this.Lpt2 = z;
        this.Lq0 = s;
        this.B5 = s2;
        this.JT = b;
        this.Y30 = b2;
        this.pq = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MapEntityMovementRecord)) {
            return false;
        }
        MapEntityMovementRecord zv_22 = (MapEntityMovementRecord)obj;
        return this.uS == zv_22.uS
                && this.o0 == zv_22.o0
                && this.ID0 == zv_22.ID0
                && this.Lq0 == zv_22.Lq0
                && this.B5 == zv_22.B5
                && this.JT == zv_22.JT
                && this.Lpt2 == zv_22.Lpt2
                && this.Y30 == zv_22.Y30;
    }

    public MapEntityMovementRecord Xr() {
        return new MapEntityMovementRecord(this.uS, this.o0, this.ID0, this.Lpt2, this.Lq0, this.B5, this.JT, this.Y30);
    }

    public _else V20() {
        return (_else) tw0_0.e60.E6.get(J4.iA0(this.uS, this.o0, this.ID0));
    }

    public LT LPt1() {
        LT lt = this.pq;
        if (lt != null) {
            return lt;
        }
        _else else_ = (_else) tw0_0.e60.E6.get(J4.iA0(this.uS, this.o0, this.ID0));
        if (else_ == null) {
            return null;
        }
        if (this.Lpt2) {
            this.pq = else_.Jk0(this.JT, this.Lq0, this.B5);
        } else {
            this.pq = else_.Fn(this.Lq0, this.B5, this.JT);
        }
        return this.pq;
    }

    public void OL0() {
        LT lt = LPt1();
        if (lt == null) {
            return;
        }
        this.o0 = lt.F2().Bm0;
        this.ID0 = lt.F2().case$;
        this.Lpt2 = lt.gr0();
        this.Lq0 = lt.Tz();
        this.B5 = lt.HR();
        lt.F2().getClass();
        if (!(lt.F2() instanceof yl_0)) {
            this.JT = lt.Es();
        }
        this.pq = null;
    }

    public String Qs0() {
        return this.uS + " " + (N50.Aa(this.uS) ? (this.o0 + "." + this.ID0) : Short.valueOf(J4.p5(this.o0, this.ID0))) + " " + this.Lq0 + " " + this.B5 + " " + this.JT + (this.Lpt2 ? " NG" : "");
    }

    
    public byte getRegionId() {
        return this.uS;
    }

    public byte getMapGroup() {
        return this.o0;
    }

    public byte getMapZone() {
        return this.ID0;
    }

    public short getGridX() {
        return this.Lq0;
    }

    public short getGridY() {
        return this.B5;
    }

    public byte getElevation() {
        return this.JT;
    }

    public byte getFacingDirection() {
        return this.Y30;
    }

    public float getRotationAngle() {
        return Com6();
    }

    public void updatePosition(boolean isSpecial, short x, short y, byte elevation, byte facing) {
        PX(isSpecial, x, y, elevation, facing);
    }

    public LT getResolvedPlacement() {
        return LPt1();
    }

    public void syncCoordinatesFromPlacement() {
        OL0();
    }

    public MapEntityMovementRecord clone() {
        return Xr();
    }
}
