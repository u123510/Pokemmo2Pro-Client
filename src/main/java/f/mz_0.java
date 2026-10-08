package f;

import cn.pokemmo.io.filter.AndFileFilter;
import java.io.Serializable;
import java.util.ArrayList;

public final class mz_0 extends AndFileFilter implements iq_2, Serializable {
    private static final long serialVersionUID = 7215974688563965257L;
    public final ArrayList Vn0;

    public mz_0(ArrayList source) {
        super(source);
        this.Vn0 = this.filters;
    }
}
