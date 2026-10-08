/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.compress;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.glutils.ETC1;
import com.badlogic.gdx.utils.BufferUtils;
import f.Dn0;
import f.KT;
import f.LW;
import f.fy0_0;
import f.nf_1;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;

/*
 * Renamed from f.ay
 */
public class GzipByteInputStream
implements fy0_0 {
    public final int o5;
    public final int tx;
    public final ByteBuffer f;
    public final int jY;

    public GzipByteInputStream(int n, int n2, ByteBuffer byteBuffer, int n3) {
        this.o5 = n;
        this.tx = n2;
        this.f = byteBuffer;
        this.jY = n3;
        this.YZ();
    }

    public GzipByteInputStream(Dn0 source) {
        DataInputStream input = null;
        try {
            input = new DataInputStream(new BufferedInputStream(new GZIPInputStream(source.uf0())));
            byte[] buffer = new byte[10240];
            this.f = BufferUtils.qw0(input.readInt());
            int count;
            while ((count = input.read(buffer)) != -1) {
                this.f.put(buffer, 0, count);
            }
            this.f.position(0);
            this.f.limit(this.f.capacity());
            KT.E1(input);
            this.o5 = ETC1.getWidthPKM(this.f, 0);
            this.tx = ETC1.getHeightPKM(this.f, 0);
            this.jY = 16;
            this.f.position(16);
            this.YZ();
        } catch (Exception exception) {
            KT.E1(input);
            throw new nf_1("Couldn't load pkm file '" + source + "'", exception);
        }
    }

    @Override
    public final void dispose() {
        BufferUtils.t7(this.f);
    }

    public final String toString() {
        if (this.jY == 16) {
            StringBuilder stringBuilder2 = new StringBuilder();
            String string = ETC1.isValidPKM(this.f, 0) ? "valid" : "invalid";
            return stringBuilder2.append(string).append(" pkm [").append(ETC1.getWidthPKM(this.f, 0)).append("x").append(ETC1.getHeightPKM(this.f, 0)).append("], compressed: ").append(this.f.capacity() - 16).toString();
        }
        return "raw [" + this.o5 + "x" + this.tx + "], compressed: " + (this.f.capacity() - 16);
    }

    public final void YZ() {
        if (!LW.eh(this.o5) || !LW.eh(this.tx)) {
            System.out.println("ETC1Data warning: non-power-of-two ETC1 textures may crash the driver of PowerVR GPUs");
        }
    }
}
