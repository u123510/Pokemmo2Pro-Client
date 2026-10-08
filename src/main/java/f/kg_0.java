package f;

import cn.pokemmo.math.geometry.CollisionPlane3D;

/**
 * 垫片类 (Backward compatibility shim)
 * 现代化实现: cn.pokemmo.math.geometry.CollisionPlane3D
 */
public class kg_0 extends CollisionPlane3D {
    public kg_0() { super(); }
    public kg_0(C8 normal, float offset) { super(normal, offset); }
    public kg_0(C8 normal, C8 point) { super(normal, point); }
    public kg_0(C8 a, C8 b, C8 c) { super(a, b, c); }
}
