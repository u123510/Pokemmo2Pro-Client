package cn.pokemmo.collection.iterable;

import f.W1;
import f.y60_0;
import java.util.Iterator;

public class IdentityMapIterable implements Iterable {
    public final y60_0 XH0;
    public final boolean I90;
    public W1 kl;
    public W1 RH;

    public IdentityMapIterable(y60_0 y60_02) {
        this(y60_02, true);
    }

    public IdentityMapIterable(y60_0 y60_02, boolean bl) {
        this.XH0 = y60_02;
        this.I90 = bl;
    }

    @Override
    public Iterator iterator() {
        W1 w1;
        if (this.kl == null) {
            this.kl = new W1(this.XH0, this.I90);
            this.RH = new W1(this.XH0, this.I90);
        }
        w1 = this.kl;
        if (!w1.mo0) {
            W1 w14 = w1;
            w14.Mu = 0;
            w14.mo0 = true;
            this.RH.mo0 = false;
            return w1;
        }
        this.RH.Mu = 0;
        this.RH.mo0 = true;
        w1.mo0 = false;
        return this.RH;
    }
}
