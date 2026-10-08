package cn.pokemmo.util;

import f.*;


/**
 * 现代化重构类 - 原始混淆类: f.br_1
 */
public class Modern_Util_Br1 implements YA {

    public String na;
    public float GA0;
    public float f60;
    public float dL0;
    public float bB;
    public float wv;
    public float u1;

    public Modern_Util_Br1() {
        super();
    }

    public Modern_Util_Br1(YA ya) {
        super();
        if (ya instanceof br_1) {
            this.na = ((br_1) ya).VU();
        }
        br_1 other = (br_1) ya;
        this.GA0 = other.l8();
        this.f60 = other.z7();
        this.dL0 = other.Ku();
        this.bB = other.WG0();
        this.wv = other.Jv();
        this.u1 = other.Tr0();
    }

    public void Xd(ui_1 ui, float f, float f2, float f3, float f4) {
    }

    public final float l8() {
        return this.GA0;
    }

    public final float z7() {
        return this.f60;
    }

    public final float Ku() {
        return this.dL0;
    }

    public final float WG0() {
        return this.bB;
    }

    public final float Jv() {
        return this.wv;
    }

    public final float Tr0() {
        return this.u1;
    }

    public final String VU() {
        return this.na;
    }

    public final String toString() {
        if (this.na != null) {
            return this.na;
        }
        return this.getClass().getSimpleName();
    }
}

