/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gl;

import f.*;

import f.sY;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class GlVertexAttributeBuffer
implements sY {
    public final sY Vz;

    public GlVertexAttributeBuffer(sY sY2) {
        this.Vz = sY2;
    }

    @Override
    public final void glGetIntegerv(int n, IntBuffer intBuffer) {
        if (n == 34930) {
            intBuffer.put(0, 2);
            return;
        }
        this.Vz.glGetIntegerv(n, intBuffer);
    }

    @Override
    public final void glActiveTexture(int n) {
        this.Vz.glActiveTexture(n);
    }

    @Override
    public final String glGetActiveUniform(int n, int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        return this.Vz.glGetActiveUniform(n, n2, intBuffer, intBuffer2);
    }

    @Override
    public final void glBlendFunc(int n, int n2) {
        this.Vz.glBlendFunc(n, n2);
    }

    @Override
    public final void glGetProgramiv(int n, int n2, IntBuffer intBuffer) {
        this.Vz.glGetProgramiv(n, n2, intBuffer);
    }

    @Override
    public final void glLinkProgram(int n) {
        this.Vz.glLinkProgram(n);
    }

    @Override
    public final void glDisableVertexAttribArray(int n) {
        this.Vz.glDisableVertexAttribArray(n);
    }

    @Override
    public final void glDrawElements(int n, int n2, int n3, Buffer buffer) {
        int n4 = 5123;
        this.Vz.glDrawElements(n, n2, n4, buffer);
    }

    @Override
    public final void glDisable(int n) {
        this.Vz.glDisable(n);
    }

    @Override
    public final void glDrawElements(int n, int n2, int n3, int n4) {
        int n5 = 5123;
        this.Vz.glDrawElements(n, n2, n5, n4);
    }

    @Override
    public final void glVertexAttrib2f(int n, float f, float f2) {
        float f3 = 0.0f;
        f = 0.0f;
        this.Vz.glVertexAttrib2f(n, f3, f);
    }

    @Override
    public final void glDepthMask(boolean bl) {
        this.Vz.glDepthMask(bl);
    }

    @Override
    public final void glGetShaderiv(int n, int n2, IntBuffer intBuffer) {
        int n3 = 35713;
        this.Vz.glGetShaderiv(n, n3, intBuffer);
    }

    @Override
    public final void glVertexAttribPointer(int n, int n2, int n3, boolean bl, int n4, int n5) {
        this.Vz.glVertexAttribPointer(n, n2, n3, bl, n4, n5);
    }

    @Override
    public final void glDeleteShader(int n) {
        this.Vz.glDeleteShader(n);
    }

    @Override
    public final void glGenerateMipmap(int n) {
        this.Vz.glGenerateMipmap(n);
    }

    @Override
    public final void glUseProgram(int n) {
        this.Vz.glUseProgram(n);
    }

    @Override
    public final void glBindBuffer(int n, int n2) {
        this.Vz.glBindBuffer(n, n2);
    }

    @Override
    public final void glCompressedTexImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, Buffer buffer) {
        int n8 = 0;
        this.Vz.glCompressedTexImage2D(n, n2, n3, n4, n5, n8, n7, buffer);
    }

    @Override
    public final void glCullFace(int n) {
        this.Vz.glCullFace(n);
    }

    @Override
    public final void glTexSubImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, Buffer buffer) {
        int n9 = 0;
        this.Vz.glTexSubImage2D(n, n9, n3, n4, n5, n6, n7, n8, buffer);
    }

    @Override
    public final void glUniform4f(int n, float f, float f2, float f3, float f4) {
        this.Vz.glUniform4f(n, f, f2, f3, f4);
    }

    @Override
    public final void glBufferData(int n, int n2, Buffer buffer, int n3) {
        this.Vz.glBufferData(n, n2, buffer, n3);
    }

    @Override
    public final int glCreateShader(int n) {
        return this.Vz.glCreateShader(n);
    }

    @Override
    public final void glCompileShader(int n) {
        this.Vz.glCompileShader(n);
    }

    @Override
    public final int glCreateProgram() {
        return this.Vz.glCreateProgram();
    }

    @Override
    public final int glGenTexture() {
        return this.Vz.glGenTexture();
    }

    @Override
    public final void glDeleteBuffer(int n) {
        this.Vz.glDeleteBuffer(n);
    }

    @Override
    public final void glDepthRangef(float f, float f2) {
        this.Vz.glDepthRangef(f, f2);
    }

    @Override
    public final int glGenFramebuffer() {
        return this.Vz.glGenFramebuffer();
    }

    @Override
    public final void glReadPixels(int n, int n2, int n3, int n4, int n5, int n6, Buffer buffer) {
        int n7 = 0;
        n = 0;
        n2 = 6408;
        n5 = 5121;
        this.Vz.glReadPixels(n7, n, n3, n4, n2, n5, buffer);
    }

    @Override
    public final void glUniformMatrix4fv(int n, int n2, boolean bl, float[] fArray, int n3) {
        boolean bl2 = false;
        bl = false;
        this.Vz.glUniformMatrix4fv(n, n2, bl2, fArray, bl ? 1 : 0);
    }

    @Override
    public final void glBindFramebuffer(int n, int n2) {
        int n3 = 36160;
        this.Vz.glBindFramebuffer(n3, n2);
    }

    @Override
    public final int glGetUniformLocation(int n, String string) {
        return this.Vz.glGetUniformLocation(n, string);
    }

    @Override
    public final int glGenBuffer() {
        return this.Vz.glGenBuffer();
    }

    @Override
    public final void glDeleteTexture(int n) {
        this.Vz.glDeleteTexture(n);
    }

    @Override
    public final void glUniform1i(int n, int n2) {
        this.Vz.glUniform1i(n, n2);
    }

    @Override
    public final void glUniform3fv(int n, int n2, float[] fArray, int n3) {
        int n4 = 0;
        this.Vz.glUniform3fv(n, n2, fArray, n4);
    }

    @Override
    public final void glUniform4i(int n, int n2, int n3, int n4, int n5) {
        this.Vz.glUniform4i(n, n2, n3, n4, n5);
    }

    @Override
    public final int glGetAttribLocation(int n, String string) {
        return this.Vz.glGetAttribLocation(n, string);
    }

    @Override
    public final void glDeleteProgram(int n) {
        this.Vz.glDeleteProgram(n);
    }

    @Override
    public final void glDeleteRenderbuffer(int n) {
        this.Vz.glDeleteRenderbuffer(n);
    }

    @Override
    public final void glUniform1f(int n, float f) {
        this.Vz.glUniform1f(n, f);
    }

    @Override
    public final void glUniform3i(int n, int n2, int n3, int n4) {
        this.Vz.glUniform3i(n, n2, n3, n4);
    }

    @Override
    public final void glEnable(int n) {
        this.Vz.glEnable(n);
    }

    @Override
    public final void glScissor(int n, int n2, int n3, int n4) {
        this.Vz.glScissor(n, n2, n3, n4);
    }

    @Override
    public final void glBufferSubData(int n, int n2, int n3, Buffer buffer) {
        int n4 = 0;
        this.Vz.glBufferSubData(n, n4, n3, buffer);
    }

    @Override
    public final void glEnableVertexAttribArray(int n) {
        this.Vz.glEnableVertexAttribArray(n);
    }

    @Override
    public final void glShaderSource(int n, String string) {
        this.Vz.glShaderSource(n, string);
    }

    @Override
    public final void glClear(int n) {
        this.Vz.glClear(n);
    }

    @Override
    public final void glDepthFunc(int n) {
        this.Vz.glDepthFunc(n);
    }

    @Override
    public final void glBlendFuncSeparate(int n, int n2, int n3, int n4) {
        this.Vz.glBlendFuncSeparate(n, n2, n3, n4);
    }

    @Override
    public final void glViewport(int n, int n2, int n3, int n4) {
        this.Vz.glViewport(n, n2, n3, n4);
    }

    @Override
    public final String glGetString(int n) {
        return this.Vz.glGetString(n);
    }

    @Override
    public final void glDrawArrays(int n, int n2, int n3) {
        this.Vz.glDrawArrays(n, n2, n3);
    }

    @Override
    public final void glFramebufferRenderbuffer(int n, int n2, int n3, int n4) {
        int n5 = 36160;
        n = 36161;
        this.Vz.glFramebufferRenderbuffer(n5, n2, n, n4);
    }

    @Override
    public final void glTexParameteri(int n, int n2, int n3) {
        this.Vz.glTexParameteri(n, n2, n3);
    }

    @Override
    public final void glClearColor(float f, float f2, float f3, float f4) {
        this.Vz.glClearColor(f, f2, f3, f4);
    }

    @Override
    public final void glTexParameterf(int n, int n2, float f) {
        int n3 = 3553;
        n = 34046;
        this.Vz.glTexParameterf(n3, n, f);
    }

    @Override
    public final void glAttachShader(int n, int n2) {
        this.Vz.glAttachShader(n, n2);
    }

    @Override
    public final void glBindRenderbuffer(int n, int n2) {
        int n3 = 36161;
        this.Vz.glBindRenderbuffer(n3, n2);
    }

    @Override
    public final void glUniform3f(int n, float f, float f2, float f3) {
        this.Vz.glUniform3f(n, f, f2, f3);
    }

    @Override
    public final String glGetProgramInfoLog(int n) {
        return this.Vz.glGetProgramInfoLog(n);
    }

    @Override
    public final void glFramebufferTexture2D(int n, int n2, int n3, int n4, int n5) {
        int n6 = 36160;
        n = 3553;
        n3 = 0;
        this.Vz.glFramebufferTexture2D(n6, n2, n, n4, n3);
    }

    @Override
    public final void glBindTexture(int n, int n2) {
        this.Vz.glBindTexture(n, n2);
    }

    @Override
    public final String glGetShaderInfoLog(int n) {
        return this.Vz.glGetShaderInfoLog(n);
    }

    @Override
    public final void glVertexAttribPointer(int n, int n2, int n3, boolean bl, int n4, Buffer buffer) {
        this.Vz.glVertexAttribPointer(n, n2, n3, bl, n4, buffer);
    }

    @Override
    public final void glUniformMatrix3fv(int n, int n2, boolean bl, float[] fArray, int n3) {
        int n4 = 1;
        n2 = 0;
        bl = false;
        this.Vz.glUniformMatrix3fv(n, n4, n2 != 0, fArray, bl ? 1 : 0);
    }

    @Override
    public final void glUniform2i(int n, int n2, int n3) {
        this.Vz.glUniform2i(n, n2, n3);
    }

    @Override
    public final void glTexImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, Buffer buffer) {
        int n9 = 0;
        this.Vz.glTexImage2D(n, n2, n3, n4, n5, n9, n7, n8, buffer);
    }

    @Override
    public final void glUniform2f(int n, float f, float f2) {
        this.Vz.glUniform2f(n, f, f2);
    }

    @Override
    public final void glPixelStorei(int n, int n2) {
        this.Vz.glPixelStorei(n, n2);
    }

    @Override
    public final int glCheckFramebufferStatus(int n) {
        int n2 = 36160;
        return this.Vz.glCheckFramebufferStatus(n2);
    }

    @Override
    public final String glGetActiveAttrib(int n, int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        return this.Vz.glGetActiveAttrib(n, n2, intBuffer, intBuffer2);
    }

    @Override
    public final void glDeleteFramebuffer(int n) {
        this.Vz.glDeleteFramebuffer(n);
    }

    @Override
    public final int glGetError() {
        return this.Vz.glGetError();
    }

    @Override
    public final void glGetFloatv(int n, FloatBuffer floatBuffer) {
        int n2 = 34047;
        this.Vz.glGetFloatv(n2, floatBuffer);
    }

    @Override
    public final void glRenderbufferStorage(int n, int n2, int n3, int n4) {
        int n5 = 36161;
        this.Vz.glRenderbufferStorage(n5, n2, n3, n4);
    }

    @Override
    public final int glGenRenderbuffer() {
        return this.Vz.glGenRenderbuffer();
    }
}

