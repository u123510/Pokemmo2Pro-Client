package cn.pokemmo.ui.twl.theme;

import f.D90;
import f.I0;
import f.li_0;

/**
 * 文本区域层叠样式 (textarea.Style)
 */
public class TwlStyle {
    public final D90 im0;
    public final li_0 sw0;
    public Object[] DS;

    public TwlStyle() {
        this(null, null);
    }

    public TwlStyle(D90 parent, li_0 styleSheetKey) {
        this.im0 = parent;
        this.sw0 = styleSheetKey;
    }

    public TwlStyle(D90 src) {
        this.im0 = src.im0;
        this.sw0 = src.sw0;
        this.DS = src.DS != null ? (Object[]) src.DS.clone() : null;
    }

    public D90 resolve(I0 attr) {
        D90 self = (D90) this;
        if (!attr.Vh0) {
            return self;
        }
        int idx = attr.Ww0;
        while (true) {
            D90 p = self.im0;
            if (p == null) {
                break;
            }
            Object[] vals = self.DS;
            if ((vals != null ? vals[idx] : null) != null) {
                break;
            }
            self = p;
        }
        return self;
    }

    public final D90 x90(I0 attr) {
        return resolve(attr);
    }

    public Object get(I0 attr) {
        int idx = attr.Ww0;
        Object val = this.DS != null ? this.DS[idx] : null;
        return val == null ? attr.nu : attr.MH.cast(val);
    }

    public final Object Kj0(I0 attr) {
        return get(attr);
    }

    public void put(I0 attr, Object val) {
        if (attr == null) {
            throw new IllegalArgumentException("attribute is null");
        }
        if (val == null) {
            if (this.DS == null) {
                return;
            }
        } else {
            if (!attr.MH.isInstance(val)) {
                throw new IllegalArgumentException("value is a " + val.getClass() + " but must be a " + attr.MH);
            }
            if (this.DS == null) {
                this.DS = new Object[I0.hk0()];
            }
        }
        this.DS[attr.Ww0] = val;
    }

    public final void cR(I0 attr, Object val) {
        put(attr, val);
    }
}
