package cn.pokemmo.constant.enums;

import f.*;

public enum VertexBufferType {
    VertexArray,
    VertexBufferObject,
    VertexBufferObjectSubData,
    VertexBufferObjectWithVAO;

    public static final VertexBufferType mR = VertexArray;
    public static final VertexBufferType cG0 = VertexBufferObject;
    public static final VertexBufferType nJ0 = VertexBufferObjectSubData;
    public static final VertexBufferType at = VertexBufferObjectWithVAO;
    public static final VertexBufferType[] z6 = values();

    public f.VV toLegacy() {
        return f.VV.valueOf(name());
    }
}