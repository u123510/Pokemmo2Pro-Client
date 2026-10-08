package cn.pokemmo.rom.nds.fs;

import f.*;

import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public class NitroRomArchiveReader extends gf0_0 {
    public static final dl_1 nF;
    public final PS fC;
    public final PS Bg0;

    public NitroRomArchiveReader() {
        super((byte)3, 47185920);
        this.fC = new PS();
        this.Bg0 = new PS();
    }

    static {
        nF = Cq0.E1(NitroRomArchiveReader.class);
    }

    @Override
    public final Ou0 CE0(int id, u4_0 value) {
        if (!this.Cj0) {
            return null;
        }
        int position = this.fC.Ol(id, -1);
        if (position <= 0) {
            return null;
        }
        this.ra.position(position);
        return new wh0_2(this.ra).Yz(value);
    }

    @Override
    public final Ou0 L0(int id, pc_1 value) {
        if (!this.Cj0) {
            return null;
        }
        int position = this.Bg0.Ol(id, -1);
        if (position <= 0) {
            return null;
        }
        this.ra.position(position);
        Ou0 result = new wh0_2(this.ra).Yz(value);
        result.AD = id;
        return result;
    }

    @Override
    public final boolean CW() {
        try {
            int cacheSize = (int)this.mi0.Nm0();
            if (cacheSize == 0) {
                nF.error("File cache = 0");
                return false;
            }
            if (cacheSize > 47185920) {
                nF.error("File cache extended limit {} / 47185920", (Object)cacheSize);
                return false;
            }
            RandomAccessFile file = new RandomAccessFile(this.mi0.l00(), "r");
            long length = file.length();
            this.ra = file.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, length).order(ByteOrder.nativeOrder());
            file.close();
            if (this.ra.getInt() != 8) {
                return false;
            }
            this.fC.clear();
            int count = this.ra.getInt();
            for (int i = 0; i < count; i++) {
                int id = this.ra.getInt();
                int size = this.ra.getInt();
                int position = this.ra.position();
                this.fC.m9(id, position);
                this.ra.position(position + size);
            }
            this.Bg0.clear();
            count = this.ra.getInt();
            for (int i = 0; i < count; i++) {
                int size = this.ra.getInt();
                int position = this.ra.position();
                this.Bg0.m9(i, position);
                this.ra.position(position + size);
            }
            this.Cj0 = true;
            return true;
        } catch (Exception e) {
            nF.error("Error loading", e);
            return false;
        }
    }
}
