package cn.pokemmo.util.collection;

import f.*;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 现代化重构类 - 原始混淆类: f.be0_0
 */
public class Modern_Col_Be00 implements vc0_1 {

    public final LinkedList we0 = new LinkedList();

    @Override
    public final void COm6(o3_0 event) {
        Iterator iterator = this.we0.iterator();
        while (iterator.hasNext()) {
            ((vc0_1) iterator.next()).COm6(event);
        }
    }

    @Override
    public final void Pr0(LH0 event) {
        Iterator iterator = this.we0.iterator();
        while (iterator.hasNext()) {
            ((vc0_1) iterator.next()).Pr0(event);
        }
    }

    @Override
    public final boolean PL0(o3_0 event, int value) {
        Iterator iterator = this.we0.iterator();
        while (iterator.hasNext()) {
            if (((vc0_1) iterator.next()).PL0(event, value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean KY(o3_0 event, int value) {
        Iterator iterator = this.we0.iterator();
        while (iterator.hasNext()) {
            if (((vc0_1) iterator.next()).KY(event, value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean H2(o3_0 event, int value, float amount) {
        Iterator iterator = this.we0.iterator();
        while (iterator.hasNext()) {
            if (((vc0_1) iterator.next()).H2(event, value, amount)) {
                return true;
            }
        }
        return false;
    }

    public final void z00(eo_0 entry) {
        this.we0.add(entry);
    }
}

