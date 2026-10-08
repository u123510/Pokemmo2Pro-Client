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
 * Renamed from f.o20
 */
public class InventoryItemGridListWidget extends BaseScrollListWidget {
    @Override
    public final String Q9(int n, String string) {
        String string2;
        if (string == null) {
            string2 = "";
        } else {
            int n2 = -1;
            int n3 = 0;
            int n4 = 0;
            for (int j = 0; j < string.length(); ++j) {
                int n5 = string.charAt(j);
                if (n5 != 123) {
                    if (n5 != 125) {
                        if (n2 < 0) {
                            ++n3;
                            ++n4;
                        }
                    } else {
                        if (n2 >= 0) {
                            String string3 = string.subSequence(n2, j + 1).toString();
                            if (!string3.startsWith("{M:") && !string3.startsWith("{I:")) {
                                for (n5 = 0; n5 < string3.length() && n3 <= n; ++n5) {
                                    ++n3;
                                    ++n4;
                                }
                            } else {
                                n5 = n3 + 20;
                                if (n5 <= n) {
                                    n4 = string3.length() + n4;
                                    n3 = n5;
                                }
                            }
                        } else {
                            ++n3;
                            ++n4;
                        }
                        n2 = -1;
                    }
                } else {
                    n2 = j;
                }
                if (n3 < n) continue;
                n2 = -1;
                break;
            }
            if (n2 >= 0) {
                while (n3 < n) {
                    ++n3;
                    ++n4;
                }
            }
            string2 = string.substring(0, n4);
        }
        return string2;
    }

    @Override
    public final int m20(CharSequence charSequence) {
        int n;
        if (charSequence == null) {
            n = 0;
        } else {
            n = -1;
            int n2 = 0;
            for (int j = 0; j < charSequence.length(); ++j) {
                int n3 = charSequence.charAt(j);
                if (n3 != 123) {
                    String string;
                    if (n3 != 125) {
                        if (n >= 0) continue;
                        ++n2;
                        continue;
                    }
                    n = n >= 0 ? (!(string = charSequence.subSequence(n, n3 = j + 1).toString()).startsWith("{M:") && !string.startsWith("{I:") ? n3 - n + n2 : n2 + 20) : n2 + 1;
                    int n4 = n2 = -1;
                    n2 = n;
                    n = n4;
                    continue;
                }
                n = j;
            }
            n = n >= 0 ? charSequence.length() - n + n2 : n2;
        }
        return n;
    }
}

