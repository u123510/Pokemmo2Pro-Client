package f;

import cn.pokemmo.config.codec.ConfigPropertyCodec;

/**
 * Shim: hd_0 -> ConfigPropertyCodec
 * @see cn.pokemmo.config.codec.ConfigPropertyCodec
 */
public interface hd_0 extends ConfigPropertyCodec {
    static cn_0 Ed(String string) {
        return ConfigPropertyCodec.createTitleLabel(string);
    }
}
