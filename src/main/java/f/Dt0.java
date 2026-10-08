package f;

import com.badlogic.gdx.backends.lwjgl3.angle.ANGLELoader;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWWindowPosCallback;
import org.lwjgl.opengl.AMDDebugOutput;
import org.lwjgl.opengl.ARBDebugOutput;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.opengl.KHRDebug;
import org.lwjgl.opengles.GLES20;
import org.lwjgl.system.Callback;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.ThreadLocalUtil;
import cn.pokemmo.platform.desktop.glfw.GlfwApplicationLauncher;

/**
 * Shim: Dt0 -> GlfwApplicationLauncher
 * @see cn.pokemmo.platform.desktop.glfw.GlfwApplicationLauncher
 */
public class Dt0 extends GlfwApplicationLauncher {

    public Dt0(OR listener) { super(listener); }
    public Dt0(OR listener, DZ configuration) { super(listener, configuration); }

}
