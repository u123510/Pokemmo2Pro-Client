package cn.pokemmo.audio.sound;

import f.*;

/**
 * 地面材质与脚步踏步音效触发器 (Surface Footstep Sound Player)
 * <p>
 * 对应原始混淆类: f.EE
 * 职责:
 * 根据角色站立与踏步的地表材质类型 (Tile Surface ID)，调用音频引擎 tw0_0.RE0 播放对应的地表踏步音效 (Footstep SFX)。
 */
public class SurfaceFootstepSoundPlayer {
    public final q10_0 tL;
    public int ZH = rg0_2.r4(1000);
    public short Tq = (short)-1;

    public SurfaceFootstepSoundPlayer(q10_0 q10_02) {
        this.tL = q10_02;
    }

    public static EE[] Wi0() {
        q10_0[] q10_0Array = q10_0.Pn0;
        EE[] eEArray = new EE[q10_0Array.length];
        int n = q10_0.Pn0.length;
        for (int j = 0; j < n; ++j) {
            q10_0 q10_02 = q10_0Array[j];
            byte by = q10_02.iL;
            EE eE2 = new EE(q10_02);
            eEArray[by] = eE2;
        }
        return eEArray;
    }

    /**
     * 触发地表音效 (Mj0)
     */
    public final void Mj0(short surfaceId, float volume) {
        playFootstepSound(surfaceId, volume);
    }

    /**
     * 现代命名：根据地表 ID 播放踏步音效
     */
    public final void playFootstepSound(short surfaceId, float volume) {
        this.Tq = surfaceId;
        this.ZH = 0;
        jn_0 jn_02 = tw0_0.LD0;
        if (jn_02 == null || !jn_02.Rg0) {
            return;
        }
        if (!(volume > 0.01f)) {
            return;
        }
        if (this.tL != q10_0.Bj0) {
            return;
        }

        short soundId;
        byte category;
        bu_0 audioEngine;

        switch (surfaceId) {
            default:
                return;
            case 368:
                audioEngine = tw0_0.RE0;
                category = 10;
                soundId = 20;
                break;
            case 355:
                audioEngine = tw0_0.RE0;
                category = 10;
                soundId = 14;
                break;
            case 354:
                audioEngine = tw0_0.RE0;
                category = 10;
                soundId = 18;
                break;
            case 347:
                audioEngine = tw0_0.RE0;
                category = 10;
                soundId = 13;
                break;
            case 338:
            case 339:
                audioEngine = tw0_0.RE0;
                category = 10;
                soundId = 12;
                break;
            case 331:
                audioEngine = tw0_0.RE0;
                category = 2;
                soundId = 1718;
                break;
            case 320:
                audioEngine = tw0_0.RE0;
                category = 10;
                soundId = 7;
                break;
            case 307:
            case 311:
                audioEngine = tw0_0.RE0;
                category = 10;
                soundId = 11;
                break;
            case 255:
                audioEngine = tw0_0.RE0;
                category = 10;
                soundId = 9;
                break;
            case 87:
                audioEngine = tw0_0.RE0;
                category = 10;
                soundId = 10;
                break;
        }

        float pitch = 1.0f;
        audioEngine.IE(category, soundId, (short)-1, false, 0.0f, pitch, volume, 0);
    }
}
