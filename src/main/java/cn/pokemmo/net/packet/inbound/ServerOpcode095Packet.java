package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode095Packet extends GH {
    public int nx0;
    public int COM3;
    public int Ly;
    public int sY;
    public int uq0;
    public int ci;
    public int fL;
    public short Lg0;
    public qp_1[] strictfp$;
    public qp_1[] Yf0;
    public qp_1[] lPT8;
    public qp_1[] COm3;

    public ServerOpcode095Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.Lg0 = this.Rj.getShort();
        this.nx0 = this.Rj.getInt();
        this.COM3 = this.Rj.getInt();
        this.Ly = this.Rj.getInt();
        this.sY = this.Rj.getInt();
        int value = this.Rj.getInt();
        this.uq0 = value;
        this.ci = this.nx0 - this.sY;
        this.fL = this.COM3 - value;
        this.strictfp$ = this.zL();

        byte count = this.Rj.get();
        qp_1[] entries = new qp_1[count];
        for (int index = 0; index < count; index++) {
            qp_1 entry = new qp_1(this.Rj.get());
            entries[index] = entry;
            entry.tn = this.Rj.getInt();
        }
        this.Yf0 = entries;
        this.lPT8 = this.zL();
        this.COm3 = this.zL();
    }

    @Override
    public final void os0() {
        BR state = tw0_0.rl;
        if (state == null) {
            return;
        }
        Qy0 context = state.lZ;
        if (context == null) {
            return;
        }
        BU holder = context.zK0;
        if (holder == null) {
            return;
        }
        kf0_2 controller = holder.yQ;
        if (controller == null) {
            return;
        }
        controller.ke0.A00(
            this.nx0,
            this.COM3,
            this.Ly,
            this.sY,
            this.uq0,
            this.ci,
            this.fL,
            this.Lg0,
            this.strictfp$,
            this.Yf0,
            this.lPT8,
            this.COm3);
    }


    public final qp_1[] zL() {
        byte count = this.Rj.get();
        qp_1[] entries = new qp_1[count];
        for (int index = 0; index < count; index++) {
            qp_1 entry = new qp_1(this.Rj.getShort());
            entries[index] = entry;
            entry.tn = this.Rj.getInt();
        }
        return entries;
    }
}
