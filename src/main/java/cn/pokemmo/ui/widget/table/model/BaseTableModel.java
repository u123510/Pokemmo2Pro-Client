package cn.pokemmo.ui.widget.table.model;

import f.bb_2;

/**
 * BaseTableModel - UI 复杂网格表格数据模型抽象基类
 * 封装通用行数、列数、表头名称、单元格值和提示信息获取，以及数据行变更事件通知。
 */
public abstract class BaseTableModel extends bb_2 {

    public int getRowCount() {
        return oK0();
    }

    public int getColumnCount() {
        return Zy();
    }

    public String getColumnName(int column) {
        return LPT7(column);
    }

    public Object getValueAt(int row, int column) {
        return RG0(row, column);
    }

    public Object getCellTooltip(int row, int column) {
        return fh0(row, column);
    }

    public void fireRowsInserted(int firstRow, int lastRow) {
        od0(firstRow, lastRow);
    }

    public void fireRowsRemoved(int firstRow, int lastRow) {
        fg0(firstRow, lastRow);
    }
}
