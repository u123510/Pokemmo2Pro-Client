/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

import f.CF;
import f.E00;
import f.Rs0;
import f.i70_0;
import f.qj_2;

/*
 * Renamed from f.cb
 */
public class ChatChannelTagLabel extends BaseTaggedLabelWidget {
    public final /* synthetic */ int LPt6;
    public final /* synthetic */ int LpT8;
    public final /* synthetic */ Rs0 QH;

    public ChatChannelTagLabel(Rs0 rs0, int n, int n2) {
        this.QH = rs0;
        this.LPt6 = n;
        this.LpT8 = n2;
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        if (E00.C10(i70_02.zu)) {
            CF cF = this.QH.FR;
            if (cF.pd0 == 0) {
                ChatChannelTagLabel cb_22 = this;
                int n = cb_22.LPt6;
                cF.zr(n, cb_22.LpT8);
            }
        }
        return super.nd0(i70_02);
    }
}

