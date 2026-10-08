package f;

import cn.pokemmo.text.IndexedStringTable;

public interface ha_0 extends IndexedStringTable {
    @Override
    int Zy();

    @Override
    String LPT7(int var1);

    @Override
    default int getCount() {
        return Zy();
    }

    @Override
    default String getString(int index) {
        return LPT7(index);
    }
}
