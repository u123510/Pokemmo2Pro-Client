package cn.pokemmo.pokemon.battle;

import cn.pokemmo.audio.sound.SurfaceFootstepSoundPlayer;
import f.q10_0;

/**
 * @deprecated 历史误命名类。f.EE 实际语义为地形与地表踏步音效触发器，属于音频系统。
 * 现代规范实现请使用 {@link SurfaceFootstepSoundPlayer}，向下兼容垫片请使用 {@link f.EE}。
 */
@Deprecated
public class TournamentBattleRuleContext extends SurfaceFootstepSoundPlayer {
    public TournamentBattleRuleContext(q10_0 q10_02) {
        super(q10_02);
    }
}
