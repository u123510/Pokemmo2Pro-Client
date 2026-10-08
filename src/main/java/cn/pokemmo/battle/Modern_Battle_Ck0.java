package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.CK0
 */
public class Modern_Battle_Ck0 {

    public Modern_Battle_Ck0() {
        super();
    }

    public byte[][] WK;
    public int[] iu;
    public int b60;
    public byte[] Dm;

    static {
        "vorbis".getBytes();
        "Xiphophorus libVorbis I 20000508".getBytes();
    }

    public final void Vd() {
        for (int j = 0; j < this.b60; ++j) {
            this.WK[j] = null;
        }
        Modern_Battle_Ck0 cK0 = this;
        cK0.WK = null;
        cK0.Dm = null;
    }

    public final String toString() {
        String string2 = new String(this.Dm, 0, this.Dm.length - 1);
        string2 = "Vendor: ".concat(string2);
        for (int j = 0; j < this.b60; ++j) {
            byte[] byArray = this.WK[j];
            string2 = AN.nK0(string2, "\nComment: ").append(new String(byArray, 0, byArray.length - 1)).toString();
        }
        return QA0.W0(string2, "\n");
    }
}


