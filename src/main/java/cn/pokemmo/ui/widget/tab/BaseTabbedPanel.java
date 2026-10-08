package cn.pokemmo.ui.widget.tab;

import f.OA0;
import f.BU;

public abstract class BaseTabbedPanel extends OA0 {
    public BaseTabbedPanel(BU owner, byte mode) {
        super(owner, mode);
    }

    public BaseTabbedPanel(BU owner, byte mode, int confirmId, int cancelId) {
        super(owner, mode, confirmId, cancelId);
    }
}
