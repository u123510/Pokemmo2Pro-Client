package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatActionNeg014Packet extends Nt implements eb0_0 {
    public final gc_2[] FV;
    public final byte QX;
    public final byte[] r9;

    public StatActionNeg014Packet(gc_2[] gc_2Arr, byte b, byte[] bArr) {
        if (S.ZT(null, (Object[]) gc_2Arr)) {
            throw null;
        }
        this.FV = gc_2Arr;
        this.QX = b;
        this.r9 = bArr;
    }

    public static /* synthetic */ String[] px(int i) {
        return new String[i];
    }

    public static /* synthetic */ List FD(Byte b) {
        return new ArrayList();
    }

    @Override
    public final byte BL0() {
        return -14;
    }

    @Override
    public final void IE0(PF pf, PF pf2, boolean z, boolean z2, short s, boolean z3, ML0 ml0, qn_1 qn_1) {
        if (pf2 == null || pf2.uk() == 0) {
            return;
        }
        byte[] bArr = this.r9;
        if (bArr.length == gc_2.mi.length) {
            byte b = bArr[0];
            int length = bArr.length;
            boolean allEqual = true;
            for (int i = 0; i < length; i++) {
                if (b != bArr[i]) {
                    allEqual = false;
                    break;
                }
            }
            if (allEqual) {
                byte b2 = this.r9[0];
                if (b2 == 0) {
                    return;
                }
                int qx;
                if (b2 > 0) {
                    if (b2 == 1) {
                        qx = ml0.yd0.QX(200440, pf2);
                    } else if (b2 == 2) {
                        qx = ml0.yd0.QX(200443, pf2);
                    } else {
                        qx = ml0.yd0.QX(200446, pf2);
                    }
                } else if (b2 == -2) {
                    qx = ml0.yd0.QX(200452, pf2);
                } else if (b2 == -1) {
                    qx = ml0.yd0.QX(200449, pf2);
                } else {
                    qx = ml0.yd0.QX(200455, pf2);
                }
                ml0.I1(sm0_0.wa0(qx, pf2.A60()), "", null);
                ml0.lZ.add(new com2__4(ml0, pf, pf2, null, b2, true));
                for (gc_2 gc_2 : this.FV) {
                    pf2.yK0(gc_2, b2);
                    ml0.Hi(pf2).XO();
                }
                return;
            }
        }
        HashMap<Byte, List<gc_2>> hashMap = new HashMap<>();
        for (int i2 = 0; i2 < this.FV.length; i2++) {
            hashMap.computeIfAbsent(this.r9[i2], (k) -> new ArrayList<>()).add(this.FV[i2]);
        }
        for (Map.Entry<Byte, List<gc_2>> entry : hashMap.entrySet()) {
            List<gc_2> value = entry.getValue();
            String bx;
            if (value.size() > 1) {
                bx = sm0_0.Bx(value.size() - (-200456), value.stream().map(gc_2::toString).toArray(String[]::new));
            } else {
                bx = value.get(0).toString();
            }
            byte byteValue = entry.getKey();
            String text;
            if (this.QX > 0) {
                int qx2;
                if (byteValue == 0) {
                    qx2 = ml0.yd0.QX(200482, pf2);
                } else if (byteValue == 1) {
                    qx2 = ml0.yd0.QX(200464, pf2);
                } else if (byteValue == 2) {
                    qx2 = ml0.yd0.QX(200467, pf2);
                } else {
                    qx2 = ml0.yd0.QX(200470, pf2);
                }
                text = sm0_0.Bx(qx2, pf2.A60(), bx);
            } else {
                int qx3;
                if (byteValue == -2) {
                    qx3 = ml0.yd0.QX(200476, pf2);
                } else if (byteValue == -1) {
                    qx3 = ml0.yd0.QX(200473, pf2);
                } else if (byteValue == 0) {
                    qx3 = ml0.yd0.QX(200485, pf2);
                } else {
                    qx3 = ml0.yd0.QX(200479, pf2);
                }
                text = sm0_0.Bx(qx3, pf2.A60(), bx);
            }
            String formatted = hx_1.LPt2(48, text);
            if (byteValue == 0) {
                ml0.wJ(formatted, "", null);
            } else {
                ml0.I1(formatted, "", null);
                ml0.lZ.add(new com2__4(ml0, pf, pf2, null, byteValue, true));
                for (gc_2 gc_22 : value) {
                    pf2.yK0(gc_22, byteValue);
                    ml0.Hi(pf2).XO();
                }
            }
        }
    }
}
