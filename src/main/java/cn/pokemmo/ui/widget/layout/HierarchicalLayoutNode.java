package cn.pokemmo.ui.widget.layout;

import f.*;

public class HierarchicalLayoutNode extends LC0 implements Jn0 {
    public final String Cr;
    public final ie_1 W70;
    public boolean pl0;
    public String BL0;

    public HierarchicalLayoutNode(R40 configuration, String name, xd0_2 parent) {
        super(configuration, parent);
        this.Cr = name;
        this.W70 = new ie_1();
    }

    public final Jn0 vn(String name, boolean required) {
        Jn0 result = (Jn0)this.W70.B20(name);
        if (result == null) {
            String prefix = this.BL0;
            if (prefix != null) {
                R40 configuration = this.Hy;
                configuration.getClass();
                if (!R40.JE0 && prefix.length() != 0 && !prefix.endsWith(".")) {
                    throw new AssertionError();
                }
                result = this.Hy.VB(prefix.concat(name), false, required);
                if (result == null || !((xd0_2)result).pl0) {
                    result = null;
                }
            }
        }
        if (result == null && required) {
            T8 context = (T8)T8.wD0.get();
            context.getClass();
            T8.l10.warning(new StringBuilder(name)
                    .insert(0, "Missing child theme \"")
                    .append("\" for \"")
                    .append(this.xp(0))
                    .append('"')
                    .toString());
        }
        return result;
    }

    public final StringBuilder xp(int length) {
        int capacity = this.Cr.length() + length;
        StringBuilder result;
        xd0_2 parent = this.gn0;
        if (parent != null) {
            result = parent.xp(capacity + 1);
            result.append('.');
        } else {
            result = new StringBuilder(capacity);
        }
        result.append(this.Cr);
        return result;
    }
}
