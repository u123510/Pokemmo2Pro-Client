package cn.pokemmo.net.packet;

import f.CH0;
import f.Cq0;
import java.util.ArrayList;

public class ChannelMessageTagHolder {
    public final CH0 EO;
    public final short Dk0;
    public final ArrayList XW;

    static {
        Cq0.E1(ChannelMessageTagHolder.class);
    }

    public ChannelMessageTagHolder(CH0 ch0, short s) {
        this.XW = new ArrayList();
        this.EO = ch0;
        this.Dk0 = s;
    }

    public boolean nG0(short s) {
        return (this.Dk0 & s) != 0;
    }
}
