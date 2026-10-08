package cn.pokemmo.order;

import f.*;

import java.nio.ByteBuffer;

public class OrderedWorldTrigger implements Comparable {
    public final short Y4;
    public final short bt;
    public final boolean dG0;
    public final byte lA0;
    public final boolean um0;
    public final boolean ff0;
    public final int Cl;
    public final byte up0;
    public final byte EE;
    public final int le;
    public int Cm;

    public OrderedWorldTrigger(ByteBuffer data) {
        boolean dG0 = false;
        boolean um0 = false;
        boolean ff0 = false;
        short y4 = 0;
        short bt = 0;

        this.lA0 = (byte) (data.get() & 255);
        int flags = data.get();
        boolean firstFlag = (flags & 1) != 0;
        if (firstFlag) {
            dG0 = (flags & 2) != 0;
        }
        int type = (flags >> 6) & 3;

        short header = data.getShort();
        int cl = header & 511;
        if (cl >= 256) {
            cl -= 512;
        }
        if (!firstFlag) {
            um0 = ((header >> 12) & 1) != 0;
            ff0 = ((header >> 13) & 1) != 0;
        }

        int variant = (header >> 14) & 3;
        short packed = data.getShort();
        int le = packed & 1023;
        byte ee = (byte) ((packed >> 10) & 3);
        byte up0 = (byte) ((packed >> 12) & 15);

        if (type == 1) {
            switch (variant) {
                case 0: y4 = 16; bt = 8; break;
                case 1: y4 = 32; bt = 8; break;
                case 2: y4 = 32; bt = 16; break;
                case 3: y4 = 64; bt = 32; break;
                default: break;
            }
        } else if (type == 2) {
            switch (variant) {
                case 0: y4 = 8; bt = 16; break;
                case 1: y4 = 8; bt = 32; break;
                case 2: y4 = 16; bt = 32; break;
                case 3: y4 = 32; bt = 64; break;
                default: break;
            }
        } else if (type == 0) {
            switch (variant) {
                case 0: y4 = 8; bt = 8; break;
                case 1: y4 = 16; bt = 16; break;
                case 2: y4 = 32; bt = 32; break;
                case 3: y4 = 64; bt = 64; break;
                default: break;
            }
        }

        this.dG0 = dG0;
        this.um0 = um0;
        this.ff0 = ff0;
        this.Cl = cl;
        this.le = le;
        this.EE = ee;
        this.up0 = up0;
        this.Y4 = y4;
        this.bt = bt;
    }

    @Override
    public final int compareTo(Object value) {
        return ((OrderedWorldTrigger) value).EE - this.EE;
    }
}
