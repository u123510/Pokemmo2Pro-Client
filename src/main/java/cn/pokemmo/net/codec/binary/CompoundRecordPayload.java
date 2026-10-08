package cn.pokemmo.net.codec.binary;

import f.*;
import java.nio.ByteBuffer;

/**
 * 记录型复合包载荷 (Compound Record Payload)
 * 对应混淆类: f.ta0_0
 */
public class CompoundRecordPayload extends aux__0 {
    public bw_1 xC0;
    public es_1 eI0;

    public CompoundRecordPayload() {
        super();
        this.eI0 = new es_1();
    }

    public static ta0_0 Af0(ByteBuffer buffer) {
        int start = buffer.position();
        ta0_0 result = new ta0_0();
        result.xC0 = new bw_1(buffer, 810570818);
        if (!result.xC0.lB) {
            return null;
        }
        for (int i = 0; i < result.xC0.RL; i++) {
            buffer.position(start + result.xC0.hF[i]);
            boolean valid = false;
            if (buffer.getInt() == 810828112) {
                buffer.getInt();
                valid = true;
            }
            if (!valid) {
                return null;
            }
            aux__1 records = new aux__1(buffer, B4::new, start + result.xC0.hF[i]);
            result.eI0 = records.Ks;
        }
        buffer.position(start + result.xC0.RQ);
        return result;
    }
}
