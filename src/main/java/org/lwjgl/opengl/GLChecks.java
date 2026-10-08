/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.ARBDirectStateAccess;
import org.lwjgl.opengl.EXTDirectStateAccess;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL45;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.system.APIUtil;

final class GLChecks {
    private GLChecks() {
    }

    public static int typeToBytes(int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException(APIUtil.apiUnknownToken("Unsupported OpenGL type", n));
            }
            case 5130: 
            case 5134: 
            case 5135: {
                return 8;
            }
            case 5128: {
                return 3;
            }
            case 5124: 
            case 5125: 
            case 5126: 
            case 5129: 
            case 5132: {
                return 4;
            }
            case 5122: 
            case 5123: 
            case 5127: 
            case 5131: {
                return 2;
            }
            case 5120: 
            case 5121: 
        }
        return 1;
    }

    public static int typeToByteShift(int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException(APIUtil.apiUnknownToken("Unsupported OpenGL type", n));
            }
            case 5130: 
            case 5134: 
            case 5135: {
                return 3;
            }
            case 5124: 
            case 5125: 
            case 5126: 
            case 5129: 
            case 5132: {
                return 2;
            }
            case 5122: 
            case 5123: 
            case 5127: 
            case 5131: {
                return 1;
            }
            case 5120: 
            case 5121: 
        }
        return 0;
    }

    public static int getTexLevelParameteri(int n, int n2, int n3, int n4) {
        GLCapabilities gLCapabilities = GL.getCapabilities();
        if (gLCapabilities.OpenGL45) {
            return GL45.glGetTextureLevelParameteri(n, n3, n4);
        }
        if (gLCapabilities.GL_ARB_direct_state_access) {
            return ARBDirectStateAccess.glGetTextureLevelParameteri(n, n3, n4);
        }
        if (gLCapabilities.GL_EXT_direct_state_access) {
            return EXTDirectStateAccess.glGetTextureLevelParameteriEXT(n, n2, n3, n4);
        }
        return GL11.glGetTexLevelParameteri(n2, n3, n4);
    }
}

