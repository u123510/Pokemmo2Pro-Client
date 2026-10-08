package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode049Packet extends GH {
    public byte Vj0;
    public SZ[] bS;
    public SZ[] G80;
    public int Az0;
    public int aa0;
    public SZ[] FJ;
    public byte fr0;

    public BattleOpcode049Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    static {
        Cq0.E1(BattleOpcode049Packet.class);
    }

    @Override
    public final void Oj0() {
        this.Vj0 = this.Rj.get();
        this.bS = new SZ[this.Rj.get() & 255];
        for (int i = 0; i < this.bS.length; i++) {
            this.bS[i] = this.di0();
        }
        this.G80 = new SZ[this.Rj.get() & 255];
        for (int i = 0; i < this.G80.length; i++) {
            this.G80[i] = this.di0();
        }
        this.Az0 = this.Rj.getInt();
        this.aa0 = this.Rj.getInt();
        this.fr0 = this.Rj.get();
        this.FJ = new SZ[this.Rj.get() & 255];
        for (int i = 0; i < this.FJ.length; i++) {
            this.FJ[i] = this.di0();
        }
    }

    @Override
    public final void os0() {
        a10_0 state = tw0_0.PK0;
        if (state != null) {
            state.F2(this.Vj0, this.bS, this.G80, this.Az0, this.aa0, this.FJ, this.fr0);
        }
    }
}
