package f;

import cn.pokemmo.scene.cutscene.Abstract3DCutsceneScene;

/**
 * 垫片类 (Backward compatibility shim)
 * 现代化实现: cn.pokemmo.scene.cutscene.Abstract3DCutsceneScene
 */
public class XD extends Abstract3DCutsceneScene {
    public XD(int scene, boolean repeat) { super(scene, repeat); }
    public static final vv0_0 COM2 = Abstract3DCutsceneScene.COM2;
    public static XD Xv(int scene, short ignored, boolean repeat) {
        return Abstract3DCutsceneScene.Xv(scene, ignored, repeat);
    }
    public static void P7(Xz0 node, String name) { Abstract3DCutsceneScene.P7(node, name); }
}
