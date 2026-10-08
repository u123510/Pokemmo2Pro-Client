package cn.pokemmo.graphics.gl;

import f.*;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class Gl30StateTrackerWrapper
extends ok0_0 {
    public final sY lQ;

    public Gl30StateTrackerWrapper(Kr0 kr0, sY sY2) {
        super(kr0);
        this.lQ = sY2;
    }

    @Override
    public final void glActiveTexture(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glActiveTexture(n);
        rl0_22.en0();
    }

    @Override
    public final void glBindTexture(int n, int n2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.tA;
        ++rl0_22.lf;
        rl0_22.lQ.glBindTexture(n, n2);
        rl0_22.en0();
    }

    @Override
    public final void glBlendFunc(int n, int n2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glBlendFunc(n, n2);
        rl0_22.en0();
    }

    @Override
    public final void glClear(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glClear(n);
        rl0_22.en0();
    }

    @Override
    public final void glClearColor(float f, float f2, float f3, float f4) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glClearColor(f, f2, f3, f4);
        rl0_22.en0();
    }

    @Override
    public final void glCompressedTexImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, Buffer buffer) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glCompressedTexImage2D(n, n2, n3, n4, n5, 0, n7, buffer);
        rl0_22.en0();
    }

    @Override
    public final void glCullFace(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glCullFace(n);
        rl0_22.en0();
    }

    @Override
    public final void glDeleteTexture(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glDeleteTexture(n);
        rl0_22.en0();
    }

    @Override
    public final void glDepthFunc(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glDepthFunc(n);
        rl0_22.en0();
    }

    @Override
    public final void glDepthMask(boolean bl) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glDepthMask(bl);
        rl0_22.en0();
    }

    @Override
    public final void glDepthRangef(float f, float f2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glDepthRangef(f, f2);
        rl0_22.en0();
    }

    @Override
    public final void glDisable(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glDisable(n);
        rl0_22.en0();
    }

    @Override
    public final void glDrawArrays(int n, int n2, int n3) {
        Gl30StateTrackerWrapper rl0_22 = this;
        rl0_22.bH.R00(n3);
        ++rl0_22.B1;
        ++rl0_22.lf;
        rl0_22.lQ.glDrawArrays(n, n2, n3);
        rl0_22.en0();
    }

    @Override
    public final void glDrawElements(int n, int n2, int n3, Buffer buffer) {
        Gl30StateTrackerWrapper rl0_22 = this;
        rl0_22.bH.R00(n2);
        ++rl0_22.B1;
        ++rl0_22.lf;
        rl0_22.lQ.glDrawElements(n, n2, 5123, buffer);
        rl0_22.en0();
    }

    @Override
    public final void glEnable(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glEnable(n);
        rl0_22.en0();
    }

    @Override
    public final int glGenTexture() {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        int n = rl0_22.lQ.glGenTexture();
        this.en0();
        return n;
    }

    @Override
    public final int glGetError() {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        return rl0_22.lQ.glGetError();
    }

    @Override
    public final void glGetIntegerv(int n, IntBuffer intBuffer) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glGetIntegerv(n, intBuffer);
        rl0_22.en0();
    }

    @Override
    public final String glGetString(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        String string = rl0_22.lQ.glGetString(n);
        this.en0();
        return string;
    }

    @Override
    public final void glPixelStorei(int n, int n2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glPixelStorei(n, n2);
        rl0_22.en0();
    }

    @Override
    public final void glReadPixels(int n, int n2, int n3, int n4, int n5, int n6, Buffer buffer) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glReadPixels(0, 0, n3, n4, 6408, 5121, buffer);
        rl0_22.en0();
    }

    @Override
    public final void glScissor(int n, int n2, int n3, int n4) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glScissor(n, n2, n3, n4);
        rl0_22.en0();
    }

    @Override
    public final void glTexImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, Buffer buffer) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glTexImage2D(n, n2, n3, n4, n5, 0, n7, n8, buffer);
        rl0_22.en0();
    }

    @Override
    public final void glTexParameterf(int n, int n2, float f) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glTexParameterf(3553, 34046, f);
        rl0_22.en0();
    }

    @Override
    public final void glTexSubImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, Buffer buffer) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glTexSubImage2D(n, 0, n3, n4, n5, n6, n7, n8, buffer);
        rl0_22.en0();
    }

    @Override
    public final void glViewport(int n, int n2, int n3, int n4) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glViewport(n, n2, n3, n4);
        rl0_22.en0();
    }

    @Override
    public final void glAttachShader(int n, int n2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glAttachShader(n, n2);
        rl0_22.en0();
    }

    @Override
    public final void glBindBuffer(int n, int n2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glBindBuffer(n, n2);
        rl0_22.en0();
    }

    @Override
    public final void glBindFramebuffer(int n, int n2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glBindFramebuffer(36160, n2);
        rl0_22.en0();
    }

    @Override
    public final void glBindRenderbuffer(int n, int n2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glBindRenderbuffer(36161, n2);
        rl0_22.en0();
    }

    @Override
    public final void glBlendFuncSeparate(int n, int n2, int n3, int n4) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glBlendFuncSeparate(n, n2, n3, n4);
        rl0_22.en0();
    }

    @Override
    public final void glBufferData(int n, int n2, Buffer buffer, int n3) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glBufferData(n, n2, buffer, n3);
        rl0_22.en0();
    }

    @Override
    public final void glBufferSubData(int n, int n2, int n3, Buffer buffer) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glBufferSubData(n, 0, n3, buffer);
        rl0_22.en0();
    }

    @Override
    public final int glCheckFramebufferStatus(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        int n2 = rl0_22.lQ.glCheckFramebufferStatus(36160);
        this.en0();
        return n2;
    }

    @Override
    public final void glCompileShader(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glCompileShader(n);
        rl0_22.en0();
    }

    @Override
    public final int glCreateProgram() {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        int n = rl0_22.lQ.glCreateProgram();
        this.en0();
        return n;
    }

    @Override
    public final int glCreateShader(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        int n2 = rl0_22.lQ.glCreateShader(n);
        this.en0();
        return n2;
    }

    @Override
    public final void glDeleteBuffer(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glDeleteBuffer(n);
        rl0_22.en0();
    }

    @Override
    public final void glDeleteFramebuffer(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glDeleteFramebuffer(n);
        rl0_22.en0();
    }

    @Override
    public final void glDeleteProgram(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glDeleteProgram(n);
        rl0_22.en0();
    }

    @Override
    public final void glDeleteRenderbuffer(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glDeleteRenderbuffer(n);
        rl0_22.en0();
    }

    @Override
    public final void glDeleteShader(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glDeleteShader(n);
        rl0_22.en0();
    }

    @Override
    public final void glDisableVertexAttribArray(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glDisableVertexAttribArray(n);
        rl0_22.en0();
    }

    @Override
    public final void glDrawElements(int n, int n2, int n3, int n4) {
        Gl30StateTrackerWrapper rl0_22 = this;
        rl0_22.bH.R00(n2);
        ++rl0_22.B1;
        ++rl0_22.lf;
        rl0_22.lQ.glDrawElements(n, n2, 5123, n4);
        rl0_22.en0();
    }

    @Override
    public final void glEnableVertexAttribArray(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glEnableVertexAttribArray(n);
        rl0_22.en0();
    }

    @Override
    public final void glFramebufferRenderbuffer(int n, int n2, int n3, int n4) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glFramebufferRenderbuffer(36160, n2, 36161, n4);
        rl0_22.en0();
    }

    @Override
    public final void glFramebufferTexture2D(int n, int n2, int n3, int n4, int n5) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glFramebufferTexture2D(36160, n2, 3553, n4, 0);
        rl0_22.en0();
    }

    @Override
    public final int glGenBuffer() {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        int n = rl0_22.lQ.glGenBuffer();
        this.en0();
        return n;
    }

    @Override
    public final void glGenerateMipmap(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glGenerateMipmap(n);
        rl0_22.en0();
    }

    @Override
    public final int glGenFramebuffer() {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        int n = rl0_22.lQ.glGenFramebuffer();
        this.en0();
        return n;
    }

    @Override
    public final int glGenRenderbuffer() {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        int n = rl0_22.lQ.glGenRenderbuffer();
        this.en0();
        return n;
    }

    @Override
    public final String glGetActiveAttrib(int n, int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        String string = rl0_22.lQ.glGetActiveAttrib(n, n2, intBuffer, intBuffer2);
        this.en0();
        return string;
    }

    @Override
    public final String glGetActiveUniform(int n, int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        String string = rl0_22.lQ.glGetActiveUniform(n, n2, intBuffer, intBuffer2);
        this.en0();
        return string;
    }

    @Override
    public final int glGetAttribLocation(int n, String string) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        int n2 = rl0_22.lQ.glGetAttribLocation(n, string);
        this.en0();
        return n2;
    }

    @Override
    public final void glGetFloatv(int n, FloatBuffer floatBuffer) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glGetFloatv(34047, floatBuffer);
        rl0_22.en0();
    }

    @Override
    public final void glGetProgramiv(int n, int n2, IntBuffer intBuffer) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glGetProgramiv(n, n2, intBuffer);
        rl0_22.en0();
    }

    @Override
    public final String glGetProgramInfoLog(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        String string = rl0_22.lQ.glGetProgramInfoLog(n);
        this.en0();
        return string;
    }

    @Override
    public final void glGetShaderiv(int n, int n2, IntBuffer intBuffer) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glGetShaderiv(n, 35713, intBuffer);
        rl0_22.en0();
    }

    @Override
    public final String glGetShaderInfoLog(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        String string = rl0_22.lQ.glGetShaderInfoLog(n);
        this.en0();
        return string;
    }

    @Override
    public final int glGetUniformLocation(int n, String string) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        int n2 = rl0_22.lQ.glGetUniformLocation(n, string);
        this.en0();
        return n2;
    }

    @Override
    public final void glLinkProgram(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glLinkProgram(n);
        rl0_22.en0();
    }

    @Override
    public final void glRenderbufferStorage(int n, int n2, int n3, int n4) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glRenderbufferStorage(36161, n2, n3, n4);
        rl0_22.en0();
    }

    @Override
    public final void glShaderSource(int n, String string) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glShaderSource(n, string);
        rl0_22.en0();
    }

    @Override
    public final void glTexParameteri(int n, int n2, int n3) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glTexParameteri(n, n2, n3);
        rl0_22.en0();
    }

    @Override
    public final void glUniform1f(int n, float f) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glUniform1f(n, f);
        rl0_22.en0();
    }

    @Override
    public final void glUniform1i(int n, int n2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glUniform1i(n, n2);
        rl0_22.en0();
    }

    @Override
    public final void glUniform2f(int n, float f, float f2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glUniform2f(n, f, f2);
        rl0_22.en0();
    }

    @Override
    public final void glUniform2i(int n, int n2, int n3) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glUniform2i(n, n2, n3);
        rl0_22.en0();
    }

    @Override
    public final void glUniform3f(int n, float f, float f2, float f3) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glUniform3f(n, f, f2, f3);
        rl0_22.en0();
    }

    @Override
    public final void glUniform3fv(int n, int n2, float[] fArray, int n3) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glUniform3fv(n, n2, fArray, 0);
        rl0_22.en0();
    }

    @Override
    public final void glUniform3i(int n, int n2, int n3, int n4) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glUniform3i(n, n2, n3, n4);
        rl0_22.en0();
    }

    @Override
    public final void glUniform4f(int n, float f, float f2, float f3, float f4) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glUniform4f(n, f, f2, f3, f4);
        rl0_22.en0();
    }

    @Override
    public final void glUniform4i(int n, int n2, int n3, int n4, int n5) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glUniform4i(n, n2, n3, n4, n5);
        rl0_22.en0();
    }

    @Override
    public final void glUniformMatrix3fv(int n, int n2, boolean bl, float[] fArray, int n3) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glUniformMatrix3fv(n, 1, false, fArray, 0);
        rl0_22.en0();
    }

    @Override
    public final void glUniformMatrix4fv(int n, int n2, boolean bl, float[] fArray, int n3) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glUniformMatrix4fv(n, n2, false, fArray, 0);
        rl0_22.en0();
    }

    @Override
    public final void glUseProgram(int n) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.BJ0;
        ++rl0_22.lf;
        rl0_22.lQ.glUseProgram(n);
        rl0_22.en0();
    }

    @Override
    public final void glVertexAttrib2f(int n, float f, float f2) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glVertexAttrib2f(n, 0.0f, 0.0f);
        rl0_22.en0();
    }

    @Override
    public final void glVertexAttribPointer(int n, int n2, int n3, boolean bl, int n4, Buffer buffer) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glVertexAttribPointer(n, n2, n3, bl, n4, buffer);
        rl0_22.en0();
    }

    @Override
    public final void glVertexAttribPointer(int n, int n2, int n3, boolean bl, int n4, int n5) {
        Gl30StateTrackerWrapper rl0_22 = this;
        ++rl0_22.lf;
        rl0_22.lQ.glVertexAttribPointer(n, n2, n3, bl, n4, n5);
        rl0_22.en0();
    }

    public final void en0() {
        int n = this.lQ.glGetError();
        while (n != 0) {
            Gl30StateTrackerWrapper rl0_22 = this;
            rl0_22.qL0.zX.ba0(n);
            n = rl0_22.lQ.glGetError();
        }
    }
}

