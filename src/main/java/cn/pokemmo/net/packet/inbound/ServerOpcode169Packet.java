package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode169Packet extends GH {
    public CH0 oD0;
    public IL Ap0;
    public String fg0;
    public G50 Yh0;
    public int GR;

    public ServerOpcode169Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.oD0 = this.pE();
        byte code = this.Rj.get();
        IL type = (IL) t_0.BI0(IL.s4.BM(code), IL.class, code);
        this.Ap0 = type;
        if (type == IL.Sp) {
            this.fg0 = this.q60();
        } else if (type == IL.gm0) {
            this.Yh0 = G50.oZ(this.Rj.get(), false);
        } else if (type == IL.Ko || type == IL.VG) {
            this.GR = this.Rj.getInt();
            this.fg0 = this.q60();
        }
    }

    @Override
    public final void os0() {
        tw0_0.rl.VQ(this.oD0, this.Ap0, this.fg0, this.Yh0, this.GR);
    }
}
