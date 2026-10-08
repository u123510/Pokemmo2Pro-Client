package cn.pokemmo.ui.widget.factory;

import f.*;

public abstract class WidgetStyleLayoutRegistry {
    public Object[] wj0;
    public final float fU;
    public int R9;
    public float ic0;
    public T4 zw0;

    public WidgetStyleLayoutRegistry(float scale, Object... values) {
        this.fU = scale;
        this.zw0 = T4.yo0;
        this.Uj(values);
    }

    public final Object B3(float value, boolean advance) {
        T4 current = this.zw0;
        if (advance) {
            if (current == T4.yo0) {
                this.zw0 = T4.br0;
            } else if (current == T4.hJ0) {
                this.zw0 = T4.Ds;
            }
        } else if (current != T4.yo0 && current != T4.hJ0) {
            this.zw0 = current == T4.Ds ? T4.hJ0 : T4.br0;
        }

        Object[] values = this.wj0;
        int index;
        if (values.length == 1) {
            index = 0;
        } else {
            float previous = this.fU;
            int scaled = (int) (value / previous);
            int mode;
            switch (this.zw0.U2) {
                case 0: mode = 1; break;
                case 1: mode = 5; break;
                case 2: mode = 2; break;
                case 3: mode = 6; break;
                case 4: mode = 3; break;
                case 5: mode = 4; break;
                default: mode = 0; break;
            }
            switch (mode) {
                case 1:
                    index = Math.min(values.length - 1, scaled);
                    break;
                case 2:
                    index = scaled % values.length;
                    break;
                case 3:
                    int wrapped = scaled % (values.length * 2 - 2);
                    index = wrapped >= values.length
                            ? values.length - 2 - (wrapped - values.length)
                            : wrapped;
                    break;
                case 4:
                    if ((int) (this.ic0 / previous) == scaled) {
                        index = (int) LW.Yu.nextLong(values.length);
                    } else {
                        index = this.R9;
                    }
                    break;
                case 5:
                    index = Math.max(values.length - scaled - 1, 0);
                    break;
                case 6:
                    index = values.length - 1 - (scaled % values.length);
                    break;
                default:
                    index = scaled;
                    break;
            }
            this.R9 = index;
            this.ic0 = value;
        }
        if (index < 0 || index >= values.length) {
            index = 0;
        }
        Object result = values[index];
        this.zw0 = current;
        return result;
    }

    public final void Uj(Object... values) {
        this.wj0 = values;
    }
}
