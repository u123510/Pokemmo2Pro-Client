package cn.pokemmo.ui.widget.table.model;

import f.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.table.model.BaseTableModel;

import java.text.NumberFormat;

public class TournamentTableModel extends BaseTableModel {
    public final String[] uj;
    public final String[] mS;

    public TournamentTableModel(int[] ids, int[] counts, iz0_0[] types) {
        int length = ids.length + 1;
        this.uj = new String[length];
        this.mS = new String[length];
        for (int i = 0; i < ids.length; i++) {
            int count = counts[i];
            if (count <= 0) {
                this.uj[i] = "???";
            } else if (types[i] != null) {
                this.uj[i] = new StringBuilder(ids[i]).append(sm0_0.wa0(ids[i], types[i].vj0())).append(':').toString();
            } else {
                this.uj[i] = new StringBuilder(ids[i]).append(':').toString();
            }
            this.mS[i] = new StringBuilder(count > 0 ? "+" : "").append(count).toString();
        }
        int last = length - 1;
        this.uj[last] = sm0_0.c0(1726);
        this.mS[last] = NumberFormat.getInstance().format((long) java.util.stream.IntStream.of(counts).sum());
    }

    @Override public final int oK0() { return this.uj.length; }
    @Override public final int Zy() { return 2; }
    @Override public final String LPT7(int index) { return ""; }

    @Override
    public final Object RG0(int row, int column) {
        if (column == 0) return this.uj[row];
        if (column == 1) return this.mS[row];
        return "";
    }

    @Override public final Object fh0(int row, int column) { return ""; }
}
