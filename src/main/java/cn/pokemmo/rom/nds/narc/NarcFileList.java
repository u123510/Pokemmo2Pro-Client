package cn.pokemmo.rom.nds.narc;

import f.Ae;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * NDS NARC 归档虚拟文件列表 / NitroFS 目录节点
 * 封装内部提取的虚拟文件条目与子目录节点
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class NarcFileList implements Iterable {
    public ArrayList Xa0;
    public final ArrayList Ec;
    public String xX;
    public int qS;

    public NarcFileList() {
        this.Xa0 = new ArrayList();
        this.Ec = new ArrayList();
    }

    public Ae EG(int index) {
        return (Ae) this.Xa0.get(index);
    }

    public Object getEntry(int index) {
        return this.Xa0.get(index);
    }

    public int size() {
        return this.Xa0.size();
    }

    @Override
    public Iterator iterator() {
        return this.Xa0.iterator();
    }

    public ArrayList getEntries() {
        return this.Xa0;
    }

    public ArrayList getDirectories() {
        return this.Ec;
    }

    public String getPath() {
        return this.xX;
    }

    public void setPath(String path) {
        this.xX = path;
    }

    public int getFolderId() {
        return this.qS;
    }

    public void setFolderId(int folderId) {
        this.qS = folderId;
    }
}
