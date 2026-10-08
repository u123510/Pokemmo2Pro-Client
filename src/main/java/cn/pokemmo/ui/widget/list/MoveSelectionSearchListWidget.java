package cn.pokemmo.ui.widget.list;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.CurrencyValueTagLabel;
import cn.pokemmo.ui.widget.component.BaseInteractiveListComponent;
import cn.pokemmo.ui.widget.list.BaseScrollListWidget;

import cn.pokemmo.ui.widget.text.tag.CurrencyValueTagLabel;
import java.util.Collection;

public class MoveSelectionSearchListWidget extends BaseScrollListWidget {
    public final short na0;
    public final Collection Yp;
    public final CurrencyValueTagLabel Af0;

    public MoveSelectionSearchListWidget(CurrencyValueTagLabel battle, short species, M moves) {
        super();
        this.Af0 = battle;
        this.na0 = species;
        this.Yp = moves;
    }

    @Override
    public final void mm(String text) {
        this.Gv(text);
        String query = tx_1.J10(text, true);
        if (query.isEmpty()) {
            return;
        }
        vk0_1 move = ec0_2.Sx().Pc0(query);
        if (move != null) {
            String command = "//setskill " + this.na0 + " " + this.Af0.cs0 + " " + move.hC0;
            tw0_0.rl.Cp(zo_0.Pk, command, "", true);
            return;
        }
        for (Object item : this.Yp) {
            vk0_1 candidate = (vk0_1) item;
            if (tx_1.qp0(tx_1.J10(sm0_0.c0(candidate.bt), false), query)) {
                String command = "//setskill " + this.na0 + " " + this.Af0.cs0 + " " + candidate.hC0;
                tw0_0.rl.Cp(zo_0.Pk, command, "", true);
                return;
            }
        }
    }
}
