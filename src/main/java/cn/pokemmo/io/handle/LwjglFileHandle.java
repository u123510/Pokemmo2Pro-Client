package cn.pokemmo.io.handle;

import f.Dn0;
import f.VE;
import f.nf_1;
import f.os0_0;
import f.zv_1;
import java.io.File;

public class LwjglFileHandle extends Dn0 {
    public LwjglFileHandle(String path, zv_1 type) {
        super(path, type);
    }

    public LwjglFileHandle(File file, zv_1 type) {
        super(file, type);
    }

    @Override
    public Dn0 wp(String child) {
        if (this.Q50.getPath().length() == 0) {
            return new VE(new File(child), this.a5);
        }
        return new VE(new File(this.Q50, child), this.a5);
    }

    @Override
    public Dn0 xt(String sibling) {
        if (this.Q50.getPath().length() != 0) {
            return new VE(new File(this.Q50.getParent(), sibling), this.a5);
        }
        throw new nf_1("Cannot get the sibling of the root.");
    }

    @Override
    public Dn0 Br() {
        File file = this.Q50.getParentFile();
        if (file == null) {
            if (this.a5 == zv_1.uq0) {
                file = new File("/");
            } else {
                file = new File("");
            }
        }
        return new VE(file, this.a5);
    }

    @Override
    public File l00() {
        zv_1 type = this.a5;
        if (type == zv_1.JJ) {
            return new File(os0_0.L10, this.Q50.getPath());
        }
        if (type == zv_1.kE) {
            return new File(os0_0.D70, this.Q50.getPath());
        }
        return this.Q50;
    }
}
