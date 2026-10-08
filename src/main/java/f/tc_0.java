package f;

import cn.pokemmo.io.filter.SuffixFileFilter;
import java.io.Serializable;

public final class tc_0 extends SuffixFileFilter implements iq_2, Serializable {
    private static final long serialVersionUID = -3389157631240246157L;
    public final String[] e40;
    public final uj0_0 an;

    public tc_0(String[] suffixes) {
        super(suffixes);
        this.e40 = this.suffixes;
        this.an = this.caseSensitivity;
    }
}
