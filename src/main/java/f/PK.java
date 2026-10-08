package f;

import cn.pokemmo.battle.event.CombatLogEventListener;
import f.lpt6__2;

/**
 * 战斗日志监听门面
 * @see cn.pokemmo.battle.event.CombatLogEventListener
 */
public interface PK extends CombatLogEventListener {
    @Override
    void ip(byte var1, lpt6__2 var2, int var3, int var4, int var5, String var6);

    @Override
    default void onCombatLog(byte channel, lpt6__2 target, int p1, int p2, int p3, String message) {
        ip(channel, target, p1, p2, p3, message);
    }
}
