package cn.pokemmo.graphics.gdx.render;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ShortBuffer;

public class GdxQuadSpriteBatch implements C3 {
    public static final VV i50 = VV.mR;
    public final ap0_0 nH;
    public final float[] X8;
    public int kE0;
    public Texture lr0;
    public float p3;
    public float ea0;
    public boolean xq;
    public final Matrix4 jP;
    public final Matrix4 g00;
    public final Matrix4 Wq;
    public int Vn;
    public int FA;
    public int p8;
    public int y6;
    public final lt_1 Kt0;
    public lt_1 bK0;
    public final boolean bH;
    public final Color oH;
    public float og;
    public int mW;
    public int qK;

    public GdxQuadSpriteBatch() {
        this(1000, null);
    }

    public GdxQuadSpriteBatch(int size) {
        this(size, null);
    }

    public GdxQuadSpriteBatch(int size, lt_1 shader) {
        kE0 = 0;
        lr0 = null;
        p3 = 0.0F;
        ea0 = 0.0F;
        xq = false;
        jP = new Matrix4();
        g00 = new Matrix4();
        Wq = new Matrix4();
        Vn = 770;
        FA = 771;
        p8 = 770;
        y6 = 771;
        bK0 = null;
        oH = new Color(1.0F, 1.0F, 1.0F, 1.0F);
        og = Color.WHITE_FLOAT_BITS;
        mW = 0;
        qK = 0;
        if (size > 8191) {
            throw new IllegalArgumentException(yr_1.pG("Can't have more than 8191 sprites per batch: ", size));
        }
        VV type = lg_0.MA != null ? VV.at : i50;
        int indexCount = size * 6;
        nH = new ap0_0(type, false, size * 4, indexCount, new kz_0[] {
                new kz_0(1, 2, "a_position"),
                new kz_0(4, 4, "a_color"),
                new kz_0(16, 2, "a_texCoord0")
        });
        g00.BI((float) lg_0.S4.Kr0(), (float) lg_0.S4.sD0());
        X8 = new float[size * 20];
        short[] indices = new short[indexCount];
        short vertex = 0;
        for (int i = 0; i < indexCount; i += 6, vertex = (short) (vertex + 4)) {
            indices[i] = vertex;
            indices[i + 1] = (short) (vertex + 1);
            indices[i + 2] = (short) (vertex + 2);
            indices[i + 3] = (short) (vertex + 2);
            indices[i + 4] = (short) (vertex + 3);
            indices[i + 5] = vertex;
        }
        nH.Mr(indices);
        if (shader == null) {
            Kt0 = cj0();
            bH = true;
        } else {
            Kt0 = shader;
            bH = false;
        }
    }

    public static lt_1 cj0() {
        String vertex = "attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\n"
                + "uniform mat4 u_projTrans;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\n"
                + "void main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n"
                + "   v_texCoords = a_texCoord0;\n   gl_Position =  u_projTrans * a_position;\n}\n";
        String fragment = "#ifdef GL_ES\n#define LOWP lowp\nprecision mediump float;\n#else\n#define LOWP \n"
                + "#endif\nvarying LOWP vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\n"
                + "void main()\n{\n  gl_FragColor = v_color * texture2D(u_texture, v_texCoords);\n}";
        lt_1 shader = new lt_1(vertex, fragment);
        if (shader.U00) {
            return shader;
        }
        throw new IllegalArgumentException(new StringBuilder("Error compiling shader: ").append(shader.aX()).toString());
    }

    public final void W30() {
        if (xq) {
            throw new IllegalStateException("SpriteBatch.end must be called before begin.");
        }
        mW = 0;
        lg_0.OH0.glDepthMask(false);
        lt_1 shader = bK0 != null ? bK0 : Kt0;
        sY gl = lg_0.Sf0;
        shader.WI();
        gl.glUseProgram(shader.lH);
        b40();
        xq = true;
    }

    public final void end() {
        if (!xq) {
            throw new IllegalStateException("SpriteBatch.begin must be called before end.");
        }
        if (kE0 > 0) {
            TV();
        }
        lr0 = null;
        xq = false;
        sY gl = lg_0.OH0;
        gl.glDepthMask(true);
        gl.glDisable(3042);
    }

    public final void TJ0(float r, float g, float b, float a) {
        oH.set(r, g, b, a);
        og = oH.toFloatBits();
    }

    public void Ya0(Texture texture, float x, float y, int srcX, int srcY, int width, int height) {
        if (!xq) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] vertices = prepareTexture(texture);
        float invWidth = p3;
        float u = srcX * invWidth;
        float invHeight = ea0;
        float v = (srcY + height) * invHeight;
        float u2 = (srcX + width) * invWidth;
        float v2 = srcY * invHeight;
        float right = x + width;
        float top = y + height;
        appendQuad(vertices, x, y, x, top, right, top, right, y, u, v, u2, v2);
    }

    public void gP(Texture texture, float x, float y, float width, float height,
            float u, float v, float u2, float v2) {
        if (!xq) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] vertices = prepareTexture(texture);
        float right = x + width;
        float top = y + height;
        appendQuad(vertices, x, y, x, top, right, top, right, y, u, v, u2, v2);
    }

    public void CH0(Texture texture, float x, float y) {
        float width = texture.getWidth();
        float height = texture.getHeight();
        vv0(texture, x, y, width, height);
    }

    public void vv0(Texture texture, float x, float y, float width, float height) {
        if (!xq) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] vertices = prepareTexture(texture);
        float right = x + width;
        float top = y + height;
        appendQuad(vertices, x, y, x, top, right, top, right, y, 0.0F, 1.0F, 1.0F, 0.0F);
    }

    public void Lz(LPT6_ region, float x, float y) {
        float width = region.bz;
        float height = region.xZ;
        S50(region, x, y, width, height);
    }

    public void S50(LPT6_ region, float x, float y, float width, float height) {
        if (!xq) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] vertices = prepareTexture(region.OB);
        float right = x + width;
        float top = y + height;
        float u = region.yQ;
        float v = region.Ll0;
        float u2 = region.Yo;
        float v2 = region.Y60;
        appendQuad(vertices, x, y, x, top, right, top, right, y, u, v, u2, v2);
    }

    public void u2(LPT6_ region, float x, float y, float originX, float originY,
            float width, float height, float scaleX, float scaleY, float rotation) {
        if (!xq) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] vertices = prepareTexture(region.OB);
        float worldX = x + originX;
        float worldY = y + originY;
        float left = -originX;
        float bottom = -originY;
        float right = width - originX;
        float top = height - originY;
        if (scaleX != 1.0F || scaleY != 1.0F) {
            left *= scaleX;
            bottom *= scaleY;
            right *= scaleX;
            top *= scaleY;
        }
        float x1, y1, x2, y2, x3, y3, x4, y4;
        if (rotation != 0.0F) {
            float cosine = LW.gc0(rotation);
            float sine = LW.Om(rotation);
            float cosLeft = cosine * left;
            float sinLeft = sine * left;
            float sinTop = sine * top;
            float cosTop = cosine * top;
            x1 = cosLeft - sine * bottom;
            y1 = cosine * bottom + sinLeft;
            x2 = cosLeft - sinTop;
            y2 = cosTop + sinLeft;
            x3 = cosine * right - sinTop;
            y3 = sine * right + cosTop;
            x4 = (x3 - x2) + x1;
            y4 = y3 - (y2 - y1);
        } else {
            x1 = left; y1 = bottom;
            x2 = left; y2 = top;
            x3 = right; y3 = top;
            x4 = right; y4 = bottom;
        }
        x1 += worldX; y1 += worldY;
        x2 += worldX; y2 += worldY;
        x3 += worldX; y3 += worldY;
        x4 += worldX; y4 += worldY;
        float u = region.yQ;
        float v = region.Ll0;
        float u2 = region.Yo;
        float v2 = region.Y60;
        appendQuad(vertices, x1, y1, x2, y2, x3, y3, x4, y4, u, v, u2, v2);
    }

    public final void TV() {
        int sprites = kE0;
        if (sprites == 0) {
            return;
        }
        mW++;
        sprites /= 20;
        if (sprites > qK) {
            qK = sprites;
        }
        int count = sprites * 6;
        lr0.bind();
        ap0_0 mesh = nH;
        mesh.COM6.ce0(0, kE0, X8);
        ShortBuffer indices = mesh.Sw0.st0(true);
        indices.position(0);
        indices.limit(count);
        lg_0.OH0.glEnable(3042);
        int source = Vn;
        if (source != -1) {
            lg_0.OH0.glBlendFuncSeparate(source, FA, p8, y6);
        }
        lt_1 shader = bK0 != null ? bK0 : Kt0;
        mesh.zm(shader, 4, 0, count, mesh.uf);
        kE0 = 0;
    }

    public final void sv() {
    }

    public final void dispose() {
        nH.dispose();
        if (bH && Kt0 != null) {
            Kt0.dispose();
        }
    }

    public final void Po(Matrix4 projection) {
        if (xq) {
            TV();
        }
        g00.getClass();
        g00.Dd0(projection.EW);
        if (xq) {
            b40();
        }
    }

    public final void Ud(Matrix4 transform) {
        if (xq) {
            TV();
        }
        jP.getClass();
        jP.Dd0(transform.EW);
        if (xq) {
            b40();
        }
    }

    public final void b40() {
        Wq.getClass();
        Matrix4 combined = Wq.Dd0(g00.EW);
        Matrix4.md0(combined.EW, jP.EW);
        lt_1 shader = bK0;
        boolean custom = shader != null;
        if (!custom) {
            shader = Kt0;
        }
        int location = shader.WD0("u_projTrans", lt_1.Ln0);
        lg_0.Sf0.glUniformMatrix4fv(location, 1, false, Wq.EW, 0);
        shader = custom ? bK0 : Kt0;
        sY gl = lg_0.Sf0;
        shader.WI();
        location = shader.WD0("u_texture", lt_1.Ln0);
        gl.glUniform1i(location, 0);
    }

    public final void u3(Texture texture) {
        TV();
        lr0 = texture;
        p3 = 1.0F / texture.getWidth();
        ea0 = 1.0F / texture.getHeight();
    }

    public void J2(Texture texture, float x, float y, float originX, float originY,
            float width, float height, float scaleX, float scaleY, float rotation,
            int srcX, int srcY, int srcWidth, int srcHeight, boolean flipY) {
        if (!xq) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] vertices = prepareTexture(texture);
        float worldX = x + originX;
        float worldY = y + originY;
        float left = -originX;
        float bottom = -originY;
        float right = width - originX;
        float top = height - originY;
        if (scaleX != 1.0F || scaleY != 1.0F) {
            left *= scaleX;
            bottom *= scaleY;
            right *= scaleX;
            top *= scaleY;
        }
        float x1, y1, x2, y2, x3, y3, x4, y4;
        if (rotation != 0.0F) {
            float cosine = LW.gc0(rotation);
            float sine = LW.Om(rotation);
            float cosLeft = cosine * left;
            float sinLeft = sine * left;
            float sinTop = sine * top;
            float cosTop = cosine * top;
            x1 = cosLeft - sine * bottom;
            y1 = cosine * bottom + sinLeft;
            x2 = cosLeft - sinTop;
            y2 = cosTop + sinLeft;
            x3 = cosine * right - sinTop;
            y3 = sine * right + cosTop;
            x4 = (x3 - x2) + x1;
            y4 = y3 - (y2 - y1);
        } else {
            x1 = left; y1 = bottom;
            x2 = left; y2 = top;
            x3 = right; y3 = top;
            x4 = right; y4 = bottom;
        }
        x1 += worldX; y1 += worldY;
        x2 += worldX; y2 += worldY;
        x3 += worldX; y3 += worldY;
        x4 += worldX; y4 += worldY;
        float invWidth = p3;
        float u = srcX * invWidth;
        float invHeight = ea0;
        float v = (srcY + srcHeight) * invHeight;
        float u2 = (srcX + srcWidth) * invWidth;
        float v2 = srcY * invHeight;
        if (flipY) {
            float swap = v;
            v = v2;
            v2 = swap;
        }
        appendQuad(vertices, x1, y1, x2, y2, x3, y3, x4, y4, u, v, u2, v2);
    }

    public void QB0(Texture texture, float x, float y, float width, float height,
            int srcWidth, int srcHeight, boolean flipX, boolean flipY) {
        if (!xq) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        float[] vertices = prepareTexture(texture);
        float invWidth = p3;
        float u = 0.0F * invWidth;
        float invHeight = ea0;
        float v = srcHeight * invHeight;
        float u2 = srcWidth * invWidth;
        float v2 = 0.0F * invHeight;
        float right = x + width;
        float top = y + height;
        if (flipX) {
            float swap = u;
            u = u2;
            u2 = swap;
        }
        if (flipY) {
            float swap = v;
            v = v2;
            v2 = swap;
        }
        appendQuad(vertices, x, y, x, top, right, top, right, y, u, v, u2, v2);
    }

    public void Il0(Texture texture, float[] vertices, int count) {
        if (!xq) {
            throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
        }
        int offset = 0;
        int capacity = X8.length;
        int available;
        if (texture != lr0) {
            u3(texture);
            available = capacity;
        } else {
            available = capacity - kE0;
            if (available == 0) {
                TV();
                available = capacity;
            }
        }
        int copied = Math.min(available, count);
        System.arraycopy(vertices, offset, X8, kE0, copied);
        kE0 += copied;
        count -= copied;
        while (count > 0) {
            offset += copied;
            TV();
            copied = Math.min(capacity, count);
            System.arraycopy(vertices, offset, X8, 0, copied);
            kE0 += copied;
            count -= copied;
        }
    }

    private float[] prepareTexture(Texture texture) {
        float[] vertices = X8;
        if (texture != lr0) {
            u3(texture);
        } else if (kE0 == vertices.length) {
            TV();
        }
        return vertices;
    }

    private void appendQuad(float[] vertices, float x1, float y1, float x2, float y2,
            float x3, float y3, float x4, float y4, float u, float v, float u2, float v2) {
        float color = og;
        int index = kE0;
        vertices[index] = x1;
        vertices[index + 1] = y1;
        vertices[index + 2] = color;
        vertices[index + 3] = u;
        vertices[index + 4] = v;
        vertices[index + 5] = x2;
        vertices[index + 6] = y2;
        vertices[index + 7] = color;
        vertices[index + 8] = u;
        vertices[index + 9] = v2;
        vertices[index + 10] = x3;
        vertices[index + 11] = y3;
        vertices[index + 12] = color;
        vertices[index + 13] = u2;
        vertices[index + 14] = v2;
        vertices[index + 15] = x4;
        vertices[index + 16] = y4;
        vertices[index + 17] = color;
        vertices[index + 18] = u2;
        vertices[index + 19] = v;
        kE0 = index + 20;
    }
}
