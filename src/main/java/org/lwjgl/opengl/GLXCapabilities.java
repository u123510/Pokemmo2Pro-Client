package org.lwjgl.opengl;

import java.util.Set;
import org.lwjgl.system.Checks;
import org.lwjgl.system.FunctionProvider;

public final class GLXCapabilities {
   public final long glXQueryExtensionsString;
   public final long glXGetClientString;
   public final long glXQueryServerString;
   public final long glXGetCurrentDisplay;
   public final long glXGetFBConfigs;
   public final long glXChooseFBConfig;
   public final long glXGetFBConfigAttrib;
   public final long glXGetVisualFromFBConfig;
   public final long glXCreateWindow;
   public final long glXCreatePixmap;
   public final long glXDestroyPixmap;
   public final long glXCreatePbuffer;
   public final long glXDestroyPbuffer;
   public final long glXQueryDrawable;
   public final long glXCreateNewContext;
   public final long glXMakeContextCurrent;
   public final long glXGetCurrentReadDrawable;
   public final long glXQueryContext;
   public final long glXSelectEvent;
   public final long glXGetSelectedEvent;
   public final long glXGetProcAddress;
   public final long glXBlitContextFramebufferAMD;
   public final long glXCreateAssociatedContextAMD;
   public final long glXCreateAssociatedContextAttribsAMD;
   public final long glXDeleteAssociatedContextAMD;
   public final long glXGetContextGPUIDAMD;
   public final long glXGetCurrentAssociatedContextAMD;
   public final long glXGetGPUIDsAMD;
   public final long glXGetGPUInfoAMD;
   public final long glXMakeAssociatedContextCurrentAMD;
   public final long glXCreateContextAttribsARB;
   public final long glXGetProcAddressARB;
   public final long glXGetCurrentDisplayEXT;
   public final long glXQueryContextInfoEXT;
   public final long glXGetContextIDEXT;
   public final long glXImportContextEXT;
   public final long glXFreeContextEXT;
   public final long glXSwapIntervalEXT;
   public final long glXBindTexImageEXT;
   public final long glXReleaseTexImageEXT;
   public final long glXCopyBufferSubDataNV;
   public final long glXNamedCopyBufferSubDataNV;
   public final long glXCopyImageSubDataNV;
   public final long glXDelayBeforeSwapNV;
   public final long glXJoinSwapGroupNV;
   public final long glXBindSwapBarrierNV;
   public final long glXQuerySwapGroupNV;
   public final long glXQueryMaxSwapGroupsNV;
   public final long glXQueryFrameCountNV;
   public final long glXResetFrameCountNV;
   public final long glXMakeCurrentReadSGI;
   public final long glXGetCurrentReadDrawableSGI;
   public final long glXSwapIntervalSGI;
   public final long glXGetVideoSyncSGI;
   public final long glXWaitVideoSyncSGI;
   public final long glXGetFBConfigAttribSGIX;
   public final long glXChooseFBConfigSGIX;
   public final long glXCreateGLXPixmapWithConfigSGIX;
   public final long glXCreateContextWithConfigSGIX;
   public final long glXGetVisualFromFBConfigSGIX;
   public final long glXGetFBConfigFromVisualSGIX;
   public final long glXCreateGLXPbufferSGIX;
   public final long glXDestroyGLXPbufferSGIX;
   public final long glXQueryGLXPbufferSGIX;
   public final long glXSelectEventSGIX;
   public final long glXGetSelectedEventSGIX;
   public final long glXBindSwapBarrierSGIX;
   public final long glXQueryMaxSwapBarriersSGIX;
   public final long glXJoinSwapGroupSGIX;
   public final boolean GLX11;
   public final boolean GLX12;
   public final boolean GLX13;
   public final boolean GLX14;
   public final boolean GLX_AMD_gpu_association;
   public final boolean GLX_ARB_context_flush_control;
   public final boolean GLX_ARB_create_context;
   public final boolean GLX_ARB_create_context_no_error;
   public final boolean GLX_ARB_create_context_profile;
   public final boolean GLX_ARB_create_context_robustness;
   public final boolean GLX_ARB_fbconfig_float;
   public final boolean GLX_ARB_framebuffer_sRGB;
   public final boolean GLX_ARB_get_proc_address;
   public final boolean GLX_ARB_multisample;
   public final boolean GLX_ARB_robustness_application_isolation;
   public final boolean GLX_ARB_robustness_share_group_isolation;
   public final boolean GLX_ARB_vertex_buffer_object;
   public final boolean GLX_EXT_buffer_age;
   public final boolean GLX_EXT_context_priority;
   public final boolean GLX_EXT_create_context_es2_profile;
   public final boolean GLX_EXT_create_context_es_profile;
   public final boolean GLX_EXT_fbconfig_packed_float;
   public final boolean GLX_EXT_framebuffer_sRGB;
   public final boolean GLX_EXT_get_drawable_type;
   public final boolean GLX_EXT_import_context;
   public final boolean GLX_EXT_no_config_context;
   public final boolean GLX_EXT_stereo_tree;
   public final boolean GLX_EXT_swap_control;
   public final boolean GLX_EXT_swap_control_tear;
   public final boolean GLX_EXT_texture_from_pixmap;
   public final boolean GLX_EXT_visual_info;
   public final boolean GLX_EXT_visual_rating;
   public final boolean GLX_INTEL_swap_event;
   public final boolean GLX_NV_copy_buffer;
   public final boolean GLX_NV_copy_image;
   public final boolean GLX_NV_delay_before_swap;
   public final boolean GLX_NV_float_buffer;
   public final boolean GLX_NV_multigpu_context;
   public final boolean GLX_NV_multisample_coverage;
   public final boolean GLX_NV_robustness_video_memory_purge;
   public final boolean GLX_NV_swap_group;
   public final boolean GLX_SGI_make_current_read;
   public final boolean GLX_SGI_swap_control;
   public final boolean GLX_SGI_video_sync;
   public final boolean GLX_SGIX_fbconfig;
   public final boolean GLX_SGIX_pbuffer;
   public final boolean GLX_SGIX_swap_barrier;
   public final boolean GLX_SGIX_swap_group;

   public GLXCapabilities(FunctionProvider var1, Set var2) {
      long[] var3 = new long[69];
      this.GLX11 = check_GLX11(var1, var3, var2);
      this.GLX12 = check_GLX12(var1, var3, var2);
      this.GLX13 = check_GLX13(var1, var3, var2);
      this.GLX14 = check_GLX14(var1, var3, var2);
      this.GLX_AMD_gpu_association = check_GLX_AMD_gpu_association(var1, var3, var2);
      this.GLX_ARB_context_flush_control = var2.contains("GLX_ARB_context_flush_control");
      this.GLX_ARB_create_context = check_GLX_ARB_create_context(var1, var3, var2);
      this.GLX_ARB_create_context_no_error = var2.contains("GLX_ARB_create_context_no_error");
      this.GLX_ARB_create_context_profile = var2.contains("GLX_ARB_create_context_profile");
      this.GLX_ARB_create_context_robustness = var2.contains("GLX_ARB_create_context_robustness");
      this.GLX_ARB_fbconfig_float = var2.contains("GLX_ARB_fbconfig_float");
      this.GLX_ARB_framebuffer_sRGB = var2.contains("GLX_ARB_framebuffer_sRGB");
      this.GLX_ARB_get_proc_address = check_GLX_ARB_get_proc_address(var1, var3, var2);
      this.GLX_ARB_multisample = var2.contains("GLX_ARB_multisample");
      this.GLX_ARB_robustness_application_isolation = var2.contains("GLX_ARB_robustness_application_isolation");
      this.GLX_ARB_robustness_share_group_isolation = var2.contains("GLX_ARB_robustness_share_group_isolation");
      this.GLX_ARB_vertex_buffer_object = var2.contains("GLX_ARB_vertex_buffer_object");
      this.GLX_EXT_buffer_age = var2.contains("GLX_EXT_buffer_age");
      this.GLX_EXT_context_priority = var2.contains("GLX_EXT_context_priority");
      this.GLX_EXT_create_context_es2_profile = var2.contains("GLX_EXT_create_context_es2_profile");
      this.GLX_EXT_create_context_es_profile = var2.contains("GLX_EXT_create_context_es_profile");
      this.GLX_EXT_fbconfig_packed_float = var2.contains("GLX_EXT_fbconfig_packed_float");
      this.GLX_EXT_framebuffer_sRGB = var2.contains("GLX_EXT_framebuffer_sRGB");
      this.GLX_EXT_get_drawable_type = var2.contains("GLX_EXT_get_drawable_type");
      this.GLX_EXT_import_context = check_GLX_EXT_import_context(var1, var3, var2);
      this.GLX_EXT_no_config_context = var2.contains("GLX_EXT_no_config_context");
      this.GLX_EXT_stereo_tree = var2.contains("GLX_EXT_stereo_tree");
      this.GLX_EXT_swap_control = check_GLX_EXT_swap_control(var1, var3, var2);
      this.GLX_EXT_swap_control_tear = var2.contains("GLX_EXT_swap_control_tear");
      this.GLX_EXT_texture_from_pixmap = check_GLX_EXT_texture_from_pixmap(var1, var3, var2);
      this.GLX_EXT_visual_info = var2.contains("GLX_EXT_visual_info");
      this.GLX_EXT_visual_rating = var2.contains("GLX_EXT_visual_rating");
      this.GLX_INTEL_swap_event = var2.contains("GLX_INTEL_swap_event");
      this.GLX_NV_copy_buffer = check_GLX_NV_copy_buffer(var1, var3, var2);
      this.GLX_NV_copy_image = check_GLX_NV_copy_image(var1, var3, var2);
      this.GLX_NV_delay_before_swap = check_GLX_NV_delay_before_swap(var1, var3, var2);
      this.GLX_NV_float_buffer = var2.contains("GLX_NV_float_buffer");
      this.GLX_NV_multigpu_context = var2.contains("GLX_NV_multigpu_context");
      this.GLX_NV_multisample_coverage = var2.contains("GLX_NV_multisample_coverage");
      this.GLX_NV_robustness_video_memory_purge = var2.contains("GLX_NV_robustness_video_memory_purge");
      this.GLX_NV_swap_group = check_GLX_NV_swap_group(var1, var3, var2);
      this.GLX_SGI_make_current_read = check_GLX_SGI_make_current_read(var1, var3, var2);
      this.GLX_SGI_swap_control = check_GLX_SGI_swap_control(var1, var3, var2);
      this.GLX_SGI_video_sync = check_GLX_SGI_video_sync(var1, var3, var2);
      this.GLX_SGIX_fbconfig = check_GLX_SGIX_fbconfig(var1, var3, var2);
      this.GLX_SGIX_pbuffer = check_GLX_SGIX_pbuffer(var1, var3, var2);
      this.GLX_SGIX_swap_barrier = check_GLX_SGIX_swap_barrier(var1, var3, var2);
      this.GLX_SGIX_swap_group = check_GLX_SGIX_swap_group(var1, var3, var2);
      long var4 = var3[0];
      this.glXQueryExtensionsString = var4;
      var4 = var3[1];
      this.glXGetClientString = var4;
      var4 = var3[2];
      this.glXQueryServerString = var4;
      var4 = var3[3];
      this.glXGetCurrentDisplay = var4;
      var4 = var3[4];
      this.glXGetFBConfigs = var4;
      var4 = var3[5];
      this.glXChooseFBConfig = var4;
      var4 = var3[6];
      this.glXGetFBConfigAttrib = var4;
      var4 = var3[7];
      this.glXGetVisualFromFBConfig = var4;
      var4 = var3[8];
      this.glXCreateWindow = var4;
      var4 = var3[9];
      this.glXCreatePixmap = var4;
      var4 = var3[10];
      this.glXDestroyPixmap = var4;
      var4 = var3[11];
      this.glXCreatePbuffer = var4;
      var4 = var3[12];
      this.glXDestroyPbuffer = var4;
      var4 = var3[13];
      this.glXQueryDrawable = var4;
      var4 = var3[14];
      this.glXCreateNewContext = var4;
      var4 = var3[15];
      this.glXMakeContextCurrent = var4;
      var4 = var3[16];
      this.glXGetCurrentReadDrawable = var4;
      var4 = var3[17];
      this.glXQueryContext = var4;
      var4 = var3[18];
      this.glXSelectEvent = var4;
      var4 = var3[19];
      this.glXGetSelectedEvent = var4;
      var4 = var3[20];
      this.glXGetProcAddress = var4;
      var4 = var3[21];
      this.glXBlitContextFramebufferAMD = var4;
      var4 = var3[22];
      this.glXCreateAssociatedContextAMD = var4;
      var4 = var3[23];
      this.glXCreateAssociatedContextAttribsAMD = var4;
      var4 = var3[24];
      this.glXDeleteAssociatedContextAMD = var4;
      var4 = var3[25];
      this.glXGetContextGPUIDAMD = var4;
      var4 = var3[26];
      this.glXGetCurrentAssociatedContextAMD = var4;
      var4 = var3[27];
      this.glXGetGPUIDsAMD = var4;
      var4 = var3[28];
      this.glXGetGPUInfoAMD = var4;
      var4 = var3[29];
      this.glXMakeAssociatedContextCurrentAMD = var4;
      var4 = var3[30];
      this.glXCreateContextAttribsARB = var4;
      var4 = var3[31];
      this.glXGetProcAddressARB = var4;
      var4 = var3[32];
      this.glXGetCurrentDisplayEXT = var4;
      var4 = var3[33];
      this.glXQueryContextInfoEXT = var4;
      var4 = var3[34];
      this.glXGetContextIDEXT = var4;
      var4 = var3[35];
      this.glXImportContextEXT = var4;
      var4 = var3[36];
      this.glXFreeContextEXT = var4;
      var4 = var3[37];
      this.glXSwapIntervalEXT = var4;
      var4 = var3[38];
      this.glXBindTexImageEXT = var4;
      var4 = var3[39];
      this.glXReleaseTexImageEXT = var4;
      var4 = var3[40];
      this.glXCopyBufferSubDataNV = var4;
      var4 = var3[41];
      this.glXNamedCopyBufferSubDataNV = var4;
      var4 = var3[42];
      this.glXCopyImageSubDataNV = var4;
      var4 = var3[43];
      this.glXDelayBeforeSwapNV = var4;
      var4 = var3[44];
      this.glXJoinSwapGroupNV = var4;
      var4 = var3[45];
      this.glXBindSwapBarrierNV = var4;
      var4 = var3[46];
      this.glXQuerySwapGroupNV = var4;
      var4 = var3[47];
      this.glXQueryMaxSwapGroupsNV = var4;
      var4 = var3[48];
      this.glXQueryFrameCountNV = var4;
      var4 = var3[49];
      this.glXResetFrameCountNV = var4;
      var4 = var3[50];
      this.glXMakeCurrentReadSGI = var4;
      var4 = var3[51];
      this.glXGetCurrentReadDrawableSGI = var4;
      var4 = var3[52];
      this.glXSwapIntervalSGI = var4;
      var4 = var3[53];
      this.glXGetVideoSyncSGI = var4;
      var4 = var3[54];
      this.glXWaitVideoSyncSGI = var4;
      var4 = var3[55];
      this.glXGetFBConfigAttribSGIX = var4;
      var4 = var3[56];
      this.glXChooseFBConfigSGIX = var4;
      var4 = var3[57];
      this.glXCreateGLXPixmapWithConfigSGIX = var4;
      var4 = var3[58];
      this.glXCreateContextWithConfigSGIX = var4;
      var4 = var3[59];
      this.glXGetVisualFromFBConfigSGIX = var4;
      var4 = var3[60];
      this.glXGetFBConfigFromVisualSGIX = var4;
      var4 = var3[61];
      this.glXCreateGLXPbufferSGIX = var4;
      var4 = var3[62];
      this.glXDestroyGLXPbufferSGIX = var4;
      var4 = var3[63];
      this.glXQueryGLXPbufferSGIX = var4;
      var4 = var3[64];
      this.glXSelectEventSGIX = var4;
      var4 = var3[65];
      this.glXGetSelectedEventSGIX = var4;
      var4 = var3[66];
      this.glXBindSwapBarrierSGIX = var4;
      var4 = var3[67];
      this.glXQueryMaxSwapBarriersSGIX = var4;
      var4 = var3[68];
      this.glXJoinSwapGroupSGIX = var4;
   }

   private static boolean check_GLX11(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX11")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 0;
         var10002[1] = 1;
         var10002[2] = 2;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glXQueryExtensionsString";
         var5[1] = "glXGetClientString";
         var5[2] = "glXQueryServerString";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX11");
      }
   }

   private static boolean check_GLX12(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX12")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 3;
         String[] var4;
         (var4 = new String[1])[0] = "glXGetCurrentDisplay";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX12");
      }
   }

   private static boolean check_GLX13(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX13")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[16];
         var10002[0] = 4;
         var10002[1] = 5;
         var10002[2] = 6;
         var10002[3] = 7;
         var10002[4] = 8;
         var10002[5] = 9;
         var10002[6] = 10;
         var10002[7] = 11;
         var10002[8] = 12;
         var10002[9] = 13;
         var10002[10] = 14;
         var10002[11] = 15;
         var10002[12] = 16;
         var10002[13] = 17;
         var10002[14] = 18;
         var10002[15] = 19;
         String[] var4;
         String[] var5 = var4 = new String[16];
         var5[0] = "glXGetFBConfigs";
         var5[1] = "glXChooseFBConfig";
         var5[2] = "glXGetFBConfigAttrib";
         var5[3] = "glXGetVisualFromFBConfig";
         var5[4] = "glXCreateWindow";
         var5[5] = "glXCreatePixmap";
         var5[6] = "glXDestroyPixmap";
         var5[7] = "glXCreatePbuffer";
         var5[8] = "glXDestroyPbuffer";
         var5[9] = "glXQueryDrawable";
         var5[10] = "glXCreateNewContext";
         var5[11] = "glXMakeContextCurrent";
         var5[12] = "glXGetCurrentReadDrawable";
         var5[13] = "glXQueryContext";
         var5[14] = "glXSelectEvent";
         var5[15] = "glXGetSelectedEvent";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX13");
      }
   }

   private static boolean check_GLX14(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX14")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 20;
         String[] var4;
         (var4 = new String[1])[0] = "glXGetProcAddress";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX14");
      }
   }

   private static boolean check_GLX_AMD_gpu_association(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_AMD_gpu_association")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[9];
         var10002[0] = 21;
         var10002[1] = 22;
         var10002[2] = 23;
         var10002[3] = 24;
         var10002[4] = 25;
         var10002[5] = 26;
         var10002[6] = 27;
         var10002[7] = 28;
         var10002[8] = 29;
         String[] var4;
         String[] var5 = var4 = new String[9];
         var5[0] = "glXBlitContextFramebufferAMD";
         var5[1] = "glXCreateAssociatedContextAMD";
         var5[2] = "glXCreateAssociatedContextAttribsAMD";
         var5[3] = "glXDeleteAssociatedContextAMD";
         var5[4] = "glXGetContextGPUIDAMD";
         var5[5] = "glXGetCurrentAssociatedContextAMD";
         var5[6] = "glXGetGPUIDsAMD";
         var5[7] = "glXGetGPUInfoAMD";
         var5[8] = "glXMakeAssociatedContextCurrentAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_AMD_gpu_association");
      }
   }

   private static boolean check_GLX_ARB_create_context(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_ARB_create_context")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 30;
         String[] var4;
         (var4 = new String[1])[0] = "glXCreateContextAttribsARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_ARB_create_context");
      }
   }

   private static boolean check_GLX_ARB_get_proc_address(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_ARB_get_proc_address")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 31;
         String[] var4;
         (var4 = new String[1])[0] = "glXGetProcAddressARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_ARB_get_proc_address");
      }
   }

   private static boolean check_GLX_EXT_import_context(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_EXT_import_context")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[5];
         var10002[0] = 32;
         var10002[1] = 33;
         var10002[2] = 34;
         var10002[3] = 35;
         var10002[4] = 36;
         String[] var4;
         String[] var5 = var4 = new String[5];
         var5[0] = "glXGetCurrentDisplayEXT";
         var5[1] = "glXQueryContextInfoEXT";
         var5[2] = "glXGetContextIDEXT";
         var5[3] = "glXImportContextEXT";
         var5[4] = "glXFreeContextEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_EXT_import_context");
      }
   }

   private static boolean check_GLX_EXT_swap_control(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_EXT_swap_control")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 37;
         String[] var4;
         (var4 = new String[1])[0] = "glXSwapIntervalEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_EXT_swap_control");
      }
   }

   private static boolean check_GLX_EXT_texture_from_pixmap(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_EXT_texture_from_pixmap")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 38;
         var10002[1] = 39;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glXBindTexImageEXT";
         var5[1] = "glXReleaseTexImageEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_EXT_texture_from_pixmap");
      }
   }

   private static boolean check_GLX_NV_copy_buffer(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_NV_copy_buffer")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 40;
         var10002[1] = 41;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glXCopyBufferSubDataNV";
         var5[1] = "glXNamedCopyBufferSubDataNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_NV_copy_buffer");
      }
   }

   private static boolean check_GLX_NV_copy_image(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_NV_copy_image")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 42;
         String[] var4;
         (var4 = new String[1])[0] = "glXCopyImageSubDataNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_NV_copy_image");
      }
   }

   private static boolean check_GLX_NV_delay_before_swap(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_NV_delay_before_swap")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 43;
         String[] var4;
         (var4 = new String[1])[0] = "glXDelayBeforeSwapNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_NV_delay_before_swap");
      }
   }

   private static boolean check_GLX_NV_swap_group(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_NV_swap_group")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 44;
         var10002[1] = 45;
         var10002[2] = 46;
         var10002[3] = 47;
         var10002[4] = 48;
         var10002[5] = 49;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glXJoinSwapGroupNV";
         var5[1] = "glXBindSwapBarrierNV";
         var5[2] = "glXQuerySwapGroupNV";
         var5[3] = "glXQueryMaxSwapGroupsNV";
         var5[4] = "glXQueryFrameCountNV";
         var5[5] = "glXResetFrameCountNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_NV_swap_group");
      }
   }

   private static boolean check_GLX_SGI_make_current_read(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_SGI_make_current_read")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 50;
         var10002[1] = 51;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glXMakeCurrentReadSGI";
         var5[1] = "glXGetCurrentReadDrawableSGI";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_SGI_make_current_read");
      }
   }

   private static boolean check_GLX_SGI_swap_control(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_SGI_swap_control")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 52;
         String[] var4;
         (var4 = new String[1])[0] = "glXSwapIntervalSGI";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_SGI_swap_control");
      }
   }

   private static boolean check_GLX_SGI_video_sync(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_SGI_video_sync")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 53;
         var10002[1] = 54;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glXGetVideoSyncSGI";
         var5[1] = "glXWaitVideoSyncSGI";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_SGI_video_sync");
      }
   }

   private static boolean check_GLX_SGIX_fbconfig(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_SGIX_fbconfig")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 55;
         var10002[1] = 56;
         var10002[2] = 57;
         var10002[3] = 58;
         var10002[4] = 59;
         var10002[5] = 60;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glXGetFBConfigAttribSGIX";
         var5[1] = "glXChooseFBConfigSGIX";
         var5[2] = "glXCreateGLXPixmapWithConfigSGIX";
         var5[3] = "glXCreateContextWithConfigSGIX";
         var5[4] = "glXGetVisualFromFBConfigSGIX";
         var5[5] = "glXGetFBConfigFromVisualSGIX";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_SGIX_fbconfig");
      }
   }

   private static boolean check_GLX_SGIX_pbuffer(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_SGIX_pbuffer")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[5];
         var10002[0] = 61;
         var10002[1] = 62;
         var10002[2] = 63;
         var10002[3] = 64;
         var10002[4] = 65;
         String[] var4;
         String[] var5 = var4 = new String[5];
         var5[0] = "glXCreateGLXPbufferSGIX";
         var5[1] = "glXDestroyGLXPbufferSGIX";
         var5[2] = "glXQueryGLXPbufferSGIX";
         var5[3] = "glXSelectEventSGIX";
         var5[4] = "glXGetSelectedEventSGIX";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_SGIX_pbuffer");
      }
   }

   private static boolean check_GLX_SGIX_swap_barrier(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_SGIX_swap_barrier")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 66;
         var10002[1] = 67;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glXBindSwapBarrierSGIX";
         var5[1] = "glXQueryMaxSwapBarriersSGIX";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_SGIX_swap_barrier");
      }
   }

   private static boolean check_GLX_SGIX_swap_group(FunctionProvider var0, long[] var1, Set var2) {
      if (!var2.contains("GLX_SGIX_swap_group")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         long[] var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 68;
         String[] var4;
         (var4 = new String[1])[0] = "glXJoinSwapGroupSGIX";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLX", "GLX_SGIX_swap_group");
      }
   }
}
