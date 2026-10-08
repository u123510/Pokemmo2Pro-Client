package cn.pokemmo.ui.twl.theme;

import f.le0_2;
import f.ou_1;
import f.zk0_1;

/**
 * 界面时间源实现 (TintAnimator.GUITimeSource)
 */
public class TwlGuiTimeSource implements ou_1 {
    public final le0_2 owner;
    public long startTime;
    public boolean hasStarted;

    public TwlGuiTimeSource(le0_2 owner) {
        if (owner == null) {
            throw new NullPointerException("owner");
        }
        this.owner = owner;
        this.oM();
    }

    public le0_2 getOwner() {
        return this.owner;
    }

    @Override
    public int Oe() {
        zk0_1 gui = this.owner.Em0;
        if (gui != null) {
            if (this.hasStarted) {
                this.hasStarted = false;
                this.startTime = gui.ss0;
            }
            return (int) (gui.ss0 - this.startTime) & Integer.MAX_VALUE;
        }
        return 0;
    }

    @Override
    public void oM() {
        zk0_1 gui = this.owner.Em0;
        if (gui != null) {
            this.startTime = gui.ss0;
            this.hasStarted = false;
        } else {
            this.hasStarted = true;
        }
    }
}
