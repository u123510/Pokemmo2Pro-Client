package cn.pokemmo.ui.widget.grid;

import f.*;

public class GridCellLayoutTracker {
    public final int lPt8;
    public final CF AV;
    public final as_0[] FC0;

    public GridCellLayoutTracker(int size, CF owner) {
        this.lPt8 = Math.min(8, Math.max(1, size));
        this.AV = owner;
        this.FC0 = new as_0[25];
        for (int index = 0; index < this.FC0.length; index++) {
            this.FC0[index] = new as_0();
        }
        ld_0 random = new ld_0();
        int[] layout = (int[]) rg0_2.G30(t50_0.LPT7[size - 1]);
        for (int group = 0; group < 3; group++) {
            for (int index = 0; index < layout[group]; index++) {
                int cell;
                do {
                    cell = rg0_2.r4(25);
                } while (!random.Vn(cell));
                this.FC0[cell].Rl0 = (group + 2) % 4;
            }
        }
        int ignored = layout[3];
    }

    public final as_0 IU(int row, int column) {
        return this.FC0[row * 5 + column];
    }

    public final int HV() {
        int count = 0;
        for (as_0 cell : this.FC0) {
            if (cell.UN && cell.Rl0 > 0) {
                count++;
            }
        }
        return count;
    }

    public final int UK() {
        int product = 0;
        for (as_0 cell : this.FC0) {
            if (cell.UN && cell.Rl0 > 0) {
                product = product == 0 ? cell.Rl0 : product * cell.Rl0;
            }
        }
        return product;
    }

    public final boolean Oq0() {
        for (as_0 cell : this.FC0) {
            if (!cell.UN && cell.Rl0 > 1) {
                return false;
            }
        }
        return true;
    }

    public final boolean KG0() {
        for (as_0 cell : this.FC0) {
            if (cell.UN && cell.Rl0 == 0) {
                return true;
            }
        }
        return this.Oq0();
    }

    public final void WY(int row, int column) {
        if (this.KG0()) {
            return;
        }
        this.IU(row, column).UN = true;
        if (this.Oq0()) {
            byte level = (byte) this.lPt8;
            short score = (short) this.UK();
            tw0_0.rl.fk0.uQ(new Si0(GI0.Xd0, level, score));
            int current = this.AV.l10;
            int target = this.AV.PK;
            if (this.AV.J9.Oq0()) {
                if (this.AV.J9.HV() + 1 <= 7 && target + 1 <= 4) {
                    if (current < 8) {
                        current++;
                    }
                } else {
                    tw0_0.rl.Kv0(GI0.Xd0, (byte) -8);
                }
            } else {
                current = Math.max(1, Math.min(this.AV.J9.HV(), current));
            }
            if (current == 8) {
                tw0_0.rl.Kv0(GI0.Xd0, (byte) -8);
            }
        } else if (this.AV.tw.fy()) {
            tw0_0.rl.Kv0(GI0.Xd0, (byte) -9);
        }
    }
}
