package cn.pokemmo.audio.adpcm;

import f.*;

public class AdpcmAudioStreamFilter {
    public static final short[][] QD0 = {
            {2080, 2081, 2082, 2083, 2084, 2085, 2086, 2087, 2092},
            {2151, 2152, 2153, 2154, 2155, 2156, 2157, 2158, 2175},
            {1521, 1522, 1523, 1524, 1525, 1526, 1527, 1528, 2400},
            {1361, 1362, 1365, 1363, 1364, 1366, 1367, 1368, 2404},
            {1361, 1362, 1363, 1364, 1365, 1366, 1367, 1368, 2404}
    };
    public final AI[] lPT7;
    public final byte[] ng = new byte[5];
    public final byte[] SP = {10, 10, 10, 10, 10};
    public yj_1 IK0 = new yj_1();

    public AdpcmAudioStreamFilter() {
        this.lPT7 = new AI[]{new AI(), new AI(), new AI(), new AI(), new AI(), null, null, null, null, null, new AI()};
    }

    public final short ma(byte category, short flag) {
        if (!md_1.Bm(category, flag)) {
            throw new RuntimeException("Attempt to check non-client aware flag.");
        }
        return this.lPT7[category].jA0(flag);
    }

    public final boolean Ny(byte category, short flag) {
        if (!md_1.Bm(category, flag)) {
            throw new RuntimeException(ac0_0.YH0("Attempt to check non-client aware flag.", category, "", flag));
        }
        return category == 4 && flag == 1490 || this.lPT7[category].kp(flag);
    }

    public final byte go0() {
        byte maximum = 0;
        for (byte value : this.ng) {
            if (value > maximum) {
                maximum = value;
            }
        }
        return maximum;
    }

    public final byte IL0(byte category) {
        return category >= 0 && category < 5 ? this.SP[category] : (byte)100;
    }

    public final boolean Rd0(short flag) {
        return this.IK0.bL0(flag);
    }

    public final boolean Hh0(short flag) {
        return switch (flag) {
            case 144, 145, 146 -> this.ng[0] >= 8;
            case 243, 244, 245 -> this.Ny((byte)4, (short)1496);
            default -> false;
        };
    }

    public final void CN(byte category) {
        if (category == 10) {
            return;
        }
        byte[] values = this.ng;
        AI flags = this.lPT7[category];
        short[] tracked = QD0[category];
        int count = 0;
        if (tracked != null && tracked.length != 0) {
            synchronized (flags.sz0) {
                for (short flag : tracked) {
                    if (flags.sz0.f5(flag) != 0) {
                        ++count;
                    }
                }
            }
        }
        values[category] = (byte)count;
        this.SP[category] = md_1.U1(category, this.ng[category], this.lPT7[category]);
    }
}

