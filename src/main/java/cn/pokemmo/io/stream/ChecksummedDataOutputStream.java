package cn.pokemmo.io.stream;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;

public class ChecksummedDataOutputStream extends DataOutputStream {
    public final ByteArrayOutputStream buffer;
    public final CRC32 checksum;

    public ChecksummedDataOutputStream(int initialSize) {
        this(new ByteArrayOutputStream(initialSize), new CRC32());
    }

    public ChecksummedDataOutputStream(ByteArrayOutputStream buffer, CRC32 checksum) {
        super(new CheckedOutputStream(buffer, checksum));
        this.buffer = buffer;
        this.checksum = checksum;
    }

    public void writeFramedPacket(DataOutputStream output) throws IOException {
        flush();
        output.writeInt(this.buffer.size() - 4);
        this.buffer.writeTo(output);
        output.writeInt((int) this.checksum.getValue());
        this.buffer.reset();
        this.checksum.reset();
    }
}
