package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.util.Arrays;

public class ServerOpcode164Packet extends GH {
    public k80_0 Oe0;
    public ad_2[] QL;

    public ServerOpcode164Packet(k20_0 source, java.nio.ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.Oe0 = (k80_0) k80_0.H70.BM(this.Rj.get());
        this.Rj.getInt();
        int count = this.Rj.getInt();
        ad_2[] entries = new ad_2[count];
        for (int i = 0; i < count; ++i) {
            CH0 owner = this.pE();
            int first = this.Rj.getInt();
            int second = this.Rj.getInt();
            int materialCount = this.Rj.get() & 0xff;
            wp_0[] materials = new wp_0[materialCount];
            for (int j = 0; j < materialCount; ++j) {
                eB material = new eB();
                materials[j] = material;
                material.pD(this.h80());
            }
            entries[i] = new ad_2(owner, first, second, materials);
        }
        this.QL = entries;
    }

    @Override
    public final void os0() {
        BR root = tw0_0.rl;
        k80_0 kind = this.Oe0;
        ad_2[] entries = this.QL;
        BU panel = root.lZ.zK0;
        if (panel == null) return;
        panel.gZ();
        xy0_0 overlay = new xy0_0(panel, kind, entries);
        panel.Nr = overlay;
        panel.SL(overlay);
        overlay.lt0();
        overlay.E40(tw0_0.LD0.ew0() / 2 - overlay.Mx / 2,
                tw0_0.LD0.Hv0() / 2 - overlay.OB / 2);
    }
}
