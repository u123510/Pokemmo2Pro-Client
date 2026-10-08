package cn.pokemmo.pokemon.battle;

import cn.pokemmo.util.codec.Base64Codec;

/**
 * @deprecated 历史误命名类。f.TI0 实际语义为标准 Base64 编解码器，属于通用编码工具。
 * 现代规范实现请使用 {@link Base64Codec}，向下兼容垫片请使用 {@link f.TI0}。
 */
@Deprecated
public abstract class BattleDamageFormula extends Base64Codec {
}
