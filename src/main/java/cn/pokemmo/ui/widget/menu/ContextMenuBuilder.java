/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.menu;

import f.*;

import f.AC0;
import f.BR;
import f.CB0;
import f.af_0;
import f.je0_1;
import f.lg_0;
import f.sm0_0;
import f.tw0_0;
import java.util.List;

public class ContextMenuBuilder
implements je0_1 {
    public final AC0 A40;
    public final boolean EU;
    public float Mz = 1.0f;
    public float ht0 = 1.0f;
    public float mK = 1.0f;
    public final short do$;
    public boolean mD = false;
    public final List xJ0;
    public int qH = 0;

    public ContextMenuBuilder(af_0 af_02, List object) {
        this.EU = false;
        this.do$ = 0;
        this.xJ0 = object;
        u90_0 engine = lg_0.MF;
        if (engine == null) {
            CB0.xS.error("Gdx audio is null, check configuration.");
            this.A40 = null;
            this.mD = true;
            return;
        }
        AC0 sound;
        try {
            sound = engine.WC(af_02);
        }
        catch (Exception exception) {
            BR bR = tw0_0.rl;
            if (bR != null) {
                bR.qK(sm0_0.wa0(1231, af_02.toString()));
            }
            CB0.xS.error("Error loading sound {}. Please check any mods for errors.", (Object)af_02, (Object)exception);
            this.A40 = null;
            this.mD = true;
            return;
        }
        this.A40 = sound;
        this.qH = (int)(System.currentTimeMillis() / 1000L);
    }

    @Override
    public final void oz0(float f) {
        if (this.mD) {
            return;
        }
        this.ht0 = f;
    }

    @Override
    public final boolean i80() {
        if (this.mD) {
            return true;
        }
        if ((int)(System.currentTimeMillis() / 1000L) - this.qH < 15) {
            return false;
        }
        this.mD = true;
        this.A40.dispose();
        return true;
    }

    public final void finalize() {
        block3: {
            try {
                if (this.mD) break block3;
            }
            catch (Exception exception) {}
            VB0 vB0 = (VB0) this;
            vB0.A40.stop();
            vB0.mD = true;
            vB0.A40.dispose();
        }
        try {
            super.finalize();
        } catch (Throwable ignored) {
            // Preserve the original cleanup method's unchecked signature.
        }
    }

    @Override
    public final void FB0() {
        if (this.mD) {
            return;
        }
        VB0 vB0 = (VB0) this;
        vB0.qH = (int)(System.currentTimeMillis() / 1000L);
        VB0 vB02 = (VB0) this;
        float f = vB02.mK;
        float f2 = vB02.Mz;
        float f3 = vB02.ht0;
        long l = vB0.A40.zK0(f, f2, f3);
        vB0.A40.lb0(l, this.EU);
        vB0.xJ0.add(this);
    }

    @Override
    public final void wy0() {
        if (this.mD) {
            return;
        }
        this.A40.wy0();
    }

    @Override
    public final void resume() {
        if (this.mD) {
            return;
        }
        this.A40.FB0();
    }

    @Override
    public final void nj0(boolean bl) {
        if (this.mD) {
            return;
        }
        this.A40.stop();
    }

    @Override
    public final boolean ge() {
        return this.mD;
    }

    @Override
    public final byte Fv() {
        return 0;
    }

    @Override
    public final short Ib0() {
        return this.do$;
    }

    @Override
    public final void aw(float f) {
        this.mK = f;
    }
}
