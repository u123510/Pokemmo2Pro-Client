package cn.pokemmo.battle.event;

import f.lpt6__2;

/**
 * 对战战斗日志事件监听器接口
 */
public interface CombatLogEventListener {
    void onCombatLog(byte channel, lpt6__2 target, int p1, int p2, int p3, String message);

    default void ip(byte var1, lpt6__2 var2, int var3, int var4, int var5, String var6) {
        onCombatLog(var1, var2, var3, var4, var5, var6);
    }
}
