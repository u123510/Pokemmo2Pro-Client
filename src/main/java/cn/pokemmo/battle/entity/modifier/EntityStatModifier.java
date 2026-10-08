package cn.pokemmo.battle.entity.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class EntityStatModifier extends BaseBattleModifier {
    public final zv_2 Kh0;
    public final byte l90;

    public EntityStatModifier(zv_2 zv_2Var, byte b) {
        this.Kh0 = zv_2Var;
        this.l90 = b;
    }

    @Override
    public final void Gj0(EA0 ea0) {
        zv_2 zv_2Var = this.Kh0;
        byte b = this.l90;
        bi0_1 bi0_1Var = ea0.QM;
        zv_2 zv_2Var2 = bi0_1Var.ba0;
        byte b2 = zv_2Var.Y30;
        if (zv_2Var2.Y30 != b2 && b2 != -1) {
            zv_2Var2.Y30 = b2;
        }
        boolean z = (b & 128) != 0;
        boolean z2 = (b & 64) != 0;
        boolean z3 = (b & 4) != 0;
        ea0.BQ = z3;
        ea0.EL = z2;
        LT lPt1 = zv_2Var2.LPt1();
        if (lPt1 != null && lPt1.gr0()) {
            ea0.g9.np(lPt1.Ki());
            float f = ea0.g9.y;
            ea0.g9.y = ea0.g9.z;
            ea0.g9.z = f;
        } else if (lPt1 != null && lPt1.Wb0()) {
            ea0.g9.x = ((float) zv_2Var2.Lq0) + 0.5f;
            ea0.g9.y = ((float) zv_2Var2.B5) + 0.5f;
            ea0.g9.z = bi0_1Var.E7();
        } else if (zv_2Var2.uS == zv_2Var.uS && zv_2Var2.o0 == zv_2Var.o0 && zv_2Var2.ID0 == zv_2Var.ID0) {
            ea0.g9.x = (float) zv_2Var2.Lq0;
            ea0.g9.y = (float) zv_2Var2.B5;
            ea0.g9.z = bi0_1Var.E7();
        } else {
            LT lTVar = lPt1 != null ? lPt1.F2().gv(lPt1, zv_2Var.Y30, 1) : null;
            if (lTVar != null) {
                ea0.g9.x = (float) lTVar.Tz();
                ea0.g9.y = (float) lTVar.HR();
                ea0.g9.z = ea0.QM.E7();
                switch (zv_2Var.Y30) {
                    case 0:
                        ea0.g9.y -= 1.0f;
                        break;
                    case 1:
                        ea0.g9.y += 1.0f;
                        break;
                    case 2:
                        ea0.g9.x += 1.0f;
                        break;
                    case 3:
                        ea0.g9.x -= 1.0f;
                        break;
                }
            } else {
                ea0.g9.x = (float) zv_2Var2.Lq0;
                ea0.g9.y = (float) zv_2Var2.B5;
                ea0.g9.z = bi0_1Var.E7();
            }
        }
        ea0.np = true;
        ea0.QM.Xe = z;
        ea0.hw0(0L);
        if (ea0.QM.ba0.equals(zv_2Var)) {
            return;
        }
        _else _elseVar = (_else) tw0_0.e60.E6.get(J4.iA0(ea0.QM.ba0.uS, ea0.QM.ba0.o0, ea0.QM.ba0.ID0));
        _else _elseVar2 = (_else) tw0_0.e60.E6.get(J4.iA0(zv_2Var.uS, zv_2Var.o0, zv_2Var.ID0));
        if (_elseVar2 == null) {
            return;
        }
        LT lTVar2;
        if (zv_2Var.Lpt2) {
            lTVar2 = _elseVar2.Jk0(zv_2Var.JT, zv_2Var.Lq0, zv_2Var.B5);
        } else {
            lTVar2 = _elseVar2.LB0(zv_2Var.Lq0, zv_2Var.B5, lPt1 != null ? lPt1.S80() : 0.0f);
        }
        if (!ea0.qm(lPt1, lTVar2, zv_2Var.Y30, z, z2, z3)) {
            ea0.QM.ba0.Y30 = zv_2Var.Y30;
            return;
        }
        ea0.lPT5(ea0.QM, lPt1);
        ea0.QM.ba0.V2(zv_2Var);
        ea0.b60 = hk0_1.KG;
        ea0.ud();
        if (lPt1 != null && lPt1.u40().QK(lPt1, lTVar2) > 0) {
            ea0.Kg = lPt1.u40().QK(lPt1, lTVar2);
        }
        if (lPt1 != lTVar2) {
            lTVar2.u40().xB(lTVar2, lPt1, ea0.QM, (byte) (b | 1));
            if (lPt1 != null) {
                lPt1.u40().K40(ea0.QM, lPt1);
                ea0.zp0(lPt1);
            }
        }
        ea0.QM.ba0.Fc0 = ea0.QM.ba0.Y30;
    }
}
