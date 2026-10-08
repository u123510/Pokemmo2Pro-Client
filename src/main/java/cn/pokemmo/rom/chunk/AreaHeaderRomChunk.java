package cn.pokemmo.rom.chunk;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class AreaHeaderRomChunk extends BaseRomResourceChunk {
    public es_1 EP;
    public es_1 mT;
    public es_1 yj0;
    public final es_1 xy0;
    public hi0_1 Qd0;
    public ByteBuffer BC0;
    public ly0_0 HO;
    public float je;
    public float Iu0;

    public AreaHeaderRomChunk() {
        this.xy0 = new es_1();
    }

    @Override
    public final void pH(ByteBuffer byteBuffer, int... iArr) {
        this.a00 = byteBuffer.getInt();
    }

    @Override
    public final void vD(ByteBuffer byteBuffer) {
        int i2 = this.a00 + byteBuffer.getInt();
        int i3 = this.a00 + byteBuffer.getInt();
        int i4 = this.a00 + byteBuffer.getInt();
        int i5 = this.a00 + byteBuffer.getInt();
        int i6 = this.a00 + byteBuffer.getInt();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        float Ei0 = px_1.Ei0(byteBuffer.getInt());
        float Ei02 = px_1.Ei0(byteBuffer.getInt());
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        this.Iu0 = Ei0;
        this.je = Ei02;
        this.HO = new ly0_0();
        C8 c8 = new C8(px_1.dg(byteBuffer.getShort(), 3, 12), px_1.dg(byteBuffer.getShort(), 3, 12), px_1.dg(byteBuffer.getShort(), 3, 12));
        C8 c82 = new C8(px_1.dg(byteBuffer.getShort(), 3, 12), px_1.dg(byteBuffer.getShort(), 3, 12), px_1.dg(byteBuffer.getShort(), 3, 12));
        c8.na(c8.x, c8.y, c8.z);
        this.HO.nF(c8, c82);
        byteBuffer.getInt();
        byteBuffer.getInt();
        int position = byteBuffer.position();
        this.EP = new aux__1(byteBuffer, N40::new, position).Ks;
        byteBuffer.position(i4);
        int i7 = (byteBuffer.getShort() & 65535) + i4;
        int i8 = (byteBuffer.getShort() & 65535) + i4;
        this.mT = new aux__1(byteBuffer, JO::new, i4).Ks;
        byteBuffer.position(i7);
        I2 it = new aux__1(byteBuffer, ew_1::new, i4).Ks.ZD();
        while (it.hasNext()) {
            ew_1 ew_1Var = (ew_1) it.next();
            es_1 es_1Var = this.mT;
            int[] iArr = ew_1Var.COM1;
            for (int i9 = 0; i9 < iArr.length; i9++) {
                JO jo = (JO) es_1Var.get(iArr[i9]);
                String str = ew_1Var.QW;
                if (jo.nf0 != null) {
                    JO.Gx.getClass();
                }
                jo.nf0 = str;
            }
        }
        byteBuffer.position(i8);
        I2 it2 = new aux__1(byteBuffer, ew_1::new, i4).Ks.ZD();
        while (it2.hasNext()) {
            ew_1 ew_1Var2 = (ew_1) it2.next();
            es_1 es_1Var2 = this.mT;
            int[] iArr2 = ew_1Var2.COM1;
            for (int i10 = 0; i10 < iArr2.length; i10++) {
                JO jo2 = (JO) es_1Var2.get(iArr2[i10]);
                String str2 = ew_1Var2.QW;
                if (jo2.kc0 != null) {
                    JO.Gx.getClass();
                }
                jo2.kc0 = str2;
            }
        }
        byteBuffer.position(i5);
        this.yj0 = new aux__1(byteBuffer, gr_1::new, i5).Ks;
        byteBuffer.position(i3);
        byte[] bArr = new byte[i4 - i3];
        byteBuffer.get(bArr);
        this.BC0 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        int i11 = -1;
        int i12 = -1;
        byteBuffer.position(i3);
        while (i3 < i4) {
            byte b = byteBuffer.get();
            if (b == 36) {
                i12 = byteBuffer.get();
                i3 += 2;
            } else if (b == 38) {
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.get();
                byteBuffer.get();
                i3 += 5;
                if (b2 != 0) {
                    ((N40) this.EP.get(b2)).getClass();
                }
                if (b3 != b2) {
                    ((N40) this.EP.get(b3)).eB.Ue0(Integer.valueOf(b2));
                }
                ((N40) this.EP.get(b2)).getClass();
                ((N40) this.EP.get(b2)).getClass();
            } else if (b == 43) {
                i3++;
            } else if (b == 68) {
                i12 = byteBuffer.get();
                i3 += 2;
            } else if (b == 102) {
                byte b4 = byteBuffer.get();
                byte b5 = byteBuffer.get();
                byteBuffer.get();
                int i13 = i3 + 3;
                if (((b >> 5) & 1) == 1) {
                    byteBuffer.get();
                    i13 = i3 + 4;
                }
                if (((b >> 6) & 1) == 1) {
                    byteBuffer.get();
                    i13++;
                }
                if (b4 != 0) {
                    ((N40) this.EP.get(b4)).getClass();
                }
                if (b5 != b4) {
                    ((N40) this.EP.get(b5)).eB.Ue0(Integer.valueOf(b4));
                }
                ((N40) this.EP.get(b4)).getClass();
                ((N40) this.EP.get(b4)).getClass();
                i3 = i13;
            } else if (b == 70) {
                byte b6 = byteBuffer.get();
                byte b7 = byteBuffer.get();
                byteBuffer.get();
                byteBuffer.get();
                i3 += 5;
                if (b6 != 0) {
                    ((N40) this.EP.get(b6)).getClass();
                }
                if (b7 != b6) {
                    ((N40) this.EP.get(b7)).eB.Ue0(Integer.valueOf(b6));
                }
                ((N40) this.EP.get(b6)).getClass();
                ((N40) this.EP.get(b6)).getClass();
            } else if (b == 71) {
                byteBuffer.get();
                i3 += 2;
            } else {
                switch (b) {
                    case 0:
                        break;
                    case 1:
                        i3 = i4;
                        break;
                    case 2:
                        i11 = byteBuffer.get();
                        byteBuffer.get();
                        ((N40) this.EP.get(i11)).getClass();
                        i3 += 3;
                        break;
                    case 3:
                    case 7:
                        byteBuffer.get();
                        i3 += 2;
                        break;
                    case 4:
                        i12 = byteBuffer.get();
                        i3 += 2;
                        break;
                    case 5:
                        byte b8 = byteBuffer.get();
                        gr_1 gr_1Var = (gr_1) this.yj0.get(b8);
                        this.xy0.Ue0(gr_1Var);
                        gr_1Var.fO = i12;
                        gr_1Var.mp0 = i11;
                        ((N40) this.EP.get(i11)).OA.Ue0(Integer.valueOf(b8));
                        i12 = -1;
                        i3 += 2;
                        break;
                    case 6:
                        byte b9 = byteBuffer.get();
                        byte b10 = byteBuffer.get();
                        byteBuffer.get();
                        i3 += 4;
                        ((N40) this.EP.get(b9)).getClass();
                        if (b9 != b10) {
                            ((N40) this.EP.get(b10)).eB.Ue0(Integer.valueOf(b9));
                        }
                        ((N40) this.EP.get(b9)).getClass();
                        ((N40) this.EP.get(b9)).getClass();
                        break;
                    case 8:
                        byteBuffer.get();
                        i3 += 2;
                        break;
                    case 9:
                        byteBuffer.get();
                        byte b11 = byteBuffer.get();
                        i3 += 2;
                        for (int i14 = 0; i14 < b11; i14++) {
                            byteBuffer.get();
                            byteBuffer.get();
                            byteBuffer.get();
                            i3 += 3;
                        }
                        i3++;
                        break;
                    case 10:
                    default:
                        switch (b) {
                            case 11:
                                i3++;
                                break;
                            case 12:
                                byteBuffer.get();
                                i3 += 2;
                                break;
                            case 13:
                                i3 += 2;
                                break;
                            default:
                                System.out.println("unk(" + ((int) b) + ") definition " + (b & 15) + " mod = " + this.QW);
                                i3 = i4;
                                break;
                        }
                        break;
                }
            }
        }
        if (i6 != i2) {
            byteBuffer.position(i6);
            this.Qd0 = new hi0_1(byteBuffer, this.EP.KB);
        }
    }
}
