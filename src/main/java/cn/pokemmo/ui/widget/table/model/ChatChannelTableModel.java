package cn.pokemmo.ui.widget.table.model;

import f.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.table.model.BaseTableModel;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ChatChannelTableModel extends BaseTableModel {
    public final ArrayList<CI> dY;

    public ChatChannelTableModel() {
        this.dY = new ArrayList<>();
    }

    public final void xf0(CI value) {
        int index = this.dY.size();
        this.dY.add(index, value);
        this.od0(index, 1);
    }

    public final void Dm0(Consumer consumer) {
        for (CI value : this.dY) {
            consumer.accept(value);
        }
    }

    public final int oK0() {
        return this.dY.size();
    }

    public final Object RG0(int row, int column) {
        CI value = this.dY.get(row);
        if (column == 0) {
            return value.A5;
        }
        if (column == 1) {
            return Integer.valueOf(value.II0);
        }
        if (column == 2) {
            return Integer.valueOf(value.ev);
        }
        throw new IllegalArgumentException();
    }

    public final int Zy() {
        return 3;
    }

    public final String LPT7(int column) {
        if (column == 0) {
            return "Type";
        }
        if (column == 1) {
            return "Primary";
        }
        if (column == 2) {
            return "Secondary";
        }
        throw new IllegalArgumentException();
    }
}
