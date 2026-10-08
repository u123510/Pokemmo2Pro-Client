package cn.pokemmo.graphics.gl;

import f.*;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class Gl20StateTrackerWrapper
extends ok0_0
implements lb0_1 {
    public final lb0_1 FJ0;

    public Gl20StateTrackerWrapper(Kr0 kr0, lb0_1 lb0_12) {
        super(kr0);
        this.FJ0 = lb0_12;
    }

    public final void SE0() {
        int n = this.FJ0.glGetError();
        while (n != 0) {
            Gl20StateTrackerWrapper hs0_02 = this;
            hs0_02.qL0.zX.ba0(n);
            n = hs0_02.FJ0.glGetError();
        }
    }

    @Override
    public final void glActiveTexture(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glActiveTexture(n);
        hs0_02.SE0();
    }

    @Override
    public final void glBindTexture(int n, int n2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.tA;
        ++hs0_02.lf;
        hs0_02.FJ0.glBindTexture(n, n2);
        hs0_02.SE0();
    }

    @Override
    public final void glBlendFunc(int n, int n2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glBlendFunc(n, n2);
        hs0_02.SE0();
    }

    @Override
    public final void glClear(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glClear(n);
        hs0_02.SE0();
    }

    @Override
    public final void glClearColor(float f, float f2, float f3, float f4) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glClearColor(f, f2, f3, f4);
        hs0_02.SE0();
    }

    @Override
    public final void glCompressedTexImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, Buffer buffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glCompressedTexImage2D(n, n2, n3, n4, n5, 0, n7, buffer);
        hs0_02.SE0();
    }

    @Override
    public final void glCullFace(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glCullFace(n);
        hs0_02.SE0();
    }

    @Override
    public final void glDeleteTexture(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glDeleteTexture(n);
        hs0_02.SE0();
    }

    @Override
    public final void glDepthFunc(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glDepthFunc(n);
        hs0_02.SE0();
    }

    @Override
    public final void glDepthMask(boolean bl) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glDepthMask(bl);
        hs0_02.SE0();
    }

    @Override
    public final void glDepthRangef(float f, float f2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glDepthRangef(f, f2);
        hs0_02.SE0();
    }

    @Override
    public final void glDisable(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glDisable(n);
        hs0_02.SE0();
    }

    @Override
    public final void glDrawArrays(int n, int n2, int n3) {
        Gl20StateTrackerWrapper hs0_02 = this;
        hs0_02.bH.R00(n3);
        ++hs0_02.B1;
        ++hs0_02.lf;
        hs0_02.FJ0.glDrawArrays(n, n2, n3);
        hs0_02.SE0();
    }

    @Override
    public final void glDrawElements(int n, int n2, int n3, Buffer buffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        hs0_02.bH.R00(n2);
        ++hs0_02.B1;
        ++hs0_02.lf;
        hs0_02.FJ0.glDrawElements(n, n2, 5123, buffer);
        hs0_02.SE0();
    }

    @Override
    public final void glEnable(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glEnable(n);
        hs0_02.SE0();
    }

    @Override
    public final int glGenTexture() {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        int n = hs0_02.FJ0.glGenTexture();
        this.SE0();
        return n;
    }

    @Override
    public final int glGetError() {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        return hs0_02.FJ0.glGetError();
    }

    @Override
    public final void glGetIntegerv(int n, IntBuffer intBuffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glGetIntegerv(n, intBuffer);
        hs0_02.SE0();
    }

    @Override
    public final String glGetString(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        String string = hs0_02.FJ0.glGetString(n);
        this.SE0();
        return string;
    }

    @Override
    public final void glPixelStorei(int n, int n2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glPixelStorei(n, n2);
        hs0_02.SE0();
    }

    @Override
    public final void glReadPixels(int n, int n2, int n3, int n4, int n5, int n6, Buffer buffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glReadPixels(0, 0, n3, n4, 6408, 5121, buffer);
        hs0_02.SE0();
    }

    @Override
    public final void glScissor(int n, int n2, int n3, int n4) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glScissor(n, n2, n3, n4);
        hs0_02.SE0();
    }

    @Override
    public final void glTexImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, Buffer buffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glTexImage2D(n, n2, n3, n4, n5, 0, n7, n8, buffer);
        hs0_02.SE0();
    }

    @Override
    public final void glTexParameterf(int n, int n2, float f) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glTexParameterf(3553, 34046, f);
        hs0_02.SE0();
    }

    @Override
    public final void glTexSubImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, Buffer buffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glTexSubImage2D(n, 0, n3, n4, n5, n6, n7, n8, buffer);
        hs0_02.SE0();
    }

    @Override
    public final void glViewport(int n, int n2, int n3, int n4) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glViewport(n, n2, n3, n4);
        hs0_02.SE0();
    }

    @Override
    public final void glAttachShader(int n, int n2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glAttachShader(n, n2);
        hs0_02.SE0();
    }

    @Override
    public final void glBindBuffer(int n, int n2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glBindBuffer(n, n2);
        hs0_02.SE0();
    }

    @Override
    public final void glBindFramebuffer(int n, int n2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glBindFramebuffer(36160, n2);
        hs0_02.SE0();
    }

    @Override
    public final void glBindRenderbuffer(int n, int n2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glBindRenderbuffer(36161, n2);
        hs0_02.SE0();
    }

    @Override
    public final void glBlendFuncSeparate(int n, int n2, int n3, int n4) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glBlendFuncSeparate(n, n2, n3, n4);
        hs0_02.SE0();
    }

    @Override
    public final void glBufferData(int n, int n2, Buffer buffer, int n3) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glBufferData(n, n2, buffer, n3);
        hs0_02.SE0();
    }

    @Override
    public final void glBufferSubData(int n, int n2, int n3, Buffer buffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glBufferSubData(n, 0, n3, buffer);
        hs0_02.SE0();
    }

    @Override
    public final int glCheckFramebufferStatus(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        int n2 = hs0_02.FJ0.glCheckFramebufferStatus(36160);
        this.SE0();
        return n2;
    }

    @Override
    public final void glCompileShader(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glCompileShader(n);
        hs0_02.SE0();
    }

    @Override
    public final int glCreateProgram() {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        int n = hs0_02.FJ0.glCreateProgram();
        this.SE0();
        return n;
    }

    @Override
    public final int glCreateShader(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        int n2 = hs0_02.FJ0.glCreateShader(n);
        this.SE0();
        return n2;
    }

    @Override
    public final void glDeleteBuffer(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glDeleteBuffer(n);
        hs0_02.SE0();
    }

    @Override
    public final void glDeleteFramebuffer(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glDeleteFramebuffer(n);
        hs0_02.SE0();
    }

    @Override
    public final void glDeleteProgram(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glDeleteProgram(n);
        hs0_02.SE0();
    }

    @Override
    public final void glDeleteRenderbuffer(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glDeleteRenderbuffer(n);
        hs0_02.SE0();
    }

    @Override
    public final void glDeleteShader(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glDeleteShader(n);
        hs0_02.SE0();
    }

    @Override
    public final void glDisableVertexAttribArray(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glDisableVertexAttribArray(n);
        hs0_02.SE0();
    }

    @Override
    public final void glDrawElements(int n, int n2, int n3, int n4) {
        Gl20StateTrackerWrapper hs0_02 = this;
        hs0_02.bH.R00(n2);
        ++hs0_02.B1;
        ++hs0_02.lf;
        hs0_02.FJ0.glDrawElements(n, n2, 5123, n4);
        hs0_02.SE0();
    }

    @Override
    public final void glEnableVertexAttribArray(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glEnableVertexAttribArray(n);
        hs0_02.SE0();
    }

    @Override
    public final void glFramebufferRenderbuffer(int n, int n2, int n3, int n4) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glFramebufferRenderbuffer(36160, n2, 36161, n4);
        hs0_02.SE0();
    }

    @Override
    public final void glFramebufferTexture2D(int n, int n2, int n3, int n4, int n5) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glFramebufferTexture2D(36160, n2, 3553, n4, 0);
        hs0_02.SE0();
    }

    @Override
    public final int glGenBuffer() {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        int n = hs0_02.FJ0.glGenBuffer();
        this.SE0();
        return n;
    }

    @Override
    public final void glGenerateMipmap(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glGenerateMipmap(n);
        hs0_02.SE0();
    }

    @Override
    public final int glGenFramebuffer() {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        int n = hs0_02.FJ0.glGenFramebuffer();
        this.SE0();
        return n;
    }

    @Override
    public final int glGenRenderbuffer() {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        int n = hs0_02.FJ0.glGenRenderbuffer();
        this.SE0();
        return n;
    }

    @Override
    public final String glGetActiveAttrib(int n, int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        String string = hs0_02.FJ0.glGetActiveAttrib(n, n2, intBuffer, intBuffer2);
        this.SE0();
        return string;
    }

    @Override
    public final String glGetActiveUniform(int n, int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        String string = hs0_02.FJ0.glGetActiveUniform(n, n2, intBuffer, intBuffer2);
        this.SE0();
        return string;
    }

    @Override
    public final int glGetAttribLocation(int n, String string) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        int n2 = hs0_02.FJ0.glGetAttribLocation(n, string);
        this.SE0();
        return n2;
    }

    @Override
    public final void glGetFloatv(int n, FloatBuffer floatBuffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glGetFloatv(34047, floatBuffer);
        hs0_02.SE0();
    }

    @Override
    public final void glGetProgramiv(int n, int n2, IntBuffer intBuffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glGetProgramiv(n, n2, intBuffer);
        hs0_02.SE0();
    }

    @Override
    public final String glGetProgramInfoLog(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        String string = hs0_02.FJ0.glGetProgramInfoLog(n);
        this.SE0();
        return string;
    }

    @Override
    public final void glGetShaderiv(int n, int n2, IntBuffer intBuffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glGetShaderiv(n, 35713, intBuffer);
        hs0_02.SE0();
    }

    @Override
    public final String glGetShaderInfoLog(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        String string = hs0_02.FJ0.glGetShaderInfoLog(n);
        this.SE0();
        return string;
    }

    @Override
    public final int glGetUniformLocation(int n, String string) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        int n2 = hs0_02.FJ0.glGetUniformLocation(n, string);
        this.SE0();
        return n2;
    }

    @Override
    public final void glLinkProgram(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glLinkProgram(n);
        hs0_02.SE0();
    }

    @Override
    public final void glRenderbufferStorage(int n, int n2, int n3, int n4) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glRenderbufferStorage(36161, n2, n3, n4);
        hs0_02.SE0();
    }

    @Override
    public final void glShaderSource(int n, String string) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glShaderSource(n, string);
        hs0_02.SE0();
    }

    @Override
    public final void glTexParameteri(int n, int n2, int n3) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glTexParameteri(n, n2, n3);
        hs0_02.SE0();
    }

    @Override
    public final void glUniform1f(int n, float f) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glUniform1f(n, f);
        hs0_02.SE0();
    }

    @Override
    public final void glUniform1i(int n, int n2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glUniform1i(n, n2);
        hs0_02.SE0();
    }

    @Override
    public final void glUniform2f(int n, float f, float f2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glUniform2f(n, f, f2);
        hs0_02.SE0();
    }

    @Override
    public final void glUniform2i(int n, int n2, int n3) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glUniform2i(n, n2, n3);
        hs0_02.SE0();
    }

    @Override
    public final void glUniform3f(int n, float f, float f2, float f3) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glUniform3f(n, f, f2, f3);
        hs0_02.SE0();
    }

    @Override
    public final void glUniform3fv(int n, int n2, float[] fArray, int n3) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glUniform3fv(n, n2, fArray, 0);
        hs0_02.SE0();
    }

    @Override
    public final void glUniform3i(int n, int n2, int n3, int n4) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glUniform3i(n, n2, n3, n4);
        hs0_02.SE0();
    }

    @Override
    public final void glUniform4f(int n, float f, float f2, float f3, float f4) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glUniform4f(n, f, f2, f3, f4);
        hs0_02.SE0();
    }

    @Override
    public final void glUniform4i(int n, int n2, int n3, int n4, int n5) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glUniform4i(n, n2, n3, n4, n5);
        hs0_02.SE0();
    }

    @Override
    public final void glUniformMatrix3fv(int n, int n2, boolean bl, float[] fArray, int n3) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glUniformMatrix3fv(n, 1, false, fArray, 0);
        hs0_02.SE0();
    }

    @Override
    public final void glUniformMatrix4fv(int n, int n2, boolean bl, float[] fArray, int n3) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glUniformMatrix4fv(n, n2, false, fArray, 0);
        hs0_02.SE0();
    }

    @Override
    public final void glUseProgram(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.BJ0;
        ++hs0_02.lf;
        hs0_02.FJ0.glUseProgram(n);
        hs0_02.SE0();
    }

    @Override
    public final void glVertexAttrib2f(int n, float f, float f2) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glVertexAttrib2f(n, 0.0f, 0.0f);
        hs0_02.SE0();
    }

    @Override
    public final void glVertexAttribPointer(int n, int n2, int n3, boolean bl, int n4, Buffer buffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glVertexAttribPointer(n, n2, n3, bl, n4, buffer);
        hs0_02.SE0();
    }

    @Override
    public final void glVertexAttribPointer(int n, int n2, int n3, boolean bl, int n4, int n5) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.glVertexAttribPointer(n, n2, n3, bl, n4, n5);
        hs0_02.SE0();
    }

    @Override
    public final void PM(int n, IntBuffer intBuffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.B1;
        ++hs0_02.lf;
        hs0_02.FJ0.PM(n, intBuffer);
        hs0_02.SE0();
    }

    @Override
    public final void cC(int n) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.cC(n);
        hs0_02.SE0();
    }

    @Override
    public final void Bi(IntBuffer intBuffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.Bi(intBuffer);
        hs0_02.SE0();
    }

    @Override
    public final void iB(IntBuffer intBuffer) {
        Gl20StateTrackerWrapper hs0_02 = this;
        ++hs0_02.lf;
        hs0_02.FJ0.iB(intBuffer);
        hs0_02.SE0();
    }
}

