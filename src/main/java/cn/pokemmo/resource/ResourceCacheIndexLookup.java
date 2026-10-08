package cn.pokemmo.resource;

import f.*;
import java.nio.ByteBuffer;

public class ResourceCacheIndexLookup {
    public final int N20;
    public final int uj;
    public final Gn0 f1;
    public final Gn0 Yc0;
    public final Gn0 e60;
    public final aux__2 IG;
    public final O20 N7;
    public final O20 E40;
    public final O20 n7;

    public ResourceCacheIndexLookup(int count, int base, int translationTable, int rotationTable, ByteBuffer buffer) {
        this.N20 = count;
        this.uj = buffer.getShort() & 0xFFFF;
        buffer.get();
        buffer.get();

        Gn0 f1 = null;
        Gn0 yc0 = null;
        Gn0 e60 = null;
        aux__2 ig = null;
        O20 n7 = null;
        O20 e40 = null;
        O20 n70 = null;
        if ((this.uj & 1) == 0 && this.D10()) {
            f1 = new Gn0(buffer, base, (this.uj & 8) != 0, count);
            yc0 = new Gn0(buffer, base, (this.uj & 16) != 0, count);
            e60 = new Gn0(buffer, base, (this.uj & 32) != 0, count);
        }
        if (this.Nv0()) {
            ig = new aux__2(base, translationTable, rotationTable, this.lr0(), count, buffer);
        }
        if (this.OK0()) {
            n7 = new O20(buffer, base, (this.uj & 2048) != 0, count);
            e40 = new O20(buffer, base, (this.uj & 4096) != 0, count);
            n70 = new O20(buffer, base, (this.uj & 8192) != 0, count);
        }
        this.f1 = f1;
        this.Yc0 = yc0;
        this.e60 = e60;
        this.IG = ig;
        this.N7 = n7;
        this.E40 = e40;
        this.n7 = n70;
    }

    public final boolean D10() {
        return (this.uj & 2) == 0 && (this.uj & 4) == 0;
    }

    public final boolean lr0() {
        return (this.uj & 256) != 0;
    }

    public final boolean Nv0() {
        return (this.uj & 64) == 0 && (this.uj & 128) == 0;
    }

    public final boolean OK0() {
        return (this.uj & 512) == 0 && (this.uj & 1024) == 0;
    }
}
