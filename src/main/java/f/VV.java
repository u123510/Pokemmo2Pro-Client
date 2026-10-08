package f;

import cn.pokemmo.constant.enums.VertexBufferType;

public enum VV {
    VertexArray,
    VertexBufferObject,
    VertexBufferObjectSubData,
    VertexBufferObjectWithVAO;

    public static final VV mR = VertexArray;
    public static final VV cG0 = VertexBufferObject;
    public static final VV nJ0 = VertexBufferObjectSubData;
    public static final VV at = VertexBufferObjectWithVAO;
    public static final VV[] z6 = values();

    public VertexBufferType asModern() {
        return VertexBufferType.valueOf(name());
    }
}