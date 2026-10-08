package f;

import cn.pokemmo.io.stream.ChecksummedDataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

public final class P20 extends ChecksummedDataOutputStream {
    public final ByteArrayOutputStream ph0;
    public final CRC32 rv;

    public P20(int initialSize) {
        super(initialSize);
        this.ph0 = this.buffer;
        this.rv = this.checksum;
    }

    public P20(ByteArrayOutputStream buffer, CRC32 checksum) {
        super(buffer, checksum);
        this.ph0 = this.buffer;
        this.rv = this.checksum;
    }

    public final void pA0(DataOutputStream output) throws IOException {
        writeFramedPacket(output);
    }
}
