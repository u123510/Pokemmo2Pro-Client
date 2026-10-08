package cn.pokemmo.audio;

import f.AC0;
import f.Dn0;
import f.fy0_0;
import f.gg0_0;
import f.if_1;

/**
 * 核心音频引擎提供者接口
 * 原始接口: f.u90_0
 */
public interface AudioEngine extends fy0_0 {
    public void update();

    public String[] Rr0();

    public boolean AF(String var1);

    public gg0_0 Vr(Dn0 var1);

    public if_1 aT(int var1);

    public AC0 WC(Dn0 var1);
}
