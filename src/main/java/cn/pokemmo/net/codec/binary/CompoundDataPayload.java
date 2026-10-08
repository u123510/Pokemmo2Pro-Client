package cn.pokemmo.net.codec.binary;

import f.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.function.Supplier;

/**
 * 二进制流型复合包载荷 (Compound Data Payload)
 * 对应混淆类: f.cf_0
 */
public class CompoundDataPayload extends aux__0 {
    public bw_1 Ba;
    public es_1 JR;

    public static cf_0 rK(ByteBuffer var0) {
        int var1 = var0.position();
        cf_0 var2 = new cf_0();
        bw_1 var3 = new bw_1(var0, 809585986);
        var2.Ba = var3;
        if (!var3.lB) {
            return null;
        }

        int var6 = 0;

        while (true) {
            bw_1 var4 = var2.Ba;
            if (var6 >= var2.Ba.RL) {
                return var2;
            }

            ((Buffer) var0).position(var1 + var4.hF[var6]);
            int var7 = 810828109;
            boolean var5 = false;
            if (var0.getInt() == var7) {
                var0.getInt();
                var5 = true;
            }

            if (!var5) {
                return null;
            }

            Supplier var8 = Ar::new;
            var2.JR = (new aux__1(var0, var8, var1 + var2.Ba.hF[var6])).Ks;
            var6++;
        }
    }
}
