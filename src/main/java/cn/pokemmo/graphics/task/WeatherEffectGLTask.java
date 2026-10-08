package cn.pokemmo.graphics.task;

import f.Op0;
import f.QT;

public class WeatherEffectGLTask extends BaseGLTask {
    public final Op0 hk;
    public final QT Lpt3;

    public WeatherEffectGLTask(QT qT, Op0 op0) {
        this.Lpt3 = qT;
        this.hk = op0;
    }

    @Override
    public void run() {
        Op0 op0 = this.hk;
        if (op0 == this.Lpt3.o3) {
            op0.fE0.h0(op0.p6);
        }
    }
}
