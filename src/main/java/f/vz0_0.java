package f;

import cn.pokemmo.constant.enums.IpOctet;

public enum vz0_0 {
    OCTET_A(0),
    OCTET_B(1),
    OCTET_C(2),
    OCTET_D(3);

    public static final vz0_0 LpT4 = OCTET_A;
    public static final vz0_0 Te = OCTET_B;
    public static final vz0_0 Lt0 = OCTET_C;
    public static final vz0_0 dj0 = OCTET_D;

    public final int k0;
    public final int LE0;

    vz0_0(int i3) {
        int i0 = i3 << 3;
        this.LE0 = 24 - i0;
        this.k0 = -16777216 >>> i0;
    }

    public IpOctet asModern() {
        return IpOctet.valueOf(name());
    }
}