package cn.pokemmo.battle;

import java.nio.ByteBuffer;

/**
 * 战斗状态/能力阶级变更条目记录 (Battle Status Change Entry)
 * <p>
 * 原始混淆类: {@code f.HU}
 */
public class BattleStatusChangeEntry {
    public final byte fe;
    public byte OA;
    public byte VC;

    public BattleStatusChangeEntry(byte by, ByteBuffer byteBuffer) {
        this.fe = by;
        byteBuffer.get();
        this.OA = byteBuffer.get();
        this.VC = byteBuffer.get();
        byteBuffer.get();
    }

    public BattleStatusChangeEntry(byte by) {
        this.fe = by;
    }
}
