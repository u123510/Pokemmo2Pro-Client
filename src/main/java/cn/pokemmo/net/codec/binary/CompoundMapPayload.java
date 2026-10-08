package cn.pokemmo.net.codec.binary;

import f.*;
import java.nio.ByteBuffer;
import java.util.function.Supplier;

/**
 * 地图资源型复合包载荷 (Compound Map Payload)
 * 对应混淆类: f.DI0
 */
public class CompoundMapPayload extends aux__0 {
    public bw_1 kX;
    public es_1 ob;

    public static DI0 Bw(ByteBuffer byteBuffer) {
        int start = byteBuffer.position();
        DI0 result = new DI0();
        result.kX = new bw_1(byteBuffer, 809587778);
        if (!result.kX.lB) {
            return null;
        }
        for (int i = 0; i < result.kX.RL; ++i) {
            byteBuffer.position(start + result.kX.hF[i]);
            if (byteBuffer.getInt() != 810832467) {
                return null;
            }
            byteBuffer.getInt();
            Supplier<sq_2> supplier = sq_2::new;
            result.ob = new aux__1(byteBuffer, supplier, start + result.kX.hF[i]).Ks;
        }
        byteBuffer.position(start + result.kX.RQ);
        return result;
    }
}
