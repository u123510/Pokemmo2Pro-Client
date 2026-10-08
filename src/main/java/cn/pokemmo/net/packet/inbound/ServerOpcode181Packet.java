package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode181Packet extends GH {
    public CH0 Ze0 = CH0.j1;
    public byte h00 = -1;
    public byte UK0;
    public short Va0;
    public short DB;
    public short am = -1;
    public cd0_2 Gg;

    public ServerOpcode181Packet(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }

    public final void Oj0() {
        this.Ze0 = this.pE();
        this.Va0 = this.Rj.getShort();
        byte flags = this.Rj.get();
        if ((flags & 1) != 0) {
            this.h00 = this.Rj.get();
        }
        if ((flags & 2) != 0) {
            this.DB = this.Rj.getShort();
        }
        if ((flags & 4) != 0) {
            this.Gg = this.h80();
        }
        if ((flags & 8) != 0) {
            this.am = this.Rj.getShort();
            this.UK0 = this.Rj.get();
        }
    }

    public final void os0() {
        bi0_1 entity = (bi0_1)tw0_0.e60.pn0.get(this.Ze0);
        if (!(entity instanceof MO)) {
            return;
        }

        MO model = (MO)entity;
        byte modelType = this.h00 == -1 ? model.ok : this.h00;
        model.ok = modelType;
        model.Z4 = this.Va0;
        model.ho0 = QI.Py.kN(modelType, this.Va0, false);
        UT.oV();
        if (UT.Ce0(modelType, this.Va0)) {
            model.hq0 = true;
        }
        model.hj.ej0();
        model.nU();
        model.ql(this.DB, (byte)0, false);
        model.transient$ = this.Gg;
        model.f8 = this.am;
        model.xq = this.UK0;
    }
}
