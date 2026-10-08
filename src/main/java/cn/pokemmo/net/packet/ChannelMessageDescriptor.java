package cn.pokemmo.net.packet;

import f.CH0;

public class ChannelMessageDescriptor {
    public final CH0 COm1;
    public final String vx;
    public final int bI0;

    public ChannelMessageDescriptor(int n, CH0 cH0, String string) {
        this.COm1 = cH0;
        this.vx = string;
        this.bI0 = n;
    }
}
