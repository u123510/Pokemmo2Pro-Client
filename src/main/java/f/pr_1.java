package f;

import cn.pokemmo.graphics.material.attribute.IntAttribute;

public class pr_1 extends IntAttribute {
    public pr_1(long l) {
        super(l);
    }

    public pr_1(long l, int n) {
        super(l, n);
    }

    public pr_1(IntAttribute other) {
        super(other.yO, other.ps);
    }

    @Override
    public hf_1 pD0() {
        return new pr_1(this.yO, this.ps);
    }
}
