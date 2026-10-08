/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.nds.fs;

import f.*;

import f.Cq0;
import f.MG0;
import f.Ou0;
import f.PS;
import f.dl_1;
import f.gf0_0;
import f.ll_2;
import f.pc_1;
import f.u4_0;
import f.wh0_2;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel.MapMode;

public class NitroFileStreamReader
extends gf0_0 {
    public static final dl_1 IO = Cq0.E1(UK.class);
    public final PS Dc;
    public final PS qe0;
    public final PS Rt0;

    public NitroFileStreamReader() {
        super((byte)2, 0x3C00000);
        this.Dc = new PS();
        this.qe0 = new PS();
        this.Rt0 = new PS();
    }

    @Override
    public final Ou0 CE0(int n, u4_0 u4_02) {
        if (!this.Cj0) {
            return null;
        }
        if ((n = this.Dc.Ol(n, -1)) > 0) {
            this.ra.position(n);
            return new wh0_2(this.ra).Yz(u4_02);
        }
        return null;
    }

    @Override
    public final Ou0 yt0(MG0 mG0, int n, int n2, pc_1 pc_12) {
        if (!this.Cj0) {
            return null;
        }
        int n3 = (mG0.hX != 2 ? this.qe0 : this.Rt0).Ol(n * 100 + n2, -1);
        if (n3 > 0) {
            this.ra.position(n3);
            return new wh0_2(this.ra).Yz(pc_12);
        }
        return null;
    }

    @Override
    public final boolean CW() {
        int cacheSize = (int)this.mi0.Nm0();
        if (cacheSize == 0) {
            IO.error("File cache = 0");
            return false;
        }
        if (cacheSize > 62914560) {
            IO.error("File cache extended limit {} / 62914560", cacheSize);
            return false;
        }
        try {
            RandomAccessFile file = new RandomAccessFile(this.mi0.l00(), "r");
            this.ra = file.getChannel().map(MapMode.READ_ONLY, 0L, file.length()).order(ByteOrder.nativeOrder());
            file.close();
            if (this.ra.getInt() != 3) return false;

            this.Dc.clear();
            for (int count = this.ra.getInt(), index = 0; index < count; index++) {
                int key = this.ra.getInt();
                int length = this.ra.getInt();
                int position = this.ra.position();
                this.Dc.m9(key, position);
                this.ra.position(position + length);
            }

            this.qe0.clear();
            for (int groups = this.ra.getInt(), group = 0; group < groups; group++) {
                for (int entries = this.ra.getInt(), entry = 0; entry < entries; entry++) {
                    int length = this.ra.getInt();
                    int position = this.ra.position();
                    this.qe0.m9(group * 100 + entry, position);
                    this.ra.position(position + length);
                }
            }

            this.Rt0.clear();
            for (int groups = this.ra.getInt(), group = 0; group < groups; group++) {
                for (int entries = this.ra.getInt(), entry = 0; entry < entries; entry++) {
                    int length = this.ra.getInt();
                    int position = this.ra.position();
                    this.Rt0.m9(group * 100 + entry, position);
                    this.ra.position(position + length);
                }
            }
            this.Cj0 = true;
            return true;
        } catch (Exception exception) {
            IO.error("Error loading", exception);
            return false;
        }
    }
}
