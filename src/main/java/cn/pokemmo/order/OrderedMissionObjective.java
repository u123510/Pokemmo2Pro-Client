package cn.pokemmo.order;

import f.*;

import java.util.ArrayList;
import java.util.BitSet;

public class OrderedMissionObjective implements Comparable {
    public final short VD0;
    public byte Xz0;
    public boolean dz;
    public final String h60;
    public final BitSet ML;
    public final ArrayList Jq0;
    public final j20 LB0;

    public OrderedMissionObjective(j20 owner, String name) {
        super();
        this.LB0 = owner;
        this.Xz0 = (byte) -1;
        this.dz = false;
        this.ML = new BitSet();
        this.Jq0 = new ArrayList();
        this.h60 = name;
        this.VD0 = (short) -1;
    }

    public OrderedMissionObjective(j20 owner, X90 value, byte index) {
        super();
        this.LB0 = owner;
        this.Xz0 = (byte) -1;
        this.dz = false;
        this.ML = new BitSet();
        this.Jq0 = new ArrayList();
        this.VD0 = value.Y0();
        this.h60 = value.HQ();
        this.Xz0 = index;
        this.fv0(index);
    }

    public final void fv0(byte index) {
        if (index < 0) {
            return;
        }
        if (this.Xz0 == -1) {
            this.Xz0 = index;
        }
        this.ML.set(index);
    }

    @Override
    public final String toString() {
        return this.h60;
    }

    @Override
    public final int compareTo(Object other) {
        OrderedMissionObjective value = (OrderedMissionObjective) other;
        if (this.VD0 == -1) {
            return -1;
        }
        if (value.VD0 == -1) {
            return 1;
        }
        return this.h60.compareTo(value.h60);
    }
}
