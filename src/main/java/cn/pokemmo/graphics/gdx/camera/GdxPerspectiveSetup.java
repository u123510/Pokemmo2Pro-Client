package cn.pokemmo.graphics.gdx.camera;

import f.*;


import com.badlogic.gdx.math.Matrix4;
import java.util.ArrayList;
import java.util.List;

public class GdxPerspectiveSetup extends Oz0 {
    public jk_0[] Z10;
    public jk_0 dh;
    public jk_0[] JJ0;
    public jk_0 HX;
    public jk_0 OH0;
    public jk_0 da0;
    public N10 yY;
    public final L5 Pk0;
    public b30_0 Ak0;
    public ql_0 rn0;
    public final Matrix4 Hd;

    public GdxPerspectiveSetup(a10_0 battle, L5 controller) {
        super(controller, battle);
        this.Hd = new Matrix4();
        this.Pk0 = controller;
    }

    public final void aQ() {
        int width = lg_0.S4.Kr0();
        int height = lg_0.S4.sD0();
        int xOffset = (width - 800) / 2;
        int yOffset = (height - 500) / 4;
        this.rn0 = new ql_0(0.0F, 0.0F, 800.0F * 0.33333334F, 336.0F * 0.33333334F);
        this.C5 = new PC0((float) width, (float) height);
        this.C5.LH = 0.33333334F;
        this.C5.Ka0((float) width, (float) height, true);
        this.C5.v40.na((float) (-xOffset) * 0.33333334F, (float) (-yOffset) * 0.33333334F, 0.0F);
        this.C5.R1(true);
        this.To0.Po(this.C5.iJ);
    }

    public final void bL0() {
        PH.Y0(this.C5, 0.0F, 0.0F, (float) lg_0.S4.Kr0(), (float) lg_0.S4.sD0(), this.To0.jP, this.rn0, this.FZ);
        PH.Sj(this.FZ);
        this.To0.W30();
        if (this.Pk0.Bu >= 0) {
            int width = lg_0.S4.Kr0();
            int height = lg_0.S4.sD0();
            int xOffset = (width - 720) / 2;
            int yOffset = (height - 500) / 4;
            this.rn0 = new ql_0(0.0F, 0.0F, 720.0F * 0.33333334F, 480.0F * 0.33333334F);
            this.C5 = new PC0((float) width, (float) height);
            this.C5.LH = 0.33333334F;
            this.C5.Ka0((float) width, (float) height, true);
            this.C5.v40.na((float) (-xOffset) * 0.33333334F, (float) (-yOffset) * 0.33333334F, 0.0F);
            this.C5.R1(true);
            this.To0.Po(this.C5.iJ);
            this.yY.nr(this.To0);
            this.da0.fj0 = 1.0F;
            this.da0.I40 = 1.0F;
            this.da0.UD0 = 1.0F;
            this.da0.S7 = 1.0F;
            this.da0.Ql(this.To0, 0, 0);
            this.Pk0.Ll(true);
        } else {
            this.To0.Po(this.C5.iJ);
            this.Z10[0].Ql(this.To0, 0, 0);
            long elapsed = hk0_1.KG - this.Pk0.ea0;
            if (elapsed <= 2000L) {
                int alpha = (int) ((float) (1000 - Math.abs(1000 - (int) elapsed)) / 500.0F * 255.0F);
                if (alpha > 255) {
                    alpha = 255;
                }
                if (this.Pk0.XK) {
                    int frame = (int) (hk0_1.KG / 150L % 2L);
                    this.Z10[frame].Ql(this.To0, 0, 0);
                    jk_0 overlay = this.Z10[frame + 2];
                    overlay.J5 = alpha;
                    overlay.kH0();
                    overlay.Ql(this.To0, 0, 0);
                } else {
                    this.Z10[4].J5 = alpha;
                    this.Z10[4].kH0();
                    this.Z10[4].Ql(this.To0, 0, 0);
                }
            }

            this.dh.Ql(this.To0, 80, 4);
            if (this.Pk0.LC0 > -1) {
                this.JJ0[this.Pk0.LC0].Ql(this.To0, 88, 2);
            }

            Matrix4 transform = this.Hd.Dd0(this.C5.iJ.EW);
            transform.EW[0] *= -1.0F;
            transform.EW[5] *= 1.0F;
            transform.EW[10] *= 1.0F;
            this.To0.Po(transform.el0(-170.0F, 0.0F, 0.0F));
            for (byte team = 0; team < (byte) this.NF0.wI0.length; team++) {
                List<jk_0> sprites = new ArrayList<>();
                for (byte slot = 0; slot < this.NF0.wI0[team].length; slot++) {
                    PF entity = this.NF0.Ce(team, slot);
                    if (entity != null) {
                        sprites.add(entity.qi);
                    }
                }
                for (jk_0 sprite : sprites) {
                    sprite.Ql(this.To0, sprite.yJ, sprite.tX);
                }
            }
            this.To0.Po(this.C5.iJ);
            this.HX.Ql(this.To0, this.HX.yJ, this.HX.tX);
        }
        this.To0.TV();
        this.To0.end();
        es_1 viewportStack = PH.Kz0;
        if ((viewportStack.KB == 0 ? null : (ql_0) viewportStack.GH0()) != null) {
            PH.eF();
        }
    }

    public final void mg0() {
        for (byte team = 0; team < (byte) this.NF0.wI0.length; team++) {
            for (byte slot = 0; slot < this.NF0.wI0[team].length; slot++) {
                PF entity = this.NF0.Ce(team, slot);
                if (entity != null) {
                    entity.wb0(true);
                }
            }
        }

        this.Z10 = new jk_0[5];
        for (int index = 0; index < this.Z10.length; index++) {
            this.Z10[index] = new jk_0(ji0_0.Hg.cL[index]);
            if (index > 1) {
                this.Z10[index].J5 = 0;
                this.Z10[index].kH0();
            }
        }

        ji0_0 sprites = ji0_0.Hg;
        this.dh = new jk_0(sprites.VE0);
        this.JJ0 = new jk_0[sprites.IK0.length];
        for (int index = 0; index < this.JJ0.length; index++) {
            this.JJ0[index] = new jk_0(sprites.IK0[index]);
        }
        this.HX = new jk_0(sprites.nE0);
        this.HX.yJ = 20;
        this.HX.tX = -8;
        this.HX.cOm6 = 256;
        this.HX.wN = 120;
        this.OH0 = new jk_0(sprites.default$);
        this.da0 = new jk_0(sprites.Ne);
        N10 renderer = new N10(this.OH0);
        ZH0 animation = new ZH0(renderer.Ia, new Bp0(0.0F, 0.0F), new Bp0(-256.0F, -256.0F));
        int steps = (int) Math.floor(Math.abs(animation.MD.ut(animation.sk0) / 2.5F));
        animation.t5 = new Bp0((animation.sk0.x - animation.MD.x) / (float) steps, (animation.sk0.y - animation.MD.y) / (float) steps);
        animation.QD0 = true;
        renderer.bj0.add(animation);
        this.yY = renderer;
    }

    public final void update() {
        if (this.OE == ca_2.mV || this.OE == ca_2.NY) {
            this.OE = ca_2.M6;
            return;
        }
        if (this.OE == ca_2.M6) {
            if (this.Ak0 == null && this.N10.u20() && !this.N10.nC0()) {
                this.Ak0 = this.NF0.D0();
            }
            if (this.Ak0 != null) {
                PF entity = this.NF0.Ce(this.Ak0.Pp0, this.Ak0.B6);
                if (entity != null) {
                    Mj side = this.NF0.kd0() ? tw0_0.rl.r1(this.NF0.DF0) : tw0_0.rl.PC0;
                    if (side.sF(entity.Zo0()) == null) {
                        System.out.println("Null slot: " + this.Ak0.Pp0 + " " + this.Ak0.B6);
                    } else {
                        this.N10.l60(this.Ak0);
                    }
                    this.Ak0 = null;
                }
            }
            TC0 action = this.N10.u20() ? (TC0) this.NF0.Tk0.poll() : null;
            if (action != null) {
                action.QC(this.N10);
            }
            if (this.NF0.zL0 && this.N10.u20()) {
                this.OE = ca_2.zc0;
            }
            return;
        }
        if (this.OE == ca_2.zc0) {
            TC0 action = null;
            if (this.N10.u20()) {
                action = (TC0) this.NF0.Tk0.poll();
                if (action == null) {
                    action = (TC0) this.NF0.lPt9.poll();
                }
            }
            if (action != null) {
                action.QC(this.N10);
            }
            if (this.N10.u20()) {
                tw0_0.rl.wF();
            }
        }
    }

    public final void dispose() {
        super.dispose();
        this.yY.getClass();
    }
}
