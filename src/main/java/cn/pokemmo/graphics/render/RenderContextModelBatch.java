package cn.pokemmo.graphics.render;

import f.*;

/**
 * 现代化重构类 - 原始类: f.ER
 */
public class RenderContextModelBatch implements fy0_0 {

    public Tv0 tr;
    public final JR g50;
    public final es_1 H3;
    public final qi_1 QD;
    public final boolean yv0;
    public final ux_1 KF;
    public final O30 pR;

    public RenderContextModelBatch(qi_1 state, ux_1 provider, O30 sorter) {
        super();
        this.g50 = new JR();
        this.H3 = new es_1();
        if (sorter == null) {
            sorter = new com5__6();
        }
        this.pR = sorter;
        this.yv0 = state == null;
        if (state == null) {
            state = new qi_1(new ph0_2(1, 1));
        }
        this.QD = state;
        if (provider == null) {
            provider = new XB();
        }
        this.KF = provider;
    }

    public RenderContextModelBatch(qi_1 state, ux_1 provider) {
        this(state, provider, null);
    }

    public RenderContextModelBatch(qi_1 state, O30 sorter) {
        this(state, null, sorter);
    }

    public RenderContextModelBatch(qi_1 state) {
        this(state, null, null);
    }

    public RenderContextModelBatch(ux_1 provider, O30 sorter) {
        this(null, provider, sorter);
    }

    public RenderContextModelBatch(O30 sorter) {
        this(null, null, sorter);
    }

    public RenderContextModelBatch(ux_1 provider) {
        this(null, provider, null);
    }

    public RenderContextModelBatch(Dn0 first, Dn0 second) {
        this(null, new XB(first, second), null);
    }

    public RenderContextModelBatch(String first, String second) {
        this(null, new XB(first, second), null);
    }

    public RenderContextModelBatch() {
        this(null, null, null);
    }

    public void jK(Tv0 camera) {
        if (this.tr != null) {
            throw new nf_1("Call end() first.");
        }
        this.tr = camera;
        if (this.yv0) {
            qi_1 state = this.QD;
            state.getClass();
            lg_0.OH0.glDisable(2929);
            state.Zj0 = 0;
            lg_0.OH0.glDepthMask(true);
            state.Wz = true;
            lg_0.OH0.glDisable(3042);
            state.TV = false;
            lg_0.OH0.glDisable(2884);
            state.mC = 0;
            state.fj0 = 0;
            state.UG = 0;
            ph0_2 textures = (ph0_2) state.iG;
            for (int i = 0; i < textures.Nj; ++i) {
                textures.G6[i] = null;
                if (textures.S != null) {
                    textures.S[i] = i;
                }
            }
        }
    }

    public final void vL() {
        Tv0 camera = this.tr;
        this.pR.On0(camera, this.H3);
        o9_0 current = null;
        for (int i = 0; i < this.H3.KB; ++i) {
            W00 renderable = (W00) this.H3.get(i);
            if (current != renderable.st) {
                if (current != null) {
                    current.end();
                }
                current = renderable.st;
                current.begin(camera, this.QD);
            }
            current.render(renderable);
        }
        if (current != null) {
            current.end();
        }
        this.g50.hJ();
        this.H3.clear();
    }

    public void end() {
        this.vL();
        if (this.yv0) {
            qi_1 state = this.QD;
            if (state.Zj0 != 0) {
                lg_0.OH0.glDisable(2929);
            }
            if (!state.Wz) {
                lg_0.OH0.glDepthMask(true);
            }
            if (state.TV) {
                lg_0.OH0.glDisable(3042);
            }
            if (state.UG > 0) {
                lg_0.OH0.glDisable(2884);
            }
            ((ph0_2) state.iG).getClass();
            lg_0.OH0.glActiveTexture(33984);
        }
        this.tr = null;
    }

    public final void eo0(uh_1 renderableProvider) {
        int start = this.H3.KB;
        renderableProvider.getRenderables(this.H3, this.g50);
        for (int i = start; i < this.H3.KB; ++i) {
            W00 renderable = (W00) this.H3.get(i);
            renderable.st = ((uu_0) this.KF).go(renderable);
        }
    }

    public void Lh0(uh_1 renderableProvider, U5 context) {
        int start = this.H3.KB;
        renderableProvider.getRenderables(this.H3, this.g50);
        for (int i = start; i < this.H3.KB; ++i) {
            W00 renderable = (W00) this.H3.get(i);
            renderable.AA0 = context;
            renderable.st = ((uu_0) this.KF).go(renderable);
        }
    }

    public final void A80(es_1 providers, U5 context) {
        I2 iterator = providers.ZD();
        while (iterator.hasNext()) {
            this.Lh0((uh_1) iterator.next(), context);
        }
    }

    @Override
    public final void dispose() {
        ((uu_0) this.KF).dispose();
    }
}
