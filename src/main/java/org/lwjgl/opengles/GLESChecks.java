/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.system.APIUtil;

final class GLESChecks {
    private GLESChecks() {
    }

    public static int typeToByteShift(int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException(APIUtil.apiUnknownToken("Unsupported OpenGL ES type", n));
            }
            case 5134: 
            case 5135: {
                return 3;
            }
            case 5124: 
            case 5125: 
            case 5126: 
            case 5132: {
                return 2;
            }
            case 5122: 
            case 5123: 
            case 5131: {
                return 1;
            }
            case 5120: 
            case 5121: 
        }
        return 0;
    }
}

