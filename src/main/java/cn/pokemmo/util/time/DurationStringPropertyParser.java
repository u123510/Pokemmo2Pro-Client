package cn.pokemmo.util.time;

import f.*;

import java.lang.reflect.Field;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DurationStringPropertyParser implements rx_0 {
    public static Pattern cOM6;
    public static DurationStringPropertyParser nG0;

    static {
        if (f.wi_2.cOM6 == null) {
            try {
                Class.forName(f.wi_2.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    public static Duration mX(String value) {
        try {
            if ("0".equals(value)) {
                return Duration.ZERO;
            }
            Matcher matcher = cOM6.matcher(value);
            if (matcher.matches()) {
                return Q40.in(matcher.group(2)).kf0(matcher.group(1));
            }
            return Duration.parse(value);
        } catch (Exception error) {
            throw new IllegalArgumentException(
                    xq_1.pz0("'", value, "' is not a valid duration"), error);
        }
    }

    @Override
    public Object nx0(String value, Field field, String minimum, String maximum) {
        Duration result = mX(value);
        if (!minimum.isEmpty()) {
            Duration lower = mX(minimum);
            if (result.compareTo(lower) < 0) {
                result = lower;
            }
        }
        if (!maximum.isEmpty()) {
            Duration upper = mX(maximum);
            if (result.compareTo(upper) > 0) {
                result = upper;
            }
        }
        return result;
    }
}
