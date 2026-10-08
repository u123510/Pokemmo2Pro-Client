package cn.pokemmo.graphics.gl;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import f.bi_1;
import f.pd_0;

/**
 * LibGDX JNIGen CHandler 原生指针封装
 */
public class NativeCHandlerPointer extends bi_1 {
    public static final int Xs = CHandler.tv0;
    public final pd_0 Xe;

    public NativeCHandlerPointer(long l, boolean bl, pd_0 pd_02) {
        super(l, bl);
        this.Xe = pd_02;
    }

    public NativeCHandlerPointer(pd_0 pd_02) {
        this(1, pd_02);
    }

    public NativeCHandlerPointer(int n, pd_0 pd_02) {
        this(n, true, true, pd_02);
    }

    public NativeCHandlerPointer(int n, boolean bl, boolean bl2, pd_0 pd_02) {
        super(n * Xs, bl, bl2);
        this.Xe = pd_02;
    }
}
