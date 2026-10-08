package cn.pokemmo.ui.client;

import f.IA;
import f.dw_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * 账号与热键栏位置变更属性监听器
 */
public class AccountPropertyChangeListener implements PropertyChangeListener {
    public final IA AQ;

    public AccountPropertyChangeListener(IA iA) {
        this.AQ = iA;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (!this.AQ.Yl) {
            return;
        }
        if ("x".equals(propertyChangeEvent.getPropertyName())) {
            int n;
            if (dw_2.aN != (n = this.AQ.A20)) {
                dw_2.aN = n;
                dw_2.Va = true;
            }
        } else if ("y".equals(propertyChangeEvent.getPropertyName())) {
            int n;
            if (dw_2.yL0 != (n = this.AQ.SB0)) {
                dw_2.yL0 = n;
                dw_2.Va = true;
            }
        }
    }
}
