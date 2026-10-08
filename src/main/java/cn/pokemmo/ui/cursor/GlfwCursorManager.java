package cn.pokemmo.ui.cursor;

import f.*;
import java.util.HashMap;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;

/**
 * 现代化重构类 - 原始类: f.hz0
 */
public class GlfwCursorManager implements fy0_0 {

    public static final es_1 HY;
    public static final HashMap ee0;
    public static int vi;
    public final Su0 yT;
    public i4_0 nM;
    public final GLFWImage If0;
    public final long FQ;

    public GlfwCursorManager(Su0 su0, i4_0 i40, int xHotspot, int yHotspot) {
        this.yT = su0;
        if (i40.rH0() != ix0_0.Vw) {
            throw new nf_1("Cursor image pixmap is not in RGBA8888 format.");
        }
        if ((i40.Sq0() & (i40.Sq0() - 1)) != 0) {
            throw new nf_1("Cursor image pixmap width of " + i40.Sq0() + " is not a power-of-two greater than zero.");
        }
        if ((i40.Oi() & (i40.Oi() - 1)) != 0) {
            throw new nf_1("Cursor image pixmap height of " + i40.Oi() + " is not a power-of-two greater than zero.");
        }
        if (xHotspot < 0 || xHotspot >= i40.Sq0()) {
            throw new nf_1("xHotspot coordinate of " + xHotspot + " is not within image width bounds: [0, " + i40.Sq0() + ").");
        }
        if (yHotspot < 0 || yHotspot >= i40.Oi()) {
            throw new nf_1("yHotspot coordinate of " + yHotspot + " is not within image height bounds: [0, " + i40.Oi() + ").");
        }

        this.nM = new i4_0(i40.Sq0(), i40.Oi(), ix0_0.Vw);
        this.nM.Pa0(DF0.Ha0);
        this.nM.NH0(i40, 0, 0);

        GLFWImage glfwImage = GLFWImage.malloc();
        this.If0 = glfwImage;
        glfwImage.width(this.nM.Sq0());
        glfwImage.height(this.nM.Oi());
        glfwImage.pixels(this.nM.Rh0());
        this.FQ = GLFW.glfwCreateCursor(glfwImage, xHotspot, yHotspot);
        HY.Ue0(this);
    }

    static {
        HY = new es_1();
        ee0 = new HashMap();
        vi = -1;
    }

    @Override
    public final void dispose() {
        if (this.nM != null) {
            HY.sj0(this, true);
            this.nM.dispose();
            this.nM = null;
            this.If0.free();
            GLFW.glfwDestroyCursor(this.FQ);
        } else {
            throw new nf_1("Cursor already disposed");
        }
    }
}
