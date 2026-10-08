package f;

import cn.pokemmo.config.codec.ComboBoxConfigCodec;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Shim: nd_0 -> ComboBoxConfigCodec
 * @see cn.pokemmo.config.codec.ComboBoxConfigCodec
 */
public final class nd_0 extends ComboBoxConfigCodec implements hd_0 {
    public nd_0(String labelStr, Object[] options, Function labelFunc, BiConsumer writeConsumer, Function readFunc) {
        super(labelStr, options, labelFunc, writeConsumer, readFunc);
    }

    public nd_0(String labelStr, Object... options) {
        super(labelStr, options);
    }
}
