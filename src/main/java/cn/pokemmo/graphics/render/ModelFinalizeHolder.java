package cn.pokemmo.graphics.render;

import f.AG0;
import f.B5;
import f.CG;
import f.Wr;

public class ModelFinalizeHolder extends B5 {
    public final CG As;
    public boolean Xa0;

    public ModelFinalizeHolder(Wr v1) {
        super(v1.H8());
        this.Xa0 = false;
        this.As = v1;
        v1.O50(this);
    }

    public ModelFinalizeHolder(AG0 v1) {
        super(v1.d3());
        this.Xa0 = false;
        this.As = v1;
        v1.O50(this);
    }

    @Override
    public void finalize() throws Throwable {
        if (!this.Xa0) {
            this.Xa0 = true;
            this.As.sI0(this);
        }
        super.finalize();
    }
}
