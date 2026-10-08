package cn.pokemmo.battle;

import f.*;
import java.io.Serializable;

/**
 * 现代化重构类 - 原始混淆类: f.F20
 */
public class Modern_Battle_F20
implements Serializable {

    private static final long serialVersionUID = 1524569123485049187L;
    public float oV;
    public float IP;
    public float Ua0;
    public float aC;
    public float Jt0;
    public float vD;

    public final String toString() {
        return "[" + this.oV + "|" + this.IP + "|" + this.Ua0 + "]\n[" + this.aC + "|" + this.Jt0 + "|" + this.vD + "]\n[0.0|0.0|0.1]";
    }

    public final void j80(F20 f20) {
        this.oV = f20.oV;
        this.IP = f20.IP;
        this.Ua0 = f20.Ua0;
        this.aC = f20.aC;
        this.Jt0 = f20.Jt0;
        this.vD = f20.vD;
    }

    public Modern_Battle_F20() {
        this.oV = 1.0f;
        this.IP = 0.0f;
        this.Ua0 = 0.0f;
        this.aC = 0.0f;
        this.Jt0 = 1.0f;
        this.vD = 0.0f;
    }

    public Modern_Battle_F20(F20 f20) {
        Modern_Battle_F20 f202 = this;
        f202.oV = 1.0f;
        f202.IP = 0.0f;
        f202.Ua0 = 0.0f;
        f202.aC = 0.0f;
        f202.Jt0 = 1.0f;
        f202.vD = 0.0f;
        f202.j80(f20);
    }
}


