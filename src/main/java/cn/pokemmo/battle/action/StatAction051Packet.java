package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction051Packet extends Nt implements eb0_0 {
    public final byte EH0;
    public final short M00;
    public final CH0 HI;
    public final CH0 fR;
    public final short AN;
    public final short dp0;

    public StatAction051Packet(byte flags, short effect, CH0 target, CH0 secondaryTarget, short itemId, short value) {
        this.EH0 = flags;
        this.M00 = effect;
        this.HI = target;
        this.fR = secondaryTarget;
        this.AN = itemId;
        this.dp0 = value;
    }

    @Override public final byte BL0() { return 51; }
    @Override public final boolean Hm() { return false; }

    @Override
    public final void IE0(PF ignored, PF ignored2, boolean ignored3, boolean ignored4, short ignored5, boolean ignored6, ML0 battle, qn_1 ignored7) {
        String effectName = sm0_0.c0(this.M00 + 210000);
        PF target = battle.yd0.nd0(this.HI);
        if (target == null) return;

        PF secondary = null;
        if (hasFlag(1)) {
            secondary = battle.yd0.nd0(this.fR);
            if (secondary == null) return;
        }
        if (hasFlag(2) && (vk0_1)ec0_2.Sx().f4.f5(this.AN) == null) return;
        mc0_1 item = hasFlag(8) ? gu0.l2.lPT6(this.AN) : null;
        if (this.M00 == 0) return;

        lpt6__2 format = lpt6__2.Q80;
        battle.z70[target.cD0].fl0(sm0_0.Bw((byte)2, format, 15, 103, new String[]{target.A60(), jj0_0.hw0("", effectName)}));
        String message = null;
        switch (this.M00) {
            case 500:
                if (item != null) message = sm0_0.Bx(200378, target.A60(), sm0_0.c0(item.Nl));
                break;
            case 164: message = effectMessage(battle, format, 502, target, effectName); break;
            case 163: message = effectMessage(battle, format, 505, target, effectName); break;
            case 140: message = effectMessage(battle, format, 469, target, effectName); break;
            case 127: message = sm0_0.Bw((byte)2, format, 15, battle.yd0.Vs0(a10_0.Vp0(target.cD0), 176), sm0_0.zb0); break;
            case 107: message = effectMessage(battle, format, 436, target, effectName); break;
            case 104: message = effectMessage(battle, format, 442, target, effectName); break;
            case 64: message = effectMessage(battle, format, 457, secondary, effectName); break;
            case 56: message = effectMessage(battle, format, 330, secondary, effectName); break;
            case 46: message = effectMessage(battle, format, 487, target, effectName); break;
            case 41: message = effectMessage(battle, format, 270, target, effectName); break;
            case 40: message = effectMessage(battle, format, 300, target, effectName); break;
            case 36:
                String replacement = sm0_0.c0(this.dp0 + 210000);
                battle.wJ(sm0_0.Bx(battle.yd0.QX(200515, target), target.A60(), secondary.A60(), replacement), "", null);
                battle.z70[target.cD0].fl0(sm0_0.Bw((byte)2, format, 15, 103, new String[]{target.A60(), jj0_0.hw0("", replacement)}));
                target.Sk0 = this.dp0;
                battle.Hi(target).XO();
                break;
            case 23:
            case 42:
            case 71: message = effectMessage(battle, format, 869, target, effectName); break;
            case 21: message = sm0_0.fg0((byte)2, format, 18, 8, new String[]{target.A60()}); break;
            case 17: message = effectMessage(battle, format, 252, target, effectName); break;
            case 15: message = effectMessage(battle, format, 318, target, effectName); break;
            case 13:
            case 76: message = sm0_0.Bw((byte)2, format, 15, 94, sm0_0.zb0); break;
            case 7: message = effectMessage(battle, format, 285, target, effectName); break;
            default: break;
        }
        if (message != null) battle.wJ(message, "", null);
        if (hasFlag(16)) battle.wJ(sm0_0.Bx(200374, target.A60(), effectName), "", null);
    }

    private boolean hasFlag(int flag) {
        return (this.EH0 | flag) == this.EH0;
    }

    private static String effectMessage(ML0 battle, lpt6__2 format, int id, PF target, String effectName) {
        return sm0_0.fg0((byte)2, format, 14, battle.yd0.QX(id, target), new String[]{target.A60(), effectName});
    }
}
