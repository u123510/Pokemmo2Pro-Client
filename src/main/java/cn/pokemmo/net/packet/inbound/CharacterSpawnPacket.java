package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class CharacterSpawnPacket extends GH {
    public CH0 QM;
    public byte cQ;
    public String Vp;
    public zv_2 IA0;
    public RL0 SE;
    public byte fB;
    public byte X2;
    public short dG0;
    public short mI0;
    public byte Gk0;
    public String D70;
    public byte Ag;
    public qe0_2 T60;

    public CharacterSpawnPacket(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.QM = CH0.j1;
        this.X2 = -1;
        this.dG0 = -1;
        this.mI0 = 0;
        this.Gk0 = 0;
        this.D70 = "";
        this.Ag = 0;
    }

    static {
        Cq0.E1(CharacterSpawnPacket.class);
    }

    public final void Oj0() {
        this.QM = this.pE();
        this.cQ = super.Rj.get();
        this.T60 = this.ki();
        this.Vp = this.q60();
        byte b1 = super.Rj.get();
        byte b2 = super.Rj.get();
        byte b3 = super.Rj.get();
        short s1 = super.Rj.getShort();
        short s2 = super.Rj.getShort();
        byte b4 = super.Rj.get();
        byte flags = super.Rj.get();
        byte b5 = (byte)(flags & 3);
        boolean compressed = (flags & 8) != 0;
        this.IA0 = new zv_2(b1, b2, b3, compressed, s1, s2, b4, b5);
        this.fB = super.Rj.get();
        byte type = super.Rj.get();
        this.SE = (RL0)t_0.BI0(RL0.rO.BM(type), RL0.class, type);
        byte optionFlags = super.Rj.get();
        if ((optionFlags & 1) != 0) {
            this.Ag = super.Rj.get();
        }
        if ((optionFlags & 2) != 0) {
            this.X2 = super.Rj.get();
            this.dG0 = super.Rj.getShort();
        }
        if ((optionFlags & 4) != 0) {
            this.mI0 = super.Rj.getShort();
        }
        if ((optionFlags & 8) != 0) {
            this.Gk0 = super.Rj.get();
        }
        if ((optionFlags & 16) != 0) {
            this.D70 = this.q60();
        }
    }

    public final void os0() {
        this.sr0().cJ0.Jb0(this.QM, this.cQ, this.T60, this.Vp, this.Ag,
                this.IA0, this.fB, this.SE, this.X2, this.dG0, this.mI0,
                this.Gk0, this.D70);
    }
}
