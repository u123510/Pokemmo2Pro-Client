package cn.pokemmo.battle;

import f.*;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * 现代化重构类 - 原始混淆类: f.WE
 */
public class Modern_Battle_WE extends V60 {

    public float[] gu0;
    public float[] gE;

    public Modern_Battle_WE() {
        super();
        this.gu0 = new float[]{1.0f};
        this.gE = new float[]{0.0f};
    }

    @Override
    public void YN(BufferedReader reader) {
        try {
            super.YN(reader);
            if (!this.L9) {
                return;
            }
            Float.parseFloat(No.xF(reader, "highMin"));
            Float.parseFloat(No.xF(reader, "highMax"));
            Boolean.parseBoolean(No.xF(reader, "relative"));

            int scalingCount = Integer.parseInt(No.xF(reader, "scalingCount"));
            this.gu0 = new float[scalingCount];
            for (int i = 0; i < this.gu0.length; i++) {
                this.gu0[i] = Float.parseFloat(No.xF(reader, "scaling" + i));
            }

            int timelineCount = Integer.parseInt(No.xF(reader, "timelineCount"));
            this.gE = new float[timelineCount];
            for (int i = 0; i < this.gE.length; i++) {
                this.gE[i] = Float.parseFloat(No.xF(reader, "timeline" + i));
            }
        } catch (IOException exception) {
            throw Modern_Battle_WE.<RuntimeException>sneakyThrow(exception);
        }
    }

    public final void P60(WE other) {
        this.L9 = other.L9;
        this.jH0 = other.jH0;
        this.gu0 = other.gu0.clone();
        this.gE = other.gE.clone();
    }

    public void JC0(AP other) {
        this.P60(other);
    }

    private static <T extends Throwable> T sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

