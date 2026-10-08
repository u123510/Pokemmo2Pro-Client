package cn.pokemmo.constant.enums;

import f.*;

public enum IpOctet {
    OCTET_A(0),
    OCTET_B(1),
    OCTET_C(2),
    OCTET_D(3);

    public static final IpOctet LpT4 = OCTET_A;
    public static final IpOctet Te = OCTET_B;
    public static final IpOctet Lt0 = OCTET_C;
    public static final IpOctet dj0 = OCTET_D;

    public final int k0;
    public final int LE0;

    IpOctet(int i3) {
        int i0 = i3 << 3;
        this.LE0 = 24 - i0;
        this.k0 = -16777216 >>> i0;
    }

    public f.vz0_0 toLegacy() {
        return f.vz0_0.valueOf(name());
    }
}