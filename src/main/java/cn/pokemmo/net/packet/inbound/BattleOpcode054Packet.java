package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode054Packet extends GH {
    public b30_0 w0;
    public boolean tf;
    public boolean ka;

    public BattleOpcode054Packet(k20_0 value, ByteBuffer buffer) {
        super(value, buffer);
    }

    public final void Oj0() {
        this.w0 = b30_0.f5(this.Rj.get());
        this.tf = (this.Rj.get() & 255) == 1;
        this.ka = (this.Rj.get() & 255) == 1;
    }

    public final void os0() {
        a10_0 manager = tw0_0.PK0;
        if (manager == null) {
            return;
        }
        if (!this.ka) {
            manager.Tk0.add(new HF(this.w0, this.tf));
            return;
        }
        ML0 layout = tw0_0.LD0.he0.N10;
        layout.zG();
        layout.Wq0.Ll(false);
        layout.TH0.Ll(false);
        layout.ke();
    }
}
