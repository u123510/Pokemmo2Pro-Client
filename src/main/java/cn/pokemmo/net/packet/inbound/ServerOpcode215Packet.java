package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode215Packet extends GH {
    public int fH0;
    public boolean[] KC;
    public CH0[] AA0;
    public G50 Q80;

    public ServerOpcode215Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.fH0 = this.Rj.getInt();
        if (this.fH0 <= 0) {
            return;
        }
        this.Q80 = G50.oZ(this.Rj.get(), false);
        int count = this.Rj.get() & 0xFF;
        this.KC = new boolean[count];
        this.AA0 = new CH0[count];
        for (int i = 0; i < count; i++) {
            this.AA0[i] = this.pE();
            this.KC[i] = (this.Rj.get() & 0xFF) == 1;
        }
    }

    @Override
    public final void os0() {
        Ge0 ge = this.sr0();
        int count = this.fH0;
        G50 type = this.Q80;
        CH0[] entries = this.AA0;
        boolean[] enabled = this.KC;
        BR br = (BR) ge;
        BU panel = br.lZ.zK0;
        if (count > 0 && enabled != null) {
            ek0_0 current = panel.OB0;
            if (current == null) {
                current = new ek0_0(count, type, entries, enabled);
                panel.OB0 = current;
                panel.SL(current);
                current.RY(400, 175);
                current.lt0();
                current.vf(pa0_0.Ol);
            } else {
                panel.Qw0(current);
                for (int i = 0; i < enabled.length; i++) {
                    current.Dk0[i].ER.lK0(enabled[i]);
                }
            }
        } else if (panel.OB0 != null) {
            panel.OB0.xe0();
            panel.OB0 = null;
        }
    }
}
