package cn.pokemmo.ui.widget.component;

import f.Qm0;
import cn.pokemmo.util.time.DateTimeFormatUtils;
import f.V1;

public class SoundVolumeSlider extends V1 {
    public final DateTimeFormatUtils M6;

    public SoundVolumeSlider(DateTimeFormatUtils qm0) {
        super(10, 8);
        this.M6 = qm0;
    }

    public SoundVolumeSlider(Qm0 qm0) {
        super(10, 8);
        this.M6 = qm0;
    }

    @Override
    public void Ff(int i) {
        this.M6.RE0((short) i);
    }
}
