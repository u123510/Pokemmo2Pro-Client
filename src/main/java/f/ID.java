package f;

import cn.pokemmo.io.filter.WildcardFileFilter;
import java.io.Serializable;

public final class ID extends WildcardFileFilter implements iq_2, Serializable {
    private static final long serialVersionUID = 176844364689077340L;
    public final String[] WN;
    public final uj0_0 Zj0;

    public ID(String value) {
        super(value);
        this.WN = this.names;
        this.Zj0 = this.caseSensitivity;
    }
}
