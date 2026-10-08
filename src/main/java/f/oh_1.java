package f;

import cn.pokemmo.ui.widget.model.HierarchicalValueTreeNode;

public final class oh_1 extends HierarchicalValueTreeNode {
    public oh_1(Zh parent, String name, Object value) {
        super(parent, name, value);
    }

    @Override
    protected HierarchicalValueTreeNode createChildNode(Zh parent, String name, Object value) {
        return new oh_1(parent, name, value);
    }

    @Override
    public oh_1 ql0(String name, Object value) {
        return (oh_1) super.ql0(name, value);
    }
}
