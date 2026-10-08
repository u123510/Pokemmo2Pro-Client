package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode245Packet extends GH {
    public int Um0;
    public iz0_0[] COm2;
    public zo_0 AM;
    public boolean Com5;

    public BattleOpcode245Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.AM = zo_0.Dd;
        this.Com5 = false;
    }

    public final void Oj0() {
        this.Um0 = this.Rj.getInt();
        byte flags = this.Rj.get();
        this.COm2 = new iz0_0[flags & 63];
        for (int i = 0; i < this.COm2.length; ++i) {
            this.COm2[i] = this.vG();
        }
        this.Com5 = (flags & 64) != 0;
        if ((flags & 128) != 0) {
            this.AM = (zo_0)zo_0.N00.BM(this.Rj.get());
        }
    }

    public final void os0() {
        String text = (String)sm0_0.cU.get(this.Um0);
        if (text == null) {
            text = yr_1.pG("STRING_", this.Um0);
        } else {
            text = sm0_0.Qc0(sm0_0.X10(text, this.COm2));
        }
        if (this.Com5) {
            a10_0 hud = tw0_0.PK0;
            if (hud != null) {
                hud.Tk0.add(new vd_0(text));
                return;
            }
        }
        if (this.AM == zo_0.Dd && tw0_0.PK0 == null) {
            this.sr0().qK(text);
        } else {
            this.sr0().ug(new sf0_2(this.AM, CH0.j1, "", null, (byte)0, text));
        }
    }
}
