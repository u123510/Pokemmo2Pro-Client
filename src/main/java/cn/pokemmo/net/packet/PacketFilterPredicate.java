package cn.pokemmo.net.packet;

import f.mx0;

public interface PacketFilterPredicate {
    boolean accept(mx0 packet);

    default boolean my(mx0 var1) {
        return accept(var1);
    }
}
