package cn.pokemmo.text;

public interface IndexedStringTable {
    int getCount();

    String getString(int index);

    default int Zy() {
        return getCount();
    }

    default String LPT7(int var1) {
        return getString(var1);
    }
}
