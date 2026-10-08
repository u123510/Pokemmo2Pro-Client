package cn.pokemmo.graphics.render;

import f.*;

public class QuadMeshVertexArrayData {
    public byte Md;
    public short N0;
    public short TB0;
    public byte vF;
    public byte gR;
    public byte b50;
    public boolean yB;
    public boolean Hw0;


    public QuadMeshVertexArrayData(byte i1, short i2, byte i3, byte i4, byte i5, boolean i6, boolean i7) {
        if (i1 != 1) {
            throw new RuntimeException("");
        }
        this.Md = i1;
        this.N0 = i2;
        this.vF = i3;
        this.gR = i4;
        this.b50 = i5;
        this.yB = i6;
        this.Hw0 = i7;
    }


    public QuadMeshVertexArrayData(byte i1, short i2) {
        if (i1 != 2) {
            throw new RuntimeException("");
        }
        this.Md = i1;
        this.TB0 = i2;
    }


    public final short jl0() {
        return this.N0;
    }


    public final byte oq0() {
        return this.gR;
    }


    public final boolean BH() {
        return this.Hw0;
     }


    public final boolean lx() {
        return this.yB;
    }


    public final byte St() {
        return this.b50;
    }
}
