package cn.pokemmo.graphics.task;

import f.m0_0;

/**
 * OpenGL 线程异步调度任务统一基类
 * 封装在 LibGDX / LWJGL 渲染主线程中异步分发或定时执行的图形任务
 */
public abstract class BaseGLTask extends m0_0 {
    public BaseGLTask() {
        super();
    }

    /**
     * 取消或重置当前异步任务
     */
    public void cancel() {
        ky0();
    }

    /**
     * 获取任务当前执行时间戳
     */
    public long getExecutionTime() {
        return LW();
    }
}
