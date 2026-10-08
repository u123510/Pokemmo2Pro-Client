package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayList;

public class BaseSelectionMenuComponent extends BaseComponent {
    public final A40 gg0;
    public boolean NB;
    public boolean LJ0;
    public boolean NUL;

    public BaseSelectionMenuComponent() {
        this(new A40());
    }

    public BaseSelectionMenuComponent(A40 v1) {
        super();
        this.gg0 = v1;
        v1.Fp0(this);
        uf("");
    }

    public final void SL(le0_2 v1) {
        Xf0(v1);
    }

    public j1_0 Xf0(le0_2 v1) {
        return this.gg0.vx0(v1);
    }

    public final j1_0 Nu() {
        return this.gg0.Rg();
    }

    public final j1_0 uw() {
        return this.gg0.FU;
    }

    @Override
    public void K8() {
        A40 layout = this.gg0;
        BaseSelectionMenuComponent table = (BaseSelectionMenuComponent) layout.Op;
        float x = (float) table.A20;
        float y = (float) table.SB0;
        float width = (float) table.Mx;
        float height = (float) table.OB;
        h20_0 toolkit = layout.eE0;
        ArrayList cells = layout.yK0;
        if (layout.wc0) {
            layout.Gc0();
        }
        float padLeftRight = layout.a9(layout.bL0) + layout.a9(layout.ts0);
        float padTopBottom = layout.kI0(layout.Xf0) + layout.kI0(layout.gr0);
        float totalWeightX = 0.0f;
        float totalWeightY = 0.0f;
        for (int i = 0; i < layout.B8; i++) {
            totalWeightX += layout.W8[i];
        }
        for (int i = 0; i < layout.SB; i++) {
            totalWeightY += layout.PG[i];
        }
        float[] columnWidth;
        float totalPrefWidth = layout.Zo - layout.D60;
        if (totalPrefWidth == 0.0f) {
            columnWidth = layout.HA;
        } else {
            float extraWidth = Math.min(totalPrefWidth, Math.max(0.0f, width - layout.D60));
            float[] newColWidth = bk_2.El0(layout.B8, layout.WC0);
            layout.WC0 = newColWidth;
            for (int i = 0; i < layout.B8; i++) {
                float min = layout.HA[i];
                newColWidth[i] = min + (layout.cl[i] - min) / totalPrefWidth * extraWidth;
            }
            columnWidth = newColWidth;
        }
        float[] rowHeight;
        float totalPrefHeight = layout.DC0 - layout.zN;
        if (totalPrefHeight == 0.0f) {
            rowHeight = layout.oF0;
        } else {
            float[] newRowHeight = bk_2.El0(layout.SB, layout.ET);
            layout.ET = newRowHeight;
            float extraHeight = Math.min(totalPrefHeight, Math.max(0.0f, height - layout.zN));
            for (int i = 0; i < layout.SB; i++) {
                float min = layout.oF0[i];
                newRowHeight[i] = min + (layout.FO[i] - min) / totalPrefHeight * extraHeight;
            }
            rowHeight = newRowHeight;
        }
        int cellCount = cells.size();
        for (int i = 0; i < cellCount; i++) {
            j1_0 cell = (j1_0) cells.get(i);
            if (cell.zw.booleanValue()) {
                continue;
            }
            float spannedWidth = 0.0f;
            int col = cell.Fu0;
            int colEnd = col + cell.d80.intValue();
            for (int c = col; c < colEnd; c++) {
                spannedWidth += columnWidth[c];
            }
            float spannedHeight = rowHeight[cell.pr];
            float prefW = bk_2.L10(cell.Mu, cell);
            float prefH = bk_2.i2(cell.CoM5, cell);
            float minW = bk_2.L10(cell.sn0, cell);
            float minH = bk_2.i2(cell.jQ, cell);
            float maxW = bk_2.L10(cell.Nk0, cell);
            float maxH = bk_2.i2(cell.xK, cell);
            if (prefW < minW) prefW = minW;
            if (prefH < minH) prefH = minH;
            if (maxW > 0.0f && prefW > maxW) prefW = maxW;
            if (maxH > 0.0f && prefH > maxH) prefH = maxH;
            cell.Zd = Math.min(spannedWidth - cell.KW - cell.Yw, prefW);
            cell.h50 = Math.min(spannedHeight - cell.hB0 - cell.Hd, prefH);
            if (cell.d80.intValue() == 1) {
                layout.ub0[cell.Fu0] = Math.max(layout.ub0[cell.Fu0], spannedWidth);
            }
            layout.gf0[cell.pr] = Math.max(layout.gf0[cell.pr], spannedHeight);
        }
        if (totalWeightX > 0.0f) {
            float remainingWidth = width - padLeftRight;
            for (int i = 0; i < layout.B8; i++) {
                remainingWidth -= layout.ub0[i];
            }
            float currentAlloc = 0.0f;
            int lastWeightedCol = 0;
            for (int i = 0; i < layout.B8; i++) {
                float weight = layout.W8[i];
                if (weight != 0.0f) {
                    float add = (remainingWidth * weight) / totalWeightX;
                    currentAlloc += add;
                    layout.ub0[i] += add;
                    lastWeightedCol = i;
                }
            }
            layout.ub0[lastWeightedCol] += remainingWidth - currentAlloc;
        }
        if (totalWeightY > 0.0f) {
            float remainingHeight = height - padTopBottom;
            for (int i = 0; i < layout.SB; i++) {
                remainingHeight -= layout.gf0[i];
            }
            float currentAlloc = 0.0f;
            int lastWeightedRow = 0;
            for (int i = 0; i < layout.SB; i++) {
                float weight = layout.PG[i];
                if (weight != 0.0f) {
                    float add = (remainingHeight * weight) / totalWeightY;
                    currentAlloc += add;
                    layout.gf0[i] += add;
                    lastWeightedRow = i;
                }
            }
            layout.gf0[lastWeightedRow] += remainingHeight - currentAlloc;
        }
        for (int i = 0; i < cellCount; i++) {
            j1_0 cell = (j1_0) cells.get(i);
            if (cell.zw.booleanValue() || cell.d80.intValue() == 1) {
                continue;
            }
            float spannedDiff = 0.0f;
            int col = cell.Fu0;
            int colEnd = col + cell.d80.intValue();
            for (int c = col; c < colEnd; c++) {
                spannedDiff += columnWidth[c] - layout.ub0[c];
            }
            spannedDiff = (spannedDiff - Math.max(0.0f, cell.KW + cell.Yw)) / (float) cell.d80.intValue();
            if (spannedDiff > 0.0f) {
                for (int c = cell.Fu0; c < colEnd; c++) {
                    layout.ub0[c] += spannedDiff;
                }
            }
        }
        float totalWidth = padLeftRight;
        for (int i = 0; i < layout.B8; i++) {
            totalWidth += layout.ub0[i];
        }
        float totalHeight = padTopBottom;
        for (int i = 0; i < layout.SB; i++) {
            totalHeight += layout.gf0[i];
        }
        float startX = x + layout.a9(layout.bL0);
        if ((layout.MP & 16) != 0) {
            startX += width - totalWidth;
        } else if ((layout.MP & 8) == 0) {
            startX += (width - totalWidth) / 2.0f;
        }
        float startY = y + layout.kI0(layout.Xf0);
        if ((layout.MP & 4) != 0) {
            startY += height - totalHeight;
        } else if ((layout.MP & 2) == 0) {
            startY += (height - totalHeight) / 2.0f;
        }
        float cellX = startX;
        float cellY = startY;
        for (int i = 0; i < cellCount; i++) {
            j1_0 cell = (j1_0) cells.get(i);
            if (cell.zw.booleanValue()) {
                continue;
            }
            float colWidth = 0.0f;
            int col = cell.Fu0;
            int colEnd = col + cell.d80.intValue();
            for (int c = col; c < colEnd; c++) {
                colWidth += layout.ub0[c];
            }
            float cellAvailWidth = colWidth - cell.KW - cell.Yw;
            cellX += cell.KW;
            if (cell.rs0.floatValue() > 0.0f) {
                cell.Zd = Math.max(cell.rs0.floatValue() * cellAvailWidth, bk_2.i2(cell.sn0, cell));
                float max = bk_2.L10(cell.Nk0, cell);
                if (max > 0.0f) {
                    cell.Zd = Math.min(cell.Zd, max);
                }
            }
            if (cell.LPt7.floatValue() > 0.0f) {
                cell.h50 = Math.max(layout.gf0[cell.pr] * cell.LPt7.floatValue() - cell.hB0 - cell.Hd, bk_2.i2(cell.jQ, cell));
                float max = bk_2.i2(cell.xK, cell);
                if (max > 0.0f) {
                    cell.h50 = Math.min(cell.h50, max);
                }
            }
            int align = cell.mA.intValue();
            if ((align & 8) != 0) {
                cell.Ne = cellX;
            } else if ((align & 16) != 0) {
                cell.Ne = cellX + cellAvailWidth - cell.Zd;
            } else {
                cell.Ne = cellX + (cellAvailWidth - cell.Zd) / 2.0f;
            }
            if ((align & 2) != 0) {
                cell.Yg0 = cellY + cell.hB0;
            } else if ((align & 4) != 0) {
                cell.Yg0 = cellY + layout.gf0[cell.pr] - cell.h50 - cell.Hd;
            } else {
                cell.Yg0 = cellY + (layout.gf0[cell.pr] - cell.h50 + cell.hB0 - cell.Hd) / 2.0f;
            }
            if (cell.Hs) {
                cellY += layout.gf0[cell.pr];
                cellX = startX;
            } else {
                cellX += cellAvailWidth + cell.Yw;
            }
        }
        if (layout.lpT7 != 1) {
            toolkit.S50(layout);
            if (layout.lpT7 == 3 || layout.lpT7 == 2) {
                toolkit.EE0(layout, 3, x, y, width, height);
                toolkit.EE0(layout, 3, startX, startY, totalWidth - padLeftRight, totalHeight - padTopBottom);
            }
            float debugCellX = startX;
            for (int i = 0; i < cellCount; i++) {
                j1_0 cell = (j1_0) cells.get(i);
                if (cell.zw.booleanValue()) {
                    continue;
                }
                if (layout.lpT7 == 5 || layout.lpT7 == 2) {
                    toolkit.EE0(layout, 5, cell.Ne, cell.Yg0, cell.Zd, cell.h50);
                }
                float colWidth = 0.0f;
                int col = cell.Fu0;
                int colEnd = col + cell.d80.intValue();
                for (int c = col; c < colEnd; c++) {
                    colWidth += layout.ub0[c];
                }
                float cellAvailWidth = colWidth - cell.KW - cell.Yw;
                debugCellX += cell.KW;
                if (layout.lpT7 == 4 || layout.lpT7 == 2) {
                    toolkit.EE0(layout, 4, debugCellX, startY + cell.hB0, cellAvailWidth, layout.gf0[cell.pr] - cell.hB0 - cell.Hd);
                }
                if (cell.Hs) {
                    startY += layout.gf0[cell.pr];
                    debugCellX = startX;
                } else {
                    debugCellX += cellAvailWidth + cell.Yw;
                }
            }
        }
        for (int i = 0; i < cellCount; i++) {
            j1_0 cell = (j1_0) cells.get(i);
            if (cell.zw != null && cell.zw.booleanValue()) {
                continue;
            }
            le0_2 widget = (le0_2) cell.kh0;
            if (widget != null) {
                widget.sy((int) cell.Ne, (int) cell.Yg0);
                widget.oY((int) cell.Zd, (int) cell.h50);
            }
        }
    }

    @Override
    public final int R1() {
        if (this.gg0.wc0) {
            this.gg0.Gc0();
        }
        return (int) this.gg0.D60;
    }

    @Override
    public final int Se() {
        if (this.gg0.wc0) {
            this.gg0.Gc0();
        }
        return (int) this.gg0.zN;
    }

    @Override
    public final int m0() {
        if (this.NB) {
            return this.K20.Mx;
        }
        if (this.gg0.wc0) {
            this.gg0.Gc0();
        }
        return (int) this.gg0.Zo;
    }

    @Override
    public final int rm0() {
        if (this.LJ0) {
            return this.K20.OB;
        }
        if (this.gg0.wc0) {
            this.gg0.Gc0();
        }
        return (int) this.gg0.DC0;
    }

    @Override
    public final void COm3() {
        super.COm3();
        this.gg0.wc0 = true;
    }

    public final void N00(zk0_1 v1) {
        this.gg0.lpT7 = 1;
        this.gg0.eE0.S50(this.gg0);
    }

    public final void mz0() {
        this.NB = true;
        this.LJ0 = true;
    }

    @Override
    public boolean nd0(i70_0 v1) {
        if (this.NUL && E00.ZU(v1.zu) && v1.iT()) {
            int key = v1.finally$;
            rp_0 i90 = rp_0.I90;
            int dummy = dw_2.ff;
            if (i90 != null && i90.Ov(key)) {
                Uz(-1, true);
                return true;
            }
            rp_0 ni = rp_0.Ni;
            if (ni != null && ni.Ov(key)) {
                Uz(1, true);
                return true;
            }
        }
        return super.nd0(v1);
    }
}
