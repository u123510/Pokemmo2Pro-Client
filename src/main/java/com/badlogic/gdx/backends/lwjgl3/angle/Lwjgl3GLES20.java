package com.badlogic.gdx.backends.lwjgl3.angle;

import com.badlogic.gdx.utils.BufferUtils;
import f.es_1;
import f.nf_1;
import f.sY;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengles.GLES20;

public class Lwjgl3GLES20 implements sY {
   private ByteBuffer buffer = null;
   private FloatBuffer floatBuffer = null;
   private IntBuffer intBuffer = null;

   private void ensureBufferCapacity(int var1) {
      ByteBuffer var2;
      if ((var2 = this.buffer) == null || ((Buffer)var2).capacity() < var1) {
         Lwjgl3GLES20 var10000 = this;
         Lwjgl3GLES20 var10001 = this;
         Lwjgl3GLES20 var10002 = this;
         Lwjgl3GLES20 var10003 = this;
         es_1 var10005 = BufferUtils.Iv0;
         ByteBuffer var3;
         ByteBuffer var10004 = var3 = ByteBuffer.allocateDirect(var1);
         var10004.order(ByteOrder.nativeOrder());
         var10003.buffer = var10004;
         var10002.floatBuffer = var3.asFloatBuffer();
         var10000.intBuffer = var10001.buffer.asIntBuffer();
      }

   }

   private FloatBuffer toFloatBuffer(float[] var1, int var2, int var3) {
      this.ensureBufferCapacity(var3 << 2);
      this.floatBuffer.clear();
      this.floatBuffer.limit(var3);
      this.floatBuffer.put(var1, var2, var3);
      this.floatBuffer.position(0);
      return this.floatBuffer;
   }

   private IntBuffer toIntBuffer(int[] var1, int var2, int var3) {
      this.ensureBufferCapacity(var3 << 2);
      this.intBuffer.clear();
      this.intBuffer.limit(var3);
      this.intBuffer.put(var1, var2, var3);
      this.intBuffer.position(0);
      return this.intBuffer;
   }

   public void glActiveTexture(int var1) {
      GLES20.glActiveTexture(var1);
   }

   public void glAttachShader(int var1, int var2) {
      GLES20.glAttachShader(var1, var2);
   }

   public void glBindAttribLocation(int var1, int var2, String var3) {
      GLES20.glBindAttribLocation(var1, var2, var3);
   }

   public void glBindBuffer(int var1, int var2) {
      GLES20.glBindBuffer(var1, var2);
   }

   public void glBindFramebuffer(int var1, int var2) {
      GLES20.glBindFramebuffer(var1, var2);
   }

   public void glBindRenderbuffer(int var1, int var2) {
      GLES20.glBindRenderbuffer(var1, var2);
   }

   public void glBindTexture(int var1, int var2) {
      GLES20.glBindTexture(var1, var2);
   }

   public void glBlendColor(float var1, float var2, float var3, float var4) {
      GLES20.glBlendColor(var1, var2, var3, var4);
   }

   public void glBlendEquation(int var1) {
      GLES20.glBlendEquation(var1);
   }

   public void glBlendEquationSeparate(int var1, int var2) {
      GLES20.glBlendEquationSeparate(var1, var2);
   }

   public void glBlendFunc(int var1, int var2) {
      GLES20.glBlendFunc(var1, var2);
   }

   public void glBlendFuncSeparate(int var1, int var2, int var3, int var4) {
      GLES20.glBlendFuncSeparate(var1, var2, var3, var4);
   }

   public void glBufferData(int var1, int var2, Buffer var3, int var4) {
      if (var3 == null) {
         GLES20.glBufferData(var1, (long)var2, var4);
      } else if (var3 instanceof ByteBuffer) {
         GLES20.glBufferData(var1, (ByteBuffer)var3, var4);
      } else if (var3 instanceof IntBuffer) {
         GLES20.glBufferData(var1, (IntBuffer)var3, var4);
      } else if (var3 instanceof FloatBuffer) {
         GLES20.glBufferData(var1, (FloatBuffer)var3, var4);
      } else {
         if (!(var3 instanceof ShortBuffer)) {
            throw new nf_1("Buffer data of type " + var3.getClass().getName() + " not supported in GLES20.");
         }

         GLES20.glBufferData(var1, (ShortBuffer)var3, var4);
      }

   }

   public void glBufferSubData(int var1, int var2, int var3, Buffer var4) {
      if (var4 != null) {
         if (var4 instanceof ByteBuffer) {
            long var5 = (long)var2;
            ByteBuffer var9 = (ByteBuffer)var4;
            GLES20.glBufferSubData(var1, var5, var9);
         } else if (var4 instanceof IntBuffer) {
            long var6 = (long)var2;
            IntBuffer var10 = (IntBuffer)var4;
            GLES20.glBufferSubData(var1, var6, var10);
         } else if (var4 instanceof FloatBuffer) {
            long var7 = (long)var2;
            FloatBuffer var11 = (FloatBuffer)var4;
            GLES20.glBufferSubData(var1, var7, var11);
         } else {
            if (!(var4 instanceof ShortBuffer)) {
               throw new nf_1("Buffer data of type " + var4.getClass().getName() + " not supported in GLES20.");
            }

            long var8 = (long)var2;
            ShortBuffer var12 = (ShortBuffer)var4;
            GLES20.glBufferSubData(var1, var8, var12);
         }

      } else {
         throw new nf_1("Using null for the data not possible, ");
      }
   }

   public int glCheckFramebufferStatus(int var1) {
      return GLES20.glCheckFramebufferStatus(var1);
   }

   public void glClear(int var1) {
      GLES20.glClear(var1);
   }

   public void glClearColor(float var1, float var2, float var3, float var4) {
      GLES20.glClearColor(var1, var2, var3, var4);
   }

   public void glClearDepthf(float var1) {
      GLES20.glClearDepthf(var1);
   }

   public void glClearStencil(int var1) {
      GLES20.glClearStencil(var1);
   }

   public void glColorMask(boolean var1, boolean var2, boolean var3, boolean var4) {
      GLES20.glColorMask(var1, var2, var3, var4);
   }

   public void glCompileShader(int var1) {
      GLES20.glCompileShader(var1);
   }

   public void glCompressedTexImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, Buffer var8) {
      if (var8 instanceof ByteBuffer var9) {
         GLES20.glCompressedTexImage2D(var1, var2, var3, var4, var5, var6, var9);
      } else {
         throw new nf_1("Can't use " + var8.getClass().getName() + " with this method. Use ByteBuffer instead.");
      }
   }

   public void glCompressedTexSubImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Buffer var9) {
      throw new nf_1("not implemented");
   }

   public void glCopyTexImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      GLES20.glCopyTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void glCopyTexSubImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      GLES20.glCopyTexSubImage2D(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public int glCreateProgram() {
      return GLES20.glCreateProgram();
   }

   public int glCreateShader(int var1) {
      return GLES20.glCreateShader(var1);
   }

   public void glCullFace(int var1) {
      GLES20.glCullFace(var1);
   }

   public void glDeleteBuffers(int var1, IntBuffer var2) {
      GLES20.glDeleteBuffers(var2);
   }

   public void glDeleteBuffer(int var1) {
      GLES20.glDeleteBuffers(var1);
   }

   public void glDeleteFramebuffers(int var1, IntBuffer var2) {
      GLES20.glDeleteFramebuffers(var2);
   }

   public void glDeleteFramebuffer(int var1) {
      GLES20.glDeleteFramebuffers(var1);
   }

   public void glDeleteProgram(int var1) {
      GLES20.glDeleteProgram(var1);
   }

   public void glDeleteRenderbuffers(int var1, IntBuffer var2) {
      GLES20.glDeleteRenderbuffers(var2);
   }

   public void glDeleteRenderbuffer(int var1) {
      GLES20.glDeleteRenderbuffers(var1);
   }

   public void glDeleteShader(int var1) {
      GLES20.glDeleteShader(var1);
   }

   public void glDeleteTextures(int var1, IntBuffer var2) {
      GLES20.glDeleteTextures(var2);
   }

   public void glDeleteTexture(int var1) {
      GLES20.glDeleteTextures(var1);
   }

   public void glDepthFunc(int var1) {
      GLES20.glDepthFunc(var1);
   }

   public void glDepthMask(boolean var1) {
      GLES20.glDepthMask(var1);
   }

   public void glDepthRangef(float var1, float var2) {
      GLES20.glDepthRangef(var1, var2);
   }

   public void glDetachShader(int var1, int var2) {
      GLES20.glDetachShader(var1, var2);
   }

   public void glDisable(int var1) {
      GLES20.glDisable(var1);
   }

   public void glDisableVertexAttribArray(int var1) {
      GLES20.glDisableVertexAttribArray(var1);
   }

   public void glDrawArrays(int var1, int var2, int var3) {
      GLES20.glDrawArrays(var1, var2, var3);
   }

   public void glDrawElements(int var1, int var2, int var3, Buffer var4) {
      if (var4 instanceof ShortBuffer && var3 == 5123) {
         GLES20.glDrawElements(var1, (ShortBuffer)var4);
      } else {
         boolean var5;
         if ((var5 = var4 instanceof ByteBuffer) && var3 == 5123) {
            GLES20.glDrawElements(var1, ((ByteBuffer)var4).asShortBuffer());
         } else {
            if (!var5 || var3 != 5121) {
               throw new nf_1("Can't use " + var4.getClass().getName() + " with this method. Use ShortBuffer or ByteBuffer instead.");
            }

            GLES20.glDrawElements(var1, (ByteBuffer)var4);
         }
      }

   }

   public void glEnable(int var1) {
      GLES20.glEnable(var1);
   }

   public void glEnableVertexAttribArray(int var1) {
      GLES20.glEnableVertexAttribArray(var1);
   }

   public void glFinish() {
      GLES20.glFinish();
   }

   public void glFlush() {
      GLES20.glFlush();
   }

   public void glFramebufferRenderbuffer(int var1, int var2, int var3, int var4) {
      GLES20.glFramebufferRenderbuffer(var1, var2, var3, var4);
   }

   public void glFramebufferTexture2D(int var1, int var2, int var3, int var4, int var5) {
      GLES20.glFramebufferTexture2D(var1, var2, var3, var4, var5);
   }

   public void glFrontFace(int var1) {
      GLES20.glFrontFace(var1);
   }

   public void glGenBuffers(int var1, IntBuffer var2) {
      GLES20.glGenBuffers(var2);
   }

   public int glGenBuffer() {
      return GLES20.glGenBuffers();
   }

   public void glGenFramebuffers(int var1, IntBuffer var2) {
      GLES20.glGenFramebuffers(var2);
   }

   public int glGenFramebuffer() {
      return GLES20.glGenFramebuffers();
   }

   public void glGenRenderbuffers(int var1, IntBuffer var2) {
      GLES20.glGenRenderbuffers(var2);
   }

   public int glGenRenderbuffer() {
      return GLES20.glGenRenderbuffers();
   }

   public void glGenTextures(int var1, IntBuffer var2) {
      GLES20.glGenTextures(var2);
   }

   public int glGenTexture() {
      return GLES20.glGenTextures();
   }

   public void glGenerateMipmap(int var1) {
      GLES20.glGenerateMipmap(var1);
   }

   public String glGetActiveAttrib(int var1, int var2, IntBuffer var3, IntBuffer var4) {
      return GLES20.glGetActiveAttrib(var1, var2, 256, var3, var4);
   }

   public String glGetActiveUniform(int var1, int var2, IntBuffer var3, IntBuffer var4) {
      return GLES20.glGetActiveUniform(var1, var2, 256, var3, var4);
   }

   public void glGetAttachedShaders(int var1, int var2, Buffer var3, IntBuffer var4) {
      GLES20.glGetAttachedShaders(var1, (IntBuffer)var3, var4);
   }

   public int glGetAttribLocation(int var1, String var2) {
      return GLES20.glGetAttribLocation(var1, var2);
   }

   public void glGetBooleanv(int var1, Buffer var2) {
      GLES20.glGetBooleanv(var1, (ByteBuffer)var2);
   }

   public void glGetBufferParameteriv(int var1, int var2, IntBuffer var3) {
      GLES20.glGetBufferParameteriv(var1, var2, var3);
   }

   public int glGetError() {
      return GLES20.glGetError();
   }

   public void glGetFloatv(int var1, FloatBuffer var2) {
      GLES20.glGetFloatv(var1, var2);
   }

   public void glGetFramebufferAttachmentParameteriv(int var1, int var2, int var3, IntBuffer var4) {
      GLES20.glGetFramebufferAttachmentParameteriv(var1, var2, var3, var4);
   }

   public void glGetIntegerv(int var1, IntBuffer var2) {
      GLES20.glGetIntegerv(var1, var2);
   }

   public String glGetProgramInfoLog(int var1) {
      ByteBuffer var2;
      ByteBuffer var10000 = var2 = ByteBuffer.allocateDirect(10240);
      var10000.order(ByteOrder.nativeOrder());
      ByteBuffer var10001 = ByteBuffer.allocateDirect(4);
      var10001.order(ByteOrder.nativeOrder());
      IntBuffer var4 = var10001.asIntBuffer();
      GLES20.glGetProgramInfoLog(var1, var4, var2);
      byte[] var3;
      var10000.get(var3 = new byte[var4.get(0)]);
      return new String(var3);
   }

   public void glGetProgramiv(int var1, int var2, IntBuffer var3) {
      GLES20.glGetProgramiv(var1, var2, var3);
   }

   public void glGetRenderbufferParameteriv(int var1, int var2, IntBuffer var3) {
      GLES20.glGetRenderbufferParameteriv(var1, var2, var3);
   }

   public String glGetShaderInfoLog(int var1) {
      ByteBuffer var2;
      ByteBuffer var10000 = var2 = ByteBuffer.allocateDirect(10240);
      var10000.order(ByteOrder.nativeOrder());
      ByteBuffer var10001 = ByteBuffer.allocateDirect(4);
      var10001.order(ByteOrder.nativeOrder());
      IntBuffer var4 = var10001.asIntBuffer();
      GLES20.glGetShaderInfoLog(var1, var4, var2);
      byte[] var3;
      var10000.get(var3 = new byte[var4.get(0)]);
      return new String(var3);
   }

   public void glGetShaderPrecisionFormat(int var1, int var2, IntBuffer var3, IntBuffer var4) {
      throw new UnsupportedOperationException("unsupported, won't implement");
   }

   public void glGetShaderiv(int var1, int var2, IntBuffer var3) {
      GLES20.glGetShaderiv(var1, var2, var3);
   }

   public String glGetString(int var1) {
      return GLES20.glGetString(var1);
   }

   public void glGetTexParameterfv(int var1, int var2, FloatBuffer var3) {
      GLES20.glGetTexParameterfv(var1, var2, var3);
   }

   public void glGetTexParameteriv(int var1, int var2, IntBuffer var3) {
      GLES20.glGetTexParameteriv(var1, var2, var3);
   }

   public int glGetUniformLocation(int var1, String var2) {
      return GLES20.glGetUniformLocation(var1, var2);
   }

   public void glGetUniformfv(int var1, int var2, FloatBuffer var3) {
      GLES20.glGetUniformfv(var1, var2, var3);
   }

   public void glGetUniformiv(int var1, int var2, IntBuffer var3) {
      GLES20.glGetUniformiv(var1, var2, var3);
   }

   public void glGetVertexAttribPointerv(int var1, int var2, Buffer var3) {
      throw new UnsupportedOperationException("unsupported, won't implement");
   }

   public void glGetVertexAttribfv(int var1, int var2, FloatBuffer var3) {
      GLES20.glGetVertexAttribfv(var1, var2, var3);
   }

   public void glGetVertexAttribiv(int var1, int var2, IntBuffer var3) {
      GLES20.glGetVertexAttribiv(var1, var2, var3);
   }

   public void glHint(int var1, int var2) {
      GLES20.glHint(var1, var2);
   }

   public boolean glIsBuffer(int var1) {
      return GLES20.glIsBuffer(var1);
   }

   public boolean glIsEnabled(int var1) {
      return GLES20.glIsEnabled(var1);
   }

   public boolean glIsFramebuffer(int var1) {
      return GLES20.glIsFramebuffer(var1);
   }

   public boolean glIsProgram(int var1) {
      return GLES20.glIsProgram(var1);
   }

   public boolean glIsRenderbuffer(int var1) {
      return GLES20.glIsRenderbuffer(var1);
   }

   public boolean glIsShader(int var1) {
      return GLES20.glIsShader(var1);
   }

   public boolean glIsTexture(int var1) {
      return GLES20.glIsTexture(var1);
   }

   public void glLineWidth(float var1) {
      GLES20.glLineWidth(var1);
   }

   public void glLinkProgram(int var1) {
      GLES20.glLinkProgram(var1);
   }

   public void glPixelStorei(int var1, int var2) {
      GLES20.glPixelStorei(var1, var2);
   }

   public void glPolygonOffset(float var1, float var2) {
      GLES20.glPolygonOffset(var1, var2);
   }

   public void glReadPixels(int var1, int var2, int var3, int var4, int var5, int var6, Buffer var7) {
      if (var7 instanceof ByteBuffer var8) {
         GLES20.glReadPixels(var1, var2, var3, var4, var5, var6, var8);
      } else if (var7 instanceof ShortBuffer var9) {
         GLES20.glReadPixels(var1, var2, var3, var4, var5, var6, var9);
      } else if (var7 instanceof IntBuffer var10) {
         GLES20.glReadPixels(var1, var2, var3, var4, var5, var6, var10);
      } else {
         if (!(var7 instanceof FloatBuffer)) {
            throw new nf_1("Can't use " + var7.getClass().getName() + " with this method. Use ByteBuffer, ShortBuffer, IntBuffer or FloatBuffer instead.");
         }

         FloatBuffer var11 = (FloatBuffer)var7;
         GLES20.glReadPixels(var1, var2, var3, var4, var5, var6, var11);
      }

   }

   public void glReleaseShaderCompiler() {
   }

   public void glRenderbufferStorage(int var1, int var2, int var3, int var4) {
      GLES20.glRenderbufferStorage(var1, var2, var3, var4);
   }

   public void glSampleCoverage(float var1, boolean var2) {
      GLES20.glSampleCoverage(var1, var2);
   }

   public void glScissor(int var1, int var2, int var3, int var4) {
      GLES20.glScissor(var1, var2, var3, var4);
   }

   public void glShaderBinary(int var1, IntBuffer var2, int var3, Buffer var4, int var5) {
      throw new UnsupportedOperationException("unsupported, won't implement");
   }

   public void glShaderSource(int var1, String var2) {
      GLES20.glShaderSource(var1, var2);
   }

   public void glStencilFunc(int var1, int var2, int var3) {
      GLES20.glStencilFunc(var1, var2, var3);
   }

   public void glStencilFuncSeparate(int var1, int var2, int var3, int var4) {
      GLES20.glStencilFuncSeparate(var1, var2, var3, var4);
   }

   public void glStencilMask(int var1) {
      GLES20.glStencilMask(var1);
   }

   public void glStencilMaskSeparate(int var1, int var2) {
      GLES20.glStencilMaskSeparate(var1, var2);
   }

   public void glStencilOp(int var1, int var2, int var3) {
      GLES20.glStencilOp(var1, var2, var3);
   }

   public void glStencilOpSeparate(int var1, int var2, int var3, int var4) {
      GLES20.glStencilOpSeparate(var1, var2, var3, var4);
   }

   public void glTexImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Buffer var9) {
      if (var9 == null) {
         GLES20.glTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8, (ByteBuffer)null);
      } else if (var9 instanceof ByteBuffer) {
         ByteBuffer var10 = (ByteBuffer)var9;
         GLES20.glTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var10);
      } else if (var9 instanceof ShortBuffer) {
         ShortBuffer var11 = (ShortBuffer)var9;
         GLES20.glTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var11);
      } else if (var9 instanceof IntBuffer) {
         IntBuffer var12 = (IntBuffer)var9;
         GLES20.glTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var12);
      } else {
         if (!(var9 instanceof FloatBuffer)) {
            throw new nf_1("Can't use " + var9.getClass().getName() + " with this method. Use ByteBuffer, ShortBuffer, IntBuffer, FloatBuffer or DoubleBuffer instead.");
         }

         FloatBuffer var13 = (FloatBuffer)var9;
         GLES20.glTexImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var13);
      }

   }

   public void glTexParameterf(int var1, int var2, float var3) {
      GLES20.glTexParameterf(var1, var2, var3);
   }

   public void glTexParameterfv(int var1, int var2, FloatBuffer var3) {
      GLES20.glTexParameterfv(var1, var2, var3);
   }

   public void glTexParameteri(int var1, int var2, int var3) {
      GLES20.glTexParameteri(var1, var2, var3);
   }

   public void glTexParameteriv(int var1, int var2, IntBuffer var3) {
      GLES20.glTexParameteriv(var1, var2, var3);
   }

   public void glTexSubImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Buffer var9) {
      if (var9 instanceof ByteBuffer var10) {
         GLES20.glTexSubImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var10);
      } else if (var9 instanceof ShortBuffer var11) {
         GLES20.glTexSubImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var11);
      } else if (var9 instanceof IntBuffer var12) {
         GLES20.glTexSubImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var12);
      } else {
         if (!(var9 instanceof FloatBuffer)) {
            throw new nf_1("Can't use " + var9.getClass().getName() + " with this method. Use ByteBuffer, ShortBuffer, IntBuffer, FloatBuffer or DoubleBuffer instead.");
         }

         FloatBuffer var13 = (FloatBuffer)var9;
         GLES20.glTexSubImage2D(var1, var2, var3, var4, var5, var6, var7, var8, var13);
      }

   }

   public void glUniform1f(int var1, float var2) {
      GLES20.glUniform1f(var1, var2);
   }

   public void glUniform1fv(int var1, int var2, FloatBuffer var3) {
      GLES20.glUniform1fv(var1, var3);
   }

   public void glUniform1fv(int var1, int var2, float[] var3, int var4) {
      GLES20.glUniform1fv(var1, this.toFloatBuffer(var3, var4, var2));
   }

   public void glUniform1i(int var1, int var2) {
      GLES20.glUniform1i(var1, var2);
   }

   public void glUniform1iv(int var1, int var2, IntBuffer var3) {
      GLES20.glUniform1iv(var1, var3);
   }

   public void glUniform1iv(int var1, int var2, int[] var3, int var4) {
      GLES20.glUniform1iv(var1, this.toIntBuffer(var3, var4, var2));
   }

   public void glUniform2f(int var1, float var2, float var3) {
      GLES20.glUniform2f(var1, var2, var3);
   }

   public void glUniform2fv(int var1, int var2, FloatBuffer var3) {
      GLES20.glUniform2fv(var1, var3);
   }

   public void glUniform2fv(int var1, int var2, float[] var3, int var4) {
      GLES20.glUniform2fv(var1, this.toFloatBuffer(var3, var4, var2 << 1));
   }

   public void glUniform2i(int var1, int var2, int var3) {
      GLES20.glUniform2i(var1, var2, var3);
   }

   public void glUniform2iv(int var1, int var2, IntBuffer var3) {
      GLES20.glUniform2iv(var1, var3);
   }

   public void glUniform2iv(int var1, int var2, int[] var3, int var4) {
      GLES20.glUniform2iv(var1, this.toIntBuffer(var3, var4, var2 << 1));
   }

   public void glUniform3f(int var1, float var2, float var3, float var4) {
      GLES20.glUniform3f(var1, var2, var3, var4);
   }

   public void glUniform3fv(int var1, int var2, FloatBuffer var3) {
      GLES20.glUniform3fv(var1, var3);
   }

   public void glUniform3fv(int var1, int var2, float[] var3, int var4) {
      GLES20.glUniform3fv(var1, this.toFloatBuffer(var3, var4, var2 * 3));
   }

   public void glUniform3i(int var1, int var2, int var3, int var4) {
      GLES20.glUniform3i(var1, var2, var3, var4);
   }

   public void glUniform3iv(int var1, int var2, IntBuffer var3) {
      GLES20.glUniform3iv(var1, var3);
   }

   public void glUniform3iv(int var1, int var2, int[] var3, int var4) {
      GLES20.glUniform3iv(var1, this.toIntBuffer(var3, var4, var2 * 3));
   }

   public void glUniform4f(int var1, float var2, float var3, float var4, float var5) {
      GLES20.glUniform4f(var1, var2, var3, var4, var5);
   }

   public void glUniform4fv(int var1, int var2, FloatBuffer var3) {
      GLES20.glUniform4fv(var1, var3);
   }

   public void glUniform4fv(int var1, int var2, float[] var3, int var4) {
      GLES20.glUniform4fv(var1, this.toFloatBuffer(var3, var4, var2 << 2));
   }

   public void glUniform4i(int var1, int var2, int var3, int var4, int var5) {
      GLES20.glUniform4i(var1, var2, var3, var4, var5);
   }

   public void glUniform4iv(int var1, int var2, IntBuffer var3) {
      GLES20.glUniform4iv(var1, var3);
   }

   public void glUniform4iv(int var1, int var2, int[] var3, int var4) {
      GLES20.glUniform4iv(var1, this.toIntBuffer(var3, var4, var2 << 2));
   }

   public void glUniformMatrix2fv(int var1, int var2, boolean var3, FloatBuffer var4) {
      GLES20.glUniformMatrix2fv(var1, var3, var4);
   }

   public void glUniformMatrix2fv(int var1, int var2, boolean var3, float[] var4, int var5) {
      Lwjgl3GLES20 var10001 = this;
      int var6 = var2 << 2;
      GLES20.glUniformMatrix2fv(var1, var3, var10001.toFloatBuffer(var4, var5, var6));
   }

   public void glUniformMatrix3fv(int var1, int var2, boolean var3, FloatBuffer var4) {
      GLES20.glUniformMatrix3fv(var1, var3, var4);
   }

   public void glUniformMatrix3fv(int var1, int var2, boolean var3, float[] var4, int var5) {
      Lwjgl3GLES20 var10001 = this;
      int var6 = var2 * 9;
      GLES20.glUniformMatrix3fv(var1, var3, var10001.toFloatBuffer(var4, var5, var6));
   }

   public void glUniformMatrix4fv(int var1, int var2, boolean var3, FloatBuffer var4) {
      GLES20.glUniformMatrix4fv(var1, var3, var4);
   }

   public void glUniformMatrix4fv(int var1, int var2, boolean var3, float[] var4, int var5) {
      Lwjgl3GLES20 var10001 = this;
      int var6 = var2 << 4;
      GLES20.glUniformMatrix4fv(var1, var3, var10001.toFloatBuffer(var4, var5, var6));
   }

   public void glUseProgram(int var1) {
      GLES20.glUseProgram(var1);
   }

   public void glValidateProgram(int var1) {
      GLES20.glValidateProgram(var1);
   }

   public void glVertexAttrib1f(int var1, float var2) {
      GLES20.glVertexAttrib1f(var1, var2);
   }

   public void glVertexAttrib1fv(int var1, FloatBuffer var2) {
      GLES20.glVertexAttrib1f(var1, var2.get());
   }

   public void glVertexAttrib2f(int var1, float var2, float var3) {
      GLES20.glVertexAttrib2f(var1, var2, var3);
   }

   public void glVertexAttrib2fv(int var1, FloatBuffer var2) {
      float var3 = var2.get();
      GLES20.glVertexAttrib2f(var1, var3, var2.get());
   }

   public void glVertexAttrib3f(int var1, float var2, float var3, float var4) {
      GLES20.glVertexAttrib3f(var1, var2, var3, var4);
   }

   public void glVertexAttrib3fv(int var1, FloatBuffer var2) {
      int var10000 = var1;
      float var3 = var2.get();
      float var4 = var2.get();
      float var5 = var2.get();
      GLES20.glVertexAttrib3f(var10000, var3, var4, var5);
   }

   public void glVertexAttrib4f(int var1, float var2, float var3, float var4, float var5) {
      GLES20.glVertexAttrib4f(var1, var2, var3, var4, var5);
   }

   public void glVertexAttrib4fv(int var1, FloatBuffer var2) {
      int var10000 = var1;
      FloatBuffer var10001 = var2;
      float var4 = var2.get();
      float var5 = var2.get();
      float var6 = var2.get();
      float var3 = var10001.get();
      GLES20.glVertexAttrib4f(var10000, var4, var5, var6, var3);
   }

   public void glVertexAttribPointer(int var1, int var2, int var3, boolean var4, int var5, Buffer var6) {
      if (var6 instanceof ByteBuffer) {
         if (var3 != 5120 && var3 != 5121) {
            if (var3 != 5122 && var3 != 5123) {
               if (var3 != 5126) {
                  String var10002 = var6.getClass().getName();
                  throw new nf_1("Can't use " + var10002 + " with type " + var3 + " with this method. Use ByteBuffer and one of GL_BYTE, GL_UNSIGNED_BYTE, GL_SHORT, GL_UNSIGNED_SHORT or GL_FLOAT for type.");
               }

               FloatBuffer var9 = ((ByteBuffer)var6).asFloatBuffer();
               GLES20.glVertexAttribPointer(var1, var2, var3, var4, var5, var9);
            } else {
               ShortBuffer var8 = ((ByteBuffer)var6).asShortBuffer();
               GLES20.glVertexAttribPointer(var1, var2, var3, var4, var5, var8);
            }
         } else {
            ByteBuffer var7 = (ByteBuffer)var6;
            GLES20.glVertexAttribPointer(var1, var2, var3, var4, var5, var7);
         }
      } else {
         if (!(var6 instanceof FloatBuffer)) {
            throw new nf_1("Can't use " + var6.getClass().getName() + " with this method. Use ByteBuffer instead.");
         }

         if (var3 != 5126) {
            String var11 = var6.getClass().getName();
            throw new nf_1("Can't use " + var11 + " with type " + var3 + " with this method.");
         }

         FloatBuffer var10 = (FloatBuffer)var6;
         GLES20.glVertexAttribPointer(var1, var2, var3, var4, var5, var10);
      }

   }

   public void glViewport(int var1, int var2, int var3, int var4) {
      GLES20.glViewport(var1, var2, var3, var4);
   }

   public void glDrawElements(int var1, int var2, int var3, int var4) {
      long var5 = (long)var4;
      GLES20.glDrawElements(var1, var2, var3, var5);
   }

   public void glVertexAttribPointer(int var1, int var2, int var3, boolean var4, int var5, int var6) {
      long var7 = (long)var6;
      GLES20.glVertexAttribPointer(var1, var2, var3, var4, var5, var7);
   }
}
