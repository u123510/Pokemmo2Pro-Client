/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gl;

import f.*;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public interface IGdxGl20 {
    public void glActiveTexture(int var1);

    public void glBindTexture(int var1, int var2);

    public void glBlendFunc(int var1, int var2);

    public void glClear(int var1);

    public void glClearColor(float var1, float var2, float var3, float var4);

    public void glCompressedTexImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, Buffer var8);

    public void glCullFace(int var1);

    public void glDeleteTexture(int var1);

    public void glDepthFunc(int var1);

    public void glDepthMask(boolean var1);

    public void glDepthRangef(float var1, float var2);

    public void glDisable(int var1);

    public void glDrawArrays(int var1, int var2, int var3);

    public void glDrawElements(int var1, int var2, int var3, Buffer var4);

    public void glEnable(int var1);

    public int glGenTexture();

    public int glGetError();

    public void glGetIntegerv(int var1, IntBuffer var2);

    public String glGetString(int var1);

    public void glPixelStorei(int var1, int var2);

    public void glReadPixels(int var1, int var2, int var3, int var4, int var5, int var6, Buffer var7);

    public void glScissor(int var1, int var2, int var3, int var4);

    public void glTexImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Buffer var9);

    public void glTexParameterf(int var1, int var2, float var3);

    public void glTexSubImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Buffer var9);

    public void glViewport(int var1, int var2, int var3, int var4);

    public void glAttachShader(int var1, int var2);

    public void glBindBuffer(int var1, int var2);

    public void glBindFramebuffer(int var1, int var2);

    public void glBindRenderbuffer(int var1, int var2);

    public void glBlendFuncSeparate(int var1, int var2, int var3, int var4);

    public void glBufferData(int var1, int var2, Buffer var3, int var4);

    public void glBufferSubData(int var1, int var2, int var3, Buffer var4);

    public int glCheckFramebufferStatus(int var1);

    public void glCompileShader(int var1);

    public int glCreateProgram();

    public int glCreateShader(int var1);

    public void glDeleteBuffer(int var1);

    public void glDeleteFramebuffer(int var1);

    public void glDeleteProgram(int var1);

    public void glDeleteRenderbuffer(int var1);

    public void glDeleteShader(int var1);

    public void glDisableVertexAttribArray(int var1);

    public void glDrawElements(int var1, int var2, int var3, int var4);

    public void glEnableVertexAttribArray(int var1);

    public void glFramebufferRenderbuffer(int var1, int var2, int var3, int var4);

    public void glFramebufferTexture2D(int var1, int var2, int var3, int var4, int var5);

    public int glGenBuffer();

    public void glGenerateMipmap(int var1);

    public int glGenFramebuffer();

    public int glGenRenderbuffer();

    public String glGetActiveAttrib(int var1, int var2, IntBuffer var3, IntBuffer var4);

    public String glGetActiveUniform(int var1, int var2, IntBuffer var3, IntBuffer var4);

    public int glGetAttribLocation(int var1, String var2);

    public void glGetFloatv(int var1, FloatBuffer var2);

    public void glGetProgramiv(int var1, int var2, IntBuffer var3);

    public String glGetProgramInfoLog(int var1);

    public void glGetShaderiv(int var1, int var2, IntBuffer var3);

    public String glGetShaderInfoLog(int var1);

    public int glGetUniformLocation(int var1, String var2);

    public void glLinkProgram(int var1);

    public void glRenderbufferStorage(int var1, int var2, int var3, int var4);

    public void glShaderSource(int var1, String var2);

    public void glTexParameteri(int var1, int var2, int var3);

    public void glUniform1f(int var1, float var2);

    public void glUniform1i(int var1, int var2);

    public void glUniform2f(int var1, float var2, float var3);

    public void glUniform2i(int var1, int var2, int var3);

    public void glUniform3f(int var1, float var2, float var3, float var4);

    public void glUniform3fv(int var1, int var2, float[] var3, int var4);

    public void glUniform3i(int var1, int var2, int var3, int var4);

    public void glUniform4f(int var1, float var2, float var3, float var4, float var5);

    public void glUniform4i(int var1, int var2, int var3, int var4, int var5);

    public void glUniformMatrix3fv(int var1, int var2, boolean var3, float[] var4, int var5);

    public void glUniformMatrix4fv(int var1, int var2, boolean var3, float[] var4, int var5);

    public void glUseProgram(int var1);

    public void glVertexAttrib2f(int var1, float var2, float var3);

    public void glVertexAttribPointer(int var1, int var2, int var3, boolean var4, int var5, Buffer var6);

    public void glVertexAttribPointer(int var1, int var2, int var3, boolean var4, int var5, int var6);
}

