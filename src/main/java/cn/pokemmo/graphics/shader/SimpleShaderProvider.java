package cn.pokemmo.graphics.shader;

import f.CK;
import f.W00;
import f.mn0_0;
import f.o9_0;
import f.uu_0;

public class SimpleShaderProvider extends uu_0 {
    public final mn0_0 tk0;

    public SimpleShaderProvider() {
        super();
        this.tk0 = new mn0_0();
    }

    public o9_0 D00(W00 w00) {
        String str = CK.AuX(w00, this.tk0);
        return new CK(w00, this.tk0, str);
    }
}
