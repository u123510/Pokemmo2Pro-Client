package cn.pokemmo.graphics.task;

import java.util.Arrays;
import f.QT;
import f.jb0_0;

public class ParticleEmitterGLTask extends BaseGLTask {
    public final QT PF;
    public final jb0_0 WQ;

    public ParticleEmitterGLTask(jb0_0 jb0_02, QT qT) {
        this.WQ = jb0_02;
        this.PF = qT;
    }

    @Override
    public void run() {
        jb0_0 jb0_02 = this.WQ;
        if (jb0_02.ed == 0L) {
            return;
        }
        ParticleEmitterGLTask n0_02 = this;
        jb0_0 jb0_03 = jb0_02;
        int n = jb0_03.A20 + jb0_02.e80;
        n = jb0_03.a3() / 2 + n;
        jb0_0 jb0_04 = n0_02.WQ;
        int n2 = jb0_04.SB0 + jb0_04.y9;
        n2 = jb0_04.k5() / 2 + n2;
        QT qT = n0_02.PF;
        qT.vu0(this.WQ, Arrays.asList(qT.Uc0().uO()));
        n0_02.PF.fx0(n, n2);
    }
}
