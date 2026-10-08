/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.list;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.CurrencyValueTagLabel;
import cn.pokemmo.ui.widget.component.BaseInteractiveListComponent;
import cn.pokemmo.ui.widget.list.BaseScrollListWidget;

import f.cg_0;
import f.wn0_0;

public class FilterableEntryListWidget extends BaseScrollListWidget {
    public FilterableEntryListWidget() {
        FilterableEntryListWidget k3 = this;
        k3.uf("editfield");
        k3.Ii(k3::U9);
    }

    public final void U9(int n) {
        String string = ((wn0_0)this.dI0).YA.toString();
        if (string != null) {
            for (int j = 0; j < string.length(); ++j) {
                if (!Character.isWhitespace(string.charAt(j))) continue;
                this.Gv("");
                break;
            }
        }
    }
}

