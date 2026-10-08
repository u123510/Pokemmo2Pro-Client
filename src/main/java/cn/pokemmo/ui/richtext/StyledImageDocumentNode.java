package cn.pokemmo.ui.richtext;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.D90;
import f.L30;
import f.ay_0;


public class StyledImageDocumentNode
extends BaseStyledDocumentNode {
    public final int SE0;
    public final int We0;
    public final int Y3;
    public final int Yv;
    public final L30[] qD0;
    public final D90[] Bs;

    public StyledImageDocumentNode(D90 d90, int n, int n2, int n3, int n4) {
        super(d90);
        if (n >= 0) {
            if (n2 >= 0) {
                this.SE0 = n;
                this.We0 = n2;
                this.Y3 = n3;
                this.Yv = n4;
                this.qD0 = new L30[n2 * n];
                this.Bs = new D90[n2];
                return;
            }
            throw new IllegalArgumentException("numRows");
        }
        throw new IllegalArgumentException("numColumns");
    }

    public final L30 FE(int n, int n2) {
        int n3;
        if (n2 >= 0 && n2 < (n3 = this.SE0)) {
            if (n >= 0 && n < this.We0) {
                return this.qD0[n * n3 + n2];
            }
            throw new IndexOutOfBoundsException("row");
        }
        throw new IndexOutOfBoundsException("column");
    }
}
