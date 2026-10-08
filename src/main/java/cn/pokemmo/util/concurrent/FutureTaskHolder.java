package cn.pokemmo.util.concurrent;

import java.util.concurrent.Future;

public class FutureTaskHolder {
    public final Future p1;

    public FutureTaskHolder(Future future) {
        this.p1 = future;
    }
}
