package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class ModelTestSlashCommand extends BaseSlashCommand {

    public ModelTestSlashCommand() {
        super("/modeltest");
    }

    public static void W7(String v0, int i1, boolean i2, int i3, eb0_1 v4) {
        for (Object obj : tw0_0.e60.pn0.values()) {
            bi0_1 bi0 = (bi0_1) obj;
            if (bi0.CI0()) {
                z2_0 z2 = (z2_0) bi0.uR();
                Ou0 ou0 = z2.Oy;
                if (ou0 != null) {
                    ou0.O4();
                    z2.Oy = null;
                }
            }
        }
        UT ut = UT.oV();
        String str = "dev/" + UT.UI0 + ".g3db";
        if (ut.NP.u70(str)) {
            ut.NP.Mj(str);
        }
        UT.m = true;
        UT.UI0 = v0;
        UT.e30 = (float) i1;
        UT.kw = v4;
    }

    @Override
    public void sr0(String[] v1) {
        if (v1.length < 2) {
            UT.m = false;
            tw0_0.rl.jC("用法: /modeltest [模型名] [缩放=64] [半透明=false] [细节层级=0] [过滤模式=Nearest]", zo_0.Dd);
            return;
        }
        String modelName = v1[1];
        if (modelName.isEmpty() || !modelName.matches("^[a-zA-Z0-9_\\-]+$")) {
            UT.m = false;
            return;
        }
        int scale = 64;
        if (v1.length > 2) {
            try {
                scale = Integer.parseInt(v1[2]);
            } catch (NumberFormatException ignored) {
                tw0_0.rl.jC("无效的缩放比例值。", zo_0.Dd);
            }
        }
        boolean transparency = false;
        if (v1.length > 3) {
            try {
                transparency = Boolean.parseBoolean(v1[3]);
            } catch (NumberFormatException ignored) {
                tw0_0.rl.jC("无效的透明度值。", zo_0.Dd);
            }
        }
        int lod = 0;
        if (v1.length > 4) {
            try {
                lod = Integer.parseInt(v1[4]);
            } catch (NumberFormatException ignored) {
                tw0_0.rl.jC("无效的细节层级 (LOD)。", zo_0.Dd);
            }
        }
        eb0_1 filter = eb0_1.Y30;
        if (v1.length > 5) {
            try {
                filter = eb0_1.valueOf(v1[5]);
            } catch (Exception ignored) {
                tw0_0.rl.jC("无效的过滤模式。", zo_0.Dd);
            }
        }
        tw0_0.rl.jC("已设置模型测试为: '" + modelName + "' 缩放比例: " + scale + " 半透明 = " + transparency + " 细节层级(LOD): " + lod + " 过滤模式: " + filter, zo_0.Dd);
        final int fScale = scale;
        final boolean fTransparency = transparency;
        final int fLod = lod;
        final eb0_1 fFilter = filter;
        if (UT.m) {
            UT.m = false;
            lg_0.k.lPT5(() -> W7(modelName, fScale, fTransparency, fLod, fFilter));
            return;
        }
        for (Object obj : tw0_0.e60.pn0.values()) {
            bi0_1 bi0 = (bi0_1) obj;
            if (bi0.CI0()) {
                ((z2_0) bi0.uR()).Oy = null;
            }
        }
        UT ut = UT.oV();
        String str = "dev/" + UT.UI0 + ".g3db";
        if (ut.NP.u70(str)) {
            ut.NP.Mj(str);
        }
        UT.m = true;
        UT.UI0 = modelName;
        UT.e30 = (float) scale;
        UT.kw = filter;
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
