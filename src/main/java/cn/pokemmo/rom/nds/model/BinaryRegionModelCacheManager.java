package cn.pokemmo.rom.nds.model;

import f.*;

import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public class BinaryRegionModelCacheManager extends gf0_0 {
    public static final dl_1 finally$ = Cq0.E1(BinaryRegionModelCacheManager.class);
    public final PS yp0;
    public final PS ZD0;
    public final PS Jg;

    public BinaryRegionModelCacheManager() {
        super((byte) 4, 62914560);
        this.yp0 = new PS();
        this.ZD0 = new PS();
        this.Jg = new PS();
    }

    public final Ou0 CE0(int i, u4_0 u4_02) {
        if (!this.Cj0) {
            return null;
        }
        int n;
        if ((n = this.yp0.Ol(i, -1)) > 0) {
            this.ra.position(n);
            return new wh0_2(this.ra).Yz(u4_02);
        }
        return null;
    }

    public final Ou0 aj(MG0 mg0, int i, pc_1 pc_12) {
        if (!this.Cj0) {
            return null;
        }
        int n;
        if (mg0 == MG0.Wk0) {
            n = this.ZD0.Ol(i, -1);
        } else {
            n = this.Jg.Ol(i, -1);
        }
        if (n > 0) {
            this.ra.position(n);
            Ou0 ou0 = new wh0_2(this.ra).Yz(pc_12);
            ou0.AD = i;
            ou0.ST = (mg0 == MG0.rm);
            return ou0;
        }
        return null;
    }

    @Override
    public final boolean CW() {
        int n = (int) this.mi0.Nm0();
        if (n == 0) {
            finally$.error("File cache = 0");
            return false;
        }
        if (n > 62914560) {
            finally$.error("File cache extended limit {} / 62914560", (Object) Integer.valueOf(n));
            return false;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.mi0.l00(), "r");
            this.ra = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length()).order(ByteOrder.nativeOrder());
            randomAccessFile.close();
            if (this.ra.getInt() != 9) {
                return false;
            }
            this.yp0.clear();
            int n2 = this.ra.getInt();
            for (int i = 0; i < n2; i++) {
                int id = this.ra.getInt();
                int size = this.ra.getInt();
                int pos = this.ra.position();
                this.yp0.m9(id, pos);
                this.ra.position(pos + size);
            }
            this.ZD0.clear();
            int n3 = this.ra.getInt();
            for (int i = 0; i < n3; i++) {
                int size = this.ra.getInt();
                int pos = this.ra.position();
                this.ZD0.m9(i, pos);
                this.ra.position(pos + size);
            }
            this.Jg.clear();
            int n4 = this.ra.getInt();
            for (int i = 0; i < n4; i++) {
                int size = this.ra.getInt();
                int pos = this.ra.position();
                this.Jg.m9(i, pos);
                this.ra.position(pos + size);
            }
            this.Cj0 = true;
            return true;
        } catch (Exception e) {
            finally$.error("Error loading", e);
            return false;
        }
    }
}
