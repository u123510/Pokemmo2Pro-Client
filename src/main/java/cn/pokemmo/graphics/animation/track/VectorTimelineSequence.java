package cn.pokemmo.graphics.animation.track;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Color;

public class VectorTimelineSequence extends BaseTimelineSequence {
    public boolean he0;
    public final VU Cp;
    public lc_0 G3;
    public xt_0 GO;
    public CG[] bS;
    public int Pn;

    public VectorTimelineSequence(VU vu) {
        super(0);
        this.he0 = false;
        this.GO = null;
        this.bS = null;
        this.Pn = 1;
        this.Cp = vu;
    }

    @Override
    public final void dispose() {
        if (this.GO != null) {
            this.GO.dispose();
        }
        if (this.bS != null) {
            for (CG cg : this.bS) {
                cg.sI0(this);
            }
            this.bS = null;
        }
    }

    @Override
    public final void nr(hl0_1 v1) {
        if (!this.he0) {
            Y3();
        }
        super.nr(v1);
    }

    @Override
    public final void T30(fh_1 v1, BJ0 v2) {
        if (this.G3 != null) {
            if (this.GO != null) {
                lg_0.k.lPT5(this.GO);
            }
            C8 c8 = new C8(v2.rj).na(-0.14f, 0.45f, 0.0f);
            this.G3.yj(c8);
            this.G3.oA(0.025f / (float) this.Pn);
            float unused = lg_0.S4.uL;
            this.G3.GF();
            v1.ni0(this.G3);
        }
    }

    public final d3 Y3() {
        yh_0 yh = yh_0.Xm0;
        short species = this.Cp.I8.Kr();
        byte gender = this.Cp.Dg0();
        boolean shiny = this.Cp.I8.I();
        if (yh.ak0(gender, species, shiny, false)) {
            AG0[] agArr = yh.Kr0(gender, species, shiny, false);
            this.bS = agArr;
            LPT6_[] frames = new LPT6_[agArr.length];
            for (int i = 0; i < agArr.length; i++) {
                frames[i] = agArr[i].d3();
                agArr[i].O50(this);
            }
            lc_0 lc = new lc_0();
            lc.BJ0 = new float[28];
            lc.Bj0 = new p_0(0.2f, frames);
            lc.Bj0.kK0 = OI0.MW;
            lc.i80.sI0 = frames[0];
            lc.et0();
            lc.i80.Uw0 = 770;
            lc.i80.c0 = 771;
            lc.jd.x = frames[0].bz;
            lc.jd.y = frames[0].xZ;
            lc.oA(0.01f);
            lc.Ej0(1.0f, 1.0f, 1.0f, 1.0f);
            this.G3 = lc;
            if (yh_0.Xm0.kJ(gender, species, shiny, false)) {
                int[] frameDelays = yh_0.Xm0.R6(gender, species, shiny, false);
                if (frameDelays != null && frameDelays[0] > 0) {
                    int total = 0;
                    for (int delay : frameDelays) {
                        total += delay;
                    }
                    float frameDuration = (float) (total / frameDelays.length) / 1000.0f;
                    if (this.G3.Bj0 != null) {
                        this.G3.Bj0.VK = frameDuration;
                        int unused = this.G3.Bj0.p10.length;
                    }
                } else if (this.G3.Bj0 != null) {
                    this.G3.Bj0.VK = 0.05f;
                    int unused = this.G3.Bj0.p10.length;
                }
                if (this.G3.Bj0 != null) {
                    this.G3.Bj0.kK0 = OI0.MW;
                }
            }
        } else {
            this.Pn = 2;
            xt_0 xt = yh.P90(gender, species, shiny, false);
            this.GO = xt;
            xt.j9((float) this.Pn);
            this.G3 = lc_0.fC0(this.GO.yq());
        }
        this.G3.aa(0.0f, 1.0f, 0.0f);
        this.G3.lPT5.set(Color.CLEAR);
        float floatBits = Color.CLEAR.toFloatBits();
        this.G3.BJ0[3] = floatBits;
        this.G3.BJ0[10] = floatBits;
        this.G3.BJ0[17] = floatBits;
        this.G3.BJ0[24] = floatBits;
        this.D = 1000000000;
        this.he0 = true;
        return this;
    }
}
