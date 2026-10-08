package f;

import cn.pokemmo.net.security.SecurityCertificateKeyRecord;
import java.nio.ByteBuffer;

/**
 * Shim: k2 -> SecurityCertificateKeyRecord
 * @see cn.pokemmo.net.security.SecurityCertificateKeyRecord
 */
public final class k2 extends SecurityCertificateKeyRecord {
    public k2(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
