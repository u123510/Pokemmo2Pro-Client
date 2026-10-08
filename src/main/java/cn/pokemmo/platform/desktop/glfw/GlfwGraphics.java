/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.glfw;

import f.*;


import f.lb0_1;
import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

/*
 * Renamed from f.u20
 */
public class GlfwGraphics
extends GlfwGraphicsBase
implements lb0_1 {
    @Override
    public final void PM(int n, IntBuffer intBuffer) {
        IntBuffer intBuffer2 = intBuffer;
        int n2 = intBuffer2.limit();
        ((Buffer)intBuffer2).limit(n);
        GL20.glDrawBuffers(intBuffer2);
        ((Buffer)intBuffer2).limit(n2);
    }

    @Override
    public final void glBindFramebuffer(int n, int n2) {
        GL30.glBindFramebuffer(36160, n2);
    }

    @Override
    public final void glBindRenderbuffer(int n, int n2) {
        GL30.glBindRenderbuffer(36161, n2);
    }

    @Override
    public final int glCheckFramebufferStatus(int n) {
        return GL30.glCheckFramebufferStatus(36160);
    }

    @Override
    public final void glDeleteFramebuffer(int n) {
        GL30.glDeleteFramebuffers(n);
    }

    @Override
    public final void glDeleteRenderbuffer(int n) {
        GL30.glDeleteRenderbuffers(n);
    }

    @Override
    public final void glGenerateMipmap(int n) {
        GL30.glGenerateMipmap(n);
    }

    @Override
    public final int glGenFramebuffer() {
        return GL30.glGenFramebuffers();
    }

    @Override
    public final int glGenRenderbuffer() {
        return GL30.glGenRenderbuffers();
    }

    @Override
    public final void glRenderbufferStorage(int n, int n2, int n3, int n4) {
        GL30.glRenderbufferStorage(36161, n2, n3, n4);
    }

    @Override
    public final void glFramebufferTexture2D(int n, int n2, int n3, int n4, int n5) {
        GL30.glFramebufferTexture2D(36160, n2, 3553, n4, 0);
    }

    @Override
    public final void glFramebufferRenderbuffer(int n, int n2, int n3, int n4) {
        GL30.glFramebufferRenderbuffer(36160, n2, 36161, n4);
    }

    @Override
    public final void cC(int n) {
        GL30.glBindVertexArray(n);
    }

    @Override
    public final void Bi(IntBuffer intBuffer) {
        GL30.glDeleteVertexArrays(intBuffer);
    }

    @Override
    public final void iB(IntBuffer intBuffer) {
        GL30.glGenVertexArrays(intBuffer);
    }
}

