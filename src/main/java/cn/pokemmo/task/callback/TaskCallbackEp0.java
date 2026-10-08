package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackEp0 implements Runnable  {
    public final X90 zA0;
    public final ew0_0 Rl;
    public final boolean qL0;
    public final cn.pokemmo.graphics.sprite.GdxAddonSpriteManager Ri0;

    public TaskCallbackEp0(cn.pokemmo.graphics.sprite.GdxAddonSpriteManager owner, X90 first, ew0_0 second, boolean enabled) {
        super();
        this.Ri0 = owner;
        this.zA0 = first;
        this.Rl = second;
        this.qL0 = enabled;
    }

    @Override
    public final void run() {
        this.Ri0.Xi(this.zA0, this.Rl, 0, null, this.qL0);
    }
}
