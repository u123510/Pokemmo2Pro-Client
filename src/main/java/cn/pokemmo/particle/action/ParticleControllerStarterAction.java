package cn.pokemmo.particle.action;

import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerExt;
import f.D2;
import f.LB0;

/**
 * 粒子控制器启动回调动作 (Particle Controller Starter Action)
 * 用于补间动画/时间轴到达指定帧时并发启动主控制器和附属拖尾控制器。
 *
 * 原混淆类: f.p1_0
 */
public class ParticleControllerStarterAction implements LB0 {
    public final ParticleControllerExt mainController;
    public final ParticleControllerExt im;
    public final ParticleControllerExt trailController;
    public final ParticleControllerExt Bw0;

    public ParticleControllerStarterAction(ParticleControllerExt mainController, ParticleControllerExt trailController) {
        this.mainController = mainController;
        this.im = mainController;
        this.trailController = trailController;
        this.Bw0 = trailController;
    }

    @Override
    public void LPT3(int stepIndex, D2 tweenContext) {
        if (this.mainController != null) {
            this.mainController.start();
        }
        if (this.trailController != null) {
            this.trailController.start();
        }
    }
}
