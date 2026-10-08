package cn.pokemmo.graphics.render;

import com.badlogic.gdx.math.Matrix4;
import f.*;

public class Renderable {
    public final Matrix4 eo0;
    public final U30 VE0;
    public BM ly;
    public U5 AA0;
    public Matrix4[] lpt7;
    public o9_0 st;
    public Object Uz;

    public Renderable() {
        this.eo0 = new Matrix4();
        this.VE0 = new U30();
    }

    public final Renderable Pe(Renderable source) {
        this.eo0.Dd0(source.eo0.EW);
        this.ly = source.ly;
        this.VE0.l0(source.VE0);
        this.lpt7 = source.lpt7;
        this.AA0 = source.AA0;
        this.st = source.st;
        this.Uz = source.Uz;
        return this;
    }
}
