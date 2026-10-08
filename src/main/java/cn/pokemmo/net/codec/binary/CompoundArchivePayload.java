package cn.pokemmo.net.codec.binary;

import f.*;
import java.nio.ByteBuffer;

/**
 * 资源归档型复合包载荷 (Compound Archive Payload)
 * 对应混淆类: f.bh_2
 */
public class CompoundArchivePayload extends aux__0 {
    public bw_1 B7;

    public static bh_2 z6(ByteBuffer input) {
        int start = input.position();
        bh_2 result = new bh_2();
        result.B7 = new bw_1(input, 809588290);
        if (!result.B7.lB) {
            return null;
        }
        for (int index = 0; index < result.B7.RL; ++index) {
            input.position(start + result.B7.hF[index]);
            boolean valid = false;
            if (input.getInt() == 810764630) {
                input.getInt();
                valid = true;
            }
            if (!valid) {
                return null;
            }
            new aux__1(input, AQ::new, start + result.B7.hF[index]);
        }
        return result;
    }
}
