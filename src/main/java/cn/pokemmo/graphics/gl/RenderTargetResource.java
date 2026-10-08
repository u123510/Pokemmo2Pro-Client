package cn.pokemmo.graphics.gl;

import com.badlogic.gdx.graphics.Texture;
import f.*;

/**
 * 现代化重构类 - 原始类: f.IC0
 */
public class RenderTargetResource implements fy0_0 {

    public PC0 TD0;
    public final ui_1 Bw;
    public int dz0;
    public final Texture NE0;
    public XD Bi;
    public Texture[] Ey0;
    public int KQ;
    public int VA0;

    public RenderTargetResource() {
        this.Bw = new ui_1();
        this.I30(lg_0.S4.Kr0(), lg_0.S4.sD0());
        this.NE0 = new Texture(lg_0.I70.cD0("data/themes/default/res/bg.png"));
    }

    @Override
    public final void dispose() {
        this.Bw.dispose();
        XD background = this.Bi;
        if (background != null) {
            background.dispose();
        }
        Texture[] textures = this.Ey0;
        if (textures != null) {
            for (int index = 0; index < textures.length; index++) {
                textures[index].dispose();
            }
        }
        Texture base = this.NE0;
        if (base != null) {
            base.dispose();
        }
    }

    public final void I30(int width, int height) {
        XD background = this.Bi;
        if (background != null) {
            background.LPt6(width, height);
        }
        float widthValue = width;
        float heightValue = height;
        this.TD0 = new PC0(widthValue, heightValue);
        this.TD0.Ka0(widthValue, heightValue, false);
        this.TD0.R1(true);
        this.Bw.Po(this.TD0.iJ);
    }

    public final void mT() {
        Iu0 state = tw0_0.hH0;
        if (state.N20 && state.hZ) {
            aa0_2 overlay = tw0_0.Ll0;
            if (overlay.Qz0 != null && this.Bi == null && !overlay.zd && !tw0_0.Xy0()) {
                int mode = com9__2.Om.mv.ordinal();
                if (mode == 3) {
                    this.Bi = XD.Xv(21, (short)0, true);
                } else if (mode == 2) {
                    this.Bi = XD.Xv(20, (short)0, true);
                } else if (mode == 1) {
                    this.Bi = XD.Xv(19, (short)0, true);
                }
                if (this.Bi == null) {
                    this.Bi = XD.Xv(rg0_2.r4(2) == 0 ? 18 : 17, (short)0, true);
                }
            }
        }

        XD background = this.Bi;
        if (background != null) {
            background.LPt1();
            return;
        }

        this.Bw.getClass();
        this.Bw.W30();
        if (!tw0_0.Xy0()) {
            Iu0 current = tw0_0.hH0;
            if (!current.N20 || !current.hZ) {
                tw0_0.Dc0();
                int x = (lg_0.S4.Kr0() - this.NE0.getWidth()) / 2;
                int y = lg_0.S4.sD0() / 4
                    + (lg_0.S4.sD0() - this.NE0.getHeight()) / 2;
                this.Bw.CH0(this.NE0, x, y);
                this.Bw.end();
                return;
            }
        }
        if (this.Ey0 == null) {
            fn_0.qz0().getClass();
            this.Ey0 = fn_0.qF();
            if (this.Ey0.length == 0) {
                java.util.ArrayList<Texture> localTextures = new java.util.ArrayList<>();
                for (int index = 0; index < 100; index++) {
                    String path = String.format("data/sprites/textures/bg_%02d.png", index);
                    VE handle = lg_0.I70.cD0(path);
                    if (!handle.os0()) {
                        break;
                    }
                    localTextures.add(new Texture(handle));
                }
                this.Ey0 = localTextures.toArray(new Texture[0]);
            }
            for (Texture texture : this.Ey0) {
                this.KQ += texture.getWidth();
                this.VA0 = texture.getHeight();
            }
        }
        if (this.KQ < 1) {
            this.Bw.end();
            return;
        }
        if (this.KQ < 2) {
            this.Bw.end();
            return;
        }
        if (this.Ey0.length == 1) {
            this.Bw.vv0(
                this.Ey0[0],
                0.0f,
                0.0f,
                (float)lg_0.S4.Kr0(),
                (float)lg_0.S4.sD0());
            this.Bw.end();
            return;
        }
        int width = this.KQ;
        if (width < 1) {
            width = 1;
        }
        float screenHeight = lg_0.S4.sD0();
        int textureHeight = this.VA0;
        if (textureHeight < 1) {
            textureHeight = 1;
        }
        int frameWidth = (int)(screenHeight / textureHeight * width);
        if (frameWidth < 1) {
            frameWidth = 1;
        }
        this.dz0 = -(int)(hk0_1.Bk0 / 22000000L % (long)frameWidth);
        while (this.dz0 < lg_0.S4.Kr0()) {
            for (int index = 0; index < this.Ey0.length; index++) {
                Texture texture = this.Ey0[index];
                int drawWidth = (int)(
                    (float)texture.getWidth()
                        * (float)lg_0.S4.sD0()
                        / (float)texture.getHeight());
                if (drawWidth < 1) {
                    drawWidth = 1;
                }
                this.Bw.vv0(
                    texture,
                    this.dz0,
                    0.0f,
                    drawWidth,
                    (float)lg_0.S4.sD0());
                this.dz0 += drawWidth;
            }
        }
        this.Bw.end();
    }
}
