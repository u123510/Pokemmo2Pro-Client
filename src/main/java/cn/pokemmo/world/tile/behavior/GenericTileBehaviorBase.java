package cn.pokemmo.world.tile.behavior;

import f.BJ0;
import f.E90;
import f.ER;
import f.LT;
import f.U5;
import f._else;
import f.bi0_1;
import f.e3_0;
import f.hl0_1;
import f.nk_0;
import f.sl_2;
import f.xm_2;

public class GenericTileBehaviorBase {
    public boolean fu(LT p1, bi0_1 p2, byte p3) { return false; }
    public boolean aH(LT p1, bi0_1 p2, byte p3, byte p4) { return (Object) this instanceof xm_2; }
    public boolean xB(LT p1, LT p2, bi0_1 p3, byte p4) { return false; }
    public void K40(bi0_1 p1, LT p2) { }
    public boolean iI(byte p1) { return false; }
    public boolean switch$() { return false; }
    public boolean LI() { return !((Object) this instanceof sl_2); }
    public boolean Xc() { return !((Object) this instanceof e3_0); }
    public boolean wn0(byte p1) { return false; }
    public boolean zF(LT p1, bi0_1 p2, byte p3, byte p4) { return false; }
    public boolean tm(LT p1, bi0_1 p2, boolean p3) { return false; }
    public void u00(LT p1, bi0_1 p2, hl0_1 p3, int p4, int p5, int p6, int p7) {
        if (p2 != null && p2 instanceof E90) {
            E90 ignored = (E90) p2;
        }
    }
    public void PI0(LT p1, bi0_1 p2, ER p3, U5 p4, BJ0 p5, float p6, float p7, float p8) { }
    public int zd0(boolean p1) { return 0; }
    public float Wk() { return 0.0F; }
    public LT a0(_else p1, LT p2, LT p3, byte p4) { return null; }
    public int QK(LT p1, LT p2) { return 0; }
    public boolean J10(byte p1) { return false; }
    public LT wh0(byte p1, LT p2) { return null; }
    public boolean Fj0(byte p1) { return false; }
    public boolean xx0(bi0_1 p1, byte p2) { return true; }
    public nk_0 new$() { return null; }
}
