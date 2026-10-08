/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.glfw;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.Callback;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

public final class Callbacks {
    private Callbacks() {
    }

    public static void glfwFreeCallbacks(@NativeType(value="GLFWwindow *") long l) {
        long l2;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        int n = 17;
        long[] lArray = new long[17];
        long[] lArray2 = lArray;
        lArray[0] = l2 = GLFW.Functions.SetWindowPosCallback;
        lArray[1] = l2 = GLFW.Functions.SetWindowSizeCallback;
        lArray[2] = l2 = GLFW.Functions.SetWindowCloseCallback;
        lArray[3] = l2 = GLFW.Functions.SetWindowRefreshCallback;
        lArray[4] = l2 = GLFW.Functions.SetWindowFocusCallback;
        lArray[5] = l2 = GLFW.Functions.SetWindowIconifyCallback;
        lArray[6] = l2 = GLFW.Functions.SetWindowMaximizeCallback;
        lArray[7] = l2 = GLFW.Functions.SetFramebufferSizeCallback;
        lArray[8] = l2 = GLFW.Functions.SetWindowContentScaleCallback;
        lArray[9] = l2 = GLFW.Functions.SetKeyCallback;
        lArray[10] = l2 = GLFW.Functions.SetCharCallback;
        lArray[11] = l2 = GLFW.Functions.SetCharModsCallback;
        lArray[12] = l2 = GLFW.Functions.SetMouseButtonCallback;
        lArray[13] = l2 = GLFW.Functions.SetCursorPosCallback;
        lArray[14] = l2 = GLFW.Functions.SetCursorEnterCallback;
        lArray[15] = l2 = GLFW.Functions.SetScrollCallback;
        lArray[16] = l2 = GLFW.Functions.SetDropCallback;
        for (int j = 0; j < n; ++j) {
            long l3 = lArray2[j];
            if ((l3 = JNI.invokePPP(l, 0L, l3)) == 0L) continue;
            Callback.free(l3);
        }
    }
}

