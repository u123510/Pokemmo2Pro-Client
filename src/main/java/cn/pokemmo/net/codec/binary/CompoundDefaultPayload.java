package cn.pokemmo.net.codec.binary;

import f.*;
import java.nio.ByteBuffer;
import java.util.function.Supplier;

/**
 * 缺省复合包载荷 (Compound Default Payload)
 * 对应混淆类: f.ck_0
 */
public class CompoundDefaultPayload extends aux__0 {
    public static final dl_1 LOGGER = Cq0.E1(CompoundDefaultPayload.class);
    public static final dl_1 ln0 = LOGGER;
    public String zN;
    public aux__1 uy0;

    public static ck_0 nU(ByteBuffer var0) {
        int var1 = var0.position();
        if (var0.getInt() != 809583426) {
            LOGGER.getClass();
            return null;
        }
        var0.getShort();
        var0.getShort();
        int var2 = var0.getInt();
        if (var0.limit() < var2) {
            LOGGER.getClass();
            return null;
        }
        var0.getShort();
        int[] var3 = new int[var0.getShort()];
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = var0.getInt() + var1;
        }
        ck_0 var5 = new ck_0();
        int var6 = var0.getInt();
        var0.getInt();
        if (var6 != 810831434) {
            LOGGER.getClass();
        } else {
            Supplier var7 = ou0_0::new;
            var5.uy0 = new aux__1(var0, var7, var3[0]);
        }
        ou0_0 var8 = (ou0_0) (be0_1) var5.uy0.Ks.KI();
        if (var8 == null) {
            LOGGER.getClass();
            return null;
        }
        var5.zN = var8.QW;
        if (var5.uy0.Ks.KB != 1) {
            LOGGER.getClass();
        }
        return var5;
    }
}
