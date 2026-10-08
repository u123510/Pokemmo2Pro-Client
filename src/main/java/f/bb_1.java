package f;

import cn.pokemmo.net.security.HmacPacketChecksumEngine;

/**
 * HMAC 签名引擎兼容门面 (HMAC Checksum Engine Shim)
 * 核心逻辑与现代 API 已重构至 cn.pokemmo.net.security.HmacPacketChecksumEngine
 */
public final class bb_1 extends HmacPacketChecksumEngine {

    public bb_1(byte[] keyBytes, int signatureLength) {
        super(keyBytes, signatureLength);
    }
}
