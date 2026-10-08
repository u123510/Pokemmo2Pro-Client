package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始类: f.xw_0
 */
public class CompositeDisposableList implements fy0_0 {

    public final es_1 cq;
    public boolean QC;

    public CompositeDisposableList() {
        super();
        this.cq = new es_1(8);
    }

    public CompositeDisposableList(CompositeDisposableList other) {
        super();
        this.cq = new es_1(true, other.cq.KB);
        for (int i = 0; i < other.cq.KB; i++) {
            this.cq.Ue0(MF((No) other.cq.get(i)));
        }
    }

    public static No MF(No value) {
        return new No(value);
    }

    @Override
    public final void dispose() {
        if (!this.QC) {
            return;
        }
        for (int i = 0; i < this.cq.KB; i++) {
            No emitter = (No) this.cq.get(i);
            I2 iterator = emitter.fo0.ZD();
            while (iterator.hasNext()) {
                B5 particle = (B5) iterator.next();
                particle.OB.dispose();
            }
        }
    }
}
