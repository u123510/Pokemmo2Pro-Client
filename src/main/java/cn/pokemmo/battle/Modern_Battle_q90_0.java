package cn.pokemmo.battle;

import f.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * 现代化重构类 - 原始混淆类: f.q90_0
 */
public abstract class Modern_Battle_q90_0 {

    public String ln;
    public String F0;
    public boolean w1 = true;
    public PropertyChangeSupport T3;

    public Modern_Battle_q90_0() {
    }

    public Modern_Battle_q90_0(String string) {
        this.ln = string;
    }

    public final String dH0() {
        return this.ln;
    }

    public final void LG(boolean bl) {
        Modern_Battle_q90_0 q90_02 = this;
        boolean bl2 = q90_02.w1;
        q90_02.w1 = bl;
        String string = "enabled";
        PropertyChangeSupport propertyChangeSupport = q90_02.T3;
        if (propertyChangeSupport != null) {
            propertyChangeSupport.firePropertyChange(string, bl2, bl);
        }
    }

    public abstract le0_2 pl0(TJ0 var1, int var2);

    public final void gn(PropertyChangeListener propertyChangeListener) {
        if (this.T3 == null) {
            this.T3 = new PropertyChangeSupport(this);
        }
        this.T3.addPropertyChangeListener(propertyChangeListener);
    }

    public final void Ag(PropertyChangeListener propertyChangeListener) {
        PropertyChangeSupport propertyChangeSupport = this.T3;
        if (propertyChangeSupport != null) {
            propertyChangeSupport.removePropertyChangeListener(propertyChangeListener);
        }
    }

    public final void Di(String string, String string2, String string3) {
        PropertyChangeSupport propertyChangeSupport = this.T3;
        if (propertyChangeSupport != null) {
            propertyChangeSupport.firePropertyChange(string, string2, string3);
        }
    }
}

