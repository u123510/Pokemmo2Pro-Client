package cn.pokemmo.graphics.gl;

import f.bi_1;

public interface NativePointerFactory {
    bi_1 createPointer(long address, boolean autoFree);

    default bi_1 px(long var1, boolean var3) {
        return createPointer(var1, var3);
    }
}
