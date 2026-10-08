package cn.pokemmo.battle;

import f.VF0;
import f.xh_0;

/**
 * 对战上下文与战斗状态机 (Battle Context)
 * 管理整场对战的双方侧位、出场阵容摘要、战场容器、对战模式以及对战是否已结束。
 *
 * 原混淆类: f.Dm0
 */
public class BattleContext {
    public final byte c80;
    public final String U6;
    public final boolean By;
    public final boolean hq0;
    public final int[] xp0;
    public final VF0[][] Ti0;
    public final boolean[] RU;
    public final boolean[] u8;
    public final xh_0[] COM3;
    public boolean aUX;

    public BattleContext(byte p1, String p2, boolean p3, boolean p4) {
        this.xp0 = new int[2];
        this.Ti0 = new VF0[2][6];
        this.RU = new boolean[2];
        this.u8 = new boolean[2];
        this.COM3 = new xh_0[2];
        this.aUX = false;
        this.c80 = p1;
        this.U6 = p2;
        this.By = p3;
        this.hq0 = p4;
        this.COM3[0] = new xh_0();
        this.COM3[1] = new xh_0();
    }

    public final byte Xj() {
        return this.c80;
    }

    public final byte getMySideIndex() {
        return Xj();
    }

    public final byte KK() {
        return (byte) (this.c80 == 0 ? 1 : 0);
    }

    public final byte getOpponentSideIndex() {
        return KK();
    }

    public final String qQ() {
        return this.U6;
    }

    public final String getBattleTitle() {
        return qQ();
    }

    public final xh_0 nb(int p1) {
        return this.COM3[p1];
    }

    public final xh_0 getSide(int side) {
        return nb(side);
    }

    public final xh_0 mZ() {
        return this.COM3[this.KK()];
    }

    public final xh_0 getOpponentSide() {
        return mZ();
    }

    public final boolean u30() {
        return this.hq0;
    }

    public final boolean isTrainerBattle() {
        return u30();
    }

    public final boolean GG0() {
        return this.By;
    }

    public final boolean isWildBattle() {
        return GG0();
    }

    public final boolean isFinished() {
        return this.aUX;
    }

    public final void setFinished(boolean finished) {
        this.aUX = finished;
    }
}
