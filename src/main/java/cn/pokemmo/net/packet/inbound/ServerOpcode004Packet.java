package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode004Packet extends S20 {
    public e30_0 nq0;

    public ServerOpcode004Packet(k20_0 connection, ByteBuffer input) {
        super(input, connection);
        this.nq0 = null;
    }

    static {
        Cq0.E1(ServerOpcode004Packet.class);
    }

    public final void Oj0() {
        if ((this.Rj.get() & 0xFF) == 1) {
            this.nq0 = this.CW(true);
        }
    }

    public final void km() {
        if (this.nq0 == null) {
            return;
        }
        ((k20_0)this.uk).Co0 = 5;
        Ge0 state = this.sr0();
        e30_0 character = this.nq0;
        state.k0 = character;
        if (state.yE < 1) {
            state.yE = character.import$;
        }
        state.cJ0.dj0 = character.WN;
        state.Cl.px0.clear();
        state.RK0();
        lpt2__0.gt(character.Nw0);
    }

    public final void os0() {
        if (this.nq0 == null) {
            this.sr0().Qw = true;
            return;
        }
        BR client = (BR)this.sr0();
        Qy0 ui = client.lZ;
        if (ui.zK0 == null) {
            ui.zK0 = new BU(ui);
            ui.F9(ui.fU(), ui.zK0);
            ui.zK0.V80();
            lg_0.k.lPT5(new IL0(ui, false));
        }
    }
}
