package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

public class BattleOpcode069Packet extends GH {
    public GI0 FX;
    public int cF;

    public BattleOpcode069Packet(k20_0 source, java.nio.ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        int id = this.Rj.get();
        if (id >= 0 && id < GI0.CON.length) {
            this.FX = GI0.CON[id];
        } else {
            this.FX = GI0.FP;
        }
        this.cF = this.Rj.getInt();
    }

    @Override
    public final void os0() {
        BR br = (BR) this.sr0();
        Qy0 battle = br.lZ;
        BU panel = battle.zK0;
        if (panel == null) {
            return;
        }
        if (this.FX == GI0.lN) {
            panel.U0(true);
            return;
        }
        if (this.FX == GI0.Xd0) {
            UY resource = tw0_0.Ll0.t1;
            Ae data = resource == null ? null : (Ae) resource.fd0.dg.get("/a/2/6/4");
            if (data != null) {
                panel.SL(new Rs0(this.cF));
            } else {
                battle.e80(sm0_0.wa0(nf0_0.bC0, sm0_0.c0(94)), null);
                tw0_0.rl.Kv0(this.FX, (byte) -1);
            }
            return;
        }
        panel.U0(false);
    }
}
