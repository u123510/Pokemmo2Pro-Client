package f;

import cn.pokemmo.util.time.TimeUnitDurationFormatter;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.function.Function;

/**
 * 兼容垫片 (Shim) - 时间单位持续时间格式化器 (Time Unit Duration Formatter)
 * 实际实现已迁移至 {@link TimeUnitDurationFormatter}
 */
public final class Q40 extends TimeUnitDurationFormatter {
    public Q40(int bg0, ChronoUnit unit, String name, String[] aliases, Function<Duration, Long> converter) {
        super(bg0, unit, name, aliases, converter);
    }
}
