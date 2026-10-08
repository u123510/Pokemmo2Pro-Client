package cn.pokemmo.graphics.model;

import f.*;
import java.nio.ByteBuffer;

public class KeyframeMeshAnimationTrack {
    public Rz0 Cj0;
    public am_2 QB;
    public int eu;
    public vt_0[] KV;

    public KeyframeMeshAnimationTrack() {
    }

    public static vt_0[] XB0(int limit, ByteBuffer buffer) {
        aux__1 parser = new aux__1(buffer, vt_0::new, limit);
        return (vt_0[]) parser.Ks.Mo0(vt_0.class);
    }

    public static KeyframeMeshAnimationTrack zn(ByteBuffer buffer) {
        KeyframeMeshAnimationTrack result = new ku_0();
        result.eu = buffer.position();
        result.Cj0 = new Rz0(buffer);
        result.Cj0.Kn(809782594);
        if (result.Cj0.kh0 > buffer.limit()) {
            throw new RuntimeException("filesize greater than buffer limit");
        }

        int blockCount = result.Cj0.rv0;
        int[] offsets = new int[blockCount];
        for (int index = 0; index < blockCount; ++index) {
            offsets[index] = buffer.getInt() + result.eu;
        }

        for (int index = 0; index < blockCount; ++index) {
            buffer.position(offsets[index]);
            int block = buffer.getInt();
            if (block == 810304589) {
                buffer.position(offsets[index] + 8);
                result.KV = XB0(offsets[index], buffer);
            } else if (block == 811091284) {
                buffer.position(offsets[index]);
                result.QB = new am_2(false, buffer);
            } else {
                throw new RuntimeException(yr_1.pG("Unknown block = ", block));
            }
        }
        return result;
    }

    static {
        Cq0.E1(KeyframeMeshAnimationTrack.class);
    }
}
