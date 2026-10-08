package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode168Packet extends GH {
    public int g80;
    public int[] UF;
    public int[] GD;
    public iz0_0[] WT;

    public ServerOpcode168Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.g80 = super.Rj.getInt();
        byte count = super.Rj.get();
        this.UF = new int[count];
        this.GD = new int[this.UF.length];
        this.WT = new iz0_0[this.UF.length];
        for (int index = 0; index < this.UF.length; index++) {
            this.UF[index] = super.Rj.getInt();
            this.GD[index] = super.Rj.getInt();
            if (super.Rj.get() == 1) {
                this.WT[index] = this.vG();
            }
        }
    }

    @Override
    public final void os0() {
        BR root = tw0_0.rl;
        int value = this.g80;
        int[] first = this.UF;
        int[] second = this.GD;
        iz0_0[] entries = this.WT;
        BU panel = root.lZ.zK0;
        if (panel == null) {
            return;
        }
        panel.g2();
        ic_0 content = new ic_0(panel, value, first, second, entries);
        panel.S0 = content;
        panel.SL(content);
        panel.S0.lt0();
        panel.S0.E40(tw0_0.LD0.ew0() / 2 - panel.S0.Mx / 2,
                tw0_0.LD0.Hv0() / 2 - panel.S0.OB / 2);
    }
}
