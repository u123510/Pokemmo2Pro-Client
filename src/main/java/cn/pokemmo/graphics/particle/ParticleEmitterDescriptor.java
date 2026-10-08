package cn.pokemmo.graphics.particle;

import f.*;

public class ParticleEmitterDescriptor extends TD {
    public final cn0_0 p50;
    public final int uL;
    public final int JE0;
    public final int Ca;
    public final int v80;
    public final int m80;
    public final int OJ0;
    public final int V6;
    public final int Vu0;
    public final int aC;

    public ParticleEmitterDescriptor(W00 renderable, JA config, String prefix) {
        super(renderable, config, prefix);
        this.uL = this.register(new com9__4("u_lightTexture"));
        this.JE0 = this.register(new com9__4("u_useLightTexture"));
        this.Ca = this.register(new com9__4("glow_intensity"));
        this.v80 = this.register(new com9__4("glow_threshold"));
        this.m80 = this.register(new com9__4("glow_size"));
        this.OJ0 = this.register(new com9__4("glow_color"));
        this.V6 = this.register(new com9__4("u_overlayColor"));
        this.Vu0 = this.register(new com9__4("u_lightTexturePos"));
        this.aC = this.register(new com9__4("u_lightTextureScale"));
        this.p50 = config.uF;
    }

    @Override
    public final void com7(wh_0 attributes) {
        super.com7(attributes);
        I2 iterator = attributes.VH.ZD();
        while (iterator.hasNext()) {
            hf_1 attribute = (hf_1) iterator.next();
            if (na0_0.CY(attribute.yO)) {
                na0_0 glow = (na0_0) attribute;
                this.set(this.OJ0, glow.CD0);
                this.set(this.Ca, glow.nF0);
                this.set(this.v80, glow.hL);
                this.set(this.m80, glow.aD);
            } else if (Rv0.iX(attribute.yO)) {
                this.set(this.V6, ((Rv0) attribute).Vr);
            }
        }
    }

    @Override
    public final void tT(W00 renderable, wh_0 attributes) {
        super.tT(renderable, attributes);
        cn0_0 textureInfo = this.p50;
        if (textureInfo != null && textureInfo.Rp != null) {
            this.set(this.uL, textureInfo.Rp);
            this.set(this.aC, textureInfo.SA0);
            this.set(this.Vu0, textureInfo.g80);
            this.set(this.JE0, 1);
        } else {
            this.set(this.JE0, 0);
        }
    }
}
