package f;

import cn.pokemmo.audio.adpcm.AdpcmBlockDecoder;

/**
 * 兼容垫片 (Shim) - ADPCM 音频数据块解码器 (ADPCM Block Decoder)
 * 实际实现已迁移至 {@link AdpcmBlockDecoder}
 */
public class V4 extends AdpcmBlockDecoder {
    public V4(int n) { super(n); }
}
