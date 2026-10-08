package f;

import cn.pokemmo.util.time.GameTimeCalendarRecord;

/**
 * 兼容垫片 (Shim) - 游戏内时间与现实日历时间戳换算记录 (Game Time Calendar Record)
 * 实际实现已迁移至 {@link GameTimeCalendarRecord}
 */
public final class DA extends GameTimeCalendarRecord {
    public DA(byte var1, byte var2, byte var3, byte var4) {
        super(var1, var2, var3, var4);
    }
}
