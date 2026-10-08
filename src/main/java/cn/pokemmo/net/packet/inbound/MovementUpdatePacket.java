package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MovementUpdatePacket extends GH {
    public CH0 h80;
    public byte Zh0;
    public byte rm0;
    public byte bM0;
    public short m2;
    public short o90;
    public byte fx;
    public byte kP;

    public MovementUpdatePacket(k20_0 source, ByteBuffer buffer) {
        super(source, buffer);
    }

    public final void Oj0() {
        int flags = this.L8;
        if (flags < 224) {
            this.L8 = 239;
            flags = 239;
        }
        this.h80 = this.pE();
        if ((flags & 1) != 0) {
            this.Zh0 = this.Rj.get();
        }
        if ((flags & 2) != 0) {
            this.rm0 = this.Rj.get();
            this.bM0 = this.Rj.get();
        }
        if ((flags & 4) != 0) {
            this.m2 = this.Rj.getShort();
            this.o90 = this.Rj.getShort();
        } else {
            this.m2 = (short) this.Rj.get();
            this.o90 = (short) this.Rj.get();
        }
        if ((flags & 8) != 0) {
            this.fx = this.Rj.get();
        } else {
            this.fx = 0;
        }
        this.kP = this.Rj.get();
    }

    public final void os0() {
        Ge0 ge = this.sr0();
        bi0_1 value = ge.cJ0.ax(this.h80);
        if (value == null) {
            return;
        }
        byte packed = this.kP;
        byte mode = (byte) (packed & 3);
        boolean flag = (packed & 8) != 0;
        int flags = this.L8;
        if ((flags & 1) == 0) {
            this.Zh0 = value.ba0.uS;
        }
        if ((flags & 2) == 0) {
            this.rm0 = value.ba0.o0;
            this.bM0 = value.ba0.ID0;
        }
        zv_2 decoded = new zv_2(this.Zh0, this.rm0, this.bM0, flag, this.m2, this.o90, this.fx, mode);
        value.il0.Ec0(decoded, packed);
    }
}
