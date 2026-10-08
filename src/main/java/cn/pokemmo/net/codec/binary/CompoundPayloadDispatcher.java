package cn.pokemmo.net.codec.binary;

import f.*;
import java.nio.ByteBuffer;

/**
 * 复合二进制载荷魔数分发中枢 (Compound Binary Payload Dispatcher)
 * 对应混淆类: f.aux__0
 */
public abstract class CompoundPayloadDispatcher {
    public static final dl_1 LOGGER = Cq0.E1(CompoundPayloadDispatcher.class);
    public static final dl_1 mS = LOGGER;

    public static aux__0 ey0(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int n = byteBuffer2.getInt(byteBuffer2.position());
        switch (n) {
            default: {
                LOGGER.info("unexpected magic: {}", (Object) n);
                return null;
            }
            case 810570818: {
                return ta0_0.Af0(byteBuffer);
            }
            case 809588290: {
                return bh_2.z6(byteBuffer);
            }
            case 809587778: {
                return DI0.Bw(byteBuffer);
            }
            case 809585986: {
                return cf_0.rK(byteBuffer);
            }
            case 809583426:
                break;
        }
        return ck_0.nU(byteBuffer);
    }

    public static aux__0 dispatch(ByteBuffer byteBuffer) {
        return ey0(byteBuffer);
    }
}
