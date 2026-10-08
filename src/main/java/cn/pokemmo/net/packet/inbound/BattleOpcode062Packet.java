package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode062Packet extends GH {
    public b30_0 EX;
    public iz_1 Ch0;
    public boolean Qz;

    public BattleOpcode062Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.EX = b30_0.f5(this.Rj.get());
        this.Ch0 = this.Rj.get() == 0 ? iz_1.fZ : null;
        this.Qz = this.Rj.get() == 1;
    }

    @Override
    public final void os0() {
        a10_0 screen = tw0_0.PK0;
        if (screen == null) {
            return;
        }
        if (!this.Qz) {
            screen.Tk0.add(new ec_1(this.EX, this.Ch0));
            return;
        }
        if (this.Ch0 == iz_1.fZ) {
            ML0 model = tw0_0.LD0.he0.N10;
            model.zG();
            model.Wq0.Ll(false);
            model.TH0.Ll(false);
            model.ke();
            return;
        }
        throw new RuntimeException();
    }
}
