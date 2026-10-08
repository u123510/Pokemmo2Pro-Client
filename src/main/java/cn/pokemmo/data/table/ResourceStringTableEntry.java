package cn.pokemmo.data.table;

/**
 * 文本与音轨/索引映射记录项 (Resource String Table Entry)
 * 对应混淆类: f.vx0
 */
public class ResourceStringTableEntry {
    public String a80;
    public short[] Ky0;
    public int Yu0;

    public ResourceStringTableEntry() {
    }

    public ResourceStringTableEntry(String name, short[] indices, int id) {
        this.a80 = name;
        this.Ky0 = indices;
        this.Yu0 = id;
    }
}
