package cn.pokemmo.ui.widget.tree;

import f.bb_2;
import f.er_0;

/**
 * BaseTreeModel - UI 树状视图与层级列表模型抽象基类
 * 封装树状节点展开/折叠、选中管理以及与底层表格数据模型 (BaseTableModel) 的双向绑定。
 */
public abstract class BaseTreeModel extends er_0 {

    public BaseTreeModel() {
        super();
    }

    public BaseTreeModel(bb_2 source) {
        super(source);
    }
}
