package cn.pokemmo.ui.twl.renderer;

import f.MD0;
import f.qq_0;
import f.rb_1;

/**
 * TWL 鼠标指针渲染动画状态 (SWCursorAnimState)
 * 原始混淆类: f.VT
 */
public class TwlCursorAnimState implements rb_1 {
    public final long[] pressTimes = new long[3];
    public final boolean[] buttonStates = new boolean[3];

    // 混淆字段别名兼容
    public final long[] Le = pressTimes;
    public final boolean[] sC = buttonStates;

    @Override
    public int Bd(MD0 stateKey) {
        long now = System.currentTimeMillis();
        int btnIndex = stateKey == qq_0.Xl ? 0 : (stateKey == qq_0.pz0 ? 2 : (stateKey == qq_0.Qj0 ? 1 : -1));
        if (btnIndex >= 0) {
            now -= this.pressTimes[btnIndex];
        }
        return (int) now & Integer.MAX_VALUE;
    }

    @Override
    public boolean t5(MD0 stateKey) {
        int btnIndex = stateKey == qq_0.Xl ? 0 : (stateKey == qq_0.pz0 ? 2 : (stateKey == qq_0.Qj0 ? 1 : -1));
        if (btnIndex >= 0) {
            return this.buttonStates[btnIndex];
        }
        return false;
    }

    @Override
    public boolean tI0(MD0 stateKey) {
        return true;
    }
}
