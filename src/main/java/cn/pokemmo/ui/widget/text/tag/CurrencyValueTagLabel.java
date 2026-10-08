package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

import java.util.ArrayList;
import java.util.Collection;

public class CurrencyValueTagLabel extends BaseTaggedLabelWidget {
    public final int cs0;
    public final qj_2[] Pt0;
    public final ng_2 IF;

    public CurrencyValueTagLabel(ng_2 battle, String title, int slot, qj_2[] choices) {
        super(title, 0, 0);
        this.IF = battle;
        this.cs0 = slot;
        this.Pt0 = choices;
    }

    public static void Dh(EB0 field, short species, int slot, Collection moves, int key) {
        if (key != 66) {
            return;
        }

        String query = tx_1.J10(((wn0_0) field.Sv.dI0).YA.toString(), true);
        if (query.isEmpty()) {
            return;
        }

        vk0_1 move = ec0_2.Sx().Pc0(query);
        if (move != null) {
            CurrencyValueTagLabel.Jv(species, slot, move);
            return;
        }

        for (Object candidate : moves) {
            move = (vk0_1) candidate;
            if (tx_1.qp0(tx_1.J10(sm0_0.c0(move.bt), false), query)) {
                CurrencyValueTagLabel.Jv(species, slot, move);
                return;
            }
        }
    }

    private static void Jv(short species, int slot, vk0_1 move) {
        String command = "//setskill " + species + " " + slot + " " + move.hC0;
        tw0_0.rl.Cp(zo_0.Pk, command, "", true);
    }

    public static KZ O7(Collection moves, String text, int position, KZ previous) {
        String query = tx_1.J10(text.substring(0, position), true);
        ArrayList results = new ArrayList();
        for (Object candidate : moves) {
            vk0_1 move = (vk0_1) candidate;
            if (tx_1.qp0(tx_1.J10(sm0_0.c0(move.bt), false), query)) {
                results.add(sm0_0.c0(move.bt));
            }
        }
        return results.isEmpty() ? null : new gj_2(results);
    }

    public final boolean nd0(i70_0 event) {
        if (tw0_0.Yw(8) && CurrencyValueTagLabel.AA0(event.zu) && event.zu == 3 && event.nA0 == 1) {
            VU pokemon = tw0_0.rl.PC0.sF(this.IF.se);
            if (pokemon == null) {
                return super.nd0(event);
            }

            M moves = ec0_2.Sx().Com6();
            short species = pokemon.I8.ou0;
            Vt0 dialog = new Vt0();
            dz_0 editor = new dz_0(this, species, moves);
            editor.uf("editfield");
            editor.NR = true;
            editor.aO((text, position, previous) -> CurrencyValueTagLabel.O7(moves, text, position, previous));

            EB0 field = new EB0(editor);
            dialog.hx.add(field);
            field.UI = key -> CurrencyValueTagLabel.Dh(field, species, this.cs0, moves, key);
            UA.zd(dialog, this.Pt0[this.cs0]);
            return true;
        }
        return super.nd0(event);
    }

    private static boolean AA0(int value) {
        switch (value) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return false;
            default:
                throw null;
        }
    }
}
