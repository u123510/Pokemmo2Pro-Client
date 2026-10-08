/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.address;

import f.*;

import f.ineter.pm_1;
import f.ta0_2;
import f.uo0_0;
import java.util.Iterator;

/*
 * Renamed from f.wv
 */
public class IpAddressSubnetRange
implements uo0_0 {
    private static final long serialVersionUID = 3L;
    public final pm_1 iG0;
    public final pm_1 r30;

    public final int hashCode() {
        int n = 31;
        pm_1 pm_12 = this.iG0;
        int n2 = pm_12 == null ? 0 : pm_12.js0;
        int n3 = (n + n2) * 31;
        pm_1 pm_13 = this.r30;
        int n4 = pm_13 == null ? 0 : pm_13.js0;
        return n3 + n4;
    }

    public final boolean equals(Object object) {
        pm_1 pm_12;
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof wv_0)) {
            return false;
        }
        object = (wv_0)object;
        pm_1 pm_13 = this.iG0;
        return pm_13 != null && (pm_12 = ((wv_0)object).iG0) != null && this.r30 != null && ((wv_0)object).r30 != null && pm_13.equals(pm_12) && this.r30.equals(((wv_0)object).r30);
    }

    public String toString() {
        return String.format("%s - %s", this.iG0.toString(), this.r30.toString());
    }

    @Override
    public final Iterator VF0() {
        return new ta0_2((wv_0) this);
    }

    public IpAddressSubnetRange(pm_1 pm_12, pm_1 pm_13) {
        this.iG0 = pm_12;
        this.r30 = pm_13;
        if (pm_12 != null && pm_13 != null) {
            if (pm_12.zN(pm_13) <= 0) {
                return;
            }
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray2[0] = pm_12.toString();
            objectArray[1] = pm_13.toString();
            throw new IllegalArgumentException(String.format("The first address in the range (%s) has to be lower than the last address (%s)", objectArray2));
        }
        throw new NullPointerException("Neither the first nor the last address can be null");
    }
}

