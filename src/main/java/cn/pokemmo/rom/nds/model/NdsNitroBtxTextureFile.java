package cn.pokemmo.rom.nds.model;

import f.Cq0;
import f.am_2;
import f.bw_1;
import f.dl_1;
import f.es_1;
import java.nio.ByteBuffer;

/**
 * NDS Nitro BTX0 材质纹理文件解析器 (NDS Nitro BTX0 Texture File)
 * <p>
 * 原始混淆类: {@code f.Er0}
 */
public class NdsNitroBtxTextureFile {
    public static final dl_1 r1 = Cq0.E1(NdsNitroBtxTextureFile.class);
    public final bw_1 Zb0;
    public final am_2 E10;
    public final es_1 Y3;

    public NdsNitroBtxTextureFile(ByteBuffer buffer) {
        this(buffer, false, false);
    }

    public NdsNitroBtxTextureFile(ByteBuffer buffer, boolean option, boolean direct) {
        if (direct) {
            this.Zb0 = null;
            this.Y3 = new es_1(1);
            this.E10 = new am_2(option, buffer);
            this.Y3.Ue0(this.E10);
            return;
        }

        bw_1 header = new bw_1(buffer, 811095106);
        this.Zb0 = header;
        if (!header.lB) {
            this.Y3 = null;
            this.E10 = null;
            r1.error("Not a valid BTX0 file");
            return;
        }

        this.Y3 = new es_1(header.RL);
        for (int i = 0; i < header.RL; ++i) {
            buffer.position(header.hF[i]);
            if (buffer.getInt() != 811091284) {
                r1.error("unknown block header");
            } else {
                buffer.position(buffer.position() - 4);
                this.Y3.Ue0(new am_2(option, buffer));
            }
        }
        this.E10 = (am_2) this.Y3.KI();
    }
}
