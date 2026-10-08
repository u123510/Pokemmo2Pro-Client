package cn.pokemmo.ui.widget.component;

import f.*;

public class CompositeTooltipListener implements GG0 {
    public final KU HV;

    public CompositeTooltipListener() {
        this.HV = new KU(4);
    }

    public CompositeTooltipListener(GG0... values) {
        this.HV = new KU(4);
        this.HV.Lpt7((Object[]) values);
    }

    @Override
    public final boolean GH0(int value) {
        Object[] snapshot = this.HV.pa();
        try {
            int size = this.HV.KB;
            for (int i = 0; i < size; i++) {
                if (((GG0) snapshot[i]).GH0(value)) {
                    this.HV.Gj0();
                    return true;
                }
            }
            this.HV.Gj0();
            return false;
        } catch (Throwable error) {
            this.HV.Gj0();
            CompositeTooltipListener.<RuntimeException>throwUnchecked(error);
            return false;
        }
    }

    @Override
    public final boolean pH0(int value) {
        Object[] snapshot = this.HV.pa();
        try {
            int size = this.HV.KB;
            for (int i = 0; i < size; i++) {
                if (((GG0) snapshot[i]).pH0(value)) {
                    this.HV.Gj0();
                    return true;
                }
            }
            this.HV.Gj0();
            return false;
        } catch (Throwable error) {
            this.HV.Gj0();
            CompositeTooltipListener.<RuntimeException>throwUnchecked(error);
            return false;
        }
    }

    @Override
    public final boolean i00(char value) {
        Object[] snapshot = this.HV.pa();
        try {
            int size = this.HV.KB;
            for (int i = 0; i < size; i++) {
                if (((GG0) snapshot[i]).i00(value)) {
                    this.HV.Gj0();
                    return true;
                }
            }
            this.HV.Gj0();
            return false;
        } catch (Throwable error) {
            this.HV.Gj0();
            CompositeTooltipListener.<RuntimeException>throwUnchecked(error);
            return false;
        }
    }

    @Override
    public final boolean R8(int a, int b, int c, int d) {
        Object[] snapshot = this.HV.pa();
        try {
            int size = this.HV.KB;
            for (int i = 0; i < size; i++) {
                if (((GG0) snapshot[i]).R8(a, b, c, d)) {
                    this.HV.Gj0();
                    return true;
                }
            }
            this.HV.Gj0();
            return false;
        } catch (Throwable error) {
            this.HV.Gj0();
            CompositeTooltipListener.<RuntimeException>throwUnchecked(error);
            return false;
        }
    }

    @Override
    public final boolean kh(int a, int b, int c, int d) {
        Object[] snapshot = this.HV.pa();
        try {
            int size = this.HV.KB;
            for (int i = 0; i < size; i++) {
                if (((GG0) snapshot[i]).kh(a, b, c, d)) {
                    this.HV.Gj0();
                    return true;
                }
            }
            this.HV.Gj0();
            return false;
        } catch (Throwable error) {
            this.HV.Gj0();
            CompositeTooltipListener.<RuntimeException>throwUnchecked(error);
            return false;
        }
    }

    @Override
    public final boolean Ao0(int a, int b, int c) {
        Object[] snapshot = this.HV.pa();
        try {
            int size = this.HV.KB;
            for (int i = 0; i < size; i++) {
                if (((GG0) snapshot[i]).Ao0(a, b, c)) {
                    this.HV.Gj0();
                    return true;
                }
            }
            this.HV.Gj0();
            return false;
        } catch (Throwable error) {
            this.HV.Gj0();
            CompositeTooltipListener.<RuntimeException>throwUnchecked(error);
            return false;
        }
    }

    @Override
    public final boolean EA0(int a, int b) {
        Object[] snapshot = this.HV.pa();
        try {
            int size = this.HV.KB;
            for (int i = 0; i < size; i++) {
                if (((GG0) snapshot[i]).EA0(a, b)) {
                    this.HV.Gj0();
                    return true;
                }
            }
            this.HV.Gj0();
            return false;
        } catch (Throwable error) {
            this.HV.Gj0();
            CompositeTooltipListener.<RuntimeException>throwUnchecked(error);
            return false;
        }
    }

    @Override
    public final boolean gl0(float a, float b) {
        Object[] snapshot = this.HV.pa();
        try {
            int size = this.HV.KB;
            for (int i = 0; i < size; i++) {
                if (((GG0) snapshot[i]).gl0(a, b)) {
                    this.HV.Gj0();
                    return true;
                }
            }
            this.HV.Gj0();
            return false;
        } catch (Throwable error) {
            this.HV.Gj0();
            CompositeTooltipListener.<RuntimeException>throwUnchecked(error);
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable error) throws T {
        throw (T) error;
    }
}
