package cn.pokemmo.net.security;

import f.Cq0;
import f.dl_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/**
 * 基于 HMAC-SHA256 的数据包签名与序列号防重放引擎 (HMAC-SHA256 Packet Checksum Engine)
 * 对应混淆类: f.bb_1
 */
public class HmacPacketChecksumEngine extends PacketChecksumEngine {
    public static final dl_1 LOGGER = Cq0.E1(HmacPacketChecksumEngine.class);
    public static final dl_1 Fb0 = LOGGER;

    public final Mac signingMac;
    public final Mac verificationMac;
    public final Mac iU;
    public final Mac j30;

    public int outgoingSequence = 0;
    public int incomingSequence = 0;
    public int sJ = 0;
    public int or0 = 0;

    public final ByteBuffer outgoingSeqBuffer;
    public final ByteBuffer incomingSeqBuffer;
    public final ByteBuffer lh0;
    public final ByteBuffer vr0;

    public final int signatureLength;
    public final int Jc;

    public HmacPacketChecksumEngine(byte[] keyBytes, int signatureLength) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.outgoingSeqBuffer = ByteBuffer.allocate(4).order(byteOrder);
        this.incomingSeqBuffer = ByteBuffer.allocate(4).order(byteOrder);
        this.lh0 = this.outgoingSeqBuffer;
        this.vr0 = this.incomingSeqBuffer;

        if (signatureLength > 32 || signatureLength < 4) {
            throw new RuntimeException("Invalid signature length: " + signatureLength);
        }
        this.signatureLength = signatureLength;
        this.Jc = signatureLength;

        Mac sign = null;
        Mac verify = null;
        try {
            SecretKeySpec key = new SecretKeySpec(keyBytes, "HmacSHA256");
            sign = Mac.getInstance("HmacSHA256");
            sign.init(key);
            verify = Mac.getInstance("HmacSHA256");
            verify.init(key);
        } catch (Exception exception) {
            LOGGER.error("Failed to initialize HMAC-SHA256", exception);
        }
        this.signingMac = sign;
        this.verificationMac = verify;
        this.iU = sign;
        this.j30 = verify;
    }

    @Override
    public final int jR() {
        return this.signatureLength;
    }

    @Override
    public final void SG(byte[] data, int offset, int length) {
        this.signingMac.update(data, offset, length);
        this.outgoingSeqBuffer.position(0);
        int seq = this.outgoingSequence;
        this.outgoingSequence = seq + 1;
        this.sJ = this.outgoingSequence;
        this.signingMac.update(this.outgoingSeqBuffer.putInt(0, seq));
        try {
            this.signingMac.doFinal(data, offset + length);
        } catch (ShortBufferException exception) {
            LOGGER.error("Short buffer in HMAC signing", exception);
        }
    }

    @Override
    public final boolean Jm(byte[] data, int offset, int length) {
        int sigLen = this.signatureLength;
        if (length < sigLen) {
            return false;
        }
        this.verificationMac.update(data, offset, length - sigLen);
        this.incomingSeqBuffer.position(0);
        int seq = this.incomingSequence;
        this.incomingSequence = seq + 1;
        this.or0 = this.incomingSequence;
        this.verificationMac.update(this.incomingSeqBuffer.putInt(0, seq));
        byte[] signature = this.verificationMac.doFinal();
        int diff = 0;
        for (int i = 0; i < sigLen; ++i) {
            diff |= signature[i] ^ data[offset + length - sigLen + i];
        }
        return diff == 0;
    }
}
