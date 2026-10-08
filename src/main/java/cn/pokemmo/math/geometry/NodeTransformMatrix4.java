package cn.pokemmo.math.geometry;

import com.badlogic.gdx.math.Matrix4;
import f.es_1;

public class NodeTransformMatrix4 extends Matrix4 {
    public int zo0;
    public final es_1 pG;
    public final float X80;

    public NodeTransformMatrix4() {
        super();
        this.pG = new es_1();
        this.X80 = 1.0F;
        this.F();
        this.zo0 = 0;
    }

    public NodeTransformMatrix4(int value, Matrix4 matrix) {
        super();
        this.pG = new es_1();
        this.X80 = 1.0F;
        this.zo0 = value;
        this.BE(matrix);
    }

    public final void GJ(NodeTransformMatrix4 other) {
        this.zo0 = other.zo0;
        this.pG.clear();
        this.pG.G6(other.pG.rZ, 0, other.pG.KB);
        this.Dd0(other.EW);
    }

    public final Matrix4 s7() {
        NodeTransformMatrix4 copy = new NodeTransformMatrix4(this.zo0, new Matrix4(this));
        copy.pG.G6(this.pG.rZ, 0, this.pG.KB);
        return copy;
    }
}
