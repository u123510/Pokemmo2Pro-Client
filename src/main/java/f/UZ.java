package f;

import cn.pokemmo.ui.widget.tree.TreeSelectionModel;
import java.util.ArrayList;

/**
 * 兼容垫片 (Shim) - 树形组件多选节点选择模型 (Tree Selection Model)
 * 实际实现已迁移至 {@link TreeSelectionModel}
 */
public final class UZ extends TreeSelectionModel {
    public UZ(ArrayList object) { super(object); }
}
