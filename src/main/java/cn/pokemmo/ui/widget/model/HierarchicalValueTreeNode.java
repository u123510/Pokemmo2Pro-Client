package cn.pokemmo.ui.widget.model;

import f.BV;
import f.Zh;
import java.util.ArrayList;

public class HierarchicalValueTreeNode extends BV {
    public final Object lO;
    public final Object uu;

    public HierarchicalValueTreeNode(Zh parent, String name, Object value) {
        super(parent);
        this.lO = name;
        this.uu = value;
        this.Dq(true);
    }

    @Override
    public Object Tb(int index) {
        return index == 0 ? this.lO : this.uu;
    }

    protected HierarchicalValueTreeNode createChildNode(Zh parent, String name, Object value) {
        return new HierarchicalValueTreeNode(parent, name, value);
    }

    public HierarchicalValueTreeNode ql0(String name, Object value) {
        HierarchicalValueTreeNode child = createChildNode(this, name, value);
        int index = this.cx();
        if (BV.class.desiredAssertionStatus() && this.Fi(child) >= 0) {
            throw new AssertionError();
        }
        if (BV.class.desiredAssertionStatus() && child.ge0 != this) {
            throw new AssertionError();
        }
        if (this.CA == null) {
            this.CA = new ArrayList();
        }
        this.CA.add(index, child);
        child.Au0().q1(index, this);
        this.Dq(false);
        return child;
    }
}
