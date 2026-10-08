/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import f.I2;
import f.es_1;
import f.le0_2;
import f.zk0_1;

/*
 * Renamed from f.wl
 */
public class TrainerCardBadgeCaseComponent extends BaseComponent {
    public TrainerCardBadgeCaseComponent() {
        TrainerCardBadgeCaseComponent wl_22 = this;
        wl_22.uf("debugimpl");
    }

    @Override
    public final void HP(zk0_1 zk0_12) {
        TrainerCardBadgeCaseComponent wl_22 = this;
        super.HP(zk0_12);
        boolean bl = false;
        Iterable iterable = wl_22.t30;
        if (iterable == null) {
            return;
        }
        iterable = ((es_1)iterable).ZD();
        while (((I2)iterable).hasNext()) {
            if (((le0_2)((I2)iterable).next()).Of()) continue;
            bl = true;
        }
        if (bl) {
            this.em();
        }
    }
}

