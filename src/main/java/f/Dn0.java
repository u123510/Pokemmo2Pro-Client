package f;

import cn.pokemmo.io.file.GdxVirtualFileHandle;
import java.io.File;
import java.io.FilenameFilter;

/**
 * 兼容垫片 (Shim) - 虚拟文件句柄
 * 核心实现已迁移至 {@link GdxVirtualFileHandle}
 */
public class Dn0 extends GdxVirtualFileHandle {
    public Dn0() {
        super();
    }

    public Dn0(String path) {
        super(path);
    }

    public Dn0(File file) {
        super(file);
    }

    public Dn0(String path, zv_1 type) {
        super(path, type);
    }

    public Dn0(File file, zv_1 type) {
        super(file, type);
    }

    @Override
    public Dn0 wp(String name) {
        GdxVirtualFileHandle h = super.wp(name);
        return new Dn0(h.l00(), this.a5);
    }

    @Override
    public Dn0 xt(String name) {
        GdxVirtualFileHandle h = super.xt(name);
        return new Dn0(h.l00(), this.a5);
    }

    @Override
    public Dn0 Br() {
        GdxVirtualFileHandle h = super.Br();
        return new Dn0(h.l00(), this.a5);
    }

    @Override
    public Dn0[] Ce0() {
        GdxVirtualFileHandle[] handles = super.Ce0();
        Dn0[] result = new Dn0[handles.length];
        for (int i = 0; i < handles.length; i++) {
            result[i] = new Dn0(handles[i].l00(), this.a5);
        }
        return result;
    }

    @Override
    public Dn0[] WM(FilenameFilter filter) {
        GdxVirtualFileHandle[] handles = super.WM(filter);
        Dn0[] result = new Dn0[handles.length];
        for (int i = 0; i < handles.length; i++) {
            result[i] = new Dn0(handles[i].l00(), this.a5);
        }
        return result;
    }

    @Override
    public Dn0[] gH0(String suffix) {
        GdxVirtualFileHandle[] handles = super.gH0(suffix);
        Dn0[] result = new Dn0[handles.length];
        for (int i = 0; i < handles.length; i++) {
            result[i] = new Dn0(handles[i].l00(), this.a5);
        }
        return result;
    }
}
