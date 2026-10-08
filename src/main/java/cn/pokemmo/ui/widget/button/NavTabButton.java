/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

import f.cn_0;
import f.zb0_2;
import java.util.ArrayList;

/*
 * Renamed from f.bA0
 */
public class NavTabButton extends BaseButton {
    public String Ez0;
    public boolean WG;
    public int vv0;

    public NavTabButton(String string) {
        super(string);
        this.vv0 = -1;
        this.uf("label");
    }

    public NavTabButton() {
        super();
        this.vv0 = -1;
        this.uf("label");
    }

    @Override
    public final void Iu() {
        if (!this.WG && this.Ez0 != null && this.x70 != null) {
            int n;
            int n2 = this.a3();
            if (n2 < (n = this.Ya0)) {
                n2 = n;
            }
            if ((n = this.vv0) != -1) {
                n2 = n;
            }
            StringBuilder words = new StringBuilder();
            ArrayList<String> pending = new ArrayList<>();
            for (int j = 0; j < this.Ez0.length(); ++j) {
                if (Character.isWhitespace(this.Ez0.charAt(j))) {
                    if (words.length() > 0) {
                        pending.add(words.toString());
                    }
                    words.setLength(0);
                    continue;
                }
                words.append(this.Ez0.charAt(j));
            }
            if (words.length() > 0) {
                pending.add(words.toString());
            }
            words.setLength(0);
            StringBuilder line = new StringBuilder();
            while (!pending.isEmpty()) {
                String string = pending.remove(0);
                String string2 = line.toString() + " " + string;
                if (((zb0_2)this.x70).computeTextWidth(string2) > n2) {
                    words.append(line.toString()).append("\n");
                    line.setLength(0);
                    line.append(string);
                    continue;
                }
                if (line.length() > 0) {
                    line.append(" ");
                }
                line.append(string);
            }
            if (line.length() > 0) {
                words.append(line.toString());
            }
            super.Sk(words.toString());
            this.WG = true;
        }
        super.Iu();
    }

    @Override
    public final void K8() {
        this.Iu();
    }

    @Override
    public final void Sk(String string) {
        this.Ez0 = string;
        this.WG = false;
        if (this.x70 == null) {
            super.Sk(string);
        }
    }
}
