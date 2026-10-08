package cn.pokemmo.graphics.gdx.texture;

import f.*;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.glutils.ETC1;
import com.badlogic.gdx.utils.BufferUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.zip.GZIPInputStream;
import org.lwjgl.glfw.GLFW;

/**
 * LibGDX KTX 压缩纹理数据加载器 (Khronos KTX / ZKTX Texture Data Loader)
 * <p>
 * 对应原始混淆类: f.R10
 * 职责:
 * 1. 解析 .ktx 与 GZIP 压缩的 .zktx 纹理文件格式与头信息 (KTX Header / Mipmaps / Faces)；
 * 2. 调度 OpenGL 上传压缩纹理数据 (glCompressedTexImage2D / ETC1 回退软解码)。
 */
public class GdxKtxTextureData implements E9, jp0_0 {
    public final Dn0 Wm;
    public int CF0;
    public int V0;
    public int OA0;
    public int gG = -1;
    public int qL = -1;
    public int rA0 = -1;
    public int Ij;
    public int cS;
    public int Wg0;
    public int O10;
    public ByteBuffer Fg;
    public boolean cD;

    public GdxKtxTextureData(Dn0 dn0, boolean bl) {
        this.Wm = dn0;
        this.cD = bl;
    }

    @Override
    public final ed_2 getType() {
        return ed_2.k4;
    }

    @Override
    public final boolean xZ() {
        return this.Fg != null;
    }

    @Override
    public final void Dx0() {
        if (this.Fg != null) {
            throw new nf_1("Already prepared");
        }
        if (this.Wm == null) {
            throw new nf_1("Need a file to load from");
        }
        if (this.Wm.o30().endsWith(".zktx")) {
            DataInputStream input = null;
            try {
                input = new DataInputStream(new BufferedInputStream(new GZIPInputStream(this.Wm.uf0())));
                byte[] buffer = new byte[10240];
                this.Fg = BufferUtils.qw0(input.readInt());
                int length;
                while ((length = input.read(buffer)) != -1) {
                    this.Fg.put(buffer, 0, length);
                }
                this.Fg.position(0);
                this.Fg.limit(this.Fg.capacity());
            } catch (Exception e) {
                throw new nf_1("Couldn't load zktx file '" + this.Wm + "'", e);
            } finally {
                KT.E1(input);
            }
        } else {
            this.Fg = ByteBuffer.wrap(this.Wm.kI0());
        }
        if (this.Fg.get() != -85 || this.Fg.get() != 75 || this.Fg.get() != 84 || this.Fg.get() != 88
                || this.Fg.get() != 32 || this.Fg.get() != 49 || this.Fg.get() != 49 || this.Fg.get() != -69
                || this.Fg.get() != 13 || this.Fg.get() != 10 || this.Fg.get() != 26 || this.Fg.get() != 10) {
            throw new nf_1("Invalid KTX Header");
        }
        int endianness = this.Fg.getInt();
        if (endianness != 67305985 && endianness != 16909060) {
            throw new nf_1("Invalid KTX Header");
        }
        if (endianness != 67305985) {
            ByteOrder order = ByteOrder.BIG_ENDIAN;
            if (this.Fg.order() == order) {
                order = ByteOrder.LITTLE_ENDIAN;
            }
            this.Fg.order(order);
        }
        this.CF0 = this.Fg.getInt();
        this.Fg.getInt();
        this.V0 = this.Fg.getInt();
        this.OA0 = this.Fg.getInt();
        this.Fg.getInt();
        this.gG = this.Fg.getInt();
        this.qL = this.Fg.getInt();
        this.rA0 = this.Fg.getInt();
        this.Ij = this.Fg.getInt();
        this.cS = this.Fg.getInt();
        this.Wg0 = this.Fg.getInt();
        if (this.Wg0 == 0) {
            this.Wg0 = 1;
            this.cD = true;
        }
        this.O10 = this.Fg.position() + this.Fg.getInt();
        if (!this.Fg.isDirect()) {
            int end = this.O10;
            for (int level = 0; level < this.Wg0; ++level) {
                end = si0_0.Fz((this.Fg.getInt(end) + 3) & -4, this.cS, 4, end);
            }
            this.Fg.limit(end);
            this.Fg.position(0);
            ByteBuffer direct = BufferUtils.qw0(end);
            direct.order(this.Fg.order());
            direct.put(this.Fg);
            this.Fg = direct;
        }
    }

    @Override
    public final void Ww() {
        this.wJ(34067);
    }

    @Override
    public final void wJ(int n) {
        ByteBuffer byteBuffer;
        int n2;
        if (this.Fg == null) throw new nf_1("Call prepare() before calling consumeCompressedData()");
        IntBuffer intBuffer = BufferUtils.yD0(16);
        boolean bl = false;
        int n3 = this.CF0;
        if (n3 == 0 || this.V0 == 0) {
            if (n3 + this.V0 != 0) throw new nf_1("either both or none of glType, glFormat must be zero");
            bl = true;
        }
        n3 = 1;
        int n4 = 4660;
        if (this.qL > 0) {
            n3 = 2;
            n4 = 3553;
        }
        if (this.rA0 > 0) {
            n3 = 3;
            n4 = 4660;
        }
        if ((n2 = this.cS) == 6) {
            if (n3 != 2) throw new nf_1("cube map needs 2D faces");
            n4 = 34067;
        } else if (n2 != 1) throw new nf_1("numberOfFaces must be either 1 or 6");
        if (this.Ij > 0) {
            if (n4 != 4660 && n4 != 3553) throw new nf_1("No API for 3D and cube arrays yet");
            n4 = 4660;
            ++n3;
        }
        if (n4 == 4660) throw new nf_1("Unsupported texture format (only 2D texture are supported in LibGdx for the time being)");
        int n5 = -1;
        if (n2 == 6 && n != 34067) {
            if (34069 > n || n > 34074) throw new nf_1("You must specify either GL_TEXTURE_CUBE_MAP to bind all 6 faces of the cube or the requested face GL_TEXTURE_CUBE_MAP_POSITIVE_X and followings.");
            n5 = n - 34069;
            n = 34069;
        } else if (n2 == 6 && n == 34067) {
            n = 34069;
        } else if (n != n4 && (34069 > n || n > 34074 || n != 3553)) {
            throw new nf_1("Invalid target requested : 0x" + Integer.toHexString(n) + ", expecting : 0x" + Integer.toHexString(n4));
        }
        lg_0.OH0.glGetIntegerv(3317, intBuffer);
        int n6 = intBuffer.get(0);
        if (n6 != 4) {
            lg_0.OH0.glPixelStorei(3317, 4);
        }
        n4 = this.OA0;
        n2 = this.V0;
        int n7 = this.O10;
        for (int j = 0; j < this.Wg0; ++j) {
            int n8 = Math.max(1, this.gG >> j);
            int n9 = Math.max(1, this.qL >> j);
            Math.max(1, this.rA0 >> j);
            ((Buffer)this.Fg).position(n7);
            int n10 = this.Fg.getInt();
            int n11 = n10 + 3 & 0xFFFFFFFC;
            n7 += 4;
            for (int k = 0; k < this.cS; ++k) {
                ((Buffer)this.Fg).position(n7);
                n7 += n11;
                if (n5 != -1 && n5 != k) continue;
                ByteBuffer byteBuffer2 = this.Fg.slice();
                ((Buffer)byteBuffer2).limit(n11);
                if (n3 == 1 || n3 != 2) continue;
                int n12 = this.Ij;
                if (n12 > 0) {
                    n9 = n12;
                }
                if (bl) {
                    if (n4 == 36196) {
                        String string = "GL_OES_compressed_ETC1_RGB8_texture";
                        lg_0.S4.getClass();
                        if (!GLFW.glfwExtensionSupported(string)) {
                            i4_0 i4_02 = ETC1.xL0(new ay_2(n8, n9, byteBuffer2, 0), ix0_0.n2);
                            int n13 = n + k;
                            n12 = i4_02.ro();
                            Gdx2DPixmap gdx2DPixmap = i4_02.XF;
                            int n14 = gdx2DPixmap.SH;
                            int n15 = gdx2DPixmap.mB0;
                            int n16 = i4_02.Wc();
                            int n17 = i4_02.t30();
                            ByteBuffer byteBuffer3 = i4_02.Rh0();
                            lg_0.OH0.glTexImage2D(n13, j, n12, n14, n15, 0, n16, n17, byteBuffer3);
                            i4_02.dispose();
                            continue;
                        }
                    }
                    lg_0.OH0.glCompressedTexImage2D(n + k, j, n4, n8, n9, 0, n10, byteBuffer2);
                    continue;
                }
                n12 = this.CF0;
                lg_0.OH0.glTexImage2D(n + k, j, n4, n8, n9, 0, n2, n12, byteBuffer2);
            }
        }
        if (n6 != 4) {
            lg_0.OH0.glPixelStorei(3317, n6);
        }
        if (this.cD) {
            lg_0.OH0.glGenerateMipmap(n);
        }
        if ((byteBuffer = this.Fg) != null) {
            BufferUtils.t7(byteBuffer);
        }
        this.Fg = null;
    }

    @Override
    public final i4_0 JX() {
        throw new nf_1("This TextureData implementation does not return a Pixmap");
    }

    @Override
    public final boolean mZ() {
        throw new nf_1("This TextureData implementation does not return a Pixmap");
    }

    @Override
    public final int Nx() {
        return this.gG;
    }

    @Override
    public final int Af() {
        return this.qL;
    }

    @Override
    public final ix0_0 uv() {
        throw new nf_1("This TextureData implementation directly handles texture formats.");
    }

    @Override
    public final boolean bm() {
        return this.cD;
    }

    @Override
    public final boolean wx() {
        return true;
    }
}
