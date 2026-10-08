package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction100Packet extends Nt implements eb0_0 {
    public static long uZ;
    public final short P9;
    public final short[] d40;

    public StatAction100Packet(short var1, short... var2) {
        this.P9 = var1;
        this.d40 = var2;
    }

    @Override
    public final byte BL0() {
        return 100;
    }

    public final short iB() {
        return this.d40.length <= 0 ? 0 : this.d40[0];
    }

    @Override
    public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
        if (var2 == null) {
            return;
        }

        short skillId = this.P9;
        vk0_1 contestSkill = (vk0_1)ec0_2.Sx().f4.f5(var5);
        if (contestSkill == null) {
            var7.wJ("Error 243", "", null);
            return;
        }

        String targetName = var2.EG();
        M3 effect = contestSkill.Qj();
        if (effect == null) {
            var7.wJ("Error 244 undefined ContestSkillEffect", "", null);
            return;
        }

        ib0_0 throwEffect = effect.throws$;
        String effectText = sm0_0.cU.l90(throwEffect.nH + 310388) ? sm0_0.c0(throwEffect.nH + 310388) : "";
        if (skillId == 181) {
            effectText = var2.EG();
        } else if (skillId == 182) {
            targetName = sm0_0.c0(contestSkill.bt);
        }

        String message = sm0_0.vs(skillId + 310200, new byte[]{2, 3, 4}, new String[]{var2.EG(), targetName, effectText});
        switch (this.P9) {
            case 176:
            case 178:
                var7.lZ.add(new kj0_2(var7, true, this.iB(), message));
                return;
            case 177:
                var7.lZ.add(new gd_0((byte)1, (short)391));
                var7.lZ.add(new kj0_2(var7, false, this.iB(), message));
                return;
            default:
                break;
        }

        switch (this.P9) {
            case 1000:
                var7.lZ.add(new kn_0(var7, var2, this.iB()));
                return;
            case 1001:
                switch (this.iB()) {
                    case 0:
                        var7.lZ.add(new gd_0((byte)1, (short)32));
                        break;
                    case 1:
                    case 2:
                        var7.lZ.add(new gd_0((byte)1, (short)31));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        var7.lZ.add(new gd_0((byte)1, (short)45));
                        break;
                    case 6:
                        var7.lZ.add(new gd_0((byte)1, (short)21));
                        break;
                    default:
                        break;
                }
                var7.lZ.add(new P2(var7, this.iB()));
                return;
            case 1002:
                var7.lZ.add(new af0_1(var7, var2, (byte)this.iB()));
                return;
            case 1003:
                var7.lZ.add(new bv_1(var7, var2, (byte)this.iB()));
                return;
            case 1004:
                var7.lZ.add(new ZC(var7, var2, (byte)this.iB()));
                return;
            case 1005:
                var7.lZ.add(new RQ(var7, var2, (byte)this.iB()));
                return;
            default:
                var7.wJ(message, "", null);
        }
    }
}
