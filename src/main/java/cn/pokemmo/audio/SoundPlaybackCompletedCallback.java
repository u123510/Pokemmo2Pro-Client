package cn.pokemmo.audio;

import f.*;

public class SoundPlaybackCompletedCallback implements NA {
    public int Tv;

    public SoundPlaybackCompletedCallback() {
    }

    @Override
    public final le0_2 zS(le0_2 value) {
        cg_0 result = (cg_0) value;
        if (result == null) {
            result = new cg_0(null, new wn0_0());
        }
        return result;
    }

    @Override
    public final void NM(le0_2 value, int x, int y, int width, int height) {
        value.sy(x, y);
        value.oY(width, height);
    }

    @Override
    public final void Ib(Jn0 configuration) {
        this.Tv = ((LC0) configuration).H10(10, "editFieldHeight");
    }

    @Override
    public final String vV() {
        return "EditFieldCellRenderer";
    }

    @Override
    public final void In(Object value) {
        throw new ClassCastException();
    }

    @Override
    public final int y8() {
        return 1;
    }

    @Override
    public final int rm0() {
        return this.Tv;
    }

    @Override
    public final le0_2 m90(int x, int y, int width, int height, boolean horizontal) {
        return null;
    }
}
