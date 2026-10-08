package f;

import cn.pokemmo.battle.matchmaking.MatchmakingEntryRestriction;

/**
 * 兼容垫片 (Shim) - 锦标赛与排位对战准入等级及数值限制条件 (Matchmaking Entry Restriction)
 * 实际实现已迁移至 {@link MatchmakingEntryRestriction}
 */
public final class qr_1 extends MatchmakingEntryRestriction {
    public qr_1(byte b, short s, short s2, short s3, short s4, GV gv, N2 n2, byte b2) {
        super(b, s, s2, s3, s4, gv, n2, b2);
    }
}
