package org.lwjgl.opengl;

import java.util.Set;
import java.util.function.IntFunction;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.ThreadLocalUtil;

public final class GLCapabilities {
   static final int ADDRESS_BUFFER_SIZE = 2228;
   public final long glEnable;
   public final long glDisable;
   public final long glAccum;
   public final long glAlphaFunc;
   public final long glAreTexturesResident;
   public final long glArrayElement;
   public final long glBegin;
   public final long glBindTexture;
   public final long glBitmap;
   public final long glBlendFunc;
   public final long glCallList;
   public final long glCallLists;
   public final long glClear;
   public final long glClearAccum;
   public final long glClearColor;
   public final long glClearDepth;
   public final long glClearIndex;
   public final long glClearStencil;
   public final long glClipPlane;
   public final long glColor3b;
   public final long glColor3s;
   public final long glColor3i;
   public final long glColor3f;
   public final long glColor3d;
   public final long glColor3ub;
   public final long glColor3us;
   public final long glColor3ui;
   public final long glColor3bv;
   public final long glColor3sv;
   public final long glColor3iv;
   public final long glColor3fv;
   public final long glColor3dv;
   public final long glColor3ubv;
   public final long glColor3usv;
   public final long glColor3uiv;
   public final long glColor4b;
   public final long glColor4s;
   public final long glColor4i;
   public final long glColor4f;
   public final long glColor4d;
   public final long glColor4ub;
   public final long glColor4us;
   public final long glColor4ui;
   public final long glColor4bv;
   public final long glColor4sv;
   public final long glColor4iv;
   public final long glColor4fv;
   public final long glColor4dv;
   public final long glColor4ubv;
   public final long glColor4usv;
   public final long glColor4uiv;
   public final long glColorMask;
   public final long glColorMaterial;
   public final long glColorPointer;
   public final long glCopyPixels;
   public final long glCullFace;
   public final long glDeleteLists;
   public final long glDepthFunc;
   public final long glDepthMask;
   public final long glDepthRange;
   public final long glDisableClientState;
   public final long glDrawArrays;
   public final long glDrawBuffer;
   public final long glDrawElements;
   public final long glDrawPixels;
   public final long glEdgeFlag;
   public final long glEdgeFlagv;
   public final long glEdgeFlagPointer;
   public final long glEnableClientState;
   public final long glEnd;
   public final long glEvalCoord1f;
   public final long glEvalCoord1fv;
   public final long glEvalCoord1d;
   public final long glEvalCoord1dv;
   public final long glEvalCoord2f;
   public final long glEvalCoord2fv;
   public final long glEvalCoord2d;
   public final long glEvalCoord2dv;
   public final long glEvalMesh1;
   public final long glEvalMesh2;
   public final long glEvalPoint1;
   public final long glEvalPoint2;
   public final long glFeedbackBuffer;
   public final long glFinish;
   public final long glFlush;
   public final long glFogi;
   public final long glFogiv;
   public final long glFogf;
   public final long glFogfv;
   public final long glFrontFace;
   public final long glGenLists;
   public final long glGenTextures;
   public final long glDeleteTextures;
   public final long glGetClipPlane;
   public final long glGetBooleanv;
   public final long glGetFloatv;
   public final long glGetIntegerv;
   public final long glGetDoublev;
   public final long glGetError;
   public final long glGetLightiv;
   public final long glGetLightfv;
   public final long glGetMapiv;
   public final long glGetMapfv;
   public final long glGetMapdv;
   public final long glGetMaterialiv;
   public final long glGetMaterialfv;
   public final long glGetPixelMapfv;
   public final long glGetPixelMapusv;
   public final long glGetPixelMapuiv;
   public final long glGetPointerv;
   public final long glGetPolygonStipple;
   public final long glGetString;
   public final long glGetTexEnviv;
   public final long glGetTexEnvfv;
   public final long glGetTexGeniv;
   public final long glGetTexGenfv;
   public final long glGetTexGendv;
   public final long glGetTexImage;
   public final long glGetTexLevelParameteriv;
   public final long glGetTexLevelParameterfv;
   public final long glGetTexParameteriv;
   public final long glGetTexParameterfv;
   public final long glHint;
   public final long glIndexi;
   public final long glIndexub;
   public final long glIndexs;
   public final long glIndexf;
   public final long glIndexd;
   public final long glIndexiv;
   public final long glIndexubv;
   public final long glIndexsv;
   public final long glIndexfv;
   public final long glIndexdv;
   public final long glIndexMask;
   public final long glIndexPointer;
   public final long glInitNames;
   public final long glInterleavedArrays;
   public final long glIsEnabled;
   public final long glIsList;
   public final long glIsTexture;
   public final long glLightModeli;
   public final long glLightModelf;
   public final long glLightModeliv;
   public final long glLightModelfv;
   public final long glLighti;
   public final long glLightf;
   public final long glLightiv;
   public final long glLightfv;
   public final long glLineStipple;
   public final long glLineWidth;
   public final long glListBase;
   public final long glLoadMatrixf;
   public final long glLoadMatrixd;
   public final long glLoadIdentity;
   public final long glLoadName;
   public final long glLogicOp;
   public final long glMap1f;
   public final long glMap1d;
   public final long glMap2f;
   public final long glMap2d;
   public final long glMapGrid1f;
   public final long glMapGrid1d;
   public final long glMapGrid2f;
   public final long glMapGrid2d;
   public final long glMateriali;
   public final long glMaterialf;
   public final long glMaterialiv;
   public final long glMaterialfv;
   public final long glMatrixMode;
   public final long glMultMatrixf;
   public final long glMultMatrixd;
   public final long glFrustum;
   public final long glNewList;
   public final long glEndList;
   public final long glNormal3f;
   public final long glNormal3b;
   public final long glNormal3s;
   public final long glNormal3i;
   public final long glNormal3d;
   public final long glNormal3fv;
   public final long glNormal3bv;
   public final long glNormal3sv;
   public final long glNormal3iv;
   public final long glNormal3dv;
   public final long glNormalPointer;
   public final long glOrtho;
   public final long glPassThrough;
   public final long glPixelMapfv;
   public final long glPixelMapusv;
   public final long glPixelMapuiv;
   public final long glPixelStorei;
   public final long glPixelStoref;
   public final long glPixelTransferi;
   public final long glPixelTransferf;
   public final long glPixelZoom;
   public final long glPointSize;
   public final long glPolygonMode;
   public final long glPolygonOffset;
   public final long glPolygonStipple;
   public final long glPushAttrib;
   public final long glPushClientAttrib;
   public final long glPopAttrib;
   public final long glPopClientAttrib;
   public final long glPopMatrix;
   public final long glPopName;
   public final long glPrioritizeTextures;
   public final long glPushMatrix;
   public final long glPushName;
   public final long glRasterPos2i;
   public final long glRasterPos2s;
   public final long glRasterPos2f;
   public final long glRasterPos2d;
   public final long glRasterPos2iv;
   public final long glRasterPos2sv;
   public final long glRasterPos2fv;
   public final long glRasterPos2dv;
   public final long glRasterPos3i;
   public final long glRasterPos3s;
   public final long glRasterPos3f;
   public final long glRasterPos3d;
   public final long glRasterPos3iv;
   public final long glRasterPos3sv;
   public final long glRasterPos3fv;
   public final long glRasterPos3dv;
   public final long glRasterPos4i;
   public final long glRasterPos4s;
   public final long glRasterPos4f;
   public final long glRasterPos4d;
   public final long glRasterPos4iv;
   public final long glRasterPos4sv;
   public final long glRasterPos4fv;
   public final long glRasterPos4dv;
   public final long glReadBuffer;
   public final long glReadPixels;
   public final long glRecti;
   public final long glRects;
   public final long glRectf;
   public final long glRectd;
   public final long glRectiv;
   public final long glRectsv;
   public final long glRectfv;
   public final long glRectdv;
   public final long glRenderMode;
   public final long glRotatef;
   public final long glRotated;
   public final long glScalef;
   public final long glScaled;
   public final long glScissor;
   public final long glSelectBuffer;
   public final long glShadeModel;
   public final long glStencilFunc;
   public final long glStencilMask;
   public final long glStencilOp;
   public final long glTexCoord1f;
   public final long glTexCoord1s;
   public final long glTexCoord1i;
   public final long glTexCoord1d;
   public final long glTexCoord1fv;
   public final long glTexCoord1sv;
   public final long glTexCoord1iv;
   public final long glTexCoord1dv;
   public final long glTexCoord2f;
   public final long glTexCoord2s;
   public final long glTexCoord2i;
   public final long glTexCoord2d;
   public final long glTexCoord2fv;
   public final long glTexCoord2sv;
   public final long glTexCoord2iv;
   public final long glTexCoord2dv;
   public final long glTexCoord3f;
   public final long glTexCoord3s;
   public final long glTexCoord3i;
   public final long glTexCoord3d;
   public final long glTexCoord3fv;
   public final long glTexCoord3sv;
   public final long glTexCoord3iv;
   public final long glTexCoord3dv;
   public final long glTexCoord4f;
   public final long glTexCoord4s;
   public final long glTexCoord4i;
   public final long glTexCoord4d;
   public final long glTexCoord4fv;
   public final long glTexCoord4sv;
   public final long glTexCoord4iv;
   public final long glTexCoord4dv;
   public final long glTexCoordPointer;
   public final long glTexEnvi;
   public final long glTexEnviv;
   public final long glTexEnvf;
   public final long glTexEnvfv;
   public final long glTexGeni;
   public final long glTexGeniv;
   public final long glTexGenf;
   public final long glTexGenfv;
   public final long glTexGend;
   public final long glTexGendv;
   public final long glTexImage1D;
   public final long glTexImage2D;
   public final long glCopyTexImage1D;
   public final long glCopyTexImage2D;
   public final long glCopyTexSubImage1D;
   public final long glCopyTexSubImage2D;
   public final long glTexParameteri;
   public final long glTexParameteriv;
   public final long glTexParameterf;
   public final long glTexParameterfv;
   public final long glTexSubImage1D;
   public final long glTexSubImage2D;
   public final long glTranslatef;
   public final long glTranslated;
   public final long glVertex2f;
   public final long glVertex2s;
   public final long glVertex2i;
   public final long glVertex2d;
   public final long glVertex2fv;
   public final long glVertex2sv;
   public final long glVertex2iv;
   public final long glVertex2dv;
   public final long glVertex3f;
   public final long glVertex3s;
   public final long glVertex3i;
   public final long glVertex3d;
   public final long glVertex3fv;
   public final long glVertex3sv;
   public final long glVertex3iv;
   public final long glVertex3dv;
   public final long glVertex4f;
   public final long glVertex4s;
   public final long glVertex4i;
   public final long glVertex4d;
   public final long glVertex4fv;
   public final long glVertex4sv;
   public final long glVertex4iv;
   public final long glVertex4dv;
   public final long glVertexPointer;
   public final long glViewport;
   public final long glTexImage3D;
   public final long glTexSubImage3D;
   public final long glCopyTexSubImage3D;
   public final long glDrawRangeElements;
   public final long glCompressedTexImage3D;
   public final long glCompressedTexImage2D;
   public final long glCompressedTexImage1D;
   public final long glCompressedTexSubImage3D;
   public final long glCompressedTexSubImage2D;
   public final long glCompressedTexSubImage1D;
   public final long glGetCompressedTexImage;
   public final long glSampleCoverage;
   public final long glActiveTexture;
   public final long glClientActiveTexture;
   public final long glMultiTexCoord1f;
   public final long glMultiTexCoord1s;
   public final long glMultiTexCoord1i;
   public final long glMultiTexCoord1d;
   public final long glMultiTexCoord1fv;
   public final long glMultiTexCoord1sv;
   public final long glMultiTexCoord1iv;
   public final long glMultiTexCoord1dv;
   public final long glMultiTexCoord2f;
   public final long glMultiTexCoord2s;
   public final long glMultiTexCoord2i;
   public final long glMultiTexCoord2d;
   public final long glMultiTexCoord2fv;
   public final long glMultiTexCoord2sv;
   public final long glMultiTexCoord2iv;
   public final long glMultiTexCoord2dv;
   public final long glMultiTexCoord3f;
   public final long glMultiTexCoord3s;
   public final long glMultiTexCoord3i;
   public final long glMultiTexCoord3d;
   public final long glMultiTexCoord3fv;
   public final long glMultiTexCoord3sv;
   public final long glMultiTexCoord3iv;
   public final long glMultiTexCoord3dv;
   public final long glMultiTexCoord4f;
   public final long glMultiTexCoord4s;
   public final long glMultiTexCoord4i;
   public final long glMultiTexCoord4d;
   public final long glMultiTexCoord4fv;
   public final long glMultiTexCoord4sv;
   public final long glMultiTexCoord4iv;
   public final long glMultiTexCoord4dv;
   public final long glLoadTransposeMatrixf;
   public final long glLoadTransposeMatrixd;
   public final long glMultTransposeMatrixf;
   public final long glMultTransposeMatrixd;
   public final long glBlendColor;
   public final long glBlendEquation;
   public final long glFogCoordf;
   public final long glFogCoordd;
   public final long glFogCoordfv;
   public final long glFogCoorddv;
   public final long glFogCoordPointer;
   public final long glMultiDrawArrays;
   public final long glMultiDrawElements;
   public final long glPointParameterf;
   public final long glPointParameteri;
   public final long glPointParameterfv;
   public final long glPointParameteriv;
   public final long glSecondaryColor3b;
   public final long glSecondaryColor3s;
   public final long glSecondaryColor3i;
   public final long glSecondaryColor3f;
   public final long glSecondaryColor3d;
   public final long glSecondaryColor3ub;
   public final long glSecondaryColor3us;
   public final long glSecondaryColor3ui;
   public final long glSecondaryColor3bv;
   public final long glSecondaryColor3sv;
   public final long glSecondaryColor3iv;
   public final long glSecondaryColor3fv;
   public final long glSecondaryColor3dv;
   public final long glSecondaryColor3ubv;
   public final long glSecondaryColor3usv;
   public final long glSecondaryColor3uiv;
   public final long glSecondaryColorPointer;
   public final long glBlendFuncSeparate;
   public final long glWindowPos2i;
   public final long glWindowPos2s;
   public final long glWindowPos2f;
   public final long glWindowPos2d;
   public final long glWindowPos2iv;
   public final long glWindowPos2sv;
   public final long glWindowPos2fv;
   public final long glWindowPos2dv;
   public final long glWindowPos3i;
   public final long glWindowPos3s;
   public final long glWindowPos3f;
   public final long glWindowPos3d;
   public final long glWindowPos3iv;
   public final long glWindowPos3sv;
   public final long glWindowPos3fv;
   public final long glWindowPos3dv;
   public final long glBindBuffer;
   public final long glDeleteBuffers;
   public final long glGenBuffers;
   public final long glIsBuffer;
   public final long glBufferData;
   public final long glBufferSubData;
   public final long glGetBufferSubData;
   public final long glMapBuffer;
   public final long glUnmapBuffer;
   public final long glGetBufferParameteriv;
   public final long glGetBufferPointerv;
   public final long glGenQueries;
   public final long glDeleteQueries;
   public final long glIsQuery;
   public final long glBeginQuery;
   public final long glEndQuery;
   public final long glGetQueryiv;
   public final long glGetQueryObjectiv;
   public final long glGetQueryObjectuiv;
   public final long glCreateProgram;
   public final long glDeleteProgram;
   public final long glIsProgram;
   public final long glCreateShader;
   public final long glDeleteShader;
   public final long glIsShader;
   public final long glAttachShader;
   public final long glDetachShader;
   public final long glShaderSource;
   public final long glCompileShader;
   public final long glLinkProgram;
   public final long glUseProgram;
   public final long glValidateProgram;
   public final long glUniform1f;
   public final long glUniform2f;
   public final long glUniform3f;
   public final long glUniform4f;
   public final long glUniform1i;
   public final long glUniform2i;
   public final long glUniform3i;
   public final long glUniform4i;
   public final long glUniform1fv;
   public final long glUniform2fv;
   public final long glUniform3fv;
   public final long glUniform4fv;
   public final long glUniform1iv;
   public final long glUniform2iv;
   public final long glUniform3iv;
   public final long glUniform4iv;
   public final long glUniformMatrix2fv;
   public final long glUniformMatrix3fv;
   public final long glUniformMatrix4fv;
   public final long glGetShaderiv;
   public final long glGetProgramiv;
   public final long glGetShaderInfoLog;
   public final long glGetProgramInfoLog;
   public final long glGetAttachedShaders;
   public final long glGetUniformLocation;
   public final long glGetActiveUniform;
   public final long glGetUniformfv;
   public final long glGetUniformiv;
   public final long glGetShaderSource;
   public final long glVertexAttrib1f;
   public final long glVertexAttrib1s;
   public final long glVertexAttrib1d;
   public final long glVertexAttrib2f;
   public final long glVertexAttrib2s;
   public final long glVertexAttrib2d;
   public final long glVertexAttrib3f;
   public final long glVertexAttrib3s;
   public final long glVertexAttrib3d;
   public final long glVertexAttrib4f;
   public final long glVertexAttrib4s;
   public final long glVertexAttrib4d;
   public final long glVertexAttrib4Nub;
   public final long glVertexAttrib1fv;
   public final long glVertexAttrib1sv;
   public final long glVertexAttrib1dv;
   public final long glVertexAttrib2fv;
   public final long glVertexAttrib2sv;
   public final long glVertexAttrib2dv;
   public final long glVertexAttrib3fv;
   public final long glVertexAttrib3sv;
   public final long glVertexAttrib3dv;
   public final long glVertexAttrib4fv;
   public final long glVertexAttrib4sv;
   public final long glVertexAttrib4dv;
   public final long glVertexAttrib4iv;
   public final long glVertexAttrib4bv;
   public final long glVertexAttrib4ubv;
   public final long glVertexAttrib4usv;
   public final long glVertexAttrib4uiv;
   public final long glVertexAttrib4Nbv;
   public final long glVertexAttrib4Nsv;
   public final long glVertexAttrib4Niv;
   public final long glVertexAttrib4Nubv;
   public final long glVertexAttrib4Nusv;
   public final long glVertexAttrib4Nuiv;
   public final long glVertexAttribPointer;
   public final long glEnableVertexAttribArray;
   public final long glDisableVertexAttribArray;
   public final long glBindAttribLocation;
   public final long glGetActiveAttrib;
   public final long glGetAttribLocation;
   public final long glGetVertexAttribiv;
   public final long glGetVertexAttribfv;
   public final long glGetVertexAttribdv;
   public final long glGetVertexAttribPointerv;
   public final long glDrawBuffers;
   public final long glBlendEquationSeparate;
   public final long glStencilOpSeparate;
   public final long glStencilFuncSeparate;
   public final long glStencilMaskSeparate;
   public final long glUniformMatrix2x3fv;
   public final long glUniformMatrix3x2fv;
   public final long glUniformMatrix2x4fv;
   public final long glUniformMatrix4x2fv;
   public final long glUniformMatrix3x4fv;
   public final long glUniformMatrix4x3fv;
   public final long glGetStringi;
   public final long glClearBufferiv;
   public final long glClearBufferuiv;
   public final long glClearBufferfv;
   public final long glClearBufferfi;
   public final long glVertexAttribI1i;
   public final long glVertexAttribI2i;
   public final long glVertexAttribI3i;
   public final long glVertexAttribI4i;
   public final long glVertexAttribI1ui;
   public final long glVertexAttribI2ui;
   public final long glVertexAttribI3ui;
   public final long glVertexAttribI4ui;
   public final long glVertexAttribI1iv;
   public final long glVertexAttribI2iv;
   public final long glVertexAttribI3iv;
   public final long glVertexAttribI4iv;
   public final long glVertexAttribI1uiv;
   public final long glVertexAttribI2uiv;
   public final long glVertexAttribI3uiv;
   public final long glVertexAttribI4uiv;
   public final long glVertexAttribI4bv;
   public final long glVertexAttribI4sv;
   public final long glVertexAttribI4ubv;
   public final long glVertexAttribI4usv;
   public final long glVertexAttribIPointer;
   public final long glGetVertexAttribIiv;
   public final long glGetVertexAttribIuiv;
   public final long glUniform1ui;
   public final long glUniform2ui;
   public final long glUniform3ui;
   public final long glUniform4ui;
   public final long glUniform1uiv;
   public final long glUniform2uiv;
   public final long glUniform3uiv;
   public final long glUniform4uiv;
   public final long glGetUniformuiv;
   public final long glBindFragDataLocation;
   public final long glGetFragDataLocation;
   public final long glBeginConditionalRender;
   public final long glEndConditionalRender;
   public final long glMapBufferRange;
   public final long glFlushMappedBufferRange;
   public final long glClampColor;
   public final long glIsRenderbuffer;
   public final long glBindRenderbuffer;
   public final long glDeleteRenderbuffers;
   public final long glGenRenderbuffers;
   public final long glRenderbufferStorage;
   public final long glRenderbufferStorageMultisample;
   public final long glGetRenderbufferParameteriv;
   public final long glIsFramebuffer;
   public final long glBindFramebuffer;
   public final long glDeleteFramebuffers;
   public final long glGenFramebuffers;
   public final long glCheckFramebufferStatus;
   public final long glFramebufferTexture1D;
   public final long glFramebufferTexture2D;
   public final long glFramebufferTexture3D;
   public final long glFramebufferTextureLayer;
   public final long glFramebufferRenderbuffer;
   public final long glGetFramebufferAttachmentParameteriv;
   public final long glBlitFramebuffer;
   public final long glGenerateMipmap;
   public final long glTexParameterIiv;
   public final long glTexParameterIuiv;
   public final long glGetTexParameterIiv;
   public final long glGetTexParameterIuiv;
   public final long glColorMaski;
   public final long glGetBooleani_v;
   public final long glGetIntegeri_v;
   public final long glEnablei;
   public final long glDisablei;
   public final long glIsEnabledi;
   public final long glBindBufferRange;
   public final long glBindBufferBase;
   public final long glBeginTransformFeedback;
   public final long glEndTransformFeedback;
   public final long glTransformFeedbackVaryings;
   public final long glGetTransformFeedbackVarying;
   public final long glBindVertexArray;
   public final long glDeleteVertexArrays;
   public final long glGenVertexArrays;
   public final long glIsVertexArray;
   public final long glDrawArraysInstanced;
   public final long glDrawElementsInstanced;
   public final long glCopyBufferSubData;
   public final long glPrimitiveRestartIndex;
   public final long glTexBuffer;
   public final long glGetUniformIndices;
   public final long glGetActiveUniformsiv;
   public final long glGetActiveUniformName;
   public final long glGetUniformBlockIndex;
   public final long glGetActiveUniformBlockiv;
   public final long glGetActiveUniformBlockName;
   public final long glUniformBlockBinding;
   public final long glGetBufferParameteri64v;
   public final long glDrawElementsBaseVertex;
   public final long glDrawRangeElementsBaseVertex;
   public final long glDrawElementsInstancedBaseVertex;
   public final long glMultiDrawElementsBaseVertex;
   public final long glProvokingVertex;
   public final long glTexImage2DMultisample;
   public final long glTexImage3DMultisample;
   public final long glGetMultisamplefv;
   public final long glSampleMaski;
   public final long glFramebufferTexture;
   public final long glFenceSync;
   public final long glIsSync;
   public final long glDeleteSync;
   public final long glClientWaitSync;
   public final long glWaitSync;
   public final long glGetInteger64v;
   public final long glGetInteger64i_v;
   public final long glGetSynciv;
   public final long glBindFragDataLocationIndexed;
   public final long glGetFragDataIndex;
   public final long glGenSamplers;
   public final long glDeleteSamplers;
   public final long glIsSampler;
   public final long glBindSampler;
   public final long glSamplerParameteri;
   public final long glSamplerParameterf;
   public final long glSamplerParameteriv;
   public final long glSamplerParameterfv;
   public final long glSamplerParameterIiv;
   public final long glSamplerParameterIuiv;
   public final long glGetSamplerParameteriv;
   public final long glGetSamplerParameterfv;
   public final long glGetSamplerParameterIiv;
   public final long glGetSamplerParameterIuiv;
   public final long glQueryCounter;
   public final long glGetQueryObjecti64v;
   public final long glGetQueryObjectui64v;
   public final long glVertexAttribDivisor;
   public final long glVertexP2ui;
   public final long glVertexP3ui;
   public final long glVertexP4ui;
   public final long glVertexP2uiv;
   public final long glVertexP3uiv;
   public final long glVertexP4uiv;
   public final long glTexCoordP1ui;
   public final long glTexCoordP2ui;
   public final long glTexCoordP3ui;
   public final long glTexCoordP4ui;
   public final long glTexCoordP1uiv;
   public final long glTexCoordP2uiv;
   public final long glTexCoordP3uiv;
   public final long glTexCoordP4uiv;
   public final long glMultiTexCoordP1ui;
   public final long glMultiTexCoordP2ui;
   public final long glMultiTexCoordP3ui;
   public final long glMultiTexCoordP4ui;
   public final long glMultiTexCoordP1uiv;
   public final long glMultiTexCoordP2uiv;
   public final long glMultiTexCoordP3uiv;
   public final long glMultiTexCoordP4uiv;
   public final long glNormalP3ui;
   public final long glNormalP3uiv;
   public final long glColorP3ui;
   public final long glColorP4ui;
   public final long glColorP3uiv;
   public final long glColorP4uiv;
   public final long glSecondaryColorP3ui;
   public final long glSecondaryColorP3uiv;
   public final long glVertexAttribP1ui;
   public final long glVertexAttribP2ui;
   public final long glVertexAttribP3ui;
   public final long glVertexAttribP4ui;
   public final long glVertexAttribP1uiv;
   public final long glVertexAttribP2uiv;
   public final long glVertexAttribP3uiv;
   public final long glVertexAttribP4uiv;
   public final long glBlendEquationi;
   public final long glBlendEquationSeparatei;
   public final long glBlendFunci;
   public final long glBlendFuncSeparatei;
   public final long glDrawArraysIndirect;
   public final long glDrawElementsIndirect;
   public final long glUniform1d;
   public final long glUniform2d;
   public final long glUniform3d;
   public final long glUniform4d;
   public final long glUniform1dv;
   public final long glUniform2dv;
   public final long glUniform3dv;
   public final long glUniform4dv;
   public final long glUniformMatrix2dv;
   public final long glUniformMatrix3dv;
   public final long glUniformMatrix4dv;
   public final long glUniformMatrix2x3dv;
   public final long glUniformMatrix2x4dv;
   public final long glUniformMatrix3x2dv;
   public final long glUniformMatrix3x4dv;
   public final long glUniformMatrix4x2dv;
   public final long glUniformMatrix4x3dv;
   public final long glGetUniformdv;
   public final long glMinSampleShading;
   public final long glGetSubroutineUniformLocation;
   public final long glGetSubroutineIndex;
   public final long glGetActiveSubroutineUniformiv;
   public final long glGetActiveSubroutineUniformName;
   public final long glGetActiveSubroutineName;
   public final long glUniformSubroutinesuiv;
   public final long glGetUniformSubroutineuiv;
   public final long glGetProgramStageiv;
   public final long glPatchParameteri;
   public final long glPatchParameterfv;
   public final long glBindTransformFeedback;
   public final long glDeleteTransformFeedbacks;
   public final long glGenTransformFeedbacks;
   public final long glIsTransformFeedback;
   public final long glPauseTransformFeedback;
   public final long glResumeTransformFeedback;
   public final long glDrawTransformFeedback;
   public final long glDrawTransformFeedbackStream;
   public final long glBeginQueryIndexed;
   public final long glEndQueryIndexed;
   public final long glGetQueryIndexediv;
   public final long glReleaseShaderCompiler;
   public final long glShaderBinary;
   public final long glGetShaderPrecisionFormat;
   public final long glDepthRangef;
   public final long glClearDepthf;
   public final long glGetProgramBinary;
   public final long glProgramBinary;
   public final long glProgramParameteri;
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
   public final long glProgramUniform1d;
   public final long glProgramUniform2d;
   public final long glProgramUniform3d;
   public final long glProgramUniform4d;
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
   public final long glProgramUniform1dv;
   public final long glProgramUniform2dv;
   public final long glProgramUniform3dv;
   public final long glProgramUniform4dv;
   public final long glProgramUniformMatrix2fv;
   public final long glProgramUniformMatrix3fv;
   public final long glProgramUniformMatrix4fv;
   public final long glProgramUniformMatrix2dv;
   public final long glProgramUniformMatrix3dv;
   public final long glProgramUniformMatrix4dv;
   public final long glProgramUniformMatrix2x3fv;
   public final long glProgramUniformMatrix3x2fv;
   public final long glProgramUniformMatrix2x4fv;
   public final long glProgramUniformMatrix4x2fv;
   public final long glProgramUniformMatrix3x4fv;
   public final long glProgramUniformMatrix4x3fv;
   public final long glProgramUniformMatrix2x3dv;
   public final long glProgramUniformMatrix3x2dv;
   public final long glProgramUniformMatrix2x4dv;
   public final long glProgramUniformMatrix4x2dv;
   public final long glProgramUniformMatrix3x4dv;
   public final long glProgramUniformMatrix4x3dv;
   public final long glValidateProgramPipeline;
   public final long glGetProgramPipelineInfoLog;
   public final long glVertexAttribL1d;
   public final long glVertexAttribL2d;
   public final long glVertexAttribL3d;
   public final long glVertexAttribL4d;
   public final long glVertexAttribL1dv;
   public final long glVertexAttribL2dv;
   public final long glVertexAttribL3dv;
   public final long glVertexAttribL4dv;
   public final long glVertexAttribLPointer;
   public final long glGetVertexAttribLdv;
   public final long glViewportArrayv;
   public final long glViewportIndexedf;
   public final long glViewportIndexedfv;
   public final long glScissorArrayv;
   public final long glScissorIndexed;
   public final long glScissorIndexedv;
   public final long glDepthRangeArrayv;
   public final long glDepthRangeIndexed;
   public final long glGetFloati_v;
   public final long glGetDoublei_v;
   public final long glGetActiveAtomicCounterBufferiv;
   public final long glTexStorage1D;
   public final long glTexStorage2D;
   public final long glTexStorage3D;
   public final long glDrawTransformFeedbackInstanced;
   public final long glDrawTransformFeedbackStreamInstanced;
   public final long glDrawArraysInstancedBaseInstance;
   public final long glDrawElementsInstancedBaseInstance;
   public final long glDrawElementsInstancedBaseVertexBaseInstance;
   public final long glBindImageTexture;
   public final long glMemoryBarrier;
   public final long glGetInternalformativ;
   public final long glClearBufferData;
   public final long glClearBufferSubData;
   public final long glDispatchCompute;
   public final long glDispatchComputeIndirect;
   public final long glCopyImageSubData;
   public final long glDebugMessageControl;
   public final long glDebugMessageInsert;
   public final long glDebugMessageCallback;
   public final long glGetDebugMessageLog;
   public final long glPushDebugGroup;
   public final long glPopDebugGroup;
   public final long glObjectLabel;
   public final long glGetObjectLabel;
   public final long glObjectPtrLabel;
   public final long glGetObjectPtrLabel;
   public final long glFramebufferParameteri;
   public final long glGetFramebufferParameteriv;
   public final long glGetInternalformati64v;
   public final long glInvalidateTexSubImage;
   public final long glInvalidateTexImage;
   public final long glInvalidateBufferSubData;
   public final long glInvalidateBufferData;
   public final long glInvalidateFramebuffer;
   public final long glInvalidateSubFramebuffer;
   public final long glMultiDrawArraysIndirect;
   public final long glMultiDrawElementsIndirect;
   public final long glGetProgramInterfaceiv;
   public final long glGetProgramResourceIndex;
   public final long glGetProgramResourceName;
   public final long glGetProgramResourceiv;
   public final long glGetProgramResourceLocation;
   public final long glGetProgramResourceLocationIndex;
   public final long glShaderStorageBlockBinding;
   public final long glTexBufferRange;
   public final long glTexStorage2DMultisample;
   public final long glTexStorage3DMultisample;
   public final long glTextureView;
   public final long glBindVertexBuffer;
   public final long glVertexAttribFormat;
   public final long glVertexAttribIFormat;
   public final long glVertexAttribLFormat;
   public final long glVertexAttribBinding;
   public final long glVertexBindingDivisor;
   public final long glBufferStorage;
   public final long glClearTexSubImage;
   public final long glClearTexImage;
   public final long glBindBuffersBase;
   public final long glBindBuffersRange;
   public final long glBindTextures;
   public final long glBindSamplers;
   public final long glBindImageTextures;
   public final long glBindVertexBuffers;
   public final long glClipControl;
   public final long glCreateTransformFeedbacks;
   public final long glTransformFeedbackBufferBase;
   public final long glTransformFeedbackBufferRange;
   public final long glGetTransformFeedbackiv;
   public final long glGetTransformFeedbacki_v;
   public final long glGetTransformFeedbacki64_v;
   public final long glCreateBuffers;
   public final long glNamedBufferStorage;
   public final long glNamedBufferData;
   public final long glNamedBufferSubData;
   public final long glCopyNamedBufferSubData;
   public final long glClearNamedBufferData;
   public final long glClearNamedBufferSubData;
   public final long glMapNamedBuffer;
   public final long glMapNamedBufferRange;
   public final long glUnmapNamedBuffer;
   public final long glFlushMappedNamedBufferRange;
   public final long glGetNamedBufferParameteriv;
   public final long glGetNamedBufferParameteri64v;
   public final long glGetNamedBufferPointerv;
   public final long glGetNamedBufferSubData;
   public final long glCreateFramebuffers;
   public final long glNamedFramebufferRenderbuffer;
   public final long glNamedFramebufferParameteri;
   public final long glNamedFramebufferTexture;
   public final long glNamedFramebufferTextureLayer;
   public final long glNamedFramebufferDrawBuffer;
   public final long glNamedFramebufferDrawBuffers;
   public final long glNamedFramebufferReadBuffer;
   public final long glInvalidateNamedFramebufferData;
   public final long glInvalidateNamedFramebufferSubData;
   public final long glClearNamedFramebufferiv;
   public final long glClearNamedFramebufferuiv;
   public final long glClearNamedFramebufferfv;
   public final long glClearNamedFramebufferfi;
   public final long glBlitNamedFramebuffer;
   public final long glCheckNamedFramebufferStatus;
   public final long glGetNamedFramebufferParameteriv;
   public final long glGetNamedFramebufferAttachmentParameteriv;
   public final long glCreateRenderbuffers;
   public final long glNamedRenderbufferStorage;
   public final long glNamedRenderbufferStorageMultisample;
   public final long glGetNamedRenderbufferParameteriv;
   public final long glCreateTextures;
   public final long glTextureBuffer;
   public final long glTextureBufferRange;
   public final long glTextureStorage1D;
   public final long glTextureStorage2D;
   public final long glTextureStorage3D;
   public final long glTextureStorage2DMultisample;
   public final long glTextureStorage3DMultisample;
   public final long glTextureSubImage1D;
   public final long glTextureSubImage2D;
   public final long glTextureSubImage3D;
   public final long glCompressedTextureSubImage1D;
   public final long glCompressedTextureSubImage2D;
   public final long glCompressedTextureSubImage3D;
   public final long glCopyTextureSubImage1D;
   public final long glCopyTextureSubImage2D;
   public final long glCopyTextureSubImage3D;
   public final long glTextureParameterf;
   public final long glTextureParameterfv;
   public final long glTextureParameteri;
   public final long glTextureParameterIiv;
   public final long glTextureParameterIuiv;
   public final long glTextureParameteriv;
   public final long glGenerateTextureMipmap;
   public final long glBindTextureUnit;
   public final long glGetTextureImage;
   public final long glGetCompressedTextureImage;
   public final long glGetTextureLevelParameterfv;
   public final long glGetTextureLevelParameteriv;
   public final long glGetTextureParameterfv;
   public final long glGetTextureParameterIiv;
   public final long glGetTextureParameterIuiv;
   public final long glGetTextureParameteriv;
   public final long glCreateVertexArrays;
   public final long glDisableVertexArrayAttrib;
   public final long glEnableVertexArrayAttrib;
   public final long glVertexArrayElementBuffer;
   public final long glVertexArrayVertexBuffer;
   public final long glVertexArrayVertexBuffers;
   public final long glVertexArrayAttribFormat;
   public final long glVertexArrayAttribIFormat;
   public final long glVertexArrayAttribLFormat;
   public final long glVertexArrayAttribBinding;
   public final long glVertexArrayBindingDivisor;
   public final long glGetVertexArrayiv;
   public final long glGetVertexArrayIndexediv;
   public final long glGetVertexArrayIndexed64iv;
   public final long glCreateSamplers;
   public final long glCreateProgramPipelines;
   public final long glCreateQueries;
   public final long glGetQueryBufferObjectiv;
   public final long glGetQueryBufferObjectuiv;
   public final long glGetQueryBufferObjecti64v;
   public final long glGetQueryBufferObjectui64v;
   public final long glMemoryBarrierByRegion;
   public final long glGetTextureSubImage;
   public final long glGetCompressedTextureSubImage;
   public final long glTextureBarrier;
   public final long glGetGraphicsResetStatus;
   public final long glGetnMapdv;
   public final long glGetnMapfv;
   public final long glGetnMapiv;
   public final long glGetnPixelMapfv;
   public final long glGetnPixelMapuiv;
   public final long glGetnPixelMapusv;
   public final long glGetnPolygonStipple;
   public final long glGetnTexImage;
   public final long glReadnPixels;
   public final long glGetnColorTable;
   public final long glGetnConvolutionFilter;
   public final long glGetnSeparableFilter;
   public final long glGetnHistogram;
   public final long glGetnMinmax;
   public final long glGetnCompressedTexImage;
   public final long glGetnUniformfv;
   public final long glGetnUniformdv;
   public final long glGetnUniformiv;
   public final long glGetnUniformuiv;
   public final long glMultiDrawArraysIndirectCount;
   public final long glMultiDrawElementsIndirectCount;
   public final long glPolygonOffsetClamp;
   public final long glSpecializeShader;
   public final long glDebugMessageEnableAMD;
   public final long glDebugMessageInsertAMD;
   public final long glDebugMessageCallbackAMD;
   public final long glGetDebugMessageLogAMD;
   public final long glBlendFuncIndexedAMD;
   public final long glBlendFuncSeparateIndexedAMD;
   public final long glBlendEquationIndexedAMD;
   public final long glBlendEquationSeparateIndexedAMD;
   public final long glRenderbufferStorageMultisampleAdvancedAMD;
   public final long glNamedRenderbufferStorageMultisampleAdvancedAMD;
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
   public final long glVertexAttribParameteriAMD;
   public final long glQueryObjectParameteruiAMD;
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
   public final long glSetMultisamplefvAMD;
   public final long glTexStorageSparseAMD;
   public final long glTextureStorageSparseAMD;
   public final long glStencilOpValueAMD;
   public final long glTessellationFactorAMD;
   public final long glTessellationModeAMD;
   public final long glGetTextureHandleARB;
   public final long glGetTextureSamplerHandleARB;
   public final long glMakeTextureHandleResidentARB;
   public final long glMakeTextureHandleNonResidentARB;
   public final long glGetImageHandleARB;
   public final long glMakeImageHandleResidentARB;
   public final long glMakeImageHandleNonResidentARB;
   public final long glUniformHandleui64ARB;
   public final long glUniformHandleui64vARB;
   public final long glProgramUniformHandleui64ARB;
   public final long glProgramUniformHandleui64vARB;
   public final long glIsTextureHandleResidentARB;
   public final long glIsImageHandleResidentARB;
   public final long glVertexAttribL1ui64ARB;
   public final long glVertexAttribL1ui64vARB;
   public final long glGetVertexAttribLui64vARB;
   public final long glNamedBufferStorageEXT;
   public final long glCreateSyncFromCLeventARB;
   public final long glClearNamedBufferDataEXT;
   public final long glClearNamedBufferSubDataEXT;
   public final long glClampColorARB;
   public final long glDispatchComputeGroupSizeARB;
   public final long glDebugMessageControlARB;
   public final long glDebugMessageInsertARB;
   public final long glDebugMessageCallbackARB;
   public final long glGetDebugMessageLogARB;
   public final long glDrawBuffersARB;
   public final long glBlendEquationiARB;
   public final long glBlendEquationSeparateiARB;
   public final long glBlendFunciARB;
   public final long glBlendFuncSeparateiARB;
   public final long glDrawArraysInstancedARB;
   public final long glDrawElementsInstancedARB;
   public final long glPrimitiveBoundingBoxARB;
   public final long glNamedFramebufferParameteriEXT;
   public final long glGetNamedFramebufferParameterivEXT;
   public final long glProgramParameteriARB;
   public final long glFramebufferTextureARB;
   public final long glFramebufferTextureLayerARB;
   public final long glFramebufferTextureFaceARB;
   public final long glSpecializeShaderARB;
   public final long glProgramUniform1dEXT;
   public final long glProgramUniform2dEXT;
   public final long glProgramUniform3dEXT;
   public final long glProgramUniform4dEXT;
   public final long glProgramUniform1dvEXT;
   public final long glProgramUniform2dvEXT;
   public final long glProgramUniform3dvEXT;
   public final long glProgramUniform4dvEXT;
   public final long glProgramUniformMatrix2dvEXT;
   public final long glProgramUniformMatrix3dvEXT;
   public final long glProgramUniformMatrix4dvEXT;
   public final long glProgramUniformMatrix2x3dvEXT;
   public final long glProgramUniformMatrix2x4dvEXT;
   public final long glProgramUniformMatrix3x2dvEXT;
   public final long glProgramUniformMatrix3x4dvEXT;
   public final long glProgramUniformMatrix4x2dvEXT;
   public final long glProgramUniformMatrix4x3dvEXT;
   public final long glUniform1i64ARB;
   public final long glUniform1i64vARB;
   public final long glProgramUniform1i64ARB;
   public final long glProgramUniform1i64vARB;
   public final long glUniform2i64ARB;
   public final long glUniform2i64vARB;
   public final long glProgramUniform2i64ARB;
   public final long glProgramUniform2i64vARB;
   public final long glUniform3i64ARB;
   public final long glUniform3i64vARB;
   public final long glProgramUniform3i64ARB;
   public final long glProgramUniform3i64vARB;
   public final long glUniform4i64ARB;
   public final long glUniform4i64vARB;
   public final long glProgramUniform4i64ARB;
   public final long glProgramUniform4i64vARB;
   public final long glUniform1ui64ARB;
   public final long glUniform1ui64vARB;
   public final long glProgramUniform1ui64ARB;
   public final long glProgramUniform1ui64vARB;
   public final long glUniform2ui64ARB;
   public final long glUniform2ui64vARB;
   public final long glProgramUniform2ui64ARB;
   public final long glProgramUniform2ui64vARB;
   public final long glUniform3ui64ARB;
   public final long glUniform3ui64vARB;
   public final long glProgramUniform3ui64ARB;
   public final long glProgramUniform3ui64vARB;
   public final long glUniform4ui64ARB;
   public final long glUniform4ui64vARB;
   public final long glProgramUniform4ui64ARB;
   public final long glProgramUniform4ui64vARB;
   public final long glGetUniformi64vARB;
   public final long glGetUniformui64vARB;
   public final long glGetnUniformi64vARB;
   public final long glGetnUniformui64vARB;
   public final long glColorTable;
   public final long glCopyColorTable;
   public final long glColorTableParameteriv;
   public final long glColorTableParameterfv;
   public final long glGetColorTable;
   public final long glGetColorTableParameteriv;
   public final long glGetColorTableParameterfv;
   public final long glColorSubTable;
   public final long glCopyColorSubTable;
   public final long glConvolutionFilter1D;
   public final long glConvolutionFilter2D;
   public final long glCopyConvolutionFilter1D;
   public final long glCopyConvolutionFilter2D;
   public final long glGetConvolutionFilter;
   public final long glSeparableFilter2D;
   public final long glGetSeparableFilter;
   public final long glConvolutionParameteri;
   public final long glConvolutionParameteriv;
   public final long glConvolutionParameterf;
   public final long glConvolutionParameterfv;
   public final long glGetConvolutionParameteriv;
   public final long glGetConvolutionParameterfv;
   public final long glHistogram;
   public final long glResetHistogram;
   public final long glGetHistogram;
   public final long glGetHistogramParameteriv;
   public final long glGetHistogramParameterfv;
   public final long glMinmax;
   public final long glResetMinmax;
   public final long glGetMinmax;
   public final long glGetMinmaxParameteriv;
   public final long glGetMinmaxParameterfv;
   public final long glMultiDrawArraysIndirectCountARB;
   public final long glMultiDrawElementsIndirectCountARB;
   public final long glVertexAttribDivisorARB;
   public final long glVertexArrayVertexAttribDivisorEXT;
   public final long glCurrentPaletteMatrixARB;
   public final long glMatrixIndexuivARB;
   public final long glMatrixIndexubvARB;
   public final long glMatrixIndexusvARB;
   public final long glMatrixIndexPointerARB;
   public final long glSampleCoverageARB;
   public final long glActiveTextureARB;
   public final long glClientActiveTextureARB;
   public final long glMultiTexCoord1fARB;
   public final long glMultiTexCoord1sARB;
   public final long glMultiTexCoord1iARB;
   public final long glMultiTexCoord1dARB;
   public final long glMultiTexCoord1fvARB;
   public final long glMultiTexCoord1svARB;
   public final long glMultiTexCoord1ivARB;
   public final long glMultiTexCoord1dvARB;
   public final long glMultiTexCoord2fARB;
   public final long glMultiTexCoord2sARB;
   public final long glMultiTexCoord2iARB;
   public final long glMultiTexCoord2dARB;
   public final long glMultiTexCoord2fvARB;
   public final long glMultiTexCoord2svARB;
   public final long glMultiTexCoord2ivARB;
   public final long glMultiTexCoord2dvARB;
   public final long glMultiTexCoord3fARB;
   public final long glMultiTexCoord3sARB;
   public final long glMultiTexCoord3iARB;
   public final long glMultiTexCoord3dARB;
   public final long glMultiTexCoord3fvARB;
   public final long glMultiTexCoord3svARB;
   public final long glMultiTexCoord3ivARB;
   public final long glMultiTexCoord3dvARB;
   public final long glMultiTexCoord4fARB;
   public final long glMultiTexCoord4sARB;
   public final long glMultiTexCoord4iARB;
   public final long glMultiTexCoord4dARB;
   public final long glMultiTexCoord4fvARB;
   public final long glMultiTexCoord4svARB;
   public final long glMultiTexCoord4ivARB;
   public final long glMultiTexCoord4dvARB;
   public final long glGenQueriesARB;
   public final long glDeleteQueriesARB;
   public final long glIsQueryARB;
   public final long glBeginQueryARB;
   public final long glEndQueryARB;
   public final long glGetQueryivARB;
   public final long glGetQueryObjectivARB;
   public final long glGetQueryObjectuivARB;
   public final long glMaxShaderCompilerThreadsARB;
   public final long glPointParameterfARB;
   public final long glPointParameterfvARB;
   public final long glGetGraphicsResetStatusARB;
   public final long glGetnMapdvARB;
   public final long glGetnMapfvARB;
   public final long glGetnMapivARB;
   public final long glGetnPixelMapfvARB;
   public final long glGetnPixelMapuivARB;
   public final long glGetnPixelMapusvARB;
   public final long glGetnPolygonStippleARB;
   public final long glGetnTexImageARB;
   public final long glReadnPixelsARB;
   public final long glGetnColorTableARB;
   public final long glGetnConvolutionFilterARB;
   public final long glGetnSeparableFilterARB;
   public final long glGetnHistogramARB;
   public final long glGetnMinmaxARB;
   public final long glGetnCompressedTexImageARB;
   public final long glGetnUniformfvARB;
   public final long glGetnUniformivARB;
   public final long glGetnUniformuivARB;
   public final long glGetnUniformdvARB;
   public final long glFramebufferSampleLocationsfvARB;
   public final long glNamedFramebufferSampleLocationsfvARB;
   public final long glEvaluateDepthValuesARB;
   public final long glMinSampleShadingARB;
   public final long glDeleteObjectARB;
   public final long glGetHandleARB;
   public final long glDetachObjectARB;
   public final long glCreateShaderObjectARB;
   public final long glShaderSourceARB;
   public final long glCompileShaderARB;
   public final long glCreateProgramObjectARB;
   public final long glAttachObjectARB;
   public final long glLinkProgramARB;
   public final long glUseProgramObjectARB;
   public final long glValidateProgramARB;
   public final long glUniform1fARB;
   public final long glUniform2fARB;
   public final long glUniform3fARB;
   public final long glUniform4fARB;
   public final long glUniform1iARB;
   public final long glUniform2iARB;
   public final long glUniform3iARB;
   public final long glUniform4iARB;
   public final long glUniform1fvARB;
   public final long glUniform2fvARB;
   public final long glUniform3fvARB;
   public final long glUniform4fvARB;
   public final long glUniform1ivARB;
   public final long glUniform2ivARB;
   public final long glUniform3ivARB;
   public final long glUniform4ivARB;
   public final long glUniformMatrix2fvARB;
   public final long glUniformMatrix3fvARB;
   public final long glUniformMatrix4fvARB;
   public final long glGetObjectParameterfvARB;
   public final long glGetObjectParameterivARB;
   public final long glGetInfoLogARB;
   public final long glGetAttachedObjectsARB;
   public final long glGetUniformLocationARB;
   public final long glGetActiveUniformARB;
   public final long glGetUniformfvARB;
   public final long glGetUniformivARB;
   public final long glGetShaderSourceARB;
   public final long glNamedStringARB;
   public final long glDeleteNamedStringARB;
   public final long glCompileShaderIncludeARB;
   public final long glIsNamedStringARB;
   public final long glGetNamedStringARB;
   public final long glGetNamedStringivARB;
   public final long glBufferPageCommitmentARB;
   public final long glNamedBufferPageCommitmentEXT;
   public final long glNamedBufferPageCommitmentARB;
   public final long glTexPageCommitmentARB;
   public final long glTexturePageCommitmentEXT;
   public final long glTexBufferARB;
   public final long glTextureBufferRangeEXT;
   public final long glCompressedTexImage3DARB;
   public final long glCompressedTexImage2DARB;
   public final long glCompressedTexImage1DARB;
   public final long glCompressedTexSubImage3DARB;
   public final long glCompressedTexSubImage2DARB;
   public final long glCompressedTexSubImage1DARB;
   public final long glGetCompressedTexImageARB;
   public final long glTextureStorage1DEXT;
   public final long glTextureStorage2DEXT;
   public final long glTextureStorage3DEXT;
   public final long glTextureStorage2DMultisampleEXT;
   public final long glTextureStorage3DMultisampleEXT;
   public final long glLoadTransposeMatrixfARB;
   public final long glLoadTransposeMatrixdARB;
   public final long glMultTransposeMatrixfARB;
   public final long glMultTransposeMatrixdARB;
   public final long glVertexArrayVertexAttribLOffsetEXT;
   public final long glVertexArrayBindVertexBufferEXT;
   public final long glVertexArrayVertexAttribFormatEXT;
   public final long glVertexArrayVertexAttribIFormatEXT;
   public final long glVertexArrayVertexAttribLFormatEXT;
   public final long glVertexArrayVertexAttribBindingEXT;
   public final long glVertexArrayVertexBindingDivisorEXT;
   public final long glWeightfvARB;
   public final long glWeightbvARB;
   public final long glWeightubvARB;
   public final long glWeightsvARB;
   public final long glWeightusvARB;
   public final long glWeightivARB;
   public final long glWeightuivARB;
   public final long glWeightdvARB;
   public final long glWeightPointerARB;
   public final long glVertexBlendARB;
   public final long glBindBufferARB;
   public final long glDeleteBuffersARB;
   public final long glGenBuffersARB;
   public final long glIsBufferARB;
   public final long glBufferDataARB;
   public final long glBufferSubDataARB;
   public final long glGetBufferSubDataARB;
   public final long glMapBufferARB;
   public final long glUnmapBufferARB;
   public final long glGetBufferParameterivARB;
   public final long glGetBufferPointervARB;
   public final long glVertexAttrib1sARB;
   public final long glVertexAttrib1fARB;
   public final long glVertexAttrib1dARB;
   public final long glVertexAttrib2sARB;
   public final long glVertexAttrib2fARB;
   public final long glVertexAttrib2dARB;
   public final long glVertexAttrib3sARB;
   public final long glVertexAttrib3fARB;
   public final long glVertexAttrib3dARB;
   public final long glVertexAttrib4sARB;
   public final long glVertexAttrib4fARB;
   public final long glVertexAttrib4dARB;
   public final long glVertexAttrib4NubARB;
   public final long glVertexAttrib1svARB;
   public final long glVertexAttrib1fvARB;
   public final long glVertexAttrib1dvARB;
   public final long glVertexAttrib2svARB;
   public final long glVertexAttrib2fvARB;
   public final long glVertexAttrib2dvARB;
   public final long glVertexAttrib3svARB;
   public final long glVertexAttrib3fvARB;
   public final long glVertexAttrib3dvARB;
   public final long glVertexAttrib4fvARB;
   public final long glVertexAttrib4bvARB;
   public final long glVertexAttrib4svARB;
   public final long glVertexAttrib4ivARB;
   public final long glVertexAttrib4ubvARB;
   public final long glVertexAttrib4usvARB;
   public final long glVertexAttrib4uivARB;
   public final long glVertexAttrib4dvARB;
   public final long glVertexAttrib4NbvARB;
   public final long glVertexAttrib4NsvARB;
   public final long glVertexAttrib4NivARB;
   public final long glVertexAttrib4NubvARB;
   public final long glVertexAttrib4NusvARB;
   public final long glVertexAttrib4NuivARB;
   public final long glVertexAttribPointerARB;
   public final long glEnableVertexAttribArrayARB;
   public final long glDisableVertexAttribArrayARB;
   public final long glProgramStringARB;
   public final long glBindProgramARB;
   public final long glDeleteProgramsARB;
   public final long glGenProgramsARB;
   public final long glProgramEnvParameter4dARB;
   public final long glProgramEnvParameter4dvARB;
   public final long glProgramEnvParameter4fARB;
   public final long glProgramEnvParameter4fvARB;
   public final long glProgramLocalParameter4dARB;
   public final long glProgramLocalParameter4dvARB;
   public final long glProgramLocalParameter4fARB;
   public final long glProgramLocalParameter4fvARB;
   public final long glGetProgramEnvParameterfvARB;
   public final long glGetProgramEnvParameterdvARB;
   public final long glGetProgramLocalParameterfvARB;
   public final long glGetProgramLocalParameterdvARB;
   public final long glGetProgramivARB;
   public final long glGetProgramStringARB;
   public final long glGetVertexAttribfvARB;
   public final long glGetVertexAttribdvARB;
   public final long glGetVertexAttribivARB;
   public final long glGetVertexAttribPointervARB;
   public final long glIsProgramARB;
   public final long glBindAttribLocationARB;
   public final long glGetActiveAttribARB;
   public final long glGetAttribLocationARB;
   public final long glWindowPos2iARB;
   public final long glWindowPos2sARB;
   public final long glWindowPos2fARB;
   public final long glWindowPos2dARB;
   public final long glWindowPos2ivARB;
   public final long glWindowPos2svARB;
   public final long glWindowPos2fvARB;
   public final long glWindowPos2dvARB;
   public final long glWindowPos3iARB;
   public final long glWindowPos3sARB;
   public final long glWindowPos3fARB;
   public final long glWindowPos3dARB;
   public final long glWindowPos3ivARB;
   public final long glWindowPos3svARB;
   public final long glWindowPos3fvARB;
   public final long glWindowPos3dvARB;
   public final long glUniformBufferEXT;
   public final long glGetUniformBufferSizeEXT;
   public final long glGetUniformOffsetEXT;
   public final long glBlendColorEXT;
   public final long glBlendEquationSeparateEXT;
   public final long glBlendFuncSeparateEXT;
   public final long glBlendEquationEXT;
   public final long glLockArraysEXT;
   public final long glUnlockArraysEXT;
   public final long glLabelObjectEXT;
   public final long glGetObjectLabelEXT;
   public final long glInsertEventMarkerEXT;
   public final long glPushGroupMarkerEXT;
   public final long glPopGroupMarkerEXT;
   public final long glDepthBoundsEXT;
   public final long glClientAttribDefaultEXT;
   public final long glPushClientAttribDefaultEXT;
   public final long glMatrixLoadfEXT;
   public final long glMatrixLoaddEXT;
   public final long glMatrixMultfEXT;
   public final long glMatrixMultdEXT;
   public final long glMatrixLoadIdentityEXT;
   public final long glMatrixRotatefEXT;
   public final long glMatrixRotatedEXT;
   public final long glMatrixScalefEXT;
   public final long glMatrixScaledEXT;
   public final long glMatrixTranslatefEXT;
   public final long glMatrixTranslatedEXT;
   public final long glMatrixOrthoEXT;
   public final long glMatrixFrustumEXT;
   public final long glMatrixPushEXT;
   public final long glMatrixPopEXT;
   public final long glTextureParameteriEXT;
   public final long glTextureParameterivEXT;
   public final long glTextureParameterfEXT;
   public final long glTextureParameterfvEXT;
   public final long glTextureImage1DEXT;
   public final long glTextureImage2DEXT;
   public final long glTextureSubImage1DEXT;
   public final long glTextureSubImage2DEXT;
   public final long glCopyTextureImage1DEXT;
   public final long glCopyTextureImage2DEXT;
   public final long glCopyTextureSubImage1DEXT;
   public final long glCopyTextureSubImage2DEXT;
   public final long glGetTextureImageEXT;
   public final long glGetTextureParameterfvEXT;
   public final long glGetTextureParameterivEXT;
   public final long glGetTextureLevelParameterfvEXT;
   public final long glGetTextureLevelParameterivEXT;
   public final long glTextureImage3DEXT;
   public final long glTextureSubImage3DEXT;
   public final long glCopyTextureSubImage3DEXT;
   public final long glBindMultiTextureEXT;
   public final long glMultiTexCoordPointerEXT;
   public final long glMultiTexEnvfEXT;
   public final long glMultiTexEnvfvEXT;
   public final long glMultiTexEnviEXT;
   public final long glMultiTexEnvivEXT;
   public final long glMultiTexGendEXT;
   public final long glMultiTexGendvEXT;
   public final long glMultiTexGenfEXT;
   public final long glMultiTexGenfvEXT;
   public final long glMultiTexGeniEXT;
   public final long glMultiTexGenivEXT;
   public final long glGetMultiTexEnvfvEXT;
   public final long glGetMultiTexEnvivEXT;
   public final long glGetMultiTexGendvEXT;
   public final long glGetMultiTexGenfvEXT;
   public final long glGetMultiTexGenivEXT;
   public final long glMultiTexParameteriEXT;
   public final long glMultiTexParameterivEXT;
   public final long glMultiTexParameterfEXT;
   public final long glMultiTexParameterfvEXT;
   public final long glMultiTexImage1DEXT;
   public final long glMultiTexImage2DEXT;
   public final long glMultiTexSubImage1DEXT;
   public final long glMultiTexSubImage2DEXT;
   public final long glCopyMultiTexImage1DEXT;
   public final long glCopyMultiTexImage2DEXT;
   public final long glCopyMultiTexSubImage1DEXT;
   public final long glCopyMultiTexSubImage2DEXT;
   public final long glGetMultiTexImageEXT;
   public final long glGetMultiTexParameterfvEXT;
   public final long glGetMultiTexParameterivEXT;
   public final long glGetMultiTexLevelParameterfvEXT;
   public final long glGetMultiTexLevelParameterivEXT;
   public final long glMultiTexImage3DEXT;
   public final long glMultiTexSubImage3DEXT;
   public final long glCopyMultiTexSubImage3DEXT;
   public final long glEnableClientStateIndexedEXT;
   public final long glDisableClientStateIndexedEXT;
   public final long glEnableClientStateiEXT;
   public final long glDisableClientStateiEXT;
   public final long glGetFloatIndexedvEXT;
   public final long glGetDoubleIndexedvEXT;
   public final long glGetPointerIndexedvEXT;
   public final long glGetFloati_vEXT;
   public final long glGetDoublei_vEXT;
   public final long glGetPointeri_vEXT;
   public final long glEnableIndexedEXT;
   public final long glDisableIndexedEXT;
   public final long glIsEnabledIndexedEXT;
   public final long glGetIntegerIndexedvEXT;
   public final long glGetBooleanIndexedvEXT;
   public final long glNamedProgramStringEXT;
   public final long glNamedProgramLocalParameter4dEXT;
   public final long glNamedProgramLocalParameter4dvEXT;
   public final long glNamedProgramLocalParameter4fEXT;
   public final long glNamedProgramLocalParameter4fvEXT;
   public final long glGetNamedProgramLocalParameterdvEXT;
   public final long glGetNamedProgramLocalParameterfvEXT;
   public final long glGetNamedProgramivEXT;
   public final long glGetNamedProgramStringEXT;
   public final long glCompressedTextureImage3DEXT;
   public final long glCompressedTextureImage2DEXT;
   public final long glCompressedTextureImage1DEXT;
   public final long glCompressedTextureSubImage3DEXT;
   public final long glCompressedTextureSubImage2DEXT;
   public final long glCompressedTextureSubImage1DEXT;
   public final long glGetCompressedTextureImageEXT;
   public final long glCompressedMultiTexImage3DEXT;
   public final long glCompressedMultiTexImage2DEXT;
   public final long glCompressedMultiTexImage1DEXT;
   public final long glCompressedMultiTexSubImage3DEXT;
   public final long glCompressedMultiTexSubImage2DEXT;
   public final long glCompressedMultiTexSubImage1DEXT;
   public final long glGetCompressedMultiTexImageEXT;
   public final long glMatrixLoadTransposefEXT;
   public final long glMatrixLoadTransposedEXT;
   public final long glMatrixMultTransposefEXT;
   public final long glMatrixMultTransposedEXT;
   public final long glNamedBufferDataEXT;
   public final long glNamedBufferSubDataEXT;
   public final long glMapNamedBufferEXT;
   public final long glUnmapNamedBufferEXT;
   public final long glGetNamedBufferParameterivEXT;
   public final long glGetNamedBufferSubDataEXT;
   public final long glProgramUniform1fEXT;
   public final long glProgramUniform2fEXT;
   public final long glProgramUniform3fEXT;
   public final long glProgramUniform4fEXT;
   public final long glProgramUniform1iEXT;
   public final long glProgramUniform2iEXT;
   public final long glProgramUniform3iEXT;
   public final long glProgramUniform4iEXT;
   public final long glProgramUniform1fvEXT;
   public final long glProgramUniform2fvEXT;
   public final long glProgramUniform3fvEXT;
   public final long glProgramUniform4fvEXT;
   public final long glProgramUniform1ivEXT;
   public final long glProgramUniform2ivEXT;
   public final long glProgramUniform3ivEXT;
   public final long glProgramUniform4ivEXT;
   public final long glProgramUniformMatrix2fvEXT;
   public final long glProgramUniformMatrix3fvEXT;
   public final long glProgramUniformMatrix4fvEXT;
   public final long glProgramUniformMatrix2x3fvEXT;
   public final long glProgramUniformMatrix3x2fvEXT;
   public final long glProgramUniformMatrix2x4fvEXT;
   public final long glProgramUniformMatrix4x2fvEXT;
   public final long glProgramUniformMatrix3x4fvEXT;
   public final long glProgramUniformMatrix4x3fvEXT;
   public final long glTextureBufferEXT;
   public final long glMultiTexBufferEXT;
   public final long glTextureParameterIivEXT;
   public final long glTextureParameterIuivEXT;
   public final long glGetTextureParameterIivEXT;
   public final long glGetTextureParameterIuivEXT;
   public final long glMultiTexParameterIivEXT;
   public final long glMultiTexParameterIuivEXT;
   public final long glGetMultiTexParameterIivEXT;
   public final long glGetMultiTexParameterIuivEXT;
   public final long glProgramUniform1uiEXT;
   public final long glProgramUniform2uiEXT;
   public final long glProgramUniform3uiEXT;
   public final long glProgramUniform4uiEXT;
   public final long glProgramUniform1uivEXT;
   public final long glProgramUniform2uivEXT;
   public final long glProgramUniform3uivEXT;
   public final long glProgramUniform4uivEXT;
   public final long glNamedProgramLocalParameters4fvEXT;
   public final long glNamedProgramLocalParameterI4iEXT;
   public final long glNamedProgramLocalParameterI4ivEXT;
   public final long glNamedProgramLocalParametersI4ivEXT;
   public final long glNamedProgramLocalParameterI4uiEXT;
   public final long glNamedProgramLocalParameterI4uivEXT;
   public final long glNamedProgramLocalParametersI4uivEXT;
   public final long glGetNamedProgramLocalParameterIivEXT;
   public final long glGetNamedProgramLocalParameterIuivEXT;
   public final long glNamedRenderbufferStorageEXT;
   public final long glGetNamedRenderbufferParameterivEXT;
   public final long glNamedRenderbufferStorageMultisampleEXT;
   public final long glNamedRenderbufferStorageMultisampleCoverageEXT;
   public final long glCheckNamedFramebufferStatusEXT;
   public final long glNamedFramebufferTexture1DEXT;
   public final long glNamedFramebufferTexture2DEXT;
   public final long glNamedFramebufferTexture3DEXT;
   public final long glNamedFramebufferRenderbufferEXT;
   public final long glGetNamedFramebufferAttachmentParameterivEXT;
   public final long glGenerateTextureMipmapEXT;
   public final long glGenerateMultiTexMipmapEXT;
   public final long glFramebufferDrawBufferEXT;
   public final long glFramebufferDrawBuffersEXT;
   public final long glFramebufferReadBufferEXT;
   public final long glGetFramebufferParameterivEXT;
   public final long glNamedCopyBufferSubDataEXT;
   public final long glNamedFramebufferTextureEXT;
   public final long glNamedFramebufferTextureLayerEXT;
   public final long glNamedFramebufferTextureFaceEXT;
   public final long glTextureRenderbufferEXT;
   public final long glMultiTexRenderbufferEXT;
   public final long glVertexArrayVertexOffsetEXT;
   public final long glVertexArrayColorOffsetEXT;
   public final long glVertexArrayEdgeFlagOffsetEXT;
   public final long glVertexArrayIndexOffsetEXT;
   public final long glVertexArrayNormalOffsetEXT;
   public final long glVertexArrayTexCoordOffsetEXT;
   public final long glVertexArrayMultiTexCoordOffsetEXT;
   public final long glVertexArrayFogCoordOffsetEXT;
   public final long glVertexArraySecondaryColorOffsetEXT;
   public final long glVertexArrayVertexAttribOffsetEXT;
   public final long glVertexArrayVertexAttribIOffsetEXT;
   public final long glEnableVertexArrayEXT;
   public final long glDisableVertexArrayEXT;
   public final long glEnableVertexArrayAttribEXT;
   public final long glDisableVertexArrayAttribEXT;
   public final long glGetVertexArrayIntegervEXT;
   public final long glGetVertexArrayPointervEXT;
   public final long glGetVertexArrayIntegeri_vEXT;
   public final long glGetVertexArrayPointeri_vEXT;
   public final long glMapNamedBufferRangeEXT;
   public final long glFlushMappedNamedBufferRangeEXT;
   public final long glColorMaskIndexedEXT;
   public final long glDrawArraysInstancedEXT;
   public final long glDrawElementsInstancedEXT;
   public final long glEGLImageTargetTexStorageEXT;
   public final long glEGLImageTargetTextureStorageEXT;
   public final long glBufferStorageExternalEXT;
   public final long glNamedBufferStorageExternalEXT;
   public final long glBlitFramebufferEXT;
   public final long glBlitFramebufferLayersEXT;
   public final long glBlitFramebufferLayerEXT;
   public final long glRenderbufferStorageMultisampleEXT;
   public final long glIsRenderbufferEXT;
   public final long glBindRenderbufferEXT;
   public final long glDeleteRenderbuffersEXT;
   public final long glGenRenderbuffersEXT;
   public final long glRenderbufferStorageEXT;
   public final long glGetRenderbufferParameterivEXT;
   public final long glIsFramebufferEXT;
   public final long glBindFramebufferEXT;
   public final long glDeleteFramebuffersEXT;
   public final long glGenFramebuffersEXT;
   public final long glCheckFramebufferStatusEXT;
   public final long glFramebufferTexture1DEXT;
   public final long glFramebufferTexture2DEXT;
   public final long glFramebufferTexture3DEXT;
   public final long glFramebufferRenderbufferEXT;
   public final long glGetFramebufferAttachmentParameterivEXT;
   public final long glGenerateMipmapEXT;
   public final long glProgramParameteriEXT;
   public final long glFramebufferTextureEXT;
   public final long glFramebufferTextureLayerEXT;
   public final long glFramebufferTextureFaceEXT;
   public final long glProgramEnvParameters4fvEXT;
   public final long glProgramLocalParameters4fvEXT;
   public final long glVertexAttribI1iEXT;
   public final long glVertexAttribI2iEXT;
   public final long glVertexAttribI3iEXT;
   public final long glVertexAttribI4iEXT;
   public final long glVertexAttribI1uiEXT;
   public final long glVertexAttribI2uiEXT;
   public final long glVertexAttribI3uiEXT;
   public final long glVertexAttribI4uiEXT;
   public final long glVertexAttribI1ivEXT;
   public final long glVertexAttribI2ivEXT;
   public final long glVertexAttribI3ivEXT;
   public final long glVertexAttribI4ivEXT;
   public final long glVertexAttribI1uivEXT;
   public final long glVertexAttribI2uivEXT;
   public final long glVertexAttribI3uivEXT;
   public final long glVertexAttribI4uivEXT;
   public final long glVertexAttribI4bvEXT;
   public final long glVertexAttribI4svEXT;
   public final long glVertexAttribI4ubvEXT;
   public final long glVertexAttribI4usvEXT;
   public final long glVertexAttribIPointerEXT;
   public final long glGetVertexAttribIivEXT;
   public final long glGetVertexAttribIuivEXT;
   public final long glGetUniformuivEXT;
   public final long glBindFragDataLocationEXT;
   public final long glGetFragDataLocationEXT;
   public final long glUniform1uiEXT;
   public final long glUniform2uiEXT;
   public final long glUniform3uiEXT;
   public final long glUniform4uiEXT;
   public final long glUniform1uivEXT;
   public final long glUniform2uivEXT;
   public final long glUniform3uivEXT;
   public final long glUniform4uivEXT;
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
   public final long glTexStorageMem1DEXT;
   public final long glTextureStorageMem1DEXT;
   public final long glImportMemoryFdEXT;
   public final long glImportMemoryWin32HandleEXT;
   public final long glImportMemoryWin32NameEXT;
   public final long glPointParameterfEXT;
   public final long glPointParameterfvEXT;
   public final long glPolygonOffsetClampEXT;
   public final long glProvokingVertexEXT;
   public final long glRasterSamplesEXT;
   public final long glSecondaryColor3bEXT;
   public final long glSecondaryColor3sEXT;
   public final long glSecondaryColor3iEXT;
   public final long glSecondaryColor3fEXT;
   public final long glSecondaryColor3dEXT;
   public final long glSecondaryColor3ubEXT;
   public final long glSecondaryColor3usEXT;
   public final long glSecondaryColor3uiEXT;
   public final long glSecondaryColor3bvEXT;
   public final long glSecondaryColor3svEXT;
   public final long glSecondaryColor3ivEXT;
   public final long glSecondaryColor3fvEXT;
   public final long glSecondaryColor3dvEXT;
   public final long glSecondaryColor3ubvEXT;
   public final long glSecondaryColor3usvEXT;
   public final long glSecondaryColor3uivEXT;
   public final long glSecondaryColorPointerEXT;
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
   public final long glUseShaderProgramEXT;
   public final long glActiveProgramEXT;
   public final long glCreateShaderProgramEXT;
   public final long glFramebufferFetchBarrierEXT;
   public final long glBindImageTextureEXT;
   public final long glMemoryBarrierEXT;
   public final long glStencilClearTagEXT;
   public final long glActiveStencilFaceEXT;
   public final long glTexBufferEXT;
   public final long glClearColorIiEXT;
   public final long glClearColorIuiEXT;
   public final long glTexParameterIivEXT;
   public final long glTexParameterIuivEXT;
   public final long glGetTexParameterIivEXT;
   public final long glGetTexParameterIuivEXT;
   public final long glTexStorage1DEXT;
   public final long glTexStorage2DEXT;
   public final long glTexStorage3DEXT;
   public final long glGetQueryObjecti64vEXT;
   public final long glGetQueryObjectui64vEXT;
   public final long glBindBufferRangeEXT;
   public final long glBindBufferOffsetEXT;
   public final long glBindBufferBaseEXT;
   public final long glBeginTransformFeedbackEXT;
   public final long glEndTransformFeedbackEXT;
   public final long glTransformFeedbackVaryingsEXT;
   public final long glGetTransformFeedbackVaryingEXT;
   public final long glVertexAttribL1dEXT;
   public final long glVertexAttribL2dEXT;
   public final long glVertexAttribL3dEXT;
   public final long glVertexAttribL4dEXT;
   public final long glVertexAttribL1dvEXT;
   public final long glVertexAttribL2dvEXT;
   public final long glVertexAttribL3dvEXT;
   public final long glVertexAttribL4dvEXT;
   public final long glVertexAttribLPointerEXT;
   public final long glGetVertexAttribLdvEXT;
   public final long glAcquireKeyedMutexWin32EXT;
   public final long glReleaseKeyedMutexWin32EXT;
   public final long glWindowRectanglesEXT;
   public final long glImportSyncEXT;
   public final long glFrameTerminatorGREMEDY;
   public final long glStringMarkerGREMEDY;
   public final long glApplyFramebufferAttachmentCMAAINTEL;
   public final long glSyncTextureINTEL;
   public final long glUnmapTexture2DINTEL;
   public final long glMapTexture2DINTEL;
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
   public final long glMaxShaderCompilerThreadsKHR;
   public final long glFramebufferParameteriMESA;
   public final long glGetFramebufferParameterivMESA;
   public final long glAlphaToCoverageDitherControlNV;
   public final long glMultiDrawArraysIndirectBindlessNV;
   public final long glMultiDrawElementsIndirectBindlessNV;
   public final long glMultiDrawArraysIndirectBindlessCountNV;
   public final long glMultiDrawElementsIndirectBindlessCountNV;
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
   public final long glCreateStatesNV;
   public final long glDeleteStatesNV;
   public final long glIsStateNV;
   public final long glStateCaptureNV;
   public final long glGetCommandHeaderNV;
   public final long glGetStageIndexNV;
   public final long glDrawCommandsNV;
   public final long glDrawCommandsAddressNV;
   public final long glDrawCommandsStatesNV;
   public final long glDrawCommandsStatesAddressNV;
   public final long glCreateCommandListsNV;
   public final long glDeleteCommandListsNV;
   public final long glIsCommandListNV;
   public final long glListDrawCommandsStatesClientNV;
   public final long glCommandListSegmentsNV;
   public final long glCompileCommandListNV;
   public final long glCallCommandListNV;
   public final long glBeginConditionalRenderNV;
   public final long glEndConditionalRenderNV;
   public final long glSubpixelPrecisionBiasNV;
   public final long glConservativeRasterParameterfNV;
   public final long glConservativeRasterParameteriNV;
   public final long glCopyImageSubDataNV;
   public final long glDepthRangedNV;
   public final long glClearDepthdNV;
   public final long glDepthBoundsdNV;
   public final long glDrawTextureNV;
   public final long glDrawVkImageNV;
   public final long glGetVkProcAddrNV;
   public final long glWaitVkSemaphoreNV;
   public final long glSignalVkSemaphoreNV;
   public final long glSignalVkFenceNV;
   public final long glGetMultisamplefvNV;
   public final long glSampleMaskIndexedNV;
   public final long glTexRenderbufferNV;
   public final long glDeleteFencesNV;
   public final long glGenFencesNV;
   public final long glIsFenceNV;
   public final long glTestFenceNV;
   public final long glGetFenceivNV;
   public final long glFinishFenceNV;
   public final long glSetFenceNV;
   public final long glFragmentCoverageColorNV;
   public final long glCoverageModulationTableNV;
   public final long glGetCoverageModulationTableNV;
   public final long glCoverageModulationNV;
   public final long glRenderbufferStorageMultisampleCoverageNV;
   public final long glRenderGpuMaskNV;
   public final long glMulticastBufferSubDataNV;
   public final long glMulticastCopyBufferSubDataNV;
   public final long glMulticastCopyImageSubDataNV;
   public final long glMulticastBlitFramebufferNV;
   public final long glMulticastFramebufferSampleLocationsfvNV;
   public final long glMulticastBarrierNV;
   public final long glMulticastWaitSyncNV;
   public final long glMulticastGetQueryObjectivNV;
   public final long glMulticastGetQueryObjectuivNV;
   public final long glMulticastGetQueryObjecti64vNV;
   public final long glMulticastGetQueryObjectui64vNV;
   public final long glVertex2hNV;
   public final long glVertex2hvNV;
   public final long glVertex3hNV;
   public final long glVertex3hvNV;
   public final long glVertex4hNV;
   public final long glVertex4hvNV;
   public final long glNormal3hNV;
   public final long glNormal3hvNV;
   public final long glColor3hNV;
   public final long glColor3hvNV;
   public final long glColor4hNV;
   public final long glColor4hvNV;
   public final long glTexCoord1hNV;
   public final long glTexCoord1hvNV;
   public final long glTexCoord2hNV;
   public final long glTexCoord2hvNV;
   public final long glTexCoord3hNV;
   public final long glTexCoord3hvNV;
   public final long glTexCoord4hNV;
   public final long glTexCoord4hvNV;
   public final long glMultiTexCoord1hNV;
   public final long glMultiTexCoord1hvNV;
   public final long glMultiTexCoord2hNV;
   public final long glMultiTexCoord2hvNV;
   public final long glMultiTexCoord3hNV;
   public final long glMultiTexCoord3hvNV;
   public final long glMultiTexCoord4hNV;
   public final long glMultiTexCoord4hvNV;
   public final long glFogCoordhNV;
   public final long glFogCoordhvNV;
   public final long glSecondaryColor3hNV;
   public final long glSecondaryColor3hvNV;
   public final long glVertexWeighthNV;
   public final long glVertexWeighthvNV;
   public final long glVertexAttrib1hNV;
   public final long glVertexAttrib1hvNV;
   public final long glVertexAttrib2hNV;
   public final long glVertexAttrib2hvNV;
   public final long glVertexAttrib3hNV;
   public final long glVertexAttrib3hvNV;
   public final long glVertexAttrib4hNV;
   public final long glVertexAttrib4hvNV;
   public final long glVertexAttribs1hvNV;
   public final long glVertexAttribs2hvNV;
   public final long glVertexAttribs3hvNV;
   public final long glVertexAttribs4hvNV;
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
   public final long glMultiDrawMeshTasksIndirectCountNV;
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
   public final long glPathColorGenNV;
   public final long glPathTexGenNV;
   public final long glPathFogGenNV;
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
   public final long glGetPathColorGenivNV;
   public final long glGetPathColorGenfvNV;
   public final long glGetPathTexGenivNV;
   public final long glGetPathTexGenfvNV;
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
   public final long glPixelDataRangeNV;
   public final long glFlushPixelDataRangeNV;
   public final long glPointParameteriNV;
   public final long glPointParameterivNV;
   public final long glPrimitiveRestartNV;
   public final long glPrimitiveRestartIndexNV;
   public final long glQueryResourceNV;
   public final long glGenQueryResourceTagNV;
   public final long glDeleteQueryResourceTagNV;
   public final long glQueryResourceTagNV;
   public final long glFramebufferSampleLocationsfvNV;
   public final long glNamedFramebufferSampleLocationsfvNV;
   public final long glResolveDepthValuesNV;
   public final long glScissorExclusiveArrayvNV;
   public final long glScissorExclusiveNV;
   public final long glMakeBufferResidentNV;
   public final long glMakeBufferNonResidentNV;
   public final long glIsBufferResidentNV;
   public final long glMakeNamedBufferResidentNV;
   public final long glMakeNamedBufferNonResidentNV;
   public final long glIsNamedBufferResidentNV;
   public final long glGetBufferParameterui64vNV;
   public final long glGetNamedBufferParameterui64vNV;
   public final long glGetIntegerui64vNV;
   public final long glUniformui64NV;
   public final long glUniformui64vNV;
   public final long glProgramUniformui64NV;
   public final long glProgramUniformui64vNV;
   public final long glBindShadingRateImageNV;
   public final long glShadingRateImagePaletteNV;
   public final long glGetShadingRateImagePaletteNV;
   public final long glShadingRateImageBarrierNV;
   public final long glShadingRateSampleOrderNV;
   public final long glShadingRateSampleOrderCustomNV;
   public final long glGetShadingRateSampleLocationivNV;
   public final long glTextureBarrierNV;
   public final long glTexImage2DMultisampleCoverageNV;
   public final long glTexImage3DMultisampleCoverageNV;
   public final long glTextureImage2DMultisampleNV;
   public final long glTextureImage3DMultisampleNV;
   public final long glTextureImage2DMultisampleCoverageNV;
   public final long glTextureImage3DMultisampleCoverageNV;
   public final long glCreateSemaphoresNV;
   public final long glSemaphoreParameterivNV;
   public final long glGetSemaphoreParameterivNV;
   public final long glBeginTransformFeedbackNV;
   public final long glEndTransformFeedbackNV;
   public final long glTransformFeedbackAttribsNV;
   public final long glBindBufferRangeNV;
   public final long glBindBufferOffsetNV;
   public final long glBindBufferBaseNV;
   public final long glTransformFeedbackVaryingsNV;
   public final long glActiveVaryingNV;
   public final long glGetVaryingLocationNV;
   public final long glGetActiveVaryingNV;
   public final long glGetTransformFeedbackVaryingNV;
   public final long glTransformFeedbackStreamAttribsNV;
   public final long glBindTransformFeedbackNV;
   public final long glDeleteTransformFeedbacksNV;
   public final long glGenTransformFeedbacksNV;
   public final long glIsTransformFeedbackNV;
   public final long glPauseTransformFeedbackNV;
   public final long glResumeTransformFeedbackNV;
   public final long glDrawTransformFeedbackNV;
   public final long glVertexArrayRangeNV;
   public final long glFlushVertexArrayRangeNV;
   public final long glVertexAttribL1i64NV;
   public final long glVertexAttribL2i64NV;
   public final long glVertexAttribL3i64NV;
   public final long glVertexAttribL4i64NV;
   public final long glVertexAttribL1i64vNV;
   public final long glVertexAttribL2i64vNV;
   public final long glVertexAttribL3i64vNV;
   public final long glVertexAttribL4i64vNV;
   public final long glVertexAttribL1ui64NV;
   public final long glVertexAttribL2ui64NV;
   public final long glVertexAttribL3ui64NV;
   public final long glVertexAttribL4ui64NV;
   public final long glVertexAttribL1ui64vNV;
   public final long glVertexAttribL2ui64vNV;
   public final long glVertexAttribL3ui64vNV;
   public final long glVertexAttribL4ui64vNV;
   public final long glGetVertexAttribLi64vNV;
   public final long glGetVertexAttribLui64vNV;
   public final long glVertexAttribLFormatNV;
   public final long glBufferAddressRangeNV;
   public final long glVertexFormatNV;
   public final long glNormalFormatNV;
   public final long glColorFormatNV;
   public final long glIndexFormatNV;
   public final long glTexCoordFormatNV;
   public final long glEdgeFlagFormatNV;
   public final long glSecondaryColorFormatNV;
   public final long glFogCoordFormatNV;
   public final long glVertexAttribFormatNV;
   public final long glVertexAttribIFormatNV;
   public final long glGetIntegerui64i_vNV;
   public final long glViewportSwizzleNV;
   public final long glBeginConditionalRenderNVX;
   public final long glEndConditionalRenderNVX;
   public final long glAsyncCopyImageSubDataNVX;
   public final long glAsyncCopyBufferSubDataNVX;
   public final long glUploadGpuMaskNVX;
   public final long glMulticastViewportArrayvNVX;
   public final long glMulticastScissorArrayvNVX;
   public final long glMulticastViewportPositionWScaleNVX;
   public final long glCreateProgressFenceNVX;
   public final long glSignalSemaphoreui64NVX;
   public final long glWaitSemaphoreui64NVX;
   public final long glClientWaitSemaphoreui64NVX;
   public final long glFramebufferTextureMultiviewOVR;
   public final long glNamedFramebufferTextureMultiviewOVR;
   public final boolean OpenGL11;
   public final boolean OpenGL12;
   public final boolean OpenGL13;
   public final boolean OpenGL14;
   public final boolean OpenGL15;
   public final boolean OpenGL20;
   public final boolean OpenGL21;
   public final boolean OpenGL30;
   public final boolean OpenGL31;
   public final boolean OpenGL32;
   public final boolean OpenGL33;
   public final boolean OpenGL40;
   public final boolean OpenGL41;
   public final boolean OpenGL42;
   public final boolean OpenGL43;
   public final boolean OpenGL44;
   public final boolean OpenGL45;
   public final boolean OpenGL46;
   public final boolean GL_3DFX_texture_compression_FXT1;
   public final boolean GL_AMD_blend_minmax_factor;
   public final boolean GL_AMD_conservative_depth;
   public final boolean GL_AMD_debug_output;
   public final boolean GL_AMD_depth_clamp_separate;
   public final boolean GL_AMD_draw_buffers_blend;
   public final boolean GL_AMD_framebuffer_multisample_advanced;
   public final boolean GL_AMD_gcn_shader;
   public final boolean GL_AMD_gpu_shader_half_float;
   public final boolean GL_AMD_gpu_shader_half_float_fetch;
   public final boolean GL_AMD_gpu_shader_int16;
   public final boolean GL_AMD_gpu_shader_int64;
   public final boolean GL_AMD_interleaved_elements;
   public final boolean GL_AMD_occlusion_query_event;
   public final boolean GL_AMD_performance_monitor;
   public final boolean GL_AMD_pinned_memory;
   public final boolean GL_AMD_query_buffer_object;
   public final boolean GL_AMD_sample_positions;
   public final boolean GL_AMD_seamless_cubemap_per_texture;
   public final boolean GL_AMD_shader_atomic_counter_ops;
   public final boolean GL_AMD_shader_ballot;
   public final boolean GL_AMD_shader_explicit_vertex_parameter;
   public final boolean GL_AMD_shader_image_load_store_lod;
   public final boolean GL_AMD_shader_stencil_export;
   public final boolean GL_AMD_shader_trinary_minmax;
   public final boolean GL_AMD_sparse_texture;
   public final boolean GL_AMD_stencil_operation_extended;
   public final boolean GL_AMD_texture_gather_bias_lod;
   public final boolean GL_AMD_texture_texture4;
   public final boolean GL_AMD_transform_feedback3_lines_triangles;
   public final boolean GL_AMD_transform_feedback4;
   public final boolean GL_AMD_vertex_shader_layer;
   public final boolean GL_AMD_vertex_shader_tessellator;
   public final boolean GL_AMD_vertex_shader_viewport_index;
   public final boolean GL_ARB_arrays_of_arrays;
   public final boolean GL_ARB_base_instance;
   public final boolean GL_ARB_bindless_texture;
   public final boolean GL_ARB_blend_func_extended;
   public final boolean GL_ARB_buffer_storage;
   public final boolean GL_ARB_cl_event;
   public final boolean GL_ARB_clear_buffer_object;
   public final boolean GL_ARB_clear_texture;
   public final boolean GL_ARB_clip_control;
   public final boolean GL_ARB_color_buffer_float;
   public final boolean GL_ARB_compatibility;
   public final boolean GL_ARB_compressed_texture_pixel_storage;
   public final boolean GL_ARB_compute_shader;
   public final boolean GL_ARB_compute_variable_group_size;
   public final boolean GL_ARB_conditional_render_inverted;
   public final boolean GL_ARB_conservative_depth;
   public final boolean GL_ARB_copy_buffer;
   public final boolean GL_ARB_copy_image;
   public final boolean GL_ARB_cull_distance;
   public final boolean GL_ARB_debug_output;
   public final boolean GL_ARB_depth_buffer_float;
   public final boolean GL_ARB_depth_clamp;
   public final boolean GL_ARB_depth_texture;
   public final boolean GL_ARB_derivative_control;
   public final boolean GL_ARB_direct_state_access;
   public final boolean GL_ARB_draw_buffers;
   public final boolean GL_ARB_draw_buffers_blend;
   public final boolean GL_ARB_draw_elements_base_vertex;
   public final boolean GL_ARB_draw_indirect;
   public final boolean GL_ARB_draw_instanced;
   public final boolean GL_ARB_enhanced_layouts;
   public final boolean GL_ARB_ES2_compatibility;
   public final boolean GL_ARB_ES3_1_compatibility;
   public final boolean GL_ARB_ES3_2_compatibility;
   public final boolean GL_ARB_ES3_compatibility;
   public final boolean GL_ARB_explicit_attrib_location;
   public final boolean GL_ARB_explicit_uniform_location;
   public final boolean GL_ARB_fragment_coord_conventions;
   public final boolean GL_ARB_fragment_layer_viewport;
   public final boolean GL_ARB_fragment_program;
   public final boolean GL_ARB_fragment_program_shadow;
   public final boolean GL_ARB_fragment_shader;
   public final boolean GL_ARB_fragment_shader_interlock;
   public final boolean GL_ARB_framebuffer_no_attachments;
   public final boolean GL_ARB_framebuffer_object;
   public final boolean GL_ARB_framebuffer_sRGB;
   public final boolean GL_ARB_geometry_shader4;
   public final boolean GL_ARB_get_program_binary;
   public final boolean GL_ARB_get_texture_sub_image;
   public final boolean GL_ARB_gl_spirv;
   public final boolean GL_ARB_gpu_shader5;
   public final boolean GL_ARB_gpu_shader_fp64;
   public final boolean GL_ARB_gpu_shader_int64;
   public final boolean GL_ARB_half_float_pixel;
   public final boolean GL_ARB_half_float_vertex;
   public final boolean GL_ARB_imaging;
   public final boolean GL_ARB_indirect_parameters;
   public final boolean GL_ARB_instanced_arrays;
   public final boolean GL_ARB_internalformat_query;
   public final boolean GL_ARB_internalformat_query2;
   public final boolean GL_ARB_invalidate_subdata;
   public final boolean GL_ARB_map_buffer_alignment;
   public final boolean GL_ARB_map_buffer_range;
   public final boolean GL_ARB_matrix_palette;
   public final boolean GL_ARB_multi_bind;
   public final boolean GL_ARB_multi_draw_indirect;
   public final boolean GL_ARB_multisample;
   public final boolean GL_ARB_multitexture;
   public final boolean GL_ARB_occlusion_query;
   public final boolean GL_ARB_occlusion_query2;
   public final boolean GL_ARB_parallel_shader_compile;
   public final boolean GL_ARB_pipeline_statistics_query;
   public final boolean GL_ARB_pixel_buffer_object;
   public final boolean GL_ARB_point_parameters;
   public final boolean GL_ARB_point_sprite;
   public final boolean GL_ARB_polygon_offset_clamp;
   public final boolean GL_ARB_post_depth_coverage;
   public final boolean GL_ARB_program_interface_query;
   public final boolean GL_ARB_provoking_vertex;
   public final boolean GL_ARB_query_buffer_object;
   public final boolean GL_ARB_robust_buffer_access_behavior;
   public final boolean GL_ARB_robustness;
   public final boolean GL_ARB_robustness_application_isolation;
   public final boolean GL_ARB_robustness_share_group_isolation;
   public final boolean GL_ARB_sample_locations;
   public final boolean GL_ARB_sample_shading;
   public final boolean GL_ARB_sampler_objects;
   public final boolean GL_ARB_seamless_cube_map;
   public final boolean GL_ARB_seamless_cubemap_per_texture;
   public final boolean GL_ARB_separate_shader_objects;
   public final boolean GL_ARB_shader_atomic_counter_ops;
   public final boolean GL_ARB_shader_atomic_counters;
   public final boolean GL_ARB_shader_ballot;
   public final boolean GL_ARB_shader_bit_encoding;
   public final boolean GL_ARB_shader_clock;
   public final boolean GL_ARB_shader_draw_parameters;
   public final boolean GL_ARB_shader_group_vote;
   public final boolean GL_ARB_shader_image_load_store;
   public final boolean GL_ARB_shader_image_size;
   public final boolean GL_ARB_shader_objects;
   public final boolean GL_ARB_shader_precision;
   public final boolean GL_ARB_shader_stencil_export;
   public final boolean GL_ARB_shader_storage_buffer_object;
   public final boolean GL_ARB_shader_subroutine;
   public final boolean GL_ARB_shader_texture_image_samples;
   public final boolean GL_ARB_shader_texture_lod;
   public final boolean GL_ARB_shader_viewport_layer_array;
   public final boolean GL_ARB_shading_language_100;
   public final boolean GL_ARB_shading_language_420pack;
   public final boolean GL_ARB_shading_language_include;
   public final boolean GL_ARB_shading_language_packing;
   public final boolean GL_ARB_shadow;
   public final boolean GL_ARB_shadow_ambient;
   public final boolean GL_ARB_sparse_buffer;
   public final boolean GL_ARB_sparse_texture;
   public final boolean GL_ARB_sparse_texture2;
   public final boolean GL_ARB_sparse_texture_clamp;
   public final boolean GL_ARB_spirv_extensions;
   public final boolean GL_ARB_stencil_texturing;
   public final boolean GL_ARB_sync;
   public final boolean GL_ARB_tessellation_shader;
   public final boolean GL_ARB_texture_barrier;
   public final boolean GL_ARB_texture_border_clamp;
   public final boolean GL_ARB_texture_buffer_object;
   public final boolean GL_ARB_texture_buffer_object_rgb32;
   public final boolean GL_ARB_texture_buffer_range;
   public final boolean GL_ARB_texture_compression;
   public final boolean GL_ARB_texture_compression_bptc;
   public final boolean GL_ARB_texture_compression_rgtc;
   public final boolean GL_ARB_texture_cube_map;
   public final boolean GL_ARB_texture_cube_map_array;
   public final boolean GL_ARB_texture_env_add;
   public final boolean GL_ARB_texture_env_combine;
   public final boolean GL_ARB_texture_env_crossbar;
   public final boolean GL_ARB_texture_env_dot3;
   public final boolean GL_ARB_texture_filter_anisotropic;
   public final boolean GL_ARB_texture_filter_minmax;
   public final boolean GL_ARB_texture_float;
   public final boolean GL_ARB_texture_gather;
   public final boolean GL_ARB_texture_mirror_clamp_to_edge;
   public final boolean GL_ARB_texture_mirrored_repeat;
   public final boolean GL_ARB_texture_multisample;
   public final boolean GL_ARB_texture_non_power_of_two;
   public final boolean GL_ARB_texture_query_levels;
   public final boolean GL_ARB_texture_query_lod;
   public final boolean GL_ARB_texture_rectangle;
   public final boolean GL_ARB_texture_rg;
   public final boolean GL_ARB_texture_rgb10_a2ui;
   public final boolean GL_ARB_texture_stencil8;
   public final boolean GL_ARB_texture_storage;
   public final boolean GL_ARB_texture_storage_multisample;
   public final boolean GL_ARB_texture_swizzle;
   public final boolean GL_ARB_texture_view;
   public final boolean GL_ARB_timer_query;
   public final boolean GL_ARB_transform_feedback2;
   public final boolean GL_ARB_transform_feedback3;
   public final boolean GL_ARB_transform_feedback_instanced;
   public final boolean GL_ARB_transform_feedback_overflow_query;
   public final boolean GL_ARB_transpose_matrix;
   public final boolean GL_ARB_uniform_buffer_object;
   public final boolean GL_ARB_vertex_array_bgra;
   public final boolean GL_ARB_vertex_array_object;
   public final boolean GL_ARB_vertex_attrib_64bit;
   public final boolean GL_ARB_vertex_attrib_binding;
   public final boolean GL_ARB_vertex_blend;
   public final boolean GL_ARB_vertex_buffer_object;
   public final boolean GL_ARB_vertex_program;
   public final boolean GL_ARB_vertex_shader;
   public final boolean GL_ARB_vertex_type_10f_11f_11f_rev;
   public final boolean GL_ARB_vertex_type_2_10_10_10_rev;
   public final boolean GL_ARB_viewport_array;
   public final boolean GL_ARB_window_pos;
   public final boolean GL_ATI_meminfo;
   public final boolean GL_ATI_shader_texture_lod;
   public final boolean GL_ATI_texture_compression_3dc;
   public final boolean GL_EXT_422_pixels;
   public final boolean GL_EXT_abgr;
   public final boolean GL_EXT_bgra;
   public final boolean GL_EXT_bindable_uniform;
   public final boolean GL_EXT_blend_color;
   public final boolean GL_EXT_blend_equation_separate;
   public final boolean GL_EXT_blend_func_separate;
   public final boolean GL_EXT_blend_minmax;
   public final boolean GL_EXT_blend_subtract;
   public final boolean GL_EXT_clip_volume_hint;
   public final boolean GL_EXT_compiled_vertex_array;
   public final boolean GL_EXT_debug_label;
   public final boolean GL_EXT_debug_marker;
   public final boolean GL_EXT_depth_bounds_test;
   public final boolean GL_EXT_direct_state_access;
   public final boolean GL_EXT_draw_buffers2;
   public final boolean GL_EXT_draw_instanced;
   public final boolean GL_EXT_EGL_image_storage;
   public final boolean GL_EXT_EGL_sync;
   public final boolean GL_EXT_external_buffer;
   public final boolean GL_EXT_framebuffer_blit;
   public final boolean GL_EXT_framebuffer_blit_layers;
   public final boolean GL_EXT_framebuffer_multisample;
   public final boolean GL_EXT_framebuffer_multisample_blit_scaled;
   public final boolean GL_EXT_framebuffer_object;
   public final boolean GL_EXT_framebuffer_sRGB;
   public final boolean GL_EXT_geometry_shader4;
   public final boolean GL_EXT_gpu_program_parameters;
   public final boolean GL_EXT_gpu_shader4;
   public final boolean GL_EXT_memory_object;
   public final boolean GL_EXT_memory_object_fd;
   public final boolean GL_EXT_memory_object_win32;
   public final boolean GL_EXT_multiview_tessellation_geometry_shader;
   public final boolean GL_EXT_multiview_texture_multisample;
   public final boolean GL_EXT_multiview_timer_query;
   public final boolean GL_EXT_packed_depth_stencil;
   public final boolean GL_EXT_packed_float;
   public final boolean GL_EXT_pixel_buffer_object;
   public final boolean GL_EXT_point_parameters;
   public final boolean GL_EXT_polygon_offset_clamp;
   public final boolean GL_EXT_post_depth_coverage;
   public final boolean GL_EXT_provoking_vertex;
   public final boolean GL_EXT_raster_multisample;
   public final boolean GL_EXT_secondary_color;
   public final boolean GL_EXT_semaphore;
   public final boolean GL_EXT_semaphore_fd;
   public final boolean GL_EXT_semaphore_win32;
   public final boolean GL_EXT_separate_shader_objects;
   public final boolean GL_EXT_shader_framebuffer_fetch;
   public final boolean GL_EXT_shader_framebuffer_fetch_non_coherent;
   public final boolean GL_EXT_shader_image_load_formatted;
   public final boolean GL_EXT_shader_image_load_store;
   public final boolean GL_EXT_shader_integer_mix;
   public final boolean GL_EXT_shader_samples_identical;
   public final boolean GL_EXT_shadow_funcs;
   public final boolean GL_EXT_shared_texture_palette;
   public final boolean GL_EXT_sparse_texture2;
   public final boolean GL_EXT_stencil_clear_tag;
   public final boolean GL_EXT_stencil_two_side;
   public final boolean GL_EXT_stencil_wrap;
   public final boolean GL_EXT_texture_array;
   public final boolean GL_EXT_texture_buffer_object;
   public final boolean GL_EXT_texture_compression_latc;
   public final boolean GL_EXT_texture_compression_rgtc;
   public final boolean GL_EXT_texture_compression_s3tc;
   public final boolean GL_EXT_texture_filter_anisotropic;
   public final boolean GL_EXT_texture_filter_minmax;
   public final boolean GL_EXT_texture_integer;
   public final boolean GL_EXT_texture_mirror_clamp;
   public final boolean GL_EXT_texture_shadow_lod;
   public final boolean GL_EXT_texture_shared_exponent;
   public final boolean GL_EXT_texture_snorm;
   public final boolean GL_EXT_texture_sRGB;
   public final boolean GL_EXT_texture_sRGB_decode;
   public final boolean GL_EXT_texture_sRGB_R8;
   public final boolean GL_EXT_texture_sRGB_RG8;
   public final boolean GL_EXT_texture_storage;
   public final boolean GL_EXT_texture_swizzle;
   public final boolean GL_EXT_timer_query;
   public final boolean GL_EXT_transform_feedback;
   public final boolean GL_EXT_vertex_array_bgra;
   public final boolean GL_EXT_vertex_attrib_64bit;
   public final boolean GL_EXT_win32_keyed_mutex;
   public final boolean GL_EXT_window_rectangles;
   public final boolean GL_EXT_x11_sync_object;
   public final boolean GL_GREMEDY_frame_terminator;
   public final boolean GL_GREMEDY_string_marker;
   public final boolean GL_INTEL_blackhole_render;
   public final boolean GL_INTEL_conservative_rasterization;
   public final boolean GL_INTEL_fragment_shader_ordering;
   public final boolean GL_INTEL_framebuffer_CMAA;
   public final boolean GL_INTEL_map_texture;
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
   public final boolean GL_MESA_framebuffer_flip_x;
   public final boolean GL_MESA_framebuffer_flip_y;
   public final boolean GL_MESA_framebuffer_swap_xy;
   public final boolean GL_MESA_tile_raster_order;
   public final boolean GL_NV_alpha_to_coverage_dither_control;
   public final boolean GL_NV_bindless_multi_draw_indirect;
   public final boolean GL_NV_bindless_multi_draw_indirect_count;
   public final boolean GL_NV_bindless_texture;
   public final boolean GL_NV_blend_equation_advanced;
   public final boolean GL_NV_blend_equation_advanced_coherent;
   public final boolean GL_NV_blend_minmax_factor;
   public final boolean GL_NV_blend_square;
   public final boolean GL_NV_clip_space_w_scaling;
   public final boolean GL_NV_command_list;
   public final boolean GL_NV_compute_shader_derivatives;
   public final boolean GL_NV_conditional_render;
   public final boolean GL_NV_conservative_raster;
   public final boolean GL_NV_conservative_raster_dilate;
   public final boolean GL_NV_conservative_raster_pre_snap;
   public final boolean GL_NV_conservative_raster_pre_snap_triangles;
   public final boolean GL_NV_conservative_raster_underestimation;
   public final boolean GL_NV_copy_depth_to_color;
   public final boolean GL_NV_copy_image;
   public final boolean GL_NV_deep_texture3D;
   public final boolean GL_NV_depth_buffer_float;
   public final boolean GL_NV_depth_clamp;
   public final boolean GL_NV_draw_texture;
   public final boolean GL_NV_draw_vulkan_image;
   public final boolean GL_NV_ES3_1_compatibility;
   public final boolean GL_NV_explicit_multisample;
   public final boolean GL_NV_fence;
   public final boolean GL_NV_fill_rectangle;
   public final boolean GL_NV_float_buffer;
   public final boolean GL_NV_fog_distance;
   public final boolean GL_NV_fragment_coverage_to_color;
   public final boolean GL_NV_fragment_program4;
   public final boolean GL_NV_fragment_program_option;
   public final boolean GL_NV_fragment_shader_barycentric;
   public final boolean GL_NV_fragment_shader_interlock;
   public final boolean GL_NV_framebuffer_mixed_samples;
   public final boolean GL_NV_framebuffer_multisample_coverage;
   public final boolean GL_NV_geometry_shader4;
   public final boolean GL_NV_geometry_shader_passthrough;
   public final boolean GL_NV_gpu_multicast;
   public final boolean GL_NV_gpu_shader5;
   public final boolean GL_NV_half_float;
   public final boolean GL_NV_internalformat_sample_query;
   public final boolean GL_NV_light_max_exponent;
   public final boolean GL_NV_memory_attachment;
   public final boolean GL_NV_memory_object_sparse;
   public final boolean GL_NV_mesh_shader;
   public final boolean GL_NV_multisample_coverage;
   public final boolean GL_NV_multisample_filter_hint;
   public final boolean GL_NV_packed_depth_stencil;
   public final boolean GL_NV_path_rendering;
   public final boolean GL_NV_path_rendering_shared_edge;
   public final boolean GL_NV_pixel_data_range;
   public final boolean GL_NV_point_sprite;
   public final boolean GL_NV_primitive_restart;
   public final boolean GL_NV_primitive_shading_rate;
   public final boolean GL_NV_query_resource;
   public final boolean GL_NV_query_resource_tag;
   public final boolean GL_NV_representative_fragment_test;
   public final boolean GL_NV_robustness_video_memory_purge;
   public final boolean GL_NV_sample_locations;
   public final boolean GL_NV_sample_mask_override_coverage;
   public final boolean GL_NV_scissor_exclusive;
   public final boolean GL_NV_shader_atomic_float;
   public final boolean GL_NV_shader_atomic_float64;
   public final boolean GL_NV_shader_atomic_fp16_vector;
   public final boolean GL_NV_shader_atomic_int64;
   public final boolean GL_NV_shader_buffer_load;
   public final boolean GL_NV_shader_buffer_store;
   public final boolean GL_NV_shader_subgroup_partitioned;
   public final boolean GL_NV_shader_texture_footprint;
   public final boolean GL_NV_shader_thread_group;
   public final boolean GL_NV_shader_thread_shuffle;
   public final boolean GL_NV_shading_rate_image;
   public final boolean GL_NV_stereo_view_rendering;
   public final boolean GL_NV_texgen_reflection;
   public final boolean GL_NV_texture_barrier;
   public final boolean GL_NV_texture_compression_vtc;
   public final boolean GL_NV_texture_multisample;
   public final boolean GL_NV_texture_rectangle_compressed;
   public final boolean GL_NV_texture_shader;
   public final boolean GL_NV_texture_shader2;
   public final boolean GL_NV_texture_shader3;
   public final boolean GL_NV_timeline_semaphore;
   public final boolean GL_NV_transform_feedback;
   public final boolean GL_NV_transform_feedback2;
   public final boolean GL_NV_uniform_buffer_std430_layout;
   public final boolean GL_NV_uniform_buffer_unified_memory;
   public final boolean GL_NV_vertex_array_range;
   public final boolean GL_NV_vertex_array_range2;
   public final boolean GL_NV_vertex_attrib_integer_64bit;
   public final boolean GL_NV_vertex_buffer_unified_memory;
   public final boolean GL_NV_viewport_array2;
   public final boolean GL_NV_viewport_swizzle;
   public final boolean GL_NVX_blend_equation_advanced_multi_draw_buffers;
   public final boolean GL_NVX_conditional_render;
   public final boolean GL_NVX_gpu_memory_info;
   public final boolean GL_NVX_gpu_multicast2;
   public final boolean GL_NVX_progress_fence;
   public final boolean GL_OVR_multiview;
   public final boolean GL_OVR_multiview2;
   public final boolean GL_S3_s3tc;
   public final boolean forwardCompatible;
   final PointerBuffer addresses;

   public GLCapabilities(FunctionProvider var1, Set var2, boolean var3, IntFunction var4) {
      this.forwardCompatible = var3;
      PointerBuffer var2230 = (PointerBuffer)var4.apply(2228);
      this.OpenGL11 = check_GL11(var1, var2230, var2, var3);
      this.OpenGL12 = check_GL12(var1, var2230, var2);
      this.OpenGL13 = check_GL13(var1, var2230, var2, var3);
      this.OpenGL14 = check_GL14(var1, var2230, var2, var3);
      this.OpenGL15 = check_GL15(var1, var2230, var2);
      this.OpenGL20 = check_GL20(var1, var2230, var2);
      this.OpenGL21 = check_GL21(var1, var2230, var2);
      this.OpenGL30 = check_GL30(var1, var2230, var2);
      this.OpenGL31 = check_GL31(var1, var2230, var2);
      this.OpenGL32 = check_GL32(var1, var2230, var2);
      this.OpenGL33 = check_GL33(var1, var2230, var2, var3);
      this.OpenGL40 = check_GL40(var1, var2230, var2);
      this.OpenGL41 = check_GL41(var1, var2230, var2);
      this.OpenGL42 = check_GL42(var1, var2230, var2);
      this.OpenGL43 = check_GL43(var1, var2230, var2);
      this.OpenGL44 = check_GL44(var1, var2230, var2);
      this.OpenGL45 = check_GL45(var1, var2230, var2);
      this.OpenGL46 = check_GL46(var1, var2230, var2);
      this.GL_3DFX_texture_compression_FXT1 = var2.contains("GL_3DFX_texture_compression_FXT1");
      this.GL_AMD_blend_minmax_factor = var2.contains("GL_AMD_blend_minmax_factor");
      this.GL_AMD_conservative_depth = var2.contains("GL_AMD_conservative_depth");
      this.GL_AMD_debug_output = check_AMD_debug_output(var1, var2230, var2);
      this.GL_AMD_depth_clamp_separate = var2.contains("GL_AMD_depth_clamp_separate");
      this.GL_AMD_draw_buffers_blend = check_AMD_draw_buffers_blend(var1, var2230, var2);
      this.GL_AMD_framebuffer_multisample_advanced = check_AMD_framebuffer_multisample_advanced(var1, var2230, var2);
      this.GL_AMD_gcn_shader = var2.contains("GL_AMD_gcn_shader");
      this.GL_AMD_gpu_shader_half_float = var2.contains("GL_AMD_gpu_shader_half_float");
      this.GL_AMD_gpu_shader_half_float_fetch = var2.contains("GL_AMD_gpu_shader_half_float_fetch");
      this.GL_AMD_gpu_shader_int16 = var2.contains("GL_AMD_gpu_shader_int16");
      this.GL_AMD_gpu_shader_int64 = check_AMD_gpu_shader_int64(var1, var2230, var2);
      this.GL_AMD_interleaved_elements = check_AMD_interleaved_elements(var1, var2230, var2);
      this.GL_AMD_occlusion_query_event = check_AMD_occlusion_query_event(var1, var2230, var2);
      this.GL_AMD_performance_monitor = check_AMD_performance_monitor(var1, var2230, var2);
      this.GL_AMD_pinned_memory = var2.contains("GL_AMD_pinned_memory");
      this.GL_AMD_query_buffer_object = var2.contains("GL_AMD_query_buffer_object");
      this.GL_AMD_sample_positions = check_AMD_sample_positions(var1, var2230, var2);
      this.GL_AMD_seamless_cubemap_per_texture = var2.contains("GL_AMD_seamless_cubemap_per_texture");
      this.GL_AMD_shader_atomic_counter_ops = var2.contains("GL_AMD_shader_atomic_counter_ops");
      this.GL_AMD_shader_ballot = var2.contains("GL_AMD_shader_ballot");
      this.GL_AMD_shader_explicit_vertex_parameter = var2.contains("GL_AMD_shader_explicit_vertex_parameter");
      this.GL_AMD_shader_image_load_store_lod = var2.contains("GL_AMD_shader_image_load_store_lod");
      this.GL_AMD_shader_stencil_export = var2.contains("GL_AMD_shader_stencil_export");
      this.GL_AMD_shader_trinary_minmax = var2.contains("GL_AMD_shader_trinary_minmax");
      this.GL_AMD_sparse_texture = check_AMD_sparse_texture(var1, var2230, var2);
      this.GL_AMD_stencil_operation_extended = check_AMD_stencil_operation_extended(var1, var2230, var2);
      this.GL_AMD_texture_gather_bias_lod = var2.contains("GL_AMD_texture_gather_bias_lod");
      this.GL_AMD_texture_texture4 = var2.contains("GL_AMD_texture_texture4");
      this.GL_AMD_transform_feedback3_lines_triangles = var2.contains("GL_AMD_transform_feedback3_lines_triangles");
      this.GL_AMD_transform_feedback4 = var2.contains("GL_AMD_transform_feedback4");
      this.GL_AMD_vertex_shader_layer = var2.contains("GL_AMD_vertex_shader_layer");
      this.GL_AMD_vertex_shader_tessellator = check_AMD_vertex_shader_tessellator(var1, var2230, var2);
      this.GL_AMD_vertex_shader_viewport_index = var2.contains("GL_AMD_vertex_shader_viewport_index");
      this.GL_ARB_arrays_of_arrays = var2.contains("GL_ARB_arrays_of_arrays");
      this.GL_ARB_base_instance = check_ARB_base_instance(var1, var2230, var2);
      this.GL_ARB_bindless_texture = check_ARB_bindless_texture(var1, var2230, var2);
      this.GL_ARB_blend_func_extended = check_ARB_blend_func_extended(var1, var2230, var2);
      this.GL_ARB_buffer_storage = check_ARB_buffer_storage(var1, var2230, var2);
      this.GL_ARB_cl_event = check_ARB_cl_event(var1, var2230, var2);
      this.GL_ARB_clear_buffer_object = check_ARB_clear_buffer_object(var1, var2230, var2);
      this.GL_ARB_clear_texture = check_ARB_clear_texture(var1, var2230, var2);
      this.GL_ARB_clip_control = check_ARB_clip_control(var1, var2230, var2);
      this.GL_ARB_color_buffer_float = check_ARB_color_buffer_float(var1, var2230, var2);
      this.GL_ARB_compatibility = var2.contains("GL_ARB_compatibility");
      this.GL_ARB_compressed_texture_pixel_storage = var2.contains("GL_ARB_compressed_texture_pixel_storage");
      this.GL_ARB_compute_shader = check_ARB_compute_shader(var1, var2230, var2);
      this.GL_ARB_compute_variable_group_size = check_ARB_compute_variable_group_size(var1, var2230, var2);
      this.GL_ARB_conditional_render_inverted = var2.contains("GL_ARB_conditional_render_inverted");
      this.GL_ARB_conservative_depth = var2.contains("GL_ARB_conservative_depth");
      this.GL_ARB_copy_buffer = check_ARB_copy_buffer(var1, var2230, var2);
      this.GL_ARB_copy_image = check_ARB_copy_image(var1, var2230, var2);
      this.GL_ARB_cull_distance = var2.contains("GL_ARB_cull_distance");
      this.GL_ARB_debug_output = check_ARB_debug_output(var1, var2230, var2);
      this.GL_ARB_depth_buffer_float = var2.contains("GL_ARB_depth_buffer_float");
      this.GL_ARB_depth_clamp = var2.contains("GL_ARB_depth_clamp");
      this.GL_ARB_depth_texture = var2.contains("GL_ARB_depth_texture");
      this.GL_ARB_derivative_control = var2.contains("GL_ARB_derivative_control");
      this.GL_ARB_direct_state_access = check_ARB_direct_state_access(var1, var2230, var2);
      this.GL_ARB_draw_buffers = check_ARB_draw_buffers(var1, var2230, var2);
      this.GL_ARB_draw_buffers_blend = check_ARB_draw_buffers_blend(var1, var2230, var2);
      this.GL_ARB_draw_elements_base_vertex = check_ARB_draw_elements_base_vertex(var1, var2230, var2);
      this.GL_ARB_draw_indirect = check_ARB_draw_indirect(var1, var2230, var2);
      this.GL_ARB_draw_instanced = check_ARB_draw_instanced(var1, var2230, var2);
      this.GL_ARB_enhanced_layouts = var2.contains("GL_ARB_enhanced_layouts");
      this.GL_ARB_ES2_compatibility = check_ARB_ES2_compatibility(var1, var2230, var2);
      this.GL_ARB_ES3_1_compatibility = check_ARB_ES3_1_compatibility(var1, var2230, var2);
      this.GL_ARB_ES3_2_compatibility = check_ARB_ES3_2_compatibility(var1, var2230, var2);
      this.GL_ARB_ES3_compatibility = var2.contains("GL_ARB_ES3_compatibility");
      this.GL_ARB_explicit_attrib_location = var2.contains("GL_ARB_explicit_attrib_location");
      this.GL_ARB_explicit_uniform_location = var2.contains("GL_ARB_explicit_uniform_location");
      this.GL_ARB_fragment_coord_conventions = var2.contains("GL_ARB_fragment_coord_conventions");
      this.GL_ARB_fragment_layer_viewport = var2.contains("GL_ARB_fragment_layer_viewport");
      this.GL_ARB_fragment_program = var2.contains("GL_ARB_fragment_program");
      this.GL_ARB_fragment_program_shadow = var2.contains("GL_ARB_fragment_program_shadow");
      this.GL_ARB_fragment_shader = var2.contains("GL_ARB_fragment_shader");
      this.GL_ARB_fragment_shader_interlock = var2.contains("GL_ARB_fragment_shader_interlock");
      this.GL_ARB_framebuffer_no_attachments = check_ARB_framebuffer_no_attachments(var1, var2230, var2);
      this.GL_ARB_framebuffer_object = check_ARB_framebuffer_object(var1, var2230, var2);
      this.GL_ARB_framebuffer_sRGB = var2.contains("GL_ARB_framebuffer_sRGB");
      this.GL_ARB_geometry_shader4 = check_ARB_geometry_shader4(var1, var2230, var2);
      this.GL_ARB_get_program_binary = check_ARB_get_program_binary(var1, var2230, var2);
      this.GL_ARB_get_texture_sub_image = check_ARB_get_texture_sub_image(var1, var2230, var2);
      this.GL_ARB_gl_spirv = check_ARB_gl_spirv(var1, var2230, var2);
      this.GL_ARB_gpu_shader5 = var2.contains("GL_ARB_gpu_shader5");
      this.GL_ARB_gpu_shader_fp64 = check_ARB_gpu_shader_fp64(var1, var2230, var2);
      this.GL_ARB_gpu_shader_int64 = check_ARB_gpu_shader_int64(var1, var2230, var2);
      this.GL_ARB_half_float_pixel = var2.contains("GL_ARB_half_float_pixel");
      this.GL_ARB_half_float_vertex = var2.contains("GL_ARB_half_float_vertex");
      this.GL_ARB_imaging = check_ARB_imaging(var1, var2230, var2, var3);
      this.GL_ARB_indirect_parameters = check_ARB_indirect_parameters(var1, var2230, var2);
      this.GL_ARB_instanced_arrays = check_ARB_instanced_arrays(var1, var2230, var2);
      this.GL_ARB_internalformat_query = check_ARB_internalformat_query(var1, var2230, var2);
      this.GL_ARB_internalformat_query2 = check_ARB_internalformat_query2(var1, var2230, var2);
      this.GL_ARB_invalidate_subdata = check_ARB_invalidate_subdata(var1, var2230, var2);
      this.GL_ARB_map_buffer_alignment = var2.contains("GL_ARB_map_buffer_alignment");
      this.GL_ARB_map_buffer_range = check_ARB_map_buffer_range(var1, var2230, var2);
      this.GL_ARB_matrix_palette = check_ARB_matrix_palette(var1, var2230, var2);
      this.GL_ARB_multi_bind = check_ARB_multi_bind(var1, var2230, var2);
      this.GL_ARB_multi_draw_indirect = check_ARB_multi_draw_indirect(var1, var2230, var2);
      this.GL_ARB_multisample = check_ARB_multisample(var1, var2230, var2);
      this.GL_ARB_multitexture = check_ARB_multitexture(var1, var2230, var2);
      this.GL_ARB_occlusion_query = check_ARB_occlusion_query(var1, var2230, var2);
      this.GL_ARB_occlusion_query2 = var2.contains("GL_ARB_occlusion_query2");
      this.GL_ARB_parallel_shader_compile = check_ARB_parallel_shader_compile(var1, var2230, var2);
      this.GL_ARB_pipeline_statistics_query = var2.contains("GL_ARB_pipeline_statistics_query");
      this.GL_ARB_pixel_buffer_object = var2.contains("GL_ARB_pixel_buffer_object");
      this.GL_ARB_point_parameters = check_ARB_point_parameters(var1, var2230, var2);
      this.GL_ARB_point_sprite = var2.contains("GL_ARB_point_sprite");
      this.GL_ARB_polygon_offset_clamp = check_ARB_polygon_offset_clamp(var1, var2230, var2);
      this.GL_ARB_post_depth_coverage = var2.contains("GL_ARB_post_depth_coverage");
      this.GL_ARB_program_interface_query = check_ARB_program_interface_query(var1, var2230, var2);
      this.GL_ARB_provoking_vertex = check_ARB_provoking_vertex(var1, var2230, var2);
      this.GL_ARB_query_buffer_object = var2.contains("GL_ARB_query_buffer_object");
      this.GL_ARB_robust_buffer_access_behavior = var2.contains("GL_ARB_robust_buffer_access_behavior");
      this.GL_ARB_robustness = check_ARB_robustness(var1, var2230, var2);
      this.GL_ARB_robustness_application_isolation = var2.contains("GL_ARB_robustness_application_isolation");
      this.GL_ARB_robustness_share_group_isolation = var2.contains("GL_ARB_robustness_share_group_isolation");
      this.GL_ARB_sample_locations = check_ARB_sample_locations(var1, var2230, var2);
      this.GL_ARB_sample_shading = check_ARB_sample_shading(var1, var2230, var2);
      this.GL_ARB_sampler_objects = check_ARB_sampler_objects(var1, var2230, var2);
      this.GL_ARB_seamless_cube_map = var2.contains("GL_ARB_seamless_cube_map");
      this.GL_ARB_seamless_cubemap_per_texture = var2.contains("GL_ARB_seamless_cubemap_per_texture");
      this.GL_ARB_separate_shader_objects = check_ARB_separate_shader_objects(var1, var2230, var2);
      this.GL_ARB_shader_atomic_counter_ops = var2.contains("GL_ARB_shader_atomic_counter_ops");
      this.GL_ARB_shader_atomic_counters = check_ARB_shader_atomic_counters(var1, var2230, var2);
      this.GL_ARB_shader_ballot = var2.contains("GL_ARB_shader_ballot");
      this.GL_ARB_shader_bit_encoding = var2.contains("GL_ARB_shader_bit_encoding");
      this.GL_ARB_shader_clock = var2.contains("GL_ARB_shader_clock");
      this.GL_ARB_shader_draw_parameters = var2.contains("GL_ARB_shader_draw_parameters");
      this.GL_ARB_shader_group_vote = var2.contains("GL_ARB_shader_group_vote");
      this.GL_ARB_shader_image_load_store = check_ARB_shader_image_load_store(var1, var2230, var2);
      this.GL_ARB_shader_image_size = var2.contains("GL_ARB_shader_image_size");
      this.GL_ARB_shader_objects = check_ARB_shader_objects(var1, var2230, var2);
      this.GL_ARB_shader_precision = var2.contains("GL_ARB_shader_precision");
      this.GL_ARB_shader_stencil_export = var2.contains("GL_ARB_shader_stencil_export");
      this.GL_ARB_shader_storage_buffer_object = check_ARB_shader_storage_buffer_object(var1, var2230, var2);
      this.GL_ARB_shader_subroutine = check_ARB_shader_subroutine(var1, var2230, var2);
      this.GL_ARB_shader_texture_image_samples = var2.contains("GL_ARB_shader_texture_image_samples");
      this.GL_ARB_shader_texture_lod = var2.contains("GL_ARB_shader_texture_lod");
      this.GL_ARB_shader_viewport_layer_array = var2.contains("GL_ARB_shader_viewport_layer_array");
      this.GL_ARB_shading_language_100 = var2.contains("GL_ARB_shading_language_100");
      this.GL_ARB_shading_language_420pack = var2.contains("GL_ARB_shading_language_420pack");
      this.GL_ARB_shading_language_include = check_ARB_shading_language_include(var1, var2230, var2);
      this.GL_ARB_shading_language_packing = var2.contains("GL_ARB_shading_language_packing");
      this.GL_ARB_shadow = var2.contains("GL_ARB_shadow");
      this.GL_ARB_shadow_ambient = var2.contains("GL_ARB_shadow_ambient");
      this.GL_ARB_sparse_buffer = check_ARB_sparse_buffer(var1, var2230, var2);
      this.GL_ARB_sparse_texture = check_ARB_sparse_texture(var1, var2230, var2);
      this.GL_ARB_sparse_texture2 = var2.contains("GL_ARB_sparse_texture2");
      this.GL_ARB_sparse_texture_clamp = var2.contains("GL_ARB_sparse_texture_clamp");
      this.GL_ARB_spirv_extensions = var2.contains("GL_ARB_spirv_extensions");
      this.GL_ARB_stencil_texturing = var2.contains("GL_ARB_stencil_texturing");
      this.GL_ARB_sync = check_ARB_sync(var1, var2230, var2);
      this.GL_ARB_tessellation_shader = check_ARB_tessellation_shader(var1, var2230, var2);
      this.GL_ARB_texture_barrier = check_ARB_texture_barrier(var1, var2230, var2);
      this.GL_ARB_texture_border_clamp = var2.contains("GL_ARB_texture_border_clamp");
      this.GL_ARB_texture_buffer_object = check_ARB_texture_buffer_object(var1, var2230, var2);
      this.GL_ARB_texture_buffer_object_rgb32 = var2.contains("GL_ARB_texture_buffer_object_rgb32");
      this.GL_ARB_texture_buffer_range = check_ARB_texture_buffer_range(var1, var2230, var2);
      this.GL_ARB_texture_compression = check_ARB_texture_compression(var1, var2230, var2);
      this.GL_ARB_texture_compression_bptc = var2.contains("GL_ARB_texture_compression_bptc");
      this.GL_ARB_texture_compression_rgtc = var2.contains("GL_ARB_texture_compression_rgtc");
      this.GL_ARB_texture_cube_map = var2.contains("GL_ARB_texture_cube_map");
      this.GL_ARB_texture_cube_map_array = var2.contains("GL_ARB_texture_cube_map_array");
      this.GL_ARB_texture_env_add = var2.contains("GL_ARB_texture_env_add");
      this.GL_ARB_texture_env_combine = var2.contains("GL_ARB_texture_env_combine");
      this.GL_ARB_texture_env_crossbar = var2.contains("GL_ARB_texture_env_crossbar");
      this.GL_ARB_texture_env_dot3 = var2.contains("GL_ARB_texture_env_dot3");
      this.GL_ARB_texture_filter_anisotropic = var2.contains("GL_ARB_texture_filter_anisotropic");
      this.GL_ARB_texture_filter_minmax = var2.contains("GL_ARB_texture_filter_minmax");
      this.GL_ARB_texture_float = var2.contains("GL_ARB_texture_float");
      this.GL_ARB_texture_gather = var2.contains("GL_ARB_texture_gather");
      this.GL_ARB_texture_mirror_clamp_to_edge = var2.contains("GL_ARB_texture_mirror_clamp_to_edge");
      this.GL_ARB_texture_mirrored_repeat = var2.contains("GL_ARB_texture_mirrored_repeat");
      this.GL_ARB_texture_multisample = check_ARB_texture_multisample(var1, var2230, var2);
      this.GL_ARB_texture_non_power_of_two = var2.contains("GL_ARB_texture_non_power_of_two");
      this.GL_ARB_texture_query_levels = var2.contains("GL_ARB_texture_query_levels");
      this.GL_ARB_texture_query_lod = var2.contains("GL_ARB_texture_query_lod");
      this.GL_ARB_texture_rectangle = var2.contains("GL_ARB_texture_rectangle");
      this.GL_ARB_texture_rg = var2.contains("GL_ARB_texture_rg");
      this.GL_ARB_texture_rgb10_a2ui = var2.contains("GL_ARB_texture_rgb10_a2ui");
      this.GL_ARB_texture_stencil8 = var2.contains("GL_ARB_texture_stencil8");
      this.GL_ARB_texture_storage = check_ARB_texture_storage(var1, var2230, var2);
      this.GL_ARB_texture_storage_multisample = check_ARB_texture_storage_multisample(var1, var2230, var2);
      this.GL_ARB_texture_swizzle = var2.contains("GL_ARB_texture_swizzle");
      this.GL_ARB_texture_view = check_ARB_texture_view(var1, var2230, var2);
      this.GL_ARB_timer_query = check_ARB_timer_query(var1, var2230, var2);
      this.GL_ARB_transform_feedback2 = check_ARB_transform_feedback2(var1, var2230, var2);
      this.GL_ARB_transform_feedback3 = check_ARB_transform_feedback3(var1, var2230, var2);
      this.GL_ARB_transform_feedback_instanced = check_ARB_transform_feedback_instanced(var1, var2230, var2);
      this.GL_ARB_transform_feedback_overflow_query = var2.contains("GL_ARB_transform_feedback_overflow_query");
      this.GL_ARB_transpose_matrix = check_ARB_transpose_matrix(var1, var2230, var2);
      this.GL_ARB_uniform_buffer_object = check_ARB_uniform_buffer_object(var1, var2230, var2);
      this.GL_ARB_vertex_array_bgra = var2.contains("GL_ARB_vertex_array_bgra");
      this.GL_ARB_vertex_array_object = check_ARB_vertex_array_object(var1, var2230, var2);
      this.GL_ARB_vertex_attrib_64bit = check_ARB_vertex_attrib_64bit(var1, var2230, var2);
      this.GL_ARB_vertex_attrib_binding = check_ARB_vertex_attrib_binding(var1, var2230, var2);
      this.GL_ARB_vertex_blend = check_ARB_vertex_blend(var1, var2230, var2);
      this.GL_ARB_vertex_buffer_object = check_ARB_vertex_buffer_object(var1, var2230, var2);
      this.GL_ARB_vertex_program = check_ARB_vertex_program(var1, var2230, var2);
      this.GL_ARB_vertex_shader = check_ARB_vertex_shader(var1, var2230, var2);
      this.GL_ARB_vertex_type_10f_11f_11f_rev = var2.contains("GL_ARB_vertex_type_10f_11f_11f_rev");
      this.GL_ARB_vertex_type_2_10_10_10_rev = check_ARB_vertex_type_2_10_10_10_rev(var1, var2230, var2, var3);
      this.GL_ARB_viewport_array = check_ARB_viewport_array(var1, var2230, var2);
      this.GL_ARB_window_pos = check_ARB_window_pos(var1, var2230, var2);
      this.GL_ATI_meminfo = var2.contains("GL_ATI_meminfo");
      this.GL_ATI_shader_texture_lod = var2.contains("GL_ATI_shader_texture_lod");
      this.GL_ATI_texture_compression_3dc = var2.contains("GL_ATI_texture_compression_3dc");
      this.GL_EXT_422_pixels = var2.contains("GL_EXT_422_pixels");
      this.GL_EXT_abgr = var2.contains("GL_EXT_abgr");
      this.GL_EXT_bgra = var2.contains("GL_EXT_bgra");
      this.GL_EXT_bindable_uniform = check_EXT_bindable_uniform(var1, var2230, var2);
      this.GL_EXT_blend_color = check_EXT_blend_color(var1, var2230, var2);
      this.GL_EXT_blend_equation_separate = check_EXT_blend_equation_separate(var1, var2230, var2);
      this.GL_EXT_blend_func_separate = check_EXT_blend_func_separate(var1, var2230, var2);
      this.GL_EXT_blend_minmax = check_EXT_blend_minmax(var1, var2230, var2);
      this.GL_EXT_blend_subtract = var2.contains("GL_EXT_blend_subtract");
      this.GL_EXT_clip_volume_hint = var2.contains("GL_EXT_clip_volume_hint");
      this.GL_EXT_compiled_vertex_array = check_EXT_compiled_vertex_array(var1, var2230, var2);
      this.GL_EXT_debug_label = check_EXT_debug_label(var1, var2230, var2);
      this.GL_EXT_debug_marker = check_EXT_debug_marker(var1, var2230, var2);
      this.GL_EXT_depth_bounds_test = check_EXT_depth_bounds_test(var1, var2230, var2);
      this.GL_EXT_direct_state_access = check_EXT_direct_state_access(var1, var2230, var2);
      this.GL_EXT_draw_buffers2 = check_EXT_draw_buffers2(var1, var2230, var2);
      this.GL_EXT_draw_instanced = check_EXT_draw_instanced(var1, var2230, var2);
      this.GL_EXT_EGL_image_storage = check_EXT_EGL_image_storage(var1, var2230, var2);
      this.GL_EXT_EGL_sync = var2.contains("GL_EXT_EGL_sync");
      this.GL_EXT_external_buffer = check_EXT_external_buffer(var1, var2230, var2);
      this.GL_EXT_framebuffer_blit = check_EXT_framebuffer_blit(var1, var2230, var2);
      this.GL_EXT_framebuffer_blit_layers = check_EXT_framebuffer_blit_layers(var1, var2230, var2);
      this.GL_EXT_framebuffer_multisample = check_EXT_framebuffer_multisample(var1, var2230, var2);
      this.GL_EXT_framebuffer_multisample_blit_scaled = var2.contains("GL_EXT_framebuffer_multisample_blit_scaled");
      this.GL_EXT_framebuffer_object = check_EXT_framebuffer_object(var1, var2230, var2);
      this.GL_EXT_framebuffer_sRGB = var2.contains("GL_EXT_framebuffer_sRGB");
      this.GL_EXT_geometry_shader4 = check_EXT_geometry_shader4(var1, var2230, var2);
      this.GL_EXT_gpu_program_parameters = check_EXT_gpu_program_parameters(var1, var2230, var2);
      this.GL_EXT_gpu_shader4 = check_EXT_gpu_shader4(var1, var2230, var2);
      this.GL_EXT_memory_object = check_EXT_memory_object(var1, var2230, var2);
      this.GL_EXT_memory_object_fd = check_EXT_memory_object_fd(var1, var2230, var2);
      this.GL_EXT_memory_object_win32 = check_EXT_memory_object_win32(var1, var2230, var2);
      this.GL_EXT_multiview_tessellation_geometry_shader = var2.contains("GL_EXT_multiview_tessellation_geometry_shader");
      this.GL_EXT_multiview_texture_multisample = var2.contains("GL_EXT_multiview_texture_multisample");
      this.GL_EXT_multiview_timer_query = var2.contains("GL_EXT_multiview_timer_query");
      this.GL_EXT_packed_depth_stencil = var2.contains("GL_EXT_packed_depth_stencil");
      this.GL_EXT_packed_float = var2.contains("GL_EXT_packed_float");
      this.GL_EXT_pixel_buffer_object = var2.contains("GL_EXT_pixel_buffer_object");
      this.GL_EXT_point_parameters = check_EXT_point_parameters(var1, var2230, var2);
      this.GL_EXT_polygon_offset_clamp = check_EXT_polygon_offset_clamp(var1, var2230, var2);
      this.GL_EXT_post_depth_coverage = var2.contains("GL_EXT_post_depth_coverage");
      this.GL_EXT_provoking_vertex = check_EXT_provoking_vertex(var1, var2230, var2);
      this.GL_EXT_raster_multisample = check_EXT_raster_multisample(var1, var2230, var2);
      this.GL_EXT_secondary_color = check_EXT_secondary_color(var1, var2230, var2);
      this.GL_EXT_semaphore = check_EXT_semaphore(var1, var2230, var2);
      this.GL_EXT_semaphore_fd = check_EXT_semaphore_fd(var1, var2230, var2);
      this.GL_EXT_semaphore_win32 = check_EXT_semaphore_win32(var1, var2230, var2);
      this.GL_EXT_separate_shader_objects = check_EXT_separate_shader_objects(var1, var2230, var2);
      this.GL_EXT_shader_framebuffer_fetch = var2.contains("GL_EXT_shader_framebuffer_fetch");
      this.GL_EXT_shader_framebuffer_fetch_non_coherent = check_EXT_shader_framebuffer_fetch_non_coherent(var1, var2230, var2);
      this.GL_EXT_shader_image_load_formatted = var2.contains("GL_EXT_shader_image_load_formatted");
      this.GL_EXT_shader_image_load_store = check_EXT_shader_image_load_store(var1, var2230, var2);
      this.GL_EXT_shader_integer_mix = var2.contains("GL_EXT_shader_integer_mix");
      this.GL_EXT_shader_samples_identical = var2.contains("GL_EXT_shader_samples_identical");
      this.GL_EXT_shadow_funcs = var2.contains("GL_EXT_shadow_funcs");
      this.GL_EXT_shared_texture_palette = var2.contains("GL_EXT_shared_texture_palette");
      this.GL_EXT_sparse_texture2 = var2.contains("GL_EXT_sparse_texture2");
      this.GL_EXT_stencil_clear_tag = check_EXT_stencil_clear_tag(var1, var2230, var2);
      this.GL_EXT_stencil_two_side = check_EXT_stencil_two_side(var1, var2230, var2);
      this.GL_EXT_stencil_wrap = var2.contains("GL_EXT_stencil_wrap");
      this.GL_EXT_texture_array = check_EXT_texture_array(var1, var2230, var2);
      this.GL_EXT_texture_buffer_object = check_EXT_texture_buffer_object(var1, var2230, var2);
      this.GL_EXT_texture_compression_latc = var2.contains("GL_EXT_texture_compression_latc");
      this.GL_EXT_texture_compression_rgtc = var2.contains("GL_EXT_texture_compression_rgtc");
      this.GL_EXT_texture_compression_s3tc = var2.contains("GL_EXT_texture_compression_s3tc");
      this.GL_EXT_texture_filter_anisotropic = var2.contains("GL_EXT_texture_filter_anisotropic");
      this.GL_EXT_texture_filter_minmax = var2.contains("GL_EXT_texture_filter_minmax");
      this.GL_EXT_texture_integer = check_EXT_texture_integer(var1, var2230, var2);
      this.GL_EXT_texture_mirror_clamp = var2.contains("GL_EXT_texture_mirror_clamp");
      this.GL_EXT_texture_shadow_lod = var2.contains("GL_EXT_texture_shadow_lod");
      this.GL_EXT_texture_shared_exponent = var2.contains("GL_EXT_texture_shared_exponent");
      this.GL_EXT_texture_snorm = var2.contains("GL_EXT_texture_snorm");
      this.GL_EXT_texture_sRGB = var2.contains("GL_EXT_texture_sRGB");
      this.GL_EXT_texture_sRGB_decode = var2.contains("GL_EXT_texture_sRGB_decode");
      this.GL_EXT_texture_sRGB_R8 = var2.contains("GL_EXT_texture_sRGB_R8");
      this.GL_EXT_texture_sRGB_RG8 = var2.contains("GL_EXT_texture_sRGB_RG8");
      this.GL_EXT_texture_storage = check_EXT_texture_storage(var1, var2230, var2);
      this.GL_EXT_texture_swizzle = var2.contains("GL_EXT_texture_swizzle");
      this.GL_EXT_timer_query = check_EXT_timer_query(var1, var2230, var2);
      this.GL_EXT_transform_feedback = check_EXT_transform_feedback(var1, var2230, var2);
      this.GL_EXT_vertex_array_bgra = var2.contains("GL_EXT_vertex_array_bgra");
      this.GL_EXT_vertex_attrib_64bit = check_EXT_vertex_attrib_64bit(var1, var2230, var2);
      this.GL_EXT_win32_keyed_mutex = check_EXT_win32_keyed_mutex(var1, var2230, var2);
      this.GL_EXT_window_rectangles = check_EXT_window_rectangles(var1, var2230, var2);
      this.GL_EXT_x11_sync_object = check_EXT_x11_sync_object(var1, var2230, var2);
      this.GL_GREMEDY_frame_terminator = check_GREMEDY_frame_terminator(var1, var2230, var2);
      this.GL_GREMEDY_string_marker = check_GREMEDY_string_marker(var1, var2230, var2);
      this.GL_INTEL_blackhole_render = var2.contains("GL_INTEL_blackhole_render");
      this.GL_INTEL_conservative_rasterization = var2.contains("GL_INTEL_conservative_rasterization");
      this.GL_INTEL_fragment_shader_ordering = var2.contains("GL_INTEL_fragment_shader_ordering");
      this.GL_INTEL_framebuffer_CMAA = check_INTEL_framebuffer_CMAA(var1, var2230, var2);
      this.GL_INTEL_map_texture = check_INTEL_map_texture(var1, var2230, var2);
      this.GL_INTEL_performance_query = check_INTEL_performance_query(var1, var2230, var2);
      this.GL_INTEL_shader_integer_functions2 = var2.contains("GL_INTEL_shader_integer_functions2");
      this.GL_KHR_blend_equation_advanced = check_KHR_blend_equation_advanced(var1, var2230, var2);
      this.GL_KHR_blend_equation_advanced_coherent = var2.contains("GL_KHR_blend_equation_advanced_coherent");
      this.GL_KHR_context_flush_control = var2.contains("GL_KHR_context_flush_control");
      this.GL_KHR_debug = check_KHR_debug(var1, var2230, var2);
      this.GL_KHR_no_error = var2.contains("GL_KHR_no_error");
      this.GL_KHR_parallel_shader_compile = check_KHR_parallel_shader_compile(var1, var2230, var2);
      this.GL_KHR_robust_buffer_access_behavior = var2.contains("GL_KHR_robust_buffer_access_behavior");
      this.GL_KHR_robustness = check_KHR_robustness(var1, var2230, var2);
      this.GL_KHR_shader_subgroup = var2.contains("GL_KHR_shader_subgroup");
      this.GL_KHR_texture_compression_astc_hdr = var2.contains("GL_KHR_texture_compression_astc_hdr");
      this.GL_KHR_texture_compression_astc_ldr = var2.contains("GL_KHR_texture_compression_astc_ldr");
      this.GL_KHR_texture_compression_astc_sliced_3d = var2.contains("GL_KHR_texture_compression_astc_sliced_3d");
      this.GL_MESA_framebuffer_flip_x = var2.contains("GL_MESA_framebuffer_flip_x");
      this.GL_MESA_framebuffer_flip_y = check_MESA_framebuffer_flip_y(var1, var2230, var2);
      this.GL_MESA_framebuffer_swap_xy = var2.contains("GL_MESA_framebuffer_swap_xy");
      this.GL_MESA_tile_raster_order = var2.contains("GL_MESA_tile_raster_order");
      this.GL_NV_alpha_to_coverage_dither_control = check_NV_alpha_to_coverage_dither_control(var1, var2230, var2);
      this.GL_NV_bindless_multi_draw_indirect = check_NV_bindless_multi_draw_indirect(var1, var2230, var2);
      this.GL_NV_bindless_multi_draw_indirect_count = check_NV_bindless_multi_draw_indirect_count(var1, var2230, var2);
      this.GL_NV_bindless_texture = check_NV_bindless_texture(var1, var2230, var2);
      this.GL_NV_blend_equation_advanced = check_NV_blend_equation_advanced(var1, var2230, var2);
      this.GL_NV_blend_equation_advanced_coherent = var2.contains("GL_NV_blend_equation_advanced_coherent");
      this.GL_NV_blend_minmax_factor = var2.contains("GL_NV_blend_minmax_factor");
      this.GL_NV_blend_square = var2.contains("GL_NV_blend_square");
      this.GL_NV_clip_space_w_scaling = check_NV_clip_space_w_scaling(var1, var2230, var2);
      this.GL_NV_command_list = check_NV_command_list(var1, var2230, var2);
      this.GL_NV_compute_shader_derivatives = var2.contains("GL_NV_compute_shader_derivatives");
      this.GL_NV_conditional_render = check_NV_conditional_render(var1, var2230, var2);
      this.GL_NV_conservative_raster = check_NV_conservative_raster(var1, var2230, var2);
      this.GL_NV_conservative_raster_dilate = check_NV_conservative_raster_dilate(var1, var2230, var2);
      this.GL_NV_conservative_raster_pre_snap = var2.contains("GL_NV_conservative_raster_pre_snap");
      this.GL_NV_conservative_raster_pre_snap_triangles = check_NV_conservative_raster_pre_snap_triangles(var1, var2230, var2);
      this.GL_NV_conservative_raster_underestimation = var2.contains("GL_NV_conservative_raster_underestimation");
      this.GL_NV_copy_depth_to_color = var2.contains("GL_NV_copy_depth_to_color");
      this.GL_NV_copy_image = check_NV_copy_image(var1, var2230, var2);
      this.GL_NV_deep_texture3D = var2.contains("GL_NV_deep_texture3D");
      this.GL_NV_depth_buffer_float = check_NV_depth_buffer_float(var1, var2230, var2);
      this.GL_NV_depth_clamp = var2.contains("GL_NV_depth_clamp");
      this.GL_NV_draw_texture = check_NV_draw_texture(var1, var2230, var2);
      this.GL_NV_draw_vulkan_image = check_NV_draw_vulkan_image(var1, var2230, var2);
      this.GL_NV_ES3_1_compatibility = var2.contains("GL_NV_ES3_1_compatibility");
      this.GL_NV_explicit_multisample = check_NV_explicit_multisample(var1, var2230, var2);
      this.GL_NV_fence = check_NV_fence(var1, var2230, var2);
      this.GL_NV_fill_rectangle = var2.contains("GL_NV_fill_rectangle");
      this.GL_NV_float_buffer = var2.contains("GL_NV_float_buffer");
      this.GL_NV_fog_distance = var2.contains("GL_NV_fog_distance");
      this.GL_NV_fragment_coverage_to_color = check_NV_fragment_coverage_to_color(var1, var2230, var2);
      this.GL_NV_fragment_program4 = var2.contains("GL_NV_fragment_program4");
      this.GL_NV_fragment_program_option = var2.contains("GL_NV_fragment_program_option");
      this.GL_NV_fragment_shader_barycentric = var2.contains("GL_NV_fragment_shader_barycentric");
      this.GL_NV_fragment_shader_interlock = var2.contains("GL_NV_fragment_shader_interlock");
      this.GL_NV_framebuffer_mixed_samples = check_NV_framebuffer_mixed_samples(var1, var2230, var2);
      this.GL_NV_framebuffer_multisample_coverage = check_NV_framebuffer_multisample_coverage(var1, var2230, var2);
      this.GL_NV_geometry_shader4 = var2.contains("GL_NV_geometry_shader4");
      this.GL_NV_geometry_shader_passthrough = var2.contains("GL_NV_geometry_shader_passthrough");
      this.GL_NV_gpu_multicast = check_NV_gpu_multicast(var1, var2230, var2);
      this.GL_NV_gpu_shader5 = check_NV_gpu_shader5(var1, var2230, var2);
      this.GL_NV_half_float = check_NV_half_float(var1, var2230, var2);
      this.GL_NV_internalformat_sample_query = check_NV_internalformat_sample_query(var1, var2230, var2);
      this.GL_NV_light_max_exponent = var2.contains("GL_NV_light_max_exponent");
      this.GL_NV_memory_attachment = check_NV_memory_attachment(var1, var2230, var2);
      this.GL_NV_memory_object_sparse = check_NV_memory_object_sparse(var1, var2230, var2);
      this.GL_NV_mesh_shader = check_NV_mesh_shader(var1, var2230, var2);
      this.GL_NV_multisample_coverage = var2.contains("GL_NV_multisample_coverage");
      this.GL_NV_multisample_filter_hint = var2.contains("GL_NV_multisample_filter_hint");
      this.GL_NV_packed_depth_stencil = var2.contains("GL_NV_packed_depth_stencil");
      this.GL_NV_path_rendering = check_NV_path_rendering(var1, var2230, var2);
      this.GL_NV_path_rendering_shared_edge = var2.contains("GL_NV_path_rendering_shared_edge");
      this.GL_NV_pixel_data_range = check_NV_pixel_data_range(var1, var2230, var2);
      this.GL_NV_point_sprite = check_NV_point_sprite(var1, var2230, var2);
      this.GL_NV_primitive_restart = check_NV_primitive_restart(var1, var2230, var2);
      this.GL_NV_primitive_shading_rate = var2.contains("GL_NV_primitive_shading_rate");
      this.GL_NV_query_resource = check_NV_query_resource(var1, var2230, var2);
      this.GL_NV_query_resource_tag = check_NV_query_resource_tag(var1, var2230, var2);
      this.GL_NV_representative_fragment_test = var2.contains("GL_NV_representative_fragment_test");
      this.GL_NV_robustness_video_memory_purge = var2.contains("GL_NV_robustness_video_memory_purge");
      this.GL_NV_sample_locations = check_NV_sample_locations(var1, var2230, var2);
      this.GL_NV_sample_mask_override_coverage = var2.contains("GL_NV_sample_mask_override_coverage");
      this.GL_NV_scissor_exclusive = check_NV_scissor_exclusive(var1, var2230, var2);
      this.GL_NV_shader_atomic_float = var2.contains("GL_NV_shader_atomic_float");
      this.GL_NV_shader_atomic_float64 = var2.contains("GL_NV_shader_atomic_float64");
      this.GL_NV_shader_atomic_fp16_vector = var2.contains("GL_NV_shader_atomic_fp16_vector");
      this.GL_NV_shader_atomic_int64 = var2.contains("GL_NV_shader_atomic_int64");
      this.GL_NV_shader_buffer_load = check_NV_shader_buffer_load(var1, var2230, var2);
      this.GL_NV_shader_buffer_store = var2.contains("GL_NV_shader_buffer_store");
      this.GL_NV_shader_subgroup_partitioned = var2.contains("GL_NV_shader_subgroup_partitioned");
      this.GL_NV_shader_texture_footprint = var2.contains("GL_NV_shader_texture_footprint");
      this.GL_NV_shader_thread_group = var2.contains("GL_NV_shader_thread_group");
      this.GL_NV_shader_thread_shuffle = var2.contains("GL_NV_shader_thread_shuffle");
      this.GL_NV_shading_rate_image = check_NV_shading_rate_image(var1, var2230, var2);
      this.GL_NV_stereo_view_rendering = var2.contains("GL_NV_stereo_view_rendering");
      this.GL_NV_texgen_reflection = var2.contains("GL_NV_texgen_reflection");
      this.GL_NV_texture_barrier = check_NV_texture_barrier(var1, var2230, var2);
      this.GL_NV_texture_compression_vtc = var2.contains("GL_NV_texture_compression_vtc");
      this.GL_NV_texture_multisample = check_NV_texture_multisample(var1, var2230, var2);
      this.GL_NV_texture_rectangle_compressed = var2.contains("GL_NV_texture_rectangle_compressed");
      this.GL_NV_texture_shader = var2.contains("GL_NV_texture_shader");
      this.GL_NV_texture_shader2 = var2.contains("GL_NV_texture_shader2");
      this.GL_NV_texture_shader3 = var2.contains("GL_NV_texture_shader3");
      this.GL_NV_timeline_semaphore = check_NV_timeline_semaphore(var1, var2230, var2);
      this.GL_NV_transform_feedback = check_NV_transform_feedback(var1, var2230, var2);
      this.GL_NV_transform_feedback2 = check_NV_transform_feedback2(var1, var2230, var2);
      this.GL_NV_uniform_buffer_std430_layout = var2.contains("GL_NV_uniform_buffer_std430_layout");
      this.GL_NV_uniform_buffer_unified_memory = var2.contains("GL_NV_uniform_buffer_unified_memory");
      this.GL_NV_vertex_array_range = check_NV_vertex_array_range(var1, var2230, var2);
      this.GL_NV_vertex_array_range2 = var2.contains("GL_NV_vertex_array_range2");
      this.GL_NV_vertex_attrib_integer_64bit = check_NV_vertex_attrib_integer_64bit(var1, var2230, var2);
      this.GL_NV_vertex_buffer_unified_memory = check_NV_vertex_buffer_unified_memory(var1, var2230, var2);
      this.GL_NV_viewport_array2 = var2.contains("GL_NV_viewport_array2");
      this.GL_NV_viewport_swizzle = check_NV_viewport_swizzle(var1, var2230, var2);
      this.GL_NVX_blend_equation_advanced_multi_draw_buffers = var2.contains("GL_NVX_blend_equation_advanced_multi_draw_buffers");
      this.GL_NVX_conditional_render = check_NVX_conditional_render(var1, var2230, var2);
      this.GL_NVX_gpu_memory_info = var2.contains("GL_NVX_gpu_memory_info");
      this.GL_NVX_gpu_multicast2 = check_NVX_gpu_multicast2(var1, var2230, var2);
      this.GL_NVX_progress_fence = check_NVX_progress_fence(var1, var2230, var2);
      this.GL_OVR_multiview = check_OVR_multiview(var1, var2230, var2);
      this.GL_OVR_multiview2 = var2.contains("GL_OVR_multiview2");
      this.GL_S3_s3tc = var2.contains("GL_S3_s3tc");
      long var5 = var2230.get(0);
      this.glEnable = var5;
      var5 = var2230.get(1);
      this.glDisable = var5;
      var5 = var2230.get(2);
      this.glAccum = var5;
      var5 = var2230.get(3);
      this.glAlphaFunc = var5;
      var5 = var2230.get(4);
      this.glAreTexturesResident = var5;
      var5 = var2230.get(5);
      this.glArrayElement = var5;
      var5 = var2230.get(6);
      this.glBegin = var5;
      var5 = var2230.get(7);
      this.glBindTexture = var5;
      var5 = var2230.get(8);
      this.glBitmap = var5;
      var5 = var2230.get(9);
      this.glBlendFunc = var5;
      var5 = var2230.get(10);
      this.glCallList = var5;
      var5 = var2230.get(11);
      this.glCallLists = var5;
      var5 = var2230.get(12);
      this.glClear = var5;
      var5 = var2230.get(13);
      this.glClearAccum = var5;
      var5 = var2230.get(14);
      this.glClearColor = var5;
      var5 = var2230.get(15);
      this.glClearDepth = var5;
      var5 = var2230.get(16);
      this.glClearIndex = var5;
      var5 = var2230.get(17);
      this.glClearStencil = var5;
      var5 = var2230.get(18);
      this.glClipPlane = var5;
      var5 = var2230.get(19);
      this.glColor3b = var5;
      var5 = var2230.get(20);
      this.glColor3s = var5;
      var5 = var2230.get(21);
      this.glColor3i = var5;
      var5 = var2230.get(22);
      this.glColor3f = var5;
      var5 = var2230.get(23);
      this.glColor3d = var5;
      var5 = var2230.get(24);
      this.glColor3ub = var5;
      var5 = var2230.get(25);
      this.glColor3us = var5;
      var5 = var2230.get(26);
      this.glColor3ui = var5;
      var5 = var2230.get(27);
      this.glColor3bv = var5;
      var5 = var2230.get(28);
      this.glColor3sv = var5;
      var5 = var2230.get(29);
      this.glColor3iv = var5;
      var5 = var2230.get(30);
      this.glColor3fv = var5;
      var5 = var2230.get(31);
      this.glColor3dv = var5;
      var5 = var2230.get(32);
      this.glColor3ubv = var5;
      var5 = var2230.get(33);
      this.glColor3usv = var5;
      var5 = var2230.get(34);
      this.glColor3uiv = var5;
      var5 = var2230.get(35);
      this.glColor4b = var5;
      var5 = var2230.get(36);
      this.glColor4s = var5;
      var5 = var2230.get(37);
      this.glColor4i = var5;
      var5 = var2230.get(38);
      this.glColor4f = var5;
      var5 = var2230.get(39);
      this.glColor4d = var5;
      var5 = var2230.get(40);
      this.glColor4ub = var5;
      var5 = var2230.get(41);
      this.glColor4us = var5;
      var5 = var2230.get(42);
      this.glColor4ui = var5;
      var5 = var2230.get(43);
      this.glColor4bv = var5;
      var5 = var2230.get(44);
      this.glColor4sv = var5;
      var5 = var2230.get(45);
      this.glColor4iv = var5;
      var5 = var2230.get(46);
      this.glColor4fv = var5;
      var5 = var2230.get(47);
      this.glColor4dv = var5;
      var5 = var2230.get(48);
      this.glColor4ubv = var5;
      var5 = var2230.get(49);
      this.glColor4usv = var5;
      var5 = var2230.get(50);
      this.glColor4uiv = var5;
      var5 = var2230.get(51);
      this.glColorMask = var5;
      var5 = var2230.get(52);
      this.glColorMaterial = var5;
      var5 = var2230.get(53);
      this.glColorPointer = var5;
      var5 = var2230.get(54);
      this.glCopyPixels = var5;
      var5 = var2230.get(55);
      this.glCullFace = var5;
      var5 = var2230.get(56);
      this.glDeleteLists = var5;
      var5 = var2230.get(57);
      this.glDepthFunc = var5;
      var5 = var2230.get(58);
      this.glDepthMask = var5;
      var5 = var2230.get(59);
      this.glDepthRange = var5;
      var5 = var2230.get(60);
      this.glDisableClientState = var5;
      var5 = var2230.get(61);
      this.glDrawArrays = var5;
      var5 = var2230.get(62);
      this.glDrawBuffer = var5;
      var5 = var2230.get(63);
      this.glDrawElements = var5;
      var5 = var2230.get(64);
      this.glDrawPixels = var5;
      var5 = var2230.get(65);
      this.glEdgeFlag = var5;
      var5 = var2230.get(66);
      this.glEdgeFlagv = var5;
      var5 = var2230.get(67);
      this.glEdgeFlagPointer = var5;
      var5 = var2230.get(68);
      this.glEnableClientState = var5;
      var5 = var2230.get(69);
      this.glEnd = var5;
      var5 = var2230.get(70);
      this.glEvalCoord1f = var5;
      var5 = var2230.get(71);
      this.glEvalCoord1fv = var5;
      var5 = var2230.get(72);
      this.glEvalCoord1d = var5;
      var5 = var2230.get(73);
      this.glEvalCoord1dv = var5;
      var5 = var2230.get(74);
      this.glEvalCoord2f = var5;
      var5 = var2230.get(75);
      this.glEvalCoord2fv = var5;
      var5 = var2230.get(76);
      this.glEvalCoord2d = var5;
      var5 = var2230.get(77);
      this.glEvalCoord2dv = var5;
      var5 = var2230.get(78);
      this.glEvalMesh1 = var5;
      var5 = var2230.get(79);
      this.glEvalMesh2 = var5;
      var5 = var2230.get(80);
      this.glEvalPoint1 = var5;
      var5 = var2230.get(81);
      this.glEvalPoint2 = var5;
      var5 = var2230.get(82);
      this.glFeedbackBuffer = var5;
      var5 = var2230.get(83);
      this.glFinish = var5;
      var5 = var2230.get(84);
      this.glFlush = var5;
      var5 = var2230.get(85);
      this.glFogi = var5;
      var5 = var2230.get(86);
      this.glFogiv = var5;
      var5 = var2230.get(87);
      this.glFogf = var5;
      var5 = var2230.get(88);
      this.glFogfv = var5;
      var5 = var2230.get(89);
      this.glFrontFace = var5;
      var5 = var2230.get(90);
      this.glGenLists = var5;
      var5 = var2230.get(91);
      this.glGenTextures = var5;
      var5 = var2230.get(92);
      this.glDeleteTextures = var5;
      var5 = var2230.get(93);
      this.glGetClipPlane = var5;
      var5 = var2230.get(94);
      this.glGetBooleanv = var5;
      var5 = var2230.get(95);
      this.glGetFloatv = var5;
      var5 = var2230.get(96);
      this.glGetIntegerv = var5;
      var5 = var2230.get(97);
      this.glGetDoublev = var5;
      var5 = var2230.get(98);
      this.glGetError = var5;
      var5 = var2230.get(99);
      this.glGetLightiv = var5;
      var5 = var2230.get(100);
      this.glGetLightfv = var5;
      var5 = var2230.get(101);
      this.glGetMapiv = var5;
      var5 = var2230.get(102);
      this.glGetMapfv = var5;
      var5 = var2230.get(103);
      this.glGetMapdv = var5;
      var5 = var2230.get(104);
      this.glGetMaterialiv = var5;
      var5 = var2230.get(105);
      this.glGetMaterialfv = var5;
      var5 = var2230.get(106);
      this.glGetPixelMapfv = var5;
      var5 = var2230.get(107);
      this.glGetPixelMapusv = var5;
      var5 = var2230.get(108);
      this.glGetPixelMapuiv = var5;
      var5 = var2230.get(109);
      this.glGetPointerv = var5;
      var5 = var2230.get(110);
      this.glGetPolygonStipple = var5;
      var5 = var2230.get(111);
      this.glGetString = var5;
      var5 = var2230.get(112);
      this.glGetTexEnviv = var5;
      var5 = var2230.get(113);
      this.glGetTexEnvfv = var5;
      var5 = var2230.get(114);
      this.glGetTexGeniv = var5;
      var5 = var2230.get(115);
      this.glGetTexGenfv = var5;
      var5 = var2230.get(116);
      this.glGetTexGendv = var5;
      var5 = var2230.get(117);
      this.glGetTexImage = var5;
      var5 = var2230.get(118);
      this.glGetTexLevelParameteriv = var5;
      var5 = var2230.get(119);
      this.glGetTexLevelParameterfv = var5;
      var5 = var2230.get(120);
      this.glGetTexParameteriv = var5;
      var5 = var2230.get(121);
      this.glGetTexParameterfv = var5;
      var5 = var2230.get(122);
      this.glHint = var5;
      var5 = var2230.get(123);
      this.glIndexi = var5;
      var5 = var2230.get(124);
      this.glIndexub = var5;
      var5 = var2230.get(125);
      this.glIndexs = var5;
      var5 = var2230.get(126);
      this.glIndexf = var5;
      var5 = var2230.get(127);
      this.glIndexd = var5;
      var5 = var2230.get(128);
      this.glIndexiv = var5;
      var5 = var2230.get(129);
      this.glIndexubv = var5;
      var5 = var2230.get(130);
      this.glIndexsv = var5;
      var5 = var2230.get(131);
      this.glIndexfv = var5;
      var5 = var2230.get(132);
      this.glIndexdv = var5;
      var5 = var2230.get(133);
      this.glIndexMask = var5;
      var5 = var2230.get(134);
      this.glIndexPointer = var5;
      var5 = var2230.get(135);
      this.glInitNames = var5;
      var5 = var2230.get(136);
      this.glInterleavedArrays = var5;
      var5 = var2230.get(137);
      this.glIsEnabled = var5;
      var5 = var2230.get(138);
      this.glIsList = var5;
      var5 = var2230.get(139);
      this.glIsTexture = var5;
      var5 = var2230.get(140);
      this.glLightModeli = var5;
      var5 = var2230.get(141);
      this.glLightModelf = var5;
      var5 = var2230.get(142);
      this.glLightModeliv = var5;
      var5 = var2230.get(143);
      this.glLightModelfv = var5;
      var5 = var2230.get(144);
      this.glLighti = var5;
      var5 = var2230.get(145);
      this.glLightf = var5;
      var5 = var2230.get(146);
      this.glLightiv = var5;
      var5 = var2230.get(147);
      this.glLightfv = var5;
      var5 = var2230.get(148);
      this.glLineStipple = var5;
      var5 = var2230.get(149);
      this.glLineWidth = var5;
      var5 = var2230.get(150);
      this.glListBase = var5;
      var5 = var2230.get(151);
      this.glLoadMatrixf = var5;
      var5 = var2230.get(152);
      this.glLoadMatrixd = var5;
      var5 = var2230.get(153);
      this.glLoadIdentity = var5;
      var5 = var2230.get(154);
      this.glLoadName = var5;
      var5 = var2230.get(155);
      this.glLogicOp = var5;
      var5 = var2230.get(156);
      this.glMap1f = var5;
      var5 = var2230.get(157);
      this.glMap1d = var5;
      var5 = var2230.get(158);
      this.glMap2f = var5;
      var5 = var2230.get(159);
      this.glMap2d = var5;
      var5 = var2230.get(160);
      this.glMapGrid1f = var5;
      var5 = var2230.get(161);
      this.glMapGrid1d = var5;
      var5 = var2230.get(162);
      this.glMapGrid2f = var5;
      var5 = var2230.get(163);
      this.glMapGrid2d = var5;
      var5 = var2230.get(164);
      this.glMateriali = var5;
      var5 = var2230.get(165);
      this.glMaterialf = var5;
      var5 = var2230.get(166);
      this.glMaterialiv = var5;
      var5 = var2230.get(167);
      this.glMaterialfv = var5;
      var5 = var2230.get(168);
      this.glMatrixMode = var5;
      var5 = var2230.get(169);
      this.glMultMatrixf = var5;
      var5 = var2230.get(170);
      this.glMultMatrixd = var5;
      var5 = var2230.get(171);
      this.glFrustum = var5;
      var5 = var2230.get(172);
      this.glNewList = var5;
      var5 = var2230.get(173);
      this.glEndList = var5;
      var5 = var2230.get(174);
      this.glNormal3f = var5;
      var5 = var2230.get(175);
      this.glNormal3b = var5;
      var5 = var2230.get(176);
      this.glNormal3s = var5;
      var5 = var2230.get(177);
      this.glNormal3i = var5;
      var5 = var2230.get(178);
      this.glNormal3d = var5;
      var5 = var2230.get(179);
      this.glNormal3fv = var5;
      var5 = var2230.get(180);
      this.glNormal3bv = var5;
      var5 = var2230.get(181);
      this.glNormal3sv = var5;
      var5 = var2230.get(182);
      this.glNormal3iv = var5;
      var5 = var2230.get(183);
      this.glNormal3dv = var5;
      var5 = var2230.get(184);
      this.glNormalPointer = var5;
      var5 = var2230.get(185);
      this.glOrtho = var5;
      var5 = var2230.get(186);
      this.glPassThrough = var5;
      var5 = var2230.get(187);
      this.glPixelMapfv = var5;
      var5 = var2230.get(188);
      this.glPixelMapusv = var5;
      var5 = var2230.get(189);
      this.glPixelMapuiv = var5;
      var5 = var2230.get(190);
      this.glPixelStorei = var5;
      var5 = var2230.get(191);
      this.glPixelStoref = var5;
      var5 = var2230.get(192);
      this.glPixelTransferi = var5;
      var5 = var2230.get(193);
      this.glPixelTransferf = var5;
      var5 = var2230.get(194);
      this.glPixelZoom = var5;
      var5 = var2230.get(195);
      this.glPointSize = var5;
      var5 = var2230.get(196);
      this.glPolygonMode = var5;
      var5 = var2230.get(197);
      this.glPolygonOffset = var5;
      var5 = var2230.get(198);
      this.glPolygonStipple = var5;
      var5 = var2230.get(199);
      this.glPushAttrib = var5;
      var5 = var2230.get(200);
      this.glPushClientAttrib = var5;
      var5 = var2230.get(201);
      this.glPopAttrib = var5;
      var5 = var2230.get(202);
      this.glPopClientAttrib = var5;
      var5 = var2230.get(203);
      this.glPopMatrix = var5;
      var5 = var2230.get(204);
      this.glPopName = var5;
      var5 = var2230.get(205);
      this.glPrioritizeTextures = var5;
      var5 = var2230.get(206);
      this.glPushMatrix = var5;
      var5 = var2230.get(207);
      this.glPushName = var5;
      var5 = var2230.get(208);
      this.glRasterPos2i = var5;
      var5 = var2230.get(209);
      this.glRasterPos2s = var5;
      var5 = var2230.get(210);
      this.glRasterPos2f = var5;
      var5 = var2230.get(211);
      this.glRasterPos2d = var5;
      var5 = var2230.get(212);
      this.glRasterPos2iv = var5;
      var5 = var2230.get(213);
      this.glRasterPos2sv = var5;
      var5 = var2230.get(214);
      this.glRasterPos2fv = var5;
      var5 = var2230.get(215);
      this.glRasterPos2dv = var5;
      var5 = var2230.get(216);
      this.glRasterPos3i = var5;
      var5 = var2230.get(217);
      this.glRasterPos3s = var5;
      var5 = var2230.get(218);
      this.glRasterPos3f = var5;
      var5 = var2230.get(219);
      this.glRasterPos3d = var5;
      var5 = var2230.get(220);
      this.glRasterPos3iv = var5;
      var5 = var2230.get(221);
      this.glRasterPos3sv = var5;
      var5 = var2230.get(222);
      this.glRasterPos3fv = var5;
      var5 = var2230.get(223);
      this.glRasterPos3dv = var5;
      var5 = var2230.get(224);
      this.glRasterPos4i = var5;
      var5 = var2230.get(225);
      this.glRasterPos4s = var5;
      var5 = var2230.get(226);
      this.glRasterPos4f = var5;
      var5 = var2230.get(227);
      this.glRasterPos4d = var5;
      var5 = var2230.get(228);
      this.glRasterPos4iv = var5;
      var5 = var2230.get(229);
      this.glRasterPos4sv = var5;
      var5 = var2230.get(230);
      this.glRasterPos4fv = var5;
      var5 = var2230.get(231);
      this.glRasterPos4dv = var5;
      var5 = var2230.get(232);
      this.glReadBuffer = var5;
      var5 = var2230.get(233);
      this.glReadPixels = var5;
      var5 = var2230.get(234);
      this.glRecti = var5;
      var5 = var2230.get(235);
      this.glRects = var5;
      var5 = var2230.get(236);
      this.glRectf = var5;
      var5 = var2230.get(237);
      this.glRectd = var5;
      var5 = var2230.get(238);
      this.glRectiv = var5;
      var5 = var2230.get(239);
      this.glRectsv = var5;
      var5 = var2230.get(240);
      this.glRectfv = var5;
      var5 = var2230.get(241);
      this.glRectdv = var5;
      var5 = var2230.get(242);
      this.glRenderMode = var5;
      var5 = var2230.get(243);
      this.glRotatef = var5;
      var5 = var2230.get(244);
      this.glRotated = var5;
      var5 = var2230.get(245);
      this.glScalef = var5;
      var5 = var2230.get(246);
      this.glScaled = var5;
      var5 = var2230.get(247);
      this.glScissor = var5;
      var5 = var2230.get(248);
      this.glSelectBuffer = var5;
      var5 = var2230.get(249);
      this.glShadeModel = var5;
      var5 = var2230.get(250);
      this.glStencilFunc = var5;
      var5 = var2230.get(251);
      this.glStencilMask = var5;
      var5 = var2230.get(252);
      this.glStencilOp = var5;
      var5 = var2230.get(253);
      this.glTexCoord1f = var5;
      var5 = var2230.get(254);
      this.glTexCoord1s = var5;
      var5 = var2230.get(255);
      this.glTexCoord1i = var5;
      var5 = var2230.get(256);
      this.glTexCoord1d = var5;
      var5 = var2230.get(257);
      this.glTexCoord1fv = var5;
      var5 = var2230.get(258);
      this.glTexCoord1sv = var5;
      var5 = var2230.get(259);
      this.glTexCoord1iv = var5;
      var5 = var2230.get(260);
      this.glTexCoord1dv = var5;
      var5 = var2230.get(261);
      this.glTexCoord2f = var5;
      var5 = var2230.get(262);
      this.glTexCoord2s = var5;
      var5 = var2230.get(263);
      this.glTexCoord2i = var5;
      var5 = var2230.get(264);
      this.glTexCoord2d = var5;
      var5 = var2230.get(265);
      this.glTexCoord2fv = var5;
      var5 = var2230.get(266);
      this.glTexCoord2sv = var5;
      var5 = var2230.get(267);
      this.glTexCoord2iv = var5;
      var5 = var2230.get(268);
      this.glTexCoord2dv = var5;
      var5 = var2230.get(269);
      this.glTexCoord3f = var5;
      var5 = var2230.get(270);
      this.glTexCoord3s = var5;
      var5 = var2230.get(271);
      this.glTexCoord3i = var5;
      var5 = var2230.get(272);
      this.glTexCoord3d = var5;
      var5 = var2230.get(273);
      this.glTexCoord3fv = var5;
      var5 = var2230.get(274);
      this.glTexCoord3sv = var5;
      var5 = var2230.get(275);
      this.glTexCoord3iv = var5;
      var5 = var2230.get(276);
      this.glTexCoord3dv = var5;
      var5 = var2230.get(277);
      this.glTexCoord4f = var5;
      var5 = var2230.get(278);
      this.glTexCoord4s = var5;
      var5 = var2230.get(279);
      this.glTexCoord4i = var5;
      var5 = var2230.get(280);
      this.glTexCoord4d = var5;
      var5 = var2230.get(281);
      this.glTexCoord4fv = var5;
      var5 = var2230.get(282);
      this.glTexCoord4sv = var5;
      var5 = var2230.get(283);
      this.glTexCoord4iv = var5;
      var5 = var2230.get(284);
      this.glTexCoord4dv = var5;
      var5 = var2230.get(285);
      this.glTexCoordPointer = var5;
      var5 = var2230.get(286);
      this.glTexEnvi = var5;
      var5 = var2230.get(287);
      this.glTexEnviv = var5;
      var5 = var2230.get(288);
      this.glTexEnvf = var5;
      var5 = var2230.get(289);
      this.glTexEnvfv = var5;
      var5 = var2230.get(290);
      this.glTexGeni = var5;
      var5 = var2230.get(291);
      this.glTexGeniv = var5;
      var5 = var2230.get(292);
      this.glTexGenf = var5;
      var5 = var2230.get(293);
      this.glTexGenfv = var5;
      var5 = var2230.get(294);
      this.glTexGend = var5;
      var5 = var2230.get(295);
      this.glTexGendv = var5;
      var5 = var2230.get(296);
      this.glTexImage1D = var5;
      var5 = var2230.get(297);
      this.glTexImage2D = var5;
      var5 = var2230.get(298);
      this.glCopyTexImage1D = var5;
      var5 = var2230.get(299);
      this.glCopyTexImage2D = var5;
      var5 = var2230.get(300);
      this.glCopyTexSubImage1D = var5;
      var5 = var2230.get(301);
      this.glCopyTexSubImage2D = var5;
      var5 = var2230.get(302);
      this.glTexParameteri = var5;
      var5 = var2230.get(303);
      this.glTexParameteriv = var5;
      var5 = var2230.get(304);
      this.glTexParameterf = var5;
      var5 = var2230.get(305);
      this.glTexParameterfv = var5;
      var5 = var2230.get(306);
      this.glTexSubImage1D = var5;
      var5 = var2230.get(307);
      this.glTexSubImage2D = var5;
      var5 = var2230.get(308);
      this.glTranslatef = var5;
      var5 = var2230.get(309);
      this.glTranslated = var5;
      var5 = var2230.get(310);
      this.glVertex2f = var5;
      var5 = var2230.get(311);
      this.glVertex2s = var5;
      var5 = var2230.get(312);
      this.glVertex2i = var5;
      var5 = var2230.get(313);
      this.glVertex2d = var5;
      var5 = var2230.get(314);
      this.glVertex2fv = var5;
      var5 = var2230.get(315);
      this.glVertex2sv = var5;
      var5 = var2230.get(316);
      this.glVertex2iv = var5;
      var5 = var2230.get(317);
      this.glVertex2dv = var5;
      var5 = var2230.get(318);
      this.glVertex3f = var5;
      var5 = var2230.get(319);
      this.glVertex3s = var5;
      var5 = var2230.get(320);
      this.glVertex3i = var5;
      var5 = var2230.get(321);
      this.glVertex3d = var5;
      var5 = var2230.get(322);
      this.glVertex3fv = var5;
      var5 = var2230.get(323);
      this.glVertex3sv = var5;
      var5 = var2230.get(324);
      this.glVertex3iv = var5;
      var5 = var2230.get(325);
      this.glVertex3dv = var5;
      var5 = var2230.get(326);
      this.glVertex4f = var5;
      var5 = var2230.get(327);
      this.glVertex4s = var5;
      var5 = var2230.get(328);
      this.glVertex4i = var5;
      var5 = var2230.get(329);
      this.glVertex4d = var5;
      var5 = var2230.get(330);
      this.glVertex4fv = var5;
      var5 = var2230.get(331);
      this.glVertex4sv = var5;
      var5 = var2230.get(332);
      this.glVertex4iv = var5;
      var5 = var2230.get(333);
      this.glVertex4dv = var5;
      var5 = var2230.get(334);
      this.glVertexPointer = var5;
      var5 = var2230.get(335);
      this.glViewport = var5;
      var5 = var2230.get(336);
      this.glTexImage3D = var5;
      var5 = var2230.get(337);
      this.glTexSubImage3D = var5;
      var5 = var2230.get(338);
      this.glCopyTexSubImage3D = var5;
      var5 = var2230.get(339);
      this.glDrawRangeElements = var5;
      var5 = var2230.get(340);
      this.glCompressedTexImage3D = var5;
      var5 = var2230.get(341);
      this.glCompressedTexImage2D = var5;
      var5 = var2230.get(342);
      this.glCompressedTexImage1D = var5;
      var5 = var2230.get(343);
      this.glCompressedTexSubImage3D = var5;
      var5 = var2230.get(344);
      this.glCompressedTexSubImage2D = var5;
      var5 = var2230.get(345);
      this.glCompressedTexSubImage1D = var5;
      var5 = var2230.get(346);
      this.glGetCompressedTexImage = var5;
      var5 = var2230.get(347);
      this.glSampleCoverage = var5;
      var5 = var2230.get(348);
      this.glActiveTexture = var5;
      var5 = var2230.get(349);
      this.glClientActiveTexture = var5;
      var5 = var2230.get(350);
      this.glMultiTexCoord1f = var5;
      var5 = var2230.get(351);
      this.glMultiTexCoord1s = var5;
      var5 = var2230.get(352);
      this.glMultiTexCoord1i = var5;
      var5 = var2230.get(353);
      this.glMultiTexCoord1d = var5;
      var5 = var2230.get(354);
      this.glMultiTexCoord1fv = var5;
      var5 = var2230.get(355);
      this.glMultiTexCoord1sv = var5;
      var5 = var2230.get(356);
      this.glMultiTexCoord1iv = var5;
      var5 = var2230.get(357);
      this.glMultiTexCoord1dv = var5;
      var5 = var2230.get(358);
      this.glMultiTexCoord2f = var5;
      var5 = var2230.get(359);
      this.glMultiTexCoord2s = var5;
      var5 = var2230.get(360);
      this.glMultiTexCoord2i = var5;
      var5 = var2230.get(361);
      this.glMultiTexCoord2d = var5;
      var5 = var2230.get(362);
      this.glMultiTexCoord2fv = var5;
      var5 = var2230.get(363);
      this.glMultiTexCoord2sv = var5;
      var5 = var2230.get(364);
      this.glMultiTexCoord2iv = var5;
      var5 = var2230.get(365);
      this.glMultiTexCoord2dv = var5;
      var5 = var2230.get(366);
      this.glMultiTexCoord3f = var5;
      var5 = var2230.get(367);
      this.glMultiTexCoord3s = var5;
      var5 = var2230.get(368);
      this.glMultiTexCoord3i = var5;
      var5 = var2230.get(369);
      this.glMultiTexCoord3d = var5;
      var5 = var2230.get(370);
      this.glMultiTexCoord3fv = var5;
      var5 = var2230.get(371);
      this.glMultiTexCoord3sv = var5;
      var5 = var2230.get(372);
      this.glMultiTexCoord3iv = var5;
      var5 = var2230.get(373);
      this.glMultiTexCoord3dv = var5;
      var5 = var2230.get(374);
      this.glMultiTexCoord4f = var5;
      var5 = var2230.get(375);
      this.glMultiTexCoord4s = var5;
      var5 = var2230.get(376);
      this.glMultiTexCoord4i = var5;
      var5 = var2230.get(377);
      this.glMultiTexCoord4d = var5;
      var5 = var2230.get(378);
      this.glMultiTexCoord4fv = var5;
      var5 = var2230.get(379);
      this.glMultiTexCoord4sv = var5;
      var5 = var2230.get(380);
      this.glMultiTexCoord4iv = var5;
      var5 = var2230.get(381);
      this.glMultiTexCoord4dv = var5;
      var5 = var2230.get(382);
      this.glLoadTransposeMatrixf = var5;
      var5 = var2230.get(383);
      this.glLoadTransposeMatrixd = var5;
      var5 = var2230.get(384);
      this.glMultTransposeMatrixf = var5;
      var5 = var2230.get(385);
      this.glMultTransposeMatrixd = var5;
      var5 = var2230.get(386);
      this.glBlendColor = var5;
      var5 = var2230.get(387);
      this.glBlendEquation = var5;
      var5 = var2230.get(388);
      this.glFogCoordf = var5;
      var5 = var2230.get(389);
      this.glFogCoordd = var5;
      var5 = var2230.get(390);
      this.glFogCoordfv = var5;
      var5 = var2230.get(391);
      this.glFogCoorddv = var5;
      var5 = var2230.get(392);
      this.glFogCoordPointer = var5;
      var5 = var2230.get(393);
      this.glMultiDrawArrays = var5;
      var5 = var2230.get(394);
      this.glMultiDrawElements = var5;
      var5 = var2230.get(395);
      this.glPointParameterf = var5;
      var5 = var2230.get(396);
      this.glPointParameteri = var5;
      var5 = var2230.get(397);
      this.glPointParameterfv = var5;
      var5 = var2230.get(398);
      this.glPointParameteriv = var5;
      var5 = var2230.get(399);
      this.glSecondaryColor3b = var5;
      var5 = var2230.get(400);
      this.glSecondaryColor3s = var5;
      var5 = var2230.get(401);
      this.glSecondaryColor3i = var5;
      var5 = var2230.get(402);
      this.glSecondaryColor3f = var5;
      var5 = var2230.get(403);
      this.glSecondaryColor3d = var5;
      var5 = var2230.get(404);
      this.glSecondaryColor3ub = var5;
      var5 = var2230.get(405);
      this.glSecondaryColor3us = var5;
      var5 = var2230.get(406);
      this.glSecondaryColor3ui = var5;
      var5 = var2230.get(407);
      this.glSecondaryColor3bv = var5;
      var5 = var2230.get(408);
      this.glSecondaryColor3sv = var5;
      var5 = var2230.get(409);
      this.glSecondaryColor3iv = var5;
      var5 = var2230.get(410);
      this.glSecondaryColor3fv = var5;
      var5 = var2230.get(411);
      this.glSecondaryColor3dv = var5;
      var5 = var2230.get(412);
      this.glSecondaryColor3ubv = var5;
      var5 = var2230.get(413);
      this.glSecondaryColor3usv = var5;
      var5 = var2230.get(414);
      this.glSecondaryColor3uiv = var5;
      var5 = var2230.get(415);
      this.glSecondaryColorPointer = var5;
      var5 = var2230.get(416);
      this.glBlendFuncSeparate = var5;
      var5 = var2230.get(417);
      this.glWindowPos2i = var5;
      var5 = var2230.get(418);
      this.glWindowPos2s = var5;
      var5 = var2230.get(419);
      this.glWindowPos2f = var5;
      var5 = var2230.get(420);
      this.glWindowPos2d = var5;
      var5 = var2230.get(421);
      this.glWindowPos2iv = var5;
      var5 = var2230.get(422);
      this.glWindowPos2sv = var5;
      var5 = var2230.get(423);
      this.glWindowPos2fv = var5;
      var5 = var2230.get(424);
      this.glWindowPos2dv = var5;
      var5 = var2230.get(425);
      this.glWindowPos3i = var5;
      var5 = var2230.get(426);
      this.glWindowPos3s = var5;
      var5 = var2230.get(427);
      this.glWindowPos3f = var5;
      var5 = var2230.get(428);
      this.glWindowPos3d = var5;
      var5 = var2230.get(429);
      this.glWindowPos3iv = var5;
      var5 = var2230.get(430);
      this.glWindowPos3sv = var5;
      var5 = var2230.get(431);
      this.glWindowPos3fv = var5;
      var5 = var2230.get(432);
      this.glWindowPos3dv = var5;
      var5 = var2230.get(433);
      this.glBindBuffer = var5;
      var5 = var2230.get(434);
      this.glDeleteBuffers = var5;
      var5 = var2230.get(435);
      this.glGenBuffers = var5;
      var5 = var2230.get(436);
      this.glIsBuffer = var5;
      var5 = var2230.get(437);
      this.glBufferData = var5;
      var5 = var2230.get(438);
      this.glBufferSubData = var5;
      var5 = var2230.get(439);
      this.glGetBufferSubData = var5;
      var5 = var2230.get(440);
      this.glMapBuffer = var5;
      var5 = var2230.get(441);
      this.glUnmapBuffer = var5;
      var5 = var2230.get(442);
      this.glGetBufferParameteriv = var5;
      var5 = var2230.get(443);
      this.glGetBufferPointerv = var5;
      var5 = var2230.get(444);
      this.glGenQueries = var5;
      var5 = var2230.get(445);
      this.glDeleteQueries = var5;
      var5 = var2230.get(446);
      this.glIsQuery = var5;
      var5 = var2230.get(447);
      this.glBeginQuery = var5;
      var5 = var2230.get(448);
      this.glEndQuery = var5;
      var5 = var2230.get(449);
      this.glGetQueryiv = var5;
      var5 = var2230.get(450);
      this.glGetQueryObjectiv = var5;
      var5 = var2230.get(451);
      this.glGetQueryObjectuiv = var5;
      var5 = var2230.get(452);
      this.glCreateProgram = var5;
      var5 = var2230.get(453);
      this.glDeleteProgram = var5;
      var5 = var2230.get(454);
      this.glIsProgram = var5;
      var5 = var2230.get(455);
      this.glCreateShader = var5;
      var5 = var2230.get(456);
      this.glDeleteShader = var5;
      var5 = var2230.get(457);
      this.glIsShader = var5;
      var5 = var2230.get(458);
      this.glAttachShader = var5;
      var5 = var2230.get(459);
      this.glDetachShader = var5;
      var5 = var2230.get(460);
      this.glShaderSource = var5;
      var5 = var2230.get(461);
      this.glCompileShader = var5;
      var5 = var2230.get(462);
      this.glLinkProgram = var5;
      var5 = var2230.get(463);
      this.glUseProgram = var5;
      var5 = var2230.get(464);
      this.glValidateProgram = var5;
      var5 = var2230.get(465);
      this.glUniform1f = var5;
      var5 = var2230.get(466);
      this.glUniform2f = var5;
      var5 = var2230.get(467);
      this.glUniform3f = var5;
      var5 = var2230.get(468);
      this.glUniform4f = var5;
      var5 = var2230.get(469);
      this.glUniform1i = var5;
      var5 = var2230.get(470);
      this.glUniform2i = var5;
      var5 = var2230.get(471);
      this.glUniform3i = var5;
      var5 = var2230.get(472);
      this.glUniform4i = var5;
      var5 = var2230.get(473);
      this.glUniform1fv = var5;
      var5 = var2230.get(474);
      this.glUniform2fv = var5;
      var5 = var2230.get(475);
      this.glUniform3fv = var5;
      var5 = var2230.get(476);
      this.glUniform4fv = var5;
      var5 = var2230.get(477);
      this.glUniform1iv = var5;
      var5 = var2230.get(478);
      this.glUniform2iv = var5;
      var5 = var2230.get(479);
      this.glUniform3iv = var5;
      var5 = var2230.get(480);
      this.glUniform4iv = var5;
      var5 = var2230.get(481);
      this.glUniformMatrix2fv = var5;
      var5 = var2230.get(482);
      this.glUniformMatrix3fv = var5;
      var5 = var2230.get(483);
      this.glUniformMatrix4fv = var5;
      var5 = var2230.get(484);
      this.glGetShaderiv = var5;
      var5 = var2230.get(485);
      this.glGetProgramiv = var5;
      var5 = var2230.get(486);
      this.glGetShaderInfoLog = var5;
      var5 = var2230.get(487);
      this.glGetProgramInfoLog = var5;
      var5 = var2230.get(488);
      this.glGetAttachedShaders = var5;
      var5 = var2230.get(489);
      this.glGetUniformLocation = var5;
      var5 = var2230.get(490);
      this.glGetActiveUniform = var5;
      var5 = var2230.get(491);
      this.glGetUniformfv = var5;
      var5 = var2230.get(492);
      this.glGetUniformiv = var5;
      var5 = var2230.get(493);
      this.glGetShaderSource = var5;
      var5 = var2230.get(494);
      this.glVertexAttrib1f = var5;
      var5 = var2230.get(495);
      this.glVertexAttrib1s = var5;
      var5 = var2230.get(496);
      this.glVertexAttrib1d = var5;
      var5 = var2230.get(497);
      this.glVertexAttrib2f = var5;
      var5 = var2230.get(498);
      this.glVertexAttrib2s = var5;
      var5 = var2230.get(499);
      this.glVertexAttrib2d = var5;
      var5 = var2230.get(500);
      this.glVertexAttrib3f = var5;
      var5 = var2230.get(501);
      this.glVertexAttrib3s = var5;
      var5 = var2230.get(502);
      this.glVertexAttrib3d = var5;
      var5 = var2230.get(503);
      this.glVertexAttrib4f = var5;
      var5 = var2230.get(504);
      this.glVertexAttrib4s = var5;
      var5 = var2230.get(505);
      this.glVertexAttrib4d = var5;
      var5 = var2230.get(506);
      this.glVertexAttrib4Nub = var5;
      var5 = var2230.get(507);
      this.glVertexAttrib1fv = var5;
      var5 = var2230.get(508);
      this.glVertexAttrib1sv = var5;
      var5 = var2230.get(509);
      this.glVertexAttrib1dv = var5;
      var5 = var2230.get(510);
      this.glVertexAttrib2fv = var5;
      var5 = var2230.get(511);
      this.glVertexAttrib2sv = var5;
      var5 = var2230.get(512);
      this.glVertexAttrib2dv = var5;
      var5 = var2230.get(513);
      this.glVertexAttrib3fv = var5;
      var5 = var2230.get(514);
      this.glVertexAttrib3sv = var5;
      var5 = var2230.get(515);
      this.glVertexAttrib3dv = var5;
      var5 = var2230.get(516);
      this.glVertexAttrib4fv = var5;
      var5 = var2230.get(517);
      this.glVertexAttrib4sv = var5;
      var5 = var2230.get(518);
      this.glVertexAttrib4dv = var5;
      var5 = var2230.get(519);
      this.glVertexAttrib4iv = var5;
      var5 = var2230.get(520);
      this.glVertexAttrib4bv = var5;
      var5 = var2230.get(521);
      this.glVertexAttrib4ubv = var5;
      var5 = var2230.get(522);
      this.glVertexAttrib4usv = var5;
      var5 = var2230.get(523);
      this.glVertexAttrib4uiv = var5;
      var5 = var2230.get(524);
      this.glVertexAttrib4Nbv = var5;
      var5 = var2230.get(525);
      this.glVertexAttrib4Nsv = var5;
      var5 = var2230.get(526);
      this.glVertexAttrib4Niv = var5;
      var5 = var2230.get(527);
      this.glVertexAttrib4Nubv = var5;
      var5 = var2230.get(528);
      this.glVertexAttrib4Nusv = var5;
      var5 = var2230.get(529);
      this.glVertexAttrib4Nuiv = var5;
      var5 = var2230.get(530);
      this.glVertexAttribPointer = var5;
      var5 = var2230.get(531);
      this.glEnableVertexAttribArray = var5;
      var5 = var2230.get(532);
      this.glDisableVertexAttribArray = var5;
      var5 = var2230.get(533);
      this.glBindAttribLocation = var5;
      var5 = var2230.get(534);
      this.glGetActiveAttrib = var5;
      var5 = var2230.get(535);
      this.glGetAttribLocation = var5;
      var5 = var2230.get(536);
      this.glGetVertexAttribiv = var5;
      var5 = var2230.get(537);
      this.glGetVertexAttribfv = var5;
      var5 = var2230.get(538);
      this.glGetVertexAttribdv = var5;
      var5 = var2230.get(539);
      this.glGetVertexAttribPointerv = var5;
      var5 = var2230.get(540);
      this.glDrawBuffers = var5;
      var5 = var2230.get(541);
      this.glBlendEquationSeparate = var5;
      var5 = var2230.get(542);
      this.glStencilOpSeparate = var5;
      var5 = var2230.get(543);
      this.glStencilFuncSeparate = var5;
      var5 = var2230.get(544);
      this.glStencilMaskSeparate = var5;
      var5 = var2230.get(545);
      this.glUniformMatrix2x3fv = var5;
      var5 = var2230.get(546);
      this.glUniformMatrix3x2fv = var5;
      var5 = var2230.get(547);
      this.glUniformMatrix2x4fv = var5;
      var5 = var2230.get(548);
      this.glUniformMatrix4x2fv = var5;
      var5 = var2230.get(549);
      this.glUniformMatrix3x4fv = var5;
      var5 = var2230.get(550);
      this.glUniformMatrix4x3fv = var5;
      var5 = var2230.get(551);
      this.glGetStringi = var5;
      var5 = var2230.get(552);
      this.glClearBufferiv = var5;
      var5 = var2230.get(553);
      this.glClearBufferuiv = var5;
      var5 = var2230.get(554);
      this.glClearBufferfv = var5;
      var5 = var2230.get(555);
      this.glClearBufferfi = var5;
      var5 = var2230.get(556);
      this.glVertexAttribI1i = var5;
      var5 = var2230.get(557);
      this.glVertexAttribI2i = var5;
      var5 = var2230.get(558);
      this.glVertexAttribI3i = var5;
      var5 = var2230.get(559);
      this.glVertexAttribI4i = var5;
      var5 = var2230.get(560);
      this.glVertexAttribI1ui = var5;
      var5 = var2230.get(561);
      this.glVertexAttribI2ui = var5;
      var5 = var2230.get(562);
      this.glVertexAttribI3ui = var5;
      var5 = var2230.get(563);
      this.glVertexAttribI4ui = var5;
      var5 = var2230.get(564);
      this.glVertexAttribI1iv = var5;
      var5 = var2230.get(565);
      this.glVertexAttribI2iv = var5;
      var5 = var2230.get(566);
      this.glVertexAttribI3iv = var5;
      var5 = var2230.get(567);
      this.glVertexAttribI4iv = var5;
      var5 = var2230.get(568);
      this.glVertexAttribI1uiv = var5;
      var5 = var2230.get(569);
      this.glVertexAttribI2uiv = var5;
      var5 = var2230.get(570);
      this.glVertexAttribI3uiv = var5;
      var5 = var2230.get(571);
      this.glVertexAttribI4uiv = var5;
      var5 = var2230.get(572);
      this.glVertexAttribI4bv = var5;
      var5 = var2230.get(573);
      this.glVertexAttribI4sv = var5;
      var5 = var2230.get(574);
      this.glVertexAttribI4ubv = var5;
      var5 = var2230.get(575);
      this.glVertexAttribI4usv = var5;
      var5 = var2230.get(576);
      this.glVertexAttribIPointer = var5;
      var5 = var2230.get(577);
      this.glGetVertexAttribIiv = var5;
      var5 = var2230.get(578);
      this.glGetVertexAttribIuiv = var5;
      var5 = var2230.get(579);
      this.glUniform1ui = var5;
      var5 = var2230.get(580);
      this.glUniform2ui = var5;
      var5 = var2230.get(581);
      this.glUniform3ui = var5;
      var5 = var2230.get(582);
      this.glUniform4ui = var5;
      var5 = var2230.get(583);
      this.glUniform1uiv = var5;
      var5 = var2230.get(584);
      this.glUniform2uiv = var5;
      var5 = var2230.get(585);
      this.glUniform3uiv = var5;
      var5 = var2230.get(586);
      this.glUniform4uiv = var5;
      var5 = var2230.get(587);
      this.glGetUniformuiv = var5;
      var5 = var2230.get(588);
      this.glBindFragDataLocation = var5;
      var5 = var2230.get(589);
      this.glGetFragDataLocation = var5;
      var5 = var2230.get(590);
      this.glBeginConditionalRender = var5;
      var5 = var2230.get(591);
      this.glEndConditionalRender = var5;
      var5 = var2230.get(592);
      this.glMapBufferRange = var5;
      var5 = var2230.get(593);
      this.glFlushMappedBufferRange = var5;
      var5 = var2230.get(594);
      this.glClampColor = var5;
      var5 = var2230.get(595);
      this.glIsRenderbuffer = var5;
      var5 = var2230.get(596);
      this.glBindRenderbuffer = var5;
      var5 = var2230.get(597);
      this.glDeleteRenderbuffers = var5;
      var5 = var2230.get(598);
      this.glGenRenderbuffers = var5;
      var5 = var2230.get(599);
      this.glRenderbufferStorage = var5;
      var5 = var2230.get(600);
      this.glRenderbufferStorageMultisample = var5;
      var5 = var2230.get(601);
      this.glGetRenderbufferParameteriv = var5;
      var5 = var2230.get(602);
      this.glIsFramebuffer = var5;
      var5 = var2230.get(603);
      this.glBindFramebuffer = var5;
      var5 = var2230.get(604);
      this.glDeleteFramebuffers = var5;
      var5 = var2230.get(605);
      this.glGenFramebuffers = var5;
      var5 = var2230.get(606);
      this.glCheckFramebufferStatus = var5;
      var5 = var2230.get(607);
      this.glFramebufferTexture1D = var5;
      var5 = var2230.get(608);
      this.glFramebufferTexture2D = var5;
      var5 = var2230.get(609);
      this.glFramebufferTexture3D = var5;
      var5 = var2230.get(610);
      this.glFramebufferTextureLayer = var5;
      var5 = var2230.get(611);
      this.glFramebufferRenderbuffer = var5;
      var5 = var2230.get(612);
      this.glGetFramebufferAttachmentParameteriv = var5;
      var5 = var2230.get(613);
      this.glBlitFramebuffer = var5;
      var5 = var2230.get(614);
      this.glGenerateMipmap = var5;
      var5 = var2230.get(615);
      this.glTexParameterIiv = var5;
      var5 = var2230.get(616);
      this.glTexParameterIuiv = var5;
      var5 = var2230.get(617);
      this.glGetTexParameterIiv = var5;
      var5 = var2230.get(618);
      this.glGetTexParameterIuiv = var5;
      var5 = var2230.get(619);
      this.glColorMaski = var5;
      var5 = var2230.get(620);
      this.glGetBooleani_v = var5;
      var5 = var2230.get(621);
      this.glGetIntegeri_v = var5;
      var5 = var2230.get(622);
      this.glEnablei = var5;
      var5 = var2230.get(623);
      this.glDisablei = var5;
      var5 = var2230.get(624);
      this.glIsEnabledi = var5;
      var5 = var2230.get(625);
      this.glBindBufferRange = var5;
      var5 = var2230.get(626);
      this.glBindBufferBase = var5;
      var5 = var2230.get(627);
      this.glBeginTransformFeedback = var5;
      var5 = var2230.get(628);
      this.glEndTransformFeedback = var5;
      var5 = var2230.get(629);
      this.glTransformFeedbackVaryings = var5;
      var5 = var2230.get(630);
      this.glGetTransformFeedbackVarying = var5;
      var5 = var2230.get(631);
      this.glBindVertexArray = var5;
      var5 = var2230.get(632);
      this.glDeleteVertexArrays = var5;
      var5 = var2230.get(633);
      this.glGenVertexArrays = var5;
      var5 = var2230.get(634);
      this.glIsVertexArray = var5;
      var5 = var2230.get(635);
      this.glDrawArraysInstanced = var5;
      var5 = var2230.get(636);
      this.glDrawElementsInstanced = var5;
      var5 = var2230.get(637);
      this.glCopyBufferSubData = var5;
      var5 = var2230.get(638);
      this.glPrimitiveRestartIndex = var5;
      var5 = var2230.get(639);
      this.glTexBuffer = var5;
      var5 = var2230.get(640);
      this.glGetUniformIndices = var5;
      var5 = var2230.get(641);
      this.glGetActiveUniformsiv = var5;
      var5 = var2230.get(642);
      this.glGetActiveUniformName = var5;
      var5 = var2230.get(643);
      this.glGetUniformBlockIndex = var5;
      var5 = var2230.get(644);
      this.glGetActiveUniformBlockiv = var5;
      var5 = var2230.get(645);
      this.glGetActiveUniformBlockName = var5;
      var5 = var2230.get(646);
      this.glUniformBlockBinding = var5;
      var5 = var2230.get(647);
      this.glGetBufferParameteri64v = var5;
      var5 = var2230.get(648);
      this.glDrawElementsBaseVertex = var5;
      var5 = var2230.get(649);
      this.glDrawRangeElementsBaseVertex = var5;
      var5 = var2230.get(650);
      this.glDrawElementsInstancedBaseVertex = var5;
      var5 = var2230.get(651);
      this.glMultiDrawElementsBaseVertex = var5;
      var5 = var2230.get(652);
      this.glProvokingVertex = var5;
      var5 = var2230.get(653);
      this.glTexImage2DMultisample = var5;
      var5 = var2230.get(654);
      this.glTexImage3DMultisample = var5;
      var5 = var2230.get(655);
      this.glGetMultisamplefv = var5;
      var5 = var2230.get(656);
      this.glSampleMaski = var5;
      var5 = var2230.get(657);
      this.glFramebufferTexture = var5;
      var5 = var2230.get(658);
      this.glFenceSync = var5;
      var5 = var2230.get(659);
      this.glIsSync = var5;
      var5 = var2230.get(660);
      this.glDeleteSync = var5;
      var5 = var2230.get(661);
      this.glClientWaitSync = var5;
      var5 = var2230.get(662);
      this.glWaitSync = var5;
      var5 = var2230.get(663);
      this.glGetInteger64v = var5;
      var5 = var2230.get(664);
      this.glGetInteger64i_v = var5;
      var5 = var2230.get(665);
      this.glGetSynciv = var5;
      var5 = var2230.get(666);
      this.glBindFragDataLocationIndexed = var5;
      var5 = var2230.get(667);
      this.glGetFragDataIndex = var5;
      var5 = var2230.get(668);
      this.glGenSamplers = var5;
      var5 = var2230.get(669);
      this.glDeleteSamplers = var5;
      var5 = var2230.get(670);
      this.glIsSampler = var5;
      var5 = var2230.get(671);
      this.glBindSampler = var5;
      var5 = var2230.get(672);
      this.glSamplerParameteri = var5;
      var5 = var2230.get(673);
      this.glSamplerParameterf = var5;
      var5 = var2230.get(674);
      this.glSamplerParameteriv = var5;
      var5 = var2230.get(675);
      this.glSamplerParameterfv = var5;
      var5 = var2230.get(676);
      this.glSamplerParameterIiv = var5;
      var5 = var2230.get(677);
      this.glSamplerParameterIuiv = var5;
      var5 = var2230.get(678);
      this.glGetSamplerParameteriv = var5;
      var5 = var2230.get(679);
      this.glGetSamplerParameterfv = var5;
      var5 = var2230.get(680);
      this.glGetSamplerParameterIiv = var5;
      var5 = var2230.get(681);
      this.glGetSamplerParameterIuiv = var5;
      var5 = var2230.get(682);
      this.glQueryCounter = var5;
      var5 = var2230.get(683);
      this.glGetQueryObjecti64v = var5;
      var5 = var2230.get(684);
      this.glGetQueryObjectui64v = var5;
      var5 = var2230.get(685);
      this.glVertexAttribDivisor = var5;
      var5 = var2230.get(686);
      this.glVertexP2ui = var5;
      var5 = var2230.get(687);
      this.glVertexP3ui = var5;
      var5 = var2230.get(688);
      this.glVertexP4ui = var5;
      var5 = var2230.get(689);
      this.glVertexP2uiv = var5;
      var5 = var2230.get(690);
      this.glVertexP3uiv = var5;
      var5 = var2230.get(691);
      this.glVertexP4uiv = var5;
      var5 = var2230.get(692);
      this.glTexCoordP1ui = var5;
      var5 = var2230.get(693);
      this.glTexCoordP2ui = var5;
      var5 = var2230.get(694);
      this.glTexCoordP3ui = var5;
      var5 = var2230.get(695);
      this.glTexCoordP4ui = var5;
      var5 = var2230.get(696);
      this.glTexCoordP1uiv = var5;
      var5 = var2230.get(697);
      this.glTexCoordP2uiv = var5;
      var5 = var2230.get(698);
      this.glTexCoordP3uiv = var5;
      var5 = var2230.get(699);
      this.glTexCoordP4uiv = var5;
      var5 = var2230.get(700);
      this.glMultiTexCoordP1ui = var5;
      var5 = var2230.get(701);
      this.glMultiTexCoordP2ui = var5;
      var5 = var2230.get(702);
      this.glMultiTexCoordP3ui = var5;
      var5 = var2230.get(703);
      this.glMultiTexCoordP4ui = var5;
      var5 = var2230.get(704);
      this.glMultiTexCoordP1uiv = var5;
      var5 = var2230.get(705);
      this.glMultiTexCoordP2uiv = var5;
      var5 = var2230.get(706);
      this.glMultiTexCoordP3uiv = var5;
      var5 = var2230.get(707);
      this.glMultiTexCoordP4uiv = var5;
      var5 = var2230.get(708);
      this.glNormalP3ui = var5;
      var5 = var2230.get(709);
      this.glNormalP3uiv = var5;
      var5 = var2230.get(710);
      this.glColorP3ui = var5;
      var5 = var2230.get(711);
      this.glColorP4ui = var5;
      var5 = var2230.get(712);
      this.glColorP3uiv = var5;
      var5 = var2230.get(713);
      this.glColorP4uiv = var5;
      var5 = var2230.get(714);
      this.glSecondaryColorP3ui = var5;
      var5 = var2230.get(715);
      this.glSecondaryColorP3uiv = var5;
      var5 = var2230.get(716);
      this.glVertexAttribP1ui = var5;
      var5 = var2230.get(717);
      this.glVertexAttribP2ui = var5;
      var5 = var2230.get(718);
      this.glVertexAttribP3ui = var5;
      var5 = var2230.get(719);
      this.glVertexAttribP4ui = var5;
      var5 = var2230.get(720);
      this.glVertexAttribP1uiv = var5;
      var5 = var2230.get(721);
      this.glVertexAttribP2uiv = var5;
      var5 = var2230.get(722);
      this.glVertexAttribP3uiv = var5;
      var5 = var2230.get(723);
      this.glVertexAttribP4uiv = var5;
      var5 = var2230.get(724);
      this.glBlendEquationi = var5;
      var5 = var2230.get(725);
      this.glBlendEquationSeparatei = var5;
      var5 = var2230.get(726);
      this.glBlendFunci = var5;
      var5 = var2230.get(727);
      this.glBlendFuncSeparatei = var5;
      var5 = var2230.get(728);
      this.glDrawArraysIndirect = var5;
      var5 = var2230.get(729);
      this.glDrawElementsIndirect = var5;
      var5 = var2230.get(730);
      this.glUniform1d = var5;
      var5 = var2230.get(731);
      this.glUniform2d = var5;
      var5 = var2230.get(732);
      this.glUniform3d = var5;
      var5 = var2230.get(733);
      this.glUniform4d = var5;
      var5 = var2230.get(734);
      this.glUniform1dv = var5;
      var5 = var2230.get(735);
      this.glUniform2dv = var5;
      var5 = var2230.get(736);
      this.glUniform3dv = var5;
      var5 = var2230.get(737);
      this.glUniform4dv = var5;
      var5 = var2230.get(738);
      this.glUniformMatrix2dv = var5;
      var5 = var2230.get(739);
      this.glUniformMatrix3dv = var5;
      var5 = var2230.get(740);
      this.glUniformMatrix4dv = var5;
      var5 = var2230.get(741);
      this.glUniformMatrix2x3dv = var5;
      var5 = var2230.get(742);
      this.glUniformMatrix2x4dv = var5;
      var5 = var2230.get(743);
      this.glUniformMatrix3x2dv = var5;
      var5 = var2230.get(744);
      this.glUniformMatrix3x4dv = var5;
      var5 = var2230.get(745);
      this.glUniformMatrix4x2dv = var5;
      var5 = var2230.get(746);
      this.glUniformMatrix4x3dv = var5;
      var5 = var2230.get(747);
      this.glGetUniformdv = var5;
      var5 = var2230.get(748);
      this.glMinSampleShading = var5;
      var5 = var2230.get(749);
      this.glGetSubroutineUniformLocation = var5;
      var5 = var2230.get(750);
      this.glGetSubroutineIndex = var5;
      var5 = var2230.get(751);
      this.glGetActiveSubroutineUniformiv = var5;
      var5 = var2230.get(752);
      this.glGetActiveSubroutineUniformName = var5;
      var5 = var2230.get(753);
      this.glGetActiveSubroutineName = var5;
      var5 = var2230.get(754);
      this.glUniformSubroutinesuiv = var5;
      var5 = var2230.get(755);
      this.glGetUniformSubroutineuiv = var5;
      var5 = var2230.get(756);
      this.glGetProgramStageiv = var5;
      var5 = var2230.get(757);
      this.glPatchParameteri = var5;
      var5 = var2230.get(758);
      this.glPatchParameterfv = var5;
      var5 = var2230.get(759);
      this.glBindTransformFeedback = var5;
      var5 = var2230.get(760);
      this.glDeleteTransformFeedbacks = var5;
      var5 = var2230.get(761);
      this.glGenTransformFeedbacks = var5;
      var5 = var2230.get(762);
      this.glIsTransformFeedback = var5;
      var5 = var2230.get(763);
      this.glPauseTransformFeedback = var5;
      var5 = var2230.get(764);
      this.glResumeTransformFeedback = var5;
      var5 = var2230.get(765);
      this.glDrawTransformFeedback = var5;
      var5 = var2230.get(766);
      this.glDrawTransformFeedbackStream = var5;
      var5 = var2230.get(767);
      this.glBeginQueryIndexed = var5;
      var5 = var2230.get(768);
      this.glEndQueryIndexed = var5;
      var5 = var2230.get(769);
      this.glGetQueryIndexediv = var5;
      var5 = var2230.get(770);
      this.glReleaseShaderCompiler = var5;
      var5 = var2230.get(771);
      this.glShaderBinary = var5;
      var5 = var2230.get(772);
      this.glGetShaderPrecisionFormat = var5;
      var5 = var2230.get(773);
      this.glDepthRangef = var5;
      var5 = var2230.get(774);
      this.glClearDepthf = var5;
      var5 = var2230.get(775);
      this.glGetProgramBinary = var5;
      var5 = var2230.get(776);
      this.glProgramBinary = var5;
      var5 = var2230.get(777);
      this.glProgramParameteri = var5;
      var5 = var2230.get(778);
      this.glUseProgramStages = var5;
      var5 = var2230.get(779);
      this.glActiveShaderProgram = var5;
      var5 = var2230.get(780);
      this.glCreateShaderProgramv = var5;
      var5 = var2230.get(781);
      this.glBindProgramPipeline = var5;
      var5 = var2230.get(782);
      this.glDeleteProgramPipelines = var5;
      var5 = var2230.get(783);
      this.glGenProgramPipelines = var5;
      var5 = var2230.get(784);
      this.glIsProgramPipeline = var5;
      var5 = var2230.get(785);
      this.glGetProgramPipelineiv = var5;
      var5 = var2230.get(786);
      this.glProgramUniform1i = var5;
      var5 = var2230.get(787);
      this.glProgramUniform2i = var5;
      var5 = var2230.get(788);
      this.glProgramUniform3i = var5;
      var5 = var2230.get(789);
      this.glProgramUniform4i = var5;
      var5 = var2230.get(790);
      this.glProgramUniform1ui = var5;
      var5 = var2230.get(791);
      this.glProgramUniform2ui = var5;
      var5 = var2230.get(792);
      this.glProgramUniform3ui = var5;
      var5 = var2230.get(793);
      this.glProgramUniform4ui = var5;
      var5 = var2230.get(794);
      this.glProgramUniform1f = var5;
      var5 = var2230.get(795);
      this.glProgramUniform2f = var5;
      var5 = var2230.get(796);
      this.glProgramUniform3f = var5;
      var5 = var2230.get(797);
      this.glProgramUniform4f = var5;
      var5 = var2230.get(798);
      this.glProgramUniform1d = var5;
      var5 = var2230.get(799);
      this.glProgramUniform2d = var5;
      var5 = var2230.get(800);
      this.glProgramUniform3d = var5;
      var5 = var2230.get(801);
      this.glProgramUniform4d = var5;
      var5 = var2230.get(802);
      this.glProgramUniform1iv = var5;
      var5 = var2230.get(803);
      this.glProgramUniform2iv = var5;
      var5 = var2230.get(804);
      this.glProgramUniform3iv = var5;
      var5 = var2230.get(805);
      this.glProgramUniform4iv = var5;
      var5 = var2230.get(806);
      this.glProgramUniform1uiv = var5;
      var5 = var2230.get(807);
      this.glProgramUniform2uiv = var5;
      var5 = var2230.get(808);
      this.glProgramUniform3uiv = var5;
      var5 = var2230.get(809);
      this.glProgramUniform4uiv = var5;
      var5 = var2230.get(810);
      this.glProgramUniform1fv = var5;
      var5 = var2230.get(811);
      this.glProgramUniform2fv = var5;
      var5 = var2230.get(812);
      this.glProgramUniform3fv = var5;
      var5 = var2230.get(813);
      this.glProgramUniform4fv = var5;
      var5 = var2230.get(814);
      this.glProgramUniform1dv = var5;
      var5 = var2230.get(815);
      this.glProgramUniform2dv = var5;
      var5 = var2230.get(816);
      this.glProgramUniform3dv = var5;
      var5 = var2230.get(817);
      this.glProgramUniform4dv = var5;
      var5 = var2230.get(818);
      this.glProgramUniformMatrix2fv = var5;
      var5 = var2230.get(819);
      this.glProgramUniformMatrix3fv = var5;
      var5 = var2230.get(820);
      this.glProgramUniformMatrix4fv = var5;
      var5 = var2230.get(821);
      this.glProgramUniformMatrix2dv = var5;
      var5 = var2230.get(822);
      this.glProgramUniformMatrix3dv = var5;
      var5 = var2230.get(823);
      this.glProgramUniformMatrix4dv = var5;
      var5 = var2230.get(824);
      this.glProgramUniformMatrix2x3fv = var5;
      var5 = var2230.get(825);
      this.glProgramUniformMatrix3x2fv = var5;
      var5 = var2230.get(826);
      this.glProgramUniformMatrix2x4fv = var5;
      var5 = var2230.get(827);
      this.glProgramUniformMatrix4x2fv = var5;
      var5 = var2230.get(828);
      this.glProgramUniformMatrix3x4fv = var5;
      var5 = var2230.get(829);
      this.glProgramUniformMatrix4x3fv = var5;
      var5 = var2230.get(830);
      this.glProgramUniformMatrix2x3dv = var5;
      var5 = var2230.get(831);
      this.glProgramUniformMatrix3x2dv = var5;
      var5 = var2230.get(832);
      this.glProgramUniformMatrix2x4dv = var5;
      var5 = var2230.get(833);
      this.glProgramUniformMatrix4x2dv = var5;
      var5 = var2230.get(834);
      this.glProgramUniformMatrix3x4dv = var5;
      var5 = var2230.get(835);
      this.glProgramUniformMatrix4x3dv = var5;
      var5 = var2230.get(836);
      this.glValidateProgramPipeline = var5;
      var5 = var2230.get(837);
      this.glGetProgramPipelineInfoLog = var5;
      var5 = var2230.get(838);
      this.glVertexAttribL1d = var5;
      var5 = var2230.get(839);
      this.glVertexAttribL2d = var5;
      var5 = var2230.get(840);
      this.glVertexAttribL3d = var5;
      var5 = var2230.get(841);
      this.glVertexAttribL4d = var5;
      var5 = var2230.get(842);
      this.glVertexAttribL1dv = var5;
      var5 = var2230.get(843);
      this.glVertexAttribL2dv = var5;
      var5 = var2230.get(844);
      this.glVertexAttribL3dv = var5;
      var5 = var2230.get(845);
      this.glVertexAttribL4dv = var5;
      var5 = var2230.get(846);
      this.glVertexAttribLPointer = var5;
      var5 = var2230.get(847);
      this.glGetVertexAttribLdv = var5;
      var5 = var2230.get(848);
      this.glViewportArrayv = var5;
      var5 = var2230.get(849);
      this.glViewportIndexedf = var5;
      var5 = var2230.get(850);
      this.glViewportIndexedfv = var5;
      var5 = var2230.get(851);
      this.glScissorArrayv = var5;
      var5 = var2230.get(852);
      this.glScissorIndexed = var5;
      var5 = var2230.get(853);
      this.glScissorIndexedv = var5;
      var5 = var2230.get(854);
      this.glDepthRangeArrayv = var5;
      var5 = var2230.get(855);
      this.glDepthRangeIndexed = var5;
      var5 = var2230.get(856);
      this.glGetFloati_v = var5;
      var5 = var2230.get(857);
      this.glGetDoublei_v = var5;
      var5 = var2230.get(858);
      this.glGetActiveAtomicCounterBufferiv = var5;
      var5 = var2230.get(859);
      this.glTexStorage1D = var5;
      var5 = var2230.get(860);
      this.glTexStorage2D = var5;
      var5 = var2230.get(861);
      this.glTexStorage3D = var5;
      var5 = var2230.get(862);
      this.glDrawTransformFeedbackInstanced = var5;
      var5 = var2230.get(863);
      this.glDrawTransformFeedbackStreamInstanced = var5;
      var5 = var2230.get(864);
      this.glDrawArraysInstancedBaseInstance = var5;
      var5 = var2230.get(865);
      this.glDrawElementsInstancedBaseInstance = var5;
      var5 = var2230.get(866);
      this.glDrawElementsInstancedBaseVertexBaseInstance = var5;
      var5 = var2230.get(867);
      this.glBindImageTexture = var5;
      var5 = var2230.get(868);
      this.glMemoryBarrier = var5;
      var5 = var2230.get(869);
      this.glGetInternalformativ = var5;
      var5 = var2230.get(870);
      this.glClearBufferData = var5;
      var5 = var2230.get(871);
      this.glClearBufferSubData = var5;
      var5 = var2230.get(872);
      this.glDispatchCompute = var5;
      var5 = var2230.get(873);
      this.glDispatchComputeIndirect = var5;
      var5 = var2230.get(874);
      this.glCopyImageSubData = var5;
      var5 = var2230.get(875);
      this.glDebugMessageControl = var5;
      var5 = var2230.get(876);
      this.glDebugMessageInsert = var5;
      var5 = var2230.get(877);
      this.glDebugMessageCallback = var5;
      var5 = var2230.get(878);
      this.glGetDebugMessageLog = var5;
      var5 = var2230.get(879);
      this.glPushDebugGroup = var5;
      var5 = var2230.get(880);
      this.glPopDebugGroup = var5;
      var5 = var2230.get(881);
      this.glObjectLabel = var5;
      var5 = var2230.get(882);
      this.glGetObjectLabel = var5;
      var5 = var2230.get(883);
      this.glObjectPtrLabel = var5;
      var5 = var2230.get(884);
      this.glGetObjectPtrLabel = var5;
      var5 = var2230.get(885);
      this.glFramebufferParameteri = var5;
      var5 = var2230.get(886);
      this.glGetFramebufferParameteriv = var5;
      var5 = var2230.get(887);
      this.glGetInternalformati64v = var5;
      var5 = var2230.get(888);
      this.glInvalidateTexSubImage = var5;
      var5 = var2230.get(889);
      this.glInvalidateTexImage = var5;
      var5 = var2230.get(890);
      this.glInvalidateBufferSubData = var5;
      var5 = var2230.get(891);
      this.glInvalidateBufferData = var5;
      var5 = var2230.get(892);
      this.glInvalidateFramebuffer = var5;
      var5 = var2230.get(893);
      this.glInvalidateSubFramebuffer = var5;
      var5 = var2230.get(894);
      this.glMultiDrawArraysIndirect = var5;
      var5 = var2230.get(895);
      this.glMultiDrawElementsIndirect = var5;
      var5 = var2230.get(896);
      this.glGetProgramInterfaceiv = var5;
      var5 = var2230.get(897);
      this.glGetProgramResourceIndex = var5;
      var5 = var2230.get(898);
      this.glGetProgramResourceName = var5;
      var5 = var2230.get(899);
      this.glGetProgramResourceiv = var5;
      var5 = var2230.get(900);
      this.glGetProgramResourceLocation = var5;
      var5 = var2230.get(901);
      this.glGetProgramResourceLocationIndex = var5;
      var5 = var2230.get(902);
      this.glShaderStorageBlockBinding = var5;
      var5 = var2230.get(903);
      this.glTexBufferRange = var5;
      var5 = var2230.get(904);
      this.glTexStorage2DMultisample = var5;
      var5 = var2230.get(905);
      this.glTexStorage3DMultisample = var5;
      var5 = var2230.get(906);
      this.glTextureView = var5;
      var5 = var2230.get(907);
      this.glBindVertexBuffer = var5;
      var5 = var2230.get(908);
      this.glVertexAttribFormat = var5;
      var5 = var2230.get(909);
      this.glVertexAttribIFormat = var5;
      var5 = var2230.get(910);
      this.glVertexAttribLFormat = var5;
      var5 = var2230.get(911);
      this.glVertexAttribBinding = var5;
      var5 = var2230.get(912);
      this.glVertexBindingDivisor = var5;
      var5 = var2230.get(913);
      this.glBufferStorage = var5;
      var5 = var2230.get(914);
      this.glClearTexSubImage = var5;
      var5 = var2230.get(915);
      this.glClearTexImage = var5;
      var5 = var2230.get(916);
      this.glBindBuffersBase = var5;
      var5 = var2230.get(917);
      this.glBindBuffersRange = var5;
      var5 = var2230.get(918);
      this.glBindTextures = var5;
      var5 = var2230.get(919);
      this.glBindSamplers = var5;
      var5 = var2230.get(920);
      this.glBindImageTextures = var5;
      var5 = var2230.get(921);
      this.glBindVertexBuffers = var5;
      var5 = var2230.get(922);
      this.glClipControl = var5;
      var5 = var2230.get(923);
      this.glCreateTransformFeedbacks = var5;
      var5 = var2230.get(924);
      this.glTransformFeedbackBufferBase = var5;
      var5 = var2230.get(925);
      this.glTransformFeedbackBufferRange = var5;
      var5 = var2230.get(926);
      this.glGetTransformFeedbackiv = var5;
      var5 = var2230.get(927);
      this.glGetTransformFeedbacki_v = var5;
      var5 = var2230.get(928);
      this.glGetTransformFeedbacki64_v = var5;
      var5 = var2230.get(929);
      this.glCreateBuffers = var5;
      var5 = var2230.get(930);
      this.glNamedBufferStorage = var5;
      var5 = var2230.get(931);
      this.glNamedBufferData = var5;
      var5 = var2230.get(932);
      this.glNamedBufferSubData = var5;
      var5 = var2230.get(933);
      this.glCopyNamedBufferSubData = var5;
      var5 = var2230.get(934);
      this.glClearNamedBufferData = var5;
      var5 = var2230.get(935);
      this.glClearNamedBufferSubData = var5;
      var5 = var2230.get(936);
      this.glMapNamedBuffer = var5;
      var5 = var2230.get(937);
      this.glMapNamedBufferRange = var5;
      var5 = var2230.get(938);
      this.glUnmapNamedBuffer = var5;
      var5 = var2230.get(939);
      this.glFlushMappedNamedBufferRange = var5;
      var5 = var2230.get(940);
      this.glGetNamedBufferParameteriv = var5;
      var5 = var2230.get(941);
      this.glGetNamedBufferParameteri64v = var5;
      var5 = var2230.get(942);
      this.glGetNamedBufferPointerv = var5;
      var5 = var2230.get(943);
      this.glGetNamedBufferSubData = var5;
      var5 = var2230.get(944);
      this.glCreateFramebuffers = var5;
      var5 = var2230.get(945);
      this.glNamedFramebufferRenderbuffer = var5;
      var5 = var2230.get(946);
      this.glNamedFramebufferParameteri = var5;
      var5 = var2230.get(947);
      this.glNamedFramebufferTexture = var5;
      var5 = var2230.get(948);
      this.glNamedFramebufferTextureLayer = var5;
      var5 = var2230.get(949);
      this.glNamedFramebufferDrawBuffer = var5;
      var5 = var2230.get(950);
      this.glNamedFramebufferDrawBuffers = var5;
      var5 = var2230.get(951);
      this.glNamedFramebufferReadBuffer = var5;
      var5 = var2230.get(952);
      this.glInvalidateNamedFramebufferData = var5;
      var5 = var2230.get(953);
      this.glInvalidateNamedFramebufferSubData = var5;
      var5 = var2230.get(954);
      this.glClearNamedFramebufferiv = var5;
      var5 = var2230.get(955);
      this.glClearNamedFramebufferuiv = var5;
      var5 = var2230.get(956);
      this.glClearNamedFramebufferfv = var5;
      var5 = var2230.get(957);
      this.glClearNamedFramebufferfi = var5;
      var5 = var2230.get(958);
      this.glBlitNamedFramebuffer = var5;
      var5 = var2230.get(959);
      this.glCheckNamedFramebufferStatus = var5;
      var5 = var2230.get(960);
      this.glGetNamedFramebufferParameteriv = var5;
      var5 = var2230.get(961);
      this.glGetNamedFramebufferAttachmentParameteriv = var5;
      var5 = var2230.get(962);
      this.glCreateRenderbuffers = var5;
      var5 = var2230.get(963);
      this.glNamedRenderbufferStorage = var5;
      var5 = var2230.get(964);
      this.glNamedRenderbufferStorageMultisample = var5;
      var5 = var2230.get(965);
      this.glGetNamedRenderbufferParameteriv = var5;
      var5 = var2230.get(966);
      this.glCreateTextures = var5;
      var5 = var2230.get(967);
      this.glTextureBuffer = var5;
      var5 = var2230.get(968);
      this.glTextureBufferRange = var5;
      var5 = var2230.get(969);
      this.glTextureStorage1D = var5;
      var5 = var2230.get(970);
      this.glTextureStorage2D = var5;
      var5 = var2230.get(971);
      this.glTextureStorage3D = var5;
      var5 = var2230.get(972);
      this.glTextureStorage2DMultisample = var5;
      var5 = var2230.get(973);
      this.glTextureStorage3DMultisample = var5;
      var5 = var2230.get(974);
      this.glTextureSubImage1D = var5;
      var5 = var2230.get(975);
      this.glTextureSubImage2D = var5;
      var5 = var2230.get(976);
      this.glTextureSubImage3D = var5;
      var5 = var2230.get(977);
      this.glCompressedTextureSubImage1D = var5;
      var5 = var2230.get(978);
      this.glCompressedTextureSubImage2D = var5;
      var5 = var2230.get(979);
      this.glCompressedTextureSubImage3D = var5;
      var5 = var2230.get(980);
      this.glCopyTextureSubImage1D = var5;
      var5 = var2230.get(981);
      this.glCopyTextureSubImage2D = var5;
      var5 = var2230.get(982);
      this.glCopyTextureSubImage3D = var5;
      var5 = var2230.get(983);
      this.glTextureParameterf = var5;
      var5 = var2230.get(984);
      this.glTextureParameterfv = var5;
      var5 = var2230.get(985);
      this.glTextureParameteri = var5;
      var5 = var2230.get(986);
      this.glTextureParameterIiv = var5;
      var5 = var2230.get(987);
      this.glTextureParameterIuiv = var5;
      var5 = var2230.get(988);
      this.glTextureParameteriv = var5;
      var5 = var2230.get(989);
      this.glGenerateTextureMipmap = var5;
      var5 = var2230.get(990);
      this.glBindTextureUnit = var5;
      var5 = var2230.get(991);
      this.glGetTextureImage = var5;
      var5 = var2230.get(992);
      this.glGetCompressedTextureImage = var5;
      var5 = var2230.get(993);
      this.glGetTextureLevelParameterfv = var5;
      var5 = var2230.get(994);
      this.glGetTextureLevelParameteriv = var5;
      var5 = var2230.get(995);
      this.glGetTextureParameterfv = var5;
      var5 = var2230.get(996);
      this.glGetTextureParameterIiv = var5;
      var5 = var2230.get(997);
      this.glGetTextureParameterIuiv = var5;
      var5 = var2230.get(998);
      this.glGetTextureParameteriv = var5;
      var5 = var2230.get(999);
      this.glCreateVertexArrays = var5;
      var5 = var2230.get(1000);
      this.glDisableVertexArrayAttrib = var5;
      var5 = var2230.get(1001);
      this.glEnableVertexArrayAttrib = var5;
      var5 = var2230.get(1002);
      this.glVertexArrayElementBuffer = var5;
      var5 = var2230.get(1003);
      this.glVertexArrayVertexBuffer = var5;
      var5 = var2230.get(1004);
      this.glVertexArrayVertexBuffers = var5;
      var5 = var2230.get(1005);
      this.glVertexArrayAttribFormat = var5;
      var5 = var2230.get(1006);
      this.glVertexArrayAttribIFormat = var5;
      var5 = var2230.get(1007);
      this.glVertexArrayAttribLFormat = var5;
      var5 = var2230.get(1008);
      this.glVertexArrayAttribBinding = var5;
      var5 = var2230.get(1009);
      this.glVertexArrayBindingDivisor = var5;
      var5 = var2230.get(1010);
      this.glGetVertexArrayiv = var5;
      var5 = var2230.get(1011);
      this.glGetVertexArrayIndexediv = var5;
      var5 = var2230.get(1012);
      this.glGetVertexArrayIndexed64iv = var5;
      var5 = var2230.get(1013);
      this.glCreateSamplers = var5;
      var5 = var2230.get(1014);
      this.glCreateProgramPipelines = var5;
      var5 = var2230.get(1015);
      this.glCreateQueries = var5;
      var5 = var2230.get(1016);
      this.glGetQueryBufferObjectiv = var5;
      var5 = var2230.get(1017);
      this.glGetQueryBufferObjectuiv = var5;
      var5 = var2230.get(1018);
      this.glGetQueryBufferObjecti64v = var5;
      var5 = var2230.get(1019);
      this.glGetQueryBufferObjectui64v = var5;
      var5 = var2230.get(1020);
      this.glMemoryBarrierByRegion = var5;
      var5 = var2230.get(1021);
      this.glGetTextureSubImage = var5;
      var5 = var2230.get(1022);
      this.glGetCompressedTextureSubImage = var5;
      var5 = var2230.get(1023);
      this.glTextureBarrier = var5;
      var5 = var2230.get(1024);
      this.glGetGraphicsResetStatus = var5;
      var5 = var2230.get(1025);
      this.glGetnMapdv = var5;
      var5 = var2230.get(1026);
      this.glGetnMapfv = var5;
      var5 = var2230.get(1027);
      this.glGetnMapiv = var5;
      var5 = var2230.get(1028);
      this.glGetnPixelMapfv = var5;
      var5 = var2230.get(1029);
      this.glGetnPixelMapuiv = var5;
      var5 = var2230.get(1030);
      this.glGetnPixelMapusv = var5;
      var5 = var2230.get(1031);
      this.glGetnPolygonStipple = var5;
      var5 = var2230.get(1032);
      this.glGetnTexImage = var5;
      var5 = var2230.get(1033);
      this.glReadnPixels = var5;
      var5 = var2230.get(1034);
      this.glGetnColorTable = var5;
      var5 = var2230.get(1035);
      this.glGetnConvolutionFilter = var5;
      var5 = var2230.get(1036);
      this.glGetnSeparableFilter = var5;
      var5 = var2230.get(1037);
      this.glGetnHistogram = var5;
      var5 = var2230.get(1038);
      this.glGetnMinmax = var5;
      var5 = var2230.get(1039);
      this.glGetnCompressedTexImage = var5;
      var5 = var2230.get(1040);
      this.glGetnUniformfv = var5;
      var5 = var2230.get(1041);
      this.glGetnUniformdv = var5;
      var5 = var2230.get(1042);
      this.glGetnUniformiv = var5;
      var5 = var2230.get(1043);
      this.glGetnUniformuiv = var5;
      var5 = var2230.get(1044);
      this.glMultiDrawArraysIndirectCount = var5;
      var5 = var2230.get(1045);
      this.glMultiDrawElementsIndirectCount = var5;
      var5 = var2230.get(1046);
      this.glPolygonOffsetClamp = var5;
      var5 = var2230.get(1047);
      this.glSpecializeShader = var5;
      var5 = var2230.get(1048);
      this.glDebugMessageEnableAMD = var5;
      var5 = var2230.get(1049);
      this.glDebugMessageInsertAMD = var5;
      var5 = var2230.get(1050);
      this.glDebugMessageCallbackAMD = var5;
      var5 = var2230.get(1051);
      this.glGetDebugMessageLogAMD = var5;
      var5 = var2230.get(1052);
      this.glBlendFuncIndexedAMD = var5;
      var5 = var2230.get(1053);
      this.glBlendFuncSeparateIndexedAMD = var5;
      var5 = var2230.get(1054);
      this.glBlendEquationIndexedAMD = var5;
      var5 = var2230.get(1055);
      this.glBlendEquationSeparateIndexedAMD = var5;
      var5 = var2230.get(1056);
      this.glRenderbufferStorageMultisampleAdvancedAMD = var5;
      var5 = var2230.get(1057);
      this.glNamedRenderbufferStorageMultisampleAdvancedAMD = var5;
      var5 = var2230.get(1058);
      this.glUniform1i64NV = var5;
      var5 = var2230.get(1059);
      this.glUniform2i64NV = var5;
      var5 = var2230.get(1060);
      this.glUniform3i64NV = var5;
      var5 = var2230.get(1061);
      this.glUniform4i64NV = var5;
      var5 = var2230.get(1062);
      this.glUniform1i64vNV = var5;
      var5 = var2230.get(1063);
      this.glUniform2i64vNV = var5;
      var5 = var2230.get(1064);
      this.glUniform3i64vNV = var5;
      var5 = var2230.get(1065);
      this.glUniform4i64vNV = var5;
      var5 = var2230.get(1066);
      this.glUniform1ui64NV = var5;
      var5 = var2230.get(1067);
      this.glUniform2ui64NV = var5;
      var5 = var2230.get(1068);
      this.glUniform3ui64NV = var5;
      var5 = var2230.get(1069);
      this.glUniform4ui64NV = var5;
      var5 = var2230.get(1070);
      this.glUniform1ui64vNV = var5;
      var5 = var2230.get(1071);
      this.glUniform2ui64vNV = var5;
      var5 = var2230.get(1072);
      this.glUniform3ui64vNV = var5;
      var5 = var2230.get(1073);
      this.glUniform4ui64vNV = var5;
      var5 = var2230.get(1074);
      this.glGetUniformi64vNV = var5;
      var5 = var2230.get(1075);
      this.glGetUniformui64vNV = var5;
      var5 = var2230.get(1076);
      this.glProgramUniform1i64NV = var5;
      var5 = var2230.get(1077);
      this.glProgramUniform2i64NV = var5;
      var5 = var2230.get(1078);
      this.glProgramUniform3i64NV = var5;
      var5 = var2230.get(1079);
      this.glProgramUniform4i64NV = var5;
      var5 = var2230.get(1080);
      this.glProgramUniform1i64vNV = var5;
      var5 = var2230.get(1081);
      this.glProgramUniform2i64vNV = var5;
      var5 = var2230.get(1082);
      this.glProgramUniform3i64vNV = var5;
      var5 = var2230.get(1083);
      this.glProgramUniform4i64vNV = var5;
      var5 = var2230.get(1084);
      this.glProgramUniform1ui64NV = var5;
      var5 = var2230.get(1085);
      this.glProgramUniform2ui64NV = var5;
      var5 = var2230.get(1086);
      this.glProgramUniform3ui64NV = var5;
      var5 = var2230.get(1087);
      this.glProgramUniform4ui64NV = var5;
      var5 = var2230.get(1088);
      this.glProgramUniform1ui64vNV = var5;
      var5 = var2230.get(1089);
      this.glProgramUniform2ui64vNV = var5;
      var5 = var2230.get(1090);
      this.glProgramUniform3ui64vNV = var5;
      var5 = var2230.get(1091);
      this.glProgramUniform4ui64vNV = var5;
      var5 = var2230.get(1092);
      this.glVertexAttribParameteriAMD = var5;
      var5 = var2230.get(1093);
      this.glQueryObjectParameteruiAMD = var5;
      var5 = var2230.get(1094);
      this.glGetPerfMonitorGroupsAMD = var5;
      var5 = var2230.get(1095);
      this.glGetPerfMonitorCountersAMD = var5;
      var5 = var2230.get(1096);
      this.glGetPerfMonitorGroupStringAMD = var5;
      var5 = var2230.get(1097);
      this.glGetPerfMonitorCounterStringAMD = var5;
      var5 = var2230.get(1098);
      this.glGetPerfMonitorCounterInfoAMD = var5;
      var5 = var2230.get(1099);
      this.glGenPerfMonitorsAMD = var5;
      var5 = var2230.get(1100);
      this.glDeletePerfMonitorsAMD = var5;
      var5 = var2230.get(1101);
      this.glSelectPerfMonitorCountersAMD = var5;
      var5 = var2230.get(1102);
      this.glBeginPerfMonitorAMD = var5;
      var5 = var2230.get(1103);
      this.glEndPerfMonitorAMD = var5;
      var5 = var2230.get(1104);
      this.glGetPerfMonitorCounterDataAMD = var5;
      var5 = var2230.get(1105);
      this.glSetMultisamplefvAMD = var5;
      var5 = var2230.get(1106);
      this.glTexStorageSparseAMD = var5;
      var5 = var2230.get(1107);
      this.glTextureStorageSparseAMD = var5;
      var5 = var2230.get(1108);
      this.glStencilOpValueAMD = var5;
      var5 = var2230.get(1109);
      this.glTessellationFactorAMD = var5;
      var5 = var2230.get(1110);
      this.glTessellationModeAMD = var5;
      var5 = var2230.get(1111);
      this.glGetTextureHandleARB = var5;
      var5 = var2230.get(1112);
      this.glGetTextureSamplerHandleARB = var5;
      var5 = var2230.get(1113);
      this.glMakeTextureHandleResidentARB = var5;
      var5 = var2230.get(1114);
      this.glMakeTextureHandleNonResidentARB = var5;
      var5 = var2230.get(1115);
      this.glGetImageHandleARB = var5;
      var5 = var2230.get(1116);
      this.glMakeImageHandleResidentARB = var5;
      var5 = var2230.get(1117);
      this.glMakeImageHandleNonResidentARB = var5;
      var5 = var2230.get(1118);
      this.glUniformHandleui64ARB = var5;
      var5 = var2230.get(1119);
      this.glUniformHandleui64vARB = var5;
      var5 = var2230.get(1120);
      this.glProgramUniformHandleui64ARB = var5;
      var5 = var2230.get(1121);
      this.glProgramUniformHandleui64vARB = var5;
      var5 = var2230.get(1122);
      this.glIsTextureHandleResidentARB = var5;
      var5 = var2230.get(1123);
      this.glIsImageHandleResidentARB = var5;
      var5 = var2230.get(1124);
      this.glVertexAttribL1ui64ARB = var5;
      var5 = var2230.get(1125);
      this.glVertexAttribL1ui64vARB = var5;
      var5 = var2230.get(1126);
      this.glGetVertexAttribLui64vARB = var5;
      var5 = var2230.get(1127);
      this.glNamedBufferStorageEXT = var5;
      var5 = var2230.get(1128);
      this.glCreateSyncFromCLeventARB = var5;
      var5 = var2230.get(1129);
      this.glClearNamedBufferDataEXT = var5;
      var5 = var2230.get(1130);
      this.glClearNamedBufferSubDataEXT = var5;
      var5 = var2230.get(1131);
      this.glClampColorARB = var5;
      var5 = var2230.get(1132);
      this.glDispatchComputeGroupSizeARB = var5;
      var5 = var2230.get(1133);
      this.glDebugMessageControlARB = var5;
      var5 = var2230.get(1134);
      this.glDebugMessageInsertARB = var5;
      var5 = var2230.get(1135);
      this.glDebugMessageCallbackARB = var5;
      var5 = var2230.get(1136);
      this.glGetDebugMessageLogARB = var5;
      var5 = var2230.get(1137);
      this.glDrawBuffersARB = var5;
      var5 = var2230.get(1138);
      this.glBlendEquationiARB = var5;
      var5 = var2230.get(1139);
      this.glBlendEquationSeparateiARB = var5;
      var5 = var2230.get(1140);
      this.glBlendFunciARB = var5;
      var5 = var2230.get(1141);
      this.glBlendFuncSeparateiARB = var5;
      var5 = var2230.get(1142);
      this.glDrawArraysInstancedARB = var5;
      var5 = var2230.get(1143);
      this.glDrawElementsInstancedARB = var5;
      var5 = var2230.get(1144);
      this.glPrimitiveBoundingBoxARB = var5;
      var5 = var2230.get(1145);
      this.glNamedFramebufferParameteriEXT = var5;
      var5 = var2230.get(1146);
      this.glGetNamedFramebufferParameterivEXT = var5;
      var5 = var2230.get(1147);
      this.glProgramParameteriARB = var5;
      var5 = var2230.get(1148);
      this.glFramebufferTextureARB = var5;
      var5 = var2230.get(1149);
      this.glFramebufferTextureLayerARB = var5;
      var5 = var2230.get(1150);
      this.glFramebufferTextureFaceARB = var5;
      var5 = var2230.get(1151);
      this.glSpecializeShaderARB = var5;
      var5 = var2230.get(1152);
      this.glProgramUniform1dEXT = var5;
      var5 = var2230.get(1153);
      this.glProgramUniform2dEXT = var5;
      var5 = var2230.get(1154);
      this.glProgramUniform3dEXT = var5;
      var5 = var2230.get(1155);
      this.glProgramUniform4dEXT = var5;
      var5 = var2230.get(1156);
      this.glProgramUniform1dvEXT = var5;
      var5 = var2230.get(1157);
      this.glProgramUniform2dvEXT = var5;
      var5 = var2230.get(1158);
      this.glProgramUniform3dvEXT = var5;
      var5 = var2230.get(1159);
      this.glProgramUniform4dvEXT = var5;
      var5 = var2230.get(1160);
      this.glProgramUniformMatrix2dvEXT = var5;
      var5 = var2230.get(1161);
      this.glProgramUniformMatrix3dvEXT = var5;
      var5 = var2230.get(1162);
      this.glProgramUniformMatrix4dvEXT = var5;
      var5 = var2230.get(1163);
      this.glProgramUniformMatrix2x3dvEXT = var5;
      var5 = var2230.get(1164);
      this.glProgramUniformMatrix2x4dvEXT = var5;
      var5 = var2230.get(1165);
      this.glProgramUniformMatrix3x2dvEXT = var5;
      var5 = var2230.get(1166);
      this.glProgramUniformMatrix3x4dvEXT = var5;
      var5 = var2230.get(1167);
      this.glProgramUniformMatrix4x2dvEXT = var5;
      var5 = var2230.get(1168);
      this.glProgramUniformMatrix4x3dvEXT = var5;
      var5 = var2230.get(1169);
      this.glUniform1i64ARB = var5;
      var5 = var2230.get(1170);
      this.glUniform1i64vARB = var5;
      var5 = var2230.get(1171);
      this.glProgramUniform1i64ARB = var5;
      var5 = var2230.get(1172);
      this.glProgramUniform1i64vARB = var5;
      var5 = var2230.get(1173);
      this.glUniform2i64ARB = var5;
      var5 = var2230.get(1174);
      this.glUniform2i64vARB = var5;
      var5 = var2230.get(1175);
      this.glProgramUniform2i64ARB = var5;
      var5 = var2230.get(1176);
      this.glProgramUniform2i64vARB = var5;
      var5 = var2230.get(1177);
      this.glUniform3i64ARB = var5;
      var5 = var2230.get(1178);
      this.glUniform3i64vARB = var5;
      var5 = var2230.get(1179);
      this.glProgramUniform3i64ARB = var5;
      var5 = var2230.get(1180);
      this.glProgramUniform3i64vARB = var5;
      var5 = var2230.get(1181);
      this.glUniform4i64ARB = var5;
      var5 = var2230.get(1182);
      this.glUniform4i64vARB = var5;
      var5 = var2230.get(1183);
      this.glProgramUniform4i64ARB = var5;
      var5 = var2230.get(1184);
      this.glProgramUniform4i64vARB = var5;
      var5 = var2230.get(1185);
      this.glUniform1ui64ARB = var5;
      var5 = var2230.get(1186);
      this.glUniform1ui64vARB = var5;
      var5 = var2230.get(1187);
      this.glProgramUniform1ui64ARB = var5;
      var5 = var2230.get(1188);
      this.glProgramUniform1ui64vARB = var5;
      var5 = var2230.get(1189);
      this.glUniform2ui64ARB = var5;
      var5 = var2230.get(1190);
      this.glUniform2ui64vARB = var5;
      var5 = var2230.get(1191);
      this.glProgramUniform2ui64ARB = var5;
      var5 = var2230.get(1192);
      this.glProgramUniform2ui64vARB = var5;
      var5 = var2230.get(1193);
      this.glUniform3ui64ARB = var5;
      var5 = var2230.get(1194);
      this.glUniform3ui64vARB = var5;
      var5 = var2230.get(1195);
      this.glProgramUniform3ui64ARB = var5;
      var5 = var2230.get(1196);
      this.glProgramUniform3ui64vARB = var5;
      var5 = var2230.get(1197);
      this.glUniform4ui64ARB = var5;
      var5 = var2230.get(1198);
      this.glUniform4ui64vARB = var5;
      var5 = var2230.get(1199);
      this.glProgramUniform4ui64ARB = var5;
      var5 = var2230.get(1200);
      this.glProgramUniform4ui64vARB = var5;
      var5 = var2230.get(1201);
      this.glGetUniformi64vARB = var5;
      var5 = var2230.get(1202);
      this.glGetUniformui64vARB = var5;
      var5 = var2230.get(1203);
      this.glGetnUniformi64vARB = var5;
      var5 = var2230.get(1204);
      this.glGetnUniformui64vARB = var5;
      var5 = var2230.get(1205);
      this.glColorTable = var5;
      var5 = var2230.get(1206);
      this.glCopyColorTable = var5;
      var5 = var2230.get(1207);
      this.glColorTableParameteriv = var5;
      var5 = var2230.get(1208);
      this.glColorTableParameterfv = var5;
      var5 = var2230.get(1209);
      this.glGetColorTable = var5;
      var5 = var2230.get(1210);
      this.glGetColorTableParameteriv = var5;
      var5 = var2230.get(1211);
      this.glGetColorTableParameterfv = var5;
      var5 = var2230.get(1212);
      this.glColorSubTable = var5;
      var5 = var2230.get(1213);
      this.glCopyColorSubTable = var5;
      var5 = var2230.get(1214);
      this.glConvolutionFilter1D = var5;
      var5 = var2230.get(1215);
      this.glConvolutionFilter2D = var5;
      var5 = var2230.get(1216);
      this.glCopyConvolutionFilter1D = var5;
      var5 = var2230.get(1217);
      this.glCopyConvolutionFilter2D = var5;
      var5 = var2230.get(1218);
      this.glGetConvolutionFilter = var5;
      var5 = var2230.get(1219);
      this.glSeparableFilter2D = var5;
      var5 = var2230.get(1220);
      this.glGetSeparableFilter = var5;
      var5 = var2230.get(1221);
      this.glConvolutionParameteri = var5;
      var5 = var2230.get(1222);
      this.glConvolutionParameteriv = var5;
      var5 = var2230.get(1223);
      this.glConvolutionParameterf = var5;
      var5 = var2230.get(1224);
      this.glConvolutionParameterfv = var5;
      var5 = var2230.get(1225);
      this.glGetConvolutionParameteriv = var5;
      var5 = var2230.get(1226);
      this.glGetConvolutionParameterfv = var5;
      var5 = var2230.get(1227);
      this.glHistogram = var5;
      var5 = var2230.get(1228);
      this.glResetHistogram = var5;
      var5 = var2230.get(1229);
      this.glGetHistogram = var5;
      var5 = var2230.get(1230);
      this.glGetHistogramParameteriv = var5;
      var5 = var2230.get(1231);
      this.glGetHistogramParameterfv = var5;
      var5 = var2230.get(1232);
      this.glMinmax = var5;
      var5 = var2230.get(1233);
      this.glResetMinmax = var5;
      var5 = var2230.get(1234);
      this.glGetMinmax = var5;
      var5 = var2230.get(1235);
      this.glGetMinmaxParameteriv = var5;
      var5 = var2230.get(1236);
      this.glGetMinmaxParameterfv = var5;
      var5 = var2230.get(1237);
      this.glMultiDrawArraysIndirectCountARB = var5;
      var5 = var2230.get(1238);
      this.glMultiDrawElementsIndirectCountARB = var5;
      var5 = var2230.get(1239);
      this.glVertexAttribDivisorARB = var5;
      var5 = var2230.get(1240);
      this.glVertexArrayVertexAttribDivisorEXT = var5;
      var5 = var2230.get(1241);
      this.glCurrentPaletteMatrixARB = var5;
      var5 = var2230.get(1242);
      this.glMatrixIndexuivARB = var5;
      var5 = var2230.get(1243);
      this.glMatrixIndexubvARB = var5;
      var5 = var2230.get(1244);
      this.glMatrixIndexusvARB = var5;
      var5 = var2230.get(1245);
      this.glMatrixIndexPointerARB = var5;
      var5 = var2230.get(1246);
      this.glSampleCoverageARB = var5;
      var5 = var2230.get(1247);
      this.glActiveTextureARB = var5;
      var5 = var2230.get(1248);
      this.glClientActiveTextureARB = var5;
      var5 = var2230.get(1249);
      this.glMultiTexCoord1fARB = var5;
      var5 = var2230.get(1250);
      this.glMultiTexCoord1sARB = var5;
      var5 = var2230.get(1251);
      this.glMultiTexCoord1iARB = var5;
      var5 = var2230.get(1252);
      this.glMultiTexCoord1dARB = var5;
      var5 = var2230.get(1253);
      this.glMultiTexCoord1fvARB = var5;
      var5 = var2230.get(1254);
      this.glMultiTexCoord1svARB = var5;
      var5 = var2230.get(1255);
      this.glMultiTexCoord1ivARB = var5;
      var5 = var2230.get(1256);
      this.glMultiTexCoord1dvARB = var5;
      var5 = var2230.get(1257);
      this.glMultiTexCoord2fARB = var5;
      var5 = var2230.get(1258);
      this.glMultiTexCoord2sARB = var5;
      var5 = var2230.get(1259);
      this.glMultiTexCoord2iARB = var5;
      var5 = var2230.get(1260);
      this.glMultiTexCoord2dARB = var5;
      var5 = var2230.get(1261);
      this.glMultiTexCoord2fvARB = var5;
      var5 = var2230.get(1262);
      this.glMultiTexCoord2svARB = var5;
      var5 = var2230.get(1263);
      this.glMultiTexCoord2ivARB = var5;
      var5 = var2230.get(1264);
      this.glMultiTexCoord2dvARB = var5;
      var5 = var2230.get(1265);
      this.glMultiTexCoord3fARB = var5;
      var5 = var2230.get(1266);
      this.glMultiTexCoord3sARB = var5;
      var5 = var2230.get(1267);
      this.glMultiTexCoord3iARB = var5;
      var5 = var2230.get(1268);
      this.glMultiTexCoord3dARB = var5;
      var5 = var2230.get(1269);
      this.glMultiTexCoord3fvARB = var5;
      var5 = var2230.get(1270);
      this.glMultiTexCoord3svARB = var5;
      var5 = var2230.get(1271);
      this.glMultiTexCoord3ivARB = var5;
      var5 = var2230.get(1272);
      this.glMultiTexCoord3dvARB = var5;
      var5 = var2230.get(1273);
      this.glMultiTexCoord4fARB = var5;
      var5 = var2230.get(1274);
      this.glMultiTexCoord4sARB = var5;
      var5 = var2230.get(1275);
      this.glMultiTexCoord4iARB = var5;
      var5 = var2230.get(1276);
      this.glMultiTexCoord4dARB = var5;
      var5 = var2230.get(1277);
      this.glMultiTexCoord4fvARB = var5;
      var5 = var2230.get(1278);
      this.glMultiTexCoord4svARB = var5;
      var5 = var2230.get(1279);
      this.glMultiTexCoord4ivARB = var5;
      var5 = var2230.get(1280);
      this.glMultiTexCoord4dvARB = var5;
      var5 = var2230.get(1281);
      this.glGenQueriesARB = var5;
      var5 = var2230.get(1282);
      this.glDeleteQueriesARB = var5;
      var5 = var2230.get(1283);
      this.glIsQueryARB = var5;
      var5 = var2230.get(1284);
      this.glBeginQueryARB = var5;
      var5 = var2230.get(1285);
      this.glEndQueryARB = var5;
      var5 = var2230.get(1286);
      this.glGetQueryivARB = var5;
      var5 = var2230.get(1287);
      this.glGetQueryObjectivARB = var5;
      var5 = var2230.get(1288);
      this.glGetQueryObjectuivARB = var5;
      var5 = var2230.get(1289);
      this.glMaxShaderCompilerThreadsARB = var5;
      var5 = var2230.get(1290);
      this.glPointParameterfARB = var5;
      var5 = var2230.get(1291);
      this.glPointParameterfvARB = var5;
      var5 = var2230.get(1292);
      this.glGetGraphicsResetStatusARB = var5;
      var5 = var2230.get(1293);
      this.glGetnMapdvARB = var5;
      var5 = var2230.get(1294);
      this.glGetnMapfvARB = var5;
      var5 = var2230.get(1295);
      this.glGetnMapivARB = var5;
      var5 = var2230.get(1296);
      this.glGetnPixelMapfvARB = var5;
      var5 = var2230.get(1297);
      this.glGetnPixelMapuivARB = var5;
      var5 = var2230.get(1298);
      this.glGetnPixelMapusvARB = var5;
      var5 = var2230.get(1299);
      this.glGetnPolygonStippleARB = var5;
      var5 = var2230.get(1300);
      this.glGetnTexImageARB = var5;
      var5 = var2230.get(1301);
      this.glReadnPixelsARB = var5;
      var5 = var2230.get(1302);
      this.glGetnColorTableARB = var5;
      var5 = var2230.get(1303);
      this.glGetnConvolutionFilterARB = var5;
      var5 = var2230.get(1304);
      this.glGetnSeparableFilterARB = var5;
      var5 = var2230.get(1305);
      this.glGetnHistogramARB = var5;
      var5 = var2230.get(1306);
      this.glGetnMinmaxARB = var5;
      var5 = var2230.get(1307);
      this.glGetnCompressedTexImageARB = var5;
      var5 = var2230.get(1308);
      this.glGetnUniformfvARB = var5;
      var5 = var2230.get(1309);
      this.glGetnUniformivARB = var5;
      var5 = var2230.get(1310);
      this.glGetnUniformuivARB = var5;
      var5 = var2230.get(1311);
      this.glGetnUniformdvARB = var5;
      var5 = var2230.get(1312);
      this.glFramebufferSampleLocationsfvARB = var5;
      var5 = var2230.get(1313);
      this.glNamedFramebufferSampleLocationsfvARB = var5;
      var5 = var2230.get(1314);
      this.glEvaluateDepthValuesARB = var5;
      var5 = var2230.get(1315);
      this.glMinSampleShadingARB = var5;
      var5 = var2230.get(1316);
      this.glDeleteObjectARB = var5;
      var5 = var2230.get(1317);
      this.glGetHandleARB = var5;
      var5 = var2230.get(1318);
      this.glDetachObjectARB = var5;
      var5 = var2230.get(1319);
      this.glCreateShaderObjectARB = var5;
      var5 = var2230.get(1320);
      this.glShaderSourceARB = var5;
      var5 = var2230.get(1321);
      this.glCompileShaderARB = var5;
      var5 = var2230.get(1322);
      this.glCreateProgramObjectARB = var5;
      var5 = var2230.get(1323);
      this.glAttachObjectARB = var5;
      var5 = var2230.get(1324);
      this.glLinkProgramARB = var5;
      var5 = var2230.get(1325);
      this.glUseProgramObjectARB = var5;
      var5 = var2230.get(1326);
      this.glValidateProgramARB = var5;
      var5 = var2230.get(1327);
      this.glUniform1fARB = var5;
      var5 = var2230.get(1328);
      this.glUniform2fARB = var5;
      var5 = var2230.get(1329);
      this.glUniform3fARB = var5;
      var5 = var2230.get(1330);
      this.glUniform4fARB = var5;
      var5 = var2230.get(1331);
      this.glUniform1iARB = var5;
      var5 = var2230.get(1332);
      this.glUniform2iARB = var5;
      var5 = var2230.get(1333);
      this.glUniform3iARB = var5;
      var5 = var2230.get(1334);
      this.glUniform4iARB = var5;
      var5 = var2230.get(1335);
      this.glUniform1fvARB = var5;
      var5 = var2230.get(1336);
      this.glUniform2fvARB = var5;
      var5 = var2230.get(1337);
      this.glUniform3fvARB = var5;
      var5 = var2230.get(1338);
      this.glUniform4fvARB = var5;
      var5 = var2230.get(1339);
      this.glUniform1ivARB = var5;
      var5 = var2230.get(1340);
      this.glUniform2ivARB = var5;
      var5 = var2230.get(1341);
      this.glUniform3ivARB = var5;
      var5 = var2230.get(1342);
      this.glUniform4ivARB = var5;
      var5 = var2230.get(1343);
      this.glUniformMatrix2fvARB = var5;
      var5 = var2230.get(1344);
      this.glUniformMatrix3fvARB = var5;
      var5 = var2230.get(1345);
      this.glUniformMatrix4fvARB = var5;
      var5 = var2230.get(1346);
      this.glGetObjectParameterfvARB = var5;
      var5 = var2230.get(1347);
      this.glGetObjectParameterivARB = var5;
      var5 = var2230.get(1348);
      this.glGetInfoLogARB = var5;
      var5 = var2230.get(1349);
      this.glGetAttachedObjectsARB = var5;
      var5 = var2230.get(1350);
      this.glGetUniformLocationARB = var5;
      var5 = var2230.get(1351);
      this.glGetActiveUniformARB = var5;
      var5 = var2230.get(1352);
      this.glGetUniformfvARB = var5;
      var5 = var2230.get(1353);
      this.glGetUniformivARB = var5;
      var5 = var2230.get(1354);
      this.glGetShaderSourceARB = var5;
      var5 = var2230.get(1355);
      this.glNamedStringARB = var5;
      var5 = var2230.get(1356);
      this.glDeleteNamedStringARB = var5;
      var5 = var2230.get(1357);
      this.glCompileShaderIncludeARB = var5;
      var5 = var2230.get(1358);
      this.glIsNamedStringARB = var5;
      var5 = var2230.get(1359);
      this.glGetNamedStringARB = var5;
      var5 = var2230.get(1360);
      this.glGetNamedStringivARB = var5;
      var5 = var2230.get(1361);
      this.glBufferPageCommitmentARB = var5;
      var5 = var2230.get(1362);
      this.glNamedBufferPageCommitmentEXT = var5;
      var5 = var2230.get(1363);
      this.glNamedBufferPageCommitmentARB = var5;
      var5 = var2230.get(1364);
      this.glTexPageCommitmentARB = var5;
      var5 = var2230.get(1365);
      this.glTexturePageCommitmentEXT = var5;
      var5 = var2230.get(1366);
      this.glTexBufferARB = var5;
      var5 = var2230.get(1367);
      this.glTextureBufferRangeEXT = var5;
      var5 = var2230.get(1368);
      this.glCompressedTexImage3DARB = var5;
      var5 = var2230.get(1369);
      this.glCompressedTexImage2DARB = var5;
      var5 = var2230.get(1370);
      this.glCompressedTexImage1DARB = var5;
      var5 = var2230.get(1371);
      this.glCompressedTexSubImage3DARB = var5;
      var5 = var2230.get(1372);
      this.glCompressedTexSubImage2DARB = var5;
      var5 = var2230.get(1373);
      this.glCompressedTexSubImage1DARB = var5;
      var5 = var2230.get(1374);
      this.glGetCompressedTexImageARB = var5;
      var5 = var2230.get(1375);
      this.glTextureStorage1DEXT = var5;
      var5 = var2230.get(1376);
      this.glTextureStorage2DEXT = var5;
      var5 = var2230.get(1377);
      this.glTextureStorage3DEXT = var5;
      var5 = var2230.get(1378);
      this.glTextureStorage2DMultisampleEXT = var5;
      var5 = var2230.get(1379);
      this.glTextureStorage3DMultisampleEXT = var5;
      var5 = var2230.get(1380);
      this.glLoadTransposeMatrixfARB = var5;
      var5 = var2230.get(1381);
      this.glLoadTransposeMatrixdARB = var5;
      var5 = var2230.get(1382);
      this.glMultTransposeMatrixfARB = var5;
      var5 = var2230.get(1383);
      this.glMultTransposeMatrixdARB = var5;
      var5 = var2230.get(1384);
      this.glVertexArrayVertexAttribLOffsetEXT = var5;
      var5 = var2230.get(1385);
      this.glVertexArrayBindVertexBufferEXT = var5;
      var5 = var2230.get(1386);
      this.glVertexArrayVertexAttribFormatEXT = var5;
      var5 = var2230.get(1387);
      this.glVertexArrayVertexAttribIFormatEXT = var5;
      var5 = var2230.get(1388);
      this.glVertexArrayVertexAttribLFormatEXT = var5;
      var5 = var2230.get(1389);
      this.glVertexArrayVertexAttribBindingEXT = var5;
      var5 = var2230.get(1390);
      this.glVertexArrayVertexBindingDivisorEXT = var5;
      var5 = var2230.get(1391);
      this.glWeightfvARB = var5;
      var5 = var2230.get(1392);
      this.glWeightbvARB = var5;
      var5 = var2230.get(1393);
      this.glWeightubvARB = var5;
      var5 = var2230.get(1394);
      this.glWeightsvARB = var5;
      var5 = var2230.get(1395);
      this.glWeightusvARB = var5;
      var5 = var2230.get(1396);
      this.glWeightivARB = var5;
      var5 = var2230.get(1397);
      this.glWeightuivARB = var5;
      var5 = var2230.get(1398);
      this.glWeightdvARB = var5;
      var5 = var2230.get(1399);
      this.glWeightPointerARB = var5;
      var5 = var2230.get(1400);
      this.glVertexBlendARB = var5;
      var5 = var2230.get(1401);
      this.glBindBufferARB = var5;
      var5 = var2230.get(1402);
      this.glDeleteBuffersARB = var5;
      var5 = var2230.get(1403);
      this.glGenBuffersARB = var5;
      var5 = var2230.get(1404);
      this.glIsBufferARB = var5;
      var5 = var2230.get(1405);
      this.glBufferDataARB = var5;
      var5 = var2230.get(1406);
      this.glBufferSubDataARB = var5;
      var5 = var2230.get(1407);
      this.glGetBufferSubDataARB = var5;
      var5 = var2230.get(1408);
      this.glMapBufferARB = var5;
      var5 = var2230.get(1409);
      this.glUnmapBufferARB = var5;
      var5 = var2230.get(1410);
      this.glGetBufferParameterivARB = var5;
      var5 = var2230.get(1411);
      this.glGetBufferPointervARB = var5;
      var5 = var2230.get(1412);
      this.glVertexAttrib1sARB = var5;
      var5 = var2230.get(1413);
      this.glVertexAttrib1fARB = var5;
      var5 = var2230.get(1414);
      this.glVertexAttrib1dARB = var5;
      var5 = var2230.get(1415);
      this.glVertexAttrib2sARB = var5;
      var5 = var2230.get(1416);
      this.glVertexAttrib2fARB = var5;
      var5 = var2230.get(1417);
      this.glVertexAttrib2dARB = var5;
      var5 = var2230.get(1418);
      this.glVertexAttrib3sARB = var5;
      var5 = var2230.get(1419);
      this.glVertexAttrib3fARB = var5;
      var5 = var2230.get(1420);
      this.glVertexAttrib3dARB = var5;
      var5 = var2230.get(1421);
      this.glVertexAttrib4sARB = var5;
      var5 = var2230.get(1422);
      this.glVertexAttrib4fARB = var5;
      var5 = var2230.get(1423);
      this.glVertexAttrib4dARB = var5;
      var5 = var2230.get(1424);
      this.glVertexAttrib4NubARB = var5;
      var5 = var2230.get(1425);
      this.glVertexAttrib1svARB = var5;
      var5 = var2230.get(1426);
      this.glVertexAttrib1fvARB = var5;
      var5 = var2230.get(1427);
      this.glVertexAttrib1dvARB = var5;
      var5 = var2230.get(1428);
      this.glVertexAttrib2svARB = var5;
      var5 = var2230.get(1429);
      this.glVertexAttrib2fvARB = var5;
      var5 = var2230.get(1430);
      this.glVertexAttrib2dvARB = var5;
      var5 = var2230.get(1431);
      this.glVertexAttrib3svARB = var5;
      var5 = var2230.get(1432);
      this.glVertexAttrib3fvARB = var5;
      var5 = var2230.get(1433);
      this.glVertexAttrib3dvARB = var5;
      var5 = var2230.get(1434);
      this.glVertexAttrib4fvARB = var5;
      var5 = var2230.get(1435);
      this.glVertexAttrib4bvARB = var5;
      var5 = var2230.get(1436);
      this.glVertexAttrib4svARB = var5;
      var5 = var2230.get(1437);
      this.glVertexAttrib4ivARB = var5;
      var5 = var2230.get(1438);
      this.glVertexAttrib4ubvARB = var5;
      var5 = var2230.get(1439);
      this.glVertexAttrib4usvARB = var5;
      var5 = var2230.get(1440);
      this.glVertexAttrib4uivARB = var5;
      var5 = var2230.get(1441);
      this.glVertexAttrib4dvARB = var5;
      var5 = var2230.get(1442);
      this.glVertexAttrib4NbvARB = var5;
      var5 = var2230.get(1443);
      this.glVertexAttrib4NsvARB = var5;
      var5 = var2230.get(1444);
      this.glVertexAttrib4NivARB = var5;
      var5 = var2230.get(1445);
      this.glVertexAttrib4NubvARB = var5;
      var5 = var2230.get(1446);
      this.glVertexAttrib4NusvARB = var5;
      var5 = var2230.get(1447);
      this.glVertexAttrib4NuivARB = var5;
      var5 = var2230.get(1448);
      this.glVertexAttribPointerARB = var5;
      var5 = var2230.get(1449);
      this.glEnableVertexAttribArrayARB = var5;
      var5 = var2230.get(1450);
      this.glDisableVertexAttribArrayARB = var5;
      var5 = var2230.get(1451);
      this.glProgramStringARB = var5;
      var5 = var2230.get(1452);
      this.glBindProgramARB = var5;
      var5 = var2230.get(1453);
      this.glDeleteProgramsARB = var5;
      var5 = var2230.get(1454);
      this.glGenProgramsARB = var5;
      var5 = var2230.get(1455);
      this.glProgramEnvParameter4dARB = var5;
      var5 = var2230.get(1456);
      this.glProgramEnvParameter4dvARB = var5;
      var5 = var2230.get(1457);
      this.glProgramEnvParameter4fARB = var5;
      var5 = var2230.get(1458);
      this.glProgramEnvParameter4fvARB = var5;
      var5 = var2230.get(1459);
      this.glProgramLocalParameter4dARB = var5;
      var5 = var2230.get(1460);
      this.glProgramLocalParameter4dvARB = var5;
      var5 = var2230.get(1461);
      this.glProgramLocalParameter4fARB = var5;
      var5 = var2230.get(1462);
      this.glProgramLocalParameter4fvARB = var5;
      var5 = var2230.get(1463);
      this.glGetProgramEnvParameterfvARB = var5;
      var5 = var2230.get(1464);
      this.glGetProgramEnvParameterdvARB = var5;
      var5 = var2230.get(1465);
      this.glGetProgramLocalParameterfvARB = var5;
      var5 = var2230.get(1466);
      this.glGetProgramLocalParameterdvARB = var5;
      var5 = var2230.get(1467);
      this.glGetProgramivARB = var5;
      var5 = var2230.get(1468);
      this.glGetProgramStringARB = var5;
      var5 = var2230.get(1469);
      this.glGetVertexAttribfvARB = var5;
      var5 = var2230.get(1470);
      this.glGetVertexAttribdvARB = var5;
      var5 = var2230.get(1471);
      this.glGetVertexAttribivARB = var5;
      var5 = var2230.get(1472);
      this.glGetVertexAttribPointervARB = var5;
      var5 = var2230.get(1473);
      this.glIsProgramARB = var5;
      var5 = var2230.get(1474);
      this.glBindAttribLocationARB = var5;
      var5 = var2230.get(1475);
      this.glGetActiveAttribARB = var5;
      var5 = var2230.get(1476);
      this.glGetAttribLocationARB = var5;
      var5 = var2230.get(1477);
      this.glWindowPos2iARB = var5;
      var5 = var2230.get(1478);
      this.glWindowPos2sARB = var5;
      var5 = var2230.get(1479);
      this.glWindowPos2fARB = var5;
      var5 = var2230.get(1480);
      this.glWindowPos2dARB = var5;
      var5 = var2230.get(1481);
      this.glWindowPos2ivARB = var5;
      var5 = var2230.get(1482);
      this.glWindowPos2svARB = var5;
      var5 = var2230.get(1483);
      this.glWindowPos2fvARB = var5;
      var5 = var2230.get(1484);
      this.glWindowPos2dvARB = var5;
      var5 = var2230.get(1485);
      this.glWindowPos3iARB = var5;
      var5 = var2230.get(1486);
      this.glWindowPos3sARB = var5;
      var5 = var2230.get(1487);
      this.glWindowPos3fARB = var5;
      var5 = var2230.get(1488);
      this.glWindowPos3dARB = var5;
      var5 = var2230.get(1489);
      this.glWindowPos3ivARB = var5;
      var5 = var2230.get(1490);
      this.glWindowPos3svARB = var5;
      var5 = var2230.get(1491);
      this.glWindowPos3fvARB = var5;
      var5 = var2230.get(1492);
      this.glWindowPos3dvARB = var5;
      var5 = var2230.get(1493);
      this.glUniformBufferEXT = var5;
      var5 = var2230.get(1494);
      this.glGetUniformBufferSizeEXT = var5;
      var5 = var2230.get(1495);
      this.glGetUniformOffsetEXT = var5;
      var5 = var2230.get(1496);
      this.glBlendColorEXT = var5;
      var5 = var2230.get(1497);
      this.glBlendEquationSeparateEXT = var5;
      var5 = var2230.get(1498);
      this.glBlendFuncSeparateEXT = var5;
      var5 = var2230.get(1499);
      this.glBlendEquationEXT = var5;
      var5 = var2230.get(1500);
      this.glLockArraysEXT = var5;
      var5 = var2230.get(1501);
      this.glUnlockArraysEXT = var5;
      var5 = var2230.get(1502);
      this.glLabelObjectEXT = var5;
      var5 = var2230.get(1503);
      this.glGetObjectLabelEXT = var5;
      var5 = var2230.get(1504);
      this.glInsertEventMarkerEXT = var5;
      var5 = var2230.get(1505);
      this.glPushGroupMarkerEXT = var5;
      var5 = var2230.get(1506);
      this.glPopGroupMarkerEXT = var5;
      var5 = var2230.get(1507);
      this.glDepthBoundsEXT = var5;
      var5 = var2230.get(1508);
      this.glClientAttribDefaultEXT = var5;
      var5 = var2230.get(1509);
      this.glPushClientAttribDefaultEXT = var5;
      var5 = var2230.get(1510);
      this.glMatrixLoadfEXT = var5;
      var5 = var2230.get(1511);
      this.glMatrixLoaddEXT = var5;
      var5 = var2230.get(1512);
      this.glMatrixMultfEXT = var5;
      var5 = var2230.get(1513);
      this.glMatrixMultdEXT = var5;
      var5 = var2230.get(1514);
      this.glMatrixLoadIdentityEXT = var5;
      var5 = var2230.get(1515);
      this.glMatrixRotatefEXT = var5;
      var5 = var2230.get(1516);
      this.glMatrixRotatedEXT = var5;
      var5 = var2230.get(1517);
      this.glMatrixScalefEXT = var5;
      var5 = var2230.get(1518);
      this.glMatrixScaledEXT = var5;
      var5 = var2230.get(1519);
      this.glMatrixTranslatefEXT = var5;
      var5 = var2230.get(1520);
      this.glMatrixTranslatedEXT = var5;
      var5 = var2230.get(1521);
      this.glMatrixOrthoEXT = var5;
      var5 = var2230.get(1522);
      this.glMatrixFrustumEXT = var5;
      var5 = var2230.get(1523);
      this.glMatrixPushEXT = var5;
      var5 = var2230.get(1524);
      this.glMatrixPopEXT = var5;
      var5 = var2230.get(1525);
      this.glTextureParameteriEXT = var5;
      var5 = var2230.get(1526);
      this.glTextureParameterivEXT = var5;
      var5 = var2230.get(1527);
      this.glTextureParameterfEXT = var5;
      var5 = var2230.get(1528);
      this.glTextureParameterfvEXT = var5;
      var5 = var2230.get(1529);
      this.glTextureImage1DEXT = var5;
      var5 = var2230.get(1530);
      this.glTextureImage2DEXT = var5;
      var5 = var2230.get(1531);
      this.glTextureSubImage1DEXT = var5;
      var5 = var2230.get(1532);
      this.glTextureSubImage2DEXT = var5;
      var5 = var2230.get(1533);
      this.glCopyTextureImage1DEXT = var5;
      var5 = var2230.get(1534);
      this.glCopyTextureImage2DEXT = var5;
      var5 = var2230.get(1535);
      this.glCopyTextureSubImage1DEXT = var5;
      var5 = var2230.get(1536);
      this.glCopyTextureSubImage2DEXT = var5;
      var5 = var2230.get(1537);
      this.glGetTextureImageEXT = var5;
      var5 = var2230.get(1538);
      this.glGetTextureParameterfvEXT = var5;
      var5 = var2230.get(1539);
      this.glGetTextureParameterivEXT = var5;
      var5 = var2230.get(1540);
      this.glGetTextureLevelParameterfvEXT = var5;
      var5 = var2230.get(1541);
      this.glGetTextureLevelParameterivEXT = var5;
      var5 = var2230.get(1542);
      this.glTextureImage3DEXT = var5;
      var5 = var2230.get(1543);
      this.glTextureSubImage3DEXT = var5;
      var5 = var2230.get(1544);
      this.glCopyTextureSubImage3DEXT = var5;
      var5 = var2230.get(1545);
      this.glBindMultiTextureEXT = var5;
      var5 = var2230.get(1546);
      this.glMultiTexCoordPointerEXT = var5;
      var5 = var2230.get(1547);
      this.glMultiTexEnvfEXT = var5;
      var5 = var2230.get(1548);
      this.glMultiTexEnvfvEXT = var5;
      var5 = var2230.get(1549);
      this.glMultiTexEnviEXT = var5;
      var5 = var2230.get(1550);
      this.glMultiTexEnvivEXT = var5;
      var5 = var2230.get(1551);
      this.glMultiTexGendEXT = var5;
      var5 = var2230.get(1552);
      this.glMultiTexGendvEXT = var5;
      var5 = var2230.get(1553);
      this.glMultiTexGenfEXT = var5;
      var5 = var2230.get(1554);
      this.glMultiTexGenfvEXT = var5;
      var5 = var2230.get(1555);
      this.glMultiTexGeniEXT = var5;
      var5 = var2230.get(1556);
      this.glMultiTexGenivEXT = var5;
      var5 = var2230.get(1557);
      this.glGetMultiTexEnvfvEXT = var5;
      var5 = var2230.get(1558);
      this.glGetMultiTexEnvivEXT = var5;
      var5 = var2230.get(1559);
      this.glGetMultiTexGendvEXT = var5;
      var5 = var2230.get(1560);
      this.glGetMultiTexGenfvEXT = var5;
      var5 = var2230.get(1561);
      this.glGetMultiTexGenivEXT = var5;
      var5 = var2230.get(1562);
      this.glMultiTexParameteriEXT = var5;
      var5 = var2230.get(1563);
      this.glMultiTexParameterivEXT = var5;
      var5 = var2230.get(1564);
      this.glMultiTexParameterfEXT = var5;
      var5 = var2230.get(1565);
      this.glMultiTexParameterfvEXT = var5;
      var5 = var2230.get(1566);
      this.glMultiTexImage1DEXT = var5;
      var5 = var2230.get(1567);
      this.glMultiTexImage2DEXT = var5;
      var5 = var2230.get(1568);
      this.glMultiTexSubImage1DEXT = var5;
      var5 = var2230.get(1569);
      this.glMultiTexSubImage2DEXT = var5;
      var5 = var2230.get(1570);
      this.glCopyMultiTexImage1DEXT = var5;
      var5 = var2230.get(1571);
      this.glCopyMultiTexImage2DEXT = var5;
      var5 = var2230.get(1572);
      this.glCopyMultiTexSubImage1DEXT = var5;
      var5 = var2230.get(1573);
      this.glCopyMultiTexSubImage2DEXT = var5;
      var5 = var2230.get(1574);
      this.glGetMultiTexImageEXT = var5;
      var5 = var2230.get(1575);
      this.glGetMultiTexParameterfvEXT = var5;
      var5 = var2230.get(1576);
      this.glGetMultiTexParameterivEXT = var5;
      var5 = var2230.get(1577);
      this.glGetMultiTexLevelParameterfvEXT = var5;
      var5 = var2230.get(1578);
      this.glGetMultiTexLevelParameterivEXT = var5;
      var5 = var2230.get(1579);
      this.glMultiTexImage3DEXT = var5;
      var5 = var2230.get(1580);
      this.glMultiTexSubImage3DEXT = var5;
      var5 = var2230.get(1581);
      this.glCopyMultiTexSubImage3DEXT = var5;
      var5 = var2230.get(1582);
      this.glEnableClientStateIndexedEXT = var5;
      var5 = var2230.get(1583);
      this.glDisableClientStateIndexedEXT = var5;
      var5 = var2230.get(1584);
      this.glEnableClientStateiEXT = var5;
      var5 = var2230.get(1585);
      this.glDisableClientStateiEXT = var5;
      var5 = var2230.get(1586);
      this.glGetFloatIndexedvEXT = var5;
      var5 = var2230.get(1587);
      this.glGetDoubleIndexedvEXT = var5;
      var5 = var2230.get(1588);
      this.glGetPointerIndexedvEXT = var5;
      var5 = var2230.get(1589);
      this.glGetFloati_vEXT = var5;
      var5 = var2230.get(1590);
      this.glGetDoublei_vEXT = var5;
      var5 = var2230.get(1591);
      this.glGetPointeri_vEXT = var5;
      var5 = var2230.get(1592);
      this.glEnableIndexedEXT = var5;
      var5 = var2230.get(1593);
      this.glDisableIndexedEXT = var5;
      var5 = var2230.get(1594);
      this.glIsEnabledIndexedEXT = var5;
      var5 = var2230.get(1595);
      this.glGetIntegerIndexedvEXT = var5;
      var5 = var2230.get(1596);
      this.glGetBooleanIndexedvEXT = var5;
      var5 = var2230.get(1597);
      this.glNamedProgramStringEXT = var5;
      var5 = var2230.get(1598);
      this.glNamedProgramLocalParameter4dEXT = var5;
      var5 = var2230.get(1599);
      this.glNamedProgramLocalParameter4dvEXT = var5;
      var5 = var2230.get(1600);
      this.glNamedProgramLocalParameter4fEXT = var5;
      var5 = var2230.get(1601);
      this.glNamedProgramLocalParameter4fvEXT = var5;
      var5 = var2230.get(1602);
      this.glGetNamedProgramLocalParameterdvEXT = var5;
      var5 = var2230.get(1603);
      this.glGetNamedProgramLocalParameterfvEXT = var5;
      var5 = var2230.get(1604);
      this.glGetNamedProgramivEXT = var5;
      var5 = var2230.get(1605);
      this.glGetNamedProgramStringEXT = var5;
      var5 = var2230.get(1606);
      this.glCompressedTextureImage3DEXT = var5;
      var5 = var2230.get(1607);
      this.glCompressedTextureImage2DEXT = var5;
      var5 = var2230.get(1608);
      this.glCompressedTextureImage1DEXT = var5;
      var5 = var2230.get(1609);
      this.glCompressedTextureSubImage3DEXT = var5;
      var5 = var2230.get(1610);
      this.glCompressedTextureSubImage2DEXT = var5;
      var5 = var2230.get(1611);
      this.glCompressedTextureSubImage1DEXT = var5;
      var5 = var2230.get(1612);
      this.glGetCompressedTextureImageEXT = var5;
      var5 = var2230.get(1613);
      this.glCompressedMultiTexImage3DEXT = var5;
      var5 = var2230.get(1614);
      this.glCompressedMultiTexImage2DEXT = var5;
      var5 = var2230.get(1615);
      this.glCompressedMultiTexImage1DEXT = var5;
      var5 = var2230.get(1616);
      this.glCompressedMultiTexSubImage3DEXT = var5;
      var5 = var2230.get(1617);
      this.glCompressedMultiTexSubImage2DEXT = var5;
      var5 = var2230.get(1618);
      this.glCompressedMultiTexSubImage1DEXT = var5;
      var5 = var2230.get(1619);
      this.glGetCompressedMultiTexImageEXT = var5;
      var5 = var2230.get(1620);
      this.glMatrixLoadTransposefEXT = var5;
      var5 = var2230.get(1621);
      this.glMatrixLoadTransposedEXT = var5;
      var5 = var2230.get(1622);
      this.glMatrixMultTransposefEXT = var5;
      var5 = var2230.get(1623);
      this.glMatrixMultTransposedEXT = var5;
      var5 = var2230.get(1624);
      this.glNamedBufferDataEXT = var5;
      var5 = var2230.get(1625);
      this.glNamedBufferSubDataEXT = var5;
      var5 = var2230.get(1626);
      this.glMapNamedBufferEXT = var5;
      var5 = var2230.get(1627);
      this.glUnmapNamedBufferEXT = var5;
      var5 = var2230.get(1628);
      this.glGetNamedBufferParameterivEXT = var5;
      var5 = var2230.get(1629);
      this.glGetNamedBufferSubDataEXT = var5;
      var5 = var2230.get(1630);
      this.glProgramUniform1fEXT = var5;
      var5 = var2230.get(1631);
      this.glProgramUniform2fEXT = var5;
      var5 = var2230.get(1632);
      this.glProgramUniform3fEXT = var5;
      var5 = var2230.get(1633);
      this.glProgramUniform4fEXT = var5;
      var5 = var2230.get(1634);
      this.glProgramUniform1iEXT = var5;
      var5 = var2230.get(1635);
      this.glProgramUniform2iEXT = var5;
      var5 = var2230.get(1636);
      this.glProgramUniform3iEXT = var5;
      var5 = var2230.get(1637);
      this.glProgramUniform4iEXT = var5;
      var5 = var2230.get(1638);
      this.glProgramUniform1fvEXT = var5;
      var5 = var2230.get(1639);
      this.glProgramUniform2fvEXT = var5;
      var5 = var2230.get(1640);
      this.glProgramUniform3fvEXT = var5;
      var5 = var2230.get(1641);
      this.glProgramUniform4fvEXT = var5;
      var5 = var2230.get(1642);
      this.glProgramUniform1ivEXT = var5;
      var5 = var2230.get(1643);
      this.glProgramUniform2ivEXT = var5;
      var5 = var2230.get(1644);
      this.glProgramUniform3ivEXT = var5;
      var5 = var2230.get(1645);
      this.glProgramUniform4ivEXT = var5;
      var5 = var2230.get(1646);
      this.glProgramUniformMatrix2fvEXT = var5;
      var5 = var2230.get(1647);
      this.glProgramUniformMatrix3fvEXT = var5;
      var5 = var2230.get(1648);
      this.glProgramUniformMatrix4fvEXT = var5;
      var5 = var2230.get(1649);
      this.glProgramUniformMatrix2x3fvEXT = var5;
      var5 = var2230.get(1650);
      this.glProgramUniformMatrix3x2fvEXT = var5;
      var5 = var2230.get(1651);
      this.glProgramUniformMatrix2x4fvEXT = var5;
      var5 = var2230.get(1652);
      this.glProgramUniformMatrix4x2fvEXT = var5;
      var5 = var2230.get(1653);
      this.glProgramUniformMatrix3x4fvEXT = var5;
      var5 = var2230.get(1654);
      this.glProgramUniformMatrix4x3fvEXT = var5;
      var5 = var2230.get(1655);
      this.glTextureBufferEXT = var5;
      var5 = var2230.get(1656);
      this.glMultiTexBufferEXT = var5;
      var5 = var2230.get(1657);
      this.glTextureParameterIivEXT = var5;
      var5 = var2230.get(1658);
      this.glTextureParameterIuivEXT = var5;
      var5 = var2230.get(1659);
      this.glGetTextureParameterIivEXT = var5;
      var5 = var2230.get(1660);
      this.glGetTextureParameterIuivEXT = var5;
      var5 = var2230.get(1661);
      this.glMultiTexParameterIivEXT = var5;
      var5 = var2230.get(1662);
      this.glMultiTexParameterIuivEXT = var5;
      var5 = var2230.get(1663);
      this.glGetMultiTexParameterIivEXT = var5;
      var5 = var2230.get(1664);
      this.glGetMultiTexParameterIuivEXT = var5;
      var5 = var2230.get(1665);
      this.glProgramUniform1uiEXT = var5;
      var5 = var2230.get(1666);
      this.glProgramUniform2uiEXT = var5;
      var5 = var2230.get(1667);
      this.glProgramUniform3uiEXT = var5;
      var5 = var2230.get(1668);
      this.glProgramUniform4uiEXT = var5;
      var5 = var2230.get(1669);
      this.glProgramUniform1uivEXT = var5;
      var5 = var2230.get(1670);
      this.glProgramUniform2uivEXT = var5;
      var5 = var2230.get(1671);
      this.glProgramUniform3uivEXT = var5;
      var5 = var2230.get(1672);
      this.glProgramUniform4uivEXT = var5;
      var5 = var2230.get(1673);
      this.glNamedProgramLocalParameters4fvEXT = var5;
      var5 = var2230.get(1674);
      this.glNamedProgramLocalParameterI4iEXT = var5;
      var5 = var2230.get(1675);
      this.glNamedProgramLocalParameterI4ivEXT = var5;
      var5 = var2230.get(1676);
      this.glNamedProgramLocalParametersI4ivEXT = var5;
      var5 = var2230.get(1677);
      this.glNamedProgramLocalParameterI4uiEXT = var5;
      var5 = var2230.get(1678);
      this.glNamedProgramLocalParameterI4uivEXT = var5;
      var5 = var2230.get(1679);
      this.glNamedProgramLocalParametersI4uivEXT = var5;
      var5 = var2230.get(1680);
      this.glGetNamedProgramLocalParameterIivEXT = var5;
      var5 = var2230.get(1681);
      this.glGetNamedProgramLocalParameterIuivEXT = var5;
      var5 = var2230.get(1682);
      this.glNamedRenderbufferStorageEXT = var5;
      var5 = var2230.get(1683);
      this.glGetNamedRenderbufferParameterivEXT = var5;
      var5 = var2230.get(1684);
      this.glNamedRenderbufferStorageMultisampleEXT = var5;
      var5 = var2230.get(1685);
      this.glNamedRenderbufferStorageMultisampleCoverageEXT = var5;
      var5 = var2230.get(1686);
      this.glCheckNamedFramebufferStatusEXT = var5;
      var5 = var2230.get(1687);
      this.glNamedFramebufferTexture1DEXT = var5;
      var5 = var2230.get(1688);
      this.glNamedFramebufferTexture2DEXT = var5;
      var5 = var2230.get(1689);
      this.glNamedFramebufferTexture3DEXT = var5;
      var5 = var2230.get(1690);
      this.glNamedFramebufferRenderbufferEXT = var5;
      var5 = var2230.get(1691);
      this.glGetNamedFramebufferAttachmentParameterivEXT = var5;
      var5 = var2230.get(1692);
      this.glGenerateTextureMipmapEXT = var5;
      var5 = var2230.get(1693);
      this.glGenerateMultiTexMipmapEXT = var5;
      var5 = var2230.get(1694);
      this.glFramebufferDrawBufferEXT = var5;
      var5 = var2230.get(1695);
      this.glFramebufferDrawBuffersEXT = var5;
      var5 = var2230.get(1696);
      this.glFramebufferReadBufferEXT = var5;
      var5 = var2230.get(1697);
      this.glGetFramebufferParameterivEXT = var5;
      var5 = var2230.get(1698);
      this.glNamedCopyBufferSubDataEXT = var5;
      var5 = var2230.get(1699);
      this.glNamedFramebufferTextureEXT = var5;
      var5 = var2230.get(1700);
      this.glNamedFramebufferTextureLayerEXT = var5;
      var5 = var2230.get(1701);
      this.glNamedFramebufferTextureFaceEXT = var5;
      var5 = var2230.get(1702);
      this.glTextureRenderbufferEXT = var5;
      var5 = var2230.get(1703);
      this.glMultiTexRenderbufferEXT = var5;
      var5 = var2230.get(1704);
      this.glVertexArrayVertexOffsetEXT = var5;
      var5 = var2230.get(1705);
      this.glVertexArrayColorOffsetEXT = var5;
      var5 = var2230.get(1706);
      this.glVertexArrayEdgeFlagOffsetEXT = var5;
      var5 = var2230.get(1707);
      this.glVertexArrayIndexOffsetEXT = var5;
      var5 = var2230.get(1708);
      this.glVertexArrayNormalOffsetEXT = var5;
      var5 = var2230.get(1709);
      this.glVertexArrayTexCoordOffsetEXT = var5;
      var5 = var2230.get(1710);
      this.glVertexArrayMultiTexCoordOffsetEXT = var5;
      var5 = var2230.get(1711);
      this.glVertexArrayFogCoordOffsetEXT = var5;
      var5 = var2230.get(1712);
      this.glVertexArraySecondaryColorOffsetEXT = var5;
      var5 = var2230.get(1713);
      this.glVertexArrayVertexAttribOffsetEXT = var5;
      var5 = var2230.get(1714);
      this.glVertexArrayVertexAttribIOffsetEXT = var5;
      var5 = var2230.get(1715);
      this.glEnableVertexArrayEXT = var5;
      var5 = var2230.get(1716);
      this.glDisableVertexArrayEXT = var5;
      var5 = var2230.get(1717);
      this.glEnableVertexArrayAttribEXT = var5;
      var5 = var2230.get(1718);
      this.glDisableVertexArrayAttribEXT = var5;
      var5 = var2230.get(1719);
      this.glGetVertexArrayIntegervEXT = var5;
      var5 = var2230.get(1720);
      this.glGetVertexArrayPointervEXT = var5;
      var5 = var2230.get(1721);
      this.glGetVertexArrayIntegeri_vEXT = var5;
      var5 = var2230.get(1722);
      this.glGetVertexArrayPointeri_vEXT = var5;
      var5 = var2230.get(1723);
      this.glMapNamedBufferRangeEXT = var5;
      var5 = var2230.get(1724);
      this.glFlushMappedNamedBufferRangeEXT = var5;
      var5 = var2230.get(1725);
      this.glColorMaskIndexedEXT = var5;
      var5 = var2230.get(1726);
      this.glDrawArraysInstancedEXT = var5;
      var5 = var2230.get(1727);
      this.glDrawElementsInstancedEXT = var5;
      var5 = var2230.get(1728);
      this.glEGLImageTargetTexStorageEXT = var5;
      var5 = var2230.get(1729);
      this.glEGLImageTargetTextureStorageEXT = var5;
      var5 = var2230.get(1730);
      this.glBufferStorageExternalEXT = var5;
      var5 = var2230.get(1731);
      this.glNamedBufferStorageExternalEXT = var5;
      var5 = var2230.get(1732);
      this.glBlitFramebufferEXT = var5;
      var5 = var2230.get(1733);
      this.glBlitFramebufferLayersEXT = var5;
      var5 = var2230.get(1734);
      this.glBlitFramebufferLayerEXT = var5;
      var5 = var2230.get(1735);
      this.glRenderbufferStorageMultisampleEXT = var5;
      var5 = var2230.get(1736);
      this.glIsRenderbufferEXT = var5;
      var5 = var2230.get(1737);
      this.glBindRenderbufferEXT = var5;
      var5 = var2230.get(1738);
      this.glDeleteRenderbuffersEXT = var5;
      var5 = var2230.get(1739);
      this.glGenRenderbuffersEXT = var5;
      var5 = var2230.get(1740);
      this.glRenderbufferStorageEXT = var5;
      var5 = var2230.get(1741);
      this.glGetRenderbufferParameterivEXT = var5;
      var5 = var2230.get(1742);
      this.glIsFramebufferEXT = var5;
      var5 = var2230.get(1743);
      this.glBindFramebufferEXT = var5;
      var5 = var2230.get(1744);
      this.glDeleteFramebuffersEXT = var5;
      var5 = var2230.get(1745);
      this.glGenFramebuffersEXT = var5;
      var5 = var2230.get(1746);
      this.glCheckFramebufferStatusEXT = var5;
      var5 = var2230.get(1747);
      this.glFramebufferTexture1DEXT = var5;
      var5 = var2230.get(1748);
      this.glFramebufferTexture2DEXT = var5;
      var5 = var2230.get(1749);
      this.glFramebufferTexture3DEXT = var5;
      var5 = var2230.get(1750);
      this.glFramebufferRenderbufferEXT = var5;
      var5 = var2230.get(1751);
      this.glGetFramebufferAttachmentParameterivEXT = var5;
      var5 = var2230.get(1752);
      this.glGenerateMipmapEXT = var5;
      var5 = var2230.get(1753);
      this.glProgramParameteriEXT = var5;
      var5 = var2230.get(1754);
      this.glFramebufferTextureEXT = var5;
      var5 = var2230.get(1755);
      this.glFramebufferTextureLayerEXT = var5;
      var5 = var2230.get(1756);
      this.glFramebufferTextureFaceEXT = var5;
      var5 = var2230.get(1757);
      this.glProgramEnvParameters4fvEXT = var5;
      var5 = var2230.get(1758);
      this.glProgramLocalParameters4fvEXT = var5;
      var5 = var2230.get(1759);
      this.glVertexAttribI1iEXT = var5;
      var5 = var2230.get(1760);
      this.glVertexAttribI2iEXT = var5;
      var5 = var2230.get(1761);
      this.glVertexAttribI3iEXT = var5;
      var5 = var2230.get(1762);
      this.glVertexAttribI4iEXT = var5;
      var5 = var2230.get(1763);
      this.glVertexAttribI1uiEXT = var5;
      var5 = var2230.get(1764);
      this.glVertexAttribI2uiEXT = var5;
      var5 = var2230.get(1765);
      this.glVertexAttribI3uiEXT = var5;
      var5 = var2230.get(1766);
      this.glVertexAttribI4uiEXT = var5;
      var5 = var2230.get(1767);
      this.glVertexAttribI1ivEXT = var5;
      var5 = var2230.get(1768);
      this.glVertexAttribI2ivEXT = var5;
      var5 = var2230.get(1769);
      this.glVertexAttribI3ivEXT = var5;
      var5 = var2230.get(1770);
      this.glVertexAttribI4ivEXT = var5;
      var5 = var2230.get(1771);
      this.glVertexAttribI1uivEXT = var5;
      var5 = var2230.get(1772);
      this.glVertexAttribI2uivEXT = var5;
      var5 = var2230.get(1773);
      this.glVertexAttribI3uivEXT = var5;
      var5 = var2230.get(1774);
      this.glVertexAttribI4uivEXT = var5;
      var5 = var2230.get(1775);
      this.glVertexAttribI4bvEXT = var5;
      var5 = var2230.get(1776);
      this.glVertexAttribI4svEXT = var5;
      var5 = var2230.get(1777);
      this.glVertexAttribI4ubvEXT = var5;
      var5 = var2230.get(1778);
      this.glVertexAttribI4usvEXT = var5;
      var5 = var2230.get(1779);
      this.glVertexAttribIPointerEXT = var5;
      var5 = var2230.get(1780);
      this.glGetVertexAttribIivEXT = var5;
      var5 = var2230.get(1781);
      this.glGetVertexAttribIuivEXT = var5;
      var5 = var2230.get(1782);
      this.glGetUniformuivEXT = var5;
      var5 = var2230.get(1783);
      this.glBindFragDataLocationEXT = var5;
      var5 = var2230.get(1784);
      this.glGetFragDataLocationEXT = var5;
      var5 = var2230.get(1785);
      this.glUniform1uiEXT = var5;
      var5 = var2230.get(1786);
      this.glUniform2uiEXT = var5;
      var5 = var2230.get(1787);
      this.glUniform3uiEXT = var5;
      var5 = var2230.get(1788);
      this.glUniform4uiEXT = var5;
      var5 = var2230.get(1789);
      this.glUniform1uivEXT = var5;
      var5 = var2230.get(1790);
      this.glUniform2uivEXT = var5;
      var5 = var2230.get(1791);
      this.glUniform3uivEXT = var5;
      var5 = var2230.get(1792);
      this.glUniform4uivEXT = var5;
      var5 = var2230.get(1793);
      this.glGetUnsignedBytevEXT = var5;
      var5 = var2230.get(1794);
      this.glGetUnsignedBytei_vEXT = var5;
      var5 = var2230.get(1795);
      this.glDeleteMemoryObjectsEXT = var5;
      var5 = var2230.get(1796);
      this.glIsMemoryObjectEXT = var5;
      var5 = var2230.get(1797);
      this.glCreateMemoryObjectsEXT = var5;
      var5 = var2230.get(1798);
      this.glMemoryObjectParameterivEXT = var5;
      var5 = var2230.get(1799);
      this.glGetMemoryObjectParameterivEXT = var5;
      var5 = var2230.get(1800);
      this.glTexStorageMem2DEXT = var5;
      var5 = var2230.get(1801);
      this.glTexStorageMem2DMultisampleEXT = var5;
      var5 = var2230.get(1802);
      this.glTexStorageMem3DEXT = var5;
      var5 = var2230.get(1803);
      this.glTexStorageMem3DMultisampleEXT = var5;
      var5 = var2230.get(1804);
      this.glBufferStorageMemEXT = var5;
      var5 = var2230.get(1805);
      this.glTextureStorageMem2DEXT = var5;
      var5 = var2230.get(1806);
      this.glTextureStorageMem2DMultisampleEXT = var5;
      var5 = var2230.get(1807);
      this.glTextureStorageMem3DEXT = var5;
      var5 = var2230.get(1808);
      this.glTextureStorageMem3DMultisampleEXT = var5;
      var5 = var2230.get(1809);
      this.glNamedBufferStorageMemEXT = var5;
      var5 = var2230.get(1810);
      this.glTexStorageMem1DEXT = var5;
      var5 = var2230.get(1811);
      this.glTextureStorageMem1DEXT = var5;
      var5 = var2230.get(1812);
      this.glImportMemoryFdEXT = var5;
      var5 = var2230.get(1813);
      this.glImportMemoryWin32HandleEXT = var5;
      var5 = var2230.get(1814);
      this.glImportMemoryWin32NameEXT = var5;
      var5 = var2230.get(1815);
      this.glPointParameterfEXT = var5;
      var5 = var2230.get(1816);
      this.glPointParameterfvEXT = var5;
      var5 = var2230.get(1817);
      this.glPolygonOffsetClampEXT = var5;
      var5 = var2230.get(1818);
      this.glProvokingVertexEXT = var5;
      var5 = var2230.get(1819);
      this.glRasterSamplesEXT = var5;
      var5 = var2230.get(1820);
      this.glSecondaryColor3bEXT = var5;
      var5 = var2230.get(1821);
      this.glSecondaryColor3sEXT = var5;
      var5 = var2230.get(1822);
      this.glSecondaryColor3iEXT = var5;
      var5 = var2230.get(1823);
      this.glSecondaryColor3fEXT = var5;
      var5 = var2230.get(1824);
      this.glSecondaryColor3dEXT = var5;
      var5 = var2230.get(1825);
      this.glSecondaryColor3ubEXT = var5;
      var5 = var2230.get(1826);
      this.glSecondaryColor3usEXT = var5;
      var5 = var2230.get(1827);
      this.glSecondaryColor3uiEXT = var5;
      var5 = var2230.get(1828);
      this.glSecondaryColor3bvEXT = var5;
      var5 = var2230.get(1829);
      this.glSecondaryColor3svEXT = var5;
      var5 = var2230.get(1830);
      this.glSecondaryColor3ivEXT = var5;
      var5 = var2230.get(1831);
      this.glSecondaryColor3fvEXT = var5;
      var5 = var2230.get(1832);
      this.glSecondaryColor3dvEXT = var5;
      var5 = var2230.get(1833);
      this.glSecondaryColor3ubvEXT = var5;
      var5 = var2230.get(1834);
      this.glSecondaryColor3usvEXT = var5;
      var5 = var2230.get(1835);
      this.glSecondaryColor3uivEXT = var5;
      var5 = var2230.get(1836);
      this.glSecondaryColorPointerEXT = var5;
      var5 = var2230.get(1837);
      this.glGenSemaphoresEXT = var5;
      var5 = var2230.get(1838);
      this.glDeleteSemaphoresEXT = var5;
      var5 = var2230.get(1839);
      this.glIsSemaphoreEXT = var5;
      var5 = var2230.get(1840);
      this.glSemaphoreParameterui64vEXT = var5;
      var5 = var2230.get(1841);
      this.glGetSemaphoreParameterui64vEXT = var5;
      var5 = var2230.get(1842);
      this.glWaitSemaphoreEXT = var5;
      var5 = var2230.get(1843);
      this.glSignalSemaphoreEXT = var5;
      var5 = var2230.get(1844);
      this.glImportSemaphoreFdEXT = var5;
      var5 = var2230.get(1845);
      this.glImportSemaphoreWin32HandleEXT = var5;
      var5 = var2230.get(1846);
      this.glImportSemaphoreWin32NameEXT = var5;
      var5 = var2230.get(1847);
      this.glUseShaderProgramEXT = var5;
      var5 = var2230.get(1848);
      this.glActiveProgramEXT = var5;
      var5 = var2230.get(1849);
      this.glCreateShaderProgramEXT = var5;
      var5 = var2230.get(1850);
      this.glFramebufferFetchBarrierEXT = var5;
      var5 = var2230.get(1851);
      this.glBindImageTextureEXT = var5;
      var5 = var2230.get(1852);
      this.glMemoryBarrierEXT = var5;
      var5 = var2230.get(1853);
      this.glStencilClearTagEXT = var5;
      var5 = var2230.get(1854);
      this.glActiveStencilFaceEXT = var5;
      var5 = var2230.get(1855);
      this.glTexBufferEXT = var5;
      var5 = var2230.get(1856);
      this.glClearColorIiEXT = var5;
      var5 = var2230.get(1857);
      this.glClearColorIuiEXT = var5;
      var5 = var2230.get(1858);
      this.glTexParameterIivEXT = var5;
      var5 = var2230.get(1859);
      this.glTexParameterIuivEXT = var5;
      var5 = var2230.get(1860);
      this.glGetTexParameterIivEXT = var5;
      var5 = var2230.get(1861);
      this.glGetTexParameterIuivEXT = var5;
      var5 = var2230.get(1862);
      this.glTexStorage1DEXT = var5;
      var5 = var2230.get(1863);
      this.glTexStorage2DEXT = var5;
      var5 = var2230.get(1864);
      this.glTexStorage3DEXT = var5;
      var5 = var2230.get(1865);
      this.glGetQueryObjecti64vEXT = var5;
      var5 = var2230.get(1866);
      this.glGetQueryObjectui64vEXT = var5;
      var5 = var2230.get(1867);
      this.glBindBufferRangeEXT = var5;
      var5 = var2230.get(1868);
      this.glBindBufferOffsetEXT = var5;
      var5 = var2230.get(1869);
      this.glBindBufferBaseEXT = var5;
      var5 = var2230.get(1870);
      this.glBeginTransformFeedbackEXT = var5;
      var5 = var2230.get(1871);
      this.glEndTransformFeedbackEXT = var5;
      var5 = var2230.get(1872);
      this.glTransformFeedbackVaryingsEXT = var5;
      var5 = var2230.get(1873);
      this.glGetTransformFeedbackVaryingEXT = var5;
      var5 = var2230.get(1874);
      this.glVertexAttribL1dEXT = var5;
      var5 = var2230.get(1875);
      this.glVertexAttribL2dEXT = var5;
      var5 = var2230.get(1876);
      this.glVertexAttribL3dEXT = var5;
      var5 = var2230.get(1877);
      this.glVertexAttribL4dEXT = var5;
      var5 = var2230.get(1878);
      this.glVertexAttribL1dvEXT = var5;
      var5 = var2230.get(1879);
      this.glVertexAttribL2dvEXT = var5;
      var5 = var2230.get(1880);
      this.glVertexAttribL3dvEXT = var5;
      var5 = var2230.get(1881);
      this.glVertexAttribL4dvEXT = var5;
      var5 = var2230.get(1882);
      this.glVertexAttribLPointerEXT = var5;
      var5 = var2230.get(1883);
      this.glGetVertexAttribLdvEXT = var5;
      var5 = var2230.get(1884);
      this.glAcquireKeyedMutexWin32EXT = var5;
      var5 = var2230.get(1885);
      this.glReleaseKeyedMutexWin32EXT = var5;
      var5 = var2230.get(1886);
      this.glWindowRectanglesEXT = var5;
      var5 = var2230.get(1887);
      this.glImportSyncEXT = var5;
      var5 = var2230.get(1888);
      this.glFrameTerminatorGREMEDY = var5;
      var5 = var2230.get(1889);
      this.glStringMarkerGREMEDY = var5;
      var5 = var2230.get(1890);
      this.glApplyFramebufferAttachmentCMAAINTEL = var5;
      var5 = var2230.get(1891);
      this.glSyncTextureINTEL = var5;
      var5 = var2230.get(1892);
      this.glUnmapTexture2DINTEL = var5;
      var5 = var2230.get(1893);
      this.glMapTexture2DINTEL = var5;
      var5 = var2230.get(1894);
      this.glBeginPerfQueryINTEL = var5;
      var5 = var2230.get(1895);
      this.glCreatePerfQueryINTEL = var5;
      var5 = var2230.get(1896);
      this.glDeletePerfQueryINTEL = var5;
      var5 = var2230.get(1897);
      this.glEndPerfQueryINTEL = var5;
      var5 = var2230.get(1898);
      this.glGetFirstPerfQueryIdINTEL = var5;
      var5 = var2230.get(1899);
      this.glGetNextPerfQueryIdINTEL = var5;
      var5 = var2230.get(1900);
      this.glGetPerfCounterInfoINTEL = var5;
      var5 = var2230.get(1901);
      this.glGetPerfQueryDataINTEL = var5;
      var5 = var2230.get(1902);
      this.glGetPerfQueryIdByNameINTEL = var5;
      var5 = var2230.get(1903);
      this.glGetPerfQueryInfoINTEL = var5;
      var5 = var2230.get(1904);
      this.glBlendBarrierKHR = var5;
      var5 = var2230.get(1905);
      this.glMaxShaderCompilerThreadsKHR = var5;
      var5 = var2230.get(1906);
      this.glFramebufferParameteriMESA = var5;
      var5 = var2230.get(1907);
      this.glGetFramebufferParameterivMESA = var5;
      var5 = var2230.get(1908);
      this.glAlphaToCoverageDitherControlNV = var5;
      var5 = var2230.get(1909);
      this.glMultiDrawArraysIndirectBindlessNV = var5;
      var5 = var2230.get(1910);
      this.glMultiDrawElementsIndirectBindlessNV = var5;
      var5 = var2230.get(1911);
      this.glMultiDrawArraysIndirectBindlessCountNV = var5;
      var5 = var2230.get(1912);
      this.glMultiDrawElementsIndirectBindlessCountNV = var5;
      var5 = var2230.get(1913);
      this.glGetTextureHandleNV = var5;
      var5 = var2230.get(1914);
      this.glGetTextureSamplerHandleNV = var5;
      var5 = var2230.get(1915);
      this.glMakeTextureHandleResidentNV = var5;
      var5 = var2230.get(1916);
      this.glMakeTextureHandleNonResidentNV = var5;
      var5 = var2230.get(1917);
      this.glGetImageHandleNV = var5;
      var5 = var2230.get(1918);
      this.glMakeImageHandleResidentNV = var5;
      var5 = var2230.get(1919);
      this.glMakeImageHandleNonResidentNV = var5;
      var5 = var2230.get(1920);
      this.glUniformHandleui64NV = var5;
      var5 = var2230.get(1921);
      this.glUniformHandleui64vNV = var5;
      var5 = var2230.get(1922);
      this.glProgramUniformHandleui64NV = var5;
      var5 = var2230.get(1923);
      this.glProgramUniformHandleui64vNV = var5;
      var5 = var2230.get(1924);
      this.glIsTextureHandleResidentNV = var5;
      var5 = var2230.get(1925);
      this.glIsImageHandleResidentNV = var5;
      var5 = var2230.get(1926);
      this.glBlendParameteriNV = var5;
      var5 = var2230.get(1927);
      this.glBlendBarrierNV = var5;
      var5 = var2230.get(1928);
      this.glViewportPositionWScaleNV = var5;
      var5 = var2230.get(1929);
      this.glCreateStatesNV = var5;
      var5 = var2230.get(1930);
      this.glDeleteStatesNV = var5;
      var5 = var2230.get(1931);
      this.glIsStateNV = var5;
      var5 = var2230.get(1932);
      this.glStateCaptureNV = var5;
      var5 = var2230.get(1933);
      this.glGetCommandHeaderNV = var5;
      var5 = var2230.get(1934);
      this.glGetStageIndexNV = var5;
      var5 = var2230.get(1935);
      this.glDrawCommandsNV = var5;
      var5 = var2230.get(1936);
      this.glDrawCommandsAddressNV = var5;
      var5 = var2230.get(1937);
      this.glDrawCommandsStatesNV = var5;
      var5 = var2230.get(1938);
      this.glDrawCommandsStatesAddressNV = var5;
      var5 = var2230.get(1939);
      this.glCreateCommandListsNV = var5;
      var5 = var2230.get(1940);
      this.glDeleteCommandListsNV = var5;
      var5 = var2230.get(1941);
      this.glIsCommandListNV = var5;
      var5 = var2230.get(1942);
      this.glListDrawCommandsStatesClientNV = var5;
      var5 = var2230.get(1943);
      this.glCommandListSegmentsNV = var5;
      var5 = var2230.get(1944);
      this.glCompileCommandListNV = var5;
      var5 = var2230.get(1945);
      this.glCallCommandListNV = var5;
      var5 = var2230.get(1946);
      this.glBeginConditionalRenderNV = var5;
      var5 = var2230.get(1947);
      this.glEndConditionalRenderNV = var5;
      var5 = var2230.get(1948);
      this.glSubpixelPrecisionBiasNV = var5;
      var5 = var2230.get(1949);
      this.glConservativeRasterParameterfNV = var5;
      var5 = var2230.get(1950);
      this.glConservativeRasterParameteriNV = var5;
      var5 = var2230.get(1951);
      this.glCopyImageSubDataNV = var5;
      var5 = var2230.get(1952);
      this.glDepthRangedNV = var5;
      var5 = var2230.get(1953);
      this.glClearDepthdNV = var5;
      var5 = var2230.get(1954);
      this.glDepthBoundsdNV = var5;
      var5 = var2230.get(1955);
      this.glDrawTextureNV = var5;
      var5 = var2230.get(1956);
      this.glDrawVkImageNV = var5;
      var5 = var2230.get(1957);
      this.glGetVkProcAddrNV = var5;
      var5 = var2230.get(1958);
      this.glWaitVkSemaphoreNV = var5;
      var5 = var2230.get(1959);
      this.glSignalVkSemaphoreNV = var5;
      var5 = var2230.get(1960);
      this.glSignalVkFenceNV = var5;
      var5 = var2230.get(1961);
      this.glGetMultisamplefvNV = var5;
      var5 = var2230.get(1962);
      this.glSampleMaskIndexedNV = var5;
      var5 = var2230.get(1963);
      this.glTexRenderbufferNV = var5;
      var5 = var2230.get(1964);
      this.glDeleteFencesNV = var5;
      var5 = var2230.get(1965);
      this.glGenFencesNV = var5;
      var5 = var2230.get(1966);
      this.glIsFenceNV = var5;
      var5 = var2230.get(1967);
      this.glTestFenceNV = var5;
      var5 = var2230.get(1968);
      this.glGetFenceivNV = var5;
      var5 = var2230.get(1969);
      this.glFinishFenceNV = var5;
      var5 = var2230.get(1970);
      this.glSetFenceNV = var5;
      var5 = var2230.get(1971);
      this.glFragmentCoverageColorNV = var5;
      var5 = var2230.get(1972);
      this.glCoverageModulationTableNV = var5;
      var5 = var2230.get(1973);
      this.glGetCoverageModulationTableNV = var5;
      var5 = var2230.get(1974);
      this.glCoverageModulationNV = var5;
      var5 = var2230.get(1975);
      this.glRenderbufferStorageMultisampleCoverageNV = var5;
      var5 = var2230.get(1976);
      this.glRenderGpuMaskNV = var5;
      var5 = var2230.get(1977);
      this.glMulticastBufferSubDataNV = var5;
      var5 = var2230.get(1978);
      this.glMulticastCopyBufferSubDataNV = var5;
      var5 = var2230.get(1979);
      this.glMulticastCopyImageSubDataNV = var5;
      var5 = var2230.get(1980);
      this.glMulticastBlitFramebufferNV = var5;
      var5 = var2230.get(1981);
      this.glMulticastFramebufferSampleLocationsfvNV = var5;
      var5 = var2230.get(1982);
      this.glMulticastBarrierNV = var5;
      var5 = var2230.get(1983);
      this.glMulticastWaitSyncNV = var5;
      var5 = var2230.get(1984);
      this.glMulticastGetQueryObjectivNV = var5;
      var5 = var2230.get(1985);
      this.glMulticastGetQueryObjectuivNV = var5;
      var5 = var2230.get(1986);
      this.glMulticastGetQueryObjecti64vNV = var5;
      var5 = var2230.get(1987);
      this.glMulticastGetQueryObjectui64vNV = var5;
      var5 = var2230.get(1988);
      this.glVertex2hNV = var5;
      var5 = var2230.get(1989);
      this.glVertex2hvNV = var5;
      var5 = var2230.get(1990);
      this.glVertex3hNV = var5;
      var5 = var2230.get(1991);
      this.glVertex3hvNV = var5;
      var5 = var2230.get(1992);
      this.glVertex4hNV = var5;
      var5 = var2230.get(1993);
      this.glVertex4hvNV = var5;
      var5 = var2230.get(1994);
      this.glNormal3hNV = var5;
      var5 = var2230.get(1995);
      this.glNormal3hvNV = var5;
      var5 = var2230.get(1996);
      this.glColor3hNV = var5;
      var5 = var2230.get(1997);
      this.glColor3hvNV = var5;
      var5 = var2230.get(1998);
      this.glColor4hNV = var5;
      var5 = var2230.get(1999);
      this.glColor4hvNV = var5;
      var5 = var2230.get(2000);
      this.glTexCoord1hNV = var5;
      var5 = var2230.get(2001);
      this.glTexCoord1hvNV = var5;
      var5 = var2230.get(2002);
      this.glTexCoord2hNV = var5;
      var5 = var2230.get(2003);
      this.glTexCoord2hvNV = var5;
      var5 = var2230.get(2004);
      this.glTexCoord3hNV = var5;
      var5 = var2230.get(2005);
      this.glTexCoord3hvNV = var5;
      var5 = var2230.get(2006);
      this.glTexCoord4hNV = var5;
      var5 = var2230.get(2007);
      this.glTexCoord4hvNV = var5;
      var5 = var2230.get(2008);
      this.glMultiTexCoord1hNV = var5;
      var5 = var2230.get(2009);
      this.glMultiTexCoord1hvNV = var5;
      var5 = var2230.get(2010);
      this.glMultiTexCoord2hNV = var5;
      var5 = var2230.get(2011);
      this.glMultiTexCoord2hvNV = var5;
      var5 = var2230.get(2012);
      this.glMultiTexCoord3hNV = var5;
      var5 = var2230.get(2013);
      this.glMultiTexCoord3hvNV = var5;
      var5 = var2230.get(2014);
      this.glMultiTexCoord4hNV = var5;
      var5 = var2230.get(2015);
      this.glMultiTexCoord4hvNV = var5;
      var5 = var2230.get(2016);
      this.glFogCoordhNV = var5;
      var5 = var2230.get(2017);
      this.glFogCoordhvNV = var5;
      var5 = var2230.get(2018);
      this.glSecondaryColor3hNV = var5;
      var5 = var2230.get(2019);
      this.glSecondaryColor3hvNV = var5;
      var5 = var2230.get(2020);
      this.glVertexWeighthNV = var5;
      var5 = var2230.get(2021);
      this.glVertexWeighthvNV = var5;
      var5 = var2230.get(2022);
      this.glVertexAttrib1hNV = var5;
      var5 = var2230.get(2023);
      this.glVertexAttrib1hvNV = var5;
      var5 = var2230.get(2024);
      this.glVertexAttrib2hNV = var5;
      var5 = var2230.get(2025);
      this.glVertexAttrib2hvNV = var5;
      var5 = var2230.get(2026);
      this.glVertexAttrib3hNV = var5;
      var5 = var2230.get(2027);
      this.glVertexAttrib3hvNV = var5;
      var5 = var2230.get(2028);
      this.glVertexAttrib4hNV = var5;
      var5 = var2230.get(2029);
      this.glVertexAttrib4hvNV = var5;
      var5 = var2230.get(2030);
      this.glVertexAttribs1hvNV = var5;
      var5 = var2230.get(2031);
      this.glVertexAttribs2hvNV = var5;
      var5 = var2230.get(2032);
      this.glVertexAttribs3hvNV = var5;
      var5 = var2230.get(2033);
      this.glVertexAttribs4hvNV = var5;
      var5 = var2230.get(2034);
      this.glGetInternalformatSampleivNV = var5;
      var5 = var2230.get(2035);
      this.glGetMemoryObjectDetachedResourcesuivNV = var5;
      var5 = var2230.get(2036);
      this.glResetMemoryObjectParameterNV = var5;
      var5 = var2230.get(2037);
      this.glTexAttachMemoryNV = var5;
      var5 = var2230.get(2038);
      this.glBufferAttachMemoryNV = var5;
      var5 = var2230.get(2039);
      this.glTextureAttachMemoryNV = var5;
      var5 = var2230.get(2040);
      this.glNamedBufferAttachMemoryNV = var5;
      var5 = var2230.get(2041);
      this.glBufferPageCommitmentMemNV = var5;
      var5 = var2230.get(2042);
      this.glNamedBufferPageCommitmentMemNV = var5;
      var5 = var2230.get(2043);
      this.glTexPageCommitmentMemNV = var5;
      var5 = var2230.get(2044);
      this.glTexturePageCommitmentMemNV = var5;
      var5 = var2230.get(2045);
      this.glDrawMeshTasksNV = var5;
      var5 = var2230.get(2046);
      this.glDrawMeshTasksIndirectNV = var5;
      var5 = var2230.get(2047);
      this.glMultiDrawMeshTasksIndirectNV = var5;
      var5 = var2230.get(2048);
      this.glMultiDrawMeshTasksIndirectCountNV = var5;
      var5 = var2230.get(2049);
      this.glPathCommandsNV = var5;
      var5 = var2230.get(2050);
      this.glPathCoordsNV = var5;
      var5 = var2230.get(2051);
      this.glPathSubCommandsNV = var5;
      var5 = var2230.get(2052);
      this.glPathSubCoordsNV = var5;
      var5 = var2230.get(2053);
      this.glPathStringNV = var5;
      var5 = var2230.get(2054);
      this.glPathGlyphsNV = var5;
      var5 = var2230.get(2055);
      this.glPathGlyphRangeNV = var5;
      var5 = var2230.get(2056);
      this.glPathGlyphIndexArrayNV = var5;
      var5 = var2230.get(2057);
      this.glPathMemoryGlyphIndexArrayNV = var5;
      var5 = var2230.get(2058);
      this.glCopyPathNV = var5;
      var5 = var2230.get(2059);
      this.glWeightPathsNV = var5;
      var5 = var2230.get(2060);
      this.glInterpolatePathsNV = var5;
      var5 = var2230.get(2061);
      this.glTransformPathNV = var5;
      var5 = var2230.get(2062);
      this.glPathParameterivNV = var5;
      var5 = var2230.get(2063);
      this.glPathParameteriNV = var5;
      var5 = var2230.get(2064);
      this.glPathParameterfvNV = var5;
      var5 = var2230.get(2065);
      this.glPathParameterfNV = var5;
      var5 = var2230.get(2066);
      this.glPathDashArrayNV = var5;
      var5 = var2230.get(2067);
      this.glGenPathsNV = var5;
      var5 = var2230.get(2068);
      this.glDeletePathsNV = var5;
      var5 = var2230.get(2069);
      this.glIsPathNV = var5;
      var5 = var2230.get(2070);
      this.glPathStencilFuncNV = var5;
      var5 = var2230.get(2071);
      this.glPathStencilDepthOffsetNV = var5;
      var5 = var2230.get(2072);
      this.glStencilFillPathNV = var5;
      var5 = var2230.get(2073);
      this.glStencilStrokePathNV = var5;
      var5 = var2230.get(2074);
      this.glStencilFillPathInstancedNV = var5;
      var5 = var2230.get(2075);
      this.glStencilStrokePathInstancedNV = var5;
      var5 = var2230.get(2076);
      this.glPathCoverDepthFuncNV = var5;
      var5 = var2230.get(2077);
      this.glPathColorGenNV = var5;
      var5 = var2230.get(2078);
      this.glPathTexGenNV = var5;
      var5 = var2230.get(2079);
      this.glPathFogGenNV = var5;
      var5 = var2230.get(2080);
      this.glCoverFillPathNV = var5;
      var5 = var2230.get(2081);
      this.glCoverStrokePathNV = var5;
      var5 = var2230.get(2082);
      this.glCoverFillPathInstancedNV = var5;
      var5 = var2230.get(2083);
      this.glCoverStrokePathInstancedNV = var5;
      var5 = var2230.get(2084);
      this.glStencilThenCoverFillPathNV = var5;
      var5 = var2230.get(2085);
      this.glStencilThenCoverStrokePathNV = var5;
      var5 = var2230.get(2086);
      this.glStencilThenCoverFillPathInstancedNV = var5;
      var5 = var2230.get(2087);
      this.glStencilThenCoverStrokePathInstancedNV = var5;
      var5 = var2230.get(2088);
      this.glPathGlyphIndexRangeNV = var5;
      var5 = var2230.get(2089);
      this.glProgramPathFragmentInputGenNV = var5;
      var5 = var2230.get(2090);
      this.glGetPathParameterivNV = var5;
      var5 = var2230.get(2091);
      this.glGetPathParameterfvNV = var5;
      var5 = var2230.get(2092);
      this.glGetPathCommandsNV = var5;
      var5 = var2230.get(2093);
      this.glGetPathCoordsNV = var5;
      var5 = var2230.get(2094);
      this.glGetPathDashArrayNV = var5;
      var5 = var2230.get(2095);
      this.glGetPathMetricsNV = var5;
      var5 = var2230.get(2096);
      this.glGetPathMetricRangeNV = var5;
      var5 = var2230.get(2097);
      this.glGetPathSpacingNV = var5;
      var5 = var2230.get(2098);
      this.glGetPathColorGenivNV = var5;
      var5 = var2230.get(2099);
      this.glGetPathColorGenfvNV = var5;
      var5 = var2230.get(2100);
      this.glGetPathTexGenivNV = var5;
      var5 = var2230.get(2101);
      this.glGetPathTexGenfvNV = var5;
      var5 = var2230.get(2102);
      this.glIsPointInFillPathNV = var5;
      var5 = var2230.get(2103);
      this.glIsPointInStrokePathNV = var5;
      var5 = var2230.get(2104);
      this.glGetPathLengthNV = var5;
      var5 = var2230.get(2105);
      this.glPointAlongPathNV = var5;
      var5 = var2230.get(2106);
      this.glMatrixLoad3x2fNV = var5;
      var5 = var2230.get(2107);
      this.glMatrixLoad3x3fNV = var5;
      var5 = var2230.get(2108);
      this.glMatrixLoadTranspose3x3fNV = var5;
      var5 = var2230.get(2109);
      this.glMatrixMult3x2fNV = var5;
      var5 = var2230.get(2110);
      this.glMatrixMult3x3fNV = var5;
      var5 = var2230.get(2111);
      this.glMatrixMultTranspose3x3fNV = var5;
      var5 = var2230.get(2112);
      this.glGetProgramResourcefvNV = var5;
      var5 = var2230.get(2113);
      this.glPixelDataRangeNV = var5;
      var5 = var2230.get(2114);
      this.glFlushPixelDataRangeNV = var5;
      var5 = var2230.get(2115);
      this.glPointParameteriNV = var5;
      var5 = var2230.get(2116);
      this.glPointParameterivNV = var5;
      var5 = var2230.get(2117);
      this.glPrimitiveRestartNV = var5;
      var5 = var2230.get(2118);
      this.glPrimitiveRestartIndexNV = var5;
      var5 = var2230.get(2119);
      this.glQueryResourceNV = var5;
      var5 = var2230.get(2120);
      this.glGenQueryResourceTagNV = var5;
      var5 = var2230.get(2121);
      this.glDeleteQueryResourceTagNV = var5;
      var5 = var2230.get(2122);
      this.glQueryResourceTagNV = var5;
      var5 = var2230.get(2123);
      this.glFramebufferSampleLocationsfvNV = var5;
      var5 = var2230.get(2124);
      this.glNamedFramebufferSampleLocationsfvNV = var5;
      var5 = var2230.get(2125);
      this.glResolveDepthValuesNV = var5;
      var5 = var2230.get(2126);
      this.glScissorExclusiveArrayvNV = var5;
      var5 = var2230.get(2127);
      this.glScissorExclusiveNV = var5;
      var5 = var2230.get(2128);
      this.glMakeBufferResidentNV = var5;
      var5 = var2230.get(2129);
      this.glMakeBufferNonResidentNV = var5;
      var5 = var2230.get(2130);
      this.glIsBufferResidentNV = var5;
      var5 = var2230.get(2131);
      this.glMakeNamedBufferResidentNV = var5;
      var5 = var2230.get(2132);
      this.glMakeNamedBufferNonResidentNV = var5;
      var5 = var2230.get(2133);
      this.glIsNamedBufferResidentNV = var5;
      var5 = var2230.get(2134);
      this.glGetBufferParameterui64vNV = var5;
      var5 = var2230.get(2135);
      this.glGetNamedBufferParameterui64vNV = var5;
      var5 = var2230.get(2136);
      this.glGetIntegerui64vNV = var5;
      var5 = var2230.get(2137);
      this.glUniformui64NV = var5;
      var5 = var2230.get(2138);
      this.glUniformui64vNV = var5;
      var5 = var2230.get(2139);
      this.glProgramUniformui64NV = var5;
      var5 = var2230.get(2140);
      this.glProgramUniformui64vNV = var5;
      var5 = var2230.get(2141);
      this.glBindShadingRateImageNV = var5;
      var5 = var2230.get(2142);
      this.glShadingRateImagePaletteNV = var5;
      var5 = var2230.get(2143);
      this.glGetShadingRateImagePaletteNV = var5;
      var5 = var2230.get(2144);
      this.glShadingRateImageBarrierNV = var5;
      var5 = var2230.get(2145);
      this.glShadingRateSampleOrderNV = var5;
      var5 = var2230.get(2146);
      this.glShadingRateSampleOrderCustomNV = var5;
      var5 = var2230.get(2147);
      this.glGetShadingRateSampleLocationivNV = var5;
      var5 = var2230.get(2148);
      this.glTextureBarrierNV = var5;
      var5 = var2230.get(2149);
      this.glTexImage2DMultisampleCoverageNV = var5;
      var5 = var2230.get(2150);
      this.glTexImage3DMultisampleCoverageNV = var5;
      var5 = var2230.get(2151);
      this.glTextureImage2DMultisampleNV = var5;
      var5 = var2230.get(2152);
      this.glTextureImage3DMultisampleNV = var5;
      var5 = var2230.get(2153);
      this.glTextureImage2DMultisampleCoverageNV = var5;
      var5 = var2230.get(2154);
      this.glTextureImage3DMultisampleCoverageNV = var5;
      var5 = var2230.get(2155);
      this.glCreateSemaphoresNV = var5;
      var5 = var2230.get(2156);
      this.glSemaphoreParameterivNV = var5;
      var5 = var2230.get(2157);
      this.glGetSemaphoreParameterivNV = var5;
      var5 = var2230.get(2158);
      this.glBeginTransformFeedbackNV = var5;
      var5 = var2230.get(2159);
      this.glEndTransformFeedbackNV = var5;
      var5 = var2230.get(2160);
      this.glTransformFeedbackAttribsNV = var5;
      var5 = var2230.get(2161);
      this.glBindBufferRangeNV = var5;
      var5 = var2230.get(2162);
      this.glBindBufferOffsetNV = var5;
      var5 = var2230.get(2163);
      this.glBindBufferBaseNV = var5;
      var5 = var2230.get(2164);
      this.glTransformFeedbackVaryingsNV = var5;
      var5 = var2230.get(2165);
      this.glActiveVaryingNV = var5;
      var5 = var2230.get(2166);
      this.glGetVaryingLocationNV = var5;
      var5 = var2230.get(2167);
      this.glGetActiveVaryingNV = var5;
      var5 = var2230.get(2168);
      this.glGetTransformFeedbackVaryingNV = var5;
      var5 = var2230.get(2169);
      this.glTransformFeedbackStreamAttribsNV = var5;
      var5 = var2230.get(2170);
      this.glBindTransformFeedbackNV = var5;
      var5 = var2230.get(2171);
      this.glDeleteTransformFeedbacksNV = var5;
      var5 = var2230.get(2172);
      this.glGenTransformFeedbacksNV = var5;
      var5 = var2230.get(2173);
      this.glIsTransformFeedbackNV = var5;
      var5 = var2230.get(2174);
      this.glPauseTransformFeedbackNV = var5;
      var5 = var2230.get(2175);
      this.glResumeTransformFeedbackNV = var5;
      var5 = var2230.get(2176);
      this.glDrawTransformFeedbackNV = var5;
      var5 = var2230.get(2177);
      this.glVertexArrayRangeNV = var5;
      var5 = var2230.get(2178);
      this.glFlushVertexArrayRangeNV = var5;
      var5 = var2230.get(2179);
      this.glVertexAttribL1i64NV = var5;
      var5 = var2230.get(2180);
      this.glVertexAttribL2i64NV = var5;
      var5 = var2230.get(2181);
      this.glVertexAttribL3i64NV = var5;
      var5 = var2230.get(2182);
      this.glVertexAttribL4i64NV = var5;
      var5 = var2230.get(2183);
      this.glVertexAttribL1i64vNV = var5;
      var5 = var2230.get(2184);
      this.glVertexAttribL2i64vNV = var5;
      var5 = var2230.get(2185);
      this.glVertexAttribL3i64vNV = var5;
      var5 = var2230.get(2186);
      this.glVertexAttribL4i64vNV = var5;
      var5 = var2230.get(2187);
      this.glVertexAttribL1ui64NV = var5;
      var5 = var2230.get(2188);
      this.glVertexAttribL2ui64NV = var5;
      var5 = var2230.get(2189);
      this.glVertexAttribL3ui64NV = var5;
      var5 = var2230.get(2190);
      this.glVertexAttribL4ui64NV = var5;
      var5 = var2230.get(2191);
      this.glVertexAttribL1ui64vNV = var5;
      var5 = var2230.get(2192);
      this.glVertexAttribL2ui64vNV = var5;
      var5 = var2230.get(2193);
      this.glVertexAttribL3ui64vNV = var5;
      var5 = var2230.get(2194);
      this.glVertexAttribL4ui64vNV = var5;
      var5 = var2230.get(2195);
      this.glGetVertexAttribLi64vNV = var5;
      var5 = var2230.get(2196);
      this.glGetVertexAttribLui64vNV = var5;
      var5 = var2230.get(2197);
      this.glVertexAttribLFormatNV = var5;
      var5 = var2230.get(2198);
      this.glBufferAddressRangeNV = var5;
      var5 = var2230.get(2199);
      this.glVertexFormatNV = var5;
      var5 = var2230.get(2200);
      this.glNormalFormatNV = var5;
      var5 = var2230.get(2201);
      this.glColorFormatNV = var5;
      var5 = var2230.get(2202);
      this.glIndexFormatNV = var5;
      var5 = var2230.get(2203);
      this.glTexCoordFormatNV = var5;
      var5 = var2230.get(2204);
      this.glEdgeFlagFormatNV = var5;
      var5 = var2230.get(2205);
      this.glSecondaryColorFormatNV = var5;
      var5 = var2230.get(2206);
      this.glFogCoordFormatNV = var5;
      var5 = var2230.get(2207);
      this.glVertexAttribFormatNV = var5;
      var5 = var2230.get(2208);
      this.glVertexAttribIFormatNV = var5;
      var5 = var2230.get(2209);
      this.glGetIntegerui64i_vNV = var5;
      var5 = var2230.get(2210);
      this.glViewportSwizzleNV = var5;
      var5 = var2230.get(2211);
      this.glBeginConditionalRenderNVX = var5;
      var5 = var2230.get(2212);
      this.glEndConditionalRenderNVX = var5;
      var5 = var2230.get(2213);
      this.glAsyncCopyImageSubDataNVX = var5;
      var5 = var2230.get(2214);
      this.glAsyncCopyBufferSubDataNVX = var5;
      var5 = var2230.get(2215);
      this.glUploadGpuMaskNVX = var5;
      var5 = var2230.get(2216);
      this.glMulticastViewportArrayvNVX = var5;
      var5 = var2230.get(2217);
      this.glMulticastScissorArrayvNVX = var5;
      var5 = var2230.get(2218);
      this.glMulticastViewportPositionWScaleNVX = var5;
      var5 = var2230.get(2219);
      this.glCreateProgressFenceNVX = var5;
      var5 = var2230.get(2220);
      this.glSignalSemaphoreui64NVX = var5;
      var5 = var2230.get(2221);
      this.glWaitSemaphoreui64NVX = var5;
      var5 = var2230.get(2222);
      this.glClientWaitSemaphoreui64NVX = var5;
      var5 = var2230.get(2223);
      this.glFramebufferTextureMultiviewOVR = var5;
      var5 = var2230.get(2224);
      this.glNamedFramebufferTextureMultiviewOVR = var5;
      this.addresses = ThreadLocalUtil.setupAddressBuffer(var2230);
   }

   public static void initialize() {
   }

   private static boolean check_GL11(FunctionProvider var0, PointerBuffer var1, Set var2, boolean var3) {
      if (!var2.contains("OpenGL11")) {
         return false;
      } else {
         int var9;
         if (var3 && !var2.contains("GL_NV_vertex_buffer_unified_memory")) {
            var9 = Integer.MIN_VALUE;
         } else {
            var9 = 0;
         }

         boolean var11;
         label28: {
            label27: {
               if (!var3) {
                  int[] var10;
                  (var10 = new int[272])[0] = 2;
                  var10[1] = 3;
                  var10[2] = 4;
                  var10[3] = 5;
                  var10[4] = 6;
                  var10[5] = 8;
                  var10[6] = 10;
                  var10[7] = 11;
                  var10[8] = 13;
                  var10[9] = 16;
                  var10[10] = 18;
                  var10[11] = 19;
                  var10[12] = 20;
                  var10[13] = 21;
                  var10[14] = 22;
                  var10[15] = 23;
                  var10[16] = 24;
                  var10[17] = 25;
                  var10[18] = 26;
                  var10[19] = 27;
                  var10[20] = 28;
                  var10[21] = 29;
                  var10[22] = 30;
                  var10[23] = 31;
                  var10[24] = 32;
                  var10[25] = 33;
                  var10[26] = 34;
                  var10[27] = 35;
                  var10[28] = 36;
                  var10[29] = 37;
                  var10[30] = 38;
                  var10[31] = 39;
                  var10[32] = 40;
                  var10[33] = 41;
                  var10[34] = 42;
                  var10[35] = 43;
                  var10[36] = 44;
                  var10[37] = 45;
                  var10[38] = 46;
                  var10[39] = 47;
                  var10[40] = 48;
                  var10[41] = 49;
                  var10[42] = 50;
                  var10[43] = 52;
                  var10[44] = 53;
                  var10[45] = 54;
                  var10[46] = 56;
                  var10[47] = 64;
                  var10[48] = 65;
                  var10[49] = 66;
                  var10[50] = 67;
                  var10[51] = 69;
                  var10[52] = 70;
                  var10[53] = 71;
                  var10[54] = 72;
                  var10[55] = 73;
                  var10[56] = 74;
                  var10[57] = 75;
                  var10[58] = 76;
                  var10[59] = 77;
                  var10[60] = 78;
                  var10[61] = 79;
                  var10[62] = 80;
                  var10[63] = 81;
                  var10[64] = 82;
                  var10[65] = 85;
                  var10[66] = 86;
                  var10[67] = 87;
                  var10[68] = 88;
                  var10[69] = 90;
                  var10[70] = 93;
                  var10[71] = 99;
                  var10[72] = 100;
                  var10[73] = 101;
                  var10[74] = 102;
                  var10[75] = 103;
                  var10[76] = 104;
                  var10[77] = 105;
                  var10[78] = 106;
                  var10[79] = 107;
                  var10[80] = 108;
                  var10[81] = 110;
                  var10[82] = 112;
                  var10[83] = 113;
                  var10[84] = 114;
                  var10[85] = 115;
                  var10[86] = 116;
                  var10[87] = 123;
                  var10[88] = 124;
                  var10[89] = 125;
                  var10[90] = 126;
                  var10[91] = 127;
                  var10[92] = 128;
                  var10[93] = 129;
                  var10[94] = 130;
                  var10[95] = 131;
                  var10[96] = 132;
                  var10[97] = 133;
                  var10[98] = 134;
                  var10[99] = 135;
                  var10[100] = 136;
                  var10[101] = 138;
                  var10[102] = 140;
                  var10[103] = 141;
                  var10[104] = 142;
                  var10[105] = 143;
                  var10[106] = 144;
                  var10[107] = 145;
                  var10[108] = 146;
                  var10[109] = 147;
                  var10[110] = 148;
                  var10[111] = 150;
                  var10[112] = 151;
                  var10[113] = 152;
                  var10[114] = 153;
                  var10[115] = 154;
                  var10[116] = 156;
                  var10[117] = 157;
                  var10[118] = 158;
                  var10[119] = 159;
                  var10[120] = 160;
                  var10[121] = 161;
                  var10[122] = 162;
                  var10[123] = 163;
                  var10[124] = 164;
                  var10[125] = 165;
                  var10[126] = 166;
                  var10[127] = 167;
                  var10[128] = 168;
                  var10[129] = 169;
                  var10[130] = 170;
                  var10[131] = 171;
                  var10[132] = 172;
                  var10[133] = 173;
                  var10[134] = 174;
                  var10[135] = 175;
                  var10[136] = 176;
                  var10[137] = 177;
                  var10[138] = 178;
                  var10[139] = 179;
                  var10[140] = 180;
                  var10[141] = 181;
                  var10[142] = 182;
                  var10[143] = 183;
                  var10[144] = 184;
                  var10[145] = 185;
                  var10[146] = 186;
                  var10[147] = 187;
                  var10[148] = 188;
                  var10[149] = 189;
                  var10[150] = 192;
                  var10[151] = 193;
                  var10[152] = 194;
                  var10[153] = 198;
                  var10[154] = 199;
                  var10[155] = 200;
                  var10[156] = 201;
                  var10[157] = 202;
                  var10[158] = 203;
                  var10[159] = 204;
                  var10[160] = 205;
                  var10[161] = 206;
                  var10[162] = 207;
                  var10[163] = 208;
                  var10[164] = 209;
                  var10[165] = 210;
                  var10[166] = 211;
                  var10[167] = 212;
                  var10[168] = 213;
                  var10[169] = 214;
                  var10[170] = 215;
                  var10[171] = 216;
                  var10[172] = 217;
                  var10[173] = 218;
                  var10[174] = 219;
                  var10[175] = 220;
                  var10[176] = 221;
                  var10[177] = 222;
                  var10[178] = 223;
                  var10[179] = 224;
                  var10[180] = 225;
                  var10[181] = 226;
                  var10[182] = 227;
                  var10[183] = 228;
                  var10[184] = 229;
                  var10[185] = 230;
                  var10[186] = 231;
                  var10[187] = 234;
                  var10[188] = 235;
                  var10[189] = 236;
                  var10[190] = 237;
                  var10[191] = 238;
                  var10[192] = 239;
                  var10[193] = 240;
                  var10[194] = 241;
                  var10[195] = 242;
                  var10[196] = 243;
                  var10[197] = 244;
                  var10[198] = 245;
                  var10[199] = 246;
                  var10[200] = 248;
                  var10[201] = 249;
                  var10[202] = 253;
                  var10[203] = 254;
                  var10[204] = 255;
                  var10[205] = 256;
                  var10[206] = 257;
                  var10[207] = 258;
                  var10[208] = 259;
                  var10[209] = 260;
                  var10[210] = 261;
                  var10[211] = 262;
                  var10[212] = 263;
                  var10[213] = 264;
                  var10[214] = 265;
                  var10[215] = 266;
                  var10[216] = 267;
                  var10[217] = 268;
                  var10[218] = 269;
                  var10[219] = 270;
                  var10[220] = 271;
                  var10[221] = 272;
                  var10[222] = 273;
                  var10[223] = 274;
                  var10[224] = 275;
                  var10[225] = 276;
                  var10[226] = 277;
                  var10[227] = 278;
                  var10[228] = 279;
                  var10[229] = 280;
                  var10[230] = 281;
                  var10[231] = 282;
                  var10[232] = 283;
                  var10[233] = 284;
                  var10[234] = 285;
                  var10[235] = 286;
                  var10[236] = 287;
                  var10[237] = 288;
                  var10[238] = 289;
                  var10[239] = 290;
                  var10[240] = 291;
                  var10[241] = 292;
                  var10[242] = 293;
                  var10[243] = 294;
                  var10[244] = 295;
                  var10[245] = 308;
                  var10[246] = 309;
                  var10[247] = 310;
                  var10[248] = 311;
                  var10[249] = 312;
                  var10[250] = 313;
                  var10[251] = 314;
                  var10[252] = 315;
                  var10[253] = 316;
                  var10[254] = 317;
                  var10[255] = 318;
                  var10[256] = 319;
                  var10[257] = 320;
                  var10[258] = 321;
                  var10[259] = 322;
                  var10[260] = 323;
                  var10[261] = 324;
                  var10[262] = 325;
                  var10[263] = 326;
                  var10[264] = 327;
                  var10[265] = 328;
                  var10[266] = 329;
                  var10[267] = 330;
                  var10[268] = 331;
                  var10[269] = 332;
                  var10[270] = 333;
                  var10[271] = 334;
                  String[] var4;
                  (var4 = new String[272])[0] = "glAccum";
                  var4[1] = "glAlphaFunc";
                  var4[2] = "glAreTexturesResident";
                  var4[3] = "glArrayElement";
                  var4[4] = "glBegin";
                  var4[5] = "glBitmap";
                  var4[6] = "glCallList";
                  var4[7] = "glCallLists";
                  var4[8] = "glClearAccum";
                  var4[9] = "glClearIndex";
                  var4[10] = "glClipPlane";
                  var4[11] = "glColor3b";
                  var4[12] = "glColor3s";
                  var4[13] = "glColor3i";
                  var4[14] = "glColor3f";
                  var4[15] = "glColor3d";
                  var4[16] = "glColor3ub";
                  var4[17] = "glColor3us";
                  var4[18] = "glColor3ui";
                  var4[19] = "glColor3bv";
                  var4[20] = "glColor3sv";
                  var4[21] = "glColor3iv";
                  var4[22] = "glColor3fv";
                  var4[23] = "glColor3dv";
                  var4[24] = "glColor3ubv";
                  var4[25] = "glColor3usv";
                  var4[26] = "glColor3uiv";
                  var4[27] = "glColor4b";
                  var4[28] = "glColor4s";
                  var4[29] = "glColor4i";
                  var4[30] = "glColor4f";
                  var4[31] = "glColor4d";
                  var4[32] = "glColor4ub";
                  var4[33] = "glColor4us";
                  var4[34] = "glColor4ui";
                  var4[35] = "glColor4bv";
                  var4[36] = "glColor4sv";
                  var4[37] = "glColor4iv";
                  var4[38] = "glColor4fv";
                  var4[39] = "glColor4dv";
                  var4[40] = "glColor4ubv";
                  var4[41] = "glColor4usv";
                  var4[42] = "glColor4uiv";
                  var4[43] = "glColorMaterial";
                  var4[44] = "glColorPointer";
                  var4[45] = "glCopyPixels";
                  var4[46] = "glDeleteLists";
                  var4[47] = "glDrawPixels";
                  var4[48] = "glEdgeFlag";
                  var4[49] = "glEdgeFlagv";
                  var4[50] = "glEdgeFlagPointer";
                  var4[51] = "glEnd";
                  var4[52] = "glEvalCoord1f";
                  var4[53] = "glEvalCoord1fv";
                  var4[54] = "glEvalCoord1d";
                  var4[55] = "glEvalCoord1dv";
                  var4[56] = "glEvalCoord2f";
                  var4[57] = "glEvalCoord2fv";
                  var4[58] = "glEvalCoord2d";
                  var4[59] = "glEvalCoord2dv";
                  var4[60] = "glEvalMesh1";
                  var4[61] = "glEvalMesh2";
                  var4[62] = "glEvalPoint1";
                  var4[63] = "glEvalPoint2";
                  var4[64] = "glFeedbackBuffer";
                  var4[65] = "glFogi";
                  var4[66] = "glFogiv";
                  var4[67] = "glFogf";
                  var4[68] = "glFogfv";
                  var4[69] = "glGenLists";
                  var4[70] = "glGetClipPlane";
                  var4[71] = "glGetLightiv";
                  var4[72] = "glGetLightfv";
                  var4[73] = "glGetMapiv";
                  var4[74] = "glGetMapfv";
                  var4[75] = "glGetMapdv";
                  var4[76] = "glGetMaterialiv";
                  var4[77] = "glGetMaterialfv";
                  var4[78] = "glGetPixelMapfv";
                  var4[79] = "glGetPixelMapusv";
                  var4[80] = "glGetPixelMapuiv";
                  var4[81] = "glGetPolygonStipple";
                  var4[82] = "glGetTexEnviv";
                  var4[83] = "glGetTexEnvfv";
                  var4[84] = "glGetTexGeniv";
                  var4[85] = "glGetTexGenfv";
                  var4[86] = "glGetTexGendv";
                  var4[87] = "glIndexi";
                  var4[88] = "glIndexub";
                  var4[89] = "glIndexs";
                  var4[90] = "glIndexf";
                  var4[91] = "glIndexd";
                  var4[92] = "glIndexiv";
                  var4[93] = "glIndexubv";
                  var4[94] = "glIndexsv";
                  var4[95] = "glIndexfv";
                  var4[96] = "glIndexdv";
                  var4[97] = "glIndexMask";
                  var4[98] = "glIndexPointer";
                  var4[99] = "glInitNames";
                  var4[100] = "glInterleavedArrays";
                  var4[101] = "glIsList";
                  var4[102] = "glLightModeli";
                  var4[103] = "glLightModelf";
                  var4[104] = "glLightModeliv";
                  var4[105] = "glLightModelfv";
                  var4[106] = "glLighti";
                  var4[107] = "glLightf";
                  var4[108] = "glLightiv";
                  var4[109] = "glLightfv";
                  var4[110] = "glLineStipple";
                  var4[111] = "glListBase";
                  var4[112] = "glLoadMatrixf";
                  var4[113] = "glLoadMatrixd";
                  var4[114] = "glLoadIdentity";
                  var4[115] = "glLoadName";
                  var4[116] = "glMap1f";
                  var4[117] = "glMap1d";
                  var4[118] = "glMap2f";
                  var4[119] = "glMap2d";
                  var4[120] = "glMapGrid1f";
                  var4[121] = "glMapGrid1d";
                  var4[122] = "glMapGrid2f";
                  var4[123] = "glMapGrid2d";
                  var4[124] = "glMateriali";
                  var4[125] = "glMaterialf";
                  var4[126] = "glMaterialiv";
                  var4[127] = "glMaterialfv";
                  var4[128] = "glMatrixMode";
                  var4[129] = "glMultMatrixf";
                  var4[130] = "glMultMatrixd";
                  var4[131] = "glFrustum";
                  var4[132] = "glNewList";
                  var4[133] = "glEndList";
                  var4[134] = "glNormal3f";
                  var4[135] = "glNormal3b";
                  var4[136] = "glNormal3s";
                  var4[137] = "glNormal3i";
                  var4[138] = "glNormal3d";
                  var4[139] = "glNormal3fv";
                  var4[140] = "glNormal3bv";
                  var4[141] = "glNormal3sv";
                  var4[142] = "glNormal3iv";
                  var4[143] = "glNormal3dv";
                  var4[144] = "glNormalPointer";
                  var4[145] = "glOrtho";
                  var4[146] = "glPassThrough";
                  var4[147] = "glPixelMapfv";
                  var4[148] = "glPixelMapusv";
                  var4[149] = "glPixelMapuiv";
                  var4[150] = "glPixelTransferi";
                  var4[151] = "glPixelTransferf";
                  var4[152] = "glPixelZoom";
                  var4[153] = "glPolygonStipple";
                  var4[154] = "glPushAttrib";
                  var4[155] = "glPushClientAttrib";
                  var4[156] = "glPopAttrib";
                  var4[157] = "glPopClientAttrib";
                  var4[158] = "glPopMatrix";
                  var4[159] = "glPopName";
                  var4[160] = "glPrioritizeTextures";
                  var4[161] = "glPushMatrix";
                  var4[162] = "glPushName";
                  var4[163] = "glRasterPos2i";
                  var4[164] = "glRasterPos2s";
                  var4[165] = "glRasterPos2f";
                  var4[166] = "glRasterPos2d";
                  var4[167] = "glRasterPos2iv";
                  var4[168] = "glRasterPos2sv";
                  var4[169] = "glRasterPos2fv";
                  var4[170] = "glRasterPos2dv";
                  var4[171] = "glRasterPos3i";
                  var4[172] = "glRasterPos3s";
                  var4[173] = "glRasterPos3f";
                  var4[174] = "glRasterPos3d";
                  var4[175] = "glRasterPos3iv";
                  var4[176] = "glRasterPos3sv";
                  var4[177] = "glRasterPos3fv";
                  var4[178] = "glRasterPos3dv";
                  var4[179] = "glRasterPos4i";
                  var4[180] = "glRasterPos4s";
                  var4[181] = "glRasterPos4f";
                  var4[182] = "glRasterPos4d";
                  var4[183] = "glRasterPos4iv";
                  var4[184] = "glRasterPos4sv";
                  var4[185] = "glRasterPos4fv";
                  var4[186] = "glRasterPos4dv";
                  var4[187] = "glRecti";
                  var4[188] = "glRects";
                  var4[189] = "glRectf";
                  var4[190] = "glRectd";
                  var4[191] = "glRectiv";
                  var4[192] = "glRectsv";
                  var4[193] = "glRectfv";
                  var4[194] = "glRectdv";
                  var4[195] = "glRenderMode";
                  var4[196] = "glRotatef";
                  var4[197] = "glRotated";
                  var4[198] = "glScalef";
                  var4[199] = "glScaled";
                  var4[200] = "glSelectBuffer";
                  var4[201] = "glShadeModel";
                  var4[202] = "glTexCoord1f";
                  var4[203] = "glTexCoord1s";
                  var4[204] = "glTexCoord1i";
                  var4[205] = "glTexCoord1d";
                  var4[206] = "glTexCoord1fv";
                  var4[207] = "glTexCoord1sv";
                  var4[208] = "glTexCoord1iv";
                  var4[209] = "glTexCoord1dv";
                  var4[210] = "glTexCoord2f";
                  var4[211] = "glTexCoord2s";
                  var4[212] = "glTexCoord2i";
                  var4[213] = "glTexCoord2d";
                  var4[214] = "glTexCoord2fv";
                  var4[215] = "glTexCoord2sv";
                  var4[216] = "glTexCoord2iv";
                  var4[217] = "glTexCoord2dv";
                  var4[218] = "glTexCoord3f";
                  var4[219] = "glTexCoord3s";
                  var4[220] = "glTexCoord3i";
                  var4[221] = "glTexCoord3d";
                  var4[222] = "glTexCoord3fv";
                  var4[223] = "glTexCoord3sv";
                  var4[224] = "glTexCoord3iv";
                  var4[225] = "glTexCoord3dv";
                  var4[226] = "glTexCoord4f";
                  var4[227] = "glTexCoord4s";
                  var4[228] = "glTexCoord4i";
                  var4[229] = "glTexCoord4d";
                  var4[230] = "glTexCoord4fv";
                  var4[231] = "glTexCoord4sv";
                  var4[232] = "glTexCoord4iv";
                  var4[233] = "glTexCoord4dv";
                  var4[234] = "glTexCoordPointer";
                  var4[235] = "glTexEnvi";
                  var4[236] = "glTexEnviv";
                  var4[237] = "glTexEnvf";
                  var4[238] = "glTexEnvfv";
                  var4[239] = "glTexGeni";
                  var4[240] = "glTexGeniv";
                  var4[241] = "glTexGenf";
                  var4[242] = "glTexGenfv";
                  var4[243] = "glTexGend";
                  var4[244] = "glTexGendv";
                  var4[245] = "glTranslatef";
                  var4[246] = "glTranslated";
                  var4[247] = "glVertex2f";
                  var4[248] = "glVertex2s";
                  var4[249] = "glVertex2i";
                  var4[250] = "glVertex2d";
                  var4[251] = "glVertex2fv";
                  var4[252] = "glVertex2sv";
                  var4[253] = "glVertex2iv";
                  var4[254] = "glVertex2dv";
                  var4[255] = "glVertex3f";
                  var4[256] = "glVertex3s";
                  var4[257] = "glVertex3i";
                  var4[258] = "glVertex3d";
                  var4[259] = "glVertex3fv";
                  var4[260] = "glVertex3sv";
                  var4[261] = "glVertex3iv";
                  var4[262] = "glVertex3dv";
                  var4[263] = "glVertex4f";
                  var4[264] = "glVertex4s";
                  var4[265] = "glVertex4i";
                  var4[266] = "glVertex4d";
                  var4[267] = "glVertex4fv";
                  var4[268] = "glVertex4sv";
                  var4[269] = "glVertex4iv";
                  var4[270] = "glVertex4dv";
                  var4[271] = "glVertexPointer";
                  if (!Checks.checkFunctions(var0, var1, var10, var4)) {
                     break label27;
                  }
               }

               FunctionProvider var10000 = var0;
               PointerBuffer var10001 = var1;
               int[] var5;
               (var5 = new int[64])[0] = 0;
               var5[1] = 1;
               var5[2] = 7;
               var5[3] = 9;
               var5[4] = 12;
               var5[5] = 14;
               var5[6] = 15;
               var5[7] = 17;
               var5[8] = 51;
               var5[9] = 55;
               var5[10] = 57;
               var5[11] = 58;
               var5[12] = 59;
               int var6 = var9 + 60;
               var5[13] = var6;
               var5[14] = 61;
               var5[15] = 62;
               var5[16] = 63;
               var6 = var9 + 68;
               var5[17] = var6;
               var5[18] = 83;
               var5[19] = 84;
               var5[20] = 89;
               var5[21] = 91;
               var5[22] = 92;
               var5[23] = 94;
               var5[24] = 95;
               var5[25] = 96;
               var5[26] = 97;
               var5[27] = 98;
               var5[28] = 109;
               var5[29] = 111;
               var5[30] = 117;
               var5[31] = 118;
               var5[32] = 119;
               var5[33] = 120;
               var5[34] = 121;
               var5[35] = 122;
               var5[36] = 137;
               var5[37] = 139;
               var5[38] = 149;
               var5[39] = 155;
               var5[40] = 190;
               var5[41] = 191;
               var5[42] = 195;
               var5[43] = 196;
               var5[44] = 197;
               var5[45] = 232;
               var5[46] = 233;
               var5[47] = 247;
               var5[48] = 250;
               var5[49] = 251;
               var5[50] = 252;
               var5[51] = 296;
               var5[52] = 297;
               var5[53] = 298;
               var5[54] = 299;
               var5[55] = 300;
               var5[56] = 301;
               var5[57] = 302;
               var5[58] = 303;
               var5[59] = 304;
               var5[60] = 305;
               var5[61] = 306;
               var5[62] = 307;
               var5[63] = 335;
               String[] var8;
               (var8 = new String[64])[0] = "glEnable";
               var8[1] = "glDisable";
               var8[2] = "glBindTexture";
               var8[3] = "glBlendFunc";
               var8[4] = "glClear";
               var8[5] = "glClearColor";
               var8[6] = "glClearDepth";
               var8[7] = "glClearStencil";
               var8[8] = "glColorMask";
               var8[9] = "glCullFace";
               var8[10] = "glDepthFunc";
               var8[11] = "glDepthMask";
               var8[12] = "glDepthRange";
               var8[13] = "glDisableClientState";
               var8[14] = "glDrawArrays";
               var8[15] = "glDrawBuffer";
               var8[16] = "glDrawElements";
               var8[17] = "glEnableClientState";
               var8[18] = "glFinish";
               var8[19] = "glFlush";
               var8[20] = "glFrontFace";
               var8[21] = "glGenTextures";
               var8[22] = "glDeleteTextures";
               var8[23] = "glGetBooleanv";
               var8[24] = "glGetFloatv";
               var8[25] = "glGetIntegerv";
               var8[26] = "glGetDoublev";
               var8[27] = "glGetError";
               var8[28] = "glGetPointerv";
               var8[29] = "glGetString";
               var8[30] = "glGetTexImage";
               var8[31] = "glGetTexLevelParameteriv";
               var8[32] = "glGetTexLevelParameterfv";
               var8[33] = "glGetTexParameteriv";
               var8[34] = "glGetTexParameterfv";
               var8[35] = "glHint";
               var8[36] = "glIsEnabled";
               var8[37] = "glIsTexture";
               var8[38] = "glLineWidth";
               var8[39] = "glLogicOp";
               var8[40] = "glPixelStorei";
               var8[41] = "glPixelStoref";
               var8[42] = "glPointSize";
               var8[43] = "glPolygonMode";
               var8[44] = "glPolygonOffset";
               var8[45] = "glReadBuffer";
               var8[46] = "glReadPixels";
               var8[47] = "glScissor";
               var8[48] = "glStencilFunc";
               var8[49] = "glStencilMask";
               var8[50] = "glStencilOp";
               var8[51] = "glTexImage1D";
               var8[52] = "glTexImage2D";
               var8[53] = "glCopyTexImage1D";
               var8[54] = "glCopyTexImage2D";
               var8[55] = "glCopyTexSubImage1D";
               var8[56] = "glCopyTexSubImage2D";
               var8[57] = "glTexParameteri";
               var8[58] = "glTexParameteriv";
               var8[59] = "glTexParameterf";
               var8[60] = "glTexParameterfv";
               var8[61] = "glTexSubImage1D";
               var8[62] = "glTexSubImage2D";
               var8[63] = "glViewport";
               if (Checks.checkFunctions(var10000, var10001, var5, var8)) {
                  break label28;
               }
            }

            if (!Checks.reportMissing("GL", "OpenGL11")) {
               var11 = false;
               return var11;
            }
         }

         var11 = true;
         return var11;
      }
   }

   private static boolean check_GL12(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL12")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 336;
         var10002[1] = 337;
         var10002[2] = 338;
         var10002[3] = 339;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glTexImage3D";
         var5[1] = "glTexSubImage3D";
         var5[2] = "glCopyTexSubImage3D";
         var5[3] = "glDrawRangeElements";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL12");
      }
   }

   private static boolean check_GL13(FunctionProvider var0, PointerBuffer var1, Set var2, boolean var3) {
      if (!var2.contains("OpenGL13")) {
         return false;
      } else {
         boolean var8;
         label23: {
            label22: {
               if (!var3) {
                  int[] var6;
                  (var6 = new int[37])[0] = 349;
                  var6[1] = 350;
                  var6[2] = 351;
                  var6[3] = 352;
                  var6[4] = 353;
                  var6[5] = 354;
                  var6[6] = 355;
                  var6[7] = 356;
                  var6[8] = 357;
                  var6[9] = 358;
                  var6[10] = 359;
                  var6[11] = 360;
                  var6[12] = 361;
                  var6[13] = 362;
                  var6[14] = 363;
                  var6[15] = 364;
                  var6[16] = 365;
                  var6[17] = 366;
                  var6[18] = 367;
                  var6[19] = 368;
                  var6[20] = 369;
                  var6[21] = 370;
                  var6[22] = 371;
                  var6[23] = 372;
                  var6[24] = 373;
                  var6[25] = 374;
                  var6[26] = 375;
                  var6[27] = 376;
                  var6[28] = 377;
                  var6[29] = 378;
                  var6[30] = 379;
                  var6[31] = 380;
                  var6[32] = 381;
                  var6[33] = 382;
                  var6[34] = 383;
                  var6[35] = 384;
                  var6[36] = 385;
                  String[] var7;
                  (var7 = new String[37])[0] = "glClientActiveTexture";
                  var7[1] = "glMultiTexCoord1f";
                  var7[2] = "glMultiTexCoord1s";
                  var7[3] = "glMultiTexCoord1i";
                  var7[4] = "glMultiTexCoord1d";
                  var7[5] = "glMultiTexCoord1fv";
                  var7[6] = "glMultiTexCoord1sv";
                  var7[7] = "glMultiTexCoord1iv";
                  var7[8] = "glMultiTexCoord1dv";
                  var7[9] = "glMultiTexCoord2f";
                  var7[10] = "glMultiTexCoord2s";
                  var7[11] = "glMultiTexCoord2i";
                  var7[12] = "glMultiTexCoord2d";
                  var7[13] = "glMultiTexCoord2fv";
                  var7[14] = "glMultiTexCoord2sv";
                  var7[15] = "glMultiTexCoord2iv";
                  var7[16] = "glMultiTexCoord2dv";
                  var7[17] = "glMultiTexCoord3f";
                  var7[18] = "glMultiTexCoord3s";
                  var7[19] = "glMultiTexCoord3i";
                  var7[20] = "glMultiTexCoord3d";
                  var7[21] = "glMultiTexCoord3fv";
                  var7[22] = "glMultiTexCoord3sv";
                  var7[23] = "glMultiTexCoord3iv";
                  var7[24] = "glMultiTexCoord3dv";
                  var7[25] = "glMultiTexCoord4f";
                  var7[26] = "glMultiTexCoord4s";
                  var7[27] = "glMultiTexCoord4i";
                  var7[28] = "glMultiTexCoord4d";
                  var7[29] = "glMultiTexCoord4fv";
                  var7[30] = "glMultiTexCoord4sv";
                  var7[31] = "glMultiTexCoord4iv";
                  var7[32] = "glMultiTexCoord4dv";
                  var7[33] = "glLoadTransposeMatrixf";
                  var7[34] = "glLoadTransposeMatrixd";
                  var7[35] = "glMultTransposeMatrixf";
                  var7[36] = "glMultTransposeMatrixd";
                  if (!Checks.checkFunctions(var0, var1, var6, var7)) {
                     break label22;
                  }
               }

               FunctionProvider var10000 = var0;
               PointerBuffer var10001 = var1;
               int[] var4;
               int[] var10002 = var4 = new int[9];
               var10002[0] = 340;
               var10002[1] = 341;
               var10002[2] = 342;
               var10002[3] = 343;
               var10002[4] = 344;
               var10002[5] = 345;
               var10002[6] = 346;
               var10002[7] = 347;
               var10002[8] = 348;
               String[] var5;
               String[] var9 = var5 = new String[9];
               var9[0] = "glCompressedTexImage3D";
               var9[1] = "glCompressedTexImage2D";
               var9[2] = "glCompressedTexImage1D";
               var9[3] = "glCompressedTexSubImage3D";
               var9[4] = "glCompressedTexSubImage2D";
               var9[5] = "glCompressedTexSubImage1D";
               var9[6] = "glGetCompressedTexImage";
               var9[7] = "glSampleCoverage";
               var9[8] = "glActiveTexture";
               if (Checks.checkFunctions(var10000, var10001, var4, var5)) {
                  break label23;
               }
            }

            if (!Checks.reportMissing("GL", "OpenGL13")) {
               var8 = false;
               return var8;
            }
         }

         var8 = true;
         return var8;
      }
   }

   private static boolean check_GL14(FunctionProvider var0, PointerBuffer var1, Set var2, boolean var3) {
      if (!var2.contains("OpenGL14")) {
         return false;
      } else {
         boolean var8;
         label23: {
            label22: {
               if (!var3) {
                  int[] var6;
                  (var6 = new int[38])[0] = 388;
                  var6[1] = 389;
                  var6[2] = 390;
                  var6[3] = 391;
                  var6[4] = 392;
                  var6[5] = 399;
                  var6[6] = 400;
                  var6[7] = 401;
                  var6[8] = 402;
                  var6[9] = 403;
                  var6[10] = 404;
                  var6[11] = 405;
                  var6[12] = 406;
                  var6[13] = 407;
                  var6[14] = 408;
                  var6[15] = 409;
                  var6[16] = 410;
                  var6[17] = 411;
                  var6[18] = 412;
                  var6[19] = 413;
                  var6[20] = 414;
                  var6[21] = 415;
                  var6[22] = 417;
                  var6[23] = 418;
                  var6[24] = 419;
                  var6[25] = 420;
                  var6[26] = 421;
                  var6[27] = 422;
                  var6[28] = 423;
                  var6[29] = 424;
                  var6[30] = 425;
                  var6[31] = 426;
                  var6[32] = 427;
                  var6[33] = 428;
                  var6[34] = 429;
                  var6[35] = 430;
                  var6[36] = 431;
                  var6[37] = 432;
                  String[] var7;
                  (var7 = new String[38])[0] = "glFogCoordf";
                  var7[1] = "glFogCoordd";
                  var7[2] = "glFogCoordfv";
                  var7[3] = "glFogCoorddv";
                  var7[4] = "glFogCoordPointer";
                  var7[5] = "glSecondaryColor3b";
                  var7[6] = "glSecondaryColor3s";
                  var7[7] = "glSecondaryColor3i";
                  var7[8] = "glSecondaryColor3f";
                  var7[9] = "glSecondaryColor3d";
                  var7[10] = "glSecondaryColor3ub";
                  var7[11] = "glSecondaryColor3us";
                  var7[12] = "glSecondaryColor3ui";
                  var7[13] = "glSecondaryColor3bv";
                  var7[14] = "glSecondaryColor3sv";
                  var7[15] = "glSecondaryColor3iv";
                  var7[16] = "glSecondaryColor3fv";
                  var7[17] = "glSecondaryColor3dv";
                  var7[18] = "glSecondaryColor3ubv";
                  var7[19] = "glSecondaryColor3usv";
                  var7[20] = "glSecondaryColor3uiv";
                  var7[21] = "glSecondaryColorPointer";
                  var7[22] = "glWindowPos2i";
                  var7[23] = "glWindowPos2s";
                  var7[24] = "glWindowPos2f";
                  var7[25] = "glWindowPos2d";
                  var7[26] = "glWindowPos2iv";
                  var7[27] = "glWindowPos2sv";
                  var7[28] = "glWindowPos2fv";
                  var7[29] = "glWindowPos2dv";
                  var7[30] = "glWindowPos3i";
                  var7[31] = "glWindowPos3s";
                  var7[32] = "glWindowPos3f";
                  var7[33] = "glWindowPos3d";
                  var7[34] = "glWindowPos3iv";
                  var7[35] = "glWindowPos3sv";
                  var7[36] = "glWindowPos3fv";
                  var7[37] = "glWindowPos3dv";
                  if (!Checks.checkFunctions(var0, var1, var6, var7)) {
                     break label22;
                  }
               }

               FunctionProvider var10000 = var0;
               PointerBuffer var10001 = var1;
               int[] var4;
               int[] var10002 = var4 = new int[9];
               var10002[0] = 386;
               var10002[1] = 387;
               var10002[2] = 393;
               var10002[3] = 394;
               var10002[4] = 395;
               var10002[5] = 396;
               var10002[6] = 397;
               var10002[7] = 398;
               var10002[8] = 416;
               String[] var5;
               String[] var9 = var5 = new String[9];
               var9[0] = "glBlendColor";
               var9[1] = "glBlendEquation";
               var9[2] = "glMultiDrawArrays";
               var9[3] = "glMultiDrawElements";
               var9[4] = "glPointParameterf";
               var9[5] = "glPointParameteri";
               var9[6] = "glPointParameterfv";
               var9[7] = "glPointParameteriv";
               var9[8] = "glBlendFuncSeparate";
               if (Checks.checkFunctions(var10000, var10001, var4, var5)) {
                  break label23;
               }
            }

            if (!Checks.reportMissing("GL", "OpenGL14")) {
               var8 = false;
               return var8;
            }
         }

         var8 = true;
         return var8;
      }
   }

   private static boolean check_GL15(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL15")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[19];
         var10002[0] = 433;
         var10002[1] = 434;
         var10002[2] = 435;
         var10002[3] = 436;
         var10002[4] = 437;
         var10002[5] = 438;
         var10002[6] = 439;
         var10002[7] = 440;
         var10002[8] = 441;
         var10002[9] = 442;
         var10002[10] = 443;
         var10002[11] = 444;
         var10002[12] = 445;
         var10002[13] = 446;
         var10002[14] = 447;
         var10002[15] = 448;
         var10002[16] = 449;
         var10002[17] = 450;
         var10002[18] = 451;
         String[] var4;
         String[] var5 = var4 = new String[19];
         var5[0] = "glBindBuffer";
         var5[1] = "glDeleteBuffers";
         var5[2] = "glGenBuffers";
         var5[3] = "glIsBuffer";
         var5[4] = "glBufferData";
         var5[5] = "glBufferSubData";
         var5[6] = "glGetBufferSubData";
         var5[7] = "glMapBuffer";
         var5[8] = "glUnmapBuffer";
         var5[9] = "glGetBufferParameteriv";
         var5[10] = "glGetBufferPointerv";
         var5[11] = "glGenQueries";
         var5[12] = "glDeleteQueries";
         var5[13] = "glIsQuery";
         var5[14] = "glBeginQuery";
         var5[15] = "glEndQuery";
         var5[16] = "glGetQueryiv";
         var5[17] = "glGetQueryObjectiv";
         var5[18] = "glGetQueryObjectuiv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL15");
      }
   }

   private static boolean check_GL20(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL20")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[93])[0] = 452;
         var3[1] = 453;
         var3[2] = 454;
         var3[3] = 455;
         var3[4] = 456;
         var3[5] = 457;
         var3[6] = 458;
         var3[7] = 459;
         var3[8] = 460;
         var3[9] = 461;
         var3[10] = 462;
         var3[11] = 463;
         var3[12] = 464;
         var3[13] = 465;
         var3[14] = 466;
         var3[15] = 467;
         var3[16] = 468;
         var3[17] = 469;
         var3[18] = 470;
         var3[19] = 471;
         var3[20] = 472;
         var3[21] = 473;
         var3[22] = 474;
         var3[23] = 475;
         var3[24] = 476;
         var3[25] = 477;
         var3[26] = 478;
         var3[27] = 479;
         var3[28] = 480;
         var3[29] = 481;
         var3[30] = 482;
         var3[31] = 483;
         var3[32] = 484;
         var3[33] = 485;
         var3[34] = 486;
         var3[35] = 487;
         var3[36] = 488;
         var3[37] = 489;
         var3[38] = 490;
         var3[39] = 491;
         var3[40] = 492;
         var3[41] = 493;
         var3[42] = 494;
         var3[43] = 495;
         var3[44] = 496;
         var3[45] = 497;
         var3[46] = 498;
         var3[47] = 499;
         var3[48] = 500;
         var3[49] = 501;
         var3[50] = 502;
         var3[51] = 503;
         var3[52] = 504;
         var3[53] = 505;
         var3[54] = 506;
         var3[55] = 507;
         var3[56] = 508;
         var3[57] = 509;
         var3[58] = 510;
         var3[59] = 511;
         var3[60] = 512;
         var3[61] = 513;
         var3[62] = 514;
         var3[63] = 515;
         var3[64] = 516;
         var3[65] = 517;
         var3[66] = 518;
         var3[67] = 519;
         var3[68] = 520;
         var3[69] = 521;
         var3[70] = 522;
         var3[71] = 523;
         var3[72] = 524;
         var3[73] = 525;
         var3[74] = 526;
         var3[75] = 527;
         var3[76] = 528;
         var3[77] = 529;
         var3[78] = 530;
         var3[79] = 531;
         var3[80] = 532;
         var3[81] = 533;
         var3[82] = 534;
         var3[83] = 535;
         var3[84] = 536;
         var3[85] = 537;
         var3[86] = 538;
         var3[87] = 539;
         var3[88] = 540;
         var3[89] = 541;
         var3[90] = 542;
         var3[91] = 543;
         var3[92] = 544;
         String[] var4;
         (var4 = new String[93])[0] = "glCreateProgram";
         var4[1] = "glDeleteProgram";
         var4[2] = "glIsProgram";
         var4[3] = "glCreateShader";
         var4[4] = "glDeleteShader";
         var4[5] = "glIsShader";
         var4[6] = "glAttachShader";
         var4[7] = "glDetachShader";
         var4[8] = "glShaderSource";
         var4[9] = "glCompileShader";
         var4[10] = "glLinkProgram";
         var4[11] = "glUseProgram";
         var4[12] = "glValidateProgram";
         var4[13] = "glUniform1f";
         var4[14] = "glUniform2f";
         var4[15] = "glUniform3f";
         var4[16] = "glUniform4f";
         var4[17] = "glUniform1i";
         var4[18] = "glUniform2i";
         var4[19] = "glUniform3i";
         var4[20] = "glUniform4i";
         var4[21] = "glUniform1fv";
         var4[22] = "glUniform2fv";
         var4[23] = "glUniform3fv";
         var4[24] = "glUniform4fv";
         var4[25] = "glUniform1iv";
         var4[26] = "glUniform2iv";
         var4[27] = "glUniform3iv";
         var4[28] = "glUniform4iv";
         var4[29] = "glUniformMatrix2fv";
         var4[30] = "glUniformMatrix3fv";
         var4[31] = "glUniformMatrix4fv";
         var4[32] = "glGetShaderiv";
         var4[33] = "glGetProgramiv";
         var4[34] = "glGetShaderInfoLog";
         var4[35] = "glGetProgramInfoLog";
         var4[36] = "glGetAttachedShaders";
         var4[37] = "glGetUniformLocation";
         var4[38] = "glGetActiveUniform";
         var4[39] = "glGetUniformfv";
         var4[40] = "glGetUniformiv";
         var4[41] = "glGetShaderSource";
         var4[42] = "glVertexAttrib1f";
         var4[43] = "glVertexAttrib1s";
         var4[44] = "glVertexAttrib1d";
         var4[45] = "glVertexAttrib2f";
         var4[46] = "glVertexAttrib2s";
         var4[47] = "glVertexAttrib2d";
         var4[48] = "glVertexAttrib3f";
         var4[49] = "glVertexAttrib3s";
         var4[50] = "glVertexAttrib3d";
         var4[51] = "glVertexAttrib4f";
         var4[52] = "glVertexAttrib4s";
         var4[53] = "glVertexAttrib4d";
         var4[54] = "glVertexAttrib4Nub";
         var4[55] = "glVertexAttrib1fv";
         var4[56] = "glVertexAttrib1sv";
         var4[57] = "glVertexAttrib1dv";
         var4[58] = "glVertexAttrib2fv";
         var4[59] = "glVertexAttrib2sv";
         var4[60] = "glVertexAttrib2dv";
         var4[61] = "glVertexAttrib3fv";
         var4[62] = "glVertexAttrib3sv";
         var4[63] = "glVertexAttrib3dv";
         var4[64] = "glVertexAttrib4fv";
         var4[65] = "glVertexAttrib4sv";
         var4[66] = "glVertexAttrib4dv";
         var4[67] = "glVertexAttrib4iv";
         var4[68] = "glVertexAttrib4bv";
         var4[69] = "glVertexAttrib4ubv";
         var4[70] = "glVertexAttrib4usv";
         var4[71] = "glVertexAttrib4uiv";
         var4[72] = "glVertexAttrib4Nbv";
         var4[73] = "glVertexAttrib4Nsv";
         var4[74] = "glVertexAttrib4Niv";
         var4[75] = "glVertexAttrib4Nubv";
         var4[76] = "glVertexAttrib4Nusv";
         var4[77] = "glVertexAttrib4Nuiv";
         var4[78] = "glVertexAttribPointer";
         var4[79] = "glEnableVertexAttribArray";
         var4[80] = "glDisableVertexAttribArray";
         var4[81] = "glBindAttribLocation";
         var4[82] = "glGetActiveAttrib";
         var4[83] = "glGetAttribLocation";
         var4[84] = "glGetVertexAttribiv";
         var4[85] = "glGetVertexAttribfv";
         var4[86] = "glGetVertexAttribdv";
         var4[87] = "glGetVertexAttribPointerv";
         var4[88] = "glDrawBuffers";
         var4[89] = "glBlendEquationSeparate";
         var4[90] = "glStencilOpSeparate";
         var4[91] = "glStencilFuncSeparate";
         var4[92] = "glStencilMaskSeparate";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL20");
      }
   }

   private static boolean check_GL21(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL21")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 545;
         var10002[1] = 546;
         var10002[2] = 547;
         var10002[3] = 548;
         var10002[4] = 549;
         var10002[5] = 550;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glUniformMatrix2x3fv";
         var5[1] = "glUniformMatrix3x2fv";
         var5[2] = "glUniformMatrix2x4fv";
         var5[3] = "glUniformMatrix4x2fv";
         var5[4] = "glUniformMatrix3x4fv";
         var5[5] = "glUniformMatrix4x3fv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL21");
      }
   }

   private static boolean check_GL30(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL30")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[84])[0] = 551;
         var3[1] = 552;
         var3[2] = 553;
         var3[3] = 554;
         var3[4] = 555;
         var3[5] = 556;
         var3[6] = 557;
         var3[7] = 558;
         var3[8] = 559;
         var3[9] = 560;
         var3[10] = 561;
         var3[11] = 562;
         var3[12] = 563;
         var3[13] = 564;
         var3[14] = 565;
         var3[15] = 566;
         var3[16] = 567;
         var3[17] = 568;
         var3[18] = 569;
         var3[19] = 570;
         var3[20] = 571;
         var3[21] = 572;
         var3[22] = 573;
         var3[23] = 574;
         var3[24] = 575;
         var3[25] = 576;
         var3[26] = 577;
         var3[27] = 578;
         var3[28] = 579;
         var3[29] = 580;
         var3[30] = 581;
         var3[31] = 582;
         var3[32] = 583;
         var3[33] = 584;
         var3[34] = 585;
         var3[35] = 586;
         var3[36] = 587;
         var3[37] = 588;
         var3[38] = 589;
         var3[39] = 590;
         var3[40] = 591;
         var3[41] = 592;
         var3[42] = 593;
         var3[43] = 594;
         var3[44] = 595;
         var3[45] = 596;
         var3[46] = 597;
         var3[47] = 598;
         var3[48] = 599;
         var3[49] = 600;
         var3[50] = 601;
         var3[51] = 602;
         var3[52] = 603;
         var3[53] = 604;
         var3[54] = 605;
         var3[55] = 606;
         var3[56] = 607;
         var3[57] = 608;
         var3[58] = 609;
         var3[59] = 610;
         var3[60] = 611;
         var3[61] = 612;
         var3[62] = 613;
         var3[63] = 614;
         var3[64] = 615;
         var3[65] = 616;
         var3[66] = 617;
         var3[67] = 618;
         var3[68] = 619;
         var3[69] = 620;
         var3[70] = 621;
         var3[71] = 622;
         var3[72] = 623;
         var3[73] = 624;
         var3[74] = 625;
         var3[75] = 626;
         var3[76] = 627;
         var3[77] = 628;
         var3[78] = 629;
         var3[79] = 630;
         var3[80] = 631;
         var3[81] = 632;
         var3[82] = 633;
         var3[83] = 634;
         String[] var4;
         (var4 = new String[84])[0] = "glGetStringi";
         var4[1] = "glClearBufferiv";
         var4[2] = "glClearBufferuiv";
         var4[3] = "glClearBufferfv";
         var4[4] = "glClearBufferfi";
         var4[5] = "glVertexAttribI1i";
         var4[6] = "glVertexAttribI2i";
         var4[7] = "glVertexAttribI3i";
         var4[8] = "glVertexAttribI4i";
         var4[9] = "glVertexAttribI1ui";
         var4[10] = "glVertexAttribI2ui";
         var4[11] = "glVertexAttribI3ui";
         var4[12] = "glVertexAttribI4ui";
         var4[13] = "glVertexAttribI1iv";
         var4[14] = "glVertexAttribI2iv";
         var4[15] = "glVertexAttribI3iv";
         var4[16] = "glVertexAttribI4iv";
         var4[17] = "glVertexAttribI1uiv";
         var4[18] = "glVertexAttribI2uiv";
         var4[19] = "glVertexAttribI3uiv";
         var4[20] = "glVertexAttribI4uiv";
         var4[21] = "glVertexAttribI4bv";
         var4[22] = "glVertexAttribI4sv";
         var4[23] = "glVertexAttribI4ubv";
         var4[24] = "glVertexAttribI4usv";
         var4[25] = "glVertexAttribIPointer";
         var4[26] = "glGetVertexAttribIiv";
         var4[27] = "glGetVertexAttribIuiv";
         var4[28] = "glUniform1ui";
         var4[29] = "glUniform2ui";
         var4[30] = "glUniform3ui";
         var4[31] = "glUniform4ui";
         var4[32] = "glUniform1uiv";
         var4[33] = "glUniform2uiv";
         var4[34] = "glUniform3uiv";
         var4[35] = "glUniform4uiv";
         var4[36] = "glGetUniformuiv";
         var4[37] = "glBindFragDataLocation";
         var4[38] = "glGetFragDataLocation";
         var4[39] = "glBeginConditionalRender";
         var4[40] = "glEndConditionalRender";
         var4[41] = "glMapBufferRange";
         var4[42] = "glFlushMappedBufferRange";
         var4[43] = "glClampColor";
         var4[44] = "glIsRenderbuffer";
         var4[45] = "glBindRenderbuffer";
         var4[46] = "glDeleteRenderbuffers";
         var4[47] = "glGenRenderbuffers";
         var4[48] = "glRenderbufferStorage";
         var4[49] = "glRenderbufferStorageMultisample";
         var4[50] = "glGetRenderbufferParameteriv";
         var4[51] = "glIsFramebuffer";
         var4[52] = "glBindFramebuffer";
         var4[53] = "glDeleteFramebuffers";
         var4[54] = "glGenFramebuffers";
         var4[55] = "glCheckFramebufferStatus";
         var4[56] = "glFramebufferTexture1D";
         var4[57] = "glFramebufferTexture2D";
         var4[58] = "glFramebufferTexture3D";
         var4[59] = "glFramebufferTextureLayer";
         var4[60] = "glFramebufferRenderbuffer";
         var4[61] = "glGetFramebufferAttachmentParameteriv";
         var4[62] = "glBlitFramebuffer";
         var4[63] = "glGenerateMipmap";
         var4[64] = "glTexParameterIiv";
         var4[65] = "glTexParameterIuiv";
         var4[66] = "glGetTexParameterIiv";
         var4[67] = "glGetTexParameterIuiv";
         var4[68] = "glColorMaski";
         var4[69] = "glGetBooleani_v";
         var4[70] = "glGetIntegeri_v";
         var4[71] = "glEnablei";
         var4[72] = "glDisablei";
         var4[73] = "glIsEnabledi";
         var4[74] = "glBindBufferRange";
         var4[75] = "glBindBufferBase";
         var4[76] = "glBeginTransformFeedback";
         var4[77] = "glEndTransformFeedback";
         var4[78] = "glTransformFeedbackVaryings";
         var4[79] = "glGetTransformFeedbackVarying";
         var4[80] = "glBindVertexArray";
         var4[81] = "glDeleteVertexArrays";
         var4[82] = "glGenVertexArrays";
         var4[83] = "glIsVertexArray";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL30");
      }
   }

   private static boolean check_GL31(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL31")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[12];
         var10002[0] = 635;
         var10002[1] = 636;
         var10002[2] = 637;
         var10002[3] = 638;
         var10002[4] = 639;
         var10002[5] = 640;
         var10002[6] = 641;
         var10002[7] = 642;
         var10002[8] = 643;
         var10002[9] = 644;
         var10002[10] = 645;
         var10002[11] = 646;
         String[] var4;
         String[] var5 = var4 = new String[12];
         var5[0] = "glDrawArraysInstanced";
         var5[1] = "glDrawElementsInstanced";
         var5[2] = "glCopyBufferSubData";
         var5[3] = "glPrimitiveRestartIndex";
         var5[4] = "glTexBuffer";
         var5[5] = "glGetUniformIndices";
         var5[6] = "glGetActiveUniformsiv";
         var5[7] = "glGetActiveUniformName";
         var5[8] = "glGetUniformBlockIndex";
         var5[9] = "glGetActiveUniformBlockiv";
         var5[10] = "glGetActiveUniformBlockName";
         var5[11] = "glUniformBlockBinding";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL31");
      }
   }

   private static boolean check_GL32(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL32")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[19];
         var10002[0] = 647;
         var10002[1] = 648;
         var10002[2] = 649;
         var10002[3] = 650;
         var10002[4] = 651;
         var10002[5] = 652;
         var10002[6] = 653;
         var10002[7] = 654;
         var10002[8] = 655;
         var10002[9] = 656;
         var10002[10] = 657;
         var10002[11] = 658;
         var10002[12] = 659;
         var10002[13] = 660;
         var10002[14] = 661;
         var10002[15] = 662;
         var10002[16] = 663;
         var10002[17] = 664;
         var10002[18] = 665;
         String[] var4;
         String[] var5 = var4 = new String[19];
         var5[0] = "glGetBufferParameteri64v";
         var5[1] = "glDrawElementsBaseVertex";
         var5[2] = "glDrawRangeElementsBaseVertex";
         var5[3] = "glDrawElementsInstancedBaseVertex";
         var5[4] = "glMultiDrawElementsBaseVertex";
         var5[5] = "glProvokingVertex";
         var5[6] = "glTexImage2DMultisample";
         var5[7] = "glTexImage3DMultisample";
         var5[8] = "glGetMultisamplefv";
         var5[9] = "glSampleMaski";
         var5[10] = "glFramebufferTexture";
         var5[11] = "glFenceSync";
         var5[12] = "glIsSync";
         var5[13] = "glDeleteSync";
         var5[14] = "glClientWaitSync";
         var5[15] = "glWaitSync";
         var5[16] = "glGetInteger64v";
         var5[17] = "glGetInteger64i_v";
         var5[18] = "glGetSynciv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL32");
      }
   }

   private static boolean check_GL33(FunctionProvider var0, PointerBuffer var1, Set var2, boolean var3) {
      if (!var2.contains("OpenGL33")) {
         return false;
      } else {
         boolean var8;
         label23: {
            label22: {
               if (!var3) {
                  int[] var6;
                  (var6 = new int[30])[0] = 686;
                  var6[1] = 687;
                  var6[2] = 688;
                  var6[3] = 689;
                  var6[4] = 690;
                  var6[5] = 691;
                  var6[6] = 692;
                  var6[7] = 693;
                  var6[8] = 694;
                  var6[9] = 695;
                  var6[10] = 696;
                  var6[11] = 697;
                  var6[12] = 698;
                  var6[13] = 699;
                  var6[14] = 700;
                  var6[15] = 701;
                  var6[16] = 702;
                  var6[17] = 703;
                  var6[18] = 704;
                  var6[19] = 705;
                  var6[20] = 706;
                  var6[21] = 707;
                  var6[22] = 708;
                  var6[23] = 709;
                  var6[24] = 710;
                  var6[25] = 711;
                  var6[26] = 712;
                  var6[27] = 713;
                  var6[28] = 714;
                  var6[29] = 715;
                  String[] var7;
                  (var7 = new String[30])[0] = "glVertexP2ui";
                  var7[1] = "glVertexP3ui";
                  var7[2] = "glVertexP4ui";
                  var7[3] = "glVertexP2uiv";
                  var7[4] = "glVertexP3uiv";
                  var7[5] = "glVertexP4uiv";
                  var7[6] = "glTexCoordP1ui";
                  var7[7] = "glTexCoordP2ui";
                  var7[8] = "glTexCoordP3ui";
                  var7[9] = "glTexCoordP4ui";
                  var7[10] = "glTexCoordP1uiv";
                  var7[11] = "glTexCoordP2uiv";
                  var7[12] = "glTexCoordP3uiv";
                  var7[13] = "glTexCoordP4uiv";
                  var7[14] = "glMultiTexCoordP1ui";
                  var7[15] = "glMultiTexCoordP2ui";
                  var7[16] = "glMultiTexCoordP3ui";
                  var7[17] = "glMultiTexCoordP4ui";
                  var7[18] = "glMultiTexCoordP1uiv";
                  var7[19] = "glMultiTexCoordP2uiv";
                  var7[20] = "glMultiTexCoordP3uiv";
                  var7[21] = "glMultiTexCoordP4uiv";
                  var7[22] = "glNormalP3ui";
                  var7[23] = "glNormalP3uiv";
                  var7[24] = "glColorP3ui";
                  var7[25] = "glColorP4ui";
                  var7[26] = "glColorP3uiv";
                  var7[27] = "glColorP4uiv";
                  var7[28] = "glSecondaryColorP3ui";
                  var7[29] = "glSecondaryColorP3uiv";
                  if (!Checks.checkFunctions(var0, var1, var6, var7)) {
                     break label22;
                  }
               }

               FunctionProvider var10000 = var0;
               PointerBuffer var10001 = var1;
               int[] var4;
               (var4 = new int[28])[0] = 666;
               var4[1] = 667;
               var4[2] = 668;
               var4[3] = 669;
               var4[4] = 670;
               var4[5] = 671;
               var4[6] = 672;
               var4[7] = 673;
               var4[8] = 674;
               var4[9] = 675;
               var4[10] = 676;
               var4[11] = 677;
               var4[12] = 678;
               var4[13] = 679;
               var4[14] = 680;
               var4[15] = 681;
               var4[16] = 682;
               var4[17] = 683;
               var4[18] = 684;
               var4[19] = 685;
               var4[20] = 716;
               var4[21] = 717;
               var4[22] = 718;
               var4[23] = 719;
               var4[24] = 720;
               var4[25] = 721;
               var4[26] = 722;
               var4[27] = 723;
               String[] var5;
               (var5 = new String[28])[0] = "glBindFragDataLocationIndexed";
               var5[1] = "glGetFragDataIndex";
               var5[2] = "glGenSamplers";
               var5[3] = "glDeleteSamplers";
               var5[4] = "glIsSampler";
               var5[5] = "glBindSampler";
               var5[6] = "glSamplerParameteri";
               var5[7] = "glSamplerParameterf";
               var5[8] = "glSamplerParameteriv";
               var5[9] = "glSamplerParameterfv";
               var5[10] = "glSamplerParameterIiv";
               var5[11] = "glSamplerParameterIuiv";
               var5[12] = "glGetSamplerParameteriv";
               var5[13] = "glGetSamplerParameterfv";
               var5[14] = "glGetSamplerParameterIiv";
               var5[15] = "glGetSamplerParameterIuiv";
               var5[16] = "glQueryCounter";
               var5[17] = "glGetQueryObjecti64v";
               var5[18] = "glGetQueryObjectui64v";
               var5[19] = "glVertexAttribDivisor";
               var5[20] = "glVertexAttribP1ui";
               var5[21] = "glVertexAttribP2ui";
               var5[22] = "glVertexAttribP3ui";
               var5[23] = "glVertexAttribP4ui";
               var5[24] = "glVertexAttribP1uiv";
               var5[25] = "glVertexAttribP2uiv";
               var5[26] = "glVertexAttribP3uiv";
               var5[27] = "glVertexAttribP4uiv";
               if (Checks.checkFunctions(var10000, var10001, var4, var5)) {
                  break label23;
               }
            }

            if (!Checks.reportMissing("GL", "OpenGL33")) {
               var8 = false;
               return var8;
            }
         }

         var8 = true;
         return var8;
      }
   }

   private static boolean check_GL40(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL40")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[46])[0] = 724;
         var3[1] = 725;
         var3[2] = 726;
         var3[3] = 727;
         var3[4] = 728;
         var3[5] = 729;
         var3[6] = 730;
         var3[7] = 731;
         var3[8] = 732;
         var3[9] = 733;
         var3[10] = 734;
         var3[11] = 735;
         var3[12] = 736;
         var3[13] = 737;
         var3[14] = 738;
         var3[15] = 739;
         var3[16] = 740;
         var3[17] = 741;
         var3[18] = 742;
         var3[19] = 743;
         var3[20] = 744;
         var3[21] = 745;
         var3[22] = 746;
         var3[23] = 747;
         var3[24] = 748;
         var3[25] = 749;
         var3[26] = 750;
         var3[27] = 751;
         var3[28] = 752;
         var3[29] = 753;
         var3[30] = 754;
         var3[31] = 755;
         var3[32] = 756;
         var3[33] = 757;
         var3[34] = 758;
         var3[35] = 759;
         var3[36] = 760;
         var3[37] = 761;
         var3[38] = 762;
         var3[39] = 763;
         var3[40] = 764;
         var3[41] = 765;
         var3[42] = 766;
         var3[43] = 767;
         var3[44] = 768;
         var3[45] = 769;
         String[] var4;
         (var4 = new String[46])[0] = "glBlendEquationi";
         var4[1] = "glBlendEquationSeparatei";
         var4[2] = "glBlendFunci";
         var4[3] = "glBlendFuncSeparatei";
         var4[4] = "glDrawArraysIndirect";
         var4[5] = "glDrawElementsIndirect";
         var4[6] = "glUniform1d";
         var4[7] = "glUniform2d";
         var4[8] = "glUniform3d";
         var4[9] = "glUniform4d";
         var4[10] = "glUniform1dv";
         var4[11] = "glUniform2dv";
         var4[12] = "glUniform3dv";
         var4[13] = "glUniform4dv";
         var4[14] = "glUniformMatrix2dv";
         var4[15] = "glUniformMatrix3dv";
         var4[16] = "glUniformMatrix4dv";
         var4[17] = "glUniformMatrix2x3dv";
         var4[18] = "glUniformMatrix2x4dv";
         var4[19] = "glUniformMatrix3x2dv";
         var4[20] = "glUniformMatrix3x4dv";
         var4[21] = "glUniformMatrix4x2dv";
         var4[22] = "glUniformMatrix4x3dv";
         var4[23] = "glGetUniformdv";
         var4[24] = "glMinSampleShading";
         var4[25] = "glGetSubroutineUniformLocation";
         var4[26] = "glGetSubroutineIndex";
         var4[27] = "glGetActiveSubroutineUniformiv";
         var4[28] = "glGetActiveSubroutineUniformName";
         var4[29] = "glGetActiveSubroutineName";
         var4[30] = "glUniformSubroutinesuiv";
         var4[31] = "glGetUniformSubroutineuiv";
         var4[32] = "glGetProgramStageiv";
         var4[33] = "glPatchParameteri";
         var4[34] = "glPatchParameterfv";
         var4[35] = "glBindTransformFeedback";
         var4[36] = "glDeleteTransformFeedbacks";
         var4[37] = "glGenTransformFeedbacks";
         var4[38] = "glIsTransformFeedback";
         var4[39] = "glPauseTransformFeedback";
         var4[40] = "glResumeTransformFeedback";
         var4[41] = "glDrawTransformFeedback";
         var4[42] = "glDrawTransformFeedbackStream";
         var4[43] = "glBeginQueryIndexed";
         var4[44] = "glEndQueryIndexed";
         var4[45] = "glGetQueryIndexediv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL40");
      }
   }

   private static boolean check_GL41(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL41")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[88])[0] = 770;
         var3[1] = 771;
         var3[2] = 772;
         var3[3] = 773;
         var3[4] = 774;
         var3[5] = 775;
         var3[6] = 776;
         var3[7] = 777;
         var3[8] = 778;
         var3[9] = 779;
         var3[10] = 780;
         var3[11] = 781;
         var3[12] = 782;
         var3[13] = 783;
         var3[14] = 784;
         var3[15] = 785;
         var3[16] = 786;
         var3[17] = 787;
         var3[18] = 788;
         var3[19] = 789;
         var3[20] = 790;
         var3[21] = 791;
         var3[22] = 792;
         var3[23] = 793;
         var3[24] = 794;
         var3[25] = 795;
         var3[26] = 796;
         var3[27] = 797;
         var3[28] = 798;
         var3[29] = 799;
         var3[30] = 800;
         var3[31] = 801;
         var3[32] = 802;
         var3[33] = 803;
         var3[34] = 804;
         var3[35] = 805;
         var3[36] = 806;
         var3[37] = 807;
         var3[38] = 808;
         var3[39] = 809;
         var3[40] = 810;
         var3[41] = 811;
         var3[42] = 812;
         var3[43] = 813;
         var3[44] = 814;
         var3[45] = 815;
         var3[46] = 816;
         var3[47] = 817;
         var3[48] = 818;
         var3[49] = 819;
         var3[50] = 820;
         var3[51] = 821;
         var3[52] = 822;
         var3[53] = 823;
         var3[54] = 824;
         var3[55] = 825;
         var3[56] = 826;
         var3[57] = 827;
         var3[58] = 828;
         var3[59] = 829;
         var3[60] = 830;
         var3[61] = 831;
         var3[62] = 832;
         var3[63] = 833;
         var3[64] = 834;
         var3[65] = 835;
         var3[66] = 836;
         var3[67] = 837;
         var3[68] = 838;
         var3[69] = 839;
         var3[70] = 840;
         var3[71] = 841;
         var3[72] = 842;
         var3[73] = 843;
         var3[74] = 844;
         var3[75] = 845;
         var3[76] = 846;
         var3[77] = 847;
         var3[78] = 848;
         var3[79] = 849;
         var3[80] = 850;
         var3[81] = 851;
         var3[82] = 852;
         var3[83] = 853;
         var3[84] = 854;
         var3[85] = 855;
         var3[86] = 856;
         var3[87] = 857;
         String[] var4;
         (var4 = new String[88])[0] = "glReleaseShaderCompiler";
         var4[1] = "glShaderBinary";
         var4[2] = "glGetShaderPrecisionFormat";
         var4[3] = "glDepthRangef";
         var4[4] = "glClearDepthf";
         var4[5] = "glGetProgramBinary";
         var4[6] = "glProgramBinary";
         var4[7] = "glProgramParameteri";
         var4[8] = "glUseProgramStages";
         var4[9] = "glActiveShaderProgram";
         var4[10] = "glCreateShaderProgramv";
         var4[11] = "glBindProgramPipeline";
         var4[12] = "glDeleteProgramPipelines";
         var4[13] = "glGenProgramPipelines";
         var4[14] = "glIsProgramPipeline";
         var4[15] = "glGetProgramPipelineiv";
         var4[16] = "glProgramUniform1i";
         var4[17] = "glProgramUniform2i";
         var4[18] = "glProgramUniform3i";
         var4[19] = "glProgramUniform4i";
         var4[20] = "glProgramUniform1ui";
         var4[21] = "glProgramUniform2ui";
         var4[22] = "glProgramUniform3ui";
         var4[23] = "glProgramUniform4ui";
         var4[24] = "glProgramUniform1f";
         var4[25] = "glProgramUniform2f";
         var4[26] = "glProgramUniform3f";
         var4[27] = "glProgramUniform4f";
         var4[28] = "glProgramUniform1d";
         var4[29] = "glProgramUniform2d";
         var4[30] = "glProgramUniform3d";
         var4[31] = "glProgramUniform4d";
         var4[32] = "glProgramUniform1iv";
         var4[33] = "glProgramUniform2iv";
         var4[34] = "glProgramUniform3iv";
         var4[35] = "glProgramUniform4iv";
         var4[36] = "glProgramUniform1uiv";
         var4[37] = "glProgramUniform2uiv";
         var4[38] = "glProgramUniform3uiv";
         var4[39] = "glProgramUniform4uiv";
         var4[40] = "glProgramUniform1fv";
         var4[41] = "glProgramUniform2fv";
         var4[42] = "glProgramUniform3fv";
         var4[43] = "glProgramUniform4fv";
         var4[44] = "glProgramUniform1dv";
         var4[45] = "glProgramUniform2dv";
         var4[46] = "glProgramUniform3dv";
         var4[47] = "glProgramUniform4dv";
         var4[48] = "glProgramUniformMatrix2fv";
         var4[49] = "glProgramUniformMatrix3fv";
         var4[50] = "glProgramUniformMatrix4fv";
         var4[51] = "glProgramUniformMatrix2dv";
         var4[52] = "glProgramUniformMatrix3dv";
         var4[53] = "glProgramUniformMatrix4dv";
         var4[54] = "glProgramUniformMatrix2x3fv";
         var4[55] = "glProgramUniformMatrix3x2fv";
         var4[56] = "glProgramUniformMatrix2x4fv";
         var4[57] = "glProgramUniformMatrix4x2fv";
         var4[58] = "glProgramUniformMatrix3x4fv";
         var4[59] = "glProgramUniformMatrix4x3fv";
         var4[60] = "glProgramUniformMatrix2x3dv";
         var4[61] = "glProgramUniformMatrix3x2dv";
         var4[62] = "glProgramUniformMatrix2x4dv";
         var4[63] = "glProgramUniformMatrix4x2dv";
         var4[64] = "glProgramUniformMatrix3x4dv";
         var4[65] = "glProgramUniformMatrix4x3dv";
         var4[66] = "glValidateProgramPipeline";
         var4[67] = "glGetProgramPipelineInfoLog";
         var4[68] = "glVertexAttribL1d";
         var4[69] = "glVertexAttribL2d";
         var4[70] = "glVertexAttribL3d";
         var4[71] = "glVertexAttribL4d";
         var4[72] = "glVertexAttribL1dv";
         var4[73] = "glVertexAttribL2dv";
         var4[74] = "glVertexAttribL3dv";
         var4[75] = "glVertexAttribL4dv";
         var4[76] = "glVertexAttribLPointer";
         var4[77] = "glGetVertexAttribLdv";
         var4[78] = "glViewportArrayv";
         var4[79] = "glViewportIndexedf";
         var4[80] = "glViewportIndexedfv";
         var4[81] = "glScissorArrayv";
         var4[82] = "glScissorIndexed";
         var4[83] = "glScissorIndexedv";
         var4[84] = "glDepthRangeArrayv";
         var4[85] = "glDepthRangeIndexed";
         var4[86] = "glGetFloati_v";
         var4[87] = "glGetDoublei_v";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL41");
      }
   }

   private static boolean check_GL42(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL42")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[12];
         var10002[0] = 858;
         var10002[1] = 859;
         var10002[2] = 860;
         var10002[3] = 861;
         var10002[4] = 862;
         var10002[5] = 863;
         var10002[6] = 864;
         var10002[7] = 865;
         var10002[8] = 866;
         var10002[9] = 867;
         var10002[10] = 868;
         var10002[11] = 869;
         String[] var4;
         String[] var5 = var4 = new String[12];
         var5[0] = "glGetActiveAtomicCounterBufferiv";
         var5[1] = "glTexStorage1D";
         var5[2] = "glTexStorage2D";
         var5[3] = "glTexStorage3D";
         var5[4] = "glDrawTransformFeedbackInstanced";
         var5[5] = "glDrawTransformFeedbackStreamInstanced";
         var5[6] = "glDrawArraysInstancedBaseInstance";
         var5[7] = "glDrawElementsInstancedBaseInstance";
         var5[8] = "glDrawElementsInstancedBaseVertexBaseInstance";
         var5[9] = "glBindImageTexture";
         var5[10] = "glMemoryBarrier";
         var5[11] = "glGetInternalformativ";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL42");
      }
   }

   private static boolean check_GL43(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL43")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[43])[0] = 870;
         var3[1] = 871;
         var3[2] = 872;
         var3[3] = 873;
         var3[4] = 874;
         var3[5] = 875;
         var3[6] = 876;
         var3[7] = 877;
         var3[8] = 878;
         var3[9] = 879;
         var3[10] = 880;
         var3[11] = 881;
         var3[12] = 882;
         var3[13] = 883;
         var3[14] = 884;
         var3[15] = 885;
         var3[16] = 886;
         var3[17] = 887;
         var3[18] = 888;
         var3[19] = 889;
         var3[20] = 890;
         var3[21] = 891;
         var3[22] = 892;
         var3[23] = 893;
         var3[24] = 894;
         var3[25] = 895;
         var3[26] = 896;
         var3[27] = 897;
         var3[28] = 898;
         var3[29] = 899;
         var3[30] = 900;
         var3[31] = 901;
         var3[32] = 902;
         var3[33] = 903;
         var3[34] = 904;
         var3[35] = 905;
         var3[36] = 906;
         var3[37] = 907;
         var3[38] = 908;
         var3[39] = 909;
         var3[40] = 910;
         var3[41] = 911;
         var3[42] = 912;
         String[] var4;
         (var4 = new String[43])[0] = "glClearBufferData";
         var4[1] = "glClearBufferSubData";
         var4[2] = "glDispatchCompute";
         var4[3] = "glDispatchComputeIndirect";
         var4[4] = "glCopyImageSubData";
         var4[5] = "glDebugMessageControl";
         var4[6] = "glDebugMessageInsert";
         var4[7] = "glDebugMessageCallback";
         var4[8] = "glGetDebugMessageLog";
         var4[9] = "glPushDebugGroup";
         var4[10] = "glPopDebugGroup";
         var4[11] = "glObjectLabel";
         var4[12] = "glGetObjectLabel";
         var4[13] = "glObjectPtrLabel";
         var4[14] = "glGetObjectPtrLabel";
         var4[15] = "glFramebufferParameteri";
         var4[16] = "glGetFramebufferParameteriv";
         var4[17] = "glGetInternalformati64v";
         var4[18] = "glInvalidateTexSubImage";
         var4[19] = "glInvalidateTexImage";
         var4[20] = "glInvalidateBufferSubData";
         var4[21] = "glInvalidateBufferData";
         var4[22] = "glInvalidateFramebuffer";
         var4[23] = "glInvalidateSubFramebuffer";
         var4[24] = "glMultiDrawArraysIndirect";
         var4[25] = "glMultiDrawElementsIndirect";
         var4[26] = "glGetProgramInterfaceiv";
         var4[27] = "glGetProgramResourceIndex";
         var4[28] = "glGetProgramResourceName";
         var4[29] = "glGetProgramResourceiv";
         var4[30] = "glGetProgramResourceLocation";
         var4[31] = "glGetProgramResourceLocationIndex";
         var4[32] = "glShaderStorageBlockBinding";
         var4[33] = "glTexBufferRange";
         var4[34] = "glTexStorage2DMultisample";
         var4[35] = "glTexStorage3DMultisample";
         var4[36] = "glTextureView";
         var4[37] = "glBindVertexBuffer";
         var4[38] = "glVertexAttribFormat";
         var4[39] = "glVertexAttribIFormat";
         var4[40] = "glVertexAttribLFormat";
         var4[41] = "glVertexAttribBinding";
         var4[42] = "glVertexBindingDivisor";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL43");
      }
   }

   private static boolean check_GL44(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL44")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[9];
         var10002[0] = 913;
         var10002[1] = 914;
         var10002[2] = 915;
         var10002[3] = 916;
         var10002[4] = 917;
         var10002[5] = 918;
         var10002[6] = 919;
         var10002[7] = 920;
         var10002[8] = 921;
         String[] var4;
         String[] var5 = var4 = new String[9];
         var5[0] = "glBufferStorage";
         var5[1] = "glClearTexSubImage";
         var5[2] = "glClearTexImage";
         var5[3] = "glBindBuffersBase";
         var5[4] = "glBindBuffersRange";
         var5[5] = "glBindTextures";
         var5[6] = "glBindSamplers";
         var5[7] = "glBindImageTextures";
         var5[8] = "glBindVertexBuffers";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL44");
      }
   }

   private static boolean check_GL45(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL45")) {
         return false;
      }
      var0.getFunctionAddress("glGetMapdv");
      var0.getFunctionAddress("glGetMapfv");
      var0.getFunctionAddress("glGetMapiv");
      var0.getFunctionAddress("glGetPixelMapfv");
      var0.getFunctionAddress("glGetPixelMapuiv");
      var0.getFunctionAddress("glGetPixelMapusv");
      var0.getFunctionAddress("glGetPolygonStipple");
      if (var2.contains("GL_ARB_imaging")) {
         var0.getFunctionAddress("glGetColorTable");
         var0.getFunctionAddress("glGetConvolutionFilter");
         var0.getFunctionAddress("glGetSeparableFilter");
         var0.getFunctionAddress("glGetHistogram");
         var0.getFunctionAddress("glGetMinmax");
      }
      int[] var3 = new int[107];
      var3[0] = 922;
      var3[1] = 923;
      var3[2] = 924;
      var3[3] = 925;
      var3[4] = 926;
      var3[5] = 927;
      var3[6] = 928;
      var3[7] = 929;
      var3[8] = 930;
      var3[9] = 931;
      var3[10] = 932;
      var3[11] = 933;
      var3[12] = 934;
      var3[13] = 935;
      var3[14] = 936;
      var3[15] = 937;
      var3[16] = 938;
      var3[17] = 939;
      var3[18] = 940;
      var3[19] = 941;
      var3[20] = 942;
      var3[21] = 943;
      var3[22] = 944;
      var3[23] = 945;
      var3[24] = 946;
      var3[25] = 947;
      var3[26] = 948;
      var3[27] = 949;
      var3[28] = 950;
      var3[29] = 951;
      var3[30] = 952;
      var3[31] = 953;
      var3[32] = 954;
      var3[33] = 955;
      var3[34] = 956;
      var3[35] = 957;
      var3[36] = 958;
      var3[37] = 959;
      var3[38] = 960;
      var3[39] = 961;
      var3[40] = 962;
      var3[41] = 963;
      var3[42] = 964;
      var3[43] = 965;
      var3[44] = 966;
      var3[45] = 967;
      var3[46] = 968;
      var3[47] = 969;
      var3[48] = 970;
      var3[49] = 971;
      var3[50] = 972;
      var3[51] = 973;
      var3[52] = 974;
      var3[53] = 975;
      var3[54] = 976;
      var3[55] = 977;
      var3[56] = 978;
      var3[57] = 979;
      var3[58] = 980;
      var3[59] = 981;
      var3[60] = 982;
      var3[61] = 983;
      var3[62] = 984;
      var3[63] = 985;
      var3[64] = 986;
      var3[65] = 987;
      var3[66] = 988;
      var3[67] = 989;
      var3[68] = 990;
      var3[69] = 991;
      var3[70] = 992;
      var3[71] = 993;
      var3[72] = 994;
      var3[73] = 995;
      var3[74] = 996;
      var3[75] = 997;
      var3[76] = 998;
      var3[77] = 999;
      var3[78] = 1000;
      var3[79] = 1001;
      var3[80] = 1002;
      var3[81] = 1003;
      var3[82] = 1004;
      var3[83] = 1005;
      var3[84] = 1006;
      var3[85] = 1007;
      var3[86] = 1008;
      var3[87] = 1009;
      var3[88] = 1010;
      var3[89] = 1011;
      var3[90] = 1012;
      var3[91] = 1013;
      var3[92] = 1014;
      var3[93] = 1015;
      var3[94] = 1016;
      var3[95] = 1017;
      var3[96] = 1018;
      var3[97] = 1019;
      var3[98] = 1020;
      var3[99] = 1021;
      var3[100] = 1022;
      var3[101] = 1023;
      var3[102] = 1024;
      var3[103] = 1033;
      var3[104] = 1040;
      var3[105] = 1042;
      var3[106] = 1043;
      String[] var4 = new String[107];
      var4[0] = "glClipControl";
      var4[1] = "glCreateTransformFeedbacks";
      var4[2] = "glTransformFeedbackBufferBase";
      var4[3] = "glTransformFeedbackBufferRange";
      var4[4] = "glGetTransformFeedbackiv";
      var4[5] = "glGetTransformFeedbacki_v";
      var4[6] = "glGetTransformFeedbacki64_v";
      var4[7] = "glCreateBuffers";
      var4[8] = "glNamedBufferStorage";
      var4[9] = "glNamedBufferData";
      var4[10] = "glNamedBufferSubData";
      var4[11] = "glCopyNamedBufferSubData";
      var4[12] = "glClearNamedBufferData";
      var4[13] = "glClearNamedBufferSubData";
      var4[14] = "glMapNamedBuffer";
      var4[15] = "glMapNamedBufferRange";
      var4[16] = "glUnmapNamedBuffer";
      var4[17] = "glFlushMappedNamedBufferRange";
      var4[18] = "glGetNamedBufferParameteriv";
      var4[19] = "glGetNamedBufferParameteri64v";
      var4[20] = "glGetNamedBufferPointerv";
      var4[21] = "glGetNamedBufferSubData";
      var4[22] = "glCreateFramebuffers";
      var4[23] = "glNamedFramebufferRenderbuffer";
      var4[24] = "glNamedFramebufferParameteri";
      var4[25] = "glNamedFramebufferTexture";
      var4[26] = "glNamedFramebufferTextureLayer";
      var4[27] = "glNamedFramebufferDrawBuffer";
      var4[28] = "glNamedFramebufferDrawBuffers";
      var4[29] = "glNamedFramebufferReadBuffer";
      var4[30] = "glInvalidateNamedFramebufferData";
      var4[31] = "glInvalidateNamedFramebufferSubData";
      var4[32] = "glClearNamedFramebufferiv";
      var4[33] = "glClearNamedFramebufferuiv";
      var4[34] = "glClearNamedFramebufferfv";
      var4[35] = "glClearNamedFramebufferfi";
      var4[36] = "glBlitNamedFramebuffer";
      var4[37] = "glCheckNamedFramebufferStatus";
      var4[38] = "glGetNamedFramebufferParameteriv";
      var4[39] = "glGetNamedFramebufferAttachmentParameteriv";
      var4[40] = "glCreateRenderbuffers";
      var4[41] = "glNamedRenderbufferStorage";
      var4[42] = "glNamedRenderbufferStorageMultisample";
      var4[43] = "glGetNamedRenderbufferParameteriv";
      var4[44] = "glCreateTextures";
      var4[45] = "glTextureBuffer";
      var4[46] = "glTextureBufferRange";
      var4[47] = "glTextureStorage1D";
      var4[48] = "glTextureStorage2D";
      var4[49] = "glTextureStorage3D";
      var4[50] = "glTextureStorage2DMultisample";
      var4[51] = "glTextureStorage3DMultisample";
      var4[52] = "glTextureSubImage1D";
      var4[53] = "glTextureSubImage2D";
      var4[54] = "glTextureSubImage3D";
      var4[55] = "glCompressedTextureSubImage1D";
      var4[56] = "glCompressedTextureSubImage2D";
      var4[57] = "glCompressedTextureSubImage3D";
      var4[58] = "glCopyTextureSubImage1D";
      var4[59] = "glCopyTextureSubImage2D";
      var4[60] = "glCopyTextureSubImage3D";
      var4[61] = "glTextureParameterf";
      var4[62] = "glTextureParameterfv";
      var4[63] = "glTextureParameteri";
      var4[64] = "glTextureParameterIiv";
      var4[65] = "glTextureParameterIuiv";
      var4[66] = "glTextureParameteriv";
      var4[67] = "glGenerateTextureMipmap";
      var4[68] = "glBindTextureUnit";
      var4[69] = "glGetTextureImage";
      var4[70] = "glGetCompressedTextureImage";
      var4[71] = "glGetTextureLevelParameterfv";
      var4[72] = "glGetTextureLevelParameteriv";
      var4[73] = "glGetTextureParameterfv";
      var4[74] = "glGetTextureParameterIiv";
      var4[75] = "glGetTextureParameterIuiv";
      var4[76] = "glGetTextureParameteriv";
      var4[77] = "glCreateVertexArrays";
      var4[78] = "glDisableVertexArrayAttrib";
      var4[79] = "glEnableVertexArrayAttrib";
      var4[80] = "glVertexArrayElementBuffer";
      var4[81] = "glVertexArrayVertexBuffer";
      var4[82] = "glVertexArrayVertexBuffers";
      var4[83] = "glVertexArrayAttribFormat";
      var4[84] = "glVertexArrayAttribIFormat";
      var4[85] = "glVertexArrayAttribLFormat";
      var4[86] = "glVertexArrayAttribBinding";
      var4[87] = "glVertexArrayBindingDivisor";
      var4[88] = "glGetVertexArrayiv";
      var4[89] = "glGetVertexArrayIndexediv";
      var4[90] = "glGetVertexArrayIndexed64iv";
      var4[91] = "glCreateSamplers";
      var4[92] = "glCreateProgramPipelines";
      var4[93] = "glCreateQueries";
      var4[94] = "glGetQueryBufferObjectiv";
      var4[95] = "glGetQueryBufferObjectuiv";
      var4[96] = "glGetQueryBufferObjecti64v";
      var4[97] = "glGetQueryBufferObjectui64v";
      var4[98] = "glMemoryBarrierByRegion";
      var4[99] = "glGetTextureSubImage";
      var4[100] = "glGetCompressedTextureSubImage";
      var4[101] = "glTextureBarrier";
      var4[102] = "glGetGraphicsResetStatus";
      var4[103] = "glReadnPixels";
      var4[104] = "glGetnUniformfv";
      var4[105] = "glGetnUniformiv";
      var4[106] = "glGetnUniformuiv";
      return Checks.checkFunctions(var0, var1, var3, var4) || Checks.reportMissing("GL", "OpenGL45");
   }

   private static boolean check_GL46(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("OpenGL46")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 1044;
         var10002[1] = 1045;
         var10002[2] = 1046;
         var10002[3] = 1047;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glMultiDrawArraysIndirectCount";
         var5[1] = "glMultiDrawElementsIndirectCount";
         var5[2] = "glPolygonOffsetClamp";
         var5[3] = "glSpecializeShader";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "OpenGL46");
      }
   }

   private static boolean check_AMD_debug_output(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_AMD_debug_output")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 1048;
         var10002[1] = 1049;
         var10002[2] = 1050;
         var10002[3] = 1051;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glDebugMessageEnableAMD";
         var5[1] = "glDebugMessageInsertAMD";
         var5[2] = "glDebugMessageCallbackAMD";
         var5[3] = "glGetDebugMessageLogAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_AMD_debug_output");
      }
   }

   private static boolean check_AMD_draw_buffers_blend(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_AMD_draw_buffers_blend")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 1052;
         var10002[1] = 1053;
         var10002[2] = 1054;
         var10002[3] = 1055;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glBlendFuncIndexedAMD";
         var5[1] = "glBlendFuncSeparateIndexedAMD";
         var5[2] = "glBlendEquationIndexedAMD";
         var5[3] = "glBlendEquationSeparateIndexedAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_AMD_draw_buffers_blend");
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
         var10002[0] = 1056;
         var10002[1] = 1057;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glRenderbufferStorageMultisampleAdvancedAMD";
         var5[1] = "glNamedRenderbufferStorageMultisampleAdvancedAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_AMD_framebuffer_multisample_advanced");
      }
   }

   private static boolean check_AMD_gpu_shader_int64(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_AMD_gpu_shader_int64")) {
         return false;
      } else {
         int var21;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var21 = 0;
         } else {
            var21 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[34])[0] = 1058;
         var3[1] = 1059;
         var3[2] = 1060;
         var3[3] = 1061;
         var3[4] = 1062;
         var3[5] = 1063;
         var3[6] = 1064;
         var3[7] = 1065;
         var3[8] = 1066;
         var3[9] = 1067;
         var3[10] = 1068;
         var3[11] = 1069;
         var3[12] = 1070;
         var3[13] = 1071;
         var3[14] = 1072;
         var3[15] = 1073;
         var3[16] = 1074;
         var3[17] = 1075;
         int var4 = var21 + 1076;
         var3[18] = var4;
         var4 = var21 + 1077;
         var3[19] = var4;
         var4 = var21 + 1078;
         var3[20] = var4;
         var4 = var21 + 1079;
         var3[21] = var4;
         var4 = var21 + 1080;
         var3[22] = var4;
         var4 = var21 + 1081;
         var3[23] = var4;
         var4 = var21 + 1082;
         var3[24] = var4;
         var4 = var21 + 1083;
         var3[25] = var4;
         var4 = var21 + 1084;
         var3[26] = var4;
         var4 = var21 + 1085;
         var3[27] = var4;
         var4 = var21 + 1086;
         var3[28] = var4;
         var4 = var21 + 1087;
         var3[29] = var4;
         var4 = var21 + 1088;
         var3[30] = var4;
         var4 = var21 + 1089;
         var3[31] = var4;
         var4 = var21 + 1090;
         var3[32] = var4;
         var4 = var21 + 1091;
         var3[33] = var4;
         String[] var20;
         (var20 = new String[34])[0] = "glUniform1i64NV";
         var20[1] = "glUniform2i64NV";
         var20[2] = "glUniform3i64NV";
         var20[3] = "glUniform4i64NV";
         var20[4] = "glUniform1i64vNV";
         var20[5] = "glUniform2i64vNV";
         var20[6] = "glUniform3i64vNV";
         var20[7] = "glUniform4i64vNV";
         var20[8] = "glUniform1ui64NV";
         var20[9] = "glUniform2ui64NV";
         var20[10] = "glUniform3ui64NV";
         var20[11] = "glUniform4ui64NV";
         var20[12] = "glUniform1ui64vNV";
         var20[13] = "glUniform2ui64vNV";
         var20[14] = "glUniform3ui64vNV";
         var20[15] = "glUniform4ui64vNV";
         var20[16] = "glGetUniformi64vNV";
         var20[17] = "glGetUniformui64vNV";
         var20[18] = "glProgramUniform1i64NV";
         var20[19] = "glProgramUniform2i64NV";
         var20[20] = "glProgramUniform3i64NV";
         var20[21] = "glProgramUniform4i64NV";
         var20[22] = "glProgramUniform1i64vNV";
         var20[23] = "glProgramUniform2i64vNV";
         var20[24] = "glProgramUniform3i64vNV";
         var20[25] = "glProgramUniform4i64vNV";
         var20[26] = "glProgramUniform1ui64NV";
         var20[27] = "glProgramUniform2ui64NV";
         var20[28] = "glProgramUniform3ui64NV";
         var20[29] = "glProgramUniform4ui64NV";
         var20[30] = "glProgramUniform1ui64vNV";
         var20[31] = "glProgramUniform2ui64vNV";
         var20[32] = "glProgramUniform3ui64vNV";
         var20[33] = "glProgramUniform4ui64vNV";
         return Checks.checkFunctions(var10000, var10001, var3, var20) || Checks.reportMissing("GL", "GL_AMD_gpu_shader_int64");
      }
   }

   private static boolean check_AMD_interleaved_elements(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_AMD_interleaved_elements")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1092;
         String[] var4;
         (var4 = new String[1])[0] = "glVertexAttribParameteriAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_AMD_interleaved_elements");
      }
   }

   private static boolean check_AMD_occlusion_query_event(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_AMD_occlusion_query_event")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1093;
         String[] var4;
         (var4 = new String[1])[0] = "glQueryObjectParameteruiAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_AMD_occlusion_query_event");
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
         var10002[0] = 1094;
         var10002[1] = 1095;
         var10002[2] = 1096;
         var10002[3] = 1097;
         var10002[4] = 1098;
         var10002[5] = 1099;
         var10002[6] = 1100;
         var10002[7] = 1101;
         var10002[8] = 1102;
         var10002[9] = 1103;
         var10002[10] = 1104;
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
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_AMD_performance_monitor");
      }
   }

   private static boolean check_AMD_sample_positions(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_AMD_sample_positions")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1105;
         String[] var4;
         (var4 = new String[1])[0] = "glSetMultisamplefvAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_AMD_sample_positions");
      }
   }

   private static boolean check_AMD_sparse_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_AMD_sparse_texture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1106;
         var10002[1] = 1107;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glTexStorageSparseAMD";
         var5[1] = "glTextureStorageSparseAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_AMD_sparse_texture");
      }
   }

   private static boolean check_AMD_stencil_operation_extended(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_AMD_stencil_operation_extended")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1108;
         String[] var4;
         (var4 = new String[1])[0] = "glStencilOpValueAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_AMD_stencil_operation_extended");
      }
   }

   private static boolean check_AMD_vertex_shader_tessellator(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_AMD_vertex_shader_tessellator")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1109;
         var10002[1] = 1110;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glTessellationFactorAMD";
         var5[1] = "glTessellationModeAMD";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_AMD_vertex_shader_tessellator");
      }
   }

   private static boolean check_ARB_base_instance(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_base_instance")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 864;
         var10002[1] = 865;
         var10002[2] = 866;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glDrawArraysInstancedBaseInstance";
         var5[1] = "glDrawElementsInstancedBaseInstance";
         var5[2] = "glDrawElementsInstancedBaseVertexBaseInstance";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_base_instance");
      }
   }

   private static boolean check_ARB_bindless_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_bindless_texture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[16];
         var10002[0] = 1111;
         var10002[1] = 1112;
         var10002[2] = 1113;
         var10002[3] = 1114;
         var10002[4] = 1115;
         var10002[5] = 1116;
         var10002[6] = 1117;
         var10002[7] = 1118;
         var10002[8] = 1119;
         var10002[9] = 1120;
         var10002[10] = 1121;
         var10002[11] = 1122;
         var10002[12] = 1123;
         var10002[13] = 1124;
         var10002[14] = 1125;
         var10002[15] = 1126;
         String[] var4;
         String[] var5 = var4 = new String[16];
         var5[0] = "glGetTextureHandleARB";
         var5[1] = "glGetTextureSamplerHandleARB";
         var5[2] = "glMakeTextureHandleResidentARB";
         var5[3] = "glMakeTextureHandleNonResidentARB";
         var5[4] = "glGetImageHandleARB";
         var5[5] = "glMakeImageHandleResidentARB";
         var5[6] = "glMakeImageHandleNonResidentARB";
         var5[7] = "glUniformHandleui64ARB";
         var5[8] = "glUniformHandleui64vARB";
         var5[9] = "glProgramUniformHandleui64ARB";
         var5[10] = "glProgramUniformHandleui64vARB";
         var5[11] = "glIsTextureHandleResidentARB";
         var5[12] = "glIsImageHandleResidentARB";
         var5[13] = "glVertexAttribL1ui64ARB";
         var5[14] = "glVertexAttribL1ui64vARB";
         var5[15] = "glGetVertexAttribLui64vARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_bindless_texture");
      }
   }

   private static boolean check_ARB_blend_func_extended(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_blend_func_extended")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 666;
         var10002[1] = 667;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glBindFragDataLocationIndexed";
         var5[1] = "glGetFragDataIndex";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_blend_func_extended");
      }
   }

   private static boolean check_ARB_buffer_storage(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_buffer_storage")) {
         return false;
      } else {
         int var5;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var3[0] = 913;
         var10002[1] = var5 + 1127;
         String[] var4;
         String[] var6 = var4 = new String[2];
         var6[0] = "glBufferStorage";
         var6[1] = "glNamedBufferStorageEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_buffer_storage");
      }
   }

   private static boolean check_ARB_cl_event(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_cl_event")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1128;
         String[] var4;
         (var4 = new String[1])[0] = "glCreateSyncFromCLeventARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_cl_event");
      }
   }

   private static boolean check_ARB_clear_buffer_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_clear_buffer_object")) {
         return false;
      } else {
         int var5;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var3[0] = 870;
         var3[1] = 871;
         var3[2] = var5 + 1129;
         var10002[3] = var5 + 1130;
         String[] var4;
         String[] var6 = var4 = new String[4];
         var6[0] = "glClearBufferData";
         var6[1] = "glClearBufferSubData";
         var6[2] = "glClearNamedBufferDataEXT";
         var6[3] = "glClearNamedBufferSubDataEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_clear_buffer_object");
      }
   }

   private static boolean check_ARB_clear_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_clear_texture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 914;
         var10002[1] = 915;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glClearTexSubImage";
         var5[1] = "glClearTexImage";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_clear_texture");
      }
   }

   private static boolean check_ARB_clip_control(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_clip_control")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 922;
         String[] var4;
         (var4 = new String[1])[0] = "glClipControl";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_clip_control");
      }
   }

   private static boolean check_ARB_color_buffer_float(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_color_buffer_float")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1131;
         String[] var4;
         (var4 = new String[1])[0] = "glClampColorARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_color_buffer_float");
      }
   }

   private static boolean check_ARB_compute_shader(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_compute_shader")) {
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
         var5[0] = "glDispatchCompute";
         var5[1] = "glDispatchComputeIndirect";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_compute_shader");
      }
   }

   private static boolean check_ARB_compute_variable_group_size(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_compute_variable_group_size")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1132;
         String[] var4;
         (var4 = new String[1])[0] = "glDispatchComputeGroupSizeARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_compute_variable_group_size");
      }
   }

   private static boolean check_ARB_copy_buffer(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_copy_buffer")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 637;
         String[] var4;
         (var4 = new String[1])[0] = "glCopyBufferSubData";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_copy_buffer");
      }
   }

   private static boolean check_ARB_copy_image(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_copy_image")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 874;
         String[] var4;
         (var4 = new String[1])[0] = "glCopyImageSubData";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_copy_image");
      }
   }

   private static boolean check_ARB_debug_output(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_debug_output")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 1133;
         var10002[1] = 1134;
         var10002[2] = 1135;
         var10002[3] = 1136;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glDebugMessageControlARB";
         var5[1] = "glDebugMessageInsertARB";
         var5[2] = "glDebugMessageCallbackARB";
         var5[3] = "glGetDebugMessageLogARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_debug_output");
      }
   }

   private static boolean check_ARB_direct_state_access(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_direct_state_access")) {
         return false;
      } else {
         int var3;
         if (ARB_transform_feedback2(var2)) {
            var3 = 0;
         } else {
            var3 = Integer.MIN_VALUE;
         }

         int var4;
         if (ARB_uniform_buffer_object(var2)) {
            var4 = 0;
         } else {
            var4 = Integer.MIN_VALUE;
         }

         int var5;
         if (ARB_buffer_storage(var2)) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         int var6;
         if (ARB_copy_buffer(var2)) {
            var6 = 0;
         } else {
            var6 = Integer.MIN_VALUE;
         }

         int var7;
         if (ARB_clear_texture(var2)) {
            var7 = 0;
         } else {
            var7 = Integer.MIN_VALUE;
         }

         int var8;
         if (ARB_map_buffer_range(var2)) {
            var8 = 0;
         } else {
            var8 = Integer.MIN_VALUE;
         }

         int var9;
         if (ARB_framebuffer_object(var2)) {
            var9 = 0;
         } else {
            var9 = Integer.MIN_VALUE;
         }

         int var10;
         if (ARB_framebuffer_no_attachments(var2)) {
            var10 = 0;
         } else {
            var10 = Integer.MIN_VALUE;
         }

         int var11;
         if (ARB_invalidate_subdata(var2)) {
            var11 = 0;
         } else {
            var11 = Integer.MIN_VALUE;
         }

         int var12;
         if (ARB_texture_buffer_object(var2)) {
            var12 = 0;
         } else {
            var12 = Integer.MIN_VALUE;
         }

         int var13;
         if (ARB_texture_buffer_range(var2)) {
            var13 = 0;
         } else {
            var13 = Integer.MIN_VALUE;
         }

         int var14;
         if (ARB_texture_storage(var2)) {
            var14 = 0;
         } else {
            var14 = Integer.MIN_VALUE;
         }

         int var15;
         if (ARB_texture_storage_multisample(var2)) {
            var15 = 0;
         } else {
            var15 = Integer.MIN_VALUE;
         }

         int var16;
         if (ARB_vertex_array_object(var2)) {
            var16 = 0;
         } else {
            var16 = Integer.MIN_VALUE;
         }

         int var17;
         if (ARB_vertex_attrib_binding(var2)) {
            var17 = 0;
         } else {
            var17 = Integer.MIN_VALUE;
         }

         int var18;
         if (ARB_multi_bind(var2)) {
            var18 = 0;
         } else {
            var18 = Integer.MIN_VALUE;
         }

         int var19;
         if (ARB_sampler_objects(var2)) {
            var19 = 0;
         } else {
            var19 = Integer.MIN_VALUE;
         }

         int var20;
         if (ARB_separate_shader_objects(var2)) {
            var20 = 0;
         } else {
            var20 = Integer.MIN_VALUE;
         }

         int var85;
         if (ARB_query_buffer_object(var2)) {
            var85 = 0;
         } else {
            var85 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var21 = new int[97];
         int var22 = var3 + 923;
         var21[0] = var22;
         var22 = var4 + 924;
         var21[1] = var22;
         var22 = var4 + 925;
         var21[2] = var22;
         var22 = var3 + 926;
         var21[3] = var22;
         var22 = var3 + 927;
         var21[4] = var22;
         var22 = var3 + 928;
         var21[5] = var22;
         var21[6] = 929;
         var22 = var5 + 930;
         var21[7] = var22;
         var21[8] = 931;
         var21[9] = 932;
         var22 = var6 + 933;
         var21[10] = var22;
         var22 = var7 + 934;
         var21[11] = var22;
         var22 = var7 + 935;
         var21[12] = var22;
         var21[13] = 936;
         var22 = var8 + 937;
         var21[14] = var22;
         var21[15] = 938;
         var22 = var8 + 939;
         var21[16] = var22;
         var21[17] = 940;
         var21[18] = 941;
         var21[19] = 942;
         var21[20] = 943;
         var22 = var9 + 944;
         var21[21] = var22;
         var22 = var9 + 945;
         var21[22] = var22;
         var22 = var10 + 946;
         var21[23] = var22;
         var22 = var9 + 947;
         var21[24] = var22;
         var22 = var9 + 948;
         var21[25] = var22;
         var22 = var9 + 949;
         var21[26] = var22;
         var22 = var9 + 950;
         var21[27] = var22;
         var22 = var9 + 951;
         var21[28] = var22;
         var22 = var11 + 952;
         var21[29] = var22;
         var22 = var11 + 953;
         var21[30] = var22;
         var22 = var9 + 954;
         var21[31] = var22;
         var22 = var9 + 955;
         var21[32] = var22;
         var22 = var9 + 956;
         var21[33] = var22;
         var22 = var9 + 957;
         var21[34] = var22;
         var22 = var9 + 958;
         var21[35] = var22;
         var22 = var9 + 959;
         var21[36] = var22;
         var22 = var10 + 960;
         var21[37] = var22;
         var22 = var9 + 961;
         var21[38] = var22;
         var22 = var9 + 962;
         var21[39] = var22;
         var22 = var9 + 963;
         var21[40] = var22;
         var22 = var9 + 964;
         var21[41] = var22;
         var22 = var9 + 965;
         var21[42] = var22;
         var21[43] = 966;
         var22 = var12 + 967;
         var21[44] = var22;
         var22 = var13 + 968;
         var21[45] = var22;
         var22 = var14 + 969;
         var21[46] = var22;
         var22 = var14 + 970;
         var21[47] = var22;
         var22 = var14 + 971;
         var21[48] = var22;
         var22 = var15 + 972;
         var21[49] = var22;
         var22 = var15 + 973;
         var21[50] = var22;
         var21[51] = 974;
         var21[52] = 975;
         var21[53] = 976;
         var21[54] = 977;
         var21[55] = 978;
         var21[56] = 979;
         var21[57] = 980;
         var21[58] = 981;
         var21[59] = 982;
         var21[60] = 983;
         var21[61] = 984;
         var21[62] = 985;
         var21[63] = 986;
         var21[64] = 987;
         var21[65] = 988;
         var22 = var9 + 989;
         var21[66] = var22;
         var21[67] = 990;
         var21[68] = 991;
         var21[69] = 992;
         var21[70] = 993;
         var21[71] = 994;
         var21[72] = 995;
         var21[73] = 996;
         var21[74] = 997;
         var21[75] = 998;
         var22 = var16 + 999;
         var21[76] = var22;
         var22 = var16 + 1000;
         var21[77] = var22;
         var22 = var16 + 1001;
         var21[78] = var22;
         var22 = var16 + 1002;
         var21[79] = var22;
         var22 = var17 + 1003;
         var21[80] = var22;
         var22 = var18 + 1004;
         var21[81] = var22;
         var22 = var17 + 1005;
         var21[82] = var22;
         var22 = var17 + 1006;
         var21[83] = var22;
         var22 = var17 + 1007;
         var21[84] = var22;
         var22 = var17 + 1008;
         var21[85] = var22;
         var22 = var17 + 1009;
         var21[86] = var22;
         var22 = var16 + 1010;
         var21[87] = var22;
         var22 = var16 + 1011;
         var21[88] = var22;
         var22 = var16 + 1012;
         var21[89] = var22;
         var22 = var19 + 1013;
         var21[90] = var22;
         var22 = var20 + 1014;
         var21[91] = var22;
         var21[92] = 1015;
         var22 = var85 + 1018;
         var21[93] = var22;
         var22 = var85 + 1016;
         var21[94] = var22;
         var22 = var85 + 1019;
         var21[95] = var22;
         var22 = var85 + 1017;
         var21[96] = var22;
         String[] var84;
         (var84 = new String[97])[0] = "glCreateTransformFeedbacks";
         var84[1] = "glTransformFeedbackBufferBase";
         var84[2] = "glTransformFeedbackBufferRange";
         var84[3] = "glGetTransformFeedbackiv";
         var84[4] = "glGetTransformFeedbacki_v";
         var84[5] = "glGetTransformFeedbacki64_v";
         var84[6] = "glCreateBuffers";
         var84[7] = "glNamedBufferStorage";
         var84[8] = "glNamedBufferData";
         var84[9] = "glNamedBufferSubData";
         var84[10] = "glCopyNamedBufferSubData";
         var84[11] = "glClearNamedBufferData";
         var84[12] = "glClearNamedBufferSubData";
         var84[13] = "glMapNamedBuffer";
         var84[14] = "glMapNamedBufferRange";
         var84[15] = "glUnmapNamedBuffer";
         var84[16] = "glFlushMappedNamedBufferRange";
         var84[17] = "glGetNamedBufferParameteriv";
         var84[18] = "glGetNamedBufferParameteri64v";
         var84[19] = "glGetNamedBufferPointerv";
         var84[20] = "glGetNamedBufferSubData";
         var84[21] = "glCreateFramebuffers";
         var84[22] = "glNamedFramebufferRenderbuffer";
         var84[23] = "glNamedFramebufferParameteri";
         var84[24] = "glNamedFramebufferTexture";
         var84[25] = "glNamedFramebufferTextureLayer";
         var84[26] = "glNamedFramebufferDrawBuffer";
         var84[27] = "glNamedFramebufferDrawBuffers";
         var84[28] = "glNamedFramebufferReadBuffer";
         var84[29] = "glInvalidateNamedFramebufferData";
         var84[30] = "glInvalidateNamedFramebufferSubData";
         var84[31] = "glClearNamedFramebufferiv";
         var84[32] = "glClearNamedFramebufferuiv";
         var84[33] = "glClearNamedFramebufferfv";
         var84[34] = "glClearNamedFramebufferfi";
         var84[35] = "glBlitNamedFramebuffer";
         var84[36] = "glCheckNamedFramebufferStatus";
         var84[37] = "glGetNamedFramebufferParameteriv";
         var84[38] = "glGetNamedFramebufferAttachmentParameteriv";
         var84[39] = "glCreateRenderbuffers";
         var84[40] = "glNamedRenderbufferStorage";
         var84[41] = "glNamedRenderbufferStorageMultisample";
         var84[42] = "glGetNamedRenderbufferParameteriv";
         var84[43] = "glCreateTextures";
         var84[44] = "glTextureBuffer";
         var84[45] = "glTextureBufferRange";
         var84[46] = "glTextureStorage1D";
         var84[47] = "glTextureStorage2D";
         var84[48] = "glTextureStorage3D";
         var84[49] = "glTextureStorage2DMultisample";
         var84[50] = "glTextureStorage3DMultisample";
         var84[51] = "glTextureSubImage1D";
         var84[52] = "glTextureSubImage2D";
         var84[53] = "glTextureSubImage3D";
         var84[54] = "glCompressedTextureSubImage1D";
         var84[55] = "glCompressedTextureSubImage2D";
         var84[56] = "glCompressedTextureSubImage3D";
         var84[57] = "glCopyTextureSubImage1D";
         var84[58] = "glCopyTextureSubImage2D";
         var84[59] = "glCopyTextureSubImage3D";
         var84[60] = "glTextureParameterf";
         var84[61] = "glTextureParameterfv";
         var84[62] = "glTextureParameteri";
         var84[63] = "glTextureParameterIiv";
         var84[64] = "glTextureParameterIuiv";
         var84[65] = "glTextureParameteriv";
         var84[66] = "glGenerateTextureMipmap";
         var84[67] = "glBindTextureUnit";
         var84[68] = "glGetTextureImage";
         var84[69] = "glGetCompressedTextureImage";
         var84[70] = "glGetTextureLevelParameterfv";
         var84[71] = "glGetTextureLevelParameteriv";
         var84[72] = "glGetTextureParameterfv";
         var84[73] = "glGetTextureParameterIiv";
         var84[74] = "glGetTextureParameterIuiv";
         var84[75] = "glGetTextureParameteriv";
         var84[76] = "glCreateVertexArrays";
         var84[77] = "glDisableVertexArrayAttrib";
         var84[78] = "glEnableVertexArrayAttrib";
         var84[79] = "glVertexArrayElementBuffer";
         var84[80] = "glVertexArrayVertexBuffer";
         var84[81] = "glVertexArrayVertexBuffers";
         var84[82] = "glVertexArrayAttribFormat";
         var84[83] = "glVertexArrayAttribIFormat";
         var84[84] = "glVertexArrayAttribLFormat";
         var84[85] = "glVertexArrayAttribBinding";
         var84[86] = "glVertexArrayBindingDivisor";
         var84[87] = "glGetVertexArrayiv";
         var84[88] = "glGetVertexArrayIndexediv";
         var84[89] = "glGetVertexArrayIndexed64iv";
         var84[90] = "glCreateSamplers";
         var84[91] = "glCreateProgramPipelines";
         var84[92] = "glCreateQueries";
         var84[93] = "glGetQueryBufferObjecti64v";
         var84[94] = "glGetQueryBufferObjectiv";
         var84[95] = "glGetQueryBufferObjectui64v";
         var84[96] = "glGetQueryBufferObjectuiv";
         return Checks.checkFunctions(var10000, var10001, var21, var84) || Checks.reportMissing("GL", "GL_ARB_direct_state_access");
      }
   }

   private static boolean check_ARB_draw_buffers(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_draw_buffers")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1137;
         String[] var4;
         (var4 = new String[1])[0] = "glDrawBuffersARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_draw_buffers");
      }
   }

   private static boolean check_ARB_draw_buffers_blend(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_draw_buffers_blend")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 1138;
         var10002[1] = 1139;
         var10002[2] = 1140;
         var10002[3] = 1141;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glBlendEquationiARB";
         var5[1] = "glBlendEquationSeparateiARB";
         var5[2] = "glBlendFunciARB";
         var5[3] = "glBlendFuncSeparateiARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_draw_buffers_blend");
      }
   }

   private static boolean check_ARB_draw_elements_base_vertex(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_draw_elements_base_vertex")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 648;
         var10002[1] = 649;
         var10002[2] = 650;
         var10002[3] = 651;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glDrawElementsBaseVertex";
         var5[1] = "glDrawRangeElementsBaseVertex";
         var5[2] = "glDrawElementsInstancedBaseVertex";
         var5[3] = "glMultiDrawElementsBaseVertex";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_draw_elements_base_vertex");
      }
   }

   private static boolean check_ARB_draw_indirect(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_draw_indirect")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 728;
         var10002[1] = 729;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glDrawArraysIndirect";
         var5[1] = "glDrawElementsIndirect";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_draw_indirect");
      }
   }

   private static boolean check_ARB_draw_instanced(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_draw_instanced")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1142;
         var10002[1] = 1143;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glDrawArraysInstancedARB";
         var5[1] = "glDrawElementsInstancedARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_draw_instanced");
      }
   }

   private static boolean check_ARB_ES2_compatibility(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_ES2_compatibility")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[5];
         var10002[0] = 770;
         var10002[1] = 771;
         var10002[2] = 772;
         var10002[3] = 773;
         var10002[4] = 774;
         String[] var4;
         String[] var5 = var4 = new String[5];
         var5[0] = "glReleaseShaderCompiler";
         var5[1] = "glShaderBinary";
         var5[2] = "glGetShaderPrecisionFormat";
         var5[3] = "glDepthRangef";
         var5[4] = "glClearDepthf";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_ES2_compatibility");
      }
   }

   private static boolean check_ARB_ES3_1_compatibility(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_ES3_1_compatibility")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1020;
         String[] var4;
         (var4 = new String[1])[0] = "glMemoryBarrierByRegion";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_ES3_1_compatibility");
      }
   }

   private static boolean check_ARB_ES3_2_compatibility(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_ES3_2_compatibility")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1144;
         String[] var4;
         (var4 = new String[1])[0] = "glPrimitiveBoundingBoxARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_ES3_2_compatibility");
      }
   }

   private static boolean check_ARB_framebuffer_no_attachments(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_framebuffer_no_attachments")) {
         return false;
      } else {
         int var5;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var3[0] = 885;
         var3[1] = 886;
         var3[2] = var5 + 1145;
         var10002[3] = var5 + 1146;
         String[] var4;
         String[] var6 = var4 = new String[4];
         var6[0] = "glFramebufferParameteri";
         var6[1] = "glGetFramebufferParameteriv";
         var6[2] = "glNamedFramebufferParameteriEXT";
         var6[3] = "glGetNamedFramebufferParameterivEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_framebuffer_no_attachments");
      }
   }

   private static boolean check_ARB_framebuffer_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_framebuffer_object")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[20])[0] = 595;
         var3[1] = 596;
         var3[2] = 597;
         var3[3] = 598;
         var3[4] = 599;
         var3[5] = 600;
         var3[6] = 601;
         var3[7] = 602;
         var3[8] = 603;
         var3[9] = 604;
         var3[10] = 605;
         var3[11] = 606;
         var3[12] = 607;
         var3[13] = 608;
         var3[14] = 609;
         var3[15] = 610;
         var3[16] = 611;
         var3[17] = 612;
         var3[18] = 613;
         var3[19] = 614;
         String[] var4;
         (var4 = new String[20])[0] = "glIsRenderbuffer";
         var4[1] = "glBindRenderbuffer";
         var4[2] = "glDeleteRenderbuffers";
         var4[3] = "glGenRenderbuffers";
         var4[4] = "glRenderbufferStorage";
         var4[5] = "glRenderbufferStorageMultisample";
         var4[6] = "glGetRenderbufferParameteriv";
         var4[7] = "glIsFramebuffer";
         var4[8] = "glBindFramebuffer";
         var4[9] = "glDeleteFramebuffers";
         var4[10] = "glGenFramebuffers";
         var4[11] = "glCheckFramebufferStatus";
         var4[12] = "glFramebufferTexture1D";
         var4[13] = "glFramebufferTexture2D";
         var4[14] = "glFramebufferTexture3D";
         var4[15] = "glFramebufferTextureLayer";
         var4[16] = "glFramebufferRenderbuffer";
         var4[17] = "glGetFramebufferAttachmentParameteriv";
         var4[18] = "glBlitFramebuffer";
         var4[19] = "glGenerateMipmap";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_framebuffer_object");
      }
   }

   private static boolean check_ARB_geometry_shader4(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_geometry_shader4")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 1147;
         var10002[1] = 1148;
         var10002[2] = 1149;
         var10002[3] = 1150;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glProgramParameteriARB";
         var5[1] = "glFramebufferTextureARB";
         var5[2] = "glFramebufferTextureLayerARB";
         var5[3] = "glFramebufferTextureFaceARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_geometry_shader4");
      }
   }

   private static boolean check_ARB_get_program_binary(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_get_program_binary")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 775;
         var10002[1] = 776;
         var10002[2] = 777;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glGetProgramBinary";
         var5[1] = "glProgramBinary";
         var5[2] = "glProgramParameteri";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_get_program_binary");
      }
   }

   private static boolean check_ARB_get_texture_sub_image(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_get_texture_sub_image")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1021;
         var10002[1] = 1022;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glGetTextureSubImage";
         var5[1] = "glGetCompressedTextureSubImage";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_get_texture_sub_image");
      }
   }

   private static boolean check_ARB_gl_spirv(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_gl_spirv")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1151;
         String[] var4;
         (var4 = new String[1])[0] = "glSpecializeShaderARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_gl_spirv");
      }
   }

   private static boolean check_ARB_gpu_shader_fp64(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_gpu_shader_fp64")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         var2.contains("GL_EXT_direct_state_access");
         int[] var3;
         int[] var10002 = var3 = new int[18];
         var10002[0] = 730;
         var10002[1] = 731;
         var10002[2] = 732;
         var10002[3] = 733;
         var10002[4] = 734;
         var10002[5] = 735;
         var10002[6] = 736;
         var10002[7] = 737;
         var10002[8] = 738;
         var10002[9] = 739;
         var10002[10] = 740;
         var10002[11] = 741;
         var10002[12] = 742;
         var10002[13] = 743;
         var10002[14] = 744;
         var10002[15] = 745;
         var10002[16] = 746;
         var10002[17] = 747;
         String[] var4;
         String[] var5 = var4 = new String[18];
         var5[0] = "glUniform1d";
         var5[1] = "glUniform2d";
         var5[2] = "glUniform3d";
         var5[3] = "glUniform4d";
         var5[4] = "glUniform1dv";
         var5[5] = "glUniform2dv";
         var5[6] = "glUniform3dv";
         var5[7] = "glUniform4dv";
         var5[8] = "glUniformMatrix2dv";
         var5[9] = "glUniformMatrix3dv";
         var5[10] = "glUniformMatrix4dv";
         var5[11] = "glUniformMatrix2x3dv";
         var5[12] = "glUniformMatrix2x4dv";
         var5[13] = "glUniformMatrix3x2dv";
         var5[14] = "glUniformMatrix3x4dv";
         var5[15] = "glUniformMatrix4x2dv";
         var5[16] = "glUniformMatrix4x3dv";
         var5[17] = "glGetUniformdv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_gpu_shader_fp64");
      }
   }

   private static boolean check_ARB_gpu_shader_int64(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_gpu_shader_int64")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[36])[0] = 1169;
         var3[1] = 1170;
         var3[2] = 1171;
         var3[3] = 1172;
         var3[4] = 1173;
         var3[5] = 1174;
         var3[6] = 1175;
         var3[7] = 1176;
         var3[8] = 1177;
         var3[9] = 1178;
         var3[10] = 1179;
         var3[11] = 1180;
         var3[12] = 1181;
         var3[13] = 1182;
         var3[14] = 1183;
         var3[15] = 1184;
         var3[16] = 1185;
         var3[17] = 1186;
         var3[18] = 1187;
         var3[19] = 1188;
         var3[20] = 1189;
         var3[21] = 1190;
         var3[22] = 1191;
         var3[23] = 1192;
         var3[24] = 1193;
         var3[25] = 1194;
         var3[26] = 1195;
         var3[27] = 1196;
         var3[28] = 1197;
         var3[29] = 1198;
         var3[30] = 1199;
         var3[31] = 1200;
         var3[32] = 1201;
         var3[33] = 1202;
         var3[34] = 1203;
         var3[35] = 1204;
         String[] var4;
         (var4 = new String[36])[0] = "glUniform1i64ARB";
         var4[1] = "glUniform1i64vARB";
         var4[2] = "glProgramUniform1i64ARB";
         var4[3] = "glProgramUniform1i64vARB";
         var4[4] = "glUniform2i64ARB";
         var4[5] = "glUniform2i64vARB";
         var4[6] = "glProgramUniform2i64ARB";
         var4[7] = "glProgramUniform2i64vARB";
         var4[8] = "glUniform3i64ARB";
         var4[9] = "glUniform3i64vARB";
         var4[10] = "glProgramUniform3i64ARB";
         var4[11] = "glProgramUniform3i64vARB";
         var4[12] = "glUniform4i64ARB";
         var4[13] = "glUniform4i64vARB";
         var4[14] = "glProgramUniform4i64ARB";
         var4[15] = "glProgramUniform4i64vARB";
         var4[16] = "glUniform1ui64ARB";
         var4[17] = "glUniform1ui64vARB";
         var4[18] = "glProgramUniform1ui64ARB";
         var4[19] = "glProgramUniform1ui64vARB";
         var4[20] = "glUniform2ui64ARB";
         var4[21] = "glUniform2ui64vARB";
         var4[22] = "glProgramUniform2ui64ARB";
         var4[23] = "glProgramUniform2ui64vARB";
         var4[24] = "glUniform3ui64ARB";
         var4[25] = "glUniform3ui64vARB";
         var4[26] = "glProgramUniform3ui64ARB";
         var4[27] = "glProgramUniform3ui64vARB";
         var4[28] = "glUniform4ui64ARB";
         var4[29] = "glUniform4ui64vARB";
         var4[30] = "glProgramUniform4ui64ARB";
         var4[31] = "glProgramUniform4ui64vARB";
         var4[32] = "glGetUniformi64vARB";
         var4[33] = "glGetUniformui64vARB";
         var4[34] = "glGetnUniformi64vARB";
         var4[35] = "glGetnUniformui64vARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_gpu_shader_int64");
      }
   }

   private static boolean check_ARB_imaging(FunctionProvider var0, PointerBuffer var1, Set var2, boolean var3) {
      if (!var2.contains("GL_ARB_imaging")) {
         return false;
      } else {
         boolean var8;
         label23: {
            label22: {
               if (!var3) {
                  int[] var6;
                  (var6 = new int[32])[0] = 1205;
                  var6[1] = 1206;
                  var6[2] = 1207;
                  var6[3] = 1208;
                  var6[4] = 1209;
                  var6[5] = 1210;
                  var6[6] = 1211;
                  var6[7] = 1212;
                  var6[8] = 1213;
                  var6[9] = 1214;
                  var6[10] = 1215;
                  var6[11] = 1216;
                  var6[12] = 1217;
                  var6[13] = 1218;
                  var6[14] = 1219;
                  var6[15] = 1220;
                  var6[16] = 1221;
                  var6[17] = 1222;
                  var6[18] = 1223;
                  var6[19] = 1224;
                  var6[20] = 1225;
                  var6[21] = 1226;
                  var6[22] = 1227;
                  var6[23] = 1228;
                  var6[24] = 1229;
                  var6[25] = 1230;
                  var6[26] = 1231;
                  var6[27] = 1232;
                  var6[28] = 1233;
                  var6[29] = 1234;
                  var6[30] = 1235;
                  var6[31] = 1236;
                  String[] var7;
                  (var7 = new String[32])[0] = "glColorTable";
                  var7[1] = "glCopyColorTable";
                  var7[2] = "glColorTableParameteriv";
                  var7[3] = "glColorTableParameterfv";
                  var7[4] = "glGetColorTable";
                  var7[5] = "glGetColorTableParameteriv";
                  var7[6] = "glGetColorTableParameterfv";
                  var7[7] = "glColorSubTable";
                  var7[8] = "glCopyColorSubTable";
                  var7[9] = "glConvolutionFilter1D";
                  var7[10] = "glConvolutionFilter2D";
                  var7[11] = "glCopyConvolutionFilter1D";
                  var7[12] = "glCopyConvolutionFilter2D";
                  var7[13] = "glGetConvolutionFilter";
                  var7[14] = "glSeparableFilter2D";
                  var7[15] = "glGetSeparableFilter";
                  var7[16] = "glConvolutionParameteri";
                  var7[17] = "glConvolutionParameteriv";
                  var7[18] = "glConvolutionParameterf";
                  var7[19] = "glConvolutionParameterfv";
                  var7[20] = "glGetConvolutionParameteriv";
                  var7[21] = "glGetConvolutionParameterfv";
                  var7[22] = "glHistogram";
                  var7[23] = "glResetHistogram";
                  var7[24] = "glGetHistogram";
                  var7[25] = "glGetHistogramParameteriv";
                  var7[26] = "glGetHistogramParameterfv";
                  var7[27] = "glMinmax";
                  var7[28] = "glResetMinmax";
                  var7[29] = "glGetMinmax";
                  var7[30] = "glGetMinmaxParameteriv";
                  var7[31] = "glGetMinmaxParameterfv";
                  if (!Checks.checkFunctions(var0, var1, var6, var7)) {
                     break label22;
                  }
               }

               FunctionProvider var10000 = var0;
               PointerBuffer var10001 = var1;
               int[] var4;
               int[] var10002 = var4 = new int[2];
               var10002[0] = 386;
               var10002[1] = 387;
               String[] var5;
               String[] var9 = var5 = new String[2];
               var9[0] = "glBlendColor";
               var9[1] = "glBlendEquation";
               if (Checks.checkFunctions(var10000, var10001, var4, var5)) {
                  break label23;
               }
            }

            if (!Checks.reportMissing("GL", "GL_ARB_imaging")) {
               var8 = false;
               return var8;
            }
         }

         var8 = true;
         return var8;
      }
   }

   private static boolean check_ARB_indirect_parameters(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_indirect_parameters")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1237;
         var10002[1] = 1238;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glMultiDrawArraysIndirectCountARB";
         var5[1] = "glMultiDrawElementsIndirectCountARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_indirect_parameters");
      }
   }

   private static boolean check_ARB_instanced_arrays(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_instanced_arrays")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         var2.contains("GL_EXT_direct_state_access");
         int[] var3;
         (var3 = new int[1])[0] = 1239;
         String[] var4;
         (var4 = new String[1])[0] = "glVertexAttribDivisorARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_instanced_arrays");
      }
   }

   private static boolean check_ARB_internalformat_query(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_internalformat_query")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 869;
         String[] var4;
         (var4 = new String[1])[0] = "glGetInternalformativ";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_internalformat_query");
      }
   }

   private static boolean check_ARB_internalformat_query2(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_internalformat_query2")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 887;
         String[] var4;
         (var4 = new String[1])[0] = "glGetInternalformati64v";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_internalformat_query2");
      }
   }

   private static boolean check_ARB_invalidate_subdata(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_invalidate_subdata")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 888;
         var10002[1] = 889;
         var10002[2] = 890;
         var10002[3] = 891;
         var10002[4] = 892;
         var10002[5] = 893;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glInvalidateTexSubImage";
         var5[1] = "glInvalidateTexImage";
         var5[2] = "glInvalidateBufferSubData";
         var5[3] = "glInvalidateBufferData";
         var5[4] = "glInvalidateFramebuffer";
         var5[5] = "glInvalidateSubFramebuffer";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_invalidate_subdata");
      }
   }

   private static boolean check_ARB_map_buffer_range(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_map_buffer_range")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 592;
         var10002[1] = 593;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glMapBufferRange";
         var5[1] = "glFlushMappedBufferRange";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_map_buffer_range");
      }
   }

   private static boolean check_ARB_matrix_palette(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_matrix_palette")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[5];
         var10002[0] = 1241;
         var10002[1] = 1242;
         var10002[2] = 1243;
         var10002[3] = 1244;
         var10002[4] = 1245;
         String[] var4;
         String[] var5 = var4 = new String[5];
         var5[0] = "glCurrentPaletteMatrixARB";
         var5[1] = "glMatrixIndexuivARB";
         var5[2] = "glMatrixIndexubvARB";
         var5[3] = "glMatrixIndexusvARB";
         var5[4] = "glMatrixIndexPointerARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_matrix_palette");
      }
   }

   private static boolean check_ARB_multi_bind(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_multi_bind")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 916;
         var10002[1] = 917;
         var10002[2] = 918;
         var10002[3] = 919;
         var10002[4] = 920;
         var10002[5] = 921;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glBindBuffersBase";
         var5[1] = "glBindBuffersRange";
         var5[2] = "glBindTextures";
         var5[3] = "glBindSamplers";
         var5[4] = "glBindImageTextures";
         var5[5] = "glBindVertexBuffers";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_multi_bind");
      }
   }

   private static boolean check_ARB_multi_draw_indirect(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_multi_draw_indirect")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 894;
         var10002[1] = 895;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glMultiDrawArraysIndirect";
         var5[1] = "glMultiDrawElementsIndirect";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_multi_draw_indirect");
      }
   }

   private static boolean check_ARB_multisample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_multisample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1246;
         String[] var4;
         (var4 = new String[1])[0] = "glSampleCoverageARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_multisample");
      }
   }

   private static boolean check_ARB_multitexture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_multitexture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[34])[0] = 1247;
         var3[1] = 1248;
         var3[2] = 1249;
         var3[3] = 1250;
         var3[4] = 1251;
         var3[5] = 1252;
         var3[6] = 1253;
         var3[7] = 1254;
         var3[8] = 1255;
         var3[9] = 1256;
         var3[10] = 1257;
         var3[11] = 1258;
         var3[12] = 1259;
         var3[13] = 1260;
         var3[14] = 1261;
         var3[15] = 1262;
         var3[16] = 1263;
         var3[17] = 1264;
         var3[18] = 1265;
         var3[19] = 1266;
         var3[20] = 1267;
         var3[21] = 1268;
         var3[22] = 1269;
         var3[23] = 1270;
         var3[24] = 1271;
         var3[25] = 1272;
         var3[26] = 1273;
         var3[27] = 1274;
         var3[28] = 1275;
         var3[29] = 1276;
         var3[30] = 1277;
         var3[31] = 1278;
         var3[32] = 1279;
         var3[33] = 1280;
         String[] var4;
         (var4 = new String[34])[0] = "glActiveTextureARB";
         var4[1] = "glClientActiveTextureARB";
         var4[2] = "glMultiTexCoord1fARB";
         var4[3] = "glMultiTexCoord1sARB";
         var4[4] = "glMultiTexCoord1iARB";
         var4[5] = "glMultiTexCoord1dARB";
         var4[6] = "glMultiTexCoord1fvARB";
         var4[7] = "glMultiTexCoord1svARB";
         var4[8] = "glMultiTexCoord1ivARB";
         var4[9] = "glMultiTexCoord1dvARB";
         var4[10] = "glMultiTexCoord2fARB";
         var4[11] = "glMultiTexCoord2sARB";
         var4[12] = "glMultiTexCoord2iARB";
         var4[13] = "glMultiTexCoord2dARB";
         var4[14] = "glMultiTexCoord2fvARB";
         var4[15] = "glMultiTexCoord2svARB";
         var4[16] = "glMultiTexCoord2ivARB";
         var4[17] = "glMultiTexCoord2dvARB";
         var4[18] = "glMultiTexCoord3fARB";
         var4[19] = "glMultiTexCoord3sARB";
         var4[20] = "glMultiTexCoord3iARB";
         var4[21] = "glMultiTexCoord3dARB";
         var4[22] = "glMultiTexCoord3fvARB";
         var4[23] = "glMultiTexCoord3svARB";
         var4[24] = "glMultiTexCoord3ivARB";
         var4[25] = "glMultiTexCoord3dvARB";
         var4[26] = "glMultiTexCoord4fARB";
         var4[27] = "glMultiTexCoord4sARB";
         var4[28] = "glMultiTexCoord4iARB";
         var4[29] = "glMultiTexCoord4dARB";
         var4[30] = "glMultiTexCoord4fvARB";
         var4[31] = "glMultiTexCoord4svARB";
         var4[32] = "glMultiTexCoord4ivARB";
         var4[33] = "glMultiTexCoord4dvARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_multitexture");
      }
   }

   private static boolean check_ARB_occlusion_query(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_occlusion_query")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[8];
         var10002[0] = 1281;
         var10002[1] = 1282;
         var10002[2] = 1283;
         var10002[3] = 1284;
         var10002[4] = 1285;
         var10002[5] = 1286;
         var10002[6] = 1287;
         var10002[7] = 1288;
         String[] var4;
         String[] var5 = var4 = new String[8];
         var5[0] = "glGenQueriesARB";
         var5[1] = "glDeleteQueriesARB";
         var5[2] = "glIsQueryARB";
         var5[3] = "glBeginQueryARB";
         var5[4] = "glEndQueryARB";
         var5[5] = "glGetQueryivARB";
         var5[6] = "glGetQueryObjectivARB";
         var5[7] = "glGetQueryObjectuivARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_occlusion_query");
      }
   }

   private static boolean check_ARB_parallel_shader_compile(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_parallel_shader_compile")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1289;
         String[] var4;
         (var4 = new String[1])[0] = "glMaxShaderCompilerThreadsARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_parallel_shader_compile");
      }
   }

   private static boolean check_ARB_point_parameters(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_point_parameters")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1290;
         var10002[1] = 1291;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glPointParameterfARB";
         var5[1] = "glPointParameterfvARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_point_parameters");
      }
   }

   private static boolean check_ARB_polygon_offset_clamp(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_polygon_offset_clamp")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1046;
         String[] var4;
         (var4 = new String[1])[0] = "glPolygonOffsetClamp";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_polygon_offset_clamp");
      }
   }

   private static boolean check_ARB_program_interface_query(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_program_interface_query")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 896;
         var10002[1] = 897;
         var10002[2] = 898;
         var10002[3] = 899;
         var10002[4] = 900;
         var10002[5] = 901;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glGetProgramInterfaceiv";
         var5[1] = "glGetProgramResourceIndex";
         var5[2] = "glGetProgramResourceName";
         var5[3] = "glGetProgramResourceiv";
         var5[4] = "glGetProgramResourceLocation";
         var5[5] = "glGetProgramResourceLocationIndex";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_program_interface_query");
      }
   }

   private static boolean check_ARB_provoking_vertex(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_provoking_vertex")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 652;
         String[] var4;
         (var4 = new String[1])[0] = "glProvokingVertex";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_provoking_vertex");
      }
   }

   private static boolean check_ARB_robustness(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_robustness")) {
         return false;
      } else {
         int var3;
         if (var0.getFunctionAddress("glGetMapdv") != 0L) {
            var3 = 0;
         } else {
            var3 = Integer.MIN_VALUE;
         }

         int var4;
         if (var0.getFunctionAddress("glGetMapfv") != 0L) {
            var4 = 0;
         } else {
            var4 = Integer.MIN_VALUE;
         }

         int var5;
         if (var0.getFunctionAddress("glGetMapiv") != 0L) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         int var6;
         if (var0.getFunctionAddress("glGetPixelMapfv") != 0L) {
            var6 = 0;
         } else {
            var6 = Integer.MIN_VALUE;
         }

         int var7;
         if (var0.getFunctionAddress("glGetPixelMapuiv") != 0L) {
            var7 = 0;
         } else {
            var7 = Integer.MIN_VALUE;
         }

         int var8;
         if (var0.getFunctionAddress("glGetPixelMapusv") != 0L) {
            var8 = 0;
         } else {
            var8 = Integer.MIN_VALUE;
         }

         int var9;
         if (var0.getFunctionAddress("glGetPolygonStipple") != 0L) {
            var9 = 0;
         } else {
            var9 = Integer.MIN_VALUE;
         }

         int var10;
         if (var2.contains("GL_ARB_imaging") && var0.getFunctionAddress("glGetColorTable") != 0L) {
            var10 = 0;
         } else {
            var10 = Integer.MIN_VALUE;
         }

         int var11;
         if (var2.contains("GL_ARB_imaging") && var0.getFunctionAddress("glGetConvolutionFilter") != 0L) {
            var11 = 0;
         } else {
            var11 = Integer.MIN_VALUE;
         }

         int var12;
         if (var2.contains("GL_ARB_imaging") && var0.getFunctionAddress("glGetSeparableFilter") != 0L) {
            var12 = 0;
         } else {
            var12 = Integer.MIN_VALUE;
         }

         int var13;
         if (var2.contains("GL_ARB_imaging") && var0.getFunctionAddress("glGetHistogram") != 0L) {
            var13 = 0;
         } else {
            var13 = Integer.MIN_VALUE;
         }

         int var14;
         if (var2.contains("GL_ARB_imaging") && var0.getFunctionAddress("glGetMinmax") != 0L) {
            var14 = 0;
         } else {
            var14 = Integer.MIN_VALUE;
         }

         int var15;
         if (var2.contains("OpenGL13")) {
            var15 = 0;
         } else {
            var15 = Integer.MIN_VALUE;
         }

         int var16;
         if (var2.contains("OpenGL20")) {
            var16 = 0;
         } else {
            var16 = Integer.MIN_VALUE;
         }

         int var17;
         if (var2.contains("OpenGL30")) {
            var17 = 0;
         } else {
            var17 = Integer.MIN_VALUE;
         }

         int var37;
         if (var2.contains("OpenGL40")) {
            var37 = 0;
         } else {
            var37 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var18;
         (var18 = new int[20])[0] = 1292;
         int var19 = var3 + 1293;
         var18[1] = var19;
         var19 = var4 + 1294;
         var18[2] = var19;
         var19 = var5 + 1295;
         var18[3] = var19;
         var19 = var6 + 1296;
         var18[4] = var19;
         var19 = var7 + 1297;
         var18[5] = var19;
         var19 = var8 + 1298;
         var18[6] = var19;
         var19 = var9 + 1299;
         var18[7] = var19;
         var18[8] = 1300;
         var18[9] = 1301;
         var19 = var10 + 1302;
         var18[10] = var19;
         var19 = var11 + 1303;
         var18[11] = var19;
         var19 = var12 + 1304;
         var18[12] = var19;
         var19 = var13 + 1305;
         var18[13] = var19;
         var19 = var14 + 1306;
         var18[14] = var19;
         var19 = var15 + 1307;
         var18[15] = var19;
         var19 = var16 + 1308;
         var18[16] = var19;
         var19 = var16 + 1309;
         var18[17] = var19;
         var19 = var17 + 1310;
         var18[18] = var19;
         var19 = var37 + 1311;
         var18[19] = var19;
         String[] var36;
         (var36 = new String[20])[0] = "glGetGraphicsResetStatusARB";
         var36[1] = "glGetnMapdvARB";
         var36[2] = "glGetnMapfvARB";
         var36[3] = "glGetnMapivARB";
         var36[4] = "glGetnPixelMapfvARB";
         var36[5] = "glGetnPixelMapuivARB";
         var36[6] = "glGetnPixelMapusvARB";
         var36[7] = "glGetnPolygonStippleARB";
         var36[8] = "glGetnTexImageARB";
         var36[9] = "glReadnPixelsARB";
         var36[10] = "glGetnColorTableARB";
         var36[11] = "glGetnConvolutionFilterARB";
         var36[12] = "glGetnSeparableFilterARB";
         var36[13] = "glGetnHistogramARB";
         var36[14] = "glGetnMinmaxARB";
         var36[15] = "glGetnCompressedTexImageARB";
         var36[16] = "glGetnUniformfvARB";
         var36[17] = "glGetnUniformivARB";
         var36[18] = "glGetnUniformuivARB";
         var36[19] = "glGetnUniformdvARB";
         return Checks.checkFunctions(var10000, var10001, var18, var36) || Checks.reportMissing("GL", "GL_ARB_robustness");
      }
   }

   private static boolean check_ARB_sample_locations(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_sample_locations")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 1312;
         var10002[1] = 1313;
         var10002[2] = 1314;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glFramebufferSampleLocationsfvARB";
         var5[1] = "glNamedFramebufferSampleLocationsfvARB";
         var5[2] = "glEvaluateDepthValuesARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_sample_locations");
      }
   }

   private static boolean check_ARB_sample_shading(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_sample_shading")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1315;
         String[] var4;
         (var4 = new String[1])[0] = "glMinSampleShadingARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_sample_shading");
      }
   }

   private static boolean check_ARB_sampler_objects(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_sampler_objects")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[14];
         var10002[0] = 668;
         var10002[1] = 669;
         var10002[2] = 670;
         var10002[3] = 671;
         var10002[4] = 672;
         var10002[5] = 673;
         var10002[6] = 674;
         var10002[7] = 675;
         var10002[8] = 676;
         var10002[9] = 677;
         var10002[10] = 678;
         var10002[11] = 679;
         var10002[12] = 680;
         var10002[13] = 681;
         String[] var4;
         String[] var5 = var4 = new String[14];
         var5[0] = "glGenSamplers";
         var5[1] = "glDeleteSamplers";
         var5[2] = "glIsSampler";
         var5[3] = "glBindSampler";
         var5[4] = "glSamplerParameteri";
         var5[5] = "glSamplerParameterf";
         var5[6] = "glSamplerParameteriv";
         var5[7] = "glSamplerParameterfv";
         var5[8] = "glSamplerParameterIiv";
         var5[9] = "glSamplerParameterIuiv";
         var5[10] = "glGetSamplerParameteriv";
         var5[11] = "glGetSamplerParameterfv";
         var5[12] = "glGetSamplerParameterIiv";
         var5[13] = "glGetSamplerParameterIuiv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_sampler_objects");
      }
   }

   private static boolean check_ARB_separate_shader_objects(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_separate_shader_objects")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[61])[0] = 778;
         var3[1] = 779;
         var3[2] = 780;
         var3[3] = 781;
         var3[4] = 782;
         var3[5] = 783;
         var3[6] = 784;
         var3[7] = 777;
         var3[8] = 785;
         var3[9] = 786;
         var3[10] = 787;
         var3[11] = 788;
         var3[12] = 789;
         var3[13] = 790;
         var3[14] = 791;
         var3[15] = 792;
         var3[16] = 793;
         var3[17] = 794;
         var3[18] = 795;
         var3[19] = 796;
         var3[20] = 797;
         var3[21] = 798;
         var3[22] = 799;
         var3[23] = 800;
         var3[24] = 801;
         var3[25] = 802;
         var3[26] = 803;
         var3[27] = 804;
         var3[28] = 805;
         var3[29] = 806;
         var3[30] = 807;
         var3[31] = 808;
         var3[32] = 809;
         var3[33] = 810;
         var3[34] = 811;
         var3[35] = 812;
         var3[36] = 813;
         var3[37] = 814;
         var3[38] = 815;
         var3[39] = 816;
         var3[40] = 817;
         var3[41] = 818;
         var3[42] = 819;
         var3[43] = 820;
         var3[44] = 821;
         var3[45] = 822;
         var3[46] = 823;
         var3[47] = 824;
         var3[48] = 825;
         var3[49] = 826;
         var3[50] = 827;
         var3[51] = 828;
         var3[52] = 829;
         var3[53] = 830;
         var3[54] = 831;
         var3[55] = 832;
         var3[56] = 833;
         var3[57] = 834;
         var3[58] = 835;
         var3[59] = 836;
         var3[60] = 837;
         String[] var4;
         (var4 = new String[61])[0] = "glUseProgramStages";
         var4[1] = "glActiveShaderProgram";
         var4[2] = "glCreateShaderProgramv";
         var4[3] = "glBindProgramPipeline";
         var4[4] = "glDeleteProgramPipelines";
         var4[5] = "glGenProgramPipelines";
         var4[6] = "glIsProgramPipeline";
         var4[7] = "glProgramParameteri";
         var4[8] = "glGetProgramPipelineiv";
         var4[9] = "glProgramUniform1i";
         var4[10] = "glProgramUniform2i";
         var4[11] = "glProgramUniform3i";
         var4[12] = "glProgramUniform4i";
         var4[13] = "glProgramUniform1ui";
         var4[14] = "glProgramUniform2ui";
         var4[15] = "glProgramUniform3ui";
         var4[16] = "glProgramUniform4ui";
         var4[17] = "glProgramUniform1f";
         var4[18] = "glProgramUniform2f";
         var4[19] = "glProgramUniform3f";
         var4[20] = "glProgramUniform4f";
         var4[21] = "glProgramUniform1d";
         var4[22] = "glProgramUniform2d";
         var4[23] = "glProgramUniform3d";
         var4[24] = "glProgramUniform4d";
         var4[25] = "glProgramUniform1iv";
         var4[26] = "glProgramUniform2iv";
         var4[27] = "glProgramUniform3iv";
         var4[28] = "glProgramUniform4iv";
         var4[29] = "glProgramUniform1uiv";
         var4[30] = "glProgramUniform2uiv";
         var4[31] = "glProgramUniform3uiv";
         var4[32] = "glProgramUniform4uiv";
         var4[33] = "glProgramUniform1fv";
         var4[34] = "glProgramUniform2fv";
         var4[35] = "glProgramUniform3fv";
         var4[36] = "glProgramUniform4fv";
         var4[37] = "glProgramUniform1dv";
         var4[38] = "glProgramUniform2dv";
         var4[39] = "glProgramUniform3dv";
         var4[40] = "glProgramUniform4dv";
         var4[41] = "glProgramUniformMatrix2fv";
         var4[42] = "glProgramUniformMatrix3fv";
         var4[43] = "glProgramUniformMatrix4fv";
         var4[44] = "glProgramUniformMatrix2dv";
         var4[45] = "glProgramUniformMatrix3dv";
         var4[46] = "glProgramUniformMatrix4dv";
         var4[47] = "glProgramUniformMatrix2x3fv";
         var4[48] = "glProgramUniformMatrix3x2fv";
         var4[49] = "glProgramUniformMatrix2x4fv";
         var4[50] = "glProgramUniformMatrix4x2fv";
         var4[51] = "glProgramUniformMatrix3x4fv";
         var4[52] = "glProgramUniformMatrix4x3fv";
         var4[53] = "glProgramUniformMatrix2x3dv";
         var4[54] = "glProgramUniformMatrix3x2dv";
         var4[55] = "glProgramUniformMatrix2x4dv";
         var4[56] = "glProgramUniformMatrix4x2dv";
         var4[57] = "glProgramUniformMatrix3x4dv";
         var4[58] = "glProgramUniformMatrix4x3dv";
         var4[59] = "glValidateProgramPipeline";
         var4[60] = "glGetProgramPipelineInfoLog";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_separate_shader_objects");
      }
   }

   private static boolean check_ARB_shader_atomic_counters(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_shader_atomic_counters")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 858;
         String[] var4;
         (var4 = new String[1])[0] = "glGetActiveAtomicCounterBufferiv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_shader_atomic_counters");
      }
   }

   private static boolean check_ARB_shader_image_load_store(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_shader_image_load_store")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 867;
         var10002[1] = 868;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glBindImageTexture";
         var5[1] = "glMemoryBarrier";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_shader_image_load_store");
      }
   }

   private static boolean check_ARB_shader_objects(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_shader_objects")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[39])[0] = 1316;
         var3[1] = 1317;
         var3[2] = 1318;
         var3[3] = 1319;
         var3[4] = 1320;
         var3[5] = 1321;
         var3[6] = 1322;
         var3[7] = 1323;
         var3[8] = 1324;
         var3[9] = 1325;
         var3[10] = 1326;
         var3[11] = 1327;
         var3[12] = 1328;
         var3[13] = 1329;
         var3[14] = 1330;
         var3[15] = 1331;
         var3[16] = 1332;
         var3[17] = 1333;
         var3[18] = 1334;
         var3[19] = 1335;
         var3[20] = 1336;
         var3[21] = 1337;
         var3[22] = 1338;
         var3[23] = 1339;
         var3[24] = 1340;
         var3[25] = 1341;
         var3[26] = 1342;
         var3[27] = 1343;
         var3[28] = 1344;
         var3[29] = 1345;
         var3[30] = 1346;
         var3[31] = 1347;
         var3[32] = 1348;
         var3[33] = 1349;
         var3[34] = 1350;
         var3[35] = 1351;
         var3[36] = 1352;
         var3[37] = 1353;
         var3[38] = 1354;
         String[] var4;
         (var4 = new String[39])[0] = "glDeleteObjectARB";
         var4[1] = "glGetHandleARB";
         var4[2] = "glDetachObjectARB";
         var4[3] = "glCreateShaderObjectARB";
         var4[4] = "glShaderSourceARB";
         var4[5] = "glCompileShaderARB";
         var4[6] = "glCreateProgramObjectARB";
         var4[7] = "glAttachObjectARB";
         var4[8] = "glLinkProgramARB";
         var4[9] = "glUseProgramObjectARB";
         var4[10] = "glValidateProgramARB";
         var4[11] = "glUniform1fARB";
         var4[12] = "glUniform2fARB";
         var4[13] = "glUniform3fARB";
         var4[14] = "glUniform4fARB";
         var4[15] = "glUniform1iARB";
         var4[16] = "glUniform2iARB";
         var4[17] = "glUniform3iARB";
         var4[18] = "glUniform4iARB";
         var4[19] = "glUniform1fvARB";
         var4[20] = "glUniform2fvARB";
         var4[21] = "glUniform3fvARB";
         var4[22] = "glUniform4fvARB";
         var4[23] = "glUniform1ivARB";
         var4[24] = "glUniform2ivARB";
         var4[25] = "glUniform3ivARB";
         var4[26] = "glUniform4ivARB";
         var4[27] = "glUniformMatrix2fvARB";
         var4[28] = "glUniformMatrix3fvARB";
         var4[29] = "glUniformMatrix4fvARB";
         var4[30] = "glGetObjectParameterfvARB";
         var4[31] = "glGetObjectParameterivARB";
         var4[32] = "glGetInfoLogARB";
         var4[33] = "glGetAttachedObjectsARB";
         var4[34] = "glGetUniformLocationARB";
         var4[35] = "glGetActiveUniformARB";
         var4[36] = "glGetUniformfvARB";
         var4[37] = "glGetUniformivARB";
         var4[38] = "glGetShaderSourceARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_shader_objects");
      }
   }

   private static boolean check_ARB_shader_storage_buffer_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_shader_storage_buffer_object")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 902;
         String[] var4;
         (var4 = new String[1])[0] = "glShaderStorageBlockBinding";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_shader_storage_buffer_object");
      }
   }

   private static boolean check_ARB_shader_subroutine(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_shader_subroutine")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[8];
         var10002[0] = 749;
         var10002[1] = 750;
         var10002[2] = 751;
         var10002[3] = 752;
         var10002[4] = 753;
         var10002[5] = 754;
         var10002[6] = 755;
         var10002[7] = 756;
         String[] var4;
         String[] var5 = var4 = new String[8];
         var5[0] = "glGetSubroutineUniformLocation";
         var5[1] = "glGetSubroutineIndex";
         var5[2] = "glGetActiveSubroutineUniformiv";
         var5[3] = "glGetActiveSubroutineUniformName";
         var5[4] = "glGetActiveSubroutineName";
         var5[5] = "glUniformSubroutinesuiv";
         var5[6] = "glGetUniformSubroutineuiv";
         var5[7] = "glGetProgramStageiv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_shader_subroutine");
      }
   }

   private static boolean check_ARB_shading_language_include(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_shading_language_include")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 1355;
         var10002[1] = 1356;
         var10002[2] = 1357;
         var10002[3] = 1358;
         var10002[4] = 1359;
         var10002[5] = 1360;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glNamedStringARB";
         var5[1] = "glDeleteNamedStringARB";
         var5[2] = "glCompileShaderIncludeARB";
         var5[3] = "glIsNamedStringARB";
         var5[4] = "glGetNamedStringARB";
         var5[5] = "glGetNamedStringivARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_shading_language_include");
      }
   }

   private static boolean check_ARB_sparse_buffer(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_sparse_buffer")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         var2.contains("GL_EXT_direct_state_access");
         var2.contains("GL_ARB_direct_state_access");
         int[] var3;
         (var3 = new int[1])[0] = 1361;
         String[] var4;
         (var4 = new String[1])[0] = "glBufferPageCommitmentARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_sparse_buffer");
      }
   }

   private static boolean check_ARB_sparse_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_sparse_texture")) {
         return false;
      } else {
         int var5;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var3[0] = 1364;
         var10002[1] = var5 + 1365;
         String[] var4;
         String[] var6 = var4 = new String[2];
         var6[0] = "glTexPageCommitmentARB";
         var6[1] = "glTexturePageCommitmentEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_sparse_texture");
      }
   }

   private static boolean check_ARB_sync(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_sync")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[7];
         var10002[0] = 658;
         var10002[1] = 659;
         var10002[2] = 660;
         var10002[3] = 661;
         var10002[4] = 662;
         var10002[5] = 663;
         var10002[6] = 665;
         String[] var4;
         String[] var5 = var4 = new String[7];
         var5[0] = "glFenceSync";
         var5[1] = "glIsSync";
         var5[2] = "glDeleteSync";
         var5[3] = "glClientWaitSync";
         var5[4] = "glWaitSync";
         var5[5] = "glGetInteger64v";
         var5[6] = "glGetSynciv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_sync");
      }
   }

   private static boolean check_ARB_tessellation_shader(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_tessellation_shader")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 757;
         var10002[1] = 758;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glPatchParameteri";
         var5[1] = "glPatchParameterfv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_tessellation_shader");
      }
   }

   private static boolean check_ARB_texture_barrier(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_texture_barrier")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1023;
         String[] var4;
         (var4 = new String[1])[0] = "glTextureBarrier";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_texture_barrier");
      }
   }

   private static boolean check_ARB_texture_buffer_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_texture_buffer_object")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1366;
         String[] var4;
         (var4 = new String[1])[0] = "glTexBufferARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_texture_buffer_object");
      }
   }

   private static boolean check_ARB_texture_buffer_range(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_texture_buffer_range")) {
         return false;
      } else {
         int var5;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var3[0] = 903;
         var10002[1] = var5 + 1367;
         String[] var4;
         String[] var6 = var4 = new String[2];
         var6[0] = "glTexBufferRange";
         var6[1] = "glTextureBufferRangeEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_texture_buffer_range");
      }
   }

   private static boolean check_ARB_texture_compression(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_texture_compression")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[7];
         var10002[0] = 1368;
         var10002[1] = 1369;
         var10002[2] = 1370;
         var10002[3] = 1371;
         var10002[4] = 1372;
         var10002[5] = 1373;
         var10002[6] = 1374;
         String[] var4;
         String[] var5 = var4 = new String[7];
         var5[0] = "glCompressedTexImage3DARB";
         var5[1] = "glCompressedTexImage2DARB";
         var5[2] = "glCompressedTexImage1DARB";
         var5[3] = "glCompressedTexSubImage3DARB";
         var5[4] = "glCompressedTexSubImage2DARB";
         var5[5] = "glCompressedTexSubImage1DARB";
         var5[6] = "glGetCompressedTexImageARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_texture_compression");
      }
   }

   private static boolean check_ARB_texture_multisample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_texture_multisample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 653;
         var10002[1] = 654;
         var10002[2] = 655;
         var10002[3] = 656;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glTexImage2DMultisample";
         var5[1] = "glTexImage3DMultisample";
         var5[2] = "glGetMultisamplefv";
         var5[3] = "glSampleMaski";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_texture_multisample");
      }
   }

   private static boolean check_ARB_texture_storage(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_texture_storage")) {
         return false;
      } else {
         int var5;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var3[0] = 859;
         var3[1] = 860;
         var3[2] = 861;
         var3[3] = var5 + 1375;
         var3[4] = var5 + 1376;
         var10002[5] = var5 + 1377;
         String[] var4;
         String[] var6 = var4 = new String[6];
         var6[0] = "glTexStorage1D";
         var6[1] = "glTexStorage2D";
         var6[2] = "glTexStorage3D";
         var6[3] = "glTextureStorage1DEXT";
         var6[4] = "glTextureStorage2DEXT";
         var6[5] = "glTextureStorage3DEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_texture_storage");
      }
   }

   private static boolean check_ARB_texture_storage_multisample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_texture_storage_multisample")) {
         return false;
      } else {
         int var5;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var3[0] = 904;
         var3[1] = 905;
         var3[2] = var5 + 1378;
         var10002[3] = var5 + 1379;
         String[] var4;
         String[] var6 = var4 = new String[4];
         var6[0] = "glTexStorage2DMultisample";
         var6[1] = "glTexStorage3DMultisample";
         var6[2] = "glTextureStorage2DMultisampleEXT";
         var6[3] = "glTextureStorage3DMultisampleEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_texture_storage_multisample");
      }
   }

   private static boolean check_ARB_texture_view(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_texture_view")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 906;
         String[] var4;
         (var4 = new String[1])[0] = "glTextureView";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_texture_view");
      }
   }

   private static boolean check_ARB_timer_query(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_timer_query")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 682;
         var10002[1] = 683;
         var10002[2] = 684;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glQueryCounter";
         var5[1] = "glGetQueryObjecti64v";
         var5[2] = "glGetQueryObjectui64v";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_timer_query");
      }
   }

   private static boolean check_ARB_transform_feedback2(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_transform_feedback2")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[7];
         var10002[0] = 759;
         var10002[1] = 760;
         var10002[2] = 761;
         var10002[3] = 762;
         var10002[4] = 763;
         var10002[5] = 764;
         var10002[6] = 765;
         String[] var4;
         String[] var5 = var4 = new String[7];
         var5[0] = "glBindTransformFeedback";
         var5[1] = "glDeleteTransformFeedbacks";
         var5[2] = "glGenTransformFeedbacks";
         var5[3] = "glIsTransformFeedback";
         var5[4] = "glPauseTransformFeedback";
         var5[5] = "glResumeTransformFeedback";
         var5[6] = "glDrawTransformFeedback";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_transform_feedback2");
      }
   }

   private static boolean check_ARB_transform_feedback3(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_transform_feedback3")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 766;
         var10002[1] = 767;
         var10002[2] = 768;
         var10002[3] = 769;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glDrawTransformFeedbackStream";
         var5[1] = "glBeginQueryIndexed";
         var5[2] = "glEndQueryIndexed";
         var5[3] = "glGetQueryIndexediv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_transform_feedback3");
      }
   }

   private static boolean check_ARB_transform_feedback_instanced(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_transform_feedback_instanced")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 862;
         var10002[1] = 863;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glDrawTransformFeedbackInstanced";
         var5[1] = "glDrawTransformFeedbackStreamInstanced";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_transform_feedback_instanced");
      }
   }

   private static boolean check_ARB_transpose_matrix(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_transpose_matrix")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 1380;
         var10002[1] = 1381;
         var10002[2] = 1382;
         var10002[3] = 1383;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glLoadTransposeMatrixfARB";
         var5[1] = "glLoadTransposeMatrixdARB";
         var5[2] = "glMultTransposeMatrixfARB";
         var5[3] = "glMultTransposeMatrixdARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_transpose_matrix");
      }
   }

   private static boolean check_ARB_uniform_buffer_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_uniform_buffer_object")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[10];
         var10002[0] = 640;
         var10002[1] = 641;
         var10002[2] = 642;
         var10002[3] = 643;
         var10002[4] = 644;
         var10002[5] = 645;
         var10002[6] = 625;
         var10002[7] = 626;
         var10002[8] = 621;
         var10002[9] = 646;
         String[] var4;
         String[] var5 = var4 = new String[10];
         var5[0] = "glGetUniformIndices";
         var5[1] = "glGetActiveUniformsiv";
         var5[2] = "glGetActiveUniformName";
         var5[3] = "glGetUniformBlockIndex";
         var5[4] = "glGetActiveUniformBlockiv";
         var5[5] = "glGetActiveUniformBlockName";
         var5[6] = "glBindBufferRange";
         var5[7] = "glBindBufferBase";
         var5[8] = "glGetIntegeri_v";
         var5[9] = "glUniformBlockBinding";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_uniform_buffer_object");
      }
   }

   private static boolean check_ARB_vertex_array_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_vertex_array_object")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 631;
         var10002[1] = 632;
         var10002[2] = 633;
         var10002[3] = 634;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glBindVertexArray";
         var5[1] = "glDeleteVertexArrays";
         var5[2] = "glGenVertexArrays";
         var5[3] = "glIsVertexArray";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_vertex_array_object");
      }
   }

   private static boolean check_ARB_vertex_attrib_64bit(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_vertex_attrib_64bit")) {
         return false;
      } else {
         int var5;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[11];
         var3[0] = 838;
         var3[1] = 839;
         var3[2] = 840;
         var3[3] = 841;
         var3[4] = 842;
         var3[5] = 843;
         var3[6] = 844;
         var3[7] = 845;
         var3[8] = 846;
         var3[9] = 847;
         var10002[10] = var5 + 1384;
         String[] var4;
         String[] var6 = var4 = new String[11];
         var6[0] = "glVertexAttribL1d";
         var6[1] = "glVertexAttribL2d";
         var6[2] = "glVertexAttribL3d";
         var6[3] = "glVertexAttribL4d";
         var6[4] = "glVertexAttribL1dv";
         var6[5] = "glVertexAttribL2dv";
         var6[6] = "glVertexAttribL3dv";
         var6[7] = "glVertexAttribL4dv";
         var6[8] = "glVertexAttribLPointer";
         var6[9] = "glGetVertexAttribLdv";
         var6[10] = "glVertexArrayVertexAttribLOffsetEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_vertex_attrib_64bit");
      }
   }

   private static boolean check_ARB_vertex_attrib_binding(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_vertex_attrib_binding")) {
         return false;
      } else {
         int var5;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[12];
         var3[0] = 907;
         var3[1] = 908;
         var3[2] = 909;
         var3[3] = 910;
         var3[4] = 911;
         var3[5] = 912;
         var3[6] = var5 + 1385;
         var3[7] = var5 + 1386;
         var3[8] = var5 + 1387;
         var3[9] = var5 + 1388;
         var3[10] = var5 + 1389;
         var10002[11] = var5 + 1390;
         String[] var4;
         String[] var6 = var4 = new String[12];
         var6[0] = "glBindVertexBuffer";
         var6[1] = "glVertexAttribFormat";
         var6[2] = "glVertexAttribIFormat";
         var6[3] = "glVertexAttribLFormat";
         var6[4] = "glVertexAttribBinding";
         var6[5] = "glVertexBindingDivisor";
         var6[6] = "glVertexArrayBindVertexBufferEXT";
         var6[7] = "glVertexArrayVertexAttribFormatEXT";
         var6[8] = "glVertexArrayVertexAttribIFormatEXT";
         var6[9] = "glVertexArrayVertexAttribLFormatEXT";
         var6[10] = "glVertexArrayVertexAttribBindingEXT";
         var6[11] = "glVertexArrayVertexBindingDivisorEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_vertex_attrib_binding");
      }
   }

   private static boolean check_ARB_vertex_blend(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_vertex_blend")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[10];
         var10002[0] = 1391;
         var10002[1] = 1392;
         var10002[2] = 1393;
         var10002[3] = 1394;
         var10002[4] = 1395;
         var10002[5] = 1396;
         var10002[6] = 1397;
         var10002[7] = 1398;
         var10002[8] = 1399;
         var10002[9] = 1400;
         String[] var4;
         String[] var5 = var4 = new String[10];
         var5[0] = "glWeightfvARB";
         var5[1] = "glWeightbvARB";
         var5[2] = "glWeightubvARB";
         var5[3] = "glWeightsvARB";
         var5[4] = "glWeightusvARB";
         var5[5] = "glWeightivARB";
         var5[6] = "glWeightuivARB";
         var5[7] = "glWeightdvARB";
         var5[8] = "glWeightPointerARB";
         var5[9] = "glVertexBlendARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_vertex_blend");
      }
   }

   private static boolean check_ARB_vertex_buffer_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_vertex_buffer_object")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[11];
         var10002[0] = 1401;
         var10002[1] = 1402;
         var10002[2] = 1403;
         var10002[3] = 1404;
         var10002[4] = 1405;
         var10002[5] = 1406;
         var10002[6] = 1407;
         var10002[7] = 1408;
         var10002[8] = 1409;
         var10002[9] = 1410;
         var10002[10] = 1411;
         String[] var4;
         String[] var5 = var4 = new String[11];
         var5[0] = "glBindBufferARB";
         var5[1] = "glDeleteBuffersARB";
         var5[2] = "glGenBuffersARB";
         var5[3] = "glIsBufferARB";
         var5[4] = "glBufferDataARB";
         var5[5] = "glBufferSubDataARB";
         var5[6] = "glGetBufferSubDataARB";
         var5[7] = "glMapBufferARB";
         var5[8] = "glUnmapBufferARB";
         var5[9] = "glGetBufferParameterivARB";
         var5[10] = "glGetBufferPointervARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_vertex_buffer_object");
      }
   }

   private static boolean check_ARB_vertex_program(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_vertex_program")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[62])[0] = 1412;
         var3[1] = 1413;
         var3[2] = 1414;
         var3[3] = 1415;
         var3[4] = 1416;
         var3[5] = 1417;
         var3[6] = 1418;
         var3[7] = 1419;
         var3[8] = 1420;
         var3[9] = 1421;
         var3[10] = 1422;
         var3[11] = 1423;
         var3[12] = 1424;
         var3[13] = 1425;
         var3[14] = 1426;
         var3[15] = 1427;
         var3[16] = 1428;
         var3[17] = 1429;
         var3[18] = 1430;
         var3[19] = 1431;
         var3[20] = 1432;
         var3[21] = 1433;
         var3[22] = 1434;
         var3[23] = 1435;
         var3[24] = 1436;
         var3[25] = 1437;
         var3[26] = 1438;
         var3[27] = 1439;
         var3[28] = 1440;
         var3[29] = 1441;
         var3[30] = 1442;
         var3[31] = 1443;
         var3[32] = 1444;
         var3[33] = 1445;
         var3[34] = 1446;
         var3[35] = 1447;
         var3[36] = 1448;
         var3[37] = 1449;
         var3[38] = 1450;
         var3[39] = 1451;
         var3[40] = 1452;
         var3[41] = 1453;
         var3[42] = 1454;
         var3[43] = 1455;
         var3[44] = 1456;
         var3[45] = 1457;
         var3[46] = 1458;
         var3[47] = 1459;
         var3[48] = 1460;
         var3[49] = 1461;
         var3[50] = 1462;
         var3[51] = 1463;
         var3[52] = 1464;
         var3[53] = 1465;
         var3[54] = 1466;
         var3[55] = 1467;
         var3[56] = 1468;
         var3[57] = 1469;
         var3[58] = 1470;
         var3[59] = 1471;
         var3[60] = 1472;
         var3[61] = 1473;
         String[] var4;
         (var4 = new String[62])[0] = "glVertexAttrib1sARB";
         var4[1] = "glVertexAttrib1fARB";
         var4[2] = "glVertexAttrib1dARB";
         var4[3] = "glVertexAttrib2sARB";
         var4[4] = "glVertexAttrib2fARB";
         var4[5] = "glVertexAttrib2dARB";
         var4[6] = "glVertexAttrib3sARB";
         var4[7] = "glVertexAttrib3fARB";
         var4[8] = "glVertexAttrib3dARB";
         var4[9] = "glVertexAttrib4sARB";
         var4[10] = "glVertexAttrib4fARB";
         var4[11] = "glVertexAttrib4dARB";
         var4[12] = "glVertexAttrib4NubARB";
         var4[13] = "glVertexAttrib1svARB";
         var4[14] = "glVertexAttrib1fvARB";
         var4[15] = "glVertexAttrib1dvARB";
         var4[16] = "glVertexAttrib2svARB";
         var4[17] = "glVertexAttrib2fvARB";
         var4[18] = "glVertexAttrib2dvARB";
         var4[19] = "glVertexAttrib3svARB";
         var4[20] = "glVertexAttrib3fvARB";
         var4[21] = "glVertexAttrib3dvARB";
         var4[22] = "glVertexAttrib4fvARB";
         var4[23] = "glVertexAttrib4bvARB";
         var4[24] = "glVertexAttrib4svARB";
         var4[25] = "glVertexAttrib4ivARB";
         var4[26] = "glVertexAttrib4ubvARB";
         var4[27] = "glVertexAttrib4usvARB";
         var4[28] = "glVertexAttrib4uivARB";
         var4[29] = "glVertexAttrib4dvARB";
         var4[30] = "glVertexAttrib4NbvARB";
         var4[31] = "glVertexAttrib4NsvARB";
         var4[32] = "glVertexAttrib4NivARB";
         var4[33] = "glVertexAttrib4NubvARB";
         var4[34] = "glVertexAttrib4NusvARB";
         var4[35] = "glVertexAttrib4NuivARB";
         var4[36] = "glVertexAttribPointerARB";
         var4[37] = "glEnableVertexAttribArrayARB";
         var4[38] = "glDisableVertexAttribArrayARB";
         var4[39] = "glProgramStringARB";
         var4[40] = "glBindProgramARB";
         var4[41] = "glDeleteProgramsARB";
         var4[42] = "glGenProgramsARB";
         var4[43] = "glProgramEnvParameter4dARB";
         var4[44] = "glProgramEnvParameter4dvARB";
         var4[45] = "glProgramEnvParameter4fARB";
         var4[46] = "glProgramEnvParameter4fvARB";
         var4[47] = "glProgramLocalParameter4dARB";
         var4[48] = "glProgramLocalParameter4dvARB";
         var4[49] = "glProgramLocalParameter4fARB";
         var4[50] = "glProgramLocalParameter4fvARB";
         var4[51] = "glGetProgramEnvParameterfvARB";
         var4[52] = "glGetProgramEnvParameterdvARB";
         var4[53] = "glGetProgramLocalParameterfvARB";
         var4[54] = "glGetProgramLocalParameterdvARB";
         var4[55] = "glGetProgramivARB";
         var4[56] = "glGetProgramStringARB";
         var4[57] = "glGetVertexAttribfvARB";
         var4[58] = "glGetVertexAttribdvARB";
         var4[59] = "glGetVertexAttribivARB";
         var4[60] = "glGetVertexAttribPointervARB";
         var4[61] = "glIsProgramARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_vertex_program");
      }
   }

   private static boolean check_ARB_vertex_shader(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_vertex_shader")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[46])[0] = 1413;
         var3[1] = 1412;
         var3[2] = 1414;
         var3[3] = 1416;
         var3[4] = 1415;
         var3[5] = 1417;
         var3[6] = 1419;
         var3[7] = 1418;
         var3[8] = 1420;
         var3[9] = 1422;
         var3[10] = 1421;
         var3[11] = 1423;
         var3[12] = 1424;
         var3[13] = 1426;
         var3[14] = 1425;
         var3[15] = 1427;
         var3[16] = 1429;
         var3[17] = 1428;
         var3[18] = 1430;
         var3[19] = 1432;
         var3[20] = 1431;
         var3[21] = 1433;
         var3[22] = 1434;
         var3[23] = 1436;
         var3[24] = 1441;
         var3[25] = 1437;
         var3[26] = 1435;
         var3[27] = 1438;
         var3[28] = 1439;
         var3[29] = 1440;
         var3[30] = 1442;
         var3[31] = 1443;
         var3[32] = 1444;
         var3[33] = 1445;
         var3[34] = 1446;
         var3[35] = 1447;
         var3[36] = 1448;
         var3[37] = 1449;
         var3[38] = 1450;
         var3[39] = 1474;
         var3[40] = 1475;
         var3[41] = 1476;
         var3[42] = 1471;
         var3[43] = 1469;
         var3[44] = 1470;
         var3[45] = 1472;
         String[] var4;
         (var4 = new String[46])[0] = "glVertexAttrib1fARB";
         var4[1] = "glVertexAttrib1sARB";
         var4[2] = "glVertexAttrib1dARB";
         var4[3] = "glVertexAttrib2fARB";
         var4[4] = "glVertexAttrib2sARB";
         var4[5] = "glVertexAttrib2dARB";
         var4[6] = "glVertexAttrib3fARB";
         var4[7] = "glVertexAttrib3sARB";
         var4[8] = "glVertexAttrib3dARB";
         var4[9] = "glVertexAttrib4fARB";
         var4[10] = "glVertexAttrib4sARB";
         var4[11] = "glVertexAttrib4dARB";
         var4[12] = "glVertexAttrib4NubARB";
         var4[13] = "glVertexAttrib1fvARB";
         var4[14] = "glVertexAttrib1svARB";
         var4[15] = "glVertexAttrib1dvARB";
         var4[16] = "glVertexAttrib2fvARB";
         var4[17] = "glVertexAttrib2svARB";
         var4[18] = "glVertexAttrib2dvARB";
         var4[19] = "glVertexAttrib3fvARB";
         var4[20] = "glVertexAttrib3svARB";
         var4[21] = "glVertexAttrib3dvARB";
         var4[22] = "glVertexAttrib4fvARB";
         var4[23] = "glVertexAttrib4svARB";
         var4[24] = "glVertexAttrib4dvARB";
         var4[25] = "glVertexAttrib4ivARB";
         var4[26] = "glVertexAttrib4bvARB";
         var4[27] = "glVertexAttrib4ubvARB";
         var4[28] = "glVertexAttrib4usvARB";
         var4[29] = "glVertexAttrib4uivARB";
         var4[30] = "glVertexAttrib4NbvARB";
         var4[31] = "glVertexAttrib4NsvARB";
         var4[32] = "glVertexAttrib4NivARB";
         var4[33] = "glVertexAttrib4NubvARB";
         var4[34] = "glVertexAttrib4NusvARB";
         var4[35] = "glVertexAttrib4NuivARB";
         var4[36] = "glVertexAttribPointerARB";
         var4[37] = "glEnableVertexAttribArrayARB";
         var4[38] = "glDisableVertexAttribArrayARB";
         var4[39] = "glBindAttribLocationARB";
         var4[40] = "glGetActiveAttribARB";
         var4[41] = "glGetAttribLocationARB";
         var4[42] = "glGetVertexAttribivARB";
         var4[43] = "glGetVertexAttribfvARB";
         var4[44] = "glGetVertexAttribdvARB";
         var4[45] = "glGetVertexAttribPointervARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_vertex_shader");
      }
   }

   private static boolean check_ARB_vertex_type_2_10_10_10_rev(FunctionProvider var0, PointerBuffer var1, Set var2, boolean var3) {
      if (!var2.contains("GL_ARB_vertex_type_2_10_10_10_rev")) {
         return false;
      } else {
         boolean var8;
         label23: {
            label22: {
               if (!var3) {
                  int[] var6;
                  (var6 = new int[30])[0] = 686;
                  var6[1] = 687;
                  var6[2] = 688;
                  var6[3] = 689;
                  var6[4] = 690;
                  var6[5] = 691;
                  var6[6] = 692;
                  var6[7] = 693;
                  var6[8] = 694;
                  var6[9] = 695;
                  var6[10] = 696;
                  var6[11] = 697;
                  var6[12] = 698;
                  var6[13] = 699;
                  var6[14] = 700;
                  var6[15] = 701;
                  var6[16] = 702;
                  var6[17] = 703;
                  var6[18] = 704;
                  var6[19] = 705;
                  var6[20] = 706;
                  var6[21] = 707;
                  var6[22] = 708;
                  var6[23] = 709;
                  var6[24] = 710;
                  var6[25] = 711;
                  var6[26] = 712;
                  var6[27] = 713;
                  var6[28] = 714;
                  var6[29] = 715;
                  String[] var7;
                  (var7 = new String[30])[0] = "glVertexP2ui";
                  var7[1] = "glVertexP3ui";
                  var7[2] = "glVertexP4ui";
                  var7[3] = "glVertexP2uiv";
                  var7[4] = "glVertexP3uiv";
                  var7[5] = "glVertexP4uiv";
                  var7[6] = "glTexCoordP1ui";
                  var7[7] = "glTexCoordP2ui";
                  var7[8] = "glTexCoordP3ui";
                  var7[9] = "glTexCoordP4ui";
                  var7[10] = "glTexCoordP1uiv";
                  var7[11] = "glTexCoordP2uiv";
                  var7[12] = "glTexCoordP3uiv";
                  var7[13] = "glTexCoordP4uiv";
                  var7[14] = "glMultiTexCoordP1ui";
                  var7[15] = "glMultiTexCoordP2ui";
                  var7[16] = "glMultiTexCoordP3ui";
                  var7[17] = "glMultiTexCoordP4ui";
                  var7[18] = "glMultiTexCoordP1uiv";
                  var7[19] = "glMultiTexCoordP2uiv";
                  var7[20] = "glMultiTexCoordP3uiv";
                  var7[21] = "glMultiTexCoordP4uiv";
                  var7[22] = "glNormalP3ui";
                  var7[23] = "glNormalP3uiv";
                  var7[24] = "glColorP3ui";
                  var7[25] = "glColorP4ui";
                  var7[26] = "glColorP3uiv";
                  var7[27] = "glColorP4uiv";
                  var7[28] = "glSecondaryColorP3ui";
                  var7[29] = "glSecondaryColorP3uiv";
                  if (!Checks.checkFunctions(var0, var1, var6, var7)) {
                     break label22;
                  }
               }

               FunctionProvider var10000 = var0;
               PointerBuffer var10001 = var1;
               int[] var4;
               int[] var10002 = var4 = new int[8];
               var10002[0] = 716;
               var10002[1] = 717;
               var10002[2] = 718;
               var10002[3] = 719;
               var10002[4] = 720;
               var10002[5] = 721;
               var10002[6] = 722;
               var10002[7] = 723;
               String[] var5;
               String[] var9 = var5 = new String[8];
               var9[0] = "glVertexAttribP1ui";
               var9[1] = "glVertexAttribP2ui";
               var9[2] = "glVertexAttribP3ui";
               var9[3] = "glVertexAttribP4ui";
               var9[4] = "glVertexAttribP1uiv";
               var9[5] = "glVertexAttribP2uiv";
               var9[6] = "glVertexAttribP3uiv";
               var9[7] = "glVertexAttribP4uiv";
               if (Checks.checkFunctions(var10000, var10001, var4, var5)) {
                  break label23;
               }
            }

            if (!Checks.reportMissing("GL", "GL_ARB_vertex_type_2_10_10_10_rev")) {
               var8 = false;
               return var8;
            }
         }

         var8 = true;
         return var8;
      }
   }

   private static boolean check_ARB_viewport_array(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_viewport_array")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[10];
         var10002[0] = 848;
         var10002[1] = 849;
         var10002[2] = 850;
         var10002[3] = 851;
         var10002[4] = 852;
         var10002[5] = 853;
         var10002[6] = 854;
         var10002[7] = 855;
         var10002[8] = 856;
         var10002[9] = 857;
         String[] var4;
         String[] var5 = var4 = new String[10];
         var5[0] = "glViewportArrayv";
         var5[1] = "glViewportIndexedf";
         var5[2] = "glViewportIndexedfv";
         var5[3] = "glScissorArrayv";
         var5[4] = "glScissorIndexed";
         var5[5] = "glScissorIndexedv";
         var5[6] = "glDepthRangeArrayv";
         var5[7] = "glDepthRangeIndexed";
         var5[8] = "glGetFloati_v";
         var5[9] = "glGetDoublei_v";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_viewport_array");
      }
   }

   private static boolean check_ARB_window_pos(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_ARB_window_pos")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[16];
         var10002[0] = 1477;
         var10002[1] = 1478;
         var10002[2] = 1479;
         var10002[3] = 1480;
         var10002[4] = 1481;
         var10002[5] = 1482;
         var10002[6] = 1483;
         var10002[7] = 1484;
         var10002[8] = 1485;
         var10002[9] = 1486;
         var10002[10] = 1487;
         var10002[11] = 1488;
         var10002[12] = 1489;
         var10002[13] = 1490;
         var10002[14] = 1491;
         var10002[15] = 1492;
         String[] var4;
         String[] var5 = var4 = new String[16];
         var5[0] = "glWindowPos2iARB";
         var5[1] = "glWindowPos2sARB";
         var5[2] = "glWindowPos2fARB";
         var5[3] = "glWindowPos2dARB";
         var5[4] = "glWindowPos2ivARB";
         var5[5] = "glWindowPos2svARB";
         var5[6] = "glWindowPos2fvARB";
         var5[7] = "glWindowPos2dvARB";
         var5[8] = "glWindowPos3iARB";
         var5[9] = "glWindowPos3sARB";
         var5[10] = "glWindowPos3fARB";
         var5[11] = "glWindowPos3dARB";
         var5[12] = "glWindowPos3ivARB";
         var5[13] = "glWindowPos3svARB";
         var5[14] = "glWindowPos3fvARB";
         var5[15] = "glWindowPos3dvARB";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_ARB_window_pos");
      }
   }

   private static boolean check_EXT_bindable_uniform(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_bindable_uniform")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 1493;
         var10002[1] = 1494;
         var10002[2] = 1495;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glUniformBufferEXT";
         var5[1] = "glGetUniformBufferSizeEXT";
         var5[2] = "glGetUniformOffsetEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_bindable_uniform");
      }
   }

   private static boolean check_EXT_blend_color(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_blend_color")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1496;
         String[] var4;
         (var4 = new String[1])[0] = "glBlendColorEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_blend_color");
      }
   }

   private static boolean check_EXT_blend_equation_separate(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_blend_equation_separate")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1497;
         String[] var4;
         (var4 = new String[1])[0] = "glBlendEquationSeparateEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_blend_equation_separate");
      }
   }

   private static boolean check_EXT_blend_func_separate(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_blend_func_separate")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1498;
         String[] var4;
         (var4 = new String[1])[0] = "glBlendFuncSeparateEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_blend_func_separate");
      }
   }

   private static boolean check_EXT_blend_minmax(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_blend_minmax")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1499;
         String[] var4;
         (var4 = new String[1])[0] = "glBlendEquationEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_blend_minmax");
      }
   }

   private static boolean check_EXT_compiled_vertex_array(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_compiled_vertex_array")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1500;
         var10002[1] = 1501;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glLockArraysEXT";
         var5[1] = "glUnlockArraysEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_compiled_vertex_array");
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
         var10002[0] = 1502;
         var10002[1] = 1503;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glLabelObjectEXT";
         var5[1] = "glGetObjectLabelEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_debug_label");
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
         var10002[0] = 1504;
         var10002[1] = 1505;
         var10002[2] = 1506;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glInsertEventMarkerEXT";
         var5[1] = "glPushGroupMarkerEXT";
         var5[2] = "glPopGroupMarkerEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_debug_marker");
      }
   }

   private static boolean check_EXT_depth_bounds_test(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_depth_bounds_test")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1507;
         String[] var4;
         (var4 = new String[1])[0] = "glDepthBoundsEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_depth_bounds_test");
      }
   }

   private static boolean check_EXT_direct_state_access(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_direct_state_access")) {
         return false;
      } else {
         int var3;
         if (var2.contains("OpenGL12")) {
            var3 = 0;
         } else {
            var3 = Integer.MIN_VALUE;
         }

         int var4;
         if (var2.contains("OpenGL13")) {
            var4 = 0;
         } else {
            var4 = Integer.MIN_VALUE;
         }

         int var5;
         if (var2.contains("OpenGL30")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         int var6;
         if (var2.contains("GL_ARB_vertex_program")) {
            var6 = 0;
         } else {
            var6 = Integer.MIN_VALUE;
         }

         int var7;
         if (var2.contains("OpenGL15")) {
            var7 = 0;
         } else {
            var7 = Integer.MIN_VALUE;
         }

         int var8;
         if (var2.contains("OpenGL20")) {
            var8 = 0;
         } else {
            var8 = Integer.MIN_VALUE;
         }

         int var9;
         if (var2.contains("OpenGL21")) {
            var9 = 0;
         } else {
            var9 = Integer.MIN_VALUE;
         }

         int var10;
         if (var2.contains("GL_EXT_texture_buffer_object")) {
            var10 = 0;
         } else {
            var10 = Integer.MIN_VALUE;
         }

         int var11;
         if (var2.contains("GL_EXT_texture_integer")) {
            var11 = 0;
         } else {
            var11 = Integer.MIN_VALUE;
         }

         int var12;
         if (var2.contains("GL_EXT_gpu_shader4")) {
            var12 = 0;
         } else {
            var12 = Integer.MIN_VALUE;
         }

         int var13;
         if (var2.contains("GL_EXT_gpu_program_parameters")) {
            var13 = 0;
         } else {
            var13 = Integer.MIN_VALUE;
         }

         int var14;
         if (var2.contains("GL_NV_gpu_program4")) {
            var14 = 0;
         } else {
            var14 = Integer.MIN_VALUE;
         }

         int var15;
         if (var2.contains("GL_NV_framebuffer_multisample_coverage")) {
            var15 = 0;
         } else {
            var15 = Integer.MIN_VALUE;
         }

         int var16;
         if (!var2.contains("GL_EXT_geometry_shader4") && !var2.contains("GL_NV_gpu_program4")) {
            var16 = Integer.MIN_VALUE;
         } else {
            var16 = 0;
         }

         int var197;
         if (var2.contains("GL_NV_explicit_multisample")) {
            var197 = 0;
         } else {
            var197 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var17;
         (var17 = new int[212])[0] = 1508;
         var17[1] = 1509;
         var17[2] = 1510;
         var17[3] = 1511;
         var17[4] = 1512;
         var17[5] = 1513;
         var17[6] = 1514;
         var17[7] = 1515;
         var17[8] = 1516;
         var17[9] = 1517;
         var17[10] = 1518;
         var17[11] = 1519;
         var17[12] = 1520;
         var17[13] = 1521;
         var17[14] = 1522;
         var17[15] = 1523;
         var17[16] = 1524;
         var17[17] = 1525;
         var17[18] = 1526;
         var17[19] = 1527;
         var17[20] = 1528;
         var17[21] = 1529;
         var17[22] = 1530;
         var17[23] = 1531;
         var17[24] = 1532;
         var17[25] = 1533;
         var17[26] = 1534;
         var17[27] = 1535;
         var17[28] = 1536;
         var17[29] = 1537;
         var17[30] = 1538;
         var17[31] = 1539;
         var17[32] = 1540;
         var17[33] = 1541;
         int var18 = var3 + 1542;
         var17[34] = var18;
         var18 = var3 + 1543;
         var17[35] = var18;
         var18 = var3 + 1544;
         var17[36] = var18;
         var18 = var4 + 1545;
         var17[37] = var18;
         var18 = var4 + 1546;
         var17[38] = var18;
         var18 = var4 + 1547;
         var17[39] = var18;
         var18 = var4 + 1548;
         var17[40] = var18;
         var18 = var4 + 1549;
         var17[41] = var18;
         var18 = var4 + 1550;
         var17[42] = var18;
         var18 = var4 + 1551;
         var17[43] = var18;
         var18 = var4 + 1552;
         var17[44] = var18;
         var18 = var4 + 1553;
         var17[45] = var18;
         var18 = var4 + 1554;
         var17[46] = var18;
         var18 = var4 + 1555;
         var17[47] = var18;
         var18 = var4 + 1556;
         var17[48] = var18;
         var18 = var4 + 1557;
         var17[49] = var18;
         var18 = var4 + 1558;
         var17[50] = var18;
         var18 = var4 + 1559;
         var17[51] = var18;
         var18 = var4 + 1560;
         var17[52] = var18;
         var18 = var4 + 1561;
         var17[53] = var18;
         var18 = var4 + 1562;
         var17[54] = var18;
         var18 = var4 + 1563;
         var17[55] = var18;
         var18 = var4 + 1564;
         var17[56] = var18;
         var18 = var4 + 1565;
         var17[57] = var18;
         var18 = var4 + 1566;
         var17[58] = var18;
         var18 = var4 + 1567;
         var17[59] = var18;
         var18 = var4 + 1568;
         var17[60] = var18;
         var18 = var4 + 1569;
         var17[61] = var18;
         var18 = var4 + 1570;
         var17[62] = var18;
         var18 = var4 + 1571;
         var17[63] = var18;
         var18 = var4 + 1572;
         var17[64] = var18;
         var18 = var4 + 1573;
         var17[65] = var18;
         var18 = var4 + 1574;
         var17[66] = var18;
         var18 = var4 + 1575;
         var17[67] = var18;
         var18 = var4 + 1576;
         var17[68] = var18;
         var18 = var4 + 1577;
         var17[69] = var18;
         var18 = var4 + 1578;
         var17[70] = var18;
         var18 = var4 + 1579;
         var17[71] = var18;
         var18 = var4 + 1580;
         var17[72] = var18;
         var18 = var4 + 1581;
         var17[73] = var18;
         var18 = var4 + 1582;
         var17[74] = var18;
         var18 = var4 + 1583;
         var17[75] = var18;
         var18 = var4 + 1586;
         var17[76] = var18;
         var18 = var4 + 1587;
         var17[77] = var18;
         var18 = var4 + 1588;
         var17[78] = var18;
         var18 = var4 + 1592;
         var17[79] = var18;
         var18 = var4 + 1593;
         var17[80] = var18;
         var18 = var4 + 1594;
         var17[81] = var18;
         var18 = var4 + 1595;
         var17[82] = var18;
         var18 = var4 + 1596;
         var17[83] = var18;
         var18 = var6 + 1597;
         var17[84] = var18;
         var18 = var6 + 1598;
         var17[85] = var18;
         var18 = var6 + 1599;
         var17[86] = var18;
         var18 = var6 + 1600;
         var17[87] = var18;
         var18 = var6 + 1601;
         var17[88] = var18;
         var18 = var6 + 1602;
         var17[89] = var18;
         var18 = var6 + 1603;
         var17[90] = var18;
         var18 = var6 + 1604;
         var17[91] = var18;
         var18 = var6 + 1605;
         var17[92] = var18;
         var18 = var4 + 1606;
         var17[93] = var18;
         var18 = var4 + 1607;
         var17[94] = var18;
         var18 = var4 + 1608;
         var17[95] = var18;
         var18 = var4 + 1609;
         var17[96] = var18;
         var18 = var4 + 1610;
         var17[97] = var18;
         var18 = var4 + 1611;
         var17[98] = var18;
         var18 = var4 + 1612;
         var17[99] = var18;
         var18 = var4 + 1613;
         var17[100] = var18;
         var18 = var4 + 1614;
         var17[101] = var18;
         var18 = var4 + 1615;
         var17[102] = var18;
         var18 = var4 + 1616;
         var17[103] = var18;
         var18 = var4 + 1617;
         var17[104] = var18;
         var18 = var4 + 1618;
         var17[105] = var18;
         var18 = var4 + 1619;
         var17[106] = var18;
         var18 = var4 + 1620;
         var17[107] = var18;
         var18 = var4 + 1621;
         var17[108] = var18;
         var18 = var4 + 1622;
         var17[109] = var18;
         var18 = var4 + 1623;
         var17[110] = var18;
         var18 = var7 + 1624;
         var17[111] = var18;
         var18 = var7 + 1625;
         var17[112] = var18;
         var18 = var7 + 1626;
         var17[113] = var18;
         var18 = var7 + 1627;
         var17[114] = var18;
         var18 = var7 + 1628;
         var17[115] = var18;
         var18 = var7 + 1629;
         var17[116] = var18;
         var18 = var8 + 1630;
         var17[117] = var18;
         var18 = var8 + 1631;
         var17[118] = var18;
         var18 = var8 + 1632;
         var17[119] = var18;
         var18 = var8 + 1633;
         var17[120] = var18;
         var18 = var8 + 1634;
         var17[121] = var18;
         var18 = var8 + 1635;
         var17[122] = var18;
         var18 = var8 + 1636;
         var17[123] = var18;
         var18 = var8 + 1637;
         var17[124] = var18;
         var18 = var8 + 1638;
         var17[125] = var18;
         var18 = var8 + 1639;
         var17[126] = var18;
         var18 = var8 + 1640;
         var17[127] = var18;
         var18 = var8 + 1641;
         var17[128] = var18;
         var18 = var8 + 1642;
         var17[129] = var18;
         var18 = var8 + 1643;
         var17[130] = var18;
         var18 = var8 + 1644;
         var17[131] = var18;
         var18 = var8 + 1645;
         var17[132] = var18;
         var18 = var8 + 1646;
         var17[133] = var18;
         var18 = var8 + 1647;
         var17[134] = var18;
         var18 = var8 + 1648;
         var17[135] = var18;
         var18 = var9 + 1649;
         var17[136] = var18;
         var18 = var9 + 1650;
         var17[137] = var18;
         var18 = var9 + 1651;
         var17[138] = var18;
         var18 = var9 + 1652;
         var17[139] = var18;
         var18 = var9 + 1653;
         var17[140] = var18;
         var18 = var9 + 1654;
         var17[141] = var18;
         var18 = var10 + 1655;
         var17[142] = var18;
         var18 = var10 + 1656;
         var17[143] = var18;
         var18 = var11 + 1657;
         var17[144] = var18;
         var18 = var11 + 1658;
         var17[145] = var18;
         var18 = var11 + 1659;
         var17[146] = var18;
         var18 = var11 + 1660;
         var17[147] = var18;
         var18 = var11 + 1661;
         var17[148] = var18;
         var18 = var11 + 1662;
         var17[149] = var18;
         var18 = var11 + 1663;
         var17[150] = var18;
         var18 = var11 + 1664;
         var17[151] = var18;
         var18 = var12 + 1665;
         var17[152] = var18;
         var18 = var12 + 1666;
         var17[153] = var18;
         var18 = var12 + 1667;
         var17[154] = var18;
         var18 = var12 + 1668;
         var17[155] = var18;
         var18 = var12 + 1669;
         var17[156] = var18;
         var18 = var12 + 1670;
         var17[157] = var18;
         var18 = var12 + 1671;
         var17[158] = var18;
         var18 = var12 + 1672;
         var17[159] = var18;
         var18 = var13 + 1673;
         var17[160] = var18;
         var18 = var14 + 1674;
         var17[161] = var18;
         var18 = var14 + 1675;
         var17[162] = var18;
         var18 = var14 + 1676;
         var17[163] = var18;
         var18 = var14 + 1677;
         var17[164] = var18;
         var18 = var14 + 1678;
         var17[165] = var18;
         var18 = var14 + 1679;
         var17[166] = var18;
         var18 = var14 + 1680;
         var17[167] = var18;
         var18 = var14 + 1681;
         var17[168] = var18;
         var18 = var5 + 1682;
         var17[169] = var18;
         var18 = var5 + 1683;
         var17[170] = var18;
         var18 = var5 + 1684;
         var17[171] = var18;
         var18 = var15 + 1685;
         var17[172] = var18;
         var18 = var5 + 1686;
         var17[173] = var18;
         var18 = var5 + 1687;
         var17[174] = var18;
         var18 = var5 + 1688;
         var17[175] = var18;
         var18 = var5 + 1689;
         var17[176] = var18;
         var18 = var5 + 1690;
         var17[177] = var18;
         var18 = var5 + 1691;
         var17[178] = var18;
         var18 = var5 + 1692;
         var17[179] = var18;
         var18 = var5 + 1693;
         var17[180] = var18;
         var18 = var5 + 1694;
         var17[181] = var18;
         var18 = var5 + 1695;
         var17[182] = var18;
         var18 = var5 + 1696;
         var17[183] = var18;
         var18 = var5 + 1697;
         var17[184] = var18;
         var18 = var5 + 1698;
         var17[185] = var18;
         var18 = var16 + 1699;
         var17[186] = var18;
         var18 = var16 + 1700;
         var17[187] = var18;
         var18 = var16 + 1701;
         var17[188] = var18;
         var18 = var197 + 1702;
         var17[189] = var18;
         var18 = var197 + 1703;
         var17[190] = var18;
         var18 = var5 + 1704;
         var17[191] = var18;
         var18 = var5 + 1705;
         var17[192] = var18;
         var18 = var5 + 1706;
         var17[193] = var18;
         var18 = var5 + 1707;
         var17[194] = var18;
         var18 = var5 + 1708;
         var17[195] = var18;
         var18 = var5 + 1709;
         var17[196] = var18;
         var18 = var5 + 1710;
         var17[197] = var18;
         var18 = var5 + 1711;
         var17[198] = var18;
         var18 = var5 + 1712;
         var17[199] = var18;
         var18 = var5 + 1713;
         var17[200] = var18;
         var18 = var5 + 1714;
         var17[201] = var18;
         var18 = var5 + 1715;
         var17[202] = var18;
         var18 = var5 + 1716;
         var17[203] = var18;
         var18 = var5 + 1717;
         var17[204] = var18;
         var18 = var5 + 1718;
         var17[205] = var18;
         var18 = var5 + 1719;
         var17[206] = var18;
         var18 = var5 + 1720;
         var17[207] = var18;
         var18 = var5 + 1721;
         var17[208] = var18;
         var18 = var5 + 1722;
         var17[209] = var18;
         var18 = var5 + 1723;
         var17[210] = var18;
         var18 = var5 + 1724;
         var17[211] = var18;
         String[] var196;
         (var196 = new String[212])[0] = "glClientAttribDefaultEXT";
         var196[1] = "glPushClientAttribDefaultEXT";
         var196[2] = "glMatrixLoadfEXT";
         var196[3] = "glMatrixLoaddEXT";
         var196[4] = "glMatrixMultfEXT";
         var196[5] = "glMatrixMultdEXT";
         var196[6] = "glMatrixLoadIdentityEXT";
         var196[7] = "glMatrixRotatefEXT";
         var196[8] = "glMatrixRotatedEXT";
         var196[9] = "glMatrixScalefEXT";
         var196[10] = "glMatrixScaledEXT";
         var196[11] = "glMatrixTranslatefEXT";
         var196[12] = "glMatrixTranslatedEXT";
         var196[13] = "glMatrixOrthoEXT";
         var196[14] = "glMatrixFrustumEXT";
         var196[15] = "glMatrixPushEXT";
         var196[16] = "glMatrixPopEXT";
         var196[17] = "glTextureParameteriEXT";
         var196[18] = "glTextureParameterivEXT";
         var196[19] = "glTextureParameterfEXT";
         var196[20] = "glTextureParameterfvEXT";
         var196[21] = "glTextureImage1DEXT";
         var196[22] = "glTextureImage2DEXT";
         var196[23] = "glTextureSubImage1DEXT";
         var196[24] = "glTextureSubImage2DEXT";
         var196[25] = "glCopyTextureImage1DEXT";
         var196[26] = "glCopyTextureImage2DEXT";
         var196[27] = "glCopyTextureSubImage1DEXT";
         var196[28] = "glCopyTextureSubImage2DEXT";
         var196[29] = "glGetTextureImageEXT";
         var196[30] = "glGetTextureParameterfvEXT";
         var196[31] = "glGetTextureParameterivEXT";
         var196[32] = "glGetTextureLevelParameterfvEXT";
         var196[33] = "glGetTextureLevelParameterivEXT";
         var196[34] = "glTextureImage3DEXT";
         var196[35] = "glTextureSubImage3DEXT";
         var196[36] = "glCopyTextureSubImage3DEXT";
         var196[37] = "glBindMultiTextureEXT";
         var196[38] = "glMultiTexCoordPointerEXT";
         var196[39] = "glMultiTexEnvfEXT";
         var196[40] = "glMultiTexEnvfvEXT";
         var196[41] = "glMultiTexEnviEXT";
         var196[42] = "glMultiTexEnvivEXT";
         var196[43] = "glMultiTexGendEXT";
         var196[44] = "glMultiTexGendvEXT";
         var196[45] = "glMultiTexGenfEXT";
         var196[46] = "glMultiTexGenfvEXT";
         var196[47] = "glMultiTexGeniEXT";
         var196[48] = "glMultiTexGenivEXT";
         var196[49] = "glGetMultiTexEnvfvEXT";
         var196[50] = "glGetMultiTexEnvivEXT";
         var196[51] = "glGetMultiTexGendvEXT";
         var196[52] = "glGetMultiTexGenfvEXT";
         var196[53] = "glGetMultiTexGenivEXT";
         var196[54] = "glMultiTexParameteriEXT";
         var196[55] = "glMultiTexParameterivEXT";
         var196[56] = "glMultiTexParameterfEXT";
         var196[57] = "glMultiTexParameterfvEXT";
         var196[58] = "glMultiTexImage1DEXT";
         var196[59] = "glMultiTexImage2DEXT";
         var196[60] = "glMultiTexSubImage1DEXT";
         var196[61] = "glMultiTexSubImage2DEXT";
         var196[62] = "glCopyMultiTexImage1DEXT";
         var196[63] = "glCopyMultiTexImage2DEXT";
         var196[64] = "glCopyMultiTexSubImage1DEXT";
         var196[65] = "glCopyMultiTexSubImage2DEXT";
         var196[66] = "glGetMultiTexImageEXT";
         var196[67] = "glGetMultiTexParameterfvEXT";
         var196[68] = "glGetMultiTexParameterivEXT";
         var196[69] = "glGetMultiTexLevelParameterfvEXT";
         var196[70] = "glGetMultiTexLevelParameterivEXT";
         var196[71] = "glMultiTexImage3DEXT";
         var196[72] = "glMultiTexSubImage3DEXT";
         var196[73] = "glCopyMultiTexSubImage3DEXT";
         var196[74] = "glEnableClientStateIndexedEXT";
         var196[75] = "glDisableClientStateIndexedEXT";
         var196[76] = "glGetFloatIndexedvEXT";
         var196[77] = "glGetDoubleIndexedvEXT";
         var196[78] = "glGetPointerIndexedvEXT";
         var196[79] = "glEnableIndexedEXT";
         var196[80] = "glDisableIndexedEXT";
         var196[81] = "glIsEnabledIndexedEXT";
         var196[82] = "glGetIntegerIndexedvEXT";
         var196[83] = "glGetBooleanIndexedvEXT";
         var196[84] = "glNamedProgramStringEXT";
         var196[85] = "glNamedProgramLocalParameter4dEXT";
         var196[86] = "glNamedProgramLocalParameter4dvEXT";
         var196[87] = "glNamedProgramLocalParameter4fEXT";
         var196[88] = "glNamedProgramLocalParameter4fvEXT";
         var196[89] = "glGetNamedProgramLocalParameterdvEXT";
         var196[90] = "glGetNamedProgramLocalParameterfvEXT";
         var196[91] = "glGetNamedProgramivEXT";
         var196[92] = "glGetNamedProgramStringEXT";
         var196[93] = "glCompressedTextureImage3DEXT";
         var196[94] = "glCompressedTextureImage2DEXT";
         var196[95] = "glCompressedTextureImage1DEXT";
         var196[96] = "glCompressedTextureSubImage3DEXT";
         var196[97] = "glCompressedTextureSubImage2DEXT";
         var196[98] = "glCompressedTextureSubImage1DEXT";
         var196[99] = "glGetCompressedTextureImageEXT";
         var196[100] = "glCompressedMultiTexImage3DEXT";
         var196[101] = "glCompressedMultiTexImage2DEXT";
         var196[102] = "glCompressedMultiTexImage1DEXT";
         var196[103] = "glCompressedMultiTexSubImage3DEXT";
         var196[104] = "glCompressedMultiTexSubImage2DEXT";
         var196[105] = "glCompressedMultiTexSubImage1DEXT";
         var196[106] = "glGetCompressedMultiTexImageEXT";
         var196[107] = "glMatrixLoadTransposefEXT";
         var196[108] = "glMatrixLoadTransposedEXT";
         var196[109] = "glMatrixMultTransposefEXT";
         var196[110] = "glMatrixMultTransposedEXT";
         var196[111] = "glNamedBufferDataEXT";
         var196[112] = "glNamedBufferSubDataEXT";
         var196[113] = "glMapNamedBufferEXT";
         var196[114] = "glUnmapNamedBufferEXT";
         var196[115] = "glGetNamedBufferParameterivEXT";
         var196[116] = "glGetNamedBufferSubDataEXT";
         var196[117] = "glProgramUniform1fEXT";
         var196[118] = "glProgramUniform2fEXT";
         var196[119] = "glProgramUniform3fEXT";
         var196[120] = "glProgramUniform4fEXT";
         var196[121] = "glProgramUniform1iEXT";
         var196[122] = "glProgramUniform2iEXT";
         var196[123] = "glProgramUniform3iEXT";
         var196[124] = "glProgramUniform4iEXT";
         var196[125] = "glProgramUniform1fvEXT";
         var196[126] = "glProgramUniform2fvEXT";
         var196[127] = "glProgramUniform3fvEXT";
         var196[128] = "glProgramUniform4fvEXT";
         var196[129] = "glProgramUniform1ivEXT";
         var196[130] = "glProgramUniform2ivEXT";
         var196[131] = "glProgramUniform3ivEXT";
         var196[132] = "glProgramUniform4ivEXT";
         var196[133] = "glProgramUniformMatrix2fvEXT";
         var196[134] = "glProgramUniformMatrix3fvEXT";
         var196[135] = "glProgramUniformMatrix4fvEXT";
         var196[136] = "glProgramUniformMatrix2x3fvEXT";
         var196[137] = "glProgramUniformMatrix3x2fvEXT";
         var196[138] = "glProgramUniformMatrix2x4fvEXT";
         var196[139] = "glProgramUniformMatrix4x2fvEXT";
         var196[140] = "glProgramUniformMatrix3x4fvEXT";
         var196[141] = "glProgramUniformMatrix4x3fvEXT";
         var196[142] = "glTextureBufferEXT";
         var196[143] = "glMultiTexBufferEXT";
         var196[144] = "glTextureParameterIivEXT";
         var196[145] = "glTextureParameterIuivEXT";
         var196[146] = "glGetTextureParameterIivEXT";
         var196[147] = "glGetTextureParameterIuivEXT";
         var196[148] = "glMultiTexParameterIivEXT";
         var196[149] = "glMultiTexParameterIuivEXT";
         var196[150] = "glGetMultiTexParameterIivEXT";
         var196[151] = "glGetMultiTexParameterIuivEXT";
         var196[152] = "glProgramUniform1uiEXT";
         var196[153] = "glProgramUniform2uiEXT";
         var196[154] = "glProgramUniform3uiEXT";
         var196[155] = "glProgramUniform4uiEXT";
         var196[156] = "glProgramUniform1uivEXT";
         var196[157] = "glProgramUniform2uivEXT";
         var196[158] = "glProgramUniform3uivEXT";
         var196[159] = "glProgramUniform4uivEXT";
         var196[160] = "glNamedProgramLocalParameters4fvEXT";
         var196[161] = "glNamedProgramLocalParameterI4iEXT";
         var196[162] = "glNamedProgramLocalParameterI4ivEXT";
         var196[163] = "glNamedProgramLocalParametersI4ivEXT";
         var196[164] = "glNamedProgramLocalParameterI4uiEXT";
         var196[165] = "glNamedProgramLocalParameterI4uivEXT";
         var196[166] = "glNamedProgramLocalParametersI4uivEXT";
         var196[167] = "glGetNamedProgramLocalParameterIivEXT";
         var196[168] = "glGetNamedProgramLocalParameterIuivEXT";
         var196[169] = "glNamedRenderbufferStorageEXT";
         var196[170] = "glGetNamedRenderbufferParameterivEXT";
         var196[171] = "glNamedRenderbufferStorageMultisampleEXT";
         var196[172] = "glNamedRenderbufferStorageMultisampleCoverageEXT";
         var196[173] = "glCheckNamedFramebufferStatusEXT";
         var196[174] = "glNamedFramebufferTexture1DEXT";
         var196[175] = "glNamedFramebufferTexture2DEXT";
         var196[176] = "glNamedFramebufferTexture3DEXT";
         var196[177] = "glNamedFramebufferRenderbufferEXT";
         var196[178] = "glGetNamedFramebufferAttachmentParameterivEXT";
         var196[179] = "glGenerateTextureMipmapEXT";
         var196[180] = "glGenerateMultiTexMipmapEXT";
         var196[181] = "glFramebufferDrawBufferEXT";
         var196[182] = "glFramebufferDrawBuffersEXT";
         var196[183] = "glFramebufferReadBufferEXT";
         var196[184] = "glGetFramebufferParameterivEXT";
         var196[185] = "glNamedCopyBufferSubDataEXT";
         var196[186] = "glNamedFramebufferTextureEXT";
         var196[187] = "glNamedFramebufferTextureLayerEXT";
         var196[188] = "glNamedFramebufferTextureFaceEXT";
         var196[189] = "glTextureRenderbufferEXT";
         var196[190] = "glMultiTexRenderbufferEXT";
         var196[191] = "glVertexArrayVertexOffsetEXT";
         var196[192] = "glVertexArrayColorOffsetEXT";
         var196[193] = "glVertexArrayEdgeFlagOffsetEXT";
         var196[194] = "glVertexArrayIndexOffsetEXT";
         var196[195] = "glVertexArrayNormalOffsetEXT";
         var196[196] = "glVertexArrayTexCoordOffsetEXT";
         var196[197] = "glVertexArrayMultiTexCoordOffsetEXT";
         var196[198] = "glVertexArrayFogCoordOffsetEXT";
         var196[199] = "glVertexArraySecondaryColorOffsetEXT";
         var196[200] = "glVertexArrayVertexAttribOffsetEXT";
         var196[201] = "glVertexArrayVertexAttribIOffsetEXT";
         var196[202] = "glEnableVertexArrayEXT";
         var196[203] = "glDisableVertexArrayEXT";
         var196[204] = "glEnableVertexArrayAttribEXT";
         var196[205] = "glDisableVertexArrayAttribEXT";
         var196[206] = "glGetVertexArrayIntegervEXT";
         var196[207] = "glGetVertexArrayPointervEXT";
         var196[208] = "glGetVertexArrayIntegeri_vEXT";
         var196[209] = "glGetVertexArrayPointeri_vEXT";
         var196[210] = "glMapNamedBufferRangeEXT";
         var196[211] = "glFlushMappedNamedBufferRangeEXT";
         return Checks.checkFunctions(var10000, var10001, var17, var196) || Checks.reportMissing("GL", "GL_EXT_direct_state_access");
      }
   }

   private static boolean check_EXT_draw_buffers2(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_draw_buffers2")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 1725;
         var10002[1] = 1596;
         var10002[2] = 1595;
         var10002[3] = 1592;
         var10002[4] = 1593;
         var10002[5] = 1594;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glColorMaskIndexedEXT";
         var5[1] = "glGetBooleanIndexedvEXT";
         var5[2] = "glGetIntegerIndexedvEXT";
         var5[3] = "glEnableIndexedEXT";
         var5[4] = "glDisableIndexedEXT";
         var5[5] = "glIsEnabledIndexedEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_draw_buffers2");
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
         var10002[0] = 1726;
         var10002[1] = 1727;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glDrawArraysInstancedEXT";
         var5[1] = "glDrawElementsInstancedEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_draw_instanced");
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
         var3[0] = 1728;
         var10002[1] = var5 + 1729;
         String[] var4;
         String[] var6 = var4 = new String[2];
         var6[0] = "glEGLImageTargetTexStorageEXT";
         var6[1] = "glEGLImageTargetTextureStorageEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_EGL_image_storage");
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
         var3[0] = 1730;
         var10002[1] = var5 + 1731;
         String[] var4;
         String[] var6 = var4 = new String[2];
         var6[0] = "glBufferStorageExternalEXT";
         var6[1] = "glNamedBufferStorageExternalEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_external_buffer");
      }
   }

   private static boolean check_EXT_framebuffer_blit(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_framebuffer_blit")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1732;
         String[] var4;
         (var4 = new String[1])[0] = "glBlitFramebufferEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_framebuffer_blit");
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
         var10002[0] = 1733;
         var10002[1] = 1734;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glBlitFramebufferLayersEXT";
         var5[1] = "glBlitFramebufferLayerEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_framebuffer_blit_layers");
      }
   }

   private static boolean check_EXT_framebuffer_multisample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_framebuffer_multisample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1735;
         String[] var4;
         (var4 = new String[1])[0] = "glRenderbufferStorageMultisampleEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_framebuffer_multisample");
      }
   }

   private static boolean check_EXT_framebuffer_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_framebuffer_object")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[17];
         var10002[0] = 1736;
         var10002[1] = 1737;
         var10002[2] = 1738;
         var10002[3] = 1739;
         var10002[4] = 1740;
         var10002[5] = 1741;
         var10002[6] = 1742;
         var10002[7] = 1743;
         var10002[8] = 1744;
         var10002[9] = 1745;
         var10002[10] = 1746;
         var10002[11] = 1747;
         var10002[12] = 1748;
         var10002[13] = 1749;
         var10002[14] = 1750;
         var10002[15] = 1751;
         var10002[16] = 1752;
         String[] var4;
         String[] var5 = var4 = new String[17];
         var5[0] = "glIsRenderbufferEXT";
         var5[1] = "glBindRenderbufferEXT";
         var5[2] = "glDeleteRenderbuffersEXT";
         var5[3] = "glGenRenderbuffersEXT";
         var5[4] = "glRenderbufferStorageEXT";
         var5[5] = "glGetRenderbufferParameterivEXT";
         var5[6] = "glIsFramebufferEXT";
         var5[7] = "glBindFramebufferEXT";
         var5[8] = "glDeleteFramebuffersEXT";
         var5[9] = "glGenFramebuffersEXT";
         var5[10] = "glCheckFramebufferStatusEXT";
         var5[11] = "glFramebufferTexture1DEXT";
         var5[12] = "glFramebufferTexture2DEXT";
         var5[13] = "glFramebufferTexture3DEXT";
         var5[14] = "glFramebufferRenderbufferEXT";
         var5[15] = "glGetFramebufferAttachmentParameterivEXT";
         var5[16] = "glGenerateMipmapEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_framebuffer_object");
      }
   }

   private static boolean check_EXT_geometry_shader4(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_geometry_shader4")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 1753;
         var10002[1] = 1754;
         var10002[2] = 1755;
         var10002[3] = 1756;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glProgramParameteriEXT";
         var5[1] = "glFramebufferTextureEXT";
         var5[2] = "glFramebufferTextureLayerEXT";
         var5[3] = "glFramebufferTextureFaceEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_geometry_shader4");
      }
   }

   private static boolean check_EXT_gpu_program_parameters(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_gpu_program_parameters")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1757;
         var10002[1] = 1758;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glProgramEnvParameters4fvEXT";
         var5[1] = "glProgramLocalParameters4fvEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_gpu_program_parameters");
      }
   }

   private static boolean check_EXT_gpu_shader4(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_gpu_shader4")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[34])[0] = 1759;
         var3[1] = 1760;
         var3[2] = 1761;
         var3[3] = 1762;
         var3[4] = 1763;
         var3[5] = 1764;
         var3[6] = 1765;
         var3[7] = 1766;
         var3[8] = 1767;
         var3[9] = 1768;
         var3[10] = 1769;
         var3[11] = 1770;
         var3[12] = 1771;
         var3[13] = 1772;
         var3[14] = 1773;
         var3[15] = 1774;
         var3[16] = 1775;
         var3[17] = 1776;
         var3[18] = 1777;
         var3[19] = 1778;
         var3[20] = 1779;
         var3[21] = 1780;
         var3[22] = 1781;
         var3[23] = 1782;
         var3[24] = 1783;
         var3[25] = 1784;
         var3[26] = 1785;
         var3[27] = 1786;
         var3[28] = 1787;
         var3[29] = 1788;
         var3[30] = 1789;
         var3[31] = 1790;
         var3[32] = 1791;
         var3[33] = 1792;
         String[] var4;
         (var4 = new String[34])[0] = "glVertexAttribI1iEXT";
         var4[1] = "glVertexAttribI2iEXT";
         var4[2] = "glVertexAttribI3iEXT";
         var4[3] = "glVertexAttribI4iEXT";
         var4[4] = "glVertexAttribI1uiEXT";
         var4[5] = "glVertexAttribI2uiEXT";
         var4[6] = "glVertexAttribI3uiEXT";
         var4[7] = "glVertexAttribI4uiEXT";
         var4[8] = "glVertexAttribI1ivEXT";
         var4[9] = "glVertexAttribI2ivEXT";
         var4[10] = "glVertexAttribI3ivEXT";
         var4[11] = "glVertexAttribI4ivEXT";
         var4[12] = "glVertexAttribI1uivEXT";
         var4[13] = "glVertexAttribI2uivEXT";
         var4[14] = "glVertexAttribI3uivEXT";
         var4[15] = "glVertexAttribI4uivEXT";
         var4[16] = "glVertexAttribI4bvEXT";
         var4[17] = "glVertexAttribI4svEXT";
         var4[18] = "glVertexAttribI4ubvEXT";
         var4[19] = "glVertexAttribI4usvEXT";
         var4[20] = "glVertexAttribIPointerEXT";
         var4[21] = "glGetVertexAttribIivEXT";
         var4[22] = "glGetVertexAttribIuivEXT";
         var4[23] = "glGetUniformuivEXT";
         var4[24] = "glBindFragDataLocationEXT";
         var4[25] = "glGetFragDataLocationEXT";
         var4[26] = "glUniform1uiEXT";
         var4[27] = "glUniform2uiEXT";
         var4[28] = "glUniform3uiEXT";
         var4[29] = "glUniform4uiEXT";
         var4[30] = "glUniform1uivEXT";
         var4[31] = "glUniform2uivEXT";
         var4[32] = "glUniform3uivEXT";
         var4[33] = "glUniform4uivEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_gpu_shader4");
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
         int[] var10002 = var3 = new int[19];
         var3[0] = 1793;
         var3[1] = 1794;
         var3[2] = 1795;
         var3[3] = 1796;
         var3[4] = 1797;
         var3[5] = 1798;
         var3[6] = 1799;
         var3[7] = 1800;
         var3[8] = 1801;
         var3[9] = 1802;
         var3[10] = 1803;
         var3[11] = 1804;
         var3[12] = var5 + 1805;
         var3[13] = var5 + 1806;
         var3[14] = var5 + 1807;
         var3[15] = var5 + 1808;
         var3[16] = var5 + 1809;
         var3[17] = 1810;
         var10002[18] = var5 + 1811;
         String[] var4;
         String[] var6 = var4 = new String[19];
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
         var6[17] = "glTexStorageMem1DEXT";
         var6[18] = "glTextureStorageMem1DEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_memory_object");
      }
   }

   private static boolean check_EXT_memory_object_fd(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_memory_object_fd")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1812;
         String[] var4;
         (var4 = new String[1])[0] = "glImportMemoryFdEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_memory_object_fd");
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
         var10002[0] = 1813;
         var10002[1] = 1814;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glImportMemoryWin32HandleEXT";
         var5[1] = "glImportMemoryWin32NameEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_memory_object_win32");
      }
   }

   private static boolean check_EXT_point_parameters(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_point_parameters")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1815;
         var10002[1] = 1816;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glPointParameterfEXT";
         var5[1] = "glPointParameterfvEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_point_parameters");
      }
   }

   private static boolean check_EXT_polygon_offset_clamp(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_polygon_offset_clamp")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1817;
         String[] var4;
         (var4 = new String[1])[0] = "glPolygonOffsetClampEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_polygon_offset_clamp");
      }
   }

   private static boolean check_EXT_provoking_vertex(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_provoking_vertex")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1818;
         String[] var4;
         (var4 = new String[1])[0] = "glProvokingVertexEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_provoking_vertex");
      }
   }

   private static boolean check_EXT_raster_multisample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_raster_multisample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1819;
         String[] var4;
         (var4 = new String[1])[0] = "glRasterSamplesEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_raster_multisample");
      }
   }

   private static boolean check_EXT_secondary_color(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_secondary_color")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[17];
         var10002[0] = 1820;
         var10002[1] = 1821;
         var10002[2] = 1822;
         var10002[3] = 1823;
         var10002[4] = 1824;
         var10002[5] = 1825;
         var10002[6] = 1826;
         var10002[7] = 1827;
         var10002[8] = 1828;
         var10002[9] = 1829;
         var10002[10] = 1830;
         var10002[11] = 1831;
         var10002[12] = 1832;
         var10002[13] = 1833;
         var10002[14] = 1834;
         var10002[15] = 1835;
         var10002[16] = 1836;
         String[] var4;
         String[] var5 = var4 = new String[17];
         var5[0] = "glSecondaryColor3bEXT";
         var5[1] = "glSecondaryColor3sEXT";
         var5[2] = "glSecondaryColor3iEXT";
         var5[3] = "glSecondaryColor3fEXT";
         var5[4] = "glSecondaryColor3dEXT";
         var5[5] = "glSecondaryColor3ubEXT";
         var5[6] = "glSecondaryColor3usEXT";
         var5[7] = "glSecondaryColor3uiEXT";
         var5[8] = "glSecondaryColor3bvEXT";
         var5[9] = "glSecondaryColor3svEXT";
         var5[10] = "glSecondaryColor3ivEXT";
         var5[11] = "glSecondaryColor3fvEXT";
         var5[12] = "glSecondaryColor3dvEXT";
         var5[13] = "glSecondaryColor3ubvEXT";
         var5[14] = "glSecondaryColor3usvEXT";
         var5[15] = "glSecondaryColor3uivEXT";
         var5[16] = "glSecondaryColorPointerEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_secondary_color");
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
         var10002[0] = 1793;
         var10002[1] = 1794;
         var10002[2] = 1837;
         var10002[3] = 1838;
         var10002[4] = 1839;
         var10002[5] = 1840;
         var10002[6] = 1841;
         var10002[7] = 1842;
         var10002[8] = 1843;
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
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_semaphore");
      }
   }

   private static boolean check_EXT_semaphore_fd(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_semaphore_fd")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1844;
         String[] var4;
         (var4 = new String[1])[0] = "glImportSemaphoreFdEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_semaphore_fd");
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
         var10002[0] = 1845;
         var10002[1] = 1846;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glImportSemaphoreWin32HandleEXT";
         var5[1] = "glImportSemaphoreWin32NameEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_semaphore_win32");
      }
   }

   private static boolean check_EXT_separate_shader_objects(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_separate_shader_objects")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 1847;
         var10002[1] = 1848;
         var10002[2] = 1849;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glUseShaderProgramEXT";
         var5[1] = "glActiveProgramEXT";
         var5[2] = "glCreateShaderProgramEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_separate_shader_objects");
      }
   }

   private static boolean check_EXT_shader_framebuffer_fetch_non_coherent(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_shader_framebuffer_fetch_non_coherent")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1850;
         String[] var4;
         (var4 = new String[1])[0] = "glFramebufferFetchBarrierEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_shader_framebuffer_fetch_non_coherent");
      }
   }

   private static boolean check_EXT_shader_image_load_store(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_shader_image_load_store")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1851;
         var10002[1] = 1852;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glBindImageTextureEXT";
         var5[1] = "glMemoryBarrierEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_shader_image_load_store");
      }
   }

   private static boolean check_EXT_stencil_clear_tag(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_stencil_clear_tag")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1853;
         String[] var4;
         (var4 = new String[1])[0] = "glStencilClearTagEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_stencil_clear_tag");
      }
   }

   private static boolean check_EXT_stencil_two_side(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_stencil_two_side")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1854;
         String[] var4;
         (var4 = new String[1])[0] = "glActiveStencilFaceEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_stencil_two_side");
      }
   }

   private static boolean check_EXT_texture_array(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_texture_array")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1755;
         String[] var4;
         (var4 = new String[1])[0] = "glFramebufferTextureLayerEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_texture_array");
      }
   }

   private static boolean check_EXT_texture_buffer_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_texture_buffer_object")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1855;
         String[] var4;
         (var4 = new String[1])[0] = "glTexBufferEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_texture_buffer_object");
      }
   }

   private static boolean check_EXT_texture_integer(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_texture_integer")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 1856;
         var10002[1] = 1857;
         var10002[2] = 1858;
         var10002[3] = 1859;
         var10002[4] = 1860;
         var10002[5] = 1861;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glClearColorIiEXT";
         var5[1] = "glClearColorIuiEXT";
         var5[2] = "glTexParameterIivEXT";
         var5[3] = "glTexParameterIuivEXT";
         var5[4] = "glGetTexParameterIivEXT";
         var5[5] = "glGetTexParameterIuivEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_texture_integer");
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
         var3[0] = 1862;
         var3[1] = 1863;
         var3[2] = 1864;
         var3[3] = var5 + 1375;
         var3[4] = var5 + 1376;
         var10002[5] = var5 + 1377;
         String[] var4;
         String[] var6 = var4 = new String[6];
         var6[0] = "glTexStorage1DEXT";
         var6[1] = "glTexStorage2DEXT";
         var6[2] = "glTexStorage3DEXT";
         var6[3] = "glTextureStorage1DEXT";
         var6[4] = "glTextureStorage2DEXT";
         var6[5] = "glTextureStorage3DEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_texture_storage");
      }
   }

   private static boolean check_EXT_timer_query(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_timer_query")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1865;
         var10002[1] = 1866;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glGetQueryObjecti64vEXT";
         var5[1] = "glGetQueryObjectui64vEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_timer_query");
      }
   }

   private static boolean check_EXT_transform_feedback(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_transform_feedback")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[9];
         var10002[0] = 1867;
         var10002[1] = 1868;
         var10002[2] = 1869;
         var10002[3] = 1870;
         var10002[4] = 1871;
         var10002[5] = 1872;
         var10002[6] = 1873;
         var10002[7] = 1595;
         var10002[8] = 1596;
         String[] var4;
         String[] var5 = var4 = new String[9];
         var5[0] = "glBindBufferRangeEXT";
         var5[1] = "glBindBufferOffsetEXT";
         var5[2] = "glBindBufferBaseEXT";
         var5[3] = "glBeginTransformFeedbackEXT";
         var5[4] = "glEndTransformFeedbackEXT";
         var5[5] = "glTransformFeedbackVaryingsEXT";
         var5[6] = "glGetTransformFeedbackVaryingEXT";
         var5[7] = "glGetIntegerIndexedvEXT";
         var5[8] = "glGetBooleanIndexedvEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_transform_feedback");
      }
   }

   private static boolean check_EXT_vertex_attrib_64bit(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_vertex_attrib_64bit")) {
         return false;
      } else {
         int var5;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[11];
         var3[0] = 1874;
         var3[1] = 1875;
         var3[2] = 1876;
         var3[3] = 1877;
         var3[4] = 1878;
         var3[5] = 1879;
         var3[6] = 1880;
         var3[7] = 1881;
         var3[8] = 1882;
         var3[9] = 1883;
         var10002[10] = var5 + 1384;
         String[] var4;
         String[] var6 = var4 = new String[11];
         var6[0] = "glVertexAttribL1dEXT";
         var6[1] = "glVertexAttribL2dEXT";
         var6[2] = "glVertexAttribL3dEXT";
         var6[3] = "glVertexAttribL4dEXT";
         var6[4] = "glVertexAttribL1dvEXT";
         var6[5] = "glVertexAttribL2dvEXT";
         var6[6] = "glVertexAttribL3dvEXT";
         var6[7] = "glVertexAttribL4dvEXT";
         var6[8] = "glVertexAttribLPointerEXT";
         var6[9] = "glGetVertexAttribLdvEXT";
         var6[10] = "glVertexArrayVertexAttribLOffsetEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_vertex_attrib_64bit");
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
         var10002[0] = 1884;
         var10002[1] = 1885;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glAcquireKeyedMutexWin32EXT";
         var5[1] = "glReleaseKeyedMutexWin32EXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_win32_keyed_mutex");
      }
   }

   private static boolean check_EXT_window_rectangles(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_window_rectangles")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1886;
         String[] var4;
         (var4 = new String[1])[0] = "glWindowRectanglesEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_window_rectangles");
      }
   }

   private static boolean check_EXT_x11_sync_object(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_EXT_x11_sync_object")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1887;
         String[] var4;
         (var4 = new String[1])[0] = "glImportSyncEXT";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_EXT_x11_sync_object");
      }
   }

   private static boolean check_GREMEDY_frame_terminator(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_GREMEDY_frame_terminator")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1888;
         String[] var4;
         (var4 = new String[1])[0] = "glFrameTerminatorGREMEDY";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_GREMEDY_frame_terminator");
      }
   }

   private static boolean check_GREMEDY_string_marker(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_GREMEDY_string_marker")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1889;
         String[] var4;
         (var4 = new String[1])[0] = "glStringMarkerGREMEDY";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_GREMEDY_string_marker");
      }
   }

   private static boolean check_INTEL_framebuffer_CMAA(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_INTEL_framebuffer_CMAA")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1890;
         String[] var4;
         (var4 = new String[1])[0] = "glApplyFramebufferAttachmentCMAAINTEL";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_INTEL_framebuffer_CMAA");
      }
   }

   private static boolean check_INTEL_map_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_INTEL_map_texture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 1891;
         var10002[1] = 1892;
         var10002[2] = 1893;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glSyncTextureINTEL";
         var5[1] = "glUnmapTexture2DINTEL";
         var5[2] = "glMapTexture2DINTEL";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_INTEL_map_texture");
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
         var10002[0] = 1894;
         var10002[1] = 1895;
         var10002[2] = 1896;
         var10002[3] = 1897;
         var10002[4] = 1898;
         var10002[5] = 1899;
         var10002[6] = 1900;
         var10002[7] = 1901;
         var10002[8] = 1902;
         var10002[9] = 1903;
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
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_INTEL_performance_query");
      }
   }

   private static boolean check_KHR_blend_equation_advanced(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_KHR_blend_equation_advanced")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1904;
         String[] var4;
         (var4 = new String[1])[0] = "glBlendBarrierKHR";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_KHR_blend_equation_advanced");
      }
   }

   private static boolean check_KHR_debug(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_KHR_debug")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[10];
         var10002[0] = 875;
         var10002[1] = 876;
         var10002[2] = 877;
         var10002[3] = 878;
         var10002[4] = 879;
         var10002[5] = 880;
         var10002[6] = 881;
         var10002[7] = 882;
         var10002[8] = 883;
         var10002[9] = 884;
         String[] var4;
         String[] var5 = var4 = new String[10];
         var5[0] = "glDebugMessageControl";
         var5[1] = "glDebugMessageInsert";
         var5[2] = "glDebugMessageCallback";
         var5[3] = "glGetDebugMessageLog";
         var5[4] = "glPushDebugGroup";
         var5[5] = "glPopDebugGroup";
         var5[6] = "glObjectLabel";
         var5[7] = "glGetObjectLabel";
         var5[8] = "glObjectPtrLabel";
         var5[9] = "glGetObjectPtrLabel";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_KHR_debug");
      }
   }

   private static boolean check_KHR_parallel_shader_compile(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_KHR_parallel_shader_compile")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1905;
         String[] var4;
         (var4 = new String[1])[0] = "glMaxShaderCompilerThreadsKHR";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_KHR_parallel_shader_compile");
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
         var10002[0] = 1024;
         var10002[1] = 1033;
         var10002[2] = 1040;
         var10002[3] = 1042;
         var10002[4] = 1043;
         String[] var4;
         String[] var5 = var4 = new String[5];
         var5[0] = "glGetGraphicsResetStatus";
         var5[1] = "glReadnPixels";
         var5[2] = "glGetnUniformfv";
         var5[3] = "glGetnUniformiv";
         var5[4] = "glGetnUniformuiv";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_KHR_robustness");
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
         var10002[0] = 1906;
         var10002[1] = 1907;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glFramebufferParameteriMESA";
         var5[1] = "glGetFramebufferParameterivMESA";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_MESA_framebuffer_flip_y");
      }
   }

   private static boolean check_NV_alpha_to_coverage_dither_control(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_alpha_to_coverage_dither_control")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1908;
         String[] var4;
         (var4 = new String[1])[0] = "glAlphaToCoverageDitherControlNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_alpha_to_coverage_dither_control");
      }
   }

   private static boolean check_NV_bindless_multi_draw_indirect(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_bindless_multi_draw_indirect")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1909;
         var10002[1] = 1910;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glMultiDrawArraysIndirectBindlessNV";
         var5[1] = "glMultiDrawElementsIndirectBindlessNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_bindless_multi_draw_indirect");
      }
   }

   private static boolean check_NV_bindless_multi_draw_indirect_count(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_bindless_multi_draw_indirect_count")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 1911;
         var10002[1] = 1912;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glMultiDrawArraysIndirectBindlessCountNV";
         var5[1] = "glMultiDrawElementsIndirectBindlessCountNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_bindless_multi_draw_indirect_count");
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
         var10002[0] = 1913;
         var10002[1] = 1914;
         var10002[2] = 1915;
         var10002[3] = 1916;
         var10002[4] = 1917;
         var10002[5] = 1918;
         var10002[6] = 1919;
         var10002[7] = 1920;
         var10002[8] = 1921;
         var10002[9] = 1922;
         var10002[10] = 1923;
         var10002[11] = 1924;
         var10002[12] = 1925;
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
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_bindless_texture");
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
         var10002[0] = 1926;
         var10002[1] = 1927;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glBlendParameteriNV";
         var5[1] = "glBlendBarrierNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_blend_equation_advanced");
      }
   }

   private static boolean check_NV_clip_space_w_scaling(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_clip_space_w_scaling")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1928;
         String[] var4;
         (var4 = new String[1])[0] = "glViewportPositionWScaleNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_clip_space_w_scaling");
      }
   }

   private static boolean check_NV_command_list(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_command_list")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[17];
         var10002[0] = 1929;
         var10002[1] = 1930;
         var10002[2] = 1931;
         var10002[3] = 1932;
         var10002[4] = 1933;
         var10002[5] = 1934;
         var10002[6] = 1935;
         var10002[7] = 1936;
         var10002[8] = 1937;
         var10002[9] = 1938;
         var10002[10] = 1939;
         var10002[11] = 1940;
         var10002[12] = 1941;
         var10002[13] = 1942;
         var10002[14] = 1943;
         var10002[15] = 1944;
         var10002[16] = 1945;
         String[] var4;
         String[] var5 = var4 = new String[17];
         var5[0] = "glCreateStatesNV";
         var5[1] = "glDeleteStatesNV";
         var5[2] = "glIsStateNV";
         var5[3] = "glStateCaptureNV";
         var5[4] = "glGetCommandHeaderNV";
         var5[5] = "glGetStageIndexNV";
         var5[6] = "glDrawCommandsNV";
         var5[7] = "glDrawCommandsAddressNV";
         var5[8] = "glDrawCommandsStatesNV";
         var5[9] = "glDrawCommandsStatesAddressNV";
         var5[10] = "glCreateCommandListsNV";
         var5[11] = "glDeleteCommandListsNV";
         var5[12] = "glIsCommandListNV";
         var5[13] = "glListDrawCommandsStatesClientNV";
         var5[14] = "glCommandListSegmentsNV";
         var5[15] = "glCompileCommandListNV";
         var5[16] = "glCallCommandListNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_command_list");
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
         var10002[0] = 1946;
         var10002[1] = 1947;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glBeginConditionalRenderNV";
         var5[1] = "glEndConditionalRenderNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_conditional_render");
      }
   }

   private static boolean check_NV_conservative_raster(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_conservative_raster")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1948;
         String[] var4;
         (var4 = new String[1])[0] = "glSubpixelPrecisionBiasNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_conservative_raster");
      }
   }

   private static boolean check_NV_conservative_raster_dilate(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_conservative_raster_dilate")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1949;
         String[] var4;
         (var4 = new String[1])[0] = "glConservativeRasterParameterfNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_conservative_raster_dilate");
      }
   }

   private static boolean check_NV_conservative_raster_pre_snap_triangles(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_conservative_raster_pre_snap_triangles")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1950;
         String[] var4;
         (var4 = new String[1])[0] = "glConservativeRasterParameteriNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_conservative_raster_pre_snap_triangles");
      }
   }

   private static boolean check_NV_copy_image(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_copy_image")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1951;
         String[] var4;
         (var4 = new String[1])[0] = "glCopyImageSubDataNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_copy_image");
      }
   }

   private static boolean check_NV_depth_buffer_float(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_depth_buffer_float")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 1952;
         var10002[1] = 1953;
         var10002[2] = 1954;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glDepthRangedNV";
         var5[1] = "glClearDepthdNV";
         var5[2] = "glDepthBoundsdNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_depth_buffer_float");
      }
   }

   private static boolean check_NV_draw_texture(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_draw_texture")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1955;
         String[] var4;
         (var4 = new String[1])[0] = "glDrawTextureNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_draw_texture");
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
         var10002[0] = 1956;
         var10002[1] = 1957;
         var10002[2] = 1958;
         var10002[3] = 1959;
         var10002[4] = 1960;
         String[] var4;
         String[] var5 = var4 = new String[5];
         var5[0] = "glDrawVkImageNV";
         var5[1] = "glGetVkProcAddrNV";
         var5[2] = "glWaitVkSemaphoreNV";
         var5[3] = "glSignalVkSemaphoreNV";
         var5[4] = "glSignalVkFenceNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_draw_vulkan_image");
      }
   }

   private static boolean check_NV_explicit_multisample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_explicit_multisample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 1961;
         var10002[1] = 1962;
         var10002[2] = 1963;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glGetMultisamplefvNV";
         var5[1] = "glSampleMaskIndexedNV";
         var5[2] = "glTexRenderbufferNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_explicit_multisample");
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
         var10002[0] = 1964;
         var10002[1] = 1965;
         var10002[2] = 1966;
         var10002[3] = 1967;
         var10002[4] = 1968;
         var10002[5] = 1969;
         var10002[6] = 1970;
         String[] var4;
         String[] var5 = var4 = new String[7];
         var5[0] = "glDeleteFencesNV";
         var5[1] = "glGenFencesNV";
         var5[2] = "glIsFenceNV";
         var5[3] = "glTestFenceNV";
         var5[4] = "glGetFenceivNV";
         var5[5] = "glFinishFenceNV";
         var5[6] = "glSetFenceNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_fence");
      }
   }

   private static boolean check_NV_fragment_coverage_to_color(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_fragment_coverage_to_color")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1971;
         String[] var4;
         (var4 = new String[1])[0] = "glFragmentCoverageColorNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_fragment_coverage_to_color");
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
         var10002[0] = 1819;
         var10002[1] = 1972;
         var10002[2] = 1973;
         var10002[3] = 1974;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glRasterSamplesEXT";
         var5[1] = "glCoverageModulationTableNV";
         var5[2] = "glGetCoverageModulationTableNV";
         var5[3] = "glCoverageModulationNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_framebuffer_mixed_samples");
      }
   }

   private static boolean check_NV_framebuffer_multisample_coverage(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_framebuffer_multisample_coverage")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 1975;
         String[] var4;
         (var4 = new String[1])[0] = "glRenderbufferStorageMultisampleCoverageNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_framebuffer_multisample_coverage");
      }
   }

   private static boolean check_NV_gpu_multicast(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_gpu_multicast")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[12];
         var10002[0] = 1976;
         var10002[1] = 1977;
         var10002[2] = 1978;
         var10002[3] = 1979;
         var10002[4] = 1980;
         var10002[5] = 1981;
         var10002[6] = 1982;
         var10002[7] = 1983;
         var10002[8] = 1984;
         var10002[9] = 1985;
         var10002[10] = 1986;
         var10002[11] = 1987;
         String[] var4;
         String[] var5 = var4 = new String[12];
         var5[0] = "glRenderGpuMaskNV";
         var5[1] = "glMulticastBufferSubDataNV";
         var5[2] = "glMulticastCopyBufferSubDataNV";
         var5[3] = "glMulticastCopyImageSubDataNV";
         var5[4] = "glMulticastBlitFramebufferNV";
         var5[5] = "glMulticastFramebufferSampleLocationsfvNV";
         var5[6] = "glMulticastBarrierNV";
         var5[7] = "glMulticastWaitSyncNV";
         var5[8] = "glMulticastGetQueryObjectivNV";
         var5[9] = "glMulticastGetQueryObjectuivNV";
         var5[10] = "glMulticastGetQueryObjecti64vNV";
         var5[11] = "glMulticastGetQueryObjectui64vNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_gpu_multicast");
      }
   }

   private static boolean check_NV_gpu_shader5(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_gpu_shader5")) {
         return false;
      } else {
         int var21;
         if (var2.contains("GL_EXT_direct_state_access")) {
            var21 = 0;
         } else {
            var21 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[34])[0] = 1058;
         var3[1] = 1059;
         var3[2] = 1060;
         var3[3] = 1061;
         var3[4] = 1062;
         var3[5] = 1063;
         var3[6] = 1064;
         var3[7] = 1065;
         var3[8] = 1066;
         var3[9] = 1067;
         var3[10] = 1068;
         var3[11] = 1069;
         var3[12] = 1070;
         var3[13] = 1071;
         var3[14] = 1072;
         var3[15] = 1073;
         var3[16] = 1074;
         var3[17] = 1075;
         int var4 = var21 + 1076;
         var3[18] = var4;
         var4 = var21 + 1077;
         var3[19] = var4;
         var4 = var21 + 1078;
         var3[20] = var4;
         var4 = var21 + 1079;
         var3[21] = var4;
         var4 = var21 + 1080;
         var3[22] = var4;
         var4 = var21 + 1081;
         var3[23] = var4;
         var4 = var21 + 1082;
         var3[24] = var4;
         var4 = var21 + 1083;
         var3[25] = var4;
         var4 = var21 + 1084;
         var3[26] = var4;
         var4 = var21 + 1085;
         var3[27] = var4;
         var4 = var21 + 1086;
         var3[28] = var4;
         var4 = var21 + 1087;
         var3[29] = var4;
         var4 = var21 + 1088;
         var3[30] = var4;
         var4 = var21 + 1089;
         var3[31] = var4;
         var4 = var21 + 1090;
         var3[32] = var4;
         var4 = var21 + 1091;
         var3[33] = var4;
         String[] var20;
         (var20 = new String[34])[0] = "glUniform1i64NV";
         var20[1] = "glUniform2i64NV";
         var20[2] = "glUniform3i64NV";
         var20[3] = "glUniform4i64NV";
         var20[4] = "glUniform1i64vNV";
         var20[5] = "glUniform2i64vNV";
         var20[6] = "glUniform3i64vNV";
         var20[7] = "glUniform4i64vNV";
         var20[8] = "glUniform1ui64NV";
         var20[9] = "glUniform2ui64NV";
         var20[10] = "glUniform3ui64NV";
         var20[11] = "glUniform4ui64NV";
         var20[12] = "glUniform1ui64vNV";
         var20[13] = "glUniform2ui64vNV";
         var20[14] = "glUniform3ui64vNV";
         var20[15] = "glUniform4ui64vNV";
         var20[16] = "glGetUniformi64vNV";
         var20[17] = "glGetUniformui64vNV";
         var20[18] = "glProgramUniform1i64NV";
         var20[19] = "glProgramUniform2i64NV";
         var20[20] = "glProgramUniform3i64NV";
         var20[21] = "glProgramUniform4i64NV";
         var20[22] = "glProgramUniform1i64vNV";
         var20[23] = "glProgramUniform2i64vNV";
         var20[24] = "glProgramUniform3i64vNV";
         var20[25] = "glProgramUniform4i64vNV";
         var20[26] = "glProgramUniform1ui64NV";
         var20[27] = "glProgramUniform2ui64NV";
         var20[28] = "glProgramUniform3ui64NV";
         var20[29] = "glProgramUniform4ui64NV";
         var20[30] = "glProgramUniform1ui64vNV";
         var20[31] = "glProgramUniform2ui64vNV";
         var20[32] = "glProgramUniform3ui64vNV";
         var20[33] = "glProgramUniform4ui64vNV";
         return Checks.checkFunctions(var10000, var10001, var3, var20) || Checks.reportMissing("GL", "GL_NV_gpu_shader5");
      }
   }

   private static boolean check_NV_half_float(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_half_float")) {
         return false;
      } else {
         int var3;
         if (var2.contains("GL_EXT_fog_coord")) {
            var3 = 0;
         } else {
            var3 = Integer.MIN_VALUE;
         }

         int var4;
         if (var2.contains("GL_EXT_secondary_color")) {
            var4 = 0;
         } else {
            var4 = Integer.MIN_VALUE;
         }

         int var5;
         if (var2.contains("GL_EXT_vertex_weighting")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         int var26;
         if (var2.contains("GL_NV_vertex_program")) {
            var26 = 0;
         } else {
            var26 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var6;
         (var6 = new int[46])[0] = 1988;
         var6[1] = 1989;
         var6[2] = 1990;
         var6[3] = 1991;
         var6[4] = 1992;
         var6[5] = 1993;
         var6[6] = 1994;
         var6[7] = 1995;
         var6[8] = 1996;
         var6[9] = 1997;
         var6[10] = 1998;
         var6[11] = 1999;
         var6[12] = 2000;
         var6[13] = 2001;
         var6[14] = 2002;
         var6[15] = 2003;
         var6[16] = 2004;
         var6[17] = 2005;
         var6[18] = 2006;
         var6[19] = 2007;
         var6[20] = 2008;
         var6[21] = 2009;
         var6[22] = 2010;
         var6[23] = 2011;
         var6[24] = 2012;
         var6[25] = 2013;
         var6[26] = 2014;
         var6[27] = 2015;
         int var7 = var3 + 2016;
         var6[28] = var7;
         var7 = var3 + 2017;
         var6[29] = var7;
         var7 = var4 + 2018;
         var6[30] = var7;
         var7 = var4 + 2019;
         var6[31] = var7;
         var7 = var5 + 2020;
         var6[32] = var7;
         var7 = var5 + 2021;
         var6[33] = var7;
         var7 = var26 + 2022;
         var6[34] = var7;
         var7 = var26 + 2023;
         var6[35] = var7;
         var7 = var26 + 2024;
         var6[36] = var7;
         var7 = var26 + 2025;
         var6[37] = var7;
         var7 = var26 + 2026;
         var6[38] = var7;
         var7 = var26 + 2027;
         var6[39] = var7;
         var7 = var26 + 2028;
         var6[40] = var7;
         var7 = var26 + 2029;
         var6[41] = var7;
         var7 = var26 + 2030;
         var6[42] = var7;
         var7 = var26 + 2031;
         var6[43] = var7;
         var7 = var26 + 2032;
         var6[44] = var7;
         var7 = var26 + 2033;
         var6[45] = var7;
         String[] var25;
         (var25 = new String[46])[0] = "glVertex2hNV";
         var25[1] = "glVertex2hvNV";
         var25[2] = "glVertex3hNV";
         var25[3] = "glVertex3hvNV";
         var25[4] = "glVertex4hNV";
         var25[5] = "glVertex4hvNV";
         var25[6] = "glNormal3hNV";
         var25[7] = "glNormal3hvNV";
         var25[8] = "glColor3hNV";
         var25[9] = "glColor3hvNV";
         var25[10] = "glColor4hNV";
         var25[11] = "glColor4hvNV";
         var25[12] = "glTexCoord1hNV";
         var25[13] = "glTexCoord1hvNV";
         var25[14] = "glTexCoord2hNV";
         var25[15] = "glTexCoord2hvNV";
         var25[16] = "glTexCoord3hNV";
         var25[17] = "glTexCoord3hvNV";
         var25[18] = "glTexCoord4hNV";
         var25[19] = "glTexCoord4hvNV";
         var25[20] = "glMultiTexCoord1hNV";
         var25[21] = "glMultiTexCoord1hvNV";
         var25[22] = "glMultiTexCoord2hNV";
         var25[23] = "glMultiTexCoord2hvNV";
         var25[24] = "glMultiTexCoord3hNV";
         var25[25] = "glMultiTexCoord3hvNV";
         var25[26] = "glMultiTexCoord4hNV";
         var25[27] = "glMultiTexCoord4hvNV";
         var25[28] = "glFogCoordhNV";
         var25[29] = "glFogCoordhvNV";
         var25[30] = "glSecondaryColor3hNV";
         var25[31] = "glSecondaryColor3hvNV";
         var25[32] = "glVertexWeighthNV";
         var25[33] = "glVertexWeighthvNV";
         var25[34] = "glVertexAttrib1hNV";
         var25[35] = "glVertexAttrib1hvNV";
         var25[36] = "glVertexAttrib2hNV";
         var25[37] = "glVertexAttrib2hvNV";
         var25[38] = "glVertexAttrib3hNV";
         var25[39] = "glVertexAttrib3hvNV";
         var25[40] = "glVertexAttrib4hNV";
         var25[41] = "glVertexAttrib4hvNV";
         var25[42] = "glVertexAttribs1hvNV";
         var25[43] = "glVertexAttribs2hvNV";
         var25[44] = "glVertexAttribs3hvNV";
         var25[45] = "glVertexAttribs4hvNV";
         return Checks.checkFunctions(var10000, var10001, var6, var25) || Checks.reportMissing("GL", "GL_NV_half_float");
      }
   }

   private static boolean check_NV_internalformat_sample_query(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_internalformat_sample_query")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 2034;
         String[] var4;
         (var4 = new String[1])[0] = "glGetInternalformatSampleivNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_internalformat_sample_query");
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
         var3[0] = 2035;
         var3[1] = 2036;
         var3[2] = 2037;
         var3[3] = 2038;
         var3[4] = var5 + 2039;
         var10002[5] = var5 + 2040;
         String[] var4;
         String[] var6 = var4 = new String[6];
         var6[0] = "glGetMemoryObjectDetachedResourcesuivNV";
         var6[1] = "glResetMemoryObjectParameterNV";
         var6[2] = "glTexAttachMemoryNV";
         var6[3] = "glBufferAttachMemoryNV";
         var6[4] = "glTextureAttachMemoryNV";
         var6[5] = "glNamedBufferAttachMemoryNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_memory_attachment");
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
         var10002[0] = 2041;
         var10002[1] = 2042;
         var10002[2] = 2043;
         var10002[3] = 2044;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glBufferPageCommitmentMemNV";
         var5[1] = "glNamedBufferPageCommitmentMemNV";
         var5[2] = "glTexPageCommitmentMemNV";
         var5[3] = "glTexturePageCommitmentMemNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_memory_object_sparse");
      }
   }

   private static boolean check_NV_mesh_shader(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_mesh_shader")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 2045;
         var10002[1] = 2046;
         var10002[2] = 2047;
         var10002[3] = 2048;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glDrawMeshTasksNV";
         var5[1] = "glDrawMeshTasksIndirectNV";
         var5[2] = "glMultiDrawMeshTasksIndirectNV";
         var5[3] = "glMultiDrawMeshTasksIndirectCountNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_mesh_shader");
      }
   }

   private static boolean check_NV_path_rendering(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_path_rendering")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[41])[0] = 2049;
         var3[1] = 2050;
         var3[2] = 2051;
         var3[3] = 2052;
         var3[4] = 2053;
         var3[5] = 2054;
         var3[6] = 2055;
         var3[7] = 2058;
         var3[8] = 2060;
         var3[9] = 2061;
         var3[10] = 2062;
         var3[11] = 2063;
         var3[12] = 2064;
         var3[13] = 2065;
         var3[14] = 2066;
         var3[15] = 2067;
         var3[16] = 2068;
         var3[17] = 2069;
         var3[18] = 2070;
         var3[19] = 2071;
         var3[20] = 2072;
         var3[21] = 2073;
         var3[22] = 2074;
         var3[23] = 2075;
         var3[24] = 2076;
         var3[25] = 2080;
         var3[26] = 2081;
         var3[27] = 2082;
         var3[28] = 2083;
         var3[29] = 2090;
         var3[30] = 2091;
         var3[31] = 2092;
         var3[32] = 2093;
         var3[33] = 2094;
         var3[34] = 2095;
         var3[35] = 2096;
         var3[36] = 2097;
         var3[37] = 2102;
         var3[38] = 2103;
         var3[39] = 2104;
         var3[40] = 2105;
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
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_path_rendering");
      }
   }

   private static boolean check_NV_pixel_data_range(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_pixel_data_range")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 2113;
         var10002[1] = 2114;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glPixelDataRangeNV";
         var5[1] = "glFlushPixelDataRangeNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_pixel_data_range");
      }
   }

   private static boolean check_NV_point_sprite(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_point_sprite")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 2115;
         var10002[1] = 2116;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glPointParameteriNV";
         var5[1] = "glPointParameterivNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_point_sprite");
      }
   }

   private static boolean check_NV_primitive_restart(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_primitive_restart")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 2117;
         var10002[1] = 2118;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glPrimitiveRestartNV";
         var5[1] = "glPrimitiveRestartIndexNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_primitive_restart");
      }
   }

   private static boolean check_NV_query_resource(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_query_resource")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 2119;
         String[] var4;
         (var4 = new String[1])[0] = "glQueryResourceNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_query_resource");
      }
   }

   private static boolean check_NV_query_resource_tag(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_query_resource_tag")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[3];
         var10002[0] = 2120;
         var10002[1] = 2121;
         var10002[2] = 2122;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glGenQueryResourceTagNV";
         var5[1] = "glDeleteQueryResourceTagNV";
         var5[2] = "glQueryResourceTagNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_query_resource_tag");
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
         var10002[0] = 2123;
         var10002[1] = 2124;
         var10002[2] = 2125;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glFramebufferSampleLocationsfvNV";
         var5[1] = "glNamedFramebufferSampleLocationsfvNV";
         var5[2] = "glResolveDepthValuesNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_sample_locations");
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
         var10002[0] = 2126;
         var10002[1] = 2127;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glScissorExclusiveArrayvNV";
         var5[1] = "glScissorExclusiveNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_scissor_exclusive");
      }
   }

   private static boolean check_NV_shader_buffer_load(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_shader_buffer_load")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[14];
         var10002[0] = 2128;
         var10002[1] = 2129;
         var10002[2] = 2130;
         var10002[3] = 2131;
         var10002[4] = 2132;
         var10002[5] = 2133;
         var10002[6] = 2134;
         var10002[7] = 2135;
         var10002[8] = 2136;
         var10002[9] = 2137;
         var10002[10] = 2138;
         var10002[11] = 1075;
         var10002[12] = 2139;
         var10002[13] = 2140;
         String[] var4;
         String[] var5 = var4 = new String[14];
         var5[0] = "glMakeBufferResidentNV";
         var5[1] = "glMakeBufferNonResidentNV";
         var5[2] = "glIsBufferResidentNV";
         var5[3] = "glMakeNamedBufferResidentNV";
         var5[4] = "glMakeNamedBufferNonResidentNV";
         var5[5] = "glIsNamedBufferResidentNV";
         var5[6] = "glGetBufferParameterui64vNV";
         var5[7] = "glGetNamedBufferParameterui64vNV";
         var5[8] = "glGetIntegerui64vNV";
         var5[9] = "glUniformui64NV";
         var5[10] = "glUniformui64vNV";
         var5[11] = "glGetUniformui64vNV";
         var5[12] = "glProgramUniformui64NV";
         var5[13] = "glProgramUniformui64vNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_shader_buffer_load");
      }
   }

   private static boolean check_NV_shading_rate_image(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_shading_rate_image")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[7];
         var10002[0] = 2141;
         var10002[1] = 2142;
         var10002[2] = 2143;
         var10002[3] = 2144;
         var10002[4] = 2145;
         var10002[5] = 2146;
         var10002[6] = 2147;
         String[] var4;
         String[] var5 = var4 = new String[7];
         var5[0] = "glBindShadingRateImageNV";
         var5[1] = "glShadingRateImagePaletteNV";
         var5[2] = "glGetShadingRateImagePaletteNV";
         var5[3] = "glShadingRateImageBarrierNV";
         var5[4] = "glShadingRateSampleOrderNV";
         var5[5] = "glShadingRateSampleOrderCustomNV";
         var5[6] = "glGetShadingRateSampleLocationivNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_shading_rate_image");
      }
   }

   private static boolean check_NV_texture_barrier(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_texture_barrier")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 2148;
         String[] var4;
         (var4 = new String[1])[0] = "glTextureBarrierNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_texture_barrier");
      }
   }

   private static boolean check_NV_texture_multisample(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_texture_multisample")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 2149;
         var10002[1] = 2150;
         var10002[2] = 2151;
         var10002[3] = 2152;
         var10002[4] = 2153;
         var10002[5] = 2154;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glTexImage2DMultisampleCoverageNV";
         var5[1] = "glTexImage3DMultisampleCoverageNV";
         var5[2] = "glTextureImage2DMultisampleNV";
         var5[3] = "glTextureImage3DMultisampleNV";
         var5[4] = "glTextureImage2DMultisampleCoverageNV";
         var5[5] = "glTextureImage3DMultisampleCoverageNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_texture_multisample");
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
         var10002[0] = 2155;
         var10002[1] = 2156;
         var10002[2] = 2157;
         String[] var4;
         String[] var5 = var4 = new String[3];
         var5[0] = "glCreateSemaphoresNV";
         var5[1] = "glSemaphoreParameterivNV";
         var5[2] = "glGetSemaphoreParameterivNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_timeline_semaphore");
      }
   }

   private static boolean check_NV_transform_feedback(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_transform_feedback")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[12];
         var10002[0] = 2158;
         var10002[1] = 2159;
         var10002[2] = 2160;
         var10002[3] = 2161;
         var10002[4] = 2162;
         var10002[5] = 2163;
         var10002[6] = 2164;
         var10002[7] = 2165;
         var10002[8] = 2166;
         var10002[9] = 2167;
         var10002[10] = 2168;
         var10002[11] = 2169;
         String[] var4;
         String[] var5 = var4 = new String[12];
         var5[0] = "glBeginTransformFeedbackNV";
         var5[1] = "glEndTransformFeedbackNV";
         var5[2] = "glTransformFeedbackAttribsNV";
         var5[3] = "glBindBufferRangeNV";
         var5[4] = "glBindBufferOffsetNV";
         var5[5] = "glBindBufferBaseNV";
         var5[6] = "glTransformFeedbackVaryingsNV";
         var5[7] = "glActiveVaryingNV";
         var5[8] = "glGetVaryingLocationNV";
         var5[9] = "glGetActiveVaryingNV";
         var5[10] = "glGetTransformFeedbackVaryingNV";
         var5[11] = "glTransformFeedbackStreamAttribsNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_transform_feedback");
      }
   }

   private static boolean check_NV_transform_feedback2(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_transform_feedback2")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[7];
         var10002[0] = 2170;
         var10002[1] = 2171;
         var10002[2] = 2172;
         var10002[3] = 2173;
         var10002[4] = 2174;
         var10002[5] = 2175;
         var10002[6] = 2176;
         String[] var4;
         String[] var5 = var4 = new String[7];
         var5[0] = "glBindTransformFeedbackNV";
         var5[1] = "glDeleteTransformFeedbacksNV";
         var5[2] = "glGenTransformFeedbacksNV";
         var5[3] = "glIsTransformFeedbackNV";
         var5[4] = "glPauseTransformFeedbackNV";
         var5[5] = "glResumeTransformFeedbackNV";
         var5[6] = "glDrawTransformFeedbackNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_transform_feedback2");
      }
   }

   private static boolean check_NV_vertex_array_range(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_vertex_array_range")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 2177;
         var10002[1] = 2178;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glVertexArrayRangeNV";
         var5[1] = "glFlushVertexArrayRangeNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_vertex_array_range");
      }
   }

   private static boolean check_NV_vertex_attrib_integer_64bit(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_vertex_attrib_integer_64bit")) {
         return false;
      } else {
         int var5;
         if (var2.contains("GL_NV_vertex_buffer_unified_memory")) {
            var5 = 0;
         } else {
            var5 = Integer.MIN_VALUE;
         }

         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[19];
         var3[0] = 2179;
         var3[1] = 2180;
         var3[2] = 2181;
         var3[3] = 2182;
         var3[4] = 2183;
         var3[5] = 2184;
         var3[6] = 2185;
         var3[7] = 2186;
         var3[8] = 2187;
         var3[9] = 2188;
         var3[10] = 2189;
         var3[11] = 2190;
         var3[12] = 2191;
         var3[13] = 2192;
         var3[14] = 2193;
         var3[15] = 2194;
         var3[16] = 2195;
         var3[17] = 2196;
         var10002[18] = var5 + 2197;
         String[] var4;
         String[] var6 = var4 = new String[19];
         var6[0] = "glVertexAttribL1i64NV";
         var6[1] = "glVertexAttribL2i64NV";
         var6[2] = "glVertexAttribL3i64NV";
         var6[3] = "glVertexAttribL4i64NV";
         var6[4] = "glVertexAttribL1i64vNV";
         var6[5] = "glVertexAttribL2i64vNV";
         var6[6] = "glVertexAttribL3i64vNV";
         var6[7] = "glVertexAttribL4i64vNV";
         var6[8] = "glVertexAttribL1ui64NV";
         var6[9] = "glVertexAttribL2ui64NV";
         var6[10] = "glVertexAttribL3ui64NV";
         var6[11] = "glVertexAttribL4ui64NV";
         var6[12] = "glVertexAttribL1ui64vNV";
         var6[13] = "glVertexAttribL2ui64vNV";
         var6[14] = "glVertexAttribL3ui64vNV";
         var6[15] = "glVertexAttribL4ui64vNV";
         var6[16] = "glGetVertexAttribLi64vNV";
         var6[17] = "glGetVertexAttribLui64vNV";
         var6[18] = "glVertexAttribLFormatNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_vertex_attrib_integer_64bit");
      }
   }

   private static boolean check_NV_vertex_buffer_unified_memory(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_vertex_buffer_unified_memory")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[12];
         var10002[0] = 2198;
         var10002[1] = 2199;
         var10002[2] = 2200;
         var10002[3] = 2201;
         var10002[4] = 2202;
         var10002[5] = 2203;
         var10002[6] = 2204;
         var10002[7] = 2205;
         var10002[8] = 2206;
         var10002[9] = 2207;
         var10002[10] = 2208;
         var10002[11] = 2209;
         String[] var4;
         String[] var5 = var4 = new String[12];
         var5[0] = "glBufferAddressRangeNV";
         var5[1] = "glVertexFormatNV";
         var5[2] = "glNormalFormatNV";
         var5[3] = "glColorFormatNV";
         var5[4] = "glIndexFormatNV";
         var5[5] = "glTexCoordFormatNV";
         var5[6] = "glEdgeFlagFormatNV";
         var5[7] = "glSecondaryColorFormatNV";
         var5[8] = "glFogCoordFormatNV";
         var5[9] = "glVertexAttribFormatNV";
         var5[10] = "glVertexAttribIFormatNV";
         var5[11] = "glGetIntegerui64i_vNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_vertex_buffer_unified_memory");
      }
   }

   private static boolean check_NV_viewport_swizzle(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NV_viewport_swizzle")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         (var3 = new int[1])[0] = 2210;
         String[] var4;
         (var4 = new String[1])[0] = "glViewportSwizzleNV";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NV_viewport_swizzle");
      }
   }

   private static boolean check_NVX_conditional_render(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NVX_conditional_render")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[2];
         var10002[0] = 2211;
         var10002[1] = 2212;
         String[] var4;
         String[] var5 = var4 = new String[2];
         var5[0] = "glBeginConditionalRenderNVX";
         var5[1] = "glEndConditionalRenderNVX";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NVX_conditional_render");
      }
   }

   private static boolean check_NVX_gpu_multicast2(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NVX_gpu_multicast2")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[6];
         var10002[0] = 2213;
         var10002[1] = 2214;
         var10002[2] = 2215;
         var10002[3] = 2216;
         var10002[4] = 2217;
         var10002[5] = 2218;
         String[] var4;
         String[] var5 = var4 = new String[6];
         var5[0] = "glAsyncCopyImageSubDataNVX";
         var5[1] = "glAsyncCopyBufferSubDataNVX";
         var5[2] = "glUploadGpuMaskNVX";
         var5[3] = "glMulticastViewportArrayvNVX";
         var5[4] = "glMulticastScissorArrayvNVX";
         var5[5] = "glMulticastViewportPositionWScaleNVX";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NVX_gpu_multicast2");
      }
   }

   private static boolean check_NVX_progress_fence(FunctionProvider var0, PointerBuffer var1, Set var2) {
      if (!var2.contains("GL_NVX_progress_fence")) {
         return false;
      } else {
         FunctionProvider var10000 = var0;
         PointerBuffer var10001 = var1;
         int[] var3;
         int[] var10002 = var3 = new int[4];
         var10002[0] = 2219;
         var10002[1] = 2220;
         var10002[2] = 2221;
         var10002[3] = 2222;
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = "glCreateProgressFenceNVX";
         var5[1] = "glSignalSemaphoreui64NVX";
         var5[2] = "glWaitSemaphoreui64NVX";
         var5[3] = "glClientWaitSemaphoreui64NVX";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_NVX_progress_fence");
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
         var3[0] = 2223;
         var10002[1] = var5 + 2224;
         String[] var4;
         String[] var6 = var4 = new String[2];
         var6[0] = "glFramebufferTextureMultiviewOVR";
         var6[1] = "glNamedFramebufferTextureMultiviewOVR";
         return Checks.checkFunctions(var10000, var10001, var3, var4) || Checks.reportMissing("GL", "GL_OVR_multiview");
      }
   }

   private static boolean hasDSA(Set var0) {
      return var0.contains("GL45") || var0.contains("GL_ARB_direct_state_access") || var0.contains("GL_EXT_direct_state_access");
   }

   private static boolean ARB_framebuffer_object(Set var0) {
      return var0.contains("OpenGL30") || var0.contains("GL_ARB_framebuffer_object");
   }

   private static boolean ARB_map_buffer_range(Set var0) {
      return var0.contains("OpenGL30") || var0.contains("GL_ARB_map_buffer_range");
   }

   private static boolean ARB_vertex_array_object(Set var0) {
      return var0.contains("OpenGL30") || var0.contains("GL_ARB_vertex_array_object");
   }

   private static boolean ARB_copy_buffer(Set var0) {
      return var0.contains("OpenGL31") || var0.contains("GL_ARB_copy_buffer");
   }

   private static boolean ARB_texture_buffer_object(Set var0) {
      return var0.contains("OpenGL31") || var0.contains("GL_ARB_texture_buffer_object");
   }

   private static boolean ARB_uniform_buffer_object(Set var0) {
      return var0.contains("OpenGL31") || var0.contains("GL_ARB_uniform_buffer_object");
   }

   private static boolean ARB_instanced_arrays(Set var0) {
      return var0.contains("OpenGL33") || var0.contains("GL_ARB_instanced_arrays");
   }

   private static boolean ARB_sampler_objects(Set var0) {
      return var0.contains("OpenGL33") || var0.contains("GL_ARB_sampler_objects");
   }

   private static boolean ARB_transform_feedback2(Set var0) {
      return var0.contains("OpenGL40") || var0.contains("GL_ARB_transform_feedback2");
   }

   private static boolean ARB_vertex_attrib_64bit(Set var0) {
      return var0.contains("OpenGL41") || var0.contains("GL_ARB_vertex_attrib_64bit");
   }

   private static boolean ARB_separate_shader_objects(Set var0) {
      return var0.contains("OpenGL41") || var0.contains("GL_ARB_separate_shader_objects");
   }

   private static boolean ARB_texture_storage(Set var0) {
      return var0.contains("OpenGL42") || var0.contains("GL_ARB_texture_storage");
   }

   private static boolean ARB_texture_storage_multisample(Set var0) {
      return var0.contains("OpenGL43") || var0.contains("GL_ARB_texture_storage_multisample");
   }

   private static boolean ARB_vertex_attrib_binding(Set var0) {
      return var0.contains("OpenGL43") || var0.contains("GL_ARB_vertex_attrib_binding");
   }

   private static boolean ARB_invalidate_subdata(Set var0) {
      return var0.contains("OpenGL43") || var0.contains("GL_ARB_invalidate_subdata");
   }

   private static boolean ARB_texture_buffer_range(Set var0) {
      return var0.contains("OpenGL43") || var0.contains("GL_ARB_texture_buffer_range");
   }

   private static boolean ARB_clear_buffer_object(Set var0) {
      return var0.contains("OpenGL43") || var0.contains("GL_ARB_clear_buffer_object");
   }

   private static boolean ARB_framebuffer_no_attachments(Set var0) {
      return var0.contains("OpenGL43") || var0.contains("GL_ARB_framebuffer_no_attachments");
   }

   private static boolean ARB_buffer_storage(Set var0) {
      return var0.contains("OpenGL44") || var0.contains("GL_ARB_buffer_storage");
   }

   private static boolean ARB_clear_texture(Set var0) {
      return var0.contains("OpenGL44") || var0.contains("GL_ARB_clear_texture");
   }

   private static boolean ARB_multi_bind(Set var0) {
      return var0.contains("OpenGL44") || var0.contains("GL_ARB_multi_bind");
   }

   private static boolean ARB_query_buffer_object(Set var0) {
      return var0.contains("OpenGL44") || var0.contains("GL_ARB_query_buffer_object");
   }

   public PointerBuffer getAddressBuffer() {
      return this.addresses;
   }
}
