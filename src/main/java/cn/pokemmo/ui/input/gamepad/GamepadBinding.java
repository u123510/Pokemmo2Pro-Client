package cn.pokemmo.ui.input.gamepad;

import f.*;

public class GamepadBinding {
    public final rp_0 CZ;
    public zd0_1 Ik0;
    public int Zt0;
    public int By;
    public boolean HG0;

    public GamepadBinding(rp_0 owner) {
        this.Ik0 = null;
        this.CZ = owner;
    }

    @SuppressWarnings("unchecked")
    public <T extends GamepadBinding> T jK0(int value) {
        if (value < 0) {
            this.Ik0 = null;
            this.Zt0 = 0;
            return (T) this;
        }
        this.Ik0 = zd0_1.Dj0;
        this.Zt0 = value;
        return (T) this;
    }

    public final boolean cON(LH0 input) {
        zd0_1 mode = this.Ik0;
        if (mode == null) {
            return false;
        }
        int index = mode.Zc;
        zd0_1 indexed = zd0_1.v6[index];
        int mapped = index == 0 ? 1 : index == 1 ? 2 : 0;
        if (mapped == 1) {
            return ((o3_0) input).gE0(this.Zt0);
        }
        if (mapped == 2) {
            float value = ((o3_0) input).lV(this.By);
            if (this.HG0) {
                return value > 0.5f;
            }
            return value < -0.5f;
        }
        return false;
    }

    public final String cw0(LH0 input) {
        if (input == null) {
            return "ERROR";
        }
        zd0_1 mode = this.Ik0;
        if (mode == null) {
            return "ERROR";
        }
        int index = mode.Zc;
        zd0_1 indexed = zd0_1.v6[index];
        int mapped = index == 0 ? 1 : index == 1 ? 2 : 0;
        if (mapped == 1) {
            StringBuilder builder = new StringBuilder("Button ");
            return builder.append(this.Zt0).toString();
        }
        if (mapped == 2) {
            StringBuilder builder = new StringBuilder("Axis #");
            return fp0_0.uD(builder, this.By, this.HG0 ? "+" : "-");
        }
        return "-";
    }
}
