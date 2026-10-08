package f;

import cn.pokemmo.io.filter.IOFileFilter;
import cn.pokemmo.io.filter.NotFileFilter;
import java.io.Serializable;

public final class ud0_2 extends NotFileFilter implements iq_2, Serializable {
    private static final long serialVersionUID = 6131563330944994230L;
    public final iq_2 jT;

    public ud0_2(iq_2 filter) {
        super(filter);
        this.jT = filter;
    }
}
