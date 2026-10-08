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

/*
 * Renamed from f.e60
 */
public class SimpleTextScrollListWidget extends BaseScrollListWidget {
    @Override
    public final void Ko(char c) {
        int n = Character.digit(c, 16);
        if (n >= 0 && n < 16) {
            super.Ko(c);
        }
    }

    @Override
    public final void Nr0(String string) {
        int n = string.length();
        for (int j = 0; j < n; ++j) {
            int n2 = Character.digit(string.charAt(j), 16);
            if (n2 >= 0 && n2 < 16) {
                continue;
            }
            StringBuilder stringBuilder2 = new StringBuilder(string);
            while (true) {
                int n3 = n;
                n = n3 + -1;
                if (n3 < j) break;
                int n4 = Character.digit(stringBuilder2.charAt(n), 16);
                if (n4 >= 0 && n4 < 16) continue;
                stringBuilder2.deleteCharAt(n);
            }
            string = stringBuilder2.toString();
            break;
        }
        super.Nr0(string);
    }
}

