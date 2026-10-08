// 
// Decompiled by Procyon v0.6.0
// 

package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class MultiChoiceMenuButton extends BaseButton implements GF0
{
    public int dh;
    public String[] L5;
    
    public MultiChoiceMenuButton() {
        super(null, 0);
        this.dh = -1;
    }
    
    public MultiChoiceMenuButton(final int n) {
        super(null, 0);
        this.dh = -1;
        this.er0(n);
    }
    
    public MultiChoiceMenuButton(final String... l5) {
        super(null, 0);
        this.dh = -1;
        this.L5 = l5;
        this.er0(2723);
    }
    
    @Override
    public final void Tj() {
        final String[] l5;
        if ((l5 = this.L5) != null && l5.length > 0) {
            this.Sk(sm0_0.Bx(this.dh, l5));
        }
        else {
            this.Sk(sm0_0.c0(this.dh));
        }
    }
    
    public final void er0(final int dh) {
        if (dh != this.dh) {
            this.dh = dh;
            this.Tj();
        }
    }
}

