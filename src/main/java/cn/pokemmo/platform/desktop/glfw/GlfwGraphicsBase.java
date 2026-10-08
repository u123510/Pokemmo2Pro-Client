package cn.pokemmo.platform.desktop.glfw;

import f.*;


import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;

public class GlfwGraphicsBase implements sY {
   public ByteBuffer yD = null;
   public FloatBuffer Dm0 = null;

   @Override
   public final void glActiveTexture(int var1) {
      GL13.glActiveTexture(var1);
   }

   @Override
   public final void glAttachShader(int var1, int var2) {
      GL20.glAttachShader(var1, var2);
   }

   @Override
   public final void glBindBuffer(int var1, int var2) {
      GL15.glBindBuffer(var1, var2);
   }

   @Override
   public void glBindFramebuffer(int var1, int var2) {
      EXTFramebufferObject.glBindFramebufferEXT(36160, var2);
   }

   @Override
   public void glBindRenderbuffer(int var1, int var2) {
      EXTFramebufferObject.glBindRenderbufferEXT(36161, var2);
   }

   @Override
   public final void glBindTexture(int var1, int var2) {
      GL11.glBindTexture(var1, var2);
   }

   @Override
   public final void glBlendFunc(int var1, int var2) {
      GL11.glBlendFunc(var1, var2);
   }

   @Override
   public final void glBlendFuncSeparate(int var1, int var2, int var3, int var4) {
      GL14.glBlendFuncSeparate(var1, var2, var3, var4);
   }

   @Override
   public final void glBufferData(int var1, int var2, Buffer var3, int var4) {
      if (var3 == null) {
         GL15.glBufferData(var1, var2, var4);
      } else if (var3 instanceof ByteBuffer) {
         GL15.glBufferData(var1, (ByteBuffer)var3, var4);
      } else if (var3 instanceof IntBuffer) {
         GL15.glBufferData(var1, (IntBuffer)var3, var4);
      } else if (var3 instanceof FloatBuffer) {
         GL15.glBufferData(var1, (FloatBuffer)var3, var4);
      } else if (var3 instanceof DoubleBuffer) {
         GL15.glBufferData(var1, (DoubleBuffer)var3, var4);
      } else if (var3 instanceof ShortBuffer) {
         GL15.glBufferData(var1, (ShortBuffer)var3, var4);
      }
   }

   @Override
   public final void glBufferSubData(int var1, int var2, int var3, Buffer var4) {
      byte var5 = 0;
      if (var4 != null) {
         if (var4 instanceof ByteBuffer) {
            long var6 = var5;
            ByteBuffer var11 = (ByteBuffer)var4;
            GL15.glBufferSubData(var1, var6, var11);
         } else if (var4 instanceof IntBuffer) {
            long var7 = var5;
            IntBuffer var12 = (IntBuffer)var4;
            GL15.glBufferSubData(var1, var7, var12);
         } else if (var4 instanceof FloatBuffer) {
            long var8 = var5;
            FloatBuffer var13 = (FloatBuffer)var4;
            GL15.glBufferSubData(var1, var8, var13);
         } else if (var4 instanceof DoubleBuffer) {
            long var9 = var5;
            DoubleBuffer var14 = (DoubleBuffer)var4;
            GL15.glBufferSubData(var1, var9, var14);
         } else if (var4 instanceof ShortBuffer) {
            long var10 = var5;
            ShortBuffer var15 = (ShortBuffer)var4;
            GL15.glBufferSubData(var1, var10, var15);
         }
      } else {
         throw new nf_1("Using null for the data not possible, blame LWJGL");
      }
   }

   @Override
   public int glCheckFramebufferStatus(int var1) {
      return EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
   }

   @Override
   public final void glClear(int var1) {
      GL11.glClear(var1);
   }

   @Override
   public final void glClearColor(float var1, float var2, float var3, float var4) {
      GL11.glClearColor(var1, var2, var3, var4);
   }

   @Override
   public final void glCompileShader(int var1) {
      GL20.glCompileShader(var1);
   }

   @Override
   public final void glCompressedTexImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, Buffer var8) {
      byte var9 = 0;
      if (var8 instanceof ByteBuffer) {
         ByteBuffer var10 = (ByteBuffer)var8;
         GL13.glCompressedTexImage2D(var1, var2, var3, var4, var5, var9, var10);
      } else {
         throw new nf_1("Can't use " + var8.getClass().getName() + " with this method. Use ByteBuffer instead.");
      }
   }

   @Override
   public final int glCreateProgram() {
      return GL20.glCreateProgram();
   }

   @Override
   public final int glCreateShader(int var1) {
      return GL20.glCreateShader(var1);
   }

   @Override
   public final void glCullFace(int var1) {
      GL11.glCullFace(var1);
   }

   @Override
   public final void glDeleteBuffer(int var1) {
      GL15.glDeleteBuffers(var1);
   }

   @Override
   public void glDeleteFramebuffer(int var1) {
      EXTFramebufferObject.glDeleteFramebuffersEXT(var1);
   }

   @Override
   public final void glDeleteProgram(int var1) {
      GL20.glDeleteProgram(var1);
   }

   @Override
   public void glDeleteRenderbuffer(int var1) {
      EXTFramebufferObject.glDeleteRenderbuffersEXT(var1);
   }

   @Override
   public final void glDeleteShader(int var1) {
      GL20.glDeleteShader(var1);
   }

   @Override
   public final void glDeleteTexture(int var1) {
      GL11.glDeleteTextures(var1);
   }

   @Override
   public final void glDepthFunc(int var1) {
      GL11.glDepthFunc(var1);
   }

   @Override
   public final void glDepthMask(boolean var1) {
      GL11.glDepthMask(var1);
   }

   @Override
   public final void glDepthRangef(float var1, float var2) {
      GL11.glDepthRange(var1, var2);
   }

   @Override
   public final void glDisable(int var1) {
      GL11.glDisable(var1);
   }

   @Override
   public final void glDisableVertexAttribArray(int var1) {
      GL20.glDisableVertexAttribArray(var1);
   }

   @Override
   public final void glDrawArrays(int var1, int var2, int var3) {
      GL11.glDrawArrays(var1, var2, var3);
   }

   @Override
   public final void glDrawElements(int var1, int var2, int var3, Buffer var4) {
      ShortBuffer var5;
      ShortBuffer var10000 = var5 = (ShortBuffer)var4;
      int var6 = var5.limit();
      ((Buffer)var5).limit(var5.position() + var2);
      GL11.glDrawElements(var1, var5);
      ((Buffer)var10000).limit(var6);
   }

   @Override
   public final void glEnable(int var1) {
      GL11.glEnable(var1);
   }

   @Override
   public final void glEnableVertexAttribArray(int var1) {
      GL20.glEnableVertexAttribArray(var1);
   }

   @Override
   public void glFramebufferRenderbuffer(int var1, int var2, int var3, int var4) {
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, var2, 36161, var4);
   }

   @Override
   public void glFramebufferTexture2D(int var1, int var2, int var3, int var4, int var5) {
      EXTFramebufferObject.glFramebufferTexture2DEXT(36160, var2, 3553, var4, 0);
   }

   @Override
   public final int glGenBuffer() {
      return GL15.glGenBuffers();
   }

   @Override
   public int glGenFramebuffer() {
      return EXTFramebufferObject.glGenFramebuffersEXT();
   }

   @Override
   public int glGenRenderbuffer() {
      return EXTFramebufferObject.glGenRenderbuffersEXT();
   }

   @Override
   public final int glGenTexture() {
      return GL11.glGenTextures();
   }

   @Override
   public void glGenerateMipmap(int var1) {
      EXTFramebufferObject.glGenerateMipmapEXT(var1);
   }

   @Override
   public final String glGetActiveAttrib(int var1, int var2, IntBuffer var3, IntBuffer var4) {
      return GL20.glGetActiveAttrib(var1, var2, 256, var3, var4);
   }

   @Override
   public final String glGetActiveUniform(int var1, int var2, IntBuffer var3, IntBuffer var4) {
      return GL20.glGetActiveUniform(var1, var2, 256, var3, var4);
   }

   @Override
   public final int glGetAttribLocation(int var1, String var2) {
      return GL20.glGetAttribLocation(var1, var2);
   }

   @Override
   public final int glGetError() {
      return GL11.glGetError();
   }

   @Override
   public final void glGetFloatv(int var1, FloatBuffer var2) {
      GL11.glGetFloatv(34047, var2);
   }

   @Override
   public final void glGetIntegerv(int var1, IntBuffer var2) {
      GL11.glGetIntegerv(var1, var2);
   }

   @Override
   public final String glGetProgramInfoLog(int var1) {
      ByteBuffer var2;
      ByteBuffer var10000 = var2 = ByteBuffer.allocateDirect(10240);
      var10000.order(ByteOrder.nativeOrder());
      ByteBuffer var10001 = ByteBuffer.allocateDirect(4);
      var10001.order(ByteOrder.nativeOrder());
      IntBuffer var4 = var10001.asIntBuffer();
      GL20.glGetProgramInfoLog(var1, var4, var2);
      byte[] var3;
      var10000.get(var3 = new byte[var4.get(0)]);
      return new String(var3);
   }

   @Override
   public final void glGetProgramiv(int var1, int var2, IntBuffer var3) {
      GL20.glGetProgramiv(var1, var2, var3);
   }

   @Override
   public final String glGetShaderInfoLog(int var1) {
      ByteBuffer var2;
      ByteBuffer var10000 = var2 = ByteBuffer.allocateDirect(10240);
      var10000.order(ByteOrder.nativeOrder());
      ByteBuffer var10001 = ByteBuffer.allocateDirect(4);
      var10001.order(ByteOrder.nativeOrder());
      IntBuffer var4 = var10001.asIntBuffer();
      GL20.glGetShaderInfoLog(var1, var4, var2);
      byte[] var3;
      var10000.get(var3 = new byte[var4.get(0)]);
      return new String(var3);
   }

   @Override
   public final void glGetShaderiv(int var1, int var2, IntBuffer var3) {
      GL20.glGetShaderiv(var1, 35713, var3);
   }

   @Override
   public final String glGetString(int var1) {
      return GL11.glGetString(var1);
   }

   @Override
   public final int glGetUniformLocation(int var1, String var2) {
      return GL20.glGetUniformLocation(var1, var2);
   }

   @Override
   public final void glLinkProgram(int var1) {
      GL20.glLinkProgram(var1);
   }

   @Override
   public final void glPixelStorei(int var1, int var2) {
      GL11.glPixelStorei(var1, var2);
   }

   @Override
   public final void glReadPixels(int var1, int var2, int var3, int var4, int var5, int var6, Buffer var7) {
      byte var8 = 0;
      short var9 = 6408;
      short var10 = 5121;
      ByteBuffer var11 = (ByteBuffer)var7;
      GL11.glReadPixels(0, var8, var3, var4, var9, var10, var11);
   }

   @Override
   public void glRenderbufferStorage(int var1, int var2, int var3, int var4) {
      EXTFramebufferObject.glRenderbufferStorageEXT(36161, var2, var3, var4);
   }

   @Override
   public final void glScissor(int var1, int var2, int var3, int var4) {
      GL11.glScissor(var1, var2, var3, var4);
   }

   @Override
   public final void glShaderSource(int var1, String var2) {
      GL20.glShaderSource(var1, var2);
   }

   @Override
   public final void glTexImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Buffer var9) {
      byte var10 = 0;
      if (var9 == null) {
         GL11.glTexImage2D(var1, var2, var3, var4, var5, var10, var7, var8, (ByteBuffer)null);
      } else if (var9 instanceof ByteBuffer) {
         ByteBuffer var11 = (ByteBuffer)var9;
         GL11.glTexImage2D(var1, var2, var3, var4, var5, var10, var7, var8, var11);
      } else if (var9 instanceof ShortBuffer) {
         ShortBuffer var12 = (ShortBuffer)var9;
         GL11.glTexImage2D(var1, var2, var3, var4, var5, var10, var7, var8, var12);
      } else if (var9 instanceof IntBuffer) {
         IntBuffer var13 = (IntBuffer)var9;
         GL11.glTexImage2D(var1, var2, var3, var4, var5, var10, var7, var8, var13);
      } else if (var9 instanceof FloatBuffer) {
         FloatBuffer var14 = (FloatBuffer)var9;
         GL11.glTexImage2D(var1, var2, var3, var4, var5, var10, var7, var8, var14);
      } else {
         if (!(var9 instanceof DoubleBuffer)) {
            throw new nf_1(
               "Can't use "
                  + var9.getClass().getName()
                  + " with this method. Use ByteBuffer, ShortBuffer, IntBuffer, FloatBuffer or DoubleBuffer instead. Blame LWJGL"
            );
         }

         DoubleBuffer var15 = (DoubleBuffer)var9;
         GL11.glTexImage2D(var1, var2, var3, var4, var5, var10, var7, var8, var15);
      }
   }

   @Override
   public final void glTexParameterf(int var1, int var2, float var3) {
      GL11.glTexParameterf(3553, 34046, var3);
   }

   @Override
   public final void glTexParameteri(int var1, int var2, int var3) {
      GL11.glTexParameteri(var1, var2, var3);
   }

   @Override
   public final void glTexSubImage2D(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Buffer var9) {
      byte var10 = 0;
      if (var9 instanceof ByteBuffer) {
         ByteBuffer var11 = (ByteBuffer)var9;
         GL11.glTexSubImage2D(var1, var10, var3, var4, var5, var6, var7, var8, var11);
      } else if (var9 instanceof ShortBuffer) {
         ShortBuffer var12 = (ShortBuffer)var9;
         GL11.glTexSubImage2D(var1, var10, var3, var4, var5, var6, var7, var8, var12);
      } else if (var9 instanceof IntBuffer) {
         IntBuffer var13 = (IntBuffer)var9;
         GL11.glTexSubImage2D(var1, var10, var3, var4, var5, var6, var7, var8, var13);
      } else if (var9 instanceof FloatBuffer) {
         FloatBuffer var14 = (FloatBuffer)var9;
         GL11.glTexSubImage2D(var1, var10, var3, var4, var5, var6, var7, var8, var14);
      } else {
         if (!(var9 instanceof DoubleBuffer)) {
            throw new nf_1(
               "Can't use "
                  + var9.getClass().getName()
                  + " with this method. Use ByteBuffer, ShortBuffer, IntBuffer, FloatBuffer or DoubleBuffer instead. Blame LWJGL"
            );
         }

         DoubleBuffer var15 = (DoubleBuffer)var9;
         GL11.glTexSubImage2D(var1, var10, var3, var4, var5, var6, var7, var8, var15);
      }
   }

   @Override
   public final void glUniform1f(int var1, float var2) {
      GL20.glUniform1f(var1, var2);
   }

   @Override
   public final void glUniform1i(int var1, int var2) {
      GL20.glUniform1i(var1, var2);
   }

   @Override
   public final void glUniform2f(int var1, float var2, float var3) {
      GL20.glUniform2f(var1, var2, var3);
   }

   @Override
   public final void glUniform2i(int var1, int var2, int var3) {
      GL20.glUniform2i(var1, var2, var3);
   }

   @Override
   public final void glUniform3f(int var1, float var2, float var3, float var4) {
      GL20.glUniform3f(var1, var2, var3, var4);
   }

   @Override
   public final void glUniform3fv(int var1, int var2, float[] var3, int var4) {
      GL20.glUniform3fv(var1, this.Io0(var3, var2 * 3));
   }

   @Override
   public final void glUniform3i(int var1, int var2, int var3, int var4) {
      GL20.glUniform3i(var1, var2, var3, var4);
   }

   @Override
   public final void glUniform4f(int var1, float var2, float var3, float var4, float var5) {
      GL20.glUniform4f(var1, var2, var3, var4, var5);
   }

   @Override
   public final void glUniform4i(int var1, int var2, int var3, int var4, int var5) {
      GL20.glUniform4i(var1, var2, var3, var4, var5);
   }

   @Override
   public final void glUniformMatrix3fv(int var1, int var2, boolean var3, float[] var4, int var5) {
      GL20.glUniformMatrix3fv(var1, false, this.Io0(var4, 9));
   }

   @Override
   public final void glUniformMatrix4fv(int var1, int var2, boolean var3, float[] var4, int var5) {
      GL20.glUniformMatrix4fv(var1, false, this.Io0(var4, var2 << 4));
   }

   @Override
   public final void glUseProgram(int var1) {
      GL20.glUseProgram(var1);
   }

   @Override
   public final void glVertexAttrib2f(int var1, float var2, float var3) {
      GL20.glVertexAttrib2f(var1, 0.0F, 0.0F);
   }

   @Override
   public final void glVertexAttribPointer(int var1, int var2, int var3, boolean var4, int var5, Buffer var6) {
      if (var6 instanceof ByteBuffer) {
         if (var3 == 5120 || var3 == 5121) {
            ByteBuffer var9 = (ByteBuffer)var6;
            GL20.glVertexAttribPointer(var1, var2, var3, var4, var5, var9);
         } else if (var3 != 5122 && var3 != 5123) {
            if (var3 != 5126) {
               throw new nf_1(
                  "Can't use "
                     + var6.getClass().getName()
                     + " with type "
                     + var3
                     + " with this method. Use ByteBuffer and one of GL_BYTE, GL_UNSIGNED_BYTE, GL_SHORT, GL_UNSIGNED_SHORT or GL_FLOAT for type. Blame LWJGL"
               );
            }

            FloatBuffer var8 = ((ByteBuffer)var6).asFloatBuffer();
            GL20.glVertexAttribPointer(var1, var2, var3, var4, var5, var8);
         } else {
            ShortBuffer var7 = ((ByteBuffer)var6).asShortBuffer();
            GL20.glVertexAttribPointer(var1, var2, var3, var4, var5, var7);
         }
      } else {
         if (!(var6 instanceof FloatBuffer)) {
            throw new nf_1("Can't use " + var6.getClass().getName() + " with this method. Use ByteBuffer instead. Blame LWJGL");
         }

         if (var3 != 5126) {
            throw new nf_1("Can't use " + var6.getClass().getName() + " with type " + var3 + " with this method.");
         }

         FloatBuffer var10 = (FloatBuffer)var6;
         GL20.glVertexAttribPointer(var1, var2, var3, var4, var5, var10);
      }
   }

   @Override
   public final void glViewport(int var1, int var2, int var3, int var4) {
      GL11.glViewport(var1, var2, var3, var4);
   }

   @Override
   public final void glDrawElements(int var1, int var2, int var3, int var4) {
      long var5 = var4;
      GL11.glDrawElements(var1, var2, 5123, var5);
   }

   @Override
   public final void glVertexAttribPointer(int var1, int var2, int var3, boolean var4, int var5, int var6) {
      long var7 = var6;
      GL20.glVertexAttribPointer(var1, var2, var3, var4, var5, var7);
   }

   public final FloatBuffer Io0(float[] var1, int var2) {
      byte var3 = 0;
      int var4 = var2 << 2;
      ByteBuffer var5 = this.yD;
      if (this.yD == null || var5.capacity() < var4) {
         ByteBuffer var6;
         ByteBuffer var10003 = var6 = ByteBuffer.allocateDirect(var4);
         var10003.order(ByteOrder.nativeOrder());
         this.yD = var10003;
         this.Dm0 = var6.asFloatBuffer();
         this.yD.asIntBuffer();
      }

      ((Buffer)this.Dm0).clear();
      ((Buffer)this.Dm0).limit(var2);
      this.Dm0.put(var1, var3, var2);
      ((Buffer)this.Dm0).position(0);
      return this.Dm0;
   }
}
