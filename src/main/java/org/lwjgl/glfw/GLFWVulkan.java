package org.lwjgl.glfw;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Platform;
import org.lwjgl.system.SharedLibrary;
import org.lwjgl.vulkan.VkAllocationCallbacks;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkPhysicalDevice;

public class GLFWVulkan {
    public GLFWVulkan() {
        throw new UnsupportedOperationException();
    }

    public static void glfwInitVulkanLoader(long vkGetInstanceProcAddr) {
        JNI.invokePV(vkGetInstanceProcAddr, Functions.InitVulkanLoader);
    }

    public static boolean glfwVulkanSupported() {
        return JNI.invokeI(Functions.VulkanSupported) != 0;
    }

    public static long nglfwGetRequiredInstanceExtensions(long count) {
        return JNI.invokePP(count, Functions.GetRequiredInstanceExtensions);
    }

    public static PointerBuffer glfwGetRequiredInstanceExtensions() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            return MemoryUtil.memPointerBufferSafe(
                    nglfwGetRequiredInstanceExtensions(MemoryUtil.memAddress(count)), count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static long nglfwGetInstanceProcAddress(long instance, long name) {
        return JNI.invokePPP(instance, name, Functions.GetInstanceProcAddress);
    }

    public static long glfwGetInstanceProcAddress(VkInstance instance, ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nglfwGetInstanceProcAddress(MemoryUtil.memAddressSafe(instance), MemoryUtil.memAddress(name));
    }

    public static long glfwGetInstanceProcAddress(VkInstance instance, CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameAddress = stack.getPointerAddress();
            return nglfwGetInstanceProcAddress(MemoryUtil.memAddressSafe(instance), nameAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean glfwGetPhysicalDevicePresentationSupport(VkInstance instance, VkPhysicalDevice device,
                                                                     int queuefamily) {
        return JNI.invokePPI(instance.address(), device.address(), queuefamily,
                Functions.GetPhysicalDevicePresentationSupport) != 0;
    }

    public static int nglfwCreateWindowSurface(long instance, long window, long allocator, long surface) {
        if (Checks.CHECKS) {
            Checks.check(window);
        }
        return JNI.invokePPPPI(instance, window, allocator, surface, Functions.CreateWindowSurface);
    }

    public static int glfwCreateWindowSurface(VkInstance instance, long window, VkAllocationCallbacks allocator,
                                              LongBuffer surface) {
        if (Checks.CHECKS) {
            Checks.check(surface, 1);
        }
        return nglfwCreateWindowSurface(instance.address(), window, MemoryUtil.memAddressSafe(allocator),
                MemoryUtil.memAddress(surface));
    }

    public static int glfwCreateWindowSurface(VkInstance instance, long window, VkAllocationCallbacks allocator,
                                              long[] surface) {
        if (Checks.CHECKS) {
            Checks.check(window);
            Checks.check(surface, 1);
        }
        return JNI.invokePPPPI(instance.address(), window, MemoryUtil.memAddressSafe(allocator), surface,
                Functions.CreateWindowSurface);
    }

    public static void setPath(FunctionProvider provider) {
        if (!(provider instanceof SharedLibrary)) {
            APIUtil.apiLog("GLFW Vulkan path override not set: function provider is not a shared library.");
            return;
        }
        String path = ((SharedLibrary) provider).getPath();
        if (path == null) {
            APIUtil.apiLog("GLFW Vulkan path override not set: Could not resolve the shared library path.");
            return;
        }
        setPath(path);
    }

    public static void setPath(String path) {
        long symbol = GLFW.getLibrary().getFunctionAddress("_glfw_vulkan_library");
        if (symbol == 0L) {
            APIUtil.apiLog("GLFW Vulkan path override not set: Could not resolve override symbol.");
            return;
        }
        long oldPath = MemoryUtil.memGetAddress(symbol);
        if (oldPath != 0L) {
            MemoryUtil.nmemFree(oldPath);
        }
        long pathAddress = path == null ? 0L : MemoryUtil.memAddress(MemoryUtil.memUTF8(path));
        MemoryUtil.memPutAddress(symbol, pathAddress);
    }

    static {
        if (Platform.get() == Platform.MACOSX) {
            setPath(GLFW.getLibrary());
        }
    }

    public static final class Functions {
        public static final long InitVulkanLoader = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwInitVulkanLoader");
        public static final long VulkanSupported = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwVulkanSupported");
        public static final long GetRequiredInstanceExtensions = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetRequiredInstanceExtensions");
        public static final long GetInstanceProcAddress = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetInstanceProcAddress");
        public static final long GetPhysicalDevicePresentationSupport = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetPhysicalDevicePresentationSupport");
        public static final long CreateWindowSurface = APIUtil.apiGetFunctionAddress(GLFW.getLibrary(), "glfwCreateWindowSurface");

        private Functions() {
        }
    }
}
