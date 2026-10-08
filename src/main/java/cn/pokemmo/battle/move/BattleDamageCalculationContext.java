package cn.pokemmo.battle.move;

import f.*;

public class BattleDamageCalculationContext extends VH {
    public final Bp0 rB;
    public final Bp0 N60;
    public final Bp0 z;
    public final Bp0 wc;
    public final FH0 dT;

    public BattleDamageCalculationContext(FH0 owner) {
        super();
        this.dT = owner;
        this.rB = new Bp0();
        this.N60 = new Bp0();
        this.z = new Bp0();
        this.wc = new Bp0();
    }

    public final boolean EA(float x, float y) {
        FH0.nW.x = y;
        FH0.nW.y = x;
        this.dT.yA.Do0(FH0.nW);
        this.dT.Yb0.getClass();
        return true;
    }

    public final boolean fJ0(float x, float y) {
        FH0.nW.x = y;
        FH0.nW.y = x;
        this.dT.yA.Do0(FH0.nW);
        this.dT.yA.getClass();
        return false;
    }

    public final boolean lPT7(int index, float x, float y) {
        Bp0 point = FH0.nW;
        point.x = y;
        point.y = x;
        this.dT.yA.Do0(point);
        Bp0 origin = FH0.lpT5;
        origin.x = 0.0f;
        origin.y = 0.0f;
        this.dT.yA.Do0(origin);
        this.rB.x = point.x - origin.x;
        this.rB.y = point.y - origin.y;
        this.dT.Rv0(this.rB.x, this.rB.y);
        return true;
    }

    public final boolean s70(float x1, float y1, float x2, float y2) {
        Bp0 point = FH0.nW;
        point.x = y2;
        point.y = x2;
        this.dT.yA.Do0(point);
        Bp0 origin = FH0.lpT5;
        origin.x = 0.0f;
        origin.y = 0.0f;
        this.dT.yA.Do0(origin);
        float dx = point.x - origin.x;
        float dy = point.y - origin.y;
        point.x = y1;
        point.y = x1;
        this.dT.yA.Do0(point);
        this.dT.jj(dx, dy);
        return true;
    }

    public final boolean mO(float x, float y) {
        FH0.nW.x = y;
        FH0.nW.y = x;
        this.dT.yA.Do0(FH0.nW);
        this.dT.Yb0.getClass();
        return true;
    }

    public final boolean Vq0(float x, float y) {
        this.dT.Yb0.getClass();
        return true;
    }

    public final boolean SV(Bp0 p1, Bp0 p2, Bp0 p3, Bp0 p4) {
        this.rB.x = p1.x;
        this.rB.y = p1.y;
        this.dT.yA.Do0(this.rB);
        this.N60.x = p2.x;
        this.N60.y = p2.y;
        this.dT.yA.Do0(this.N60);
        this.z.x = p3.x;
        this.z.y = p3.y;
        this.dT.yA.Do0(this.z);
        this.wc.x = p4.x;
        this.wc.y = p4.y;
        this.dT.yA.Do0(this.wc);
        this.dT.Yb0.getClass();
        return true;
    }
}
