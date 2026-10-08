package cn.pokemmo.rom.nds.graphics;

import f.Ae;
import f.GF_;
import f.Rz0;
import f.To0;
import f.ft_1;
import f.in_1;
import f.xf_0;
import java.nio.ByteBuffer;

/**
 * NDS Nitro 2D 屏幕与图块资源 (Nitro Screen Resource)
 * <p>
 * 原始混淆类: {@code f.Gt0}
 */
public class NitroScreenResource extends xf_0 {
    public final Ae e5;
    public final int ai0;
    public final boolean Hi0;
    public Rz0 hF;
    public final To0 vk0 = new To0();
    public final GF_ ky = new GF_();
    public in_1 lL0;

    public NitroScreenResource(Ae source) {
        this(source, false);
    }

    public NitroScreenResource(Ae source, boolean flag) {
        this.e5 = source;
        this.ai0 = source.Vh0;
        this.Hi0 = flag;
        this.id0();
    }

    public final boolean yz(byte[] output, int sourceOffset, int length, int outputOffset) {
        int formatId = this.vk0.t5.Qb0;
        if (formatId == 3) {
            for (int i = 0; i < length; ++i) {
                output[outputOffset + i] = this.vk0.bo0[i];
            }
            return true;
        }
        if (formatId == 2) {
            for (int i = 0; i < length / 2; ++i) {
                int sourceIndex = sourceOffset / 2 + i;
                if (sourceIndex < this.vk0.bo0.length) {
                    byte value = this.vk0.bo0[sourceIndex];
                    int destination = i * 2 + outputOffset;
                    output[destination] = (byte) (value & 15);
                    output[destination + 1] = (byte) ((value >> 4) & 15);
                }
            }
            return true;
        }

        System.err.println("Unknown bit depth: " + this.vk0.t5.oJ0);
        return false;
    }

    public final void id0() {
        ByteBuffer buffer = this.e5.MH(this.Hi0);
        Rz0 header = new Rz0(buffer);
        this.hF = header;
        header.Kn(1313032018);

        byte[] identifier = new byte[4];
        buffer.get(identifier);
        buffer.getInt();
        this.vk0.qG = buffer.getShort();
        this.vk0.k20 = buffer.getShort();

        int formatId = buffer.getInt();
        ft_1 format = null;
        for (ft_1 candidate : ft_1.hM) {
            if (candidate.oJ0 == formatId) {
                format = candidate;
                break;
            }
        }
        this.vk0.t5 = format;
        this.vk0.pF = buffer.getInt();
        this.vk0.Vb = buffer.getInt();
        this.lL0 = (this.vk0.Vb & 255) == 0 ? in_1.J9 : in_1.fH;
        this.vk0.LY = buffer.getInt();
        buffer.getInt();
        this.vk0.bo0 = new byte[this.vk0.LY];
        buffer.get(this.vk0.bo0);

        if (this.vk0.k20 != -1) {
            this.LA = this.vk0.k20 * 8;
            this.v4 = this.vk0.qG * 8;
        } else {
            this.LA = 64;
            this.v4 = (short) (this.vk0.LY / 64);
        }

        if (this.hF.rv0 == 2 && buffer.position() < this.ai0) {
            byte[] extraIdentifier = new byte[4];
            buffer.get(extraIdentifier);
            buffer.getInt();
            buffer.getInt();
            buffer.getShort();
            buffer.getShort();
        }

        this.Zd0(this.vk0.bo0, this.LA, this.v4, this.vk0.t5, this.lL0);
    }
}
