/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


import f.hf_1;

/*
 * Renamed from f.hA
 */
public class TileSetAttribute
extends BaseMaterialAttribute {
    public static final long vh0 = hf_1.T20("tileSetAttribute");
    public final short PK;

    public TileSetAttribute(short s) {
        super(vh0);
        this.PK = s;
    }

    public TileSetAttribute(TileSetAttribute ha_12) {
        this(ha_12.PK);
    }

    @Override
    public hf_1 pD0() {
        return new f.ha_1(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int compareTo(Object object) {
        object = (hf_1)object;
        long l = this.yO;
        long l2 = ((hf_1)object).yO;
        if (l != l2) {
            if (l >= l2) return 1;
            return -1;
        }
        short s = ((TileSetAttribute)object).PK;
        short s2 = this.PK;
        short s3 = s2;
        if (s == s2) {
            return 0;
        }
        if (s >= s3) return 1;
        return -1;
    }
}

