package cn.pokemmo.io.binary;

import f.Cq0;
import f.Dn0;
import f.Y60;
import f.dl_1;
import java.io.DataInputStream;
import java.nio.charset.StandardCharsets;

public class BinaryArchiveHeaderReader {
    public static final dl_1 LOGGER = Cq0.E1(BinaryArchiveHeaderReader.class);
    public String magic;
    public byte version;
    public final Dn0 file;
    public Y60 indexMap;

    public BinaryArchiveHeaderReader(Dn0 file) {
        this.file = file;
    }

    public boolean readHeader(boolean full) {
        try {
            String mode = full ? "full" : "base";
            LOGGER.info("Starting {} load of {}", mode, this.file.o30());
            if (this.indexMap != null) {
                return true;
            }
            DataInputStream in = new DataInputStream(this.file.LpT7(1024));
            byte[] magicBytes = new byte[4];
            in.read(magicBytes);
            this.magic = new String(magicBytes, StandardCharsets.UTF_8);
            this.version = in.readByte();
            int count = in.readInt();
            if (count < 0 || count > 100000) {
                return false;
            }
            if (full) {
                this.indexMap = new Y60(count);
                for (int i = 0; i < count; i++) {
                    int first = in.readInt();
                    int second = in.readInt();
                    this.indexMap.Y6(first, second);
                }
            }
            in.close();
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }
}
