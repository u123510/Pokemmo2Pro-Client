package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackS10 implements Runnable  {
    public final X90 IH0;
    public final ew0_0 ro0;
    public final cf_2 vw0;
    public final boolean G4;
    public final cn.pokemmo.graphics.sprite.GdxAddonSpriteManager d30;

    public TaskCallbackS10(cn.pokemmo.graphics.sprite.GdxAddonSpriteManager var1, X90 var2, ew0_0 var3, cf_2 var4, boolean var5) {
        this.d30 = var1;
        this.IH0 = var2;
        this.ro0 = var3;
        this.vw0 = var4;
        this.G4 = var5;
    }

    @Override
    public final void run() {
        this.d30.Xi(this.IH0, this.ro0, 1, this.vw0, this.G4);
    }
}
