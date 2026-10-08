package cn.pokemmo.graphics.animation;

import f.AG0;
import f.B5;
import f.Tz0;
import f.nj0_0;
import f.yh_0;

/**
 * 骨骼与精灵帧动画轨道
 */
public class BoneAnimationTrack extends Tz0 {
    public BoneAnimationTrack(nj0_0 nj0_02) {
        super(nj0_02);
    }

    @Override
    public B5[] LD(int n, int n2, int n3) {
        short s = n != 2 ? (n != 4 ? (short) 1 : 7) : (short) 4;
        B5[] b5Array = new B5[2];
        AG0[] aG0Array = yh_0.Xm0.Vo(s, (byte) 0, false);
        b5Array[0] = new B5(aG0Array[0].d3().OB);
        b5Array[1] = new B5(aG0Array[0].d3().OB);
        return b5Array;
    }
}
