package cn.pokemmo.input.gesture;

import f.Bp0;

/**
 * 手势输入事件监听器接口 (Gesture Event Listener)
 * 对应 LibGDX: {@code com.badlogic.gdx.input.GestureDetector.GestureListener}
 * 原始接口: {@code f.ZK}
 */
public interface GestureListener {

    void Qc();

    boolean EA(float x, float y);

    boolean fJ0(float x, float y);

    boolean lPT7(int pointer, float x, float y);

    boolean s70(float x, float y, float deltaX, float deltaY);

    boolean mO(float x, float y);

    boolean Vq0(float x, float y);

    boolean SV(Bp0 p1, Bp0 p2, Bp0 p3, Bp0 p4);

    void Ar0();
}
