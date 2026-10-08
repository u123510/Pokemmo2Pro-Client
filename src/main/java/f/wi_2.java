package f;

import cn.pokemmo.util.time.DurationStringPropertyParser;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.wi_2
 * 核心实现已迁移至 {@link cn.pokemmo.util.time.DurationStringPropertyParser}
 */
public final class wi_2 extends DurationStringPropertyParser {
    public static final Pattern cOM6;
    public static final wi_2 nG0;

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

    static {

        cOM6 = Pattern.compile("^([+-]?\\d+) ?([a-zA-Z]{1,10})$");
        nG0 = new wi_2();
    
        DurationStringPropertyParser.cOM6 = cOM6;
        DurationStringPropertyParser.nG0 = nG0;
    }
}
