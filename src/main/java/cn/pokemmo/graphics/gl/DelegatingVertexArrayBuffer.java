package cn.pokemmo.graphics.gl;

import f.Kr0;
import f.pt0_0;

public class DelegatingVertexArrayBuffer extends DelegatingDirectBuffer implements pt0_0 {
    public final pt0_0 m2;

    public DelegatingVertexArrayBuffer(Kr0 kr0, pt0_0 pt0_02) {
        super(kr0, pt0_02);
        this.m2 = pt0_02;
    }
}
