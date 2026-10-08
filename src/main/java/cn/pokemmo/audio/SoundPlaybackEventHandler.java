package cn.pokemmo.audio;

import f.By;
import f.i70_0;
import f.jb0_0;
import f.sg_2;
import f.tz0_0;

/**
 * 音效与音频事件分发处理器 (Sound Playback Event Handler)
 * 对应混淆类: f.v2
 */
public class SoundPlaybackEventHandler implements By {
    public final tz0_0 soundManager;
    public final tz0_0 pu0;

    public SoundPlaybackEventHandler(tz0_0 soundManager) {
        this.soundManager = soundManager;
        this.pu0 = soundManager;
    }

    @Override
    public final void py0(sg_2 sg_22, i70_0 i70_02) {
        jb0_0 jb0_02 = sg_22.y0();
        int n = i70_02.f8;
        int n2 = i70_02.AN;
        this.pu0.Sn0(jb0_02, n, n2);
    }

    @Override
    public final void X70(sg_2 sg_22, i70_0 i70_02) {
        tz0_0 tz0_02 = this.pu0;
        int n = i70_02.f8;
        int n2 = i70_02.AN;
        if (tz0_02.xm0) {
            tz0_02.DF(n, n2);
        } else {
            tz0_02.Br.fx0(n, n2);
        }
    }

    @Override
    public final void Et0(sg_2 sg_22, i70_0 i70_02) {
        tz0_0 tz0_02 = this.pu0;
        int n = i70_02.f8;
        int n2 = i70_02.AN;
        if (tz0_02.xm0) {
            tz0_02.wn0(n, n2);
        } else {
            tz0_02.Br.mf0(n, n2);
        }
    }
}
