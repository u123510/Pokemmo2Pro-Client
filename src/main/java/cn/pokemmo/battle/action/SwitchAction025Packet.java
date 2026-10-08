package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchAction025Packet extends Nt implements eb0_0 {
    public final byte Z6;
    public final fq_2 Vu0;
    public final byte JX;

    public SwitchAction025Packet(byte b, fq_2 fq_22, byte b2) {
        this.Z6 = b;
        this.Vu0 = fq_22;
        this.JX = b2;
    }

    @Override
    public final byte BL0() {
        return 25;
    }

    @Override
    public final boolean Hm() {
        return false;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        Oz0 oz0 = tw0_0.LD0.he0;
        O8 o8 = tw0_0.PK0.mn(this.Z6);
        if (o8.zI == null) {
            return;
        }
        ek_0 ek_02 = o8.zI;
        ec0_2 ec0_22 = ec0_2.Sx();
        short s2;
        switch (lpt4__5.vm0[this.Vu0.ZZ]) {
            case 1:
                s2 = 191;
                break;
            case 2:
                s2 = 390;
                break;
            case 3:
                s2 = 446;
                break;
            case 4:
                s2 = 3191;
                break;
            case 5:
                s2 = 3390;
                break;
            case 6:
                s2 = 3446;
                break;
            case 7:
                s2 = 1066;
                break;
            case 8:
                s2 = 1079;
                break;
            case 9:
                s2 = 3465;
                break;
            default:
                s2 = 0;
                break;
        }
        vk0_1 vk0_12 = (vk0_1) ec0_22.f4.f5(s2);

        if (this.Vu0 != fq_2.ue0 && this.Vu0 != fq_2.KJ0 && this.Vu0 != fq_2.pz) {
            if (this.JX == 0) {
                switch (s2) {
                    case 3465: {
                        ek_02.Ka0(fq_2.gu, (byte) 1);
                        int n = mL0.yd0.Vs0(this.Z6, 200618);
                        mL0.wJ("", sm0_0.c0(n), () -> this.IO(oz0, s2));
                        break;
                    }
                    case 3446: {
                        if (ek_02.j1.containsKey(fq_2.pz)) {
                            ek_02.Ka0(fq_2.pz, (byte) 0);
                            oz0.Z8(this.Z6, (short) 446);
                        }
                        ek_02.Ka0(fq_2.uv, (byte) 2);
                        mL0.wJ("", sm0_0.wa0(200584, sm0_0.c0(vk0_12.bt)), () -> this.Ti(oz0, s2));
                        break;
                    }
                    case 3390: {
                        if (ek_02.j1.containsKey(fq_2.KJ0)) {
                            ek_02.Ka0(fq_2.KJ0, (byte) 0);
                            oz0.Z8(this.Z6, (short) 390);
                        }
                        ek_02.Ka0(fq_2.LC0, (byte) 2);
                        mL0.wJ("", sm0_0.wa0(200583, sm0_0.c0(vk0_12.bt)), () -> this.Km0(oz0, s2));
                        break;
                    }
                    case 3191: {
                        if (ek_02.j1.containsKey(fq_2.ue0)) {
                            ek_02.Ka0(fq_2.ue0, (byte) 0);
                            oz0.Z8(this.Z6, (short) 191);
                        }
                        ek_02.Ka0(fq_2.Bx0, (byte) 3);
                        mL0.wJ("", sm0_0.wa0(200583, sm0_0.c0(vk0_12.bt)), () -> this.NA(oz0, s2));
                        break;
                    }
                    case 1079: {
                        ek_02.Ka0(fq_2.Sq, (byte) 3);
                        mL0.wJ("", sm0_0.wa0(200614, sm0_0.c0(vk0_12.bt)), () -> this.NF(oz0, s2));
                        break;
                    }
                    case 1066: {
                        ek_02.Ka0(fq_2.NG, (byte) 2);
                        mL0.wJ("", sm0_0.wa0(200593, sm0_0.c0(vk0_12.bt)), () -> this.Zh0(oz0, s2));
                        break;
                    }
                }
            } else if (this.JX == 1) {
                int n1 = 200586;
                int n2 = 200585;
                int count = 0;
                switch (s2) {
                    case 3465: {
                        byte b = (byte) (ek_02.Px0(fq_2.gu) - 1);
                        ek_02.Ka0(fq_2.gu, b);
                        n1 = 200620;
                        count = b;
                        break;
                    }
                    case 3446: {
                        byte b = (byte) (ek_02.Px0(fq_2.uv) - 1);
                        ek_02.Ka0(fq_2.uv, b);
                        count = b;
                        break;
                    }
                    case 3390: {
                        byte b = (byte) (ek_02.Px0(fq_2.LC0) - 1);
                        ek_02.Ka0(fq_2.LC0, b);
                        count = b;
                        break;
                    }
                    case 3191: {
                        byte b = (byte) (ek_02.Px0(fq_2.Bx0) - 1);
                        ek_02.Ka0(fq_2.Bx0, b);
                        count = b;
                        break;
                    }
                    case 1079: {
                        byte b = (byte) (ek_02.Px0(fq_2.Sq) - 1);
                        ek_02.Ka0(fq_2.Sq, b);
                        n2 = 200616;
                        n1 = 200617;
                        count = b;
                        break;
                    }
                    case 1066: {
                        byte b = (byte) (ek_02.Px0(fq_2.NG) - 1);
                        ek_02.Ka0(fq_2.NG, b);
                        n2 = 200595;
                        n1 = 200596;
                        count = b;
                        break;
                    }
                }
                if (count < 1) {
                    mL0.wJ("", sm0_0.wa0(n1, sm0_0.c0(vk0_12.bt)), () -> this.o30(oz0, s2));
                } else {
                    mL0.wJ("", sm0_0.wa0(n2, sm0_0.c0(vk0_12.bt)), () -> this.rq(oz0, s2));
                }
            }
        } else {
            int n3 = 0;
            if (s2 == 390) {
                n3 = 4;
            } else if (s2 == 446) {
                n3 = 8;
            }

            if (this.JX == 0) {
                if (s2 == 191) {
                    ek_02.Ka0(fq_2.ue0, (byte) (ek_02.Px0(fq_2.ue0) + 1));
                } else if (s2 == 390) {
                    ek_02.Ka0(fq_2.KJ0, (byte) (ek_02.Px0(fq_2.KJ0) + 1));
                } else if (s2 == 446) {
                    ek_02.Ka0(fq_2.pz, (byte) 1);
                }
                int n4 = mL0.yd0.Vs0(this.Z6, n3 + 148);
                String string = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, n4, sm0_0.zb0);
                mL0.wJ("", string, () -> this.mL(oz0, s2));
            } else if (this.JX == 1) {
                if (s2 == 191) {
                    ek_02.Ka0(fq_2.ue0, (byte) 0);
                } else if (s2 == 390) {
                    ek_02.Ka0(fq_2.KJ0, (byte) 0);
                } else if (s2 == 446) {
                    ek_02.Ka0(fq_2.pz, (byte) 0);
                }
                int n4 = mL0.yd0.Vs0(this.Z6, n3 + 150);
                String string = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, n4, sm0_0.zb0);
                mL0.wJ("", string, () -> this.PT(oz0, s2));
            }
        }
    }

    public final void PT(Oz0 oz0, short s) {
        oz0.Z8(this.Z6, s);
    }

    public final void mL(Oz0 oz0, short s) {
        oz0.Z8(this.Z6, s);
    }

    public final void rq(Oz0 oz0, short s) {
        oz0.Z8(this.Z6, s);
    }

    public final void o30(Oz0 oz0, short s) {
        oz0.Z8(this.Z6, s);
    }

    public final void IO(Oz0 oz0, short s) {
        oz0.Z8(this.Z6, s);
    }

    public final void NF(Oz0 oz0, short s) {
        oz0.Z8(this.Z6, s);
    }

    public final void Zh0(Oz0 oz0, short s) {
        oz0.Z8(this.Z6, s);
    }

    public final void Ti(Oz0 oz0, short s) {
        oz0.Z8(this.Z6, s);
    }

    public final void Km0(Oz0 oz0, short s) {
        oz0.Z8(this.Z6, s);
    }

    public final void NA(Oz0 oz0, short s) {
        oz0.Z8(this.Z6, s);
    }
}
