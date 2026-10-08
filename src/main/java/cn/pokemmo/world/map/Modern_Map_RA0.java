package cn.pokemmo.world.map;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.RA0
 */
public class Modern_Map_RA0 {

    public final byte RC0;
    public byte my;
    public final byte Ze0;
    public final Ou0 PD0;
    public final C8 Xa;
    public Ll0 YU;
    public boolean continue$;
    public final k70_0 Re;

    public Modern_Map_RA0(k70_0 owner, byte index, Ou0 display) {
        this.Re = owner;
        this.continue$ = false;
        this.RC0 = index;
        this.Ze0 = k70_0.ZY[index];
        this.PD0 = display;
        this.Xa = new C8();
        display.ho.V1(this.Xa);
        si(k70_0.Fc[index], false);
    }

    public final void si(byte frame, boolean keep) {
        this.my = frame;
        short[][][] atlas = k70_0.oC;
        short[] coords = atlas[this.RC0][frame];
        Ll0 tile = this.Re.WK.rc0((byte) 0, coords[0], coords[1]);
        if (this.YU != null) {
            this.YU.dH = 0;
        }
        this.YU = tile;
        tile.dH = (short) -128;
        this.Xa.x = tile.Tz() * 0.25f + 0.125f;
        this.Xa.y = 0.1f;
        this.Xa.z = tile.HR() * 0.25f + 0.125f;
        this.continue$ = keep;
        if (!keep) {
            this.PD0.ho.m80(coords[0] * 0.25f + 0.125f, 0.1f, coords[1] * 0.25f + 0.125f);
        }
    }

    public final void my0(String text) {
        this.PD0.Ey(text, true, null);
    }
}

