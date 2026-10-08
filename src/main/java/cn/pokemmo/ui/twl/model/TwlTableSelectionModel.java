package cn.pokemmo.ui.twl.model;

/**
 * 表格选择模型基类 (TableSelectionModel)
 */
public abstract class TwlTableSelectionModel {
    public int leadRow = -1;
    public int leadColumn = -1;

    public abstract void nE0(int row, int column);

    public abstract void ro(int row, int column);

    public abstract void fc0(int row, int column);

    public abstract void Ol(int row, int column);

    public abstract void cd();

    public abstract void J2(int row, int count);

    public abstract void MM(int row, int count);

    public abstract boolean iK0(int row);

    public int getLeadRow() {
        return this.leadRow;
    }

    public void setLeadRow(int leadRow) {
        this.leadRow = leadRow;
    }

    public int getLeadColumn() {
        return this.leadColumn;
    }

    public void setLeadColumn(int leadColumn) {
        this.leadColumn = leadColumn;
    }
}
