package org.lwjgl.opengles;

import java.util.Set;
import java.util.function.IntFunction;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.ThreadLocalUtil;

public final class GLESCapabilities {
   static final int ADDRESS_BUFFER_SIZE = 874;
   public final long glActiveTexture;
   public final long glAttachShader;
   public final long glBindAttribLocation;
   public final long glBindBuffer;
   public final long glBindFramebuffer;
   public final long glBindRenderbuffer;
   public final long glBindTexture;
   public final long glBlendColor;
   public final long glBlendEquation;
   public final long glBlendEquationSeparate;
   public final long glBlendFunc;
   public final long glBlendFuncSeparate;
   public final long glBufferData;
   public final long glBufferSubData;
   public final long glCheckFramebufferStatus;
   public final long glClear;
   public final long glClearColor;
   public final long glClearDepthf;
   public final long glClearStencil;
   public final long glColorMask;
   public final long glCompileShader;
   public final long glCompressedTexImage2D;
   public final long glCompressedTexSubImage2D;
   public final long glCopyTexImage2D;
   public final long glCopyTexSubImage2D;
   public final long glCreateProgram;
   public final long glCreateShader;
   public final long glCullFace;
   public final long glDeleteBuffers;
   public final long glDeleteFramebuffers;
   public final long glDeleteProgram;
   public final long glDeleteRenderbuffers;
   public final long glDeleteShader;
   public final long glDeleteTextures;
   public final long glDepthFunc;
   public final long glDepthMask;
   public final long glDepthRangef;
   public final long glDetachShader;
   public final long glDisable;
   public final long glDisableVertexAttribArray;
   public final long glDrawArrays;
   public final long glDrawElements;
   public final long glEnable;
   public final long glEnableVertexAttribArray;
   public final long glFinish;
   public final long glFlush;
   public final long glFramebufferRenderbuffer;
   public final long glFramebufferTexture2D;
   public final long glFrontFace;
   public final long glGenBuffers;
   public final long glGenerateMipmap;
   public final long glGenFramebuffers;
   public final long glGenRenderbuffers;
   public final long glGenTextures;
   public final long glGetActiveAttrib;
   public final long glGetActiveUniform;
   public final long glGetAttachedShaders;
   public final long glGetAttribLocation;
   public final long glGetBooleanv;
   public final long glGetBufferParameteriv;
   public final long glGetError;
   public final long glGetFloatv;
   public final long glGetFramebufferAttachmentParameteriv;
   public final long glGetIntegerv;
   public final long glGetProgramiv;
   public final long glGetProgramInfoLog;
   public final long glGetRenderbufferParameteriv;
   public final long glGetShaderiv;
   public final long glGetShaderInfoLog;
   public final long glGetShaderPrecisionFormat;
   public final long glGetShaderSource;
   public final long glGetString;
   public final long glGetTexParameterfv;
   public final long glGetTexParameteriv;
   public final long glGetUniformfv;
   public final long glGetUniformiv;
   public final long glGetUniformLocation;
   public final long glGetVertexAttribfv;
   public final long glGetVertexAttribiv;
   public final long glGetVertexAttribPointerv;
   public final long glHint;
   public final long glIsBuffer;
   public final long glIsEnabled;
   public final long glIsFramebuffer;
   public final long glIsProgram;
   public final long glIsRenderbuffer;
   public final long glIsShader;
   public final long glIsTexture;
   public final long glLineWidth;
   public final long glLinkProgram;
   public final long glPixelStorei;
   public final long glPolygonOffset;
   public final long glReadPixels;
   public final long glReleaseShaderCompiler;
   public final long glRenderbufferStorage;
   public final long glSampleCoverage;
   public final long glScissor;
   public final long glShaderBinary;
   public final long glShaderSource;
   public final long glStencilFunc;
   public final long glStencilFuncSeparate;
   public final long glStencilMask;
   public final long glStencilMaskSeparate;
   public final long glStencilOp;
   public final long glStencilOpSeparate;
   public final long glTexImage2D;
   public final long glTexParameterf;
   public final long glTexParameterfv;
   public final long glTexParameteri;
   public final long glTexParameteriv;
   public final long glTexSubImage2D;
   public final long glUniform1f;
   public final long glUniform1fv;
   public final long glUniform1i;
   public final long glUniform1iv;
   public final long glUniform2f;
   public final long glUniform2fv;
   public final long glUniform2i;
   public final long glUniform2iv;
   public final long glUniform3f;
   public final long glUniform3fv;
   public final long glUniform3i;
   public final long glUniform3iv;
   public final long glUniform4f;
   public final long glUniform4fv;
   public final long glUniform4i;
   public final long glUniform4iv;
   public final long glUniformMatrix2fv;
   public final long glUniformMatrix3fv;
   public final long glUniformMatrix4fv;
   public final long glUseProgram;
   public final long glValidateProgram;
   public final long glVertexAttrib1f;
   public final long glVertexAttrib1fv;
   public final long glVertexAttrib2f;
   public final long glVertexAttrib2fv;
   public final long glVertexAttrib3f;
   public final long glVertexAttrib3fv;
   public final long glVertexAttrib4f;
   public final long glVertexAttrib4fv;
   public final long glVertexAttribPointer;
   public final long glViewport;
   public final long glReadBuffer;
   public final long glDrawRangeElements;
   public final long glTexImage3D;
   public final long glTexSubImage3D;
   public final long glCopyTexSubImage3D;
   public final long glCompressedTexImage3D;
   public final long glCompressedTexSubImage3D;
   public final long glGenQueries;
   public final long glDeleteQueries;
   public final long glIsQuery;
   public final long glBeginQuery;
   public final long glEndQuery;
   public final long glGetQueryiv;
   public final long glGetQueryObjectuiv;
   public final long glUnmapBuffer;
   public final long glGetBufferPointerv;
   public final long glDrawBuffers;
   public final long glUniformMatrix2x3fv;
   public final long glUniformMatrix3x2fv;
   public final long glUniformMatrix2x4fv;
   public final long glUniformMatrix4x2fv;
   public final long glUniformMatrix3x4fv;
   public final long glUniformMatrix4x3fv;
   public final long glBlitFramebuffer;
   public final long glRenderbufferStorageMultisample;
   public final long glFramebufferTextureLayer;
   public final long glMapBufferRange;
   public final long glFlushMappedBufferRange;
   public final long glBindVertexArray;
   public final long glDeleteVertexArrays;
   public final long glGenVertexArrays;
   public final long glIsVertexArray;
   public final long glGetIntegeri_v;
   public final long glBeginTransformFeedback;
   public final long glEndTransformFeedback;
   public final long glBindBufferRange;
   public final long glBindBufferBase;
   public final long glTransformFeedbackVaryings;
   public final long glGetTransformFeedbackVarying;
   public final long glVertexAttribIPointer;
   public final long glGetVertexAttribIiv;
   public final long glGetVertexAttribIuiv;
   public final long glVertexAttribI4i;
   public final long glVertexAttribI4ui;
   public final long glVertexAttribI4iv;
   public final long glVertexAttribI4uiv;
   public final long glGetUniformuiv;
   public final long glGetFragDataLocation;
   public final long glUniform1ui;
   public final long glUniform2ui;
   public final long glUniform3ui;
   public final long glUniform4ui;
   public final long glUniform1uiv;
   public final long glUniform2uiv;
   public final long glUniform3uiv;
   public final long glUniform4uiv;
   public final long glClearBufferiv;
   public final long glClearBufferuiv;
   public final long glClearBufferfv;
   public final long glClearBufferfi;
   public final long glGetStringi;
   public final long glCopyBufferSubData;
   public final long glGetUniformIndices;
   public final long glGetActiveUniformsiv;
   public final long glGetUniformBlockIndex;
   public final long glGetActiveUniformBlockiv;
   public final long glGetActiveUniformBlockName;
   public final long glUniformBlockBinding;
   public final long glDrawArraysInstanced;
   public final long glDrawElementsInstanced;
   public final long glFenceSync;
   public final long glIsSync;
   public final long glDeleteSync;
   public final long glClientWaitSync;
   public final long glWaitSync;
   public final long glGetInteger64v;
   public final long glGetSynciv;
   public final long glGetInteger64i_v;
   public final long glGetBufferParameteri64v;
   public final long glGenSamplers;
   public final long glDeleteSamplers;
   public final long glIsSampler;
   public final long glBindSampler;
   public final long glSamplerParameteri;
   public final long glSamplerParameteriv;
   public final long glSamplerParameterf;
   public final long glSamplerParameterfv;
   public final long glGetSamplerParameteriv;
   public final long glGetSamplerParameterfv;
   public final long glVertexAttribDivisor;
   public final long glBindTransformFeedback;
   public final long glDeleteTransformFeedbacks;
   public final long glGenTransformFeedbacks;
   public final long glIsTransformFeedback;
   public final long glPauseTransformFeedback;
   public final long glResumeTransformFeedback;
   public final long glGetProgramBinary;
   public final long glProgramBinary;
   public final long glProgramParameteri;
   public final long glInvalidateFramebuffer;
   public final long glInvalidateSubFramebuffer;
   public final long glTexStorage2D;
   public final long glTexStorage3D;
   public final long glGetInternalformativ;
   public final long glDispatchCompute;
   public final long glDispatchComputeIndirect;
   public final long glDrawArraysIndirect;
   public final long glDrawElementsIndirect;
   public final long glFramebufferParameteri;
   public final long glGetFramebufferParameteriv;
   public final long glGetProgramInterfaceiv;
   public final long glGetProgramResourceIndex;
   public final long glGetProgramResourceName;
   public final long glGetProgramResourceiv;
   public final long glGetProgramResourceLocation;
   public final long glUseProgramStages;
   public final long glActiveShaderProgram;
   public final long glCreateShaderProgramv;
   public final long glBindProgramPipeline;
   public final long glDeleteProgramPipelines;
   public final long glGenProgramPipelines;
   public final long glIsProgramPipeline;
   public final long glGetProgramPipelineiv;
   public final long glProgramUniform1i;
   public final long glProgramUniform2i;
   public final long glProgramUniform3i;
   public final long glProgramUniform4i;
   public final long glProgramUniform1ui;
   public final long glProgramUniform2ui;
   public final long glProgramUniform3ui;
   public final long glProgramUniform4ui;
   public final long glProgramUniform1f;
   public final long glProgramUniform2f;
   public final long glProgramUniform3f;
   public final long glProgramUniform4f;
   public final long glProgramUniform1iv;
   public final long glProgramUniform2iv;
   public final long glProgramUniform3iv;
   public final long glProgramUniform4iv;
   public final long glProgramUniform1uiv;
   public final long glProgramUniform2uiv;
   public final long glProgramUniform3uiv;
   public final long glProgramUniform4uiv;
   public final long glProgramUniform1fv;
   public final long glProgramUniform2fv;
   public final long glProgramUniform3fv;
   public final long glProgramUniform4fv;
   public final long glProgramUniformMatrix2fv;
   public final long glProgramUniformMatrix3fv;
   public final long glProgramUniformMatrix4fv;
   public final long glProgramUniformMatrix2x3fv;
   public final long glProgramUniformMatrix3x2fv;
   public final long glProgramUniformMatrix2x4fv;
   public final long glProgramUniformMatrix4x2fv;
   public final long glProgramUniformMatrix3x4fv;
   public final long glProgramUniformMatrix4x3fv;
   public final long glValidateProgramPipeline;
   public final long glGetProgramPipelineInfoLog;
   public final long glBindImageTexture;
   public final long glGetBooleani_v;
   public final long glMemoryBarrier;
   public final long glMemoryBarrierByRegion;
   public final long glTexStorage2DMultisample;
   public final long glGetMultisamplefv;
   public final long glSampleMaski;
   public final long glGetTexLevelParameteriv;
   public final long glGetTexLevelParameterfv;
   public final long glBindVertexBuffer;
   public final long glVertexAttribFormat;
   public final long glVertexAttribIFormat;
   public final long glVertexAttribBinding;
   public final long glVertexBindingDivisor;
   public final long glBlendBarrier;
   public final long glCopyImageSubData;
   public final long glDebugMessageControl;
   public final long glDebugMessageInsert;
   public final long glDebugMessageCallback;
   public final long glGetDebugMessageLog;
   public final long glGetPointerv;
   public final long glPushDebugGroup;
   public final long glPopDebugGroup;
   public final long glObjectLabel;
   public final long glGetObjectLabel;
   public final long glObjectPtrLabel;
   public final long glGetObjectPtrLabel;
   public final long glEnablei;
   public final long glDisablei;
   public final long glBlendEquationi;
   public final long glBlendEquationSeparatei;
   public final long glBlendFunci;
   public final long glBlendFuncSeparatei;
   public final long glColorMaski;
   public final long glIsEnabledi;
   public final long glDrawElementsBaseVertex;
   public final long glDrawRangeElementsBaseVertex;
   public final long glDrawElementsInstancedBaseVertex;
   public final long glFramebufferTexture;
   public final long glPrimitiveBoundingBox;
   public final long glGetGraphicsResetStatus;
   public final long glReadnPixels;
   public final long glGetnUniformfv;
   public final long glGetnUniformiv;
   public final long glGetnUniformuiv;
   public final long glMinSampleShading;
   public final long glPatchParameteri;
   public final long glTexParameterIiv;
   public final long glTexParameterIuiv;
   public final long glGetTexParameterIiv;
   public final long glGetTexParameterIuiv;
   public final long glSamplerParameterIiv;
   public final long glSamplerParameterIuiv;
   public final long glGetSamplerParameterIiv;
   public final long glGetSamplerParameterIuiv;
   public final long glTexBuffer;
   public final long glTexBufferRange;
   public final long glTexStorage3DMultisample;
   public final long glRenderbufferStorageMultisampleAdvancedAMD;
   public final long glNamedRenderbufferStorageMultisampleAdvancedAMD;
   public final long glGetPerfMonitorGroupsAMD;
   public final long glGetPerfMonitorCountersAMD;
   public final long glGetPerfMonitorGroupStringAMD;
   public final long glGetPerfMonitorCounterStringAMD;
   public final long glGetPerfMonitorCounterInfoAMD;
   public final long glGenPerfMonitorsAMD;
   public final long glDeletePerfMonitorsAMD;
   public final long glSelectPerfMonitorCountersAMD;
   public final long glBeginPerfMonitorAMD;
   public final long glEndPerfMonitorAMD;
   public final long glGetPerfMonitorCounterDataAMD;
   public final long glBlitFramebufferANGLE;
   public final long glRenderbufferStorageMultisampleANGLE;
   public final long glDrawArraysInstancedANGLE;
   public final long glDrawElementsInstancedANGLE;
   public final long glVertexAttribDivisorANGLE;
   public final long glGetTranslatedShaderSourceANGLE;
   public final long glCopyTextureLevelsAPPLE;
   public final long glRenderbufferStorageMultisampleAPPLE;
   public final long glResolveMultisampleFramebufferAPPLE;
   public final long glFenceSyncAPPLE;
   public final long glIsSyncAPPLE;
   public final long glDeleteSyncAPPLE;
   public final long glClientWaitSyncAPPLE;
   public final long glWaitSyncAPPLE;
   public final long glGetInteger64vAPPLE;
   public final long glGetSyncivAPPLE;
   public final long glMaxActiveShaderCoresARM;
   public final long glDrawArraysInstancedBaseInstanceEXT;
   public final long glDrawElementsInstancedBaseInstanceEXT;
   public final long glDrawElementsInstancedBaseVertexBaseInstanceEXT;
   public final long glBindFragDataLocationIndexedEXT;
   public final long glGetFragDataIndexEXT;
   public final long glBindFragDataLocationEXT;
   public final long glGetProgramResourceLocationIndexEXT;
   public final long glBufferStorageEXT;
   public final long glNamedBufferStorageEXT;
   public final long glClearTexImageEXT;
   public final long glClearTexSubImageEXT;
   public final long glClipControlEXT;
   public final long glCopyImageSubDataEXT;
   public final long glLabelObjectEXT;
   public final long glGetObjectLabelEXT;
   public final long glInsertEventMarkerEXT;
   public final long glPushGroupMarkerEXT;
   public final long glPopGroupMarkerEXT;
   public final long glDiscardFramebufferEXT;
   public final long glGenQueriesEXT;
   public final long glDeleteQueriesEXT;
   public final long glIsQueryEXT;
   public final long glBeginQueryEXT;
   public final long glEndQueryEXT;
   public final long glGetQueryivEXT;
   public final long glGetQueryObjectuivEXT;
   public final long glQueryCounterEXT;
   public final long glGetQueryObjectivEXT;
   public final long glGetQueryObjecti64vEXT;
   public final long glGetQueryObjectui64vEXT;
   public final long glGetInteger64vEXT;
   public final long glDrawBuffersEXT;
   public final long glEnableiEXT;
   public final long glDisableiEXT;
   public final long glBlendEquationiEXT;
   public final long glBlendEquationSeparateiEXT;
   public final long glBlendFunciEXT;
   public final long glBlendFuncSeparateiEXT;
   public final long glColorMaskiEXT;
   public final long glIsEnablediEXT;
   public final long glDrawElementsBaseVertexEXT;
   public final long glDrawRangeElementsBaseVertexEXT;
   public final long glDrawElementsInstancedBaseVertexEXT;
   public final long glMultiDrawElementsBaseVertexEXT;
   public final long glDrawArraysInstancedEXT;
   public final long glDrawElementsInstancedEXT;
   public final long glDrawTransformFeedbackEXT;
   public final long glDrawTransformFeedbackInstancedEXT;
   public final long glEGLImageTargetTexStorageEXT;
   public final long glEGLImageTargetTextureStorageEXT;
   public final long glBufferStorageExternalEXT;
   public final long glNamedBufferStorageExternalEXT;
   public final long glShadingRateEXT;
   public final long glShadingRateCombinerOpsEXT;
   public final long glFramebufferShadingRateEXT;
   public final long glGetFragmentShadingRatesEXT;
   public final long glBlitFramebufferLayersEXT;
   public final long glBlitFramebufferLayerEXT;
   public final long glFramebufferTextureEXT;
   public final long glVertexAttribDivisorEXT;
   public final long glMapBufferRangeEXT;
   public final long glFlushMappedBufferRangeEXT;
   public final long glGetUnsignedBytevEXT;
   public final long glGetUnsignedBytei_vEXT;
   public final long glDeleteMemoryObjectsEXT;
   public final long glIsMemoryObjectEXT;
   public final long glCreateMemoryObjectsEXT;
   public final long glMemoryObjectParameterivEXT;
   public final long glGetMemoryObjectParameterivEXT;
   public final long glTexStorageMem2DEXT;
   public final long glTexStorageMem2DMultisampleEXT;
   public final long glTexStorageMem3DEXT;
   public final long glTexStorageMem3DMultisampleEXT;
   public final long glBufferStorageMemEXT;
   public final long glTextureStorageMem2DEXT;
   public final long glTextureStorageMem2DMultisampleEXT;
   public final long glTextureStorageMem3DEXT;
   public final long glTextureStorageMem3DMultisampleEXT;
   public final long glNamedBufferStorageMemEXT;
   public final long glImportMemoryFdEXT;
   public final long glImportMemoryWin32HandleEXT;
   public final long glImportMemoryWin32NameEXT;
   public final long glMultiDrawArraysEXT;
   public final long glMultiDrawElementsEXT;
   public final long glMultiDrawArraysIndirectEXT;
   public final long glMultiDrawElementsIndirectEXT;
   public final long glRenderbufferStorageMultisampleEXT;
   public final long glFramebufferTexture2DMultisampleEXT;
   public final long glReadBufferIndexedEXT;
   public final long glDrawBuffersIndexedEXT;
   public final long glGetIntegeri_vEXT;
   public final long glPolygonOffsetClampEXT;
   public final long glPrimitiveBoundingBoxEXT;
   public final long glRasterSamplesEXT;
   public final long glGetGraphicsResetStatusEXT;
   public final long glReadnPixelsEXT;
   public final long glGetnUniformfvEXT;
   public final long glGetnUniformivEXT;
   public final long glGenSemaphoresEXT;
   public final long glDeleteSemaphoresEXT;
   public final long glIsSemaphoreEXT;
   public final long glSemaphoreParameterui64vEXT;
   public final long glGetSemaphoreParameterui64vEXT;
   public final long glWaitSemaphoreEXT;
   public final long glSignalSemaphoreEXT;
   public final long glImportSemaphoreFdEXT;
   public final long glImportSemaphoreWin32HandleEXT;
   public final long glImportSemaphoreWin32NameEXT;
   public final long glActiveShaderProgramEXT;
   public final long glBindProgramPipelineEXT;
   public final long glCreateShaderProgramvEXT;
   public final long glDeleteProgramPipelinesEXT;
   public final long glGenProgramPipelinesEXT;
   public final long glGetProgramPipelineInfoLogEXT;
   public final long glGetProgramPipelineivEXT;
   public final long glIsProgramPipelineEXT;
   public final long glProgramParameteriEXT;
   public final long glProgramUniform1fEXT;
   public final long glProgramUniform1fvEXT;
   public final long glProgramUniform1iEXT;
   public final long glProgramUniform1ivEXT;
   public final long glProgramUniform2fEXT;
   public final long glProgramUniform2fvEXT;
   public final long glProgramUniform2iEXT;
   public final long glProgramUniform2ivEXT;
   public final long glProgramUniform3fEXT;
   public final long glProgramUniform3fvEXT;
   public final long glProgramUniform3iEXT;
   public final long glProgramUniform3ivEXT;
   public final long glProgramUniform4fEXT;
   public final long glProgramUniform4fvEXT;
   public final long glProgramUniform4iEXT;
   public final long glProgramUniform4ivEXT;
   public final long glProgramUniformMatrix2fvEXT;
   public final long glProgramUniformMatrix3fvEXT;
   public final long glProgramUniformMatrix4fvEXT;
   public final long glUseProgramStagesEXT;
   public final long glValidateProgramPipelineEXT;
   public final long glProgramUniform1uiEXT;
   public final long glProgramUniform2uiEXT;
   public final long glProgramUniform3uiEXT;
   public final long glProgramUniform4uiEXT;
   public final long glProgramUniform1uivEXT;
   public final long glProgramUniform2uivEXT;
   public final long glProgramUniform3uivEXT;
   public final long glProgramUniform4uivEXT;
   public final long glProgramUniformMatrix2x3fvEXT;
   public final long glProgramUniformMatrix3x2fvEXT;
   public final long glProgramUniformMatrix2x4fvEXT;
   public final long glProgramUniformMatrix4x2fvEXT;
   public final long glProgramUniformMatrix3x4fvEXT;
   public final long glProgramUniformMatrix4x3fvEXT;
   public final long glFramebufferFetchBarrierEXT;
   public final long glFramebufferPixelLocalStorageSizeEXT;
   public final long glGetFramebufferPixelLocalStorageSizeEXT;
   public final long glClearPixelLocalStorageuiEXT;
   public final long glTexPageCommitmentARB;
   public final long glPatchParameteriEXT;
   public final long glTexParameterIivEXT;
   public final long glTexParameterIuivEXT;
   public final long glGetTexParameterIivEXT;
   public final long glGetTexParameterIuivEXT;
   public final long glSamplerParameterIivEXT;
   public final long glSamplerParameterIuivEXT;
   public final long glGetSamplerParameterIivEXT;
   public final long glGetSamplerParameterIuivEXT;
   public final long glTexBufferEXT;
   public final long glTexBufferRangeEXT;
   public final long glTexStorage1DEXT;
   public final long glTexStorage2DEXT;
   public final long glTexStorage3DEXT;
   public final long glTextureStorage1DEXT;
   public final long glTextureStorage2DEXT;
   public final long glTextureStorage3DEXT;
   public final long glTexStorageAttribs2DEXT;
   public final long glTexStorageAttribs3DEXT;
   public final long glTextureViewEXT;
   public final long glAcquireKeyedMutexWin32EXT;
   public final long glReleaseKeyedMutexWin32EXT;
   public final long glWindowRectanglesEXT;
   public final long glFramebufferTexture2DDownsampleIMG;
   public final long glFramebufferTextureLayerDownsampleIMG;
   public final long glRenderbufferStorageMultisampleIMG;
   public final long glFramebufferTexture2DMultisampleIMG;
   public final long glApplyFramebufferAttachmentCMAAINTEL;
   public final long glBeginPerfQueryINTEL;
   public final long glCreatePerfQueryINTEL;
   public final long glDeletePerfQueryINTEL;
   public final long glEndPerfQueryINTEL;
   public final long glGetFirstPerfQueryIdINTEL;
   public final long glGetNextPerfQueryIdINTEL;
   public final long glGetPerfCounterInfoINTEL;
   public final long glGetPerfQueryDataINTEL;
   public final long glGetPerfQueryIdByNameINTEL;
   public final long glGetPerfQueryInfoINTEL;
   public final long glBlendBarrierKHR;
   public final long glDebugMessageControlKHR;
   public final long glDebugMessageInsertKHR;
   public final long glDebugMessageCallbackKHR;
   public final long glGetDebugMessageLogKHR;
   public final long glGetPointervKHR;
   public final long glPushDebugGroupKHR;
   public final long glPopDebugGroupKHR;
   public final long glObjectLabelKHR;
   public final long glGetObjectLabelKHR;
   public final long glObjectPtrLabelKHR;
   public final long glGetObjectPtrLabelKHR;
   public final long glMaxShaderCompilerThreadsKHR;
   public final long glGetGraphicsResetStatusKHR;
   public final long glReadnPixelsKHR;
   public final long glGetnUniformfvKHR;
   public final long glGetnUniformivKHR;
   public final long glGetnUniformuivKHR;
   public final long glFramebufferParameteriMESA;
   public final long glGetFramebufferParameterivMESA;
   public final long glAlphaToCoverageDitherControlNV;
   public final long glGetTextureHandleNV;
   public final long glGetTextureSamplerHandleNV;
   public final long glMakeTextureHandleResidentNV;
   public final long glMakeTextureHandleNonResidentNV;
   public final long glGetImageHandleNV;
   public final long glMakeImageHandleResidentNV;
   public final long glMakeImageHandleNonResidentNV;
   public final long glUniformHandleui64NV;
   public final long glUniformHandleui64vNV;
   public final long glProgramUniformHandleui64NV;
   public final long glProgramUniformHandleui64vNV;
   public final long glIsTextureHandleResidentNV;
   public final long glIsImageHandleResidentNV;
   public final long glBlendParameteriNV;
   public final long glBlendBarrierNV;
   public final long glViewportPositionWScaleNV;
   public final long glBeginConditionalRenderNV;
   public final long glEndConditionalRenderNV;
   public final long glSubpixelPrecisionBiasNV;
   public final long glConservativeRasterParameteriNV;
   public final long glCopyBufferSubDataNV;
   public final long glCoverageMaskNV;
   public final long glCoverageOperationNV;
   public final long glDrawBuffersNV;
   public final long glDrawArraysInstancedNV;
   public final long glDrawElementsInstancedNV;
   public final long glDrawVkImageNV;
   public final long glGetVkProcAddrNV;
   public final long glWaitVkSemaphoreNV;
   public final long glSignalVkSemaphoreNV;
   public final long glSignalVkFenceNV;
   public final long glDeleteFencesNV;
   public final long glGenFencesNV;
   public final long glIsFenceNV;
   public final long glTestFenceNV;
   public final long glGetFenceivNV;
   public final long glFinishFenceNV;
   public final long glSetFenceNV;
   public final long glFragmentCoverageColorNV;
   public final long glBlitFramebufferNV;
   public final long glCoverageModulationTableNV;
   public final long glGetCoverageModulationTableNV;
   public final long glCoverageModulationNV;
   public final long glRenderbufferStorageMultisampleNV;
   public final long glUniform1i64NV;
   public final long glUniform2i64NV;
   public final long glUniform3i64NV;
   public final long glUniform4i64NV;
   public final long glUniform1i64vNV;
   public final long glUniform2i64vNV;
   public final long glUniform3i64vNV;
   public final long glUniform4i64vNV;
   public final long glUniform1ui64NV;
   public final long glUniform2ui64NV;
   public final long glUniform3ui64NV;
   public final long glUniform4ui64NV;
   public final long glUniform1ui64vNV;
   public final long glUniform2ui64vNV;
   public final long glUniform3ui64vNV;
   public final long glUniform4ui64vNV;
   public final long glGetUniformi64vNV;
   public final long glGetUniformui64vNV;
   public final long glProgramUniform1i64NV;
   public final long glProgramUniform2i64NV;
   public final long glProgramUniform3i64NV;
   public final long glProgramUniform4i64NV;
   public final long glProgramUniform1i64vNV;
   public final long glProgramUniform2i64vNV;
   public final long glProgramUniform3i64vNV;
   public final long glProgramUniform4i64vNV;
   public final long glProgramUniform1ui64NV;
   public final long glProgramUniform2ui64NV;
   public final long glProgramUniform3ui64NV;
   public final long glProgramUniform4ui64NV;
   public final long glProgramUniform1ui64vNV;
   public final long glProgramUniform2ui64vNV;
   public final long glProgramUniform3ui64vNV;
   public final long glProgramUniform4ui64vNV;
   public final long glVertexAttribDivisorNV;
   public final long glGetInternalformatSampleivNV;
   public final long glGetMemoryObjectDetachedResourcesuivNV;
   public final long glResetMemoryObjectParameterNV;
   public final long glTexAttachMemoryNV;
   public final long glBufferAttachMemoryNV;
   public final long glTextureAttachMemoryNV;
   public final long glNamedBufferAttachMemoryNV;
   public final long glBufferPageCommitmentMemNV;
   public final long glNamedBufferPageCommitmentMemNV;
   public final long glTexPageCommitmentMemNV;
   public final long glTexturePageCommitmentMemNV;
   public final long glDrawMeshTasksNV;
   public final long glDrawMeshTasksIndirectNV;
   public final long glMultiDrawMeshTasksIndirectNV;
   public final long glUniformMatrix2x3fvNV;
   public final long glUniformMatrix3x2fvNV;
   public final long glUniformMatrix2x4fvNV;
   public final long glUniformMatrix4x2fvNV;
   public final long glUniformMatrix3x4fvNV;
   public final long glUniformMatrix4x3fvNV;
   public final long glPathCommandsNV;
   public final long glPathCoordsNV;
   public final long glPathSubCommandsNV;
   public final long glPathSubCoordsNV;
   public final long glPathStringNV;
   public final long glPathGlyphsNV;
   public final long glPathGlyphRangeNV;
   public final long glPathGlyphIndexArrayNV;
   public final long glPathMemoryGlyphIndexArrayNV;
   public final long glCopyPathNV;
   public final long glWeightPathsNV;
   public final long glInterpolatePathsNV;
   public final long glTransformPathNV;
   public final long glPathParameterivNV;
   public final long glPathParameteriNV;
   public final long glPathParameterfvNV;
   public final long glPathParameterfNV;
   public final long glPathDashArrayNV;
   public final long glGenPathsNV;
   public final long glDeletePathsNV;
   public final long glIsPathNV;
   public final long glPathStencilFuncNV;
   public final long glPathStencilDepthOffsetNV;
   public final long glStencilFillPathNV;
   public final long glStencilStrokePathNV;
   public final long glStencilFillPathInstancedNV;
   public final long glStencilStrokePathInstancedNV;
   public final long glPathCoverDepthFuncNV;
   public final long glCoverFillPathNV;
   public final long glCoverStrokePathNV;
   public final long glCoverFillPathInstancedNV;
   public final long glCoverStrokePathInstancedNV;
   public final long glStencilThenCoverFillPathNV;
   public final long glStencilThenCoverStrokePathNV;
   public final long glStencilThenCoverFillPathInstancedNV;
   public final long glStencilThenCoverStrokePathInstancedNV;
   public final long glPathGlyphIndexRangeNV;
   public final long glProgramPathFragmentInputGenNV;
   public final long glGetPathParameterivNV;
   public final long glGetPathParameterfvNV;
   public final long glGetPathCommandsNV;
   public final long glGetPathCoordsNV;
   public final long glGetPathDashArrayNV;
   public final long glGetPathMetricsNV;
   public final long glGetPathMetricRangeNV;
   public final long glGetPathSpacingNV;
   public final long glIsPointInFillPathNV;
   public final long glIsPointInStrokePathNV;
   public final long glGetPathLengthNV;
   public final long glPointAlongPathNV;
   public final long glMatrixLoad3x2fNV;
   public final long glMatrixLoad3x3fNV;
   public final long glMatrixLoadTranspose3x3fNV;
   public final long glMatrixMult3x2fNV;
   public final long glMatrixMult3x3fNV;
   public final long glMatrixMultTranspose3x3fNV;
   public final long glGetProgramResourcefvNV;
   public final long glPolygonModeNV;
   public final long glReadBufferNV;
   public final long glFramebufferSampleLocationsfvNV;
   public final long glNamedFramebufferSampleLocationsfvNV;
   public final long glResolveDepthValuesNV;
   public final long glScissorExclusiveArrayvNV;
   public final long glScissorExclusiveNV;
   public final long glTexImage3DNV;
   public final long glTexSubImage3DNV;
   public final long glCopyTexSubImage3DNV;
   public final long glCompressedTexImage3DNV;
   public final long glCompressedTexSubImage3DNV;
   public final long glFramebufferTextureLayerNV;
   public final long glTextureBarrierNV;
   public final long glCreateSemaphoresNV;
   public final long glSemaphoreParameterivNV;
   public final long glGetSemaphoreParameterivNV;
   public final long glViewportArrayvNV;
   public final long glViewportIndexedfNV;
   public final long glViewportIndexedfvNV;
   public final long glScissorArrayvNV;
   public final long glScissorIndexedNV;
   public final long glScissorIndexedvNV;
   public final long glDepthRangeArrayfvNV;
   public final long glDepthRangeIndexedfNV;
   public final long glGetFloati_vNV;
   public final long glEnableiNV;
   public final long glDisableiNV;
   public final long glIsEnablediNV;
   public final long glViewportSwizzleNV;
   public final long glCopyImageSubDataOES;
   public final long glEnableiOES;
   public final long glDisableiOES;
   public final long glBlendEquationiOES;
   public final long glBlendEquationSeparateiOES;
   public final long glBlendFunciOES;
   public final long glBlendFuncSeparateiOES;
   public final long glColorMaskiOES;
   public final long glIsEnablediOES;
   public final long glDrawElementsBaseVertexOES;
   public final long glDrawRangeElementsBaseVertexOES;
   public final long glDrawElementsInstancedBaseVertexOES;
   public final long glMultiDrawElementsBaseVertexOES;
   public final long glEGLImageTargetTexture2DOES;
   public final long glEGLImageTargetRenderbufferStorageOES;
   public final long glFramebufferTextureOES;
   public final long glGetProgramBinaryOES;
   public final long glProgramBinaryOES;
   public final long glMapBufferOES;
   public final long glUnmapBufferOES;
   public final long glGetBufferPointervOES;
   public final long glPrimitiveBoundingBoxOES;
   public final long glMinSampleShadingOES;
   public final long glPatchParameteriOES;
   public final long glTexImage3DOES;
   public final long glTexSubImage3DOES;
   public final long glCopyTexSubImage3DOES;
   public final long glCompressedTexImage3DOES;
   public final long glCompressedTexSubImage3DOES;
   public final long glFramebufferTexture3DOES;
   public final long glTexParameterIivOES;
   public final long glTexParameterIuivOES;
   public final long glGetTexParameterIivOES;
   public final long glGetTexParameterIuivOES;
   public final long glSamplerParameterIivOES;
   public final long glSamplerParameterIuivOES;
   public final long glGetSamplerParameterIivOES;
   public final long glGetSamplerParameterIuivOES;
   public final long glTexBufferOES;
   public final long glTexBufferRangeOES;
   public final long glTexStorage3DMultisampleOES;
   public final long glTextureViewOES;
   public final long glBindVertexArrayOES;
   public final long glDeleteVertexArraysOES;
   public final long glGenVertexArraysOES;
   public final long glIsVertexArrayOES;
   public final long glViewportArrayvOES;
   public final long glViewportIndexedfOES;
   public final long glViewportIndexedfvOES;
   public final long glScissorArrayvOES;
   public final long glScissorIndexedOES;
   public final long glScissorIndexedvOES;
   public final long glDepthRangeArrayfvOES;
   public final long glDepthRangeIndexedfOES;
   public final long glGetFloati_vOES;
   public final long glFramebufferTextureMultiviewOVR;
   public final long glNamedFramebufferTextureMultiviewOVR;
   public final long glFramebufferTextureMultisampleMultiviewOVR;
   public final long glAlphaFuncQCOM;
   public final long glGetDriverControlsQCOM;
   public final long glGetDriverControlStringQCOM;
   public final long glEnableDriverControlQCOM;
   public final long glDisableDriverControlQCOM;
   public final long glExtGetTexturesQCOM;
   public final long glExtGetBuffersQCOM;
   public final long glExtGetRenderbuffersQCOM;
   public final long glExtGetFramebuffersQCOM;
   public final long glExtGetTexLevelParameterivQCOM;
   public final long glExtTexObjectStateOverrideiQCOM;
   public final long glExtGetTexSubImageQCOM;
   public final long glExtGetBufferPointervQCOM;
   public final long glExtGetShadersQCOM;
   public final long glExtGetProgramsQCOM;
   public final long glExtIsProgramBinaryQCOM;
   public final long glExtGetProgramBinarySourceQCOM;
   public final long glExtrapolateTex2DQCOM;
   public final long glFramebufferFoveationConfigQCOM;
   public final long glFramebufferFoveationParametersQCOM;
   public final long glTexEstimateMotionQCOM;
   public final long glTexEstimateMotionRegionsQCOM;
   public final long glFramebufferFetchBarrierQCOM;
   public final long glTextureFoveationParametersQCOM;
   public final long glStartTilingQCOM;
   public final long glEndTilingQCOM;
   public final boolean GLES20;
   public final boolean GLES30;
   public final boolean GLES31;
   public final boolean GLES32;
   public final boolean GL_AMD_compressed_3DC_texture;
   public final boolean GL_AMD_compressed_ATC_texture;
   public final boolean GL_AMD_framebuffer_multisample_advanced;
   public final boolean GL_AMD_performance_monitor;
   public final boolean GL_AMD_program_binary_Z400;
   public final boolean GL_ANDROID_extension_pack_es31a;
   public final boolean GL_ANGLE_depth_texture;
   public final boolean GL_ANGLE_framebuffer_blit;
   public final boolean GL_ANGLE_framebuffer_multisample;
   public final boolean GL_ANGLE_instanced_arrays;
   public final boolean GL_ANGLE_pack_reverse_row_order;
   public final boolean GL_ANGLE_program_binary;
   public final boolean GL_ANGLE_texture_compression_dxt1;
   public final boolean GL_ANGLE_texture_compression_dxt3;
   public final boolean GL_ANGLE_texture_compression_dxt5;
   public final boolean GL_ANGLE_texture_usage;
   public final boolean GL_ANGLE_translated_shader_source;
   public final boolean GL_APPLE_clip_distance;
   public final boolean GL_APPLE_color_buffer_packed_float;
   public final boolean GL_APPLE_copy_texture_levels;
   public final boolean GL_APPLE_framebuffer_multisample;
   public final boolean GL_APPLE_rgb_422;
   public final boolean GL_APPLE_sync;
   public final boolean GL_APPLE_texture_format_BGRA8888;
   public final boolean GL_APPLE_texture_max_level;
   public final boolean GL_APPLE_texture_packed_float;
   public final boolean GL_ARM_mali_program_binary;
   public final boolean GL_ARM_mali_shader_binary;
   public final boolean GL_ARM_rgba8;
   public final boolean GL_ARM_shader_core_properties;
   public final boolean GL_ARM_shader_framebuffer_fetch;
   public final boolean GL_ARM_shader_framebuffer_fetch_depth_stencil;
   public final boolean GL_ARM_texture_unnormalized_coordinates;
   public final boolean GL_DMP_program_binary;
   public final boolean GL_DMP_shader_binary;
   public final boolean GL_EXT_base_instance;
   public final boolean GL_EXT_blend_func_extended;
   public final boolean GL_EXT_blend_minmax;
   public final boolean GL_EXT_buffer_storage;
   public final boolean GL_EXT_clear_texture;
   public final boolean GL_EXT_clip_control;
   public final boolean GL_EXT_clip_cull_distance;
   public final boolean GL_EXT_color_buffer_float;
   public final boolean GL_EXT_color_buffer_half_float;
   public final boolean GL_EXT_compressed_ETC1_RGB8_sub_texture;
   public final boolean GL_EXT_conservative_depth;
   public final boolean GL_EXT_copy_image;
   public final boolean GL_EXT_debug_label;
   public final boolean GL_EXT_debug_marker;
   public final boolean GL_EXT_depth_clamp;
   public final boolean GL_EXT_discard_framebuffer;
   public final boolean GL_EXT_disjoint_timer_query;
   public final boolean GL_EXT_draw_buffers;
   public final boolean GL_EXT_draw_buffers_indexed;
   public final boolean GL_EXT_draw_elements_base_vertex;
   public final boolean GL_EXT_draw_instanced;
   public final boolean GL_EXT_draw_transform_feedback;
   public final boolean GL_EXT_EGL_image_array;
   public final boolean GL_EXT_EGL_image_external_wrap_modes;
   public final boolean GL_EXT_EGL_image_storage;
   public final boolean GL_EXT_EGL_image_storage_compression;
   public final boolean GL_EXT_external_buffer;
   public final boolean GL_EXT_float_blend;
   public final boolean GL_EXT_fragment_shading_rate;
   public final boolean GL_EXT_fragment_shading_rate_attachment;
   public final boolean GL_EXT_fragment_shading_rate_primitive;
   public final boolean GL_EXT_framebuffer_blit_layers;
   public final boolean GL_EXT_geometry_point_size;
   public final boolean GL_EXT_geometry_shader;
   public final boolean GL_EXT_gpu_shader5;
   public final boolean GL_EXT_instanced_arrays;
   public final boolean GL_EXT_map_buffer_range;
   public final boolean GL_EXT_memory_object;
   public final boolean GL_EXT_memory_object_fd;
   public final boolean GL_EXT_memory_object_win32;
   public final boolean GL_EXT_multi_draw_arrays;
   public final boolean GL_EXT_multi_draw_indirect;
   public final boolean GL_EXT_multisample_compatibility;
   public final boolean GL_EXT_multisampled_render_to_texture;
   public final boolean GL_EXT_multisampled_render_to_texture2;
   public final boolean GL_EXT_multiview_draw_buffers;
   public final boolean GL_EXT_multiview_tessellation_geometry_shader;
   public final boolean GL_EXT_multiview_texture_multisample;
   public final boolean GL_EXT_multiview_timer_query;
   public final boolean GL_EXT_occlusion_query_boolean;
   public final boolean GL_EXT_polygon_offset_clamp;
   public final boolean GL_EXT_post_depth_coverage;
   public final boolean GL_EXT_primitive_bounding_box;
   public final boolean GL_EXT_protected_textures;
   public final boolean GL_EXT_pvrtc_sRGB;
   public final boolean GL_EXT_raster_multisample;
   public final boolean GL_EXT_read_format_bgra;
   public final boolean GL_EXT_render_snorm;
   public final boolean GL_EXT_robustness;
   public final boolean GL_EXT_semaphore;
   public final boolean GL_EXT_semaphore_fd;
   public final boolean GL_EXT_semaphore_win32;
   public final boolean GL_EXT_separate_depth_stencil;
   public final boolean GL_EXT_separate_shader_objects;
   public final boolean GL_EXT_shader_framebuffer_fetch;
   public final boolean GL_EXT_shader_framebuffer_fetch_non_coherent;
   public final boolean GL_EXT_shader_group_vote;
   public final boolean GL_EXT_shader_implicit_conversions;
   public final boolean GL_EXT_shader_integer_mix;
   public final boolean GL_EXT_shader_io_blocks;
   public final boolean GL_EXT_shader_non_constant_global_initializers;
   public final boolean GL_EXT_shader_pixel_local_storage;
   public final boolean GL_EXT_shader_pixel_local_storage2;
   public final boolean GL_EXT_shader_samples_identical;
   public final boolean GL_EXT_shader_texture_lod;
   public final boolean GL_EXT_shadow_samplers;
   public final boolean GL_EXT_sparse_texture;
   public final boolean GL_EXT_sparse_texture2;
   public final boolean GL_EXT_sRGB;
   public final boolean GL_EXT_sRGB_write_control;
   public final boolean GL_EXT_tessellation_point_size;
   public final boolean GL_EXT_tessellation_shader;
   public final boolean GL_EXT_texture_border_clamp;
   public final boolean GL_EXT_texture_buffer;
   public final boolean GL_EXT_texture_compression_astc_decode_mode;
   public final boolean GL_EXT_texture_compression_bptc;
   public final boolean GL_EXT_texture_compression_dxt1;
   public final boolean GL_EXT_texture_compression_rgtc;
   public final boolean GL_EXT_texture_compression_s3tc;
   public final boolean GL_EXT_texture_compression_s3tc_srgb;
   public final boolean GL_EXT_texture_cube_map_array;
   public final boolean GL_EXT_texture_filter_anisotropic;
   public final boolean GL_EXT_texture_filter_minmax;
   public final boolean GL_EXT_texture_format_BGRA8888;
   public final boolean GL_EXT_texture_format_sRGB_override;
   public final boolean GL_EXT_texture_mirror_clamp_to_edge;
   public final boolean GL_EXT_texture_norm16;
   public final boolean GL_EXT_texture_rg;
   public final boolean GL_EXT_texture_shadow_lod;
   public final boolean GL_EXT_texture_sRGB_decode;
   public final boolean GL_EXT_texture_sRGB_R8;
   public final boolean GL_EXT_texture_sRGB_RG8;
   public final boolean GL_EXT_texture_storage;
   public final boolean GL_EXT_texture_storage_compression;
   public final boolean GL_EXT_texture_type_2_10_10_10_REV;
   public final boolean GL_EXT_texture_view;
   public final boolean GL_EXT_unpack_subimage;
   public final boolean GL_EXT_win32_keyed_mutex;
   public final boolean GL_EXT_window_rectangles;
   public final boolean GL_EXT_YUV_target;
   public final boolean GL_FJ_shader_binary_GCCSO;
   public final boolean GL_EXT_texture_compression_astc_decode_mode_rgb9e5;
   public final boolean GL_EXT_texture_query_lod;
   public final boolean GL_IMG_framebuffer_downsample;
   public final boolean GL_IMG_multisampled_render_to_texture;
   public final boolean GL_IMG_program_binary;
   public final boolean GL_IMG_read_format;
   public final boolean GL_IMG_shader_binary;
   public final boolean GL_IMG_texture_compression_pvrtc;
   public final boolean GL_IMG_texture_compression_pvrtc2;
   public final boolean GL_IMG_texture_filter_cubic;
   public final boolean GL_INTEL_blackhole_render;
   public final boolean GL_INTEL_conservative_rasterization;
   public final boolean GL_INTEL_framebuffer_CMAA;
   public final boolean GL_INTEL_performance_query;
   public final boolean GL_INTEL_shader_integer_functions2;
   public final boolean GL_KHR_blend_equation_advanced;
   public final boolean GL_KHR_blend_equation_advanced_coherent;
   public final boolean GL_KHR_context_flush_control;
   public final boolean GL_KHR_debug;
   public final boolean GL_KHR_no_error;
   public final boolean GL_KHR_parallel_shader_compile;
   public final boolean GL_KHR_robust_buffer_access_behavior;
   public final boolean GL_KHR_robustness;
   public final boolean GL_KHR_shader_subgroup;
   public final boolean GL_KHR_texture_compression_astc_hdr;
   public final boolean GL_KHR_texture_compression_astc_ldr;
   public final boolean GL_KHR_texture_compression_astc_sliced_3d;
   public final boolean GL_MESA_bgra;
   public final boolean GL_MESA_framebuffer_flip_x;
   public final boolean GL_MESA_framebuffer_flip_y;
   public final boolean GL_MESA_framebuffer_swap_xy;
   public final boolean GL_MESA_program_binary_formats;
   public final boolean GL_MESA_tile_raster_order;
   public final boolean GL_NV_alpha_to_coverage_dither_control;
   public final boolean GL_NV_bindless_texture;
   public final boolean GL_NV_blend_equation_advanced;
   public final boolean GL_NV_blend_equation_advanced_coherent;
   public final boolean GL_NV_blend_minmax_factor;
   public final boolean GL_NV_clip_space_w_scaling;
   public final boolean GL_NV_compute_shader_derivatives;
   public final boolean GL_NV_conditional_render;
   public final boolean GL_NV_conservative_raster;
   public final boolean GL_NV_conservative_raster_pre_snap;
   public final boolean GL_NV_conservative_raster_pre_snap_triangles;
   public final boolean GL_NV_copy_buffer;
   public final boolean GL_NV_coverage_sample;
   public final boolean GL_NV_depth_nonlinear;
   public final boolean GL_NV_draw_buffers;
   public final boolean GL_NV_draw_instanced;
   public final boolean GL_NV_draw_vulkan_image;
   public final boolean GL_NV_explicit_attrib_location;
   public final boolean GL_NV_fbo_color_attachments;
   public final boolean GL_NV_fence;
   public final boolean GL_NV_fill_rectangle;
   public final boolean GL_NV_fragment_coverage_to_color;
   public final boolean GL_NV_fragment_shader_barycentric;
   public final boolean GL_NV_fragment_shader_interlock;
   public final boolean GL_NV_framebuffer_blit;
   public final boolean GL_NV_framebuffer_mixed_samples;
   public final boolean GL_NV_framebuffer_multisample;
   public final boolean GL_NV_generate_mipmap_sRGB;
   public final boolean GL_NV_geometry_shader_passthrough;
   public final boolean GL_NV_gpu_shader5;
   public final boolean GL_NV_image_formats;
   public final boolean GL_NV_instanced_arrays;
   public final boolean GL_NV_internalformat_sample_query;
   public final boolean GL_NV_memory_attachment;
   public final boolean GL_NV_memory_object_sparse;
   public final boolean GL_NV_mesh_shader;
   public final boolean GL_NV_non_square_matrices;
   public final boolean GL_NV_pack_subimage;
   public final boolean GL_NV_path_rendering;
   public final boolean GL_NV_path_rendering_shared_edge;
   public final boolean GL_NV_polygon_mode;
   public final boolean GL_NV_primitive_shading_rate;
   public final boolean GL_NV_read_buffer;
   public final boolean GL_NV_read_buffer_front;
   public final boolean GL_NV_read_depth;
   public final boolean GL_NV_read_depth_stencil;
   public final boolean GL_NV_read_stencil;
   public final boolean GL_NV_representative_fragment_test;
   public final boolean GL_NV_sample_locations;
   public final boolean GL_NV_sample_mask_override_coverage;
   public final boolean GL_NV_scissor_exclusive;
   public final boolean GL_NV_shader_atomic_fp16_vector;
   public final boolean GL_NV_shader_noperspective_interpolation;
   public final boolean GL_NV_shader_subgroup_partitioned;
   public final boolean GL_NV_shader_texture_footprint;
   public final boolean GL_NV_shadow_samplers_array;
   public final boolean GL_NV_shadow_samplers_cube;
   public final boolean GL_NV_sRGB_formats;
   public final boolean GL_NV_stereo_view_rendering;
   public final boolean GL_NV_texture_array;
   public final boolean GL_NV_texture_barrier;
   public final boolean GL_NV_texture_border_clamp;
   public final boolean GL_NV_texture_compression_s3tc;
   public final boolean GL_NV_texture_compression_s3tc_update;
   public final boolean GL_NV_texture_npot_2D_mipmap;
   public final boolean GL_NV_timeline_semaphore;
   public final boolean GL_NV_viewport_array;
   public final boolean GL_NV_viewport_array2;
   public final boolean GL_NV_viewport_swizzle;
   public final boolean GL_NVX_blend_equation_advanced_multi_draw_buffers;
   public final boolean GL_OES_compressed_ETC1_RGB8_texture;
   public final boolean GL_OES_compressed_paletted_texture;
   public final boolean GL_OES_copy_image;
   public final boolean GL_OES_depth24;
   public final boolean GL_OES_depth32;
   public final boolean GL_OES_depth_texture;
   public final boolean GL_OES_depth_texture_cube_map;
   public final boolean GL_OES_draw_buffers_indexed;
   public final boolean GL_OES_draw_elements_base_vertex;
   public final boolean GL_OES_EGL_image;
   public final boolean GL_OES_EGL_image_external;
   public final boolean GL_OES_EGL_image_external_essl3;
   public final boolean GL_OES_element_index_uint;
   public final boolean GL_OES_fbo_render_mipmap;
   public final boolean GL_OES_geometry_point_size;
   public final boolean GL_OES_geometry_shader;
   public final boolean GL_OES_get_program_binary;
   public final boolean GL_OES_gpu_shader5;
   public final boolean GL_OES_mapbuffer;
   public final boolean GL_OES_packed_depth_stencil;
   public final boolean GL_OES_primitive_bounding_box;
   public final boolean GL_OES_required_internalformat;
   public final boolean GL_OES_rgb8_rgba8;
   public final boolean GL_OES_sample_shading;
   public final boolean GL_OES_sample_variables;
   public final boolean GL_OES_shader_image_atomic;
   public final boolean GL_OES_shader_io_blocks;
   public final boolean GL_OES_shader_multisample_interpolation;
   public final boolean GL_OES_standard_derivatives;
   public final boolean GL_OES_stencil1;
   public final boolean GL_OES_stencil4;
   public final boolean GL_OES_stencil8;
   public final boolean GL_OES_surfaceless_context;
   public final boolean GL_OES_tessellation_point_size;
   public final boolean GL_OES_tessellation_shader;
   public final boolean GL_OES_texture_3D;
   public final boolean GL_OES_texture_border_clamp;
   public final boolean GL_OES_texture_buffer;
   public final boolean GL_OES_texture_compression_astc;
   public final boolean GL_OES_texture_cube_map_array;
   public final boolean GL_OES_texture_float;
   public final boolean GL_OES_texture_float_linear;
   public final boolean GL_OES_texture_half_float;
   public final boolean GL_OES_texture_half_float_linear;
   public final boolean GL_OES_texture_npot;
   public final boolean GL_OES_texture_stencil8;
   public final boolean GL_OES_texture_storage_multisample_2d_array;
   public final boolean GL_OES_texture_view;
   public final boolean GL_OES_vertex_array_object;
   public final boolean GL_OES_vertex_half_float;
   public final boolean GL_OES_vertex_type_10_10_10_2;
   public final boolean GL_OES_viewport_array;
   public final boolean GL_OVR_multiview;
   public final boolean GL_OVR_multiview2;
   public final boolean GL_OVR_multiview_multisampled_render_to_texture;
   public final boolean GL_QCOM_alpha_test;
   public final boolean GL_QCOM_binning_control;
   public final boolean GL_QCOM_driver_control;
   public final boolean GL_QCOM_extended_get;
   public final boolean GL_QCOM_extended_get2;
   public final boolean GL_QCOM_frame_extrapolation;
   public final boolean GL_QCOM_framebuffer_foveated;
   public final boolean GL_QCOM_motion_estimation;
   public final boolean GL_QCOM_perfmon_global_mode;
   public final boolean GL_QCOM_render_shared_exponent;
   public final boolean GL_QCOM_render_sRGB_R8_RG8;
   public final boolean GL_QCOM_shader_framebuffer_fetch_noncoherent;
   public final boolean GL_QCOM_shader_framebuffer_fetch_rate;
   public final boolean GL_QCOM_shading_rate;
   public final boolean GL_QCOM_texture_foveated;
   public final boolean GL_QCOM_texture_foveated2;
   public final boolean GL_QCOM_texture_foveated_subsampled_layout;
   public final boolean GL_QCOM_texture_lod_bias;
   public final boolean GL_QCOM_tiled_rendering;
   public final boolean GL_QCOM_writeonly_rendering;
   public final boolean GL_QCOM_ycbcr_degamma;
   public final boolean GL_QCOM_YUV_texture_gather;
   public final boolean GL_VIV_shader_binary;
   final PointerBuffer addresses;

   public GLESCapabilities(FunctionProvider var1, Set var2, IntFunction var3) {
      PointerBuffer var878 = (PointerBuffer)var3.apply(874);
      this.GLES20 = check_GLES20(var1, var878, var2);
      this.GLES30 = check_GLES30(var1, var878, var2);
      this.GLES31 = check_GLES31(var1, var878, var2);
      this.GLES32 = check_GLES32(var1, var878, var2);
      this.GL_AMD_compressed_3DC_texture = var2.contains("GL_AMD_compressed_3DC_texture");
      this.GL_AMD_compressed_ATC_texture = var2.contains("GL_AMD_compressed_ATC_texture");
      this.GL_AMD_framebuffer_multisample_advanced = check_AMD_framebuffer_multisample_advanced(var1, var878, var2);
      this.GL_AMD_performance_monitor = check_AMD_performance_monitor(var1, var878, var2);
      this.GL_AMD_program_binary_Z400 = var2.contains("GL_AMD_program_binary_Z400");
      this.GL_ANDROID_extension_pack_es31a = var2.contains("GL_ANDROID_extension_pack_es31a");
      this.GL_ANGLE_depth_texture = var2.contains("GL_ANGLE_depth_texture");
      this.GL_ANGLE_framebuffer_blit = check_ANGLE_framebuffer_blit(var1, var878, var2);
      this.GL_ANGLE_framebuffer_multisample = check_ANGLE_framebuffer_multisample(var1, var878, var2);
      this.GL_ANGLE_instanced_arrays = check_ANGLE_instanced_arrays(var1, var878, var2);
      this.GL_ANGLE_pack_reverse_row_order = var2.contains("GL_ANGLE_pack_reverse_row_order");
      this.GL_ANGLE_program_binary = var2.contains("GL_ANGLE_program_binary");
      this.GL_ANGLE_texture_compression_dxt1 = var2.contains("GL_ANGLE_texture_compression_dxt1");
      this.GL_ANGLE_texture_compression_dxt3 = var2.contains("GL_ANGLE_texture_compression_dxt3");
      this.GL_ANGLE_texture_compression_dxt5 = var2.contains("GL_ANGLE_texture_compression_dxt5");
      this.GL_ANGLE_texture_usage = var2.contains("GL_ANGLE_texture_usage");
      this.GL_ANGLE_translated_shader_source = check_ANGLE_translated_shader_source(var1, var878, var2);
      this.GL_APPLE_clip_distance = var2.contains("GL_APPLE_clip_distance");
      this.GL_APPLE_color_buffer_packed_float = var2.contains("GL_APPLE_color_buffer_packed_float");
      this.GL_APPLE_copy_texture_levels = check_APPLE_copy_texture_levels(var1, var878, var2);
      this.GL_APPLE_framebuffer_multisample = check_APPLE_framebuffer_multisample(var1, var878, var2);
      this.GL_APPLE_rgb_422 = var2.contains("GL_APPLE_rgb_422");
      this.GL_APPLE_sync = check_APPLE_sync(var1, var878, var2);
      this.GL_APPLE_texture_format_BGRA8888 = var2.contains("GL_APPLE_texture_format_BGRA8888");
      this.GL_APPLE_texture_max_level = var2.contains("GL_APPLE_texture_max_level");
      this.GL_APPLE_texture_packed_float = var2.contains("GL_APPLE_texture_packed_float");
      this.GL_ARM_mali_program_binary = var2.contains("GL_ARM_mali_program_binary");
      this.GL_ARM_mali_shader_binary = var2.contains("GL_ARM_mali_shader_binary");
      this.GL_ARM_rgba8 = var2.contains("GL_ARM_rgba8");
      this.GL_ARM_shader_core_properties = check_ARM_shader_core_properties(var1, var878, var2);
      this.GL_ARM_shader_framebuffer_fetch = var2.contains("GL_ARM_shader_framebuffer_fetch");
      this.GL_ARM_shader_framebuffer_fetch_depth_stencil = var2.contains("GL_ARM_shader_framebuffer_fetch_depth_stencil");
      this.GL_ARM_texture_unnormalized_coordinates = var2.contains("GL_ARM_texture_unnormalized_coordinates");
      this.GL_DMP_program_binary = var2.contains("GL_DMP_program_binary");
      this.GL_DMP_shader_binary = var2.contains("GL_DMP_shader_binary");
      this.GL_EXT_base_instance = check_EXT_base_instance(var1, var878, var2);
      this.GL_EXT_blend_func_extended = check_EXT_blend_func_extended(var1, var878, var2);
      this.GL_EXT_blend_minmax = var2.contains("GL_EXT_blend_minmax");
      this.GL_EXT_buffer_storage = check_EXT_buffer_storage(var1, var878, var2);
      this.GL_EXT_clear_texture = check_EXT_clear_texture(var1, var878, var2);
      this.GL_EXT_clip_control = check_EXT_clip_control(var1, var878, var2);
      this.GL_EXT_clip_cull_distance = var2.contains("GL_EXT_clip_cull_distance");
      this.GL_EXT_color_buffer_float = var2.contains("GL_EXT_color_buffer_float");
      this.GL_EXT_color_buffer_half_float = var2.contains("GL_EXT_color_buffer_half_float");
      this.GL_EXT_compressed_ETC1_RGB8_sub_texture = var2.contains("GL_EXT_compressed_ETC1_RGB8_sub_texture");
      this.GL_EXT_conservative_depth = var2.contains("GL_EXT_conservative_depth");
      this.GL_EXT_copy_image = check_EXT_copy_image(var1, var878, var2);
      this.GL_EXT_debug_label = check_EXT_debug_label(var1, var878, var2);
      this.GL_EXT_debug_marker = check_EXT_debug_marker(var1, var878, var2);
      this.GL_EXT_depth_clamp = var2.contains("GL_EXT_depth_clamp");
      this.GL_EXT_discard_framebuffer = check_EXT_discard_framebuffer(var1, var878, var2);
      this.GL_EXT_disjoint_timer_query = check_EXT_disjoint_timer_query(var1, var878, var2);
      this.GL_EXT_draw_buffers = check_EXT_draw_buffers(var1, var878, var2);
      this.GL_EXT_draw_buffers_indexed = check_EXT_draw_buffers_indexed(var1, var878, var2);
      this.GL_EXT_draw_elements_base_vertex = check_EXT_draw_elements_base_vertex(var1, var878, var2);
      this.GL_EXT_draw_instanced = check_EXT_draw_instanced(var1, var878, var2);
      this.GL_EXT_draw_transform_feedback = check_EXT_draw_transform_feedback(var1, var878, var2);
      this.GL_EXT_EGL_image_array = var2.contains("GL_EXT_EGL_image_array");
      this.GL_EXT_EGL_image_external_wrap_modes = var2.contains("GL_EXT_EGL_image_external_wrap_modes");
      this.GL_EXT_EGL_image_storage = check_EXT_EGL_image_storage(var1, var878, var2);
      this.GL_EXT_EGL_image_storage_compression = var2.contains("GL_EXT_EGL_image_storage_compression");
      this.GL_EXT_external_buffer = check_EXT_external_buffer(var1, var878, var2);
      this.GL_EXT_float_blend = var2.contains("GL_EXT_float_blend");
      this.GL_EXT_fragment_shading_rate = check_EXT_fragment_shading_rate(var1, var878, var2);
      this.GL_EXT_fragment_shading_rate_attachment = var2.contains("GL_EXT_fragment_shading_rate_attachment");
      this.GL_EXT_fragment_shading_rate_primitive = var2.contains("GL_EXT_fragment_shading_rate_primitive");
      this.GL_EXT_framebuffer_blit_layers = check_EXT_framebuffer_blit_layers(var1, var878, var2);
      this.GL_EXT_geometry_point_size = var2.contains("GL_EXT_geometry_point_size");
      this.GL_EXT_geometry_shader = check_EXT_geometry_shader(var1, var878, var2);
      this.GL_EXT_gpu_shader5 = var2.contains("GL_EXT_gpu_shader5");
      this.GL_EXT_instanced_arrays = check_EXT_instanced_arrays(var1, var878, var2);
      this.GL_EXT_map_buffer_range = check_EXT_map_buffer_range(var1, var878, var2);
      this.GL_EXT_memory_object = check_EXT_memory_object(var1, var878, var2);
      this.GL_EXT_memory_object_fd = check_EXT_memory_object_fd(var1, var878, var2);
      this.GL_EXT_memory_object_win32 = check_EXT_memory_object_win32(var1, var878, var2);
      this.GL_EXT_multi_draw_arrays = check_EXT_multi_draw_arrays(var1, var878, var2);
      this.GL_EXT_multi_draw_indirect = check_EXT_multi_draw_indirect(var1, var878, var2);
      this.GL_EXT_multisample_compatibility = var2.contains("GL_EXT_multisample_compatibility");
      this.GL_EXT_multisampled_render_to_texture = check_EXT_multisampled_render_to_texture(var1, var878, var2);
      this.GL_EXT_multisampled_render_to_texture2 = var2.contains("GL_EXT_multisampled_render_to_texture2");
      this.GL_EXT_multiview_draw_buffers = check_EXT_multiview_draw_buffers(var1, var878, var2);
      this.GL_EXT_multiview_tessellation_geometry_shader = var2.contains("GL_EXT_multiview_tessellation_geometry_shader");
      this.GL_EXT_multiview_texture_multisample = var2.contains("GL_EXT_multiview_texture_multisample");
      this.GL_EXT_multiview_timer_query = var2.contains("GL_EXT_multiview_timer_query");
      this.GL_EXT_occlusion_query_boolean = check_EXT_occlusion_query_boolean(var1, var878, var2);
      this.GL_EXT_polygon_offset_clamp = check_EXT_polygon_offset_clamp(var1, var878, var2);
      this.GL_EXT_post_depth_coverage = var2.contains("GL_EXT_post_depth_coverage");
      this.GL_EXT_primitive_bounding_box = check_EXT_primitive_bounding_box(var1, var878, var2);
      this.GL_EXT_protected_textures = var2.contains("GL_EXT_protected_textures");
      this.GL_EXT_pvrtc_sRGB = var2.contains("GL_EXT_pvrtc_sRGB");
      this.GL_EXT_raster_multisample = check_EXT_raster_multisample(var1, var878, var2);
      this.GL_EXT_read_format_bgra = var2.contains("GL_EXT_read_format_bgra");
      this.GL_EXT_render_snorm = var2.contains("GL_EXT_render_snorm");
      this.GL_EXT_robustness = check_EXT_robustness(var1, var878, var2);
      this.GL_EXT_semaphore = check_EXT_semaphore(var1, var878, var2);
      this.GL_EXT_semaphore_fd = check_EXT_semaphore_fd(var1, var878, var2);
      this.GL_EXT_semaphore_win32 = check_EXT_semaphore_win32(var1, var878, var2);
      this.GL_EXT_separate_depth_stencil = var2.contains("GL_EXT_separate_depth_stencil");
      this.GL_EXT_separate_shader_objects = check_EXT_separate_shader_objects(var1, var878, var2);
      this.GL_EXT_shader_framebuffer_fetch = var2.contains("GL_EXT_shader_framebuffer_fetch");
      this.GL_EXT_shader_framebuffer_fetch_non_coherent = check_EXT_shader_framebuffer_fetch_non_coherent(var1, var878, var2);
      this.GL_EXT_shader_group_vote = var2.contains("GL_EXT_shader_group_vote");
      this.GL_EXT_shader_implicit_conversions = var2.contains("GL_EXT_shader_implicit_conversions");
      this.GL_EXT_shader_integer_mix = var2.contains("GL_EXT_shader_integer_mix");
      this.GL_EXT_shader_io_blocks = var2.contains("GL_EXT_shader_io_blocks");
      this.GL_EXT_shader_non_constant_global_initializers = var2.contains("GL_EXT_shader_non_constant_global_initializers");
      this.GL_EXT_shader_pixel_local_storage = var2.contains("GL_EXT_shader_pixel_local_storage");
      this.GL_EXT_shader_pixel_local_storage2 = check_EXT_shader_pixel_local_storage2(var1, var878, var2);
      this.GL_EXT_shader_samples_identical = var2.contains("GL_EXT_shader_samples_identical");
      this.GL_EXT_shader_texture_lod = var2.contains("GL_EXT_shader_texture_lod");
      this.GL_EXT_shadow_samplers = var2.contains("GL_EXT_shadow_samplers");
      this.GL_EXT_sparse_texture = check_EXT_sparse_texture(var1, var878, var2);
      this.GL_EXT_sparse_texture2 = var2.contains("GL_EXT_sparse_texture2");
      this.GL_EXT_sRGB = var2.contains("GL_EXT_sRGB");
      this.GL_EXT_sRGB_write_control = var2.contains("GL_EXT_sRGB_write_control");
      this.GL_EXT_tessellation_point_size = var2.contains("GL_EXT_tessellation_point_size");
      this.GL_EXT_tessellation_shader = check_EXT_tessellation_shader(var1, var878, var2);
      this.GL_EXT_texture_border_clamp = check_EXT_texture_border_clamp(var1, var878, var2);
      this.GL_EXT_texture_buffer = check_EXT_texture_buffer(var1, var878, var2);
      this.GL_EXT_texture_compression_astc_decode_mode = var2.contains("GL_EXT_texture_compression_astc_decode_mode");
      this.GL_EXT_texture_compression_bptc = var2.contains("GL_EXT_texture_compression_bptc");
      this.GL_EXT_texture_compression_dxt1 = var2.contains("GL_EXT_texture_compression_dxt1");
      this.GL_EXT_texture_compression_rgtc = var2.contains("GL_EXT_texture_compression_rgtc");
      this.GL_EXT_texture_compression_s3tc = var2.contains("GL_EXT_texture_compression_s3tc");
      this.GL_EXT_texture_compression_s3tc_srgb = var2.contains("GL_EXT_texture_compression_s3tc_srgb");
      this.GL_EXT_texture_cube_map_array = var2.contains("GL_EXT_texture_cube_map_array");
      this.GL_EXT_texture_filter_anisotropic = var2.contains("GL_EXT_texture_filter_anisotropic");
      this.GL_EXT_texture_filter_minmax = var2.contains("GL_EXT_texture_filter_minmax");
      this.GL_EXT_texture_format_BGRA8888 = var2.contains("GL_EXT_texture_format_BGRA8888");
      this.GL_EXT_texture_format_sRGB_override = var2.contains("GL_EXT_texture_format_sRGB_override");
      this.GL_EXT_texture_mirror_clamp_to_edge = var2.contains("GL_EXT_texture_mirror_clamp_to_edge");
      this.GL_EXT_texture_norm16 = var2.contains("GL_EXT_texture_norm16");
      this.GL_EXT_texture_rg = var2.contains("GL_EXT_texture_rg");
      this.GL_EXT_texture_shadow_lod = var2.contains("GL_EXT_texture_shadow_lod");
      this.GL_EXT_texture_sRGB_decode = var2.contains("GL_EXT_texture_sRGB_decode");
      this.GL_EXT_texture_sRGB_R8 = var2.contains("GL_EXT_texture_sRGB_R8");
      this.GL_EXT_texture_sRGB_RG8 = var2.contains("GL_EXT_texture_sRGB_RG8");
      this.GL_EXT_texture_storage = check_EXT_texture_storage(var1, var878, var2);
      this.GL_EXT_texture_storage_compression = check_EXT_texture_storage_compression(var1, var878, var2);
      this.GL_EXT_texture_type_2_10_10_10_REV = var2.contains("GL_EXT_texture_type_2_10_10_10_REV");
      this.GL_EXT_texture_view = check_EXT_texture_view(var1, var878, var2);
      this.GL_EXT_unpack_subimage = var2.contains("GL_EXT_unpack_subimage");
      this.GL_EXT_win32_keyed_mutex = check_EXT_win32_keyed_mutex(var1, var878, var2);
      this.GL_EXT_window_rectangles = check_EXT_window_rectangles(var1, var878, var2);
      this.GL_EXT_YUV_target = var2.contains("GL_EXT_YUV_target");
      this.GL_FJ_shader_binary_GCCSO = var2.contains("GL_FJ_shader_binary_GCCSO");
      this.GL_EXT_texture_compression_astc_decode_mode_rgb9e5 = var2.contains("GL_EXT_texture_compression_astc_decode_mode_rgb9e5");
      this.GL_EXT_texture_query_lod = var2.contains("GL_EXT_texture_query_lod");
      this.GL_IMG_framebuffer_downsample = check_IMG_framebuffer_downsample(var1, var878, var2);
      this.GL_IMG_multisampled_render_to_texture = check_IMG_multisampled_render_to_texture(var1, var878, var2);
      this.GL_IMG_program_binary = var2.contains("GL_IMG_program_binary");
      this.GL_IMG_read_format = var2.contains("GL_IMG_read_format");
      this.GL_IMG_shader_binary = var2.contains("GL_IMG_shader_binary");
      this.GL_IMG_texture_compression_pvrtc = var2.contains("GL_IMG_texture_compression_pvrtc");
      this.GL_IMG_texture_compression_pvrtc2 = var2.contains("GL_IMG_texture_compression_pvrtc2");
      this.GL_IMG_texture_filter_cubic = var2.contains("GL_IMG_texture_filter_cubic");
      this.GL_INTEL_blackhole_render = var2.contains("GL_INTEL_blackhole_render");
      this.GL_INTEL_conservative_rasterization = var2.contains("GL_INTEL_conservative_rasterization");
      this.GL_INTEL_framebuffer_CMAA = check_INTEL_framebuffer_CMAA(var1, var878, var2);
      this.GL_INTEL_performance_query = check_INTEL_performance_query(var1, var878, var2);
      this.GL_INTEL_shader_integer_functions2 = var2.contains("GL_INTEL_shader_integer_functions2");
      this.GL_KHR_blend_equation_advanced = check_KHR_blend_equation_advanced(var1, var878, var2);
      this.GL_KHR_blend_equation_advanced_coherent = var2.contains("GL_KHR_blend_equation_advanced_coherent");
      this.GL_KHR_context_flush_control = var2.contains("GL_KHR_context_flush_control");
      this.GL_KHR_debug = check_KHR_debug(var1, var878, var2);
      this.GL_KHR_no_error = var2.contains("GL_KHR_no_error");
      this.GL_KHR_parallel_shader_compile = check_KHR_parallel_shader_compile(var1, var878, var2);
      this.GL_KHR_robust_buffer_access_behavior = var2.contains("GL_KHR_robust_buffer_access_behavior");
      this.GL_KHR_robustness = check_KHR_robustness(var1, var878, var2);
      this.GL_KHR_shader_subgroup = var2.contains("GL_KHR_shader_subgroup");
      this.GL_KHR_texture_compression_astc_hdr = var2.contains("GL_KHR_texture_compression_astc_hdr");
      this.GL_KHR_texture_compression_astc_ldr = var2.contains("GL_KHR_texture_compression_astc_ldr");
      this.GL_KHR_texture_compression_astc_sliced_3d = var2.contains("GL_KHR_texture_compression_astc_sliced_3d");
      this.GL_MESA_bgra = var2.contains("GL_MESA_bgra");
      this.GL_MESA_framebuffer_flip_x = var2.contains("GL_MESA_framebuffer_flip_x");
      this.GL_MESA_framebuffer_flip_y = check_MESA_framebuffer_flip_y(var1, var878, var2);
      this.GL_MESA_framebuffer_swap_xy = var2.contains("GL_MESA_framebuffer_swap_xy");
      this.GL_MESA_program_binary_formats = var2.contains("GL_MESA_program_binary_formats");
      this.GL_MESA_tile_raster_order = var2.contains("GL_MESA_tile_raster_order");
      this.GL_NV_alpha_to_coverage_dither_control = check_NV_alpha_to_coverage_dither_control(var1, var878, var2);
      this.GL_NV_bindless_texture = check_NV_bindless_texture(var1, var878, var2);
      this.GL_NV_blend_equation_advanced = check_NV_blend_equation_advanced(var1, var878, var2);
      this.GL_NV_blend_equation_advanced_coherent = var2.contains("GL_NV_blend_equation_advanced_coherent");
      this.GL_NV_blend_minmax_factor = var2.contains("GL_NV_blend_minmax_factor");
      this.GL_NV_clip_space_w_scaling = check_NV_clip_space_w_scaling(var1, var878, var2);
      this.GL_NV_compute_shader_derivatives = var2.contains("GL_NV_compute_shader_derivatives");
      this.GL_NV_conditional_render = check_NV_conditional_render(var1, var878, var2);
      this.GL_NV_conservative_raster = check_NV_conservative_raster(var1, var878, var2);
      this.GL_NV_conservative_raster_pre_snap = var2.contains("GL_NV_conservative_raster_pre_snap");
      this.GL_NV_conservative_raster_pre_snap_triangles = check_NV_conservative_raster_pre_snap_triangles(var1, var878, var2);
      this.GL_NV_copy_buffer = check_NV_copy_buffer(var1, var878, var2);
      this.GL_NV_coverage_sample = check_NV_coverage_sample(var1, var878, var2);
      this.GL_NV_depth_nonlinear = var2.contains("GL_NV_depth_nonlinear");
      this.GL_NV_draw_buffers = check_NV_draw_buffers(var1, var878, var2);
      this.GL_NV_draw_instanced = check_NV_draw_instanced(var1, var878, var2);
      this.GL_NV_draw_vulkan_image = check_NV_draw_vulkan_image(var1, var878, var2);
      this.GL_NV_explicit_attrib_location = var2.contains("GL_NV_explicit_attrib_location");
      this.GL_NV_fbo_color_attachments = var2.contains("GL_NV_fbo_color_attachments");
      this.GL_NV_fence = check_NV_fence(var1, var878, var2);
      this.GL_NV_fill_rectangle = var2.contains("GL_NV_fill_rectangle");
      this.GL_NV_fragment_coverage_to_color = check_NV_fragment_coverage_to_color(var1, var878, var2);
      this.GL_NV_fragment_shader_barycentric = var2.contains("GL_NV_fragment_shader_barycentric");
      this.GL_NV_fragment_shader_interlock = var2.contains("GL_NV_fragment_shader_interlock");
      this.GL_NV_framebuffer_blit = check_NV_framebuffer_blit(var1, var878, var2);
      this.GL_NV_framebuffer_mixed_samples = check_NV_framebuffer_mixed_samples(var1, var878, var2);
      this.GL_NV_framebuffer_multisample = check_NV_framebuffer_multisample(var1, var878, var2);
      this.GL_NV_generate_mipmap_sRGB = var2.contains("GL_NV_generate_mipmap_sRGB");
      this.GL_NV_geometry_shader_passthrough = var2.contains("GL_NV_geometry_shader_passthrough");
      this.GL_NV_gpu_shader5 = check_NV_gpu_shader5(var1, var878, var2);
      this.GL_NV_image_formats = var2.contains("GL_NV_image_formats");
      this.GL_NV_instanced_arrays = check_NV_instanced_arrays(var1, var878, var2);
      this.GL_NV_internalformat_sample_query = check_NV_internalformat_sample_query(var1, var878, var2);
      this.GL_NV_memory_attachment = check_NV_memory_attachment(var1, var878, var2);
      this.GL_NV_memory_object_sparse = check_NV_memory_object_sparse(var1, var878, var2);
      this.GL_NV_mesh_shader = check_NV_mesh_shader(var1, var878, var2);
      this.GL_NV_non_square_matrices = check_NV_non_square_matrices(var1, var878, var2);
      this.GL_NV_pack_subimage = var2.contains("GL_NV_pack_subimage");
      this.GL_NV_path_rendering = check_NV_path_rendering(var1, var878, var2);
      this.GL_NV_path_rendering_shared_edge = var2.contains("GL_NV_path_rendering_shared_edge");
      this.GL_NV_polygon_mode = check_NV_polygon_mode(var1, var878, var2);
      this.GL_NV_primitive_shading_rate = var2.contains("GL_NV_primitive_shading_rate");
      this.GL_NV_read_buffer = check_NV_read_buffer(var1, var878, var2);
      this.GL_NV_read_buffer_front = var2.contains("GL_NV_read_buffer_front");
      this.GL_NV_read_depth = var2.contains("GL_NV_read_depth");
      this.GL_NV_read_depth_stencil = var2.contains("GL_NV_read_depth_stencil");
      this.GL_NV_read_stencil = var2.contains("GL_NV_read_stencil");
      this.GL_NV_representative_fragment_test = var2.contains("GL_NV_representative_fragment_test");
      this.GL_NV_sample_locations = check_NV_sample_locations(var1, var878, var2);
      this.GL_NV_sample_mask_override_coverage = var2.contains("GL_NV_sample_mask_override_coverage");
      this.GL_NV_scissor_exclusive = check_NV_scissor_exclusive(var1, var878, var2);
      this.GL_NV_shader_atomic_fp16_vector = var2.contains("GL_NV_shader_atomic_fp16_vector");
      this.GL_NV_shader_noperspective_interpolation = var2.contains("GL_NV_shader_noperspective_interpolation");
      this.GL_NV_shader_subgroup_partitioned = var2.contains("GL_NV_shader_subgroup_partitioned");
      this.GL_NV_shader_texture_footprint = var2.contains("GL_NV_shader_texture_footprint");
      this.GL_NV_shadow_samplers_array = var2.contains("GL_NV_shadow_samplers_array");
      this.GL_NV_shadow_samplers_cube = var2.contains("GL_NV_shadow_samplers_cube");
      this.GL_NV_sRGB_formats = var2.contains("GL_NV_sRGB_formats");
      this.GL_NV_stereo_view_rendering = var2.contains("GL_NV_stereo_view_rendering");
      this.GL_NV_texture_array = check_NV_texture_array(var1, var878, var2);
      this.GL_NV_texture_barrier = check_NV_texture_barrier(var1, var878, var2);
      this.GL_NV_texture_border_clamp = var2.contains("GL_NV_texture_border_clamp");
      this.GL_NV_texture_compression_s3tc = var2.contains("GL_NV_texture_compression_s3tc");
      this.GL_NV_texture_compression_s3tc_update = var2.contains("GL_NV_texture_compression_s3tc_update");
      this.GL_NV_texture_npot_2D_mipmap = var2.contains("GL_NV_texture_npot_2D_mipmap");
      this.GL_NV_timeline_semaphore = check_NV_timeline_semaphore(var1, var878, var2);
      this.GL_NV_viewport_array = check_NV_viewport_array(var1, var878, var2);
      this.GL_NV_viewport_array2 = var2.contains("GL_NV_viewport_array2");
      this.GL_NV_viewport_swizzle = check_NV_viewport_swizzle(var1, var878, var2);
      this.GL_NVX_blend_equation_advanced_multi_draw_buffers = var2.contains("GL_NVX_blend_equation_advanced_multi_draw_buffers");
      this.GL_OES_compressed_ETC1_RGB8_texture = var2.contains("GL_OES_compressed_ETC1_RGB8_texture");
      this.GL_OES_compressed_paletted_texture = var2.contains("GL_OES_compressed_paletted_texture");
      this.GL_OES_copy_image = check_OES_copy_image(var1, var878, var2);
      this.GL_OES_depth24 = var2.contains("GL_OES_depth24");
      this.GL_OES_depth32 = var2.contains("GL_OES_depth32");
      this.GL_OES_depth_texture = var2.contains("GL_OES_depth_texture");
      this.GL_OES_depth_texture_cube_map = var2.contains("GL_OES_depth_texture_cube_map");
      this.GL_OES_draw_buffers_indexed = check_OES_draw_buffers_indexed(var1, var878, var2);
      this.GL_OES_draw_elements_base_vertex = check_OES_draw_elements_base_vertex(var1, var878, var2);
      this.GL_OES_EGL_image = check_OES_EGL_image(var1, var878, var2);
      this.GL_OES_EGL_image_external = var2.contains("GL_OES_EGL_image_external");
      this.GL_OES_EGL_image_external_essl3 = var2.contains("GL_OES_EGL_image_external_essl3");
      this.GL_OES_element_index_uint = var2.contains("GL_OES_element_index_uint");
      this.GL_OES_fbo_render_mipmap = var2.contains("GL_OES_fbo_render_mipmap");
      this.GL_OES_geometry_point_size = var2.contains("GL_OES_geometry_point_size");
      this.GL_OES_geometry_shader = check_OES_geometry_shader(var1, var878, var2);
      this.GL_OES_get_program_binary = check_OES_get_program_binary(var1, var878, var2);
      this.GL_OES_gpu_shader5 = var2.contains("GL_OES_gpu_shader5");
      this.GL_OES_mapbuffer = check_OES_mapbuffer(var1, var878, var2);
      this.GL_OES_packed_depth_stencil = var2.contains("GL_OES_packed_depth_stencil");
      this.GL_OES_primitive_bounding_box = check_OES_primitive_bounding_box(var1, var878, var2);
      this.GL_OES_required_internalformat = var2.contains("GL_OES_required_internalformat");
      this.GL_OES_rgb8_rgba8 = var2.contains("GL_OES_rgb8_rgba8");
      this.GL_OES_sample_shading = check_OES_sample_shading(var1, var878, var2);
      this.GL_OES_sample_variables = var2.contains("GL_OES_sample_variables");
      this.GL_OES_shader_image_atomic = var2.contains("GL_OES_shader_image_atomic");
      this.GL_OES_shader_io_blocks = var2.contains("GL_OES_shader_io_blocks");
      this.GL_OES_shader_multisample_interpolation = var2.contains("GL_OES_shader_multisample_interpolation");
      this.GL_OES_standard_derivatives = var2.contains("GL_OES_standard_derivatives");
      this.GL_OES_stencil1 = var2.contains("GL_OES_stencil1");
      this.GL_OES_stencil4 = var2.contains("GL_OES_stencil4");
      this.GL_OES_stencil8 = var2.contains("GL_OES_stencil8");
      this.GL_OES_surfaceless_context = var2.contains("GL_OES_surfaceless_context");
      this.GL_OES_tessellation_point_size = var2.contains("GL_OES_tessellation_point_size");
      this.GL_OES_tessellation_shader = check_OES_tessellation_shader(var1, var878, var2);
      this.GL_OES_texture_3D = check_OES_texture_3D(var1, var878, var2);
      this.GL_OES_texture_border_clamp = check_OES_texture_border_clamp(var1, var878, var2);
      this.GL_OES_texture_buffer = check_OES_texture_buffer(var1, var878, var2);
      this.GL_OES_texture_compression_astc = var2.contains("GL_OES_texture_compression_astc");
      this.GL_OES_texture_cube_map_array = var2.contains("GL_OES_texture_cube_map_array");
      this.GL_OES_texture_float = var2.contains("GL_OES_texture_float");
      this.GL_OES_texture_float_linear = var2.contains("GL_OES_texture_float_linear");
      this.GL_OES_texture_half_float = var2.contains("GL_OES_texture_half_float");
      this.GL_OES_texture_half_float_linear = var2.contains("GL_OES_texture_half_float_linear");
      this.GL_OES_texture_npot = var2.contains("GL_OES_texture_npot");
      this.GL_OES_texture_stencil8 = var2.contains("GL_OES_texture_stencil8");
      this.GL_OES_texture_storage_multisample_2d_array = check_OES_texture_storage_multisample_2d_array(var1, var878, var2);
      this.GL_OES_texture_view = check_OES_texture_view(var1, var878, var2);
      this.GL_OES_vertex_array_object = check_OES_vertex_array_object(var1, var878, var2);
      this.GL_OES_vertex_half_float = var2.contains("GL_OES_vertex_half_float");
      this.GL_OES_vertex_type_10_10_10_2 = var2.contains("GL_OES_vertex_type_10_10_10_2");
      this.GL_OES_viewport_array = check_OES_viewport_array(var1, var878, var2);
      this.GL_OVR_multiview = check_OVR_multiview(var1, var878, var2);
      this.GL_OVR_multiview2 = var2.contains("GL_OVR_multiview2");
      this.GL_OVR_multiview_multisampled_render_to_texture = check_OVR_multiview_multisampled_render_to_texture(var1, var878, var2);
      this.GL_QCOM_alpha_test = check_QCOM_alpha_test(var1, var878, var2);
      this.GL_QCOM_binning_control = var2.contains("GL_QCOM_binning_control");
      this.GL_QCOM_driver_control = check_QCOM_driver_control(var1, var878, var2);
      this.GL_QCOM_extended_get = check_QCOM_extended_get(var1, var878, var2);
      this.GL_QCOM_extended_get2 = check_QCOM_extended_get2(var1, var878, var2);
      this.GL_QCOM_frame_extrapolation = check_QCOM_frame_extrapolation(var1, var878, var2);
      this.GL_QCOM_framebuffer_foveated = check_QCOM_framebuffer_foveated(var1, var878, var2);
      this.GL_QCOM_motion_estimation = check_QCOM_motion_estimation(var1, var878, var2);
      this.GL_QCOM_perfmon_global_mode = var2.contains("GL_QCOM_perfmon_global_mode");
      this.GL_QCOM_render_shared_exponent = var2.contains("GL_QCOM_render_shared_exponent");
      this.GL_QCOM_render_sRGB_R8_RG8 = var2.contains("GL_QCOM_render_sRGB_R8_RG8");
      this.GL_QCOM_shader_framebuffer_fetch_noncoherent = check_QCOM_shader_framebuffer_fetch_noncoherent(var1, var878, var2);
      this.GL_QCOM_shader_framebuffer_fetch_rate = var2.contains("GL_QCOM_shader_framebuffer_fetch_rate");
      this.GL_QCOM_shading_rate = var2.contains("GL_QCOM_shading_rate");
      this.GL_QCOM_texture_foveated = check_QCOM_texture_foveated(var1, var878, var2);
      this.GL_QCOM_texture_foveated2 = var2.contains("GL_QCOM_texture_foveated2");
      this.GL_QCOM_texture_foveated_subsampled_layout = var2.contains("GL_QCOM_texture_foveated_subsampled_layout");
      this.GL_QCOM_texture_lod_bias = var2.contains("GL_QCOM_texture_lod_bias");
      this.GL_QCOM_tiled_rendering = check_QCOM_tiled_rendering(var1, var878, var2);
      this.GL_QCOM_writeonly_rendering = var2.contains("GL_QCOM_writeonly_rendering");
      this.GL_QCOM_ycbcr_degamma = var2.contains("GL_QCOM_ycbcr_degamma");
      this.GL_QCOM_YUV_texture_gather = var2.contains("GL_QCOM_YUV_texture_gather");
      this.GL_VIV_shader_binary = var2.contains("GL_VIV_shader_binary");
      long var4 = var878.get(0);
      this.glActiveTexture = var4;
      var4 = var878.get(1);
      this.glAttachShader = var4;
      var4 = var878.get(2);
      this.glBindAttribLocation = var4;
      var4 = var878.get(3);
      this.glBindBuffer = var4;
      var4 = var878.get(4);
      this.glBindFramebuffer = var4;
      var4 = var878.get(5);
      this.glBindRenderbuffer = var4;
      var4 = var878.get(6);
      this.glBindTexture = var4;
      var4 = var878.get(7);
      this.glBlendColor = var4;
      var4 = var878.get(8);
      this.glBlendEquation = var4;
      var4 = var878.get(9);
      this.glBlendEquationSeparate = var4;
      var4 = var878.get(10);
      this.glBlendFunc = var4;
      var4 = var878.get(11);
      this.glBlendFuncSeparate = var4;
      var4 = var878.get(12);
      this.glBufferData = var4;
      var4 = var878.get(13);
      this.glBufferSubData = var4;
      var4 = var878.get(14);
      this.glCheckFramebufferStatus = var4;
      var4 = var878.get(15);
      this.glClear = var4;
      var4 = var878.get(16);
      this.glClearColor = var4;
      var4 = var878.get(17);
      this.glClearDepthf = var4;
      var4 = var878.get(18);
      this.glClearStencil = var4;
      var4 = var878.get(19);
      this.glColorMask = var4;
      var4 = var878.get(20);
      this.glCompileShader = var4;
      var4 = var878.get(21);
      this.glCompressedTexImage2D = var4;
      var4 = var878.get(22);
      this.glCompressedTexSubImage2D = var4;
      var4 = var878.get(23);
      this.glCopyTexImage2D = var4;
      var4 = var878.get(24);
      this.glCopyTexSubImage2D = var4;
      var4 = var878.get(25);
      this.glCreateProgram = var4;
      var4 = var878.get(26);
      this.glCreateShader = var4;
      var4 = var878.get(27);
      this.glCullFace = var4;
      var4 = var878.get(28);
      this.glDeleteBuffers = var4;
      var4 = var878.get(29);
      this.glDeleteFramebuffers = var4;
      var4 = var878.get(30);
      this.glDeleteProgram = var4;
      var4 = var878.get(31);
      this.glDeleteRenderbuffers = var4;
      var4 = var878.get(32);
      this.glDeleteShader = var4;
      var4 = var878.get(33);
      this.glDeleteTextures = var4;
      var4 = var878.get(34);
      this.glDepthFunc = var4;
      var4 = var878.get(35);
      this.glDepthMask = var4;
      var4 = var878.get(36);
      this.glDepthRangef = var4;
      var4 = var878.get(37);
      this.glDetachShader = var4;
      var4 = var878.get(38);
      this.glDisable = var4;
      var4 = var878.get(39);
      this.glDisableVertexAttribArray = var4;
      var4 = var878.get(40);
      this.glDrawArrays = var4;
      var4 = var878.get(41);
      this.glDrawElements = var4;
      var4 = var878.get(42);
      this.glEnable = var4;
      var4 = var878.get(43);
      this.glEnableVertexAttribArray = var4;
      var4 = var878.get(44);
      this.glFinish = var4;
      var4 = var878.get(45);
      this.glFlush = var4;
      var4 = var878.get(46);
      this.glFramebufferRenderbuffer = var4;
      var4 = var878.get(47);
      this.glFramebufferTexture2D = var4;
      var4 = var878.get(48);
      this.glFrontFace = var4;
      var4 = var878.get(49);
      this.glGenBuffers = var4;
      var4 = var878.get(50);
      this.glGenerateMipmap = var4;
      var4 = var878.get(51);
      this.glGenFramebuffers = var4;
      var4 = var878.get(52);
      this.glGenRenderbuffers = var4;
      var4 = var878.get(53);
      this.glGenTextures = var4;
      var4 = var878.get(54);
      this.glGetActiveAttrib = var4;
      var4 = var878.get(55);
      this.glGetActiveUniform = var4;
      var4 = var878.get(56);
      this.glGetAttachedShaders = var4;
      var4 = var878.get(57);
      this.glGetAttribLocation = var4;
      var4 = var878.get(58);
      this.glGetBooleanv = var4;
      var4 = var878.get(59);
      this.glGetBufferParameteriv = var4;
      var4 = var878.get(60);
      this.glGetError = var4;
      var4 = var878.get(61);
      this.glGetFloatv = var4;
      var4 = var878.get(62);
      this.glGetFramebufferAttachmentParameteriv = var4;
      var4 = var878.get(63);
      this.glGetIntegerv = var4;
      var4 = var878.get(64);
      this.glGetProgramiv = var4;
      var4 = var878.get(65);
      this.glGetProgramInfoLog = var4;
      var4 = var878.get(66);
      this.glGetRenderbufferParameteriv = var4;
      var4 = var878.get(67);
      this.glGetShaderiv = var4;
      var4 = var878.get(68);
      this.glGetShaderInfoLog = var4;
      var4 = var878.get(69);
      this.glGetShaderPrecisionFormat = var4;
      var4 = var878.get(70);
      this.glGetShaderSource = var4;
      var4 = var878.get(71);
      this.glGetString = var4;
      var4 = var878.get(72);
      this.glGetTexParameterfv = var4;
      var4 = var878.get(73);
      this.glGetTexParameteriv = var4;
      var4 = var878.get(74);
      this.glGetUniformfv = var4;
      var4 = var878.get(75);
      this.glGetUniformiv = var4;
      var4 = var878.get(76);
      this.glGetUniformLocation = var4;
      var4 = var878.get(77);
      this.glGetVertexAttribfv = var4;
      var4 = var878.get(78);
      this.glGetVertexAttribiv = var4;
      var4 = var878.get(79);
      this.glGetVertexAttribPointerv = var4;
      var4 = var878.get(80);
      this.glHint = var4;
      var4 = var878.get(81);
      this.glIsBuffer = var4;
      var4 = var878.get(82);
      this.glIsEnabled = var4;
      var4 = var878.get(83);
      this.glIsFramebuffer = var4;
      var4 = var878.get(84);
      this.glIsProgram = var4;
      var4 = var878.get(85);
      this.glIsRenderbuffer = var4;
      var4 = var878.get(86);
      this.glIsShader = var4;
      var4 = var878.get(87);
      this.glIsTexture = var4;
      var4 = var878.get(88);
      this.glLineWidth = var4;
      var4 = var878.get(89);
      this.glLinkProgram = var4;
      var4 = var878.get(90);
      this.glPixelStorei = var4;
      var4 = var878.get(91);
      this.glPolygonOffset = var4;
      var4 = var878.get(92);
      this.glReadPixels = var4;
      var4 = var878.get(93);
      this.glReleaseShaderCompiler = var4;
      var4 = var878.get(94);
      this.glRenderbufferStorage = var4;
      var4 = var878.get(95);
      this.glSampleCoverage = var4;
      var4 = var878.get(96);
      this.glScissor = var4;
      var4 = var878.get(97);
      this.glShaderBinary = var4;
      var4 = var878.get(98);
      this.glShaderSource = var4;
      var4 = var878.get(99);
      this.glStencilFunc = var4;
      var4 = var878.get(100);
      this.glStencilFuncSeparate = var4;
      var4 = var878.get(101);
      this.glStencilMask = var4;
      var4 = var878.get(102);
      this.glStencilMaskSeparate = var4;
      var4 = var878.get(103);
      this.glStencilOp = var4;
      var4 = var878.get(104);
      this.glStencilOpSeparate = var4;
      var4 = var878.get(105);
      this.glTexImage2D = var4;
      var4 = var878.get(106);
      this.glTexParameterf = var4;
      var4 = var878.get(107);
      this.glTexParameterfv = var4;
      var4 = var878.get(108);
      this.glTexParameteri = var4;
      var4 = var878.get(109);
      this.glTexParameteriv = var4;
      var4 = var878.get(110);
      this.glTexSubImage2D = var4;
      var4 = var878.get(111);
      this.glUniform1f = var4;
      var4 = var878.get(112);
      this.glUniform1fv = var4;
      var4 = var878.get(113);
      this.glUniform1i = var4;
      var4 = var878.get(114);
      this.glUniform1iv = var4;
      var4 = var878.get(115);
      this.glUniform2f = var4;
      var4 = var878.get(116);
      this.glUniform2fv = var4;
      var4 = var878.get(117);
      this.glUniform2i = var4;
      var4 = var878.get(118);
      this.glUniform2iv = var4;
      var4 = var878.get(119);
      this.glUniform3f = var4;
      var4 = var878.get(120);
      this.glUniform3fv = var4;
      var4 = var878.get(121);
      this.glUniform3i = var4;
      var4 = var878.get(122);
      this.glUniform3iv = var4;
      var4 = var878.get(123);
      this.glUniform4f = var4;
      var4 = var878.get(124);
      this.glUniform4fv = var4;
      var4 = var878.get(125);
      this.glUniform4i = var4;
      var4 = var878.get(126);
      this.glUniform4iv = var4;
      var4 = var878.get(127);
      this.glUniformMatrix2fv = var4;
      var4 = var878.get(128);
      this.glUniformMatrix3fv = var4;
      var4 = var878.get(129);
      this.glUniformMatrix4fv = var4;
      var4 = var878.get(130);
      this.glUseProgram = var4;
      var4 = var878.get(131);
      this.glValidateProgram = var4;
      var4 = var878.get(132);
      this.glVertexAttrib1f = var4;
      var4 = var878.get(133);
      this.glVertexAttrib1fv = var4;
      var4 = var878.get(134);
      this.glVertexAttrib2f = var4;
      var4 = var878.get(135);
      this.glVertexAttrib2fv = var4;
      var4 = var878.get(136);
      this.glVertexAttrib3f = var4;
      var4 = var878.get(137);
      this.glVertexAttrib3fv = var4;
      var4 = var878.get(138);
      this.glVertexAttrib4f = var4;
      var4 = var878.get(139);
      this.glVertexAttrib4fv = var4;
      var4 = var878.get(140);
      this.glVertexAttribPointer = var4;
      var4 = var878.get(141);
      this.glViewport = var4;
      var4 = var878.get(142);
      this.glReadBuffer = var4;
      var4 = var878.get(143);
      this.glDrawRangeElements = var4;
      var4 = var878.get(144);
      this.glTexImage3D = var4;
      var4 = var878.get(145);
      this.glTexSubImage3D = var4;
      var4 = var878.get(146);
      this.glCopyTexSubImage3D = var4;
      var4 = var878.get(147);
      this.glCompressedTexImage3D = var4;
      var4 = var878.get(148);
      this.glCompressedTexSubImage3D = var4;
      var4 = var878.get(149);
      this.glGenQueries = var4;
      var4 = var878.get(150);
      this.glDeleteQueries = var4;
      var4 = var878.get(151);
      this.glIsQuery = var4;
      var4 = var878.get(152);
      this.glBeginQuery = var4;
      var4 = var878.get(153);
      this.glEndQuery = var4;
      var4 = var878.get(154);
      this.glGetQueryiv = var4;
      var4 = var878.get(155);
      this.glGetQueryObjectuiv = var4;
      var4 = var878.get(156);
      this.glUnmapBuffer = var4;
      var4 = var878.get(157);
      this.glGetBufferPointerv = var4;
      var4 = var878.get(158);
      this.glDrawBuffers = var4;
      var4 = var878.get(159);
      this.glUniformMatrix2x3fv = var4;
      var4 = var878.get(160);
      this.glUniformMatrix3x2fv = var4;
      var4 = var878.get(161);
      this.glUniformMatrix2x4fv = var4;
      var4 = var878.get(162);
      this.glUniformMatrix4x2fv = var4;
      var4 = var878.get(163);
      this.glUniformMatrix3x4fv = var4;
      var4 = var878.get(164);
      this.glUniformMatrix4x3fv = var4;
      var4 = var878.get(165);
      this.glBlitFramebuffer = var4;
      var4 = var878.get(166);
      this.glRenderbufferStorageMultisample = var4;
      var4 = var878.get(167);
      this.glFramebufferTextureLayer = var4;
      var4 = var878.get(168);
      this.glMapBufferRange = var4;
      var4 = var878.get(169);
      this.glFlushMappedBufferRange = var4;
      var4 = var878.get(170);
      this.glBindVertexArray = var4;
      var4 = var878.get(171);
      this.glDeleteVertexArrays = var4;
      var4 = var878.get(172);
      this.glGenVertexArrays = var4;
      var4 = var878.get(173);
      this.glIsVertexArray = var4;
      var4 = var878.get(174);
      this.glGetIntegeri_v = var4;
      var4 = var878.get(175);
      this.glBeginTransformFeedback = var4;
      var4 = var878.get(176);
      this.glEndTransformFeedback = var4;
      var4 = var878.get(177);
      this.glBindBufferRange = var4;
      var4 = var878.get(178);
      this.glBindBufferBase = var4;
      var4 = var878.get(179);
      this.glTransformFeedbackVaryings = var4;
      var4 = var878.get(180);
      this.glGetTransformFeedbackVarying = var4;
      var4 = var878.get(181);
      this.glVertexAttribIPointer = var4;
      var4 = var878.get(182);
      this.glGetVertexAttribIiv = var4;
      var4 = var878.get(183);
      this.glGetVertexAttribIuiv = var4;
      var4 = var878.get(184);
      this.glVertexAttribI4i = var4;
      var4 = var878.get(185);
      this.glVertexAttribI4ui = var4;
      var4 = var878.get(186);
      this.glVertexAttribI4iv = var4;
      var4 = var878.get(187);
      this.glVertexAttribI4uiv = var4;
      var4 = var878.get(188);
      this.glGetUniformuiv = var4;
      var4 = var878.get(189);
      this.glGetFragDataLocation = var4;
      var4 = var878.get(190);
      this.glUniform1ui = var4;
      var4 = var878.get(191);
      this.glUniform2ui = var4;
      var4 = var878.get(192);
      this.glUniform3ui = var4;
      var4 = var878.get(193);
      this.glUniform4ui = var4;
      var4 = var878.get(194);
      this.glUniform1uiv = var4;
      var4 = var878.get(195);
      this.glUniform2uiv = var4;
      var4 = var878.get(196);
      this.glUniform3uiv = var4;
      var4 = var878.get(197);
      this.glUniform4uiv = var4;
      var4 = var878.get(198);
      this.glClearBufferiv = var4;
      var4 = var878.get(199);
      this.glClearBufferuiv = var4;
      var4 = var878.get(200);
      this.glClearBufferfv = var4;
      var4 = var878.get(201);
      this.glClearBufferfi = var4;
      var4 = var878.get(202);
      this.glGetStringi = var4;
      var4 = var878.get(203);
      this.glCopyBufferSubData = var4;
      var4 = var878.get(204);
      this.glGetUniformIndices = var4;
      var4 = var878.get(205);
      this.glGetActiveUniformsiv = var4;
      var4 = var878.get(206);
      this.glGetUniformBlockIndex = var4;
      var4 = var878.get(207);
      this.glGetActiveUniformBlockiv = var4;
      var4 = var878.get(208);
      this.glGetActiveUniformBlockName = var4;
      var4 = var878.get(209);
      this.glUniformBlockBinding = var4;
      var4 = var878.get(210);
      this.glDrawArraysInstanced = var4;
      var4 = var878.get(211);
      this.glDrawElementsInstanced = var4;
      var4 = var878.get(212);
      this.glFenceSync = var4;
      var4 = var878.get(213);
      this.glIsSync = var4;
      var4 = var878.get(214);
      this.glDeleteSync = var4;
      var4 = var878.get(215);
      this.glClientWaitSync = var4;
      var4 = var878.get(216);
      this.glWaitSync = var4;
      var4 = var878.get(217);
      this.glGetInteger64v = var4;
      var4 = var878.get(218);
      this.glGetSynciv = var4;
      var4 = var878.get(219);
      this.glGetInteger64i_v = var4;
      var4 = var878.get(220);
      this.glGetBufferParameteri64v = var4;
      var4 = var878.get(221);
      this.glGenSamplers = var4;
      var4 = var878.get(222);
      this.glDeleteSamplers = var4;
      var4 = var878.get(223);
      this.glIsSampler = var4;
      var4 = var878.get(224);
      this.glBindSampler = var4;
      var4 = var878.get(225);
      this.glSamplerParameteri = var4;
      var4 = var878.get(226);
      this.glSamplerParameteriv = var4;
      var4 = var878.get(227);
      this.glSamplerParameterf = var4;
      var4 = var878.get(228);
      this.glSamplerParameterfv = var4;
      var4 = var878.get(229);
      this.glGetSamplerParameteriv = var4;
      var4 = var878.get(230);
      this.glGetSamplerParameterfv = var4;
      var4 = var878.get(231);
      this.glVertexAttribDivisor = var4;
      var4 = var878.get(232);
      this.glBindTransformFeedback = var4;
      var4 = var878.get(233);
      this.glDeleteTransformFeedbacks = var4;
      var4 = var878.get(234);
      this.glGenTransformFeedbacks = var4;
      var4 = var878.get(235);
      this.glIsTransformFeedback = var4;
      var4 = var878.get(236);
      this.glPauseTransformFeedback = var4;
      var4 = var878.get(237);
      this.glResumeTransformFeedback = var4;
      var4 = var878.get(238);
      this.glGetProgramBinary = var4;
      var4 = var878.get(239);
      this.glProgramBinary = var4;
      var4 = var878.get(240);
      this.glProgramParameteri = var4;
      var4 = var878.get(241);
      this.glInvalidateFramebuffer = var4;
      var4 = var878.get(242);
      this.glInvalidateSubFramebuffer = var4;
      var4 = var878.get(243);
      this.glTexStorage2D = var4;
      var4 = var878.get(244);
      this.glTexStorage3D = var4;
      var4 = var878.get(245);
      this.glGetInternalformativ = var4;
      var4 = var878.get(246);
      this.glDispatchCompute = var4;
      var4 = var878.get(247);
      this.glDispatchComputeIndirect = var4;
      var4 = var878.get(248);
      this.glDrawArraysIndirect = var4;
      var4 = var878.get(249);
      this.glDrawElementsIndirect = var4;
      var4 = var878.get(250);
      this.glFramebufferParameteri = var4;
      var4 = var878.get(251);
      this.glGetFramebufferParameteriv = var4;
      var4 = var878.get(252);
      this.glGetProgramInterfaceiv = var4;
      var4 = var878.get(253);
      this.glGetProgramResourceIndex = var4;
      var4 = var878.get(254);
      this.glGetProgramResourceName = var4;
      var4 = var878.get(255);
      this.glGetProgramResourceiv = var4;
      var4 = var878.get(256);
      this.glGetProgramResourceLocation = var4;
      var4 = var878.get(257);
      this.glUseProgramStages = var4;
      var4 = var878.get(258);
      this.glActiveShaderProgram = var4;
      var4 = var878.get(259);
      this.glCreateShaderProgramv = var4;
      var4 = var878.get(260);
      this.glBindProgramPipeline = var4;
      var4 = var878.get(261);
      this.glDeleteProgramPipelines = var4;
      var4 = var878.get(262);
      this.glGenProgramPipelines = var4;
      var4 = var878.get(263);
      this.glIsProgramPipeline = var4;
      var4 = var878.get(264);
      this.glGetProgramPipelineiv = var4;
      var4 = var878.get(265);
      this.glProgramUniform1i = var4;
      var4 = var878.get(266);
      this.glProgramUniform2i = var4;
      var4 = var878.get(267);
      this.glProgramUniform3i = var4;
      var4 = var878.get(268);
      this.glProgramUniform4i = var4;
      var4 = var878.get(269);
      this.glProgramUniform1ui = var4;
      var4 = var878.get(270);
      this.glProgramUniform2ui = var4;
      var4 = var878.get(271);
      this.glProgramUniform3ui = var4;
      var4 = var878.get(272);
      this.glProgramUniform4ui = var4;
      var4 = var878.get(273);
      this.glProgramUniform1f = var4;
      var4 = var878.get(274);
      this.glProgramUniform2f = var4;
      var4 = var878.get(275);
      this.glProgramUniform3f = var4;
      var4 = var878.get(276);
      this.glProgramUniform4f = var4;
      var4 = var878.get(277);
      this.glProgramUniform1iv = var4;
      var4 = var878.get(278);
      this.glProgramUniform2iv = var4;
      var4 = var878.get(279);
      this.glProgramUniform3iv = var4;
      var4 = var878.get(280);
      this.glProgramUniform4iv = var4;
      var4 = var878.get(281);
      this.glProgramUniform1uiv = var4;
      var4 = var878.get(282);
      this.glProgramUniform2uiv = var4;
      var4 = var878.get(283);
      this.glProgramUniform3uiv = var4;
      var4 = var878.get(284);
      this.glProgramUniform4uiv = var4;
      var4 = var878.get(285);
      this.glProgramUniform1fv = var4;
      var4 = var878.get(286);
      this.glProgramUniform2fv = var4;
      var4 = var878.get(287);
      this.glProgramUniform3fv = var4;
      var4 = var878.get(288);
      this.glProgramUniform4fv = var4;
      var4 = var878.get(289);
      this.glProgramUniformMatrix2fv = var4;
      var4 = var878.get(290);
      this.glProgramUniformMatrix3fv = var4;
      var4 = var878.get(291);
      this.glProgramUniformMatrix4fv = var4;
      var4 = var878.get(292);
      this.glProgramUniformMatrix2x3fv = var4;
      var4 = var878.get(293);
      this.glProgramUniformMatrix3x2fv = var4;
      var4 = var878.get(294);
      this.glProgramUniformMatrix2x4fv = var4;
      var4 = var878.get(295);
      this.glProgramUniformMatrix4x2fv = var4;
      var4 = var878.get(296);
      this.glProgramUniformMatrix3x4fv = var4;
      var4 = var878.get(297);
      this.glProgramUniformMatrix4x3fv = var4;
      var4 = var878.get(298);
      this.glValidateProgramPipeline = var4;
      var4 = var878.get(299);
      this.glGetProgramPipelineInfoLog = var4;
      var4 = var878.get(300);
      this.glBindImageTexture = var4;
      var4 = var878.get(301);
      this.glGetBooleani_v = var4;
      var4 = var878.get(302);
      this.glMemoryBarrier = var4;
      var4 = var878.get(303);
      this.glMemoryBarrierByRegion = var4;
      var4 = var878.get(304);
      this.glTexStorage2DMultisample = var4;
      var4 = var878.get(305);
      this.glGetMultisamplefv = var4;
      var4 = var878.get(306);
      this.glSampleMaski = var4;
      var4 = var878.get(307);
      this.glGetTexLevelParameteriv = var4;
      var4 = var878.get(308);
      this.glGetTexLevelParameterfv = var4;
      var4 = var878.get(309);
      this.glBindVertexBuffer = var4;
      var4 = var878.get(310);
      this.glVertexAttribFormat = var4;
      var4 = var878.get(311);
      this.glVertexAttribIFormat = var4;
      var4 = var878.get(312);
      this.glVertexAttribBinding = var4;
      var4 = var878.get(313);
      this.glVertexBindingDivisor = var4;
      var4 = var878.get(314);
      this.glBlendBarrier = var4;
      var4 = var878.get(315);
      this.glCopyImageSubData = var4;
      var4 = var878.get(316);
      this.glDebugMessageControl = var4;
      var4 = var878.get(317);
      this.glDebugMessageInsert = var4;
      var4 = var878.get(318);
      this.glDebugMessageCallback = var4;
      var4 = var878.get(319);
      this.glGetDebugMessageLog = var4;
      var4 = var878.get(320);
      this.glGetPointerv = var4;
      var4 = var878.get(321);
      this.glPushDebugGroup = var4;
      var4 = var878.get(322);
      this.glPopDebugGroup = var4;
      var4 = var878.get(323);
      this.glObjectLabel = var4;
      var4 = var878.get(324);
      this.glGetObjectLabel = var4;
      var4 = var878.get(325);
      this.glObjectPtrLabel = var4;
      var4 = var878.get(326);
      this.glGetObjectPtrLabel = var4;
      var4 = var878.get(327);
      this.glEnablei = var4;
      var4 = var878.get(328);
      this.glDisablei = var4;
      var4 = var878.get(329);
      this.glBlendEquationi = var4;
      var4 = var878.get(330);
      this.glBlendEquationSeparatei = var4;
      var4 = var878.get(331);
      this.glBlendFunci = var4;
      var4 = var878.get(332);
      this.glBlendFuncSeparatei = var4;
      var4 = var878.get(333);
      this.glColorMaski = var4;
      var4 = var878.get(334);
      this.glIsEnabledi = var4;
      var4 = var878.get(335);
      this.glDrawElementsBaseVertex = var4;
      var4 = var878.get(336);
      this.glDrawRangeElementsBaseVertex = var4;
      var4 = var878.get(337);
      this.glDrawElementsInstancedBaseVertex = var4;
      var4 = var878.get(338);
      this.glFramebufferTexture = var4;
      var4 = var878.get(339);
      this.glPrimitiveBoundingBox = var4;
      var4 = var878.get(340);
      this.glGetGraphicsResetStatus = var4;
      var4 = var878.get(341);
      this.glReadnPixels = var4;
      var4 = var878.get(342);
      this.glGetnUniformfv = var4;
      var4 = var878.get(343);
      this.glGetnUniformiv = var4;
      var4 = var878.get(344);
      this.glGetnUniformuiv = var4;
      var4 = var878.get(345);
      this.glMinSampleShading = var4;
      var4 = var878.get(346);
      this.glPatchParameteri = var4;
      var4 = var878.get(347);
      this.glTexParameterIiv = var4;
      var4 = var878.get(348);
      this.glTexParameterIuiv = var4;
      var4 = var878.get(349);
      this.glGetTexParameterIiv = var4;
      var4 = var878.get(350);
      this.glGetTexParameterIuiv = var4;
      var4 = var878.get(351);
      this.glSamplerParameterIiv = var4;
      var4 = var878.get(352);
      this.glSamplerParameterIuiv = var4;
      var4 = var878.get(353);
      this.glGetSamplerParameterIiv = var4;
      var4 = var878.get(354);
      this.glGetSamplerParameterIuiv = var4;
      var4 = var878.get(355);
      this.glTexBuffer = var4;
      var4 = var878.get(356);
      this.glTexBufferRange = var4;
      var4 = var878.get(357);
      this.glTexStorage3DMultisample = var4;
      var4 = var878.get(358);
      this.glRenderbufferStorageMultisampleAdvancedAMD = var4;
      var4 = var878.get(359);
      this.glNamedRenderbufferStorageMultisampleAdvancedAMD = var4;
      var4 = var878.get(360);
      this.glGetPerfMonitorGroupsAMD = var4;
      var4 = var878.get(361);
      this.glGetPerfMonitorCountersAMD = var4;
      var4 = var878.get(362);
      this.glGetPerfMonitorGroupStringAMD = var4;
      var4 = var878.get(363);
      this.glGetPerfMonitorCounterStringAMD = var4;
      var4 = var878.get(364);
      this.glGetPerfMonitorCounterInfoAMD = var4;
      var4 = var878.get(365);
      this.glGenPerfMonitorsAMD = var4;
      var4 = var878.get(366);
      this.glDeletePerfMonitorsAMD = var4;
      var4 = var878.get(367);
      this.glSelectPerfMonitorCountersAMD = var4;
      var4 = var878.get(368);
      this.glBeginPerfMonitorAMD = var4;
      var4 = var878.get(369);
      this.glEndPerfMonitorAMD = var4;
      var4 = var878.get(370);
      this.glGetPerfMonitorCounterDataAMD = var4;
      var4 = var878.get(371);
      this.glBlitFramebufferANGLE = var4;
      var4 = var878.get(372);
      this.glRenderbufferStorageMultisampleANGLE = var4;
      var4 = var878.get(373);
      this.glDrawArraysInstancedANGLE = var4;
      var4 = var878.get(374);
      this.glDrawElementsInstancedANGLE = var4;
      var4 = var878.get(375);
      this.glVertexAttribDivisorANGLE = var4;
      var4 = var878.get(376);
      this.glGetTranslatedShaderSourceANGLE = var4;
      var4 = var878.get(377);
      this.glCopyTextureLevelsAPPLE = var4;
      var4 = var878.get(378);
      this.glRenderbufferStorageMultisampleAPPLE = var4;
      var4 = var878.get(379);
      this.glResolveMultisampleFramebufferAPPLE = var4;
      var4 = var878.get(380);
      this.glFenceSyncAPPLE = var4;
      var4 = var878.get(381);
      this.glIsSyncAPPLE = var4;
      var4 = var878.get(382);
      this.glDeleteSyncAPPLE = var4;
      var4 = var878.get(383);
      this.glClientWaitSyncAPPLE = var4;
      var4 = var878.get(384);
      this.glWaitSyncAPPLE = var4;
      var4 = var878.get(385);
      this.glGetInteger64vAPPLE = var4;
      var4 = var878.get(386);
      this.glGetSyncivAPPLE = var4;
      var4 = var878.get(387);
      this.glMaxActiveShaderCoresARM = var4;
      var4 = var878.get(388);
      this.glDrawArraysInstancedBaseInstanceEXT = var4;
      var4 = var878.get(389);
      this.glDrawElementsInstancedBaseInstanceEXT = var4;
      var4 = var878.get(390);
      this.glDrawElementsInstancedBaseVertexBaseInstanceEXT = var4;
      var4 = var878.get(391);
      this.glBindFragDataLocationIndexedEXT = var4;
      var4 = var878.get(392);
      this.glGetFragDataIndexEXT = var4;
      var4 = var878.get(393);
      this.glBindFragDataLocationEXT = var4;
      var4 = var878.get(394);
      this.glGetProgramResourceLocationIndexEXT = var4;
      var4 = var878.get(395);
      this.glBufferStorageEXT = var4;
      var4 = var878.get(396);
      this.glNamedBufferStorageEXT = var4;
      var4 = var878.get(397);
      this.glClearTexImageEXT = var4;
      var4 = var878.get(398);
      this.glClearTexSubImageEXT = var4;
      var4 = var878.get(399);
      this.glClipControlEXT = var4;
      var4 = var878.get(400);
      this.glCopyImageSubDataEXT = var4;
      var4 = var878.get(401);
      this.glLabelObjectEXT = var4;
      var4 = var878.get(402);
      this.glGetObjectLabelEXT = var4;
      var4 = var878.get(403);
      this.glInsertEventMarkerEXT = var4;
      var4 = var878.get(404);
      this.glPushGroupMarkerEXT = var4;
      var4 = var878.get(405);
      this.glPopGroupMarkerEXT = var4;
      var4 = var878.get(406);
      this.glDiscardFramebufferEXT = var4;
      var4 = var878.get(407);
      this.glGenQueriesEXT = var4;
      var4 = var878.get(408);
      this.glDeleteQueriesEXT = var4;
      var4 = var878.get(409);
      this.glIsQueryEXT = var4;
      var4 = var878.get(410);
      this.glBeginQueryEXT = var4;
      var4 = var878.get(411);
      this.glEndQueryEXT = var4;
      var4 = var878.get(412);
      this.glGetQueryivEXT = var4;
      var4 = var878.get(413);
      this.glGetQueryObjectuivEXT = var4;
      var4 = var878.get(414);
      this.glQueryCounterEXT = var4;
      var4 = var878.get(415);
      this.glGetQueryObjectivEXT = var4;
      var4 = var878.get(416);
      this.glGetQueryObjecti64vEXT = var4;
      var4 = var878.get(417);
      this.glGetQueryObjectui64vEXT = var4;
      var4 = var878.get(418);
      this.glGetInteger64vEXT = var4;
      var4 = var878.get(419);
      this.glDrawBuffersEXT = var4;
      var4 = var878.get(420);
      this.glEnableiEXT = var4;
      var4 = var878.get(421);
      this.glDisableiEXT = var4;
      var4 = var878.get(422);
      this.glBlendEquationiEXT = var4;
      var4 = var878.get(423);
      this.glBlendEquationSeparateiEXT = var4;
      var4 = var878.get(424);
      this.glBlendFunciEXT = var4;
      var4 = var878.get(425);
      this.glBlendFuncSeparateiEXT = var4;
      var4 = var878.get(426);
      this.glColorMaskiEXT = var4;
      var4 = var878.get(427);
      this.glIsEnablediEXT = var4;
      var4 = var878.get(428);
      this.glDrawElementsBaseVertexEXT = var4;
      var4 = var878.get(429);
      this.glDrawRangeElementsBaseVertexEXT = var4;
      var4 = var878.get(430);
      this.glDrawElementsInstancedBaseVertexEXT = var4;
      var4 = var878.get(431);
      this.glMultiDrawElementsBaseVertexEXT = var4;
      var4 = var878.get(432);
      this.glDrawArraysInstancedEXT = var4;
      var4 = var878.get(433);
      this.glDrawElementsInstancedEXT = var4;
      var4 = var878.get(434);
      this.glDrawTransformFeedbackEXT = var4;
      var4 = var878.get(435);
      this.glDrawTransformFeedbackInstancedEXT = var4;
      var4 = var878.get(436);
      this.glEGLImageTargetTexStorageEXT = var4;
      var4 = var878.get(437);
      this.glEGLImageTargetTextureStorageEXT = var4;
      var4 = var878.get(438);
      this.glBufferStorageExternalEXT = var4;
      var4 = var878.get(439);
      this.glNamedBufferStorageExternalEXT = var4;
      var4 = var878.get(440);
      this.glShadingRateEXT = var4;
      var4 = var878.get(441);
      this.glShadingRateCombinerOpsEXT = var4;
      var4 = var878.get(442);
      this.glFramebufferShadingRateEXT = var4;
      var4 = var878.get(443);
      this.glGetFragmentShadingRatesEXT = var4;
      var4 = var878.get(444);
      this.glBlitFramebufferLayersEXT = var4;
      var4 = var878.get(445);
      this.glBlitFramebufferLayerEXT = var4;
      var4 = var878.get(446);
      this.glFramebufferTextureEXT = var4;
      var4 = var878.get(447);
      this.glVertexAttribDivisorEXT = var4;
      var4 = var878.get(448);
      this.glMapBufferRangeEXT = var4;
      var4 = var878.get(449);
      this.glFlushMappedBufferRangeEXT = var4;
      var4 = var878.get(450);
      this.glGetUnsignedBytevEXT = var4;
      var4 = var878.get(451);
      this.glGetUnsignedBytei_vEXT = var4;
      var4 = var878.get(452);
      this.glDeleteMemoryObjectsEXT = var4;
      var4 = var878.get(453);
      this.glIsMemoryObjectEXT = var4;
      var4 = var878.get(454);
      this.glCreateMemoryObjectsEXT = var4;
      var4 = var878.get(455);
      this.glMemoryObjectParameterivEXT = var4;
      var4 = var878.get(456);
      this.glGetMemoryObjectParameterivEXT = var4;
      var4 = var878.get(457);
      this.glTexStorageMem2DEXT = var4;
      var4 = var878.get(458);
      this.glTexStorageMem2DMultisampleEXT = var4;
      var4 = var878.get(459);
      this.glTexStorageMem3DEXT = var4;
      var4 = var878.get(460);
      this.glTexStorageMem3DMultisampleEXT = var4;
      var4 = var878.get(461);
      this.glBufferStorageMemEXT = var4;
      var4 = var878.get(462);
      this.glTextureStorageMem2DEXT = var4;
      var4 = var878.get(463);
      this.glTextureStorageMem2DMultisampleEXT = var4;
      var4 = var878.get(464);
      this.glTextureStorageMem3DEXT = var4;
      var4 = var878.get(465);
      this.glTextureStorageMem3DMultisampleEXT = var4;
      var4 = var878.get(466);
      this.glNamedBufferStorageMemEXT = var4;
      var4 = var878.get(467);
      this.glImportMemoryFdEXT = var4;
      var4 = var878.get(468);
      this.glImportMemoryWin32HandleEXT = var4;
      var4 = var878.get(469);
      this.glImportMemoryWin32NameEXT = var4;
      var4 = var878.get(470);
      this.glMultiDrawArraysEXT = var4;
      var4 = var878.get(471);
      this.glMultiDrawElementsEXT = var4;
      var4 = var878.get(472);
      this.glMultiDrawArraysIndirectEXT = var4;
      var4 = var878.get(473);
      this.glMultiDrawElementsIndirectEXT = var4;
      var4 = var878.get(474);
      this.glRenderbufferStorageMultisampleEXT = var4;
      var4 = var878.get(475);
      this.glFramebufferTexture2DMultisampleEXT = var4;
      var4 = var878.get(476);
      this.glReadBufferIndexedEXT = var4;
      var4 = var878.get(477);
      this.glDrawBuffersIndexedEXT = var4;
      var4 = var878.get(478);
      this.glGetIntegeri_vEXT = var4;
      var4 = var878.get(479);
      this.glPolygonOffsetClampEXT = var4;
      var4 = var878.get(480);
      this.glPrimitiveBoundingBoxEXT = var4;
      var4 = var878.get(481);
      this.glRasterSamplesEXT = var4;
      var4 = var878.get(482);
      this.glGetGraphicsResetStatusEXT = var4;
      var4 = var878.get(483);
      this.glReadnPixelsEXT = var4;
      var4 = var878.get(484);
      this.glGetnUniformfvEXT = var4;
      var4 = var878.get(485);
      this.glGetnUniformivEXT = var4;
      var4 = var878.get(486);
      this.glGenSemaphoresEXT = var4;
      var4 = var878.get(487);
      this.glDeleteSemaphoresEXT = var4;
      var4 = var878.get(488);
      this.glIsSemaphoreEXT = var4;
      var4 = var878.get(489);
      this.glSemaphoreParameterui64vEXT = var4;
      var4 = var878.get(490);
      this.glGetSemaphoreParameterui64vEXT = var4;
      var4 = var878.get(491);
      this.glWaitSemaphoreEXT = var4;
      var4 = var878.get(492);
      this.glSignalSemaphoreEXT = var4;
      var4 = var878.get(493);
      this.glImportSemaphoreFdEXT = var4;
      var4 = var878.get(494);
      this.glImportSemaphoreWin32HandleEXT = var4;
      var4 = var878.get(495);
      this.glImportSemaphoreWin32NameEXT = var4;
      var4 = var878.get(496);
      this.glActiveShaderProgramEXT = var4;
      var4 = var878.get(497);
      this.glBindProgramPipelineEXT = var4;
      var4 = var878.get(498);
      this.glCreateShaderProgramvEXT = var4;
      var4 = var878.get(499);
      this.glDeleteProgramPipelinesEXT = var4;
      var4 = var878.get(500);
      this.glGenProgramPipelinesEXT = var4;
      var4 = var878.get(501);
      this.glGetProgramPipelineInfoLogEXT = var4;
      var4 = var878.get(502);
      this.glGetProgramPipelineivEXT = var4;
      var4 = var878.get(503);
      this.glIsProgramPipelineEXT = var4;
      var4 = var878.get(504);
      this.glProgramParameteriEXT = var4;
      var4 = var878.get(505);
      this.glProgramUniform1fEXT = var4;
      var4 = var878.get(506);
      this.glProgramUniform1fvEXT = var4;
      var4 = var878.get(507);
      this.glProgramUniform1iEXT = var4;
      var4 = var878.get(508);
      this.glProgramUniform1ivEXT = var4;
      var4 = var878.get(509);
      this.glProgramUniform2fEXT = var4;
      var4 = var878.get(510);
      this.glProgramUniform2fvEXT = var4;
      var4 = var878.get(511);
      this.glProgramUniform2iEXT = var4;
      var4 = var878.get(512);
      this.glProgramUniform2ivEXT = var4;
      var4 = var878.get(513);
      this.glProgramUniform3fEXT = var4;
      var4 = var878.get(514);
      this.glProgramUniform3fvEXT = var4;
      var4 = var878.get(515);
      this.glProgramUniform3iEXT = var4;
      var4 = var878.get(516);
      this.glProgramUniform3ivEXT = var4;
      var4 = var878.get(517);
      this.glProgramUniform4fEXT = var4;
      var4 = var878.get(518);
      this.glProgramUniform4fvEXT = var4;
      var4 = var878.get(519);
      this.glProgramUniform4iEXT = var4;
      var4 = var878.get(520);
      this.glProgramUniform4ivEXT = var4;
      var4 = var878.get(521);
      this.glProgramUniformMatrix2fvEXT = var4;
      var4 = var878.get(522);
      this.glProgramUniformMatrix3fvEXT = var4;
      var4 = var878.get(523);
      this.glProgramUniformMatrix4fvEXT = var4;
      var4 = var878.get(524);
      this.glUseProgramStagesEXT = var4;
      var4 = var878.get(525);
      this.glValidateProgramPipelineEXT = var4;
      var4 = var878.get(526);
      this.glProgramUniform1uiEXT = var4;
      var4 = var878.get(527);
      this.glProgramUniform2uiEXT = var4;
      var4 = var878.get(528);
      this.glProgramUniform3uiEXT = var4;
      var4 = var878.get(529);
      this.glProgramUniform4uiEXT = var4;
      var4 = var878.get(530);
      this.glProgramUniform1uivEXT = var4;
      var4 = var878.get(531);
      this.glProgramUniform2uivEXT = var4;
      var4 = var878.get(532);
      this.glProgramUniform3uivEXT = var4;
      var4 = var878.get(533);
      this.glProgramUniform4uivEXT = var4;
      var4 = var878.get(534);
      this.glProgramUniformMatrix2x3fvEXT = var4;
      var4 = var878.get(535);
      this.glProgramUniformMatrix3x2fvEXT = var4;
      var4 = var878.get(536);
      this.glProgramUniformMatrix2x4fvEXT = var4;
      var4 = var878.get(537);
      this.glProgramUniformMatrix4x2fvEXT = var4;
      var4 = var878.get(538);
      this.glProgramUniformMatrix3x4fvEXT = var4;
      var4 = var878.get(539);
      this.glProgramUniformMatrix4x3fvEXT = var4;
      var4 = var878.get(540);
      this.glFramebufferFetchBarrierEXT = var4;
      var4 = var878.get(541);
      this.glFramebufferPixelLocalStorageSizeEXT = var4;
      var4 = var878.get(542);
      this.glGetFramebufferPixelLocalStorageSizeEXT = var4;
      var4 = var878.get(543);
      this.glClearPixelLocalStorageuiEXT = var4;
      var4 = var878.get(544);
      this.glTexPageCommitmentARB = var4;
      var4 = var878.get(545);
      this.glPatchParameteriEXT = var4;
      var4 = var878.get(546);
      this.glTexParameterIivEXT = var4;
      var4 = var878.get(547);
      this.glTexParameterIuivEXT = var4;
      var4 = var878.get(548);
      this.glGetTexParameterIivEXT = var4;
      var4 = var878.get(549);
      this.glGetTexParameterIuivEXT = var4;
      var4 = var878.get(550);
      this.glSamplerParameterIivEXT = var4;
      var4 = var878.get(551);
      this.glSamplerParameterIuivEXT = var4;
      var4 = var878.get(552);
      this.glGetSamplerParameterIivEXT = var4;
      var4 = var878.get(553);
      this.glGetSamplerParameterIuivEXT = var4;
      var4 = var878.get(554);
      this.glTexBufferEXT = var4;
      var4 = var878.get(555);
      this.glTexBufferRangeEXT = var4;
      var4 = var878.get(556);
      this.glTexStorage1DEXT = var4;
      var4 = var878.get(557);
      this.glTexStorage2DEXT = var4;
      var4 = var878.get(558);
      this.glTexStorage3DEXT = var4;
      var4 = var878.get(559);
      this.glTextureStorage1DEXT = var4;
      var4 = var878.get(560);
      this.glTextureStorage2DEXT = var4;
      var4 = var878.get(561);
      this.glTextureStorage3DEXT = var4;
      var4 = var878.get(562);
      this.glTexStorageAttribs2DEXT = var4;
      var4 = var878.get(563);
      this.glTexStorageAttribs3DEXT = var4;
      var4 = var878.get(564);
      this.glTextureViewEXT = var4;
      var4 = var878.get(565);
      this.glAcquireKeyedMutexWin32EXT = var4;
      var4 = var878.get(566);
      this.glReleaseKeyedMutexWin32EXT = var4;
      var4 = var878.get(567);
      this.glWindowRectanglesEXT = var4;
      var4 = var878.get(568);
      this.glFramebufferTexture2DDownsampleIMG = var4;
      var4 = var878.get(569);
      this.glFramebufferTextureLayerDownsampleIMG = var4;
      var4 = var878.get(570);
      this.glRenderbufferStorageMultisampleIMG = var4;
      var4 = var878.get(571);
      this.glFramebufferTexture2DMultisampleIMG = var4;
      var4 = var878.get(572);
      this.glApplyFramebufferAttachmentCMAAINTEL = var4;
      var4 = var878.get(573);
      this.glBeginPerfQueryINTEL = var4;
      var4 = var878.get(574);
      this.glCreatePerfQueryINTEL = var4;
      var4 = var878.get(575);
      this.glDeletePerfQueryINTEL = var4;
      var4 = var878.get(576);
      this.glEndPerfQueryINTEL = var4;
      var4 = var878.get(577);
      this.glGetFirstPerfQueryIdINTEL = var4;
      var4 = var878.get(578);
      this.glGetNextPerfQueryIdINTEL = var4;
      var4 = var878.get(579);
      this.glGetPerfCounterInfoINTEL = var4;
      var4 = var878.get(580);
      this.glGetPerfQueryDataINTEL = var4;
      var4 = var878.get(581);
      this.glGetPerfQueryIdByNameINTEL = var4;
      var4 = var878.get(582);
      this.glGetPerfQueryInfoINTEL = var4;
      var4 = var878.get(583);
      this.glBlendBarrierKHR = var4;
      var4 = var878.get(584);
      this.glDebugMessageControlKHR = var4;
      var4 = var878.get(585);
      this.glDebugMessageInsertKHR = var4;
      var4 = var878.get(586);
      this.glDebugMessageCallbackKHR = var4;
      var4 = var878.get(587);
      this.glGetDebugMessageLogKHR = var4;
      var4 = var878.get(588);
      this.glGetPointervKHR = var4;
      var4 = var878.get(589);
      this.glPushDebugGroupKHR = var4;
      var4 = var878.get(590);
      this.glPopDebugGroupKHR = var4;
      var4 = var878.get(591);
      this.glObjectLabelKHR = var4;
      var4 = var878.get(592);
      this.glGetObjectLabelKHR = var4;
      var4 = var878.get(593);
      this.glObjectPtrLabelKHR = var4;
      var4 = var878.get(594);
      this.glGetObjectPtrLabelKHR = var4;
      var4 = var878.get(595);
      this.glMaxShaderCompilerThreadsKHR = var4;
      var4 = var878.get(596);
      this.glGetGraphicsResetStatusKHR = var4;
      var4 = var878.get(597);
      this.glReadnPixelsKHR = var4;
      var4 = var878.get(598);
      this.glGetnUniformfvKHR = var4;
      var4 = var878.get(599);
      this.glGetnUniformivKHR = var4;
      var4 = var878.get(600);
      this.glGetnUniformuivKHR = var4;
      var4 = var878.get(601);
      this.glFramebufferParameteriMESA = var4;
      var4 = var878.get(602);
      this.glGetFramebufferParameterivMESA = var4;
      var4 = var878.get(603);
      this.glAlphaToCoverageDitherControlNV = var4;
      var4 = var878.get(604);
      this.glGetTextureHandleNV = var4;
      var4 = var878.get(605);
      this.glGetTextureSamplerHandleNV = var4;
      var4 = var878.get(606);
      this.glMakeTextureHandleResidentNV = var4;
      var4 = var878.get(607);
      this.glMakeTextureHandleNonResidentNV = var4;
      var4 = var878.get(608);
      this.glGetImageHandleNV = var4;
      var4 = var878.get(609);
      this.glMakeImageHandleResidentNV = var4;
      var4 = var878.get(610);
      this.glMakeImageHandleNonResidentNV = var4;
      var4 = var878.get(611);
      this.glUniformHandleui64NV = var4;
      var4 = var878.get(612);
      this.glUniformHandleui64vNV = var4;
      var4 = var878.get(613);
      this.glProgramUniformHandleui64NV = var4;
      var4 = var878.get(614);
      this.glProgramUniformHandleui64vNV = var4;
      var4 = var878.get(615);
      this.glIsTextureHandleResidentNV = var4;
      var4 = var878.get(616);
      this.glIsImageHandleResidentNV = var4;
      var4 = var878.get(617);
      this.glBlendParameteriNV = var4;
      var4 = var878.get(618);
      this.glBlendBarrierNV = var4;
      var4 = var878.get(619);
      this.glViewportPositionWScaleNV = var4;
      var4 = var878.get(620);
      this.glBeginConditionalRenderNV = var4;
      var4 = var878.get(621);
      this.glEndConditionalRenderNV = var4;
      var4 = var878.get(622);
      this.glSubpixelPrecisionBiasNV = var4;
      var4 = var878.get(623);
      this.glConservativeRasterParameteriNV = var4;
      var4 = var878.get(624);
      this.glCopyBufferSubDataNV = var4;
      var4 = var878.get(625);
      this.glCoverageMaskNV = var4;
      var4 = var878.get(626);
      this.glCoverageOperationNV = var4;
      var4 = var878.get(627);
      this.glDrawBuffersNV = var4;
      var4 = var878.get(628);
      this.glDrawArraysInstancedNV = var4;
      var4 = var878.get(629);
      this.glDrawElementsInstancedNV = var4;
      var4 = var878.get(630);
      this.glDrawVkImageNV = var4;
      var4 = var878.get(631);
      this.glGetVkProcAddrNV = var4;
      var4 = var878.get(632);
      this.glWaitVkSemaphoreNV = var4;
      var4 = var878.get(633);
      this.glSignalVkSemaphoreNV = var4;
      var4 = var878.get(634);
      this.glSignalVkFenceNV = var4;
      var4 = var878.get(635);
      this.glDeleteFencesNV = var4;
      var4 = var878.get(636);
      this.glGenFencesNV = var4;
      var4 = var878.get(637);
      this.glIsFenceNV = var4;
      var4 = var878.get(638);
      this.glTestFenceNV = var4;
      var4 = var878.get(639);
      this.glGetFenceivNV = var4;
      var4 = var878.get(640);
      this.glFinishFenceNV = var4;
      var4 = var878.get(641);
      this.glSetFenceNV = var4;
      var4 = var878.get(642);
      this.glFragmentCoverageColorNV = var4;
      var4 = var878.get(643);
      this.glBlitFramebufferNV = var4;
      var4 = var878.get(644);
      this.glCoverageModulationTableNV = var4;
      var4 = var878.get(645);
      this.glGetCoverageModulationTableNV = var4;
      var4 = var878.get(646);
      this.glCoverageModulationNV = var4;
      var4 = var878.get(647);
      this.glRenderbufferStorageMultisampleNV = var4;
      var4 = var878.get(648);
      this.glUniform1i64NV = var4;
      var4 = var878.get(649);
      this.glUniform2i64NV = var4;
      var4 = var878.get(650);
      this.glUniform3i64NV = var4;
      var4 = var878.get(651);
      this.glUniform4i64NV = var4;
      var4 = var878.get(652);
      this.glUniform1i64vNV = var4;
      var4 = var878.get(653);
      this.glUniform2i64vNV = var4;
      var4 = var878.get(654);
      this.glUniform3i64vNV = var4;
      var4 = var878.get(655);
      this.glUniform4i64vNV = var4;
      var4 = var878.get(656);
      this.glUniform1ui64NV = var4;
      var4 = var878.get(657);
      this.glUniform2ui64NV = var4;
      var4 = var878.get(658);
      this.glUniform3ui64NV = var4;
      var4 = var878.get(659);
      this.glUniform4ui64NV = var4;
      var4 = var878.get(660);
      this.glUniform1ui64vNV = var4;
      var4 = var878.get(661);
      this.glUniform2ui64vNV = var4;
      var4 = var878.get(662);
      this.glUniform3ui64vNV = var4;
      var4 = var878.get(663);
      this.glUniform4ui64vNV = var4;
      var4 = var878.get(664);
      this.glGetUniformi64vNV = var4;
      var4 = var878.get(665);
      this.glGetUniformui64vNV = var4;
      var4 = var878.get(666);
      this.glProgramUniform1i64NV = var4;
      var4 = var878.get(667);
      this.glProgramUniform2i64NV = var4;
      var4 = var878.get(668);
      this.glProgramUniform3i64NV = var4;
      var4 = var878.get(669);
      this.glProgramUniform4i64NV = var4;
      var4 = var878.get(670);
      this.glProgramUniform1i64vNV = var4;
      var4 = var878.get(671);
      this.glProgramUniform2i64vNV = var4;
      var4 = var878.get(672);
      this.glProgramUniform3i64vNV = var4;
      var4 = var878.get(673);
      this.glProgramUniform4i64vNV = var4;
      var4 = var878.get(674);
      this.glProgramUniform1ui64NV = var4;
      var4 = var878.get(675);
      this.glProgramUniform2ui64NV = var4;
      var4 = var878.get(676);
      this.glProgramUniform3ui64NV = var4;
      var4 = var878.get(677);
      this.glProgramUniform4ui64NV = var4;
      var4 = var878.get(678);
      this.glProgramUniform1ui64vNV = var4;
      var4 = var878.get(679);
      this.glProgramUniform2ui64vNV = var4;
      var4 = var878.get(680);
      this.glProgramUniform3ui64vNV = var4;
      var4 = var878.get(681);
      this.glProgramUniform4ui64vNV = var4;
      var4 = var878.get(682);
      this.glVertexAttribDivisorNV = var4;
      var4 = var878.get(683);
      this.glGetInternalformatSampleivNV = var4;
      var4 = var878.get(684);
      this.glGetMemoryObjectDetachedResourcesuivNV = var4;
      var4 = var878.get(685);
      this.glResetMemoryObjectParameterNV = var4;
      var4 = var878.get(686);
      this.glTexAttachMemoryNV = var4;
      var4 = var878.get(687);
      this.glBufferAttachMemoryNV = var4;
      var4 = var878.get(688);
      this.glTextureAttachMemoryNV = var4;
      var4 = var878.get(689);
      this.glNamedBufferAttachMemoryNV = var4;
      var4 = var878.get(690);
      this.glBufferPageCommitmentMemNV = var4;
      var4 = var878.get(691);
      this.glNamedBufferPageCommitmentMemNV = var4;
      var4 = var878.get(692);
      this.glTexPageCommitmentMemNV = var4;
      var4 = var878.get(693);
      this.glTexturePageCommitmentMemNV = var4;
      var4 = var878.get(694);
      this.glDrawMeshTasksNV = var4;
      var4 = var878.get(695);
      this.glDrawMeshTasksIndirectNV = var4;
      var4 = var878.get(696);
      this.glMultiDrawMeshTasksIndirectNV = var4;
      var4 = var878.get(697);
      this.glUniformMatrix2x3fvNV = var4;
      var4 = var878.get(698);
      this.glUniformMatrix3x2fvNV = var4;
      var4 = var878.get(699);
      this.glUniformMatrix2x4fvNV = var4;
      var4 = var878.get(700);
      this.glUniformMatrix4x2fvNV = var4;
      var4 = var878.get(701);
      this.glUniformMatrix3x4fvNV = var4;
      var4 = var878.get(702);
      this.glUniformMatrix4x3fvNV = var4;
      var4 = var878.get(703);
      this.glPathCommandsNV = var4;
      var4 = var878.get(704);
      this.glPathCoordsNV = var4;
      var4 = var878.get(705);
      this.glPathSubCommandsNV = var4;
      var4 = var878.get(706);
      this.glPathSubCoordsNV = var4;
      var4 = var878.get(707);
      this.glPathStringNV = var4;
      var4 = var878.get(708);
      this.glPathGlyphsNV = var4;
      var4 = var878.get(709);
      this.glPathGlyphRangeNV = var4;
      var4 = var878.get(710);
      this.glPathGlyphIndexArrayNV = var4;
      var4 = var878.get(711);
      this.glPathMemoryGlyphIndexArrayNV = var4;
      var4 = var878.get(712);
      this.glCopyPathNV = var4;
      var4 = var878.get(713);
      this.glWeightPathsNV = var4;
      var4 = var878.get(714);
      this.glInterpolatePathsNV = var4;
      var4 = var878.get(715);
      this.glTransformPathNV = var4;
      var4 = var878.get(716);
      this.glPathParameterivNV = var4;
      var4 = var878.get(717);
      this.glPathParameteriNV = var4;
      var4 = var878.get(718);
      this.glPathParameterfvNV = var4;
      var4 = var878.get(719);
      this.glPathParameterfNV = var4;
      var4 = var878.get(720);
      this.glPathDashArrayNV = var4;
      var4 = var878.get(721);
      this.glGenPathsNV = var4;
      var4 = var878.get(722);
      this.glDeletePathsNV = var4;
      var4 = var878.get(723);
      this.glIsPathNV = var4;
      var4 = var878.get(724);
      this.glPathStencilFuncNV = var4;
      var4 = var878.get(725);
      this.glPathStencilDepthOffsetNV = var4;
      var4 = var878.get(726);
      this.glStencilFillPathNV = var4;
      var4 = var878.get(727);
      this.glStencilStrokePathNV = var4;
      var4 = var878.get(728);
      this.glStencilFillPathInstancedNV = var4;
      var4 = var878.get(729);
      this.glStencilStrokePathInstancedNV = var4;
      var4 = var878.get(730);
      this.glPathCoverDepthFuncNV = var4;
      var4 = var878.get(731);
      this.glCoverFillPathNV = var4;
      var4 = var878.get(732);
      this.glCoverStrokePathNV = var4;
      var4 = var878.get(733);
      this.glCoverFillPathInstancedNV = var4;
      var4 = var878.get(734);
      this.glCoverStrokePathInstancedNV = var4;
      var4 = var878.get(735);
      this.glStencilThenCoverFillPathNV = var4;
      var4 = var878.get(736);
      this.glStencilThenCoverStrokePathNV = var4;
      var4 = var878.get(737);
      this.glStencilThenCoverFillPathInstancedNV = var4;
      var4 = var878.get(738);
      this.glStencilThenCoverStrokePathInstancedNV = var4;
      var4 = var878.get(739);
      this.glPathGlyphIndexRangeNV = var4;
      var4 = var878.get(740);
      this.glProgramPathFragmentInputGenNV = var4;
      var4 = var878.get(741);
      this.glGetPathParameterivNV = var4;
      var4 = var878.get(742);
      this.glGetPathParameterfvNV = var4;
      var4 = var878.get(743);
      this.glGetPathCommandsNV = var4;
      var4 = var878.get(744);
      this.glGetPathCoordsNV = var4;
      var4 = var878.get(745);
      this.glGetPathDashArrayNV = var4;
      var4 = var878.get(746);
      this.glGetPathMetricsNV = var4;
      var4 = var878.get(747);
      this.glGetPathMetricRangeNV = var4;
      var4 = var878.get(748);
      this.glGetPathSpacingNV = var4;
      var4 = var878.get(749);
      this.glIsPointInFillPathNV = var4;
      var4 = var878.get(750);
      this.glIsPointInStrokePathNV = var4;
      var4 = var878.get(751);
      this.glGetPathLengthNV = var4;
      var4 = var878.get(752);
      this.glPointAlongPathNV = var4;
      var4 = var878.get(753);
      this.glMatrixLoad3x2fNV = var4;
      var4 = var878.get(754);
      this.glMatrixLoad3x3fNV = var4;
      var4 = var878.get(755);
      this.glMatrixLoadTranspose3x3fNV = var4;
      var4 = var878.get(756);
      this.glMatrixMult3x2fNV = var4;
      var4 = var878.get(757);
      this.glMatrixMult3x3fNV = var4;
      var4 = var878.get(758);
      this.glMatrixMultTranspose3x3fNV = var4;
      var4 = var878.get(759);
      this.glGetProgramResourcefvNV = var4;
      var4 = var878.get(760);
      this.glPolygonModeNV = var4;
      var4 = var878.get(761);
      this.glReadBufferNV = var4;
      var4 = var878.get(762);
      this.glFramebufferSampleLocationsfvNV = var4;
      var4 = var878.get(763);
      this.glNamedFramebufferSampleLocationsfvNV = var4;
      var4 = var878.get(764);
      this.glResolveDepthValuesNV = var4;
      var4 = var878.get(765);
      this.glScissorExclusiveArrayvNV = var4;
      var4 = var878.get(766);
      this.glScissorExclusiveNV = var4;
      var4 = var878.get(767);
      this.glTexImage3DNV = var4;
      var4 = var878.get(768);
      this.glTexSubImage3DNV = var4;
      var4 = var878.get(769);
      this.glCopyTexSubImage3DNV = var4;
      var4 = var878.get(770);
      this.glCompressedTexImage3DNV = var4;
      var4 = var878.get(771);
      this.glCompressedTexSubImage3DNV = var4;
      var4 = var878.get(772);
      this.glFramebufferTextureLayerNV = var4;
      var4 = var878.get(773);
      this.glTextureBarrierNV = var4;
      var4 = var878.get(774);
      this.glCreateSemaphoresNV = var4;
      var4 = var878.get(775);
      this.glSemaphoreParameterivNV = var4;
      var4 = var878.get(776);
      this.glGetSemaphoreParameterivNV = var4;
      var4 = var878.get(777);
      this.glViewportArrayvNV = var4;
      var4 = var878.get(778);
      this.glViewportIndexedfNV = var4;
      var4 = var878.get(779);
      this.glViewportIndexedfvNV = var4;
      var4 = var878.get(780);
      this.glScissorArrayvNV = var4;
      var4 = var878.get(781);
      this.glScissorIndexedNV = var4;
      var4 = var878.get(782);
      this.glScissorIndexedvNV = var4;
      var4 = var878.get(783);
      this.glDepthRangeArrayfvNV = var4;
      var4 = var878.get(784);
      this.glDepthRangeIndexedfNV = var4;
      var4 = var878.get(785);
      this.glGetFloati_vNV = var4;
      var4 = var878.get(786);
      this.glEnableiNV = var4;
      var4 = var878.get(787);
      this.glDisableiNV = var4;
      var4 = var878.get(788);
      this.glIsEnablediNV = var4;
      var4 = var878.get(789);
      this.glViewportSwizzleNV = var4;
      var4 = var878.get(790);
      this.glCopyImageSubDataOES = var4;
      var4 = var878.get(791);
      this.glEnableiOES = var4;
      var4 = var878.get(792);
      this.glDisableiOES = var4;
      var4 = var878.get(793);
      this.glBlendEquationiOES = var4;
      var4 = var878.get(794);
      this.glBlendEquationSeparateiOES = var4;
      var4 = var878.get(795);
      this.glBlendFunciOES = var4;
      var4 = var878.get(796);
      this.glBlendFuncSeparateiOES = var4;
      var4 = var878.get(797);
      this.glColorMaskiOES = var4;
      var4 = var878.get(798);
      this.glIsEnablediOES = var4;
      var4 = var878.get(799);
      this.glDrawElementsBaseVertexOES = var4;
      var4 = var878.get(800);
      this.glDrawRangeElementsBaseVertexOES = var4;
      var4 = var878.get(801);
      this.glDrawElementsInstancedBaseVertexOES = var4;
      var4 = var878.get(802);
      this.glMultiDrawElementsBaseVertexOES = var4;
      var4 = var878.get(803);
      this.glEGLImageTargetTexture2DOES = var4;
      var4 = var878.get(804);
      this.glEGLImageTargetRenderbufferStorageOES = var4;
      var4 = var878.get(805);
      this.glFramebufferTextureOES = var4;
      var4 = var878.get(806);
      this.glGetProgramBinaryOES = var4;
      var4 = var878.get(807);
      this.glProgramBinaryOES = var4;
      var4 = var878.get(808);
      this.glMapBufferOES = var4;
      var4 = var878.get(809);
      this.glUnmapBufferOES = var4;
      var4 = var878.get(810);
      this.glGetBufferPointervOES = var4;
      var4 = var878.get(811);
      this.glPrimitiveBoundingBoxOES = var4;
      var4 = var878.get(812);
      this.glMinSampleShadingOES = var4;
      var4 = var878.get(813);
      this.glPatchParameteriOES = var4;
      var4 = var878.get(814);
      this.glTexImage3DOES = var4;
      var4 = var878.get(815);
      this.glTexSubImage3DOES = var4;
      var4 = var878.get(816);
      this.glCopyTexSubImage3DOES = var4;
      var4 = var878.get(817);
      this.glCompressedTexImage3DOES = var4;
      var4 = var878.get(818);
      this.glCompressedTexSubImage3DOES = var4;
      var4 = var878.get(819);
      this.glFramebufferTexture3DOES = var4;
      var4 = var878.get(820);
      this.glTexParameterIivOES = var4;
      var4 = var878.get(821);
      this.glTexParameterIuivOES = var4;
      var4 = var878.get(822);
      this.glGetTexParameterIivOES = var4;
      var4 = var878.get(823);
      this.glGetTexParameterIuivOES = var4;
      var4 = var878.get(824);
      this.glSamplerParameterIivOES = var4;
      var4 = var878.get(825);
      this.glSamplerParameterIuivOES = var4;
      var4 = var878.get(826);
      this.glGetSamplerParameterIivOES = var4;
      var4 = var878.get(827);
      this.glGetSamplerParameterIuivOES = var4;
      var4 = var878.get(828);
      this.glTexBufferOES = var4;
      var4 = var878.get(829);
      this.glTexBufferRangeOES = var4;
      var4 = var878.get(830);
      this.glTexStorage3DMultisampleOES = var4;
      var4 = var878.get(831);
      this.glTextureViewOES = var4;
      var4 = var878.get(832);
      this.glBindVertexArrayOES = var4;
      var4 = var878.get(833);
      this.glDeleteVertexArraysOES = var4;
      var4 = var878.get(834);
      this.glGenVertexArraysOES = var4;
      var4 = var878.get(835);
      this.glIsVertexArrayOES = var4;
      var4 = var878.get(836);
      this.glViewportArrayvOES = var4;
      var4 = var878.get(837);
      this.glViewportIndexedfOES = var4;
      var4 = var878.get(838);
      this.glViewportIndexedfvOES = var4;
      var4 = var878.get(839);
      this.glScissorArrayvOES = var4;
      var4 = var878.get(840);
      this.glScissorIndexedOES = var4;
      var4 = var878.get(841);
      this.glScissorIndexedvOES = var4;
      var4 = var878.get(842);
      this.glDepthRangeArrayfvOES = var4;
      var4 = var878.get(843);
      this.glDepthRangeIndexedfOES = var4;
      var4 = var878.get(844);
      this.glGetFloati_vOES = var4;
      var4 = var878.get(845);
      this.glFramebufferTextureMultiviewOVR = var4;
      var4 = var878.get(846);
      this.glNamedFramebufferTextureMultiviewOVR = var4;
      var4 = var878.get(847);
      this.glFramebufferTextureMultisampleMultiviewOVR = var4;
      var4 = var878.get(848);
      this.glAlphaFuncQCOM = var4;
      var4 = var878.get(849);
      this.glGetDriverControlsQCOM = var4;
      var4 = var878.get(850);
      this.glGetDriverControlStringQCOM = var4;
      var4 = var878.get(851);
      this.glEnableDriverControlQCOM = var4;
      var4 = var878.get(852);
      this.glDisableDriverControlQCOM = var4;
      var4 = var878.get(853);
      this.glExtGetTexturesQCOM = var4;
      var4 = var878.get(854);
      this.glExtGetBuffersQCOM = var4;
      var4 = var878.get(855);
      this.glExtGetRenderbuffersQCOM = var4;
      var4 = var878.get(856);
      this.glExtGetFramebuffersQCOM = var4;
      var4 = var878.get(857);
      this.glExtGetTexLevelParameterivQCOM = var4;
      var4 = var878.get(858);
      this.glExtTexObjectStateOverrideiQCOM = var4;
      var4 = var878.get(859);
      this.glExtGetTexSubImageQCOM = var4;
      var4 = var878.get(860);
      this.glExtGetBufferPointervQCOM = var4;
      var4 = var878.get(861);
      this.glExtGetShadersQCOM = var4;
      var4 = var878.get(862);
      this.glExtGetProgramsQCOM = var4;
      var4 = var878.get(863);
      this.glExtIsProgramBinaryQCOM = var4;
      var4 = var878.get(864);
      this.glExtGetProgramBinarySourceQCOM = var4;
      var4 = var878.get(865);
      this.glExtrapolateTex2DQCOM = var4;
      var4 = var878.get(866);
      this.glFramebufferFoveationConfigQCOM = var4;
      var4 = var878.get(867);
      this.glFramebufferFoveationParametersQCOM = var4;
      var4 = var878.get(868);
      this.glTexEstimateMotionQCOM = var4;
      var4 = var878.get(869);
      this.glTexEstimateMotionRegionsQCOM = var4;
      var4 = var878.get(870);
      this.glFramebufferFetchBarrierQCOM = var4;
      var4 = var878.get(871);
      this.glTextureFoveationParametersQCOM = var4;
      var4 = var878.get(872);
      this.glStartTilingQCOM = var4;
      var4 = var878.get(873);
      this.glEndTilingQCOM = var4;
      this.addresses = ThreadLocalUtil.setupAddressBuffer(var878);
   }

   private static boolean check_GLES20(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GLES20")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[142])[0] = 0;
         var3[1] = 1;
         var3[2] = 2;
         var3[3] = 3;
         var3[4] = 4;
         var3[5] = 5;
         var3[6] = 6;
         var3[7] = 7;
         var3[8] = 8;
         var3[9] = 9;
         var3[10] = 10;
         var3[11] = 11;
         var3[12] = 12;
         var3[13] = 13;
         var3[14] = 14;
         var3[15] = 15;
         var3[16] = 16;
         var3[17] = 17;
         var3[18] = 18;
         var3[19] = 19;
         var3[20] = 20;
         var3[21] = 21;
         var3[22] = 22;
         var3[23] = 23;
         var3[24] = 24;
         var3[25] = 25;
         var3[26] = 26;
         var3[27] = 27;
         var3[28] = 28;
         var3[29] = 29;
         var3[30] = 30;
         var3[31] = 31;
         var3[32] = 32;
         var3[33] = 33;
         var3[34] = 34;
         var3[35] = 35;
         var3[36] = 36;
         var3[37] = 37;
         var3[38] = 38;
         var3[39] = 39;
         var3[40] = 40;
         var3[41] = 41;
         var3[42] = 42;
         var3[43] = 43;
         var3[44] = 44;
         var3[45] = 45;
         var3[46] = 46;
         var3[47] = 47;
         var3[48] = 48;
         var3[49] = 49;
         var3[50] = 50;
         var3[51] = 51;
         var3[52] = 52;
         var3[53] = 53;
         var3[54] = 54;
         var3[55] = 55;
         var3[56] = 56;
         var3[57] = 57;
         var3[58] = 58;
         var3[59] = 59;
         var3[60] = 60;
         var3[61] = 61;
         var3[62] = 62;
         var3[63] = 63;
         var3[64] = 64;
         var3[65] = 65;
         var3[66] = 66;
         var3[67] = 67;
         var3[68] = 68;
         var3[69] = 69;
         var3[70] = 70;
         var3[71] = 71;
         var3[72] = 72;
         var3[73] = 73;
         var3[74] = 74;
         var3[75] = 75;
         var3[76] = 76;
         var3[77] = 77;
         var3[78] = 78;
         var3[79] = 79;
         var3[80] = 80;
         var3[81] = 81;
         var3[82] = 82;
         var3[83] = 83;
         var3[84] = 84;
         var3[85] = 85;
         var3[86] = 86;
         var3[87] = 87;
         var3[88] = 88;
         var3[89] = 89;
         var3[90] = 90;
         var3[91] = 91;
         var3[92] = 92;
         var3[93] = 93;
         var3[94] = 94;
         var3[95] = 95;
         var3[96] = 96;
         var3[97] = 97;
         var3[98] = 98;
         var3[99] = 99;
         var3[100] = 100;
         var3[101] = 101;
         var3[102] = 102;
         var3[103] = 103;
         var3[104] = 104;
         var3[105] = 105;
         var3[106] = 106;
         var3[107] = 107;
         var3[108] = 108;
         var3[109] = 109;
         var3[110] = 110;
         var3[111] = 111;
         var3[112] = 112;
         var3[113] = 113;
         var3[114] = 114;
         var3[115] = 115;
         var3[116] = 116;
         var3[117] = 117;
         var3[118] = 118;
         var3[119] = 119;
         var3[120] = 120;
         var3[121] = 121;
         var3[122] = 122;
         var3[123] = 123;
         var3[124] = 124;
         var3[125] = 125;
         var3[126] = 126;
         var3[127] = 127;
         var3[128] = 128;
         var3[129] = 129;
         var3[130] = 130;
         var3[131] = 131;
         var3[132] = 132;
         var3[133] = 133;
         var3[134] = 134;
         var3[135] = 135;
         var3[136] = 136;
         var3[137] = 137;
         var3[138] = 138;
         var3[139] = 139;
         var3[140] = 140;
         var3[141] = 141;
         String[] var4;
         (var4 = new String[142])[0] = "glActiveTexture";
         var4[1] = "glAttachShader";
         var4[2] = "glBindAttribLocation";
         var4[3] = "glBindBuffer";
         var4[4] = "glBindFramebuffer";
         var4[5] = "glBindRenderbuffer";
         var4[6] = "glBindTexture";
         var4[7] = "glBlendColor";
         var4[8] = "glBlendEquation";
         var4[9] = "glBlendEquationSeparate";
         var4[10] = "glBlendFunc";
         var4[11] = "glBlendFuncSeparate";
         var4[12] = "glBufferData";
         var4[13] = "glBufferSubData";
         var4[14] = "glCheckFramebufferStatus";
         var4[15] = "glClear";
         var4[16] = "glClearColor";
         var4[17] = "glClearDepthf";
         var4[18] = "glClearStencil";
         var4[19] = "glColorMask";
         var4[20] = "glCompileShader";
         var4[21] = "glCompressedTexImage2D";
         var4[22] = "glCompressedTexSubImage2D";
         var4[23] = "glCopyTexImage2D";
         var4[24] = "glCopyTexSubImage2D";
         var4[25] = "glCreateProgram";
         var4[26] = "glCreateShader";
         var4[27] = "glCullFace";
         var4[28] = "glDeleteBuffers";
         var4[29] = "glDeleteFramebuffers";
         var4[30] = "glDeleteProgram";
         var4[31] = "glDeleteRenderbuffers";
         var4[32] = "glDeleteShader";
         var4[33] = "glDeleteTextures";
         var4[34] = "glDepthFunc";
         var4[35] = "glDepthMask";
         var4[36] = "glDepthRangef";
         var4[37] = "glDetachShader";
         var4[38] = "glDisable";
         var4[39] = "glDisableVertexAttribArray";
         var4[40] = "glDrawArrays";
         var4[41] = "glDrawElements";
         var4[42] = "glEnable";
         var4[43] = "glEnableVertexAttribArray";
         var4[44] = "glFinish";
         var4[45] = "glFlush";
         var4[46] = "glFramebufferRenderbuffer";
         var4[47] = "glFramebufferTexture2D";
         var4[48] = "glFrontFace";
         var4[49] = "glGenBuffers";
         var4[50] = "glGenerateMipmap";
         var4[51] = "glGenFramebuffers";
         var4[52] = "glGenRenderbuffers";
         var4[53] = "glGenTextures";
         var4[54] = "glGetActiveAttrib";
         var4[55] = "glGetActiveUniform";
         var4[56] = "glGetAttachedShaders";
         var4[57] = "glGetAttribLocation";
         var4[58] = "glGetBooleanv";
         var4[59] = "glGetBufferParameteriv";
         var4[60] = "glGetError";
         var4[61] = "glGetFloatv";
         var4[62] = "glGetFramebufferAttachmentParameteriv";
         var4[63] = "glGetIntegerv";
         var4[64] = "glGetProgramiv";
         var4[65] = "glGetProgramInfoLog";
         var4[66] = "glGetRenderbufferParameteriv";
         var4[67] = "glGetShaderiv";
         var4[68] = "glGetShaderInfoLog";
         var4[69] = "glGetShaderPrecisionFormat";
         var4[70] = "glGetShaderSource";
         var4[71] = "glGetString";
         var4[72] = "glGetTexParameterfv";
         var4[73] = "glGetTexParameteriv";
         var4[74] = "glGetUniformfv";
         var4[75] = "glGetUniformiv";
         var4[76] = "glGetUniformLocation";
         var4[77] = "glGetVertexAttribfv";
         var4[78] = "glGetVertexAttribiv";
         var4[79] = "glGetVertexAttribPointerv";
         var4[80] = "glHint";
         var4[81] = "glIsBuffer";
         var4[82] = "glIsEnabled";
         var4[83] = "glIsFramebuffer";
         var4[84] = "glIsProgram";
         var4[85] = "glIsRenderbuffer";
         var4[86] = "glIsShader";
         var4[87] = "glIsTexture";
         var4[88] = "glLineWidth";
         var4[89] = "glLinkProgram";
         var4[90] = "glPixelStorei";
         var4[91] = "glPolygonOffset";
         var4[92] = "glReadPixels";
         var4[93] = "glReleaseShaderCompiler";
         var4[94] = "glRenderbufferStorage";
         var4[95] = "glSampleCoverage";
         var4[96] = "glScissor";
         var4[97] = "glShaderBinary";
         var4[98] = "glShaderSource";
         var4[99] = "glStencilFunc";
         var4[100] = "glStencilFuncSeparate";
         var4[101] = "glStencilMask";
         var4[102] = "glStencilMaskSeparate";
         var4[103] = "glStencilOp";
         var4[104] = "glStencilOpSeparate";
         var4[105] = "glTexImage2D";
         var4[106] = "glTexParameterf";
         var4[107] = "glTexParameterfv";
         var4[108] = "glTexParameteri";
         var4[109] = "glTexParameteriv";
         var4[110] = "glTexSubImage2D";
         var4[111] = "glUniform1f";
         var4[112] = "glUniform1fv";
         var4[113] = "glUniform1i";
         var4[114] = "glUniform1iv";
         var4[115] = "glUniform2f";
         var4[116] = "glUniform2fv";
         var4[117] = "glUniform2i";
         var4[118] = "glUniform2iv";
         var4[119] = "glUniform3f";
         var4[120] = "glUniform3fv";
         var4[121] = "glUniform3i";
         var4[122] = "glUniform3iv";
         var4[123] = "glUniform4f";
         var4[124] = "glUniform4fv";
         var4[125] = "glUniform4i";
         var4[126] = "glUniform4iv";
         var4[127] = "glUniformMatrix2fv";
         var4[128] = "glUniformMatrix3fv";
         var4[129] = "glUniformMatrix4fv";
         var4[130] = "glUseProgram";
         var4[131] = "glValidateProgram";
         var4[132] = "glVertexAttrib1f";
         var4[133] = "glVertexAttrib1fv";
         var4[134] = "glVertexAttrib2f";
         var4[135] = "glVertexAttrib2fv";
         var4[136] = "glVertexAttrib3f";
         var4[137] = "glVertexAttrib3fv";
         var4[138] = "glVertexAttrib4f";
         var4[139] = "glVertexAttrib4fv";
         var4[140] = "glVertexAttribPointer";
         var4[141] = "glViewport";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GLES20");
      }
   }

   private static boolean check_GLES30(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GLES30")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[104])[0] = 142;
         var3[1] = 143;
         var3[2] = 144;
         var3[3] = 145;
         var3[4] = 146;
         var3[5] = 147;
         var3[6] = 148;
         var3[7] = 149;
         var3[8] = 150;
         var3[9] = 151;
         var3[10] = 152;
         var3[11] = 153;
         var3[12] = 154;
         var3[13] = 155;
         var3[14] = 156;
         var3[15] = 157;
         var3[16] = 158;
         var3[17] = 159;
         var3[18] = 160;
         var3[19] = 161;
         var3[20] = 162;
         var3[21] = 163;
         var3[22] = 164;
         var3[23] = 165;
         var3[24] = 166;
         var3[25] = 167;
         var3[26] = 168;
         var3[27] = 169;
         var3[28] = 170;
         var3[29] = 171;
         var3[30] = 172;
         var3[31] = 173;
         var3[32] = 174;
         var3[33] = 175;
         var3[34] = 176;
         var3[35] = 177;
         var3[36] = 178;
         var3[37] = 179;
         var3[38] = 180;
         var3[39] = 181;
         var3[40] = 182;
         var3[41] = 183;
         var3[42] = 184;
         var3[43] = 185;
         var3[44] = 186;
         var3[45] = 187;
         var3[46] = 188;
         var3[47] = 189;
         var3[48] = 190;
         var3[49] = 191;
         var3[50] = 192;
         var3[51] = 193;
         var3[52] = 194;
         var3[53] = 195;
         var3[54] = 196;
         var3[55] = 197;
         var3[56] = 198;
         var3[57] = 199;
         var3[58] = 200;
         var3[59] = 201;
         var3[60] = 202;
         var3[61] = 203;
         var3[62] = 204;
         var3[63] = 205;
         var3[64] = 206;
         var3[65] = 207;
         var3[66] = 208;
         var3[67] = 209;
         var3[68] = 210;
         var3[69] = 211;
         var3[70] = 212;
         var3[71] = 213;
         var3[72] = 214;
         var3[73] = 215;
         var3[74] = 216;
         var3[75] = 217;
         var3[76] = 218;
         var3[77] = 219;
         var3[78] = 220;
         var3[79] = 221;
         var3[80] = 222;
         var3[81] = 223;
         var3[82] = 224;
         var3[83] = 225;
         var3[84] = 226;
         var3[85] = 227;
         var3[86] = 228;
         var3[87] = 229;
         var3[88] = 230;
         var3[89] = 231;
         var3[90] = 232;
         var3[91] = 233;
         var3[92] = 234;
         var3[93] = 235;
         var3[94] = 236;
         var3[95] = 237;
         var3[96] = 238;
         var3[97] = 239;
         var3[98] = 240;
         var3[99] = 241;
         var3[100] = 242;
         var3[101] = 243;
         var3[102] = 244;
         var3[103] = 245;
         String[] var4;
         (var4 = new String[104])[0] = "glReadBuffer";
         var4[1] = "glDrawRangeElements";
         var4[2] = "glTexImage3D";
         var4[3] = "glTexSubImage3D";
         var4[4] = "glCopyTexSubImage3D";
         var4[5] = "glCompressedTexImage3D";
         var4[6] = "glCompressedTexSubImage3D";
         var4[7] = "glGenQueries";
         var4[8] = "glDeleteQueries";
         var4[9] = "glIsQuery";
         var4[10] = "glBeginQuery";
         var4[11] = "glEndQuery";
         var4[12] = "glGetQueryiv";
         var4[13] = "glGetQueryObjectuiv";
         var4[14] = "glUnmapBuffer";
         var4[15] = "glGetBufferPointerv";
         var4[16] = "glDrawBuffers";
         var4[17] = "glUniformMatrix2x3fv";
         var4[18] = "glUniformMatrix3x2fv";
         var4[19] = "glUniformMatrix2x4fv";
         var4[20] = "glUniformMatrix4x2fv";
         var4[21] = "glUniformMatrix3x4fv";
         var4[22] = "glUniformMatrix4x3fv";
         var4[23] = "glBlitFramebuffer";
         var4[24] = "glRenderbufferStorageMultisample";
         var4[25] = "glFramebufferTextureLayer";
         var4[26] = "glMapBufferRange";
         var4[27] = "glFlushMappedBufferRange";
         var4[28] = "glBindVertexArray";
         var4[29] = "glDeleteVertexArrays";
         var4[30] = "glGenVertexArrays";
         var4[31] = "glIsVertexArray";
         var4[32] = "glGetIntegeri_v";
         var4[33] = "glBeginTransformFeedback";
         var4[34] = "glEndTransformFeedback";
         var4[35] = "glBindBufferRange";
         var4[36] = "glBindBufferBase";
         var4[37] = "glTransformFeedbackVaryings";
         var4[38] = "glGetTransformFeedbackVarying";
         var4[39] = "glVertexAttribIPointer";
         var4[40] = "glGetVertexAttribIiv";
         var4[41] = "glGetVertexAttribIuiv";
         var4[42] = "glVertexAttribI4i";
         var4[43] = "glVertexAttribI4ui";
         var4[44] = "glVertexAttribI4iv";
         var4[45] = "glVertexAttribI4uiv";
         var4[46] = "glGetUniformuiv";
         var4[47] = "glGetFragDataLocation";
         var4[48] = "glUniform1ui";
         var4[49] = "glUniform2ui";
         var4[50] = "glUniform3ui";
         var4[51] = "glUniform4ui";
         var4[52] = "glUniform1uiv";
         var4[53] = "glUniform2uiv";
         var4[54] = "glUniform3uiv";
         var4[55] = "glUniform4uiv";
         var4[56] = "glClearBufferiv";
         var4[57] = "glClearBufferuiv";
         var4[58] = "glClearBufferfv";
         var4[59] = "glClearBufferfi";
         var4[60] = "glGetStringi";
         var4[61] = "glCopyBufferSubData";
         var4[62] = "glGetUniformIndices";
         var4[63] = "glGetActiveUniformsiv";
         var4[64] = "glGetUniformBlockIndex";
         var4[65] = "glGetActiveUniformBlockiv";
         var4[66] = "glGetActiveUniformBlockName";
         var4[67] = "glUniformBlockBinding";
         var4[68] = "glDrawArraysInstanced";
         var4[69] = "glDrawElementsInstanced";
         var4[70] = "glFenceSync";
         var4[71] = "glIsSync";
         var4[72] = "glDeleteSync";
         var4[73] = "glClientWaitSync";
         var4[74] = "glWaitSync";
         var4[75] = "glGetInteger64v";
         var4[76] = "glGetSynciv";
         var4[77] = "glGetInteger64i_v";
         var4[78] = "glGetBufferParameteri64v";
         var4[79] = "glGenSamplers";
         var4[80] = "glDeleteSamplers";
         var4[81] = "glIsSampler";
         var4[82] = "glBindSampler";
         var4[83] = "glSamplerParameteri";
         var4[84] = "glSamplerParameteriv";
         var4[85] = "glSamplerParameterf";
         var4[86] = "glSamplerParameterfv";
         var4[87] = "glGetSamplerParameteriv";
         var4[88] = "glGetSamplerParameterfv";
         var4[89] = "glVertexAttribDivisor";
         var4[90] = "glBindTransformFeedback";
         var4[91] = "glDeleteTransformFeedbacks";
         var4[92] = "glGenTransformFeedbacks";
         var4[93] = "glIsTransformFeedback";
         var4[94] = "glPauseTransformFeedback";
         var4[95] = "glResumeTransformFeedback";
         var4[96] = "glGetProgramBinary";
         var4[97] = "glProgramBinary";
         var4[98] = "glProgramParameteri";
         var4[99] = "glInvalidateFramebuffer";
         var4[100] = "glInvalidateSubFramebuffer";
         var4[101] = "glTexStorage2D";
         var4[102] = "glTexStorage3D";
         var4[103] = "glGetInternalformativ";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GLES30");
      }
   }

   private static boolean check_GLES31(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GLES31")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[68])[0] = 246;
         var3[1] = 247;
         var3[2] = 248;
         var3[3] = 249;
         var3[4] = 250;
         var3[5] = 251;
         var3[6] = 252;
         var3[7] = 253;
         var3[8] = 254;
         var3[9] = 255;
         var3[10] = 256;
         var3[11] = 257;
         var3[12] = 258;
         var3[13] = 259;
         var3[14] = 260;
         var3[15] = 261;
         var3[16] = 262;
         var3[17] = 263;
         var3[18] = 264;
         var3[19] = 265;
         var3[20] = 266;
         var3[21] = 267;
         var3[22] = 268;
         var3[23] = 269;
         var3[24] = 270;
         var3[25] = 271;
         var3[26] = 272;
         var3[27] = 273;
         var3[28] = 274;
         var3[29] = 275;
         var3[30] = 276;
         var3[31] = 277;
         var3[32] = 278;
         var3[33] = 279;
         var3[34] = 280;
         var3[35] = 281;
         var3[36] = 282;
         var3[37] = 283;
         var3[38] = 284;
         var3[39] = 285;
         var3[40] = 286;
         var3[41] = 287;
         var3[42] = 288;
         var3[43] = 289;
         var3[44] = 290;
         var3[45] = 291;
         var3[46] = 292;
         var3[47] = 293;
         var3[48] = 294;
         var3[49] = 295;
         var3[50] = 296;
         var3[51] = 297;
         var3[52] = 298;
         var3[53] = 299;
         var3[54] = 300;
         var3[55] = 301;
         var3[56] = 302;
         var3[57] = 303;
         var3[58] = 304;
         var3[59] = 305;
         var3[60] = 306;
         var3[61] = 307;
         var3[62] = 308;
         var3[63] = 309;
         var3[64] = 310;
         var3[65] = 311;
         var3[66] = 312;
         var3[67] = 313;
         String[] var4;
         (var4 = new String[68])[0] = "glDispatchCompute";
         var4[1] = "glDispatchComputeIndirect";
         var4[2] = "glDrawArraysIndirect";
         var4[3] = "glDrawElementsIndirect";
         var4[4] = "glFramebufferParameteri";
         var4[5] = "glGetFramebufferParameteriv";
         var4[6] = "glGetProgramInterfaceiv";
         var4[7] = "glGetProgramResourceIndex";
         var4[8] = "glGetProgramResourceName";
         var4[9] = "glGetProgramResourceiv";
         var4[10] = "glGetProgramResourceLocation";
         var4[11] = "glUseProgramStages";
         var4[12] = "glActiveShaderProgram";
         var4[13] = "glCreateShaderProgramv";
         var4[14] = "glBindProgramPipeline";
         var4[15] = "glDeleteProgramPipelines";
         var4[16] = "glGenProgramPipelines";
         var4[17] = "glIsProgramPipeline";
         var4[18] = "glGetProgramPipelineiv";
         var4[19] = "glProgramUniform1i";
         var4[20] = "glProgramUniform2i";
         var4[21] = "glProgramUniform3i";
         var4[22] = "glProgramUniform4i";
         var4[23] = "glProgramUniform1ui";
         var4[24] = "glProgramUniform2ui";
         var4[25] = "glProgramUniform3ui";
         var4[26] = "glProgramUniform4ui";
         var4[27] = "glProgramUniform1f";
         var4[28] = "glProgramUniform2f";
         var4[29] = "glProgramUniform3f";
         var4[30] = "glProgramUniform4f";
         var4[31] = "glProgramUniform1iv";
         var4[32] = "glProgramUniform2iv";
         var4[33] = "glProgramUniform3iv";
         var4[34] = "glProgramUniform4iv";
         var4[35] = "glProgramUniform1uiv";
         var4[36] = "glProgramUniform2uiv";
         var4[37] = "glProgramUniform3uiv";
         var4[38] = "glProgramUniform4uiv";
         var4[39] = "glProgramUniform1fv";
         var4[40] = "glProgramUniform2fv";
         var4[41] = "glProgramUniform3fv";
         var4[42] = "glProgramUniform4fv";
         var4[43] = "glProgramUniformMatrix2fv";
         var4[44] = "glProgramUniformMatrix3fv";
         var4[45] = "glProgramUniformMatrix4fv";
         var4[46] = "glProgramUniformMatrix2x3fv";
         var4[47] = "glProgramUniformMatrix3x2fv";
         var4[48] = "glProgramUniformMatrix2x4fv";
         var4[49] = "glProgramUniformMatrix4x2fv";
         var4[50] = "glProgramUniformMatrix3x4fv";
         var4[51] = "glProgramUniformMatrix4x3fv";
         var4[52] = "glValidateProgramPipeline";
         var4[53] = "glGetProgramPipelineInfoLog";
         var4[54] = "glBindImageTexture";
         var4[55] = "glGetBooleani_v";
         var4[56] = "glMemoryBarrier";
         var4[57] = "glMemoryBarrierByRegion";
         var4[58] = "glTexStorage2DMultisample";
         var4[59] = "glGetMultisamplefv";
         var4[60] = "glSampleMaski";
         var4[61] = "glGetTexLevelParameteriv";
         var4[62] = "glGetTexLevelParameterfv";
         var4[63] = "glBindVertexBuffer";
         var4[64] = "glVertexAttribFormat";
         var4[65] = "glVertexAttribIFormat";
         var4[66] = "glVertexAttribBinding";
         var4[67] = "glVertexBindingDivisor";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GLES31");
      }
   }

   private static boolean check_GLES32(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GLES32")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[44])[0] = 314;
         var3[1] = 315;
         var3[2] = 316;
         var3[3] = 317;
         var3[4] = 318;
         var3[5] = 319;
         var3[6] = 320;
         var3[7] = 321;
         var3[8] = 322;
         var3[9] = 323;
         var3[10] = 324;
         var3[11] = 325;
         var3[12] = 326;
         var3[13] = 327;
         var3[14] = 328;
         var3[15] = 329;
         var3[16] = 330;
         var3[17] = 331;
         var3[18] = 332;
         var3[19] = 333;
         var3[20] = 334;
         var3[21] = 335;
         var3[22] = 336;
         var3[23] = 337;
         var3[24] = 338;
         var3[25] = 339;
         var3[26] = 340;
         var3[27] = 341;
         var3[28] = 342;
         var3[29] = 343;
         var3[30] = 344;
         var3[31] = 345;
         var3[32] = 346;
         var3[33] = 347;
         var3[34] = 348;
         var3[35] = 349;
         var3[36] = 350;
         var3[37] = 351;
         var3[38] = 352;
         var3[39] = 353;
         var3[40] = 354;
         var3[41] = 355;
         var3[42] = 356;
         var3[43] = 357;
         String[] var4;
         (var4 = new String[44])[0] = "glBlendBarrier";
         var4[1] = "glCopyImageSubData";
         var4[2] = "glDebugMessageControl";
         var4[3] = "glDebugMessageInsert";
         var4[4] = "glDebugMessageCallback";
         var4[5] = "glGetDebugMessageLog";
         var4[6] = "glGetPointerv";
         var4[7] = "glPushDebugGroup";
         var4[8] = "glPopDebugGroup";
         var4[9] = "glObjectLabel";
         var4[10] = "glGetObjectLabel";
         var4[11] = "glObjectPtrLabel";
         var4[12] = "glGetObjectPtrLabel";
         var4[13] = "glEnablei";
         var4[14] = "glDisablei";
         var4[15] = "glBlendEquationi";
         var4[16] = "glBlendEquationSeparatei";
         var4[17] = "glBlendFunci";
         var4[18] = "glBlendFuncSeparatei";
         var4[19] = "glColorMaski";
         var4[20] = "glIsEnabledi";
         var4[21] = "glDrawElementsBaseVertex";
         var4[22] = "glDrawRangeElementsBaseVertex";
         var4[23] = "glDrawElementsInstancedBaseVertex";
         var4[24] = "glFramebufferTexture";
         var4[25] = "glPrimitiveBoundingBox";
         var4[26] = "glGetGraphicsResetStatus";
         var4[27] = "glReadnPixels";
         var4[28] = "glGetnUniformfv";
         var4[29] = "glGetnUniformiv";
         var4[30] = "glGetnUniformuiv";
         var4[31] = "glMinSampleShading";
         var4[32] = "glPatchParameteri";
         var4[33] = "glTexParameterIiv";
         var4[34] = "glTexParameterIuiv";
         var4[35] = "glGetTexParameterIiv";
         var4[36] = "glGetTexParameterIuiv";
         var4[37] = "glSamplerParameterIiv";
         var4[38] = "glSamplerParameterIuiv";
         var4[39] = "glGetSamplerParameterIiv";
         var4[40] = "glGetSamplerParameterIuiv";
         var4[41] = "glTexBuffer";
         var4[42] = "glTexBufferRange";
         var4[43] = "glTexStorage3DMultisample";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GLES32");
      }
   }

   private static boolean check_AMD_framebuffer_multisample_advanced(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_AMD_framebuffer_multisample_advanced")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 358;
         var10002[1] = 359;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glRenderbufferStorageMultisampleAdvancedAMD";
         var5[1] = "glNamedRenderbufferStorageMultisampleAdvancedAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_AMD_framebuffer_multisample_advanced");
      }
   }

   private static boolean check_AMD_performance_monitor(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_AMD_performance_monitor")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[11];
         var10002[0] = 360;
         var10002[1] = 361;
         var10002[2] = 362;
         var10002[3] = 363;
         var10002[4] = 364;
         var10002[5] = 365;
         var10002[6] = 366;
         var10002[7] = 367;
         var10002[8] = 368;
         var10002[9] = 369;
         var10002[10] = 370;
         String[] var4;
         String[] var5 = var4 = new String[11];
         var5[0] = "glGetPerfMonitorGroupsAMD";
         var5[1] = "glGetPerfMonitorCountersAMD";
         var5[2] = "glGetPerfMonitorGroupStringAMD";
         var5[3] = "glGetPerfMonitorCounterStringAMD";
         var5[4] = "glGetPerfMonitorCounterInfoAMD";
         var5[5] = "glGenPerfMonitorsAMD";
         var5[6] = "glDeletePerfMonitorsAMD";
         var5[7] = "glSelectPerfMonitorCountersAMD";
         var5[8] = "glBeginPerfMonitorAMD";
         var5[9] = "glEndPerfMonitorAMD";
         var5[10] = "glGetPerfMonitorCounterDataAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_AMD_performance_monitor");
      }
   }

   private static boolean check_ANGLE_framebuffer_blit(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ANGLE_framebuffer_blit")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 371;
         String[] var4;
         (var4 = new String[1])[0] = "glBlitFramebufferANGLE";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_ANGLE_framebuffer_blit");
      }
   }

   private static boolean check_ANGLE_framebuffer_multisample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ANGLE_framebuffer_multisample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 372;
         String[] var4;
         (var4 = new String[1])[0] = "glRenderbufferStorageMultisampleANGLE";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_ANGLE_framebuffer_multisample");
      }
   }

   private static boolean check_ANGLE_instanced_arrays(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ANGLE_instanced_arrays")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 373;
         var10002[1] = 374;
         var10002[2] = 375;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glDrawArraysInstancedANGLE";
         var5[1] = "glDrawElementsInstancedANGLE";
         var5[2] = "glVertexAttribDivisorANGLE";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_ANGLE_instanced_arrays");
      }
   }

   private static boolean check_ANGLE_translated_shader_source(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ANGLE_translated_shader_source")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 376;
         String[] var4;
         (var4 = new String[1])[0] = "glGetTranslatedShaderSourceANGLE";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_ANGLE_translated_shader_source");
      }
   }

   private static boolean check_APPLE_copy_texture_levels(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_APPLE_copy_texture_levels")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 377;
         String[] var4;
         (var4 = new String[1])[0] = "glCopyTextureLevelsAPPLE";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_APPLE_copy_texture_levels");
      }
   }

   private static boolean check_APPLE_framebuffer_multisample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_APPLE_framebuffer_multisample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 378;
         var10002[1] = 379;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glRenderbufferStorageMultisampleAPPLE";
         var5[1] = "glResolveMultisampleFramebufferAPPLE";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_APPLE_framebuffer_multisample");
      }
   }

   private static boolean check_APPLE_sync(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_APPLE_sync")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[7];
         var10002[0] = 380;
         var10002[1] = 381;
         var10002[2] = 382;
         var10002[3] = 383;
         var10002[4] = 384;
         var10002[5] = 385;
         var10002[6] = 386;
         String[] var4;
         String[] var5 = var4 = new String[7];
         var5[0] = "glFenceSyncAPPLE";
         var5[1] = "glIsSyncAPPLE";
         var5[2] = "glDeleteSyncAPPLE";
         var5[3] = "glClientWaitSyncAPPLE";
         var5[4] = "glWaitSyncAPPLE";
         var5[5] = "glGetInteger64vAPPLE";
         var5[6] = "glGetSyncivAPPLE";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_APPLE_sync");
      }
   }

   private static boolean check_ARM_shader_core_properties(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARM_shader_core_properties")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 387;
         String[] var4;
         (var4 = new String[1])[0] = "glMaxActiveShaderCoresARM";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_ARM_shader_core_properties");
      }
   }

   private static boolean check_EXT_base_instance(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_base_instance")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 388;
         var10002[1] = 389;
         var10002[2] = 390;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glDrawArraysInstancedBaseInstanceEXT";
         var5[1] = "glDrawElementsInstancedBaseInstanceEXT";
         var5[2] = "glDrawElementsInstancedBaseVertexBaseInstanceEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_base_instance");
      }
   }

   private static boolean check_EXT_blend_func_extended(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_blend_func_extended")) {
         return false;
      } else {
         int var3;
         if (var2.contains("GLES30")) {
            var3 = 0;
         } else {
            var3 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         var2.contains("GLES31");
         int[] var4;
         int[] var10002 = var4 = new int[3];
         var4[0] = var3 + 391;
         var4[1] = var3 + 392;
         var10002[2] = var3 + 393;
         String[] var5;
         String[] var6 = var5 = new String[3];
         var6[0] = "glBindFragDataLocationIndexedEXT";
         var6[1] = "glGetFragDataIndexEXT";
         var6[2] = "glBindFragDataLocationEXT";
         return Checks.checkFunctions(var10000, var10001, var4, var5) || Checks.reportMissing("GLES", "GL_EXT_blend_func_extended");
      }
   }

   private static boolean check_EXT_buffer_storage(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_buffer_storage")) {
         return false;
      } else {
         int var5;
         if (hasDSA(var2)) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var3[0] = 395;
         var10002[1] = var5 + 396;
         String[] var4;
         String[] var6 = var4 = new String[2];
         var6[0] = "glBufferStorageEXT";
         var6[1] = "glNamedBufferStorageEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_buffer_storage");
      }
   }

   private static boolean check_EXT_clear_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_clear_texture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 397;
         var10002[1] = 398;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glClearTexImageEXT";
         var5[1] = "glClearTexSubImageEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_clear_texture");
      }
   }

   private static boolean check_EXT_clip_control(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_clip_control")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 399;
         String[] var4;
         (var4 = new String[1])[0] = "glClipControlEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_clip_control");
      }
   }

   private static boolean check_EXT_copy_image(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_copy_image")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 400;
         String[] var4;
         (var4 = new String[1])[0] = "glCopyImageSubDataEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_copy_image");
      }
   }

   private static boolean check_EXT_debug_label(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_debug_label")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 401;
         var10002[1] = 402;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glLabelObjectEXT";
         var5[1] = "glGetObjectLabelEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_debug_label");
      }
   }

   private static boolean check_EXT_debug_marker(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_debug_marker")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 403;
         var10002[1] = 404;
         var10002[2] = 405;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glInsertEventMarkerEXT";
         var5[1] = "glPushGroupMarkerEXT";
         var5[2] = "glPopGroupMarkerEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_debug_marker");
      }
   }

   private static boolean check_EXT_discard_framebuffer(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_discard_framebuffer")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 406;
         String[] var4;
         (var4 = new String[1])[0] = "glDiscardFramebufferEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_discard_framebuffer");
      }
   }

   private static boolean check_EXT_disjoint_timer_query(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_disjoint_timer_query")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[10];
         var10002[0] = 407;
         var10002[1] = 408;
         var10002[2] = 409;
         var10002[3] = 410;
         var10002[4] = 411;
         var10002[5] = 412;
         var10002[6] = 413;
         var10002[7] = 414;
         var10002[8] = 416;
         var10002[9] = 417;
         String[] var4;
         String[] var5 = var4 = new String[10];
         var5[0] = "glGenQueriesEXT";
         var5[1] = "glDeleteQueriesEXT";
         var5[2] = "glIsQueryEXT";
         var5[3] = "glBeginQueryEXT";
         var5[4] = "glEndQueryEXT";
         var5[5] = "glGetQueryivEXT";
         var5[6] = "glGetQueryObjectuivEXT";
         var5[7] = "glQueryCounterEXT";
         var5[8] = "glGetQueryObjecti64vEXT";
         var5[9] = "glGetQueryObjectui64vEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_disjoint_timer_query");
      }
   }

   private static boolean check_EXT_draw_buffers(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_draw_buffers")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 419;
         String[] var4;
         (var4 = new String[1])[0] = "glDrawBuffersEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_draw_buffers");
      }
   }

   private static boolean check_EXT_draw_buffers_indexed(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_draw_buffers_indexed")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[8];
         var10002[0] = 420;
         var10002[1] = 421;
         var10002[2] = 422;
         var10002[3] = 423;
         var10002[4] = 424;
         var10002[5] = 425;
         var10002[6] = 426;
         var10002[7] = 427;
         String[] var4;
         String[] var5 = var4 = new String[8];
         var5[0] = "glEnableiEXT";
         var5[1] = "glDisableiEXT";
         var5[2] = "glBlendEquationiEXT";
         var5[3] = "glBlendEquationSeparateiEXT";
         var5[4] = "glBlendFunciEXT";
         var5[5] = "glBlendFuncSeparateiEXT";
         var5[6] = "glColorMaskiEXT";
         var5[7] = "glIsEnablediEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_draw_buffers_indexed");
      }
   }

   private static boolean check_EXT_draw_elements_base_vertex(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_draw_elements_base_vertex")) {
         return false;
      } else {
         int var3;
         if (var2.contains("GLES30")) {
            var3 = 0;
         } else {
            var3 = Integer.MIN_VALUE;
         }

         int var6;
         if (var2.contains("GL_EXT_multi_draw_arrays")) {
            var6 = 0;
         } else {
            var6 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var4;
         int[] var10002 = var4 = new int[4];
         var4[0] = 428;
         var4[1] = var3 + 429;
         var4[2] = var3 + 430;
         var10002[3] = var6 + 431;
         String[] var5;
         String[] var7 = var5 = new String[4];
         var7[0] = "glDrawElementsBaseVertexEXT";
         var7[1] = "glDrawRangeElementsBaseVertexEXT";
         var7[2] = "glDrawElementsInstancedBaseVertexEXT";
         var7[3] = "glMultiDrawElementsBaseVertexEXT";
         return Checks.checkFunctions(var10000, var10001, var4, var5) || Checks.reportMissing("GLES", "GL_EXT_draw_elements_base_vertex");
      }
   }

   private static boolean check_EXT_draw_instanced(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_draw_instanced")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 432;
         var10002[1] = 433;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glDrawArraysInstancedEXT";
         var5[1] = "glDrawElementsInstancedEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_draw_instanced");
      }
   }

   private static boolean check_EXT_draw_transform_feedback(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_draw_transform_feedback")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 434;
         var10002[1] = 435;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glDrawTransformFeedbackEXT";
         var5[1] = "glDrawTransformFeedbackInstancedEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_draw_transform_feedback");
      }
   }

   private static boolean check_EXT_EGL_image_storage(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_EGL_image_storage")) {
         return false;
      } else {
         int var5;
         if (hasDSA(var2)) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var3[0] = 436;
         var10002[1] = var5 + 437;
         String[] var4;
         String[] var6 = var4 = new String[2];
         var6[0] = "glEGLImageTargetTexStorageEXT";
         var6[1] = "glEGLImageTargetTextureStorageEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_EGL_image_storage");
      }
   }

   private static boolean check_EXT_external_buffer(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_external_buffer")) {
         return false;
      } else {
         int var5;
         if (hasDSA(var2)) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var3[0] = 438;
         var10002[1] = var5 + 439;
         String[] var4;
         String[] var6 = var4 = new String[2];
         var6[0] = "glBufferStorageExternalEXT";
         var6[1] = "glNamedBufferStorageExternalEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_external_buffer");
      }
   }

   private static boolean check_EXT_fragment_shading_rate(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_fragment_shading_rate")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 440;
         var10002[1] = 441;
         var10002[2] = 442;
         var10002[3] = 443;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glShadingRateEXT";
         var5[1] = "glShadingRateCombinerOpsEXT";
         var5[2] = "glFramebufferShadingRateEXT";
         var5[3] = "glGetFragmentShadingRatesEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_fragment_shading_rate");
      }
   }

   private static boolean check_EXT_framebuffer_blit_layers(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_framebuffer_blit_layers")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 444;
         var10002[1] = 445;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glBlitFramebufferLayersEXT";
         var5[1] = "glBlitFramebufferLayerEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_framebuffer_blit_layers");
      }
   }

   private static boolean check_EXT_geometry_shader(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_geometry_shader")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 446;
         String[] var4;
         (var4 = new String[1])[0] = "glFramebufferTextureEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_geometry_shader");
      }
   }

   private static boolean check_EXT_instanced_arrays(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_instanced_arrays")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 432;
         var10002[1] = 433;
         var10002[2] = 447;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glDrawArraysInstancedEXT";
         var5[1] = "glDrawElementsInstancedEXT";
         var5[2] = "glVertexAttribDivisorEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_instanced_arrays");
      }
   }

   private static boolean check_EXT_map_buffer_range(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_map_buffer_range")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 448;
         var10002[1] = 449;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glMapBufferRangeEXT";
         var5[1] = "glFlushMappedBufferRangeEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_map_buffer_range");
      }
   }

   private static boolean check_EXT_memory_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_memory_object")) {
         return false;
      } else {
         int var5;
         if (hasDSA(var2)) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[17];
         var3[0] = 450;
         var3[1] = 451;
         var3[2] = 452;
         var3[3] = 453;
         var3[4] = 454;
         var3[5] = 455;
         var3[6] = 456;
         var3[7] = 457;
         var3[8] = 458;
         var3[9] = 459;
         var3[10] = 460;
         var3[11] = 461;
         var3[12] = var5 + 462;
         var3[13] = var5 + 463;
         var3[14] = var5 + 464;
         var3[15] = var5 + 465;
         var10002[16] = var5 + 466;
         String[] var4;
         String[] var6 = var4 = new String[17];
         var6[0] = "glGetUnsignedBytevEXT";
         var6[1] = "glGetUnsignedBytei_vEXT";
         var6[2] = "glDeleteMemoryObjectsEXT";
         var6[3] = "glIsMemoryObjectEXT";
         var6[4] = "glCreateMemoryObjectsEXT";
         var6[5] = "glMemoryObjectParameterivEXT";
         var6[6] = "glGetMemoryObjectParameterivEXT";
         var6[7] = "glTexStorageMem2DEXT";
         var6[8] = "glTexStorageMem2DMultisampleEXT";
         var6[9] = "glTexStorageMem3DEXT";
         var6[10] = "glTexStorageMem3DMultisampleEXT";
         var6[11] = "glBufferStorageMemEXT";
         var6[12] = "glTextureStorageMem2DEXT";
         var6[13] = "glTextureStorageMem2DMultisampleEXT";
         var6[14] = "glTextureStorageMem3DEXT";
         var6[15] = "glTextureStorageMem3DMultisampleEXT";
         var6[16] = "glNamedBufferStorageMemEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_memory_object");
      }
   }

   private static boolean check_EXT_memory_object_fd(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_memory_object_fd")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 467;
         String[] var4;
         (var4 = new String[1])[0] = "glImportMemoryFdEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_memory_object_fd");
      }
   }

   private static boolean check_EXT_memory_object_win32(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_memory_object_win32")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 468;
         var10002[1] = 469;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glImportMemoryWin32HandleEXT";
         var5[1] = "glImportMemoryWin32NameEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_memory_object_win32");
      }
   }

   private static boolean check_EXT_multi_draw_arrays(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_multi_draw_arrays")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 470;
         var10002[1] = 471;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glMultiDrawArraysEXT";
         var5[1] = "glMultiDrawElementsEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_multi_draw_arrays");
      }
   }

   private static boolean check_EXT_multi_draw_indirect(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_multi_draw_indirect")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 472;
         var10002[1] = 473;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glMultiDrawArraysIndirectEXT";
         var5[1] = "glMultiDrawElementsIndirectEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_multi_draw_indirect");
      }
   }

   private static boolean check_EXT_multisampled_render_to_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_multisampled_render_to_texture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 474;
         var10002[1] = 475;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glRenderbufferStorageMultisampleEXT";
         var5[1] = "glFramebufferTexture2DMultisampleEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_multisampled_render_to_texture");
      }
   }

   private static boolean check_EXT_multiview_draw_buffers(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_multiview_draw_buffers")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 476;
         var10002[1] = 477;
         var10002[2] = 478;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glReadBufferIndexedEXT";
         var5[1] = "glDrawBuffersIndexedEXT";
         var5[2] = "glGetIntegeri_vEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_multiview_draw_buffers");
      }
   }

   private static boolean check_EXT_occlusion_query_boolean(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_occlusion_query_boolean")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[7];
         var10002[0] = 407;
         var10002[1] = 408;
         var10002[2] = 409;
         var10002[3] = 410;
         var10002[4] = 411;
         var10002[5] = 412;
         var10002[6] = 413;
         String[] var4;
         String[] var5 = var4 = new String[7];
         var5[0] = "glGenQueriesEXT";
         var5[1] = "glDeleteQueriesEXT";
         var5[2] = "glIsQueryEXT";
         var5[3] = "glBeginQueryEXT";
         var5[4] = "glEndQueryEXT";
         var5[5] = "glGetQueryivEXT";
         var5[6] = "glGetQueryObjectuivEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_occlusion_query_boolean");
      }
   }

   private static boolean check_EXT_polygon_offset_clamp(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_polygon_offset_clamp")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 479;
         String[] var4;
         (var4 = new String[1])[0] = "glPolygonOffsetClampEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_polygon_offset_clamp");
      }
   }

   private static boolean check_EXT_primitive_bounding_box(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_primitive_bounding_box")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 480;
         String[] var4;
         (var4 = new String[1])[0] = "glPrimitiveBoundingBoxEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_primitive_bounding_box");
      }
   }

   private static boolean check_EXT_raster_multisample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_raster_multisample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 481;
         String[] var4;
         (var4 = new String[1])[0] = "glRasterSamplesEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_raster_multisample");
      }
   }

   private static boolean check_EXT_robustness(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_robustness")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 482;
         var10002[1] = 483;
         var10002[2] = 484;
         var10002[3] = 485;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glGetGraphicsResetStatusEXT";
         var5[1] = "glReadnPixelsEXT";
         var5[2] = "glGetnUniformfvEXT";
         var5[3] = "glGetnUniformivEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_robustness");
      }
   }

   private static boolean check_EXT_semaphore(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_semaphore")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[9];
         var10002[0] = 450;
         var10002[1] = 451;
         var10002[2] = 486;
         var10002[3] = 487;
         var10002[4] = 488;
         var10002[5] = 489;
         var10002[6] = 490;
         var10002[7] = 491;
         var10002[8] = 492;
         String[] var4;
         String[] var5 = var4 = new String[9];
         var5[0] = "glGetUnsignedBytevEXT";
         var5[1] = "glGetUnsignedBytei_vEXT";
         var5[2] = "glGenSemaphoresEXT";
         var5[3] = "glDeleteSemaphoresEXT";
         var5[4] = "glIsSemaphoreEXT";
         var5[5] = "glSemaphoreParameterui64vEXT";
         var5[6] = "glGetSemaphoreParameterui64vEXT";
         var5[7] = "glWaitSemaphoreEXT";
         var5[8] = "glSignalSemaphoreEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_semaphore");
      }
   }

   private static boolean check_EXT_semaphore_fd(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_semaphore_fd")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 493;
         String[] var4;
         (var4 = new String[1])[0] = "glImportSemaphoreFdEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_semaphore_fd");
      }
   }

   private static boolean check_EXT_semaphore_win32(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_semaphore_win32")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 494;
         var10002[1] = 495;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glImportSemaphoreWin32HandleEXT";
         var5[1] = "glImportSemaphoreWin32NameEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_semaphore_win32");
      }
   }

   private static boolean check_EXT_separate_shader_objects(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_separate_shader_objects")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[44])[0] = 496;
         var3[1] = 497;
         var3[2] = 498;
         var3[3] = 499;
         var3[4] = 500;
         var3[5] = 501;
         var3[6] = 502;
         var3[7] = 503;
         var3[8] = 504;
         var3[9] = 505;
         var3[10] = 506;
         var3[11] = 507;
         var3[12] = 508;
         var3[13] = 509;
         var3[14] = 510;
         var3[15] = 511;
         var3[16] = 512;
         var3[17] = 513;
         var3[18] = 514;
         var3[19] = 515;
         var3[20] = 516;
         var3[21] = 517;
         var3[22] = 518;
         var3[23] = 519;
         var3[24] = 520;
         var3[25] = 521;
         var3[26] = 522;
         var3[27] = 523;
         var3[28] = 524;
         var3[29] = 525;
         var3[30] = 526;
         var3[31] = 527;
         var3[32] = 528;
         var3[33] = 529;
         var3[34] = 530;
         var3[35] = 531;
         var3[36] = 532;
         var3[37] = 533;
         var3[38] = 534;
         var3[39] = 535;
         var3[40] = 536;
         var3[41] = 537;
         var3[42] = 538;
         var3[43] = 539;
         String[] var4;
         (var4 = new String[44])[0] = "glActiveShaderProgramEXT";
         var4[1] = "glBindProgramPipelineEXT";
         var4[2] = "glCreateShaderProgramvEXT";
         var4[3] = "glDeleteProgramPipelinesEXT";
         var4[4] = "glGenProgramPipelinesEXT";
         var4[5] = "glGetProgramPipelineInfoLogEXT";
         var4[6] = "glGetProgramPipelineivEXT";
         var4[7] = "glIsProgramPipelineEXT";
         var4[8] = "glProgramParameteriEXT";
         var4[9] = "glProgramUniform1fEXT";
         var4[10] = "glProgramUniform1fvEXT";
         var4[11] = "glProgramUniform1iEXT";
         var4[12] = "glProgramUniform1ivEXT";
         var4[13] = "glProgramUniform2fEXT";
         var4[14] = "glProgramUniform2fvEXT";
         var4[15] = "glProgramUniform2iEXT";
         var4[16] = "glProgramUniform2ivEXT";
         var4[17] = "glProgramUniform3fEXT";
         var4[18] = "glProgramUniform3fvEXT";
         var4[19] = "glProgramUniform3iEXT";
         var4[20] = "glProgramUniform3ivEXT";
         var4[21] = "glProgramUniform4fEXT";
         var4[22] = "glProgramUniform4fvEXT";
         var4[23] = "glProgramUniform4iEXT";
         var4[24] = "glProgramUniform4ivEXT";
         var4[25] = "glProgramUniformMatrix2fvEXT";
         var4[26] = "glProgramUniformMatrix3fvEXT";
         var4[27] = "glProgramUniformMatrix4fvEXT";
         var4[28] = "glUseProgramStagesEXT";
         var4[29] = "glValidateProgramPipelineEXT";
         var4[30] = "glProgramUniform1uiEXT";
         var4[31] = "glProgramUniform2uiEXT";
         var4[32] = "glProgramUniform3uiEXT";
         var4[33] = "glProgramUniform4uiEXT";
         var4[34] = "glProgramUniform1uivEXT";
         var4[35] = "glProgramUniform2uivEXT";
         var4[36] = "glProgramUniform3uivEXT";
         var4[37] = "glProgramUniform4uivEXT";
         var4[38] = "glProgramUniformMatrix2x3fvEXT";
         var4[39] = "glProgramUniformMatrix3x2fvEXT";
         var4[40] = "glProgramUniformMatrix2x4fvEXT";
         var4[41] = "glProgramUniformMatrix4x2fvEXT";
         var4[42] = "glProgramUniformMatrix3x4fvEXT";
         var4[43] = "glProgramUniformMatrix4x3fvEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_separate_shader_objects");
      }
   }

   private static boolean check_EXT_shader_framebuffer_fetch_non_coherent(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_shader_framebuffer_fetch_non_coherent")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 540;
         String[] var4;
         (var4 = new String[1])[0] = "glFramebufferFetchBarrierEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_shader_framebuffer_fetch_non_coherent");
      }
   }

   private static boolean check_EXT_shader_pixel_local_storage2(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_shader_pixel_local_storage2")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 541;
         var10002[1] = 542;
         var10002[2] = 543;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glFramebufferPixelLocalStorageSizeEXT";
         var5[1] = "glGetFramebufferPixelLocalStorageSizeEXT";
         var5[2] = "glClearPixelLocalStorageuiEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_shader_pixel_local_storage2");
      }
   }

   private static boolean check_EXT_sparse_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_sparse_texture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 544;
         String[] var4;
         (var4 = new String[1])[0] = "glTexPageCommitmentARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_sparse_texture");
      }
   }

   private static boolean check_EXT_tessellation_shader(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_tessellation_shader")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 545;
         String[] var4;
         (var4 = new String[1])[0] = "glPatchParameteriEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_tessellation_shader");
      }
   }

   private static boolean check_EXT_texture_border_clamp(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_texture_border_clamp")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[8];
         var10002[0] = 546;
         var10002[1] = 547;
         var10002[2] = 548;
         var10002[3] = 549;
         var10002[4] = 550;
         var10002[5] = 551;
         var10002[6] = 552;
         var10002[7] = 553;
         String[] var4;
         String[] var5 = var4 = new String[8];
         var5[0] = "glTexParameterIivEXT";
         var5[1] = "glTexParameterIuivEXT";
         var5[2] = "glGetTexParameterIivEXT";
         var5[3] = "glGetTexParameterIuivEXT";
         var5[4] = "glSamplerParameterIivEXT";
         var5[5] = "glSamplerParameterIuivEXT";
         var5[6] = "glGetSamplerParameterIivEXT";
         var5[7] = "glGetSamplerParameterIuivEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_texture_border_clamp");
      }
   }

   private static boolean check_EXT_texture_buffer(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_texture_buffer")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 554;
         var10002[1] = 555;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glTexBufferEXT";
         var5[1] = "glTexBufferRangeEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_texture_buffer");
      }
   }

   private static boolean check_EXT_texture_storage(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_texture_storage")) {
         return false;
      } else {
         int var5;
         if (hasDSA(var2)) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var3[0] = 556;
         var3[1] = 557;
         var3[2] = 558;
         var3[3] = var5 + 559;
         var3[4] = var5 + 560;
         var10002[5] = var5 + 561;
         String[] var4;
         String[] var6 = var4 = new String[6];
         var6[0] = "glTexStorage1DEXT";
         var6[1] = "glTexStorage2DEXT";
         var6[2] = "glTexStorage3DEXT";
         var6[3] = "glTextureStorage1DEXT";
         var6[4] = "glTextureStorage2DEXT";
         var6[5] = "glTextureStorage3DEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_texture_storage");
      }
   }

   private static boolean check_EXT_texture_storage_compression(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_texture_storage_compression")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 562;
         var10002[1] = 563;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glTexStorageAttribs2DEXT";
         var5[1] = "glTexStorageAttribs3DEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_texture_storage_compression");
      }
   }

   private static boolean check_EXT_texture_view(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_texture_view")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 564;
         String[] var4;
         (var4 = new String[1])[0] = "glTextureViewEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_texture_view");
      }
   }

   private static boolean check_EXT_win32_keyed_mutex(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_win32_keyed_mutex")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 565;
         var10002[1] = 566;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glAcquireKeyedMutexWin32EXT";
         var5[1] = "glReleaseKeyedMutexWin32EXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_win32_keyed_mutex");
      }
   }

   private static boolean check_EXT_window_rectangles(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_window_rectangles")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 567;
         String[] var4;
         (var4 = new String[1])[0] = "glWindowRectanglesEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_EXT_window_rectangles");
      }
   }

   private static boolean check_IMG_framebuffer_downsample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_IMG_framebuffer_downsample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 568;
         var10002[1] = 569;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glFramebufferTexture2DDownsampleIMG";
         var5[1] = "glFramebufferTextureLayerDownsampleIMG";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_IMG_framebuffer_downsample");
      }
   }

   private static boolean check_IMG_multisampled_render_to_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_IMG_multisampled_render_to_texture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 570;
         var10002[1] = 571;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glRenderbufferStorageMultisampleIMG";
         var5[1] = "glFramebufferTexture2DMultisampleIMG";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_IMG_multisampled_render_to_texture");
      }
   }

   private static boolean check_INTEL_framebuffer_CMAA(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_INTEL_framebuffer_CMAA")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 572;
         String[] var4;
         (var4 = new String[1])[0] = "glApplyFramebufferAttachmentCMAAINTEL";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_INTEL_framebuffer_CMAA");
      }
   }

   private static boolean check_INTEL_performance_query(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_INTEL_performance_query")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[10];
         var10002[0] = 573;
         var10002[1] = 574;
         var10002[2] = 575;
         var10002[3] = 576;
         var10002[4] = 577;
         var10002[5] = 578;
         var10002[6] = 579;
         var10002[7] = 580;
         var10002[8] = 581;
         var10002[9] = 582;
         String[] var4;
         String[] var5 = var4 = new String[10];
         var5[0] = "glBeginPerfQueryINTEL";
         var5[1] = "glCreatePerfQueryINTEL";
         var5[2] = "glDeletePerfQueryINTEL";
         var5[3] = "glEndPerfQueryINTEL";
         var5[4] = "glGetFirstPerfQueryIdINTEL";
         var5[5] = "glGetNextPerfQueryIdINTEL";
         var5[6] = "glGetPerfCounterInfoINTEL";
         var5[7] = "glGetPerfQueryDataINTEL";
         var5[8] = "glGetPerfQueryIdByNameINTEL";
         var5[9] = "glGetPerfQueryInfoINTEL";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_INTEL_performance_query");
      }
   }

   private static boolean check_KHR_blend_equation_advanced(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_KHR_blend_equation_advanced")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 583;
         String[] var4;
         (var4 = new String[1])[0] = "glBlendBarrierKHR";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_KHR_blend_equation_advanced");
      }
   }

   private static boolean check_KHR_debug(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_KHR_debug")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[11];
         var10002[0] = 584;
         var10002[1] = 585;
         var10002[2] = 586;
         var10002[3] = 587;
         var10002[4] = 588;
         var10002[5] = 589;
         var10002[6] = 590;
         var10002[7] = 591;
         var10002[8] = 592;
         var10002[9] = 593;
         var10002[10] = 594;
         String[] var4;
         String[] var5 = var4 = new String[11];
         var5[0] = "glDebugMessageControlKHR";
         var5[1] = "glDebugMessageInsertKHR";
         var5[2] = "glDebugMessageCallbackKHR";
         var5[3] = "glGetDebugMessageLogKHR";
         var5[4] = "glGetPointervKHR";
         var5[5] = "glPushDebugGroupKHR";
         var5[6] = "glPopDebugGroupKHR";
         var5[7] = "glObjectLabelKHR";
         var5[8] = "glGetObjectLabelKHR";
         var5[9] = "glObjectPtrLabelKHR";
         var5[10] = "glGetObjectPtrLabelKHR";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_KHR_debug");
      }
   }

   private static boolean check_KHR_parallel_shader_compile(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_KHR_parallel_shader_compile")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 595;
         String[] var4;
         (var4 = new String[1])[0] = "glMaxShaderCompilerThreadsKHR";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_KHR_parallel_shader_compile");
      }
   }

   private static boolean check_KHR_robustness(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_KHR_robustness")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[5];
         var10002[0] = 596;
         var10002[1] = 597;
         var10002[2] = 598;
         var10002[3] = 599;
         var10002[4] = 600;
         String[] var4;
         String[] var5 = var4 = new String[5];
         var5[0] = "glGetGraphicsResetStatusKHR";
         var5[1] = "glReadnPixelsKHR";
         var5[2] = "glGetnUniformfvKHR";
         var5[3] = "glGetnUniformivKHR";
         var5[4] = "glGetnUniformuivKHR";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_KHR_robustness");
      }
   }

   private static boolean check_MESA_framebuffer_flip_y(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_MESA_framebuffer_flip_y")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 601;
         var10002[1] = 602;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glFramebufferParameteriMESA";
         var5[1] = "glGetFramebufferParameterivMESA";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_MESA_framebuffer_flip_y");
      }
   }

   private static boolean check_NV_alpha_to_coverage_dither_control(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_alpha_to_coverage_dither_control")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 603;
         String[] var4;
         (var4 = new String[1])[0] = "glAlphaToCoverageDitherControlNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_alpha_to_coverage_dither_control");
      }
   }

   private static boolean check_NV_bindless_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_bindless_texture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[13];
         var10002[0] = 604;
         var10002[1] = 605;
         var10002[2] = 606;
         var10002[3] = 607;
         var10002[4] = 608;
         var10002[5] = 609;
         var10002[6] = 610;
         var10002[7] = 611;
         var10002[8] = 612;
         var10002[9] = 613;
         var10002[10] = 614;
         var10002[11] = 615;
         var10002[12] = 616;
         String[] var4;
         String[] var5 = var4 = new String[13];
         var5[0] = "glGetTextureHandleNV";
         var5[1] = "glGetTextureSamplerHandleNV";
         var5[2] = "glMakeTextureHandleResidentNV";
         var5[3] = "glMakeTextureHandleNonResidentNV";
         var5[4] = "glGetImageHandleNV";
         var5[5] = "glMakeImageHandleResidentNV";
         var5[6] = "glMakeImageHandleNonResidentNV";
         var5[7] = "glUniformHandleui64NV";
         var5[8] = "glUniformHandleui64vNV";
         var5[9] = "glProgramUniformHandleui64NV";
         var5[10] = "glProgramUniformHandleui64vNV";
         var5[11] = "glIsTextureHandleResidentNV";
         var5[12] = "glIsImageHandleResidentNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_bindless_texture");
      }
   }

   private static boolean check_NV_blend_equation_advanced(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_blend_equation_advanced")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 617;
         var10002[1] = 618;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glBlendParameteriNV";
         var5[1] = "glBlendBarrierNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_blend_equation_advanced");
      }
   }

   private static boolean check_NV_clip_space_w_scaling(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_clip_space_w_scaling")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 619;
         String[] var4;
         (var4 = new String[1])[0] = "glViewportPositionWScaleNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_clip_space_w_scaling");
      }
   }

   private static boolean check_NV_conditional_render(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_conditional_render")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 620;
         var10002[1] = 621;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glBeginConditionalRenderNV";
         var5[1] = "glEndConditionalRenderNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_conditional_render");
      }
   }

   private static boolean check_NV_conservative_raster(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_conservative_raster")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 622;
         String[] var4;
         (var4 = new String[1])[0] = "glSubpixelPrecisionBiasNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_conservative_raster");
      }
   }

   private static boolean check_NV_conservative_raster_pre_snap_triangles(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_conservative_raster_pre_snap_triangles")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 623;
         String[] var4;
         (var4 = new String[1])[0] = "glConservativeRasterParameteriNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_conservative_raster_pre_snap_triangles");
      }
   }

   private static boolean check_NV_copy_buffer(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_copy_buffer")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 624;
         String[] var4;
         (var4 = new String[1])[0] = "glCopyBufferSubDataNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_copy_buffer");
      }
   }

   private static boolean check_NV_coverage_sample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_coverage_sample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 625;
         var10002[1] = 626;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glCoverageMaskNV";
         var5[1] = "glCoverageOperationNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_coverage_sample");
      }
   }

   private static boolean check_NV_draw_buffers(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_draw_buffers")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 627;
         String[] var4;
         (var4 = new String[1])[0] = "glDrawBuffersNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_draw_buffers");
      }
   }

   private static boolean check_NV_draw_instanced(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_draw_instanced")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 628;
         var10002[1] = 629;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glDrawArraysInstancedNV";
         var5[1] = "glDrawElementsInstancedNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_draw_instanced");
      }
   }

   private static boolean check_NV_draw_vulkan_image(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_draw_vulkan_image")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[5];
         var10002[0] = 630;
         var10002[1] = 631;
         var10002[2] = 632;
         var10002[3] = 633;
         var10002[4] = 634;
         String[] var4;
         String[] var5 = var4 = new String[5];
         var5[0] = "glDrawVkImageNV";
         var5[1] = "glGetVkProcAddrNV";
         var5[2] = "glWaitVkSemaphoreNV";
         var5[3] = "glSignalVkSemaphoreNV";
         var5[4] = "glSignalVkFenceNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_draw_vulkan_image");
      }
   }

   private static boolean check_NV_fence(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_fence")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[7];
         var10002[0] = 635;
         var10002[1] = 636;
         var10002[2] = 637;
         var10002[3] = 638;
         var10002[4] = 639;
         var10002[5] = 640;
         var10002[6] = 641;
         String[] var4;
         String[] var5 = var4 = new String[7];
         var5[0] = "glDeleteFencesNV";
         var5[1] = "glGenFencesNV";
         var5[2] = "glIsFenceNV";
         var5[3] = "glTestFenceNV";
         var5[4] = "glGetFenceivNV";
         var5[5] = "glFinishFenceNV";
         var5[6] = "glSetFenceNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_fence");
      }
   }

   private static boolean check_NV_fragment_coverage_to_color(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_fragment_coverage_to_color")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 642;
         String[] var4;
         (var4 = new String[1])[0] = "glFragmentCoverageColorNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_fragment_coverage_to_color");
      }
   }

   private static boolean check_NV_framebuffer_blit(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_framebuffer_blit")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 643;
         String[] var4;
         (var4 = new String[1])[0] = "glBlitFramebufferNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_framebuffer_blit");
      }
   }

   private static boolean check_NV_framebuffer_mixed_samples(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_framebuffer_mixed_samples")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 481;
         var10002[1] = 644;
         var10002[2] = 645;
         var10002[3] = 646;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glRasterSamplesEXT";
         var5[1] = "glCoverageModulationTableNV";
         var5[2] = "glGetCoverageModulationTableNV";
         var5[3] = "glCoverageModulationNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_framebuffer_mixed_samples");
      }
   }

   private static boolean check_NV_framebuffer_multisample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_framebuffer_multisample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 647;
         String[] var4;
         (var4 = new String[1])[0] = "glRenderbufferStorageMultisampleNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_framebuffer_multisample");
      }
   }

   private static boolean check_NV_gpu_shader5(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_gpu_shader5")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[34])[0] = 648;
         var3[1] = 649;
         var3[2] = 650;
         var3[3] = 651;
         var3[4] = 652;
         var3[5] = 653;
         var3[6] = 654;
         var3[7] = 655;
         var3[8] = 656;
         var3[9] = 657;
         var3[10] = 658;
         var3[11] = 659;
         var3[12] = 660;
         var3[13] = 661;
         var3[14] = 662;
         var3[15] = 663;
         var3[16] = 664;
         var3[17] = 665;
         var3[18] = 666;
         var3[19] = 667;
         var3[20] = 668;
         var3[21] = 669;
         var3[22] = 670;
         var3[23] = 671;
         var3[24] = 672;
         var3[25] = 673;
         var3[26] = 674;
         var3[27] = 675;
         var3[28] = 676;
         var3[29] = 677;
         var3[30] = 678;
         var3[31] = 679;
         var3[32] = 680;
         var3[33] = 681;
         String[] var4;
         (var4 = new String[34])[0] = "glUniform1i64NV";
         var4[1] = "glUniform2i64NV";
         var4[2] = "glUniform3i64NV";
         var4[3] = "glUniform4i64NV";
         var4[4] = "glUniform1i64vNV";
         var4[5] = "glUniform2i64vNV";
         var4[6] = "glUniform3i64vNV";
         var4[7] = "glUniform4i64vNV";
         var4[8] = "glUniform1ui64NV";
         var4[9] = "glUniform2ui64NV";
         var4[10] = "glUniform3ui64NV";
         var4[11] = "glUniform4ui64NV";
         var4[12] = "glUniform1ui64vNV";
         var4[13] = "glUniform2ui64vNV";
         var4[14] = "glUniform3ui64vNV";
         var4[15] = "glUniform4ui64vNV";
         var4[16] = "glGetUniformi64vNV";
         var4[17] = "glGetUniformui64vNV";
         var4[18] = "glProgramUniform1i64NV";
         var4[19] = "glProgramUniform2i64NV";
         var4[20] = "glProgramUniform3i64NV";
         var4[21] = "glProgramUniform4i64NV";
         var4[22] = "glProgramUniform1i64vNV";
         var4[23] = "glProgramUniform2i64vNV";
         var4[24] = "glProgramUniform3i64vNV";
         var4[25] = "glProgramUniform4i64vNV";
         var4[26] = "glProgramUniform1ui64NV";
         var4[27] = "glProgramUniform2ui64NV";
         var4[28] = "glProgramUniform3ui64NV";
         var4[29] = "glProgramUniform4ui64NV";
         var4[30] = "glProgramUniform1ui64vNV";
         var4[31] = "glProgramUniform2ui64vNV";
         var4[32] = "glProgramUniform3ui64vNV";
         var4[33] = "glProgramUniform4ui64vNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_gpu_shader5");
      }
   }

   private static boolean check_NV_instanced_arrays(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_instanced_arrays")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 682;
         String[] var4;
         (var4 = new String[1])[0] = "glVertexAttribDivisorNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_instanced_arrays");
      }
   }

   private static boolean check_NV_internalformat_sample_query(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_internalformat_sample_query")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 683;
         String[] var4;
         (var4 = new String[1])[0] = "glGetInternalformatSampleivNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_internalformat_sample_query");
      }
   }

   private static boolean check_NV_memory_attachment(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_memory_attachment")) {
         return false;
      } else {
         int var5;
         if (hasDSA(var2)) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var3[0] = 684;
         var3[1] = 685;
         var3[2] = 686;
         var3[3] = 687;
         var3[4] = var5 + 688;
         var10002[5] = var5 + 689;
         String[] var4;
         String[] var6 = var4 = new String[6];
         var6[0] = "glGetMemoryObjectDetachedResourcesuivNV";
         var6[1] = "glResetMemoryObjectParameterNV";
         var6[2] = "glTexAttachMemoryNV";
         var6[3] = "glBufferAttachMemoryNV";
         var6[4] = "glTextureAttachMemoryNV";
         var6[5] = "glNamedBufferAttachMemoryNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_memory_attachment");
      }
   }

   private static boolean check_NV_memory_object_sparse(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_memory_object_sparse")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 690;
         var10002[1] = 691;
         var10002[2] = 692;
         var10002[3] = 693;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glBufferPageCommitmentMemNV";
         var5[1] = "glNamedBufferPageCommitmentMemNV";
         var5[2] = "glTexPageCommitmentMemNV";
         var5[3] = "glTexturePageCommitmentMemNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_memory_object_sparse");
      }
   }

   private static boolean check_NV_mesh_shader(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_mesh_shader")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 694;
         var10002[1] = 695;
         var10002[2] = 696;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glDrawMeshTasksNV";
         var5[1] = "glDrawMeshTasksIndirectNV";
         var5[2] = "glMultiDrawMeshTasksIndirectNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_mesh_shader");
      }
   }

   private static boolean check_NV_non_square_matrices(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_non_square_matrices")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 697;
         var10002[1] = 698;
         var10002[2] = 699;
         var10002[3] = 700;
         var10002[4] = 701;
         var10002[5] = 702;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glUniformMatrix2x3fvNV";
         var5[1] = "glUniformMatrix3x2fvNV";
         var5[2] = "glUniformMatrix2x4fvNV";
         var5[3] = "glUniformMatrix4x2fvNV";
         var5[4] = "glUniformMatrix3x4fvNV";
         var5[5] = "glUniformMatrix4x3fvNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_non_square_matrices");
      }
   }

   private static boolean check_NV_path_rendering(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_path_rendering")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[41])[0] = 703;
         var3[1] = 704;
         var3[2] = 705;
         var3[3] = 706;
         var3[4] = 707;
         var3[5] = 708;
         var3[6] = 709;
         var3[7] = 712;
         var3[8] = 714;
         var3[9] = 715;
         var3[10] = 716;
         var3[11] = 717;
         var3[12] = 718;
         var3[13] = 719;
         var3[14] = 720;
         var3[15] = 721;
         var3[16] = 722;
         var3[17] = 723;
         var3[18] = 724;
         var3[19] = 725;
         var3[20] = 726;
         var3[21] = 727;
         var3[22] = 728;
         var3[23] = 729;
         var3[24] = 730;
         var3[25] = 731;
         var3[26] = 732;
         var3[27] = 733;
         var3[28] = 734;
         var3[29] = 741;
         var3[30] = 742;
         var3[31] = 743;
         var3[32] = 744;
         var3[33] = 745;
         var3[34] = 746;
         var3[35] = 747;
         var3[36] = 748;
         var3[37] = 749;
         var3[38] = 750;
         var3[39] = 751;
         var3[40] = 752;
         String[] var4;
         (var4 = new String[41])[0] = "glPathCommandsNV";
         var4[1] = "glPathCoordsNV";
         var4[2] = "glPathSubCommandsNV";
         var4[3] = "glPathSubCoordsNV";
         var4[4] = "glPathStringNV";
         var4[5] = "glPathGlyphsNV";
         var4[6] = "glPathGlyphRangeNV";
         var4[7] = "glCopyPathNV";
         var4[8] = "glInterpolatePathsNV";
         var4[9] = "glTransformPathNV";
         var4[10] = "glPathParameterivNV";
         var4[11] = "glPathParameteriNV";
         var4[12] = "glPathParameterfvNV";
         var4[13] = "glPathParameterfNV";
         var4[14] = "glPathDashArrayNV";
         var4[15] = "glGenPathsNV";
         var4[16] = "glDeletePathsNV";
         var4[17] = "glIsPathNV";
         var4[18] = "glPathStencilFuncNV";
         var4[19] = "glPathStencilDepthOffsetNV";
         var4[20] = "glStencilFillPathNV";
         var4[21] = "glStencilStrokePathNV";
         var4[22] = "glStencilFillPathInstancedNV";
         var4[23] = "glStencilStrokePathInstancedNV";
         var4[24] = "glPathCoverDepthFuncNV";
         var4[25] = "glCoverFillPathNV";
         var4[26] = "glCoverStrokePathNV";
         var4[27] = "glCoverFillPathInstancedNV";
         var4[28] = "glCoverStrokePathInstancedNV";
         var4[29] = "glGetPathParameterivNV";
         var4[30] = "glGetPathParameterfvNV";
         var4[31] = "glGetPathCommandsNV";
         var4[32] = "glGetPathCoordsNV";
         var4[33] = "glGetPathDashArrayNV";
         var4[34] = "glGetPathMetricsNV";
         var4[35] = "glGetPathMetricRangeNV";
         var4[36] = "glGetPathSpacingNV";
         var4[37] = "glIsPointInFillPathNV";
         var4[38] = "glIsPointInStrokePathNV";
         var4[39] = "glGetPathLengthNV";
         var4[40] = "glPointAlongPathNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_path_rendering");
      }
   }

   private static boolean check_NV_polygon_mode(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_polygon_mode")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 760;
         String[] var4;
         (var4 = new String[1])[0] = "glPolygonModeNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_polygon_mode");
      }
   }

   private static boolean check_NV_read_buffer(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_read_buffer")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 761;
         String[] var4;
         (var4 = new String[1])[0] = "glReadBufferNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_read_buffer");
      }
   }

   private static boolean check_NV_sample_locations(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_sample_locations")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 762;
         var10002[1] = 763;
         var10002[2] = 764;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glFramebufferSampleLocationsfvNV";
         var5[1] = "glNamedFramebufferSampleLocationsfvNV";
         var5[2] = "glResolveDepthValuesNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_sample_locations");
      }
   }

   private static boolean check_NV_scissor_exclusive(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_scissor_exclusive")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 765;
         var10002[1] = 766;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glScissorExclusiveArrayvNV";
         var5[1] = "glScissorExclusiveNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_scissor_exclusive");
      }
   }

   private static boolean check_NV_texture_array(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_texture_array")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 767;
         var10002[1] = 768;
         var10002[2] = 769;
         var10002[3] = 770;
         var10002[4] = 771;
         var10002[5] = 772;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glTexImage3DNV";
         var5[1] = "glTexSubImage3DNV";
         var5[2] = "glCopyTexSubImage3DNV";
         var5[3] = "glCompressedTexImage3DNV";
         var5[4] = "glCompressedTexSubImage3DNV";
         var5[5] = "glFramebufferTextureLayerNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_texture_array");
      }
   }

   private static boolean check_NV_texture_barrier(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_texture_barrier")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 773;
         String[] var4;
         (var4 = new String[1])[0] = "glTextureBarrierNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_texture_barrier");
      }
   }

   private static boolean check_NV_timeline_semaphore(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_timeline_semaphore")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 774;
         var10002[1] = 775;
         var10002[2] = 776;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glCreateSemaphoresNV";
         var5[1] = "glSemaphoreParameterivNV";
         var5[2] = "glGetSemaphoreParameterivNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_timeline_semaphore");
      }
   }

   private static boolean check_NV_viewport_array(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_viewport_array")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[12];
         var10002[0] = 777;
         var10002[1] = 778;
         var10002[2] = 779;
         var10002[3] = 780;
         var10002[4] = 781;
         var10002[5] = 782;
         var10002[6] = 783;
         var10002[7] = 784;
         var10002[8] = 785;
         var10002[9] = 786;
         var10002[10] = 787;
         var10002[11] = 788;
         String[] var4;
         String[] var5 = var4 = new String[12];
         var5[0] = "glViewportArrayvNV";
         var5[1] = "glViewportIndexedfNV";
         var5[2] = "glViewportIndexedfvNV";
         var5[3] = "glScissorArrayvNV";
         var5[4] = "glScissorIndexedNV";
         var5[5] = "glScissorIndexedvNV";
         var5[6] = "glDepthRangeArrayfvNV";
         var5[7] = "glDepthRangeIndexedfNV";
         var5[8] = "glGetFloati_vNV";
         var5[9] = "glEnableiNV";
         var5[10] = "glDisableiNV";
         var5[11] = "glIsEnablediNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_viewport_array");
      }
   }

   private static boolean check_NV_viewport_swizzle(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_viewport_swizzle")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 789;
         String[] var4;
         (var4 = new String[1])[0] = "glViewportSwizzleNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_NV_viewport_swizzle");
      }
   }

   private static boolean check_OES_copy_image(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_copy_image")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 790;
         String[] var4;
         (var4 = new String[1])[0] = "glCopyImageSubDataOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_copy_image");
      }
   }

   private static boolean check_OES_draw_buffers_indexed(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_draw_buffers_indexed")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[8];
         var10002[0] = 791;
         var10002[1] = 792;
         var10002[2] = 793;
         var10002[3] = 794;
         var10002[4] = 795;
         var10002[5] = 796;
         var10002[6] = 797;
         var10002[7] = 798;
         String[] var4;
         String[] var5 = var4 = new String[8];
         var5[0] = "glEnableiOES";
         var5[1] = "glDisableiOES";
         var5[2] = "glBlendEquationiOES";
         var5[3] = "glBlendEquationSeparateiOES";
         var5[4] = "glBlendFunciOES";
         var5[5] = "glBlendFuncSeparateiOES";
         var5[6] = "glColorMaskiOES";
         var5[7] = "glIsEnablediOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_draw_buffers_indexed");
      }
   }

   private static boolean check_OES_draw_elements_base_vertex(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_draw_elements_base_vertex")) {
         return false;
      } else {
         int var3;
         if (var2.contains("GLES30")) {
            var3 = 0;
         } else {
            var3 = Integer.MIN_VALUE;
         }

         int var6;
         if (var2.contains("EXT_multi_draw_arrays")) {
            var6 = 0;
         } else {
            var6 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var4;
         int[] var10002 = var4 = new int[4];
         var4[0] = 799;
         var4[1] = var3 + 800;
         var4[2] = var3 + 801;
         var10002[3] = var6 + 802;
         String[] var5;
         String[] var7 = var5 = new String[4];
         var7[0] = "glDrawElementsBaseVertexOES";
         var7[1] = "glDrawRangeElementsBaseVertexOES";
         var7[2] = "glDrawElementsInstancedBaseVertexOES";
         var7[3] = "glMultiDrawElementsBaseVertexOES";
         return Checks.checkFunctions(var10000, var10001, var4, var5) || Checks.reportMissing("GLES", "GL_OES_draw_elements_base_vertex");
      }
   }

   private static boolean check_OES_EGL_image(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_EGL_image")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 803;
         var10002[1] = 804;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glEGLImageTargetTexture2DOES";
         var5[1] = "glEGLImageTargetRenderbufferStorageOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_EGL_image");
      }
   }

   private static boolean check_OES_geometry_shader(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_geometry_shader")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 805;
         String[] var4;
         (var4 = new String[1])[0] = "glFramebufferTextureOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_geometry_shader");
      }
   }

   private static boolean check_OES_get_program_binary(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_get_program_binary")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 806;
         var10002[1] = 807;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glGetProgramBinaryOES";
         var5[1] = "glProgramBinaryOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_get_program_binary");
      }
   }

   private static boolean check_OES_mapbuffer(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_mapbuffer")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 808;
         var10002[1] = 809;
         var10002[2] = 810;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glMapBufferOES";
         var5[1] = "glUnmapBufferOES";
         var5[2] = "glGetBufferPointervOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_mapbuffer");
      }
   }

   private static boolean check_OES_primitive_bounding_box(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_primitive_bounding_box")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 811;
         String[] var4;
         (var4 = new String[1])[0] = "glPrimitiveBoundingBoxOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_primitive_bounding_box");
      }
   }

   private static boolean check_OES_sample_shading(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_sample_shading")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 812;
         String[] var4;
         (var4 = new String[1])[0] = "glMinSampleShadingOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_sample_shading");
      }
   }

   private static boolean check_OES_tessellation_shader(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_tessellation_shader")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 813;
         String[] var4;
         (var4 = new String[1])[0] = "glPatchParameteriOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_tessellation_shader");
      }
   }

   private static boolean check_OES_texture_3D(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_texture_3D")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 814;
         var10002[1] = 815;
         var10002[2] = 816;
         var10002[3] = 817;
         var10002[4] = 818;
         var10002[5] = 819;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glTexImage3DOES";
         var5[1] = "glTexSubImage3DOES";
         var5[2] = "glCopyTexSubImage3DOES";
         var5[3] = "glCompressedTexImage3DOES";
         var5[4] = "glCompressedTexSubImage3DOES";
         var5[5] = "glFramebufferTexture3DOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_texture_3D");
      }
   }

   private static boolean check_OES_texture_border_clamp(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_texture_border_clamp")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[8];
         var10002[0] = 820;
         var10002[1] = 821;
         var10002[2] = 822;
         var10002[3] = 823;
         var10002[4] = 824;
         var10002[5] = 825;
         var10002[6] = 826;
         var10002[7] = 827;
         String[] var4;
         String[] var5 = var4 = new String[8];
         var5[0] = "glTexParameterIivOES";
         var5[1] = "glTexParameterIuivOES";
         var5[2] = "glGetTexParameterIivOES";
         var5[3] = "glGetTexParameterIuivOES";
         var5[4] = "glSamplerParameterIivOES";
         var5[5] = "glSamplerParameterIuivOES";
         var5[6] = "glGetSamplerParameterIivOES";
         var5[7] = "glGetSamplerParameterIuivOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_texture_border_clamp");
      }
   }

   private static boolean check_OES_texture_buffer(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_texture_buffer")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 828;
         var10002[1] = 829;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glTexBufferOES";
         var5[1] = "glTexBufferRangeOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_texture_buffer");
      }
   }

   private static boolean check_OES_texture_storage_multisample_2d_array(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_texture_storage_multisample_2d_array")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 830;
         String[] var4;
         (var4 = new String[1])[0] = "glTexStorage3DMultisampleOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_texture_storage_multisample_2d_array");
      }
   }

   private static boolean check_OES_texture_view(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_texture_view")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 831;
         String[] var4;
         (var4 = new String[1])[0] = "glTextureViewOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_texture_view");
      }
   }

   private static boolean check_OES_vertex_array_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_vertex_array_object")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 832;
         var10002[1] = 833;
         var10002[2] = 834;
         var10002[3] = 835;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glBindVertexArrayOES";
         var5[1] = "glDeleteVertexArraysOES";
         var5[2] = "glGenVertexArraysOES";
         var5[3] = "glIsVertexArrayOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_vertex_array_object");
      }
   }

   private static boolean check_OES_viewport_array(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OES_viewport_array")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[12];
         var10002[0] = 836;
         var10002[1] = 837;
         var10002[2] = 838;
         var10002[3] = 839;
         var10002[4] = 840;
         var10002[5] = 841;
         var10002[6] = 842;
         var10002[7] = 843;
         var10002[8] = 844;
         var10002[9] = 791;
         var10002[10] = 792;
         var10002[11] = 798;
         String[] var4;
         String[] var5 = var4 = new String[12];
         var5[0] = "glViewportArrayvOES";
         var5[1] = "glViewportIndexedfOES";
         var5[2] = "glViewportIndexedfvOES";
         var5[3] = "glScissorArrayvOES";
         var5[4] = "glScissorIndexedOES";
         var5[5] = "glScissorIndexedvOES";
         var5[6] = "glDepthRangeArrayfvOES";
         var5[7] = "glDepthRangeIndexedfOES";
         var5[8] = "glGetFloati_vOES";
         var5[9] = "glEnableiOES";
         var5[10] = "glDisableiOES";
         var5[11] = "glIsEnablediOES";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OES_viewport_array");
      }
   }

   private static boolean check_OVR_multiview(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OVR_multiview")) {
         return false;
      } else {
         int var5;
         if (hasDSA(var2)) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var3[0] = 845;
         var10002[1] = var5 + 846;
         String[] var4;
         String[] var6 = var4 = new String[2];
         var6[0] = "glFramebufferTextureMultiviewOVR";
         var6[1] = "glNamedFramebufferTextureMultiviewOVR";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OVR_multiview");
      }
   }

   private static boolean check_OVR_multiview_multisampled_render_to_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_OVR_multiview_multisampled_render_to_texture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 847;
         String[] var4;
         (var4 = new String[1])[0] = "glFramebufferTextureMultisampleMultiviewOVR";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_OVR_multiview_multisampled_render_to_texture");
      }
   }

   private static boolean check_QCOM_alpha_test(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_QCOM_alpha_test")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 848;
         String[] var4;
         (var4 = new String[1])[0] = "glAlphaFuncQCOM";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_QCOM_alpha_test");
      }
   }

   private static boolean check_QCOM_driver_control(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_QCOM_driver_control")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 849;
         var10002[1] = 850;
         var10002[2] = 851;
         var10002[3] = 852;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glGetDriverControlsQCOM";
         var5[1] = "glGetDriverControlStringQCOM";
         var5[2] = "glEnableDriverControlQCOM";
         var5[3] = "glDisableDriverControlQCOM";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_QCOM_driver_control");
      }
   }

   private static boolean check_QCOM_extended_get(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_QCOM_extended_get")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[8];
         var10002[0] = 853;
         var10002[1] = 854;
         var10002[2] = 855;
         var10002[3] = 856;
         var10002[4] = 857;
         var10002[5] = 858;
         var10002[6] = 859;
         var10002[7] = 860;
         String[] var4;
         String[] var5 = var4 = new String[8];
         var5[0] = "glExtGetTexturesQCOM";
         var5[1] = "glExtGetBuffersQCOM";
         var5[2] = "glExtGetRenderbuffersQCOM";
         var5[3] = "glExtGetFramebuffersQCOM";
         var5[4] = "glExtGetTexLevelParameterivQCOM";
         var5[5] = "glExtTexObjectStateOverrideiQCOM";
         var5[6] = "glExtGetTexSubImageQCOM";
         var5[7] = "glExtGetBufferPointervQCOM";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_QCOM_extended_get");
      }
   }

   private static boolean check_QCOM_extended_get2(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_QCOM_extended_get2")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 861;
         var10002[1] = 862;
         var10002[2] = 863;
         var10002[3] = 864;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glExtGetShadersQCOM";
         var5[1] = "glExtGetProgramsQCOM";
         var5[2] = "glExtIsProgramBinaryQCOM";
         var5[3] = "glExtGetProgramBinarySourceQCOM";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_QCOM_extended_get2");
      }
   }

   private static boolean check_QCOM_frame_extrapolation(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_QCOM_frame_extrapolation")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 865;
         String[] var4;
         (var4 = new String[1])[0] = "glExtrapolateTex2DQCOM";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_QCOM_frame_extrapolation");
      }
   }

   private static boolean check_QCOM_framebuffer_foveated(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_QCOM_framebuffer_foveated")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 866;
         var10002[1] = 867;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glFramebufferFoveationConfigQCOM";
         var5[1] = "glFramebufferFoveationParametersQCOM";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_QCOM_framebuffer_foveated");
      }
   }

   private static boolean check_QCOM_motion_estimation(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_QCOM_motion_estimation")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 868;
         var10002[1] = 869;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glTexEstimateMotionQCOM";
         var5[1] = "glTexEstimateMotionRegionsQCOM";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_QCOM_motion_estimation");
      }
   }

   private static boolean check_QCOM_shader_framebuffer_fetch_noncoherent(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_QCOM_shader_framebuffer_fetch_noncoherent")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 870;
         String[] var4;
         (var4 = new String[1])[0] = "glFramebufferFetchBarrierQCOM";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_QCOM_shader_framebuffer_fetch_noncoherent");
      }
   }

   private static boolean check_QCOM_texture_foveated(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_QCOM_texture_foveated")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 871;
         String[] var4;
         (var4 = new String[1])[0] = "glTextureFoveationParametersQCOM";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_QCOM_texture_foveated");
      }
   }

   private static boolean check_QCOM_tiled_rendering(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_QCOM_tiled_rendering")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 872;
         var10002[1] = 873;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glStartTilingQCOM";
         var5[1] = "glEndTilingQCOM";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GLES", "GL_QCOM_tiled_rendering");
      }
   }

   private static boolean hasDSA(Set var0) {
      return var0.contains("GL_ARB_direct_state_access") || var0.contains("GL_EXT_direct_state_access");
   }

   public PointerBuffer getAddressBuffer() {
      return this.addresses;
   }
}
