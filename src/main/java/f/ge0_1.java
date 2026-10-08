package f;

import cn.pokemmo.net.packet.PacketFilterPredicate;
import f.mx0;

public interface ge0_1 extends PacketFilterPredicate {
    @Override
    boolean my(mx0 var1);

    @Override
    default boolean accept(mx0 packet) {
        return my(packet);
    }
}
