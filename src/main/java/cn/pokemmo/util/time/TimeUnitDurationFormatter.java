package cn.pokemmo.util.time;

import f.*;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.function.Function;

public class TimeUnitDurationFormatter {
    public static final Q40 fL;
    public static final Q40 ry0;
    public static final Q40 mY;
    public static final Q40[] l7;
    public final ChronoUnit Jd;
    public final String xv;
    public final String[] Fy0;
    public final Function<Duration, Long> t9;
    public final int bg0;

    public TimeUnitDurationFormatter(int bg0, ChronoUnit unit, String name, String[] aliases, Function<Duration, Long> converter) {
        this.bg0 = bg0;
        this.Jd = unit;
        this.xv = name;
        this.Fy0 = aliases;
        this.t9 = converter;
    }

    public static Q40 in(String value) {
        for (Q40 unit : l7.clone()) {
            if (unit.xv.equalsIgnoreCase(value)) {
                return unit;
            }
            for (String alias : unit.Fy0) {
                if (alias.equalsIgnoreCase(value)) {
                    return unit;
                }
            }
        }
        throw new IllegalArgumentException(xq_1.pz0("Unknown unit '", value, "'"));
    }

    public static Long c4(Duration value) {
        return value.toDays() / 365L;
    }

    public static Long fR(Duration value) {
        return value.getSeconds() / ChronoUnit.MONTHS.getDuration().getSeconds();
    }

    public static Long c00(Duration value) {
        return value.toDays() / 7L;
    }

    public static Long jw0(Duration value) {
        return value.toNanos() / 1000L;
    }

    static {
        Q40 nanos = new Q40(0, ChronoUnit.NANOS, "ns",
                new String[]{"nanosecond", "nanoseconds", "nano"}, Q40::jw0);
        Q40 micros = new Q40(1, ChronoUnit.MICROS, "us",
                new String[]{"microsecond", "microseconds", "micro"},
                Q40::jw0);
        Q40 millis = new Q40(2, ChronoUnit.MILLIS, "ms",
                new String[]{"millisecond", "milliseconds", "milli"}, Duration::toMillis);
        Q40 seconds = new Q40(3, ChronoUnit.SECONDS, "s",
                new String[]{"second", "seconds"}, Duration::getSeconds);
        Q40 minutes = new Q40(4, ChronoUnit.MINUTES, "m",
                new String[]{"minute", "minutes"}, Duration::toMinutes);
        Q40 hours = new Q40(5, ChronoUnit.HOURS, "h",
                new String[]{"hour", "hours", "hrs"}, Duration::toHours);
        Q40 days = new Q40(6, ChronoUnit.DAYS, "d",
                new String[]{"day", "days"}, Duration::toDays);
        Q40 weeks = new Q40(7, ChronoUnit.WEEKS, "w",
                new String[]{"week", "weeks"}, Q40::c00);
        Q40 months = new Q40(8, ChronoUnit.MONTHS, "mo",
                new String[]{"month", "months"}, Q40::fR);
        Q40 years = new Q40(9, ChronoUnit.YEARS, "y",
                new String[]{"year", "years"}, Q40::c4);
        fL = weeks;
        ry0 = months;
        mY = years;
        l7 = new Q40[]{nanos, micros, millis, seconds, minutes, hours, days, weeks, months, years};
    }

    public final Duration kf0(String value) {
        int kind = C9.sC[this.bg0];
        if (kind == 1) {
            return Duration.of(Long.parseLong(value), ChronoUnit.DAYS).multipliedBy(7L);
        }
        if (kind == 2) {
            return Duration.of(Long.parseLong(value), ChronoUnit.SECONDS)
                    .multipliedBy(ChronoUnit.MONTHS.getDuration().getSeconds());
        }
        if (kind == 3) {
            return Duration.of(Long.parseLong(value), ChronoUnit.DAYS).multipliedBy(365L);
        }
        return Duration.of(Long.parseLong(value), this.Jd);
    }
}
