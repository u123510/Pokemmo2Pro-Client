package cn.pokemmo.net.security;

import f.OI0;
import f.es_1;
import f.io_0;
import f.p_0;
import java.nio.ByteBuffer;

/**
 * TLS 安全证书公钥/哈希记录 (Security Certificate Key Record)
 * <p>
 * 原始混淆类: {@code f.k2}
 */
public class SecurityCertificateKeyRecord {
    public final io_0 n7;
    public final int kE0;
    public final p_0 nv;

    public SecurityCertificateKeyRecord(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        this.n7 = io_0.WB0(byteBuffer.get());
        this.kE0 = byteBuffer.getShort() & 0xFFFF;
        int n = byteBuffer2.get() & 0xFF;
        byte[] byArray = new byte[n];
        byteBuffer2.get(byArray);
        es_1 es_13 = new es_1(n);
        for (int j = 0; j < n; ++j) {
            es_13.Ue0(byArray[j]);
        }
        p_0 p_03 = new p_0((float) this.kE0 / 1000.0f, es_13);
        this.nv = p_03;
        if (this.n7 == io_0.kj0) {
            p_03.XB(OI0.MW);
        }
    }
}
