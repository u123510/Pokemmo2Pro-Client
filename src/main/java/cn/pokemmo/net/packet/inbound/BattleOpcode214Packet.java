package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode214Packet extends GH {
    public og0_2 yz0;
    public j00_0 pg;
    public short wz;
    public U b20;

    public BattleOpcode214Packet(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }

    public final void Oj0() {
        byte typeId = this.Rj.get();
        this.pg = (j00_0) t_0.BI0(j00_0.gD0.BM(typeId), j00_0.class, typeId);
        switch (this.pg.qF) {
            case 1:
            case 10:
                this.yz0 = this.readEffectType();
                break;
            case 0:
            case 5:
            case 9:
                this.yz0 = this.readEffectType();
                this.wz = this.Rj.getShort();
                break;
            case 12:
                this.b20 = new U();
                int effectCount = this.Rj.get() & 255;
                for (int effectIndex = 0; effectIndex < effectCount; effectIndex++) {
                    CH0 source = this.pE();
                    int groupCount = this.Rj.get() & 255;
                    for (int groupIndex = 0; groupIndex < groupCount; groupIndex++) {
                        lq0 relation = lq0.JS(GV.Zd(this.Rj.get()), this.Rj.get());
                        int targetCount = this.Rj.get() & 255;
                        for (int targetIndex = 0; targetIndex < targetCount; targetIndex++) {
                            this.b20.BL(source, relation, this.pE());
                        }
                    }
                }
                break;
            default:
                break;
        }
    }

    private og0_2 readEffectType() {
        byte effectId = this.Rj.get();
        return (og0_2) t_0.BI0(og0_2.So.BM(effectId), og0_2.class, effectId);
    }

    public final void os0() {
        BR client = (BR) this.sr0();
        og0_2 effect = this.yz0;
        j00_0 type = this.pg;
        short value = this.wz;
        U targets = this.b20;
        BU battle = client.lZ.zK0;

        if (type.qF == 0 || type.qF == 9) {
            rn0_0 widget = battle.B40;
            if (widget == null) {
                widget = new rn0_0(effect, value);
                battle.B40 = widget;
                battle.SL(widget);
                widget.lt0();
                widget.A20(pa0_0.L00, 0, -50);
            } else {
                battle.Qw0(widget);
            }
        } else if (type.qF == 12) {
            tl_2 widget = battle.It;
            if (widget == null) {
                widget = new tl_2(targets);
                battle.It = widget;
                battle.SL(widget);
                widget.lt0();
                widget.vf(pa0_0.Ol);
            } else {
                battle.Qw0(widget);
            }
        } else {
            rn0_0 effectWidget = battle.B40;
            if (effectWidget != null) {
                effectWidget.xe0();
                battle.B40 = null;
            }
            tl_2 targetWidget = battle.It;
            if (targetWidget != null) {
                targetWidget.xe0();
                battle.It = null;
            }
        }

        String description = sm0_0.wa0(type.EE, Integer.toString(value));
        client.lZ.dk(-1, description);
        client.jC(description, zo_0.Dd);
    }
}
