package cn.pokemmo.net.packet;

import f.CH0;

public abstract class AbstractChannelMessageFilter {
    public final CH0 pu;

    public AbstractChannelMessageFilter(CH0 cH0) {
        this.pu = cH0;
    }

    public final CH0 ZK() {
        return this.pu;
    }

    public abstract String na0();
}
