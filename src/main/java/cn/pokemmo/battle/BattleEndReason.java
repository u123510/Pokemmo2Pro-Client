package cn.pokemmo.battle;

/**
 * 战斗结束原因/对战结果类型 (Battle End Reason)
 * 表示战斗结算的原因 (如胜利、失败、认输、逃跑等)。
 *
 * 原混淆类: f.Vz0
 */
public class BattleEndReason {
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_WIN = 1;
    public static final int REASON_LOSS = 2;
    public static final int REASON_FORFEIT = 3;
    public static final int REASON_DRAW_OR_ESCAPE = 4;

    public final byte ht0;
    public final int oC0;

    public BattleEndReason(int value, int id) {
        this.oC0 = value;
        this.ht0 = (byte) id;
    }

    public byte getId() {
        return this.ht0;
    }

    public int getValue() {
        return this.oC0;
    }

    public boolean isVictory() {
        return this.oC0 == REASON_WIN;
    }

    public boolean isDefeat() {
        return this.oC0 == REASON_LOSS;
    }

    public boolean isForfeit() {
        return this.oC0 == REASON_FORFEIT;
    }
}
