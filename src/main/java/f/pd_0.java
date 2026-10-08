package f;

import cn.pokemmo.graphics.gl.NativePointerFactory;
import f.bi_1;

public interface pd_0 extends NativePointerFactory {
    @Override
    bi_1 px(long var1, boolean var3);

    @Override
    default bi_1 createPointer(long address, boolean autoFree) {
        return px(address, autoFree);
    }
}
