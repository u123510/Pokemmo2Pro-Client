package cn.pokemmo.graphics.render;

import f.C8;
import f.pc0_2;

public class RenderVectorTransformDescriptor extends pc0_2 {
    public final C8 EJ;
    public float ET;

    public RenderVectorTransformDescriptor() {
        this.EJ = new C8();
    }

    @Override
    public boolean equals(Object v1) {
        if (v1 instanceof RenderVectorTransformDescriptor) {
            return eK((RenderVectorTransformDescriptor) v1);
        }
        return false;
    }

    public boolean eK(RenderVectorTransformDescriptor v1) {
        if (v1 == null) {
            return false;
        }
        if (v1 == this) {
            return true;
        }
        return this.l0.equals(v1.l0) && this.EJ.equals(v1.EJ) && this.ET == v1.ET;
    }
}
