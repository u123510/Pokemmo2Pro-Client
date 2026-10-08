package cn.pokemmo.net.packet;

import f.cn0_0;
import f.mv_0;

public class NetworkChannelPropertyCommand extends mv_0 {
    public final cn0_0 uF;

    public NetworkChannelPropertyCommand(String string, String string2, cn0_0 cn0_02) {
        super(string, string2);
        this.el = 32;
        this.F80 = 0;
        this.HA = 1;
        this.uF = cn0_02;
    }
}
