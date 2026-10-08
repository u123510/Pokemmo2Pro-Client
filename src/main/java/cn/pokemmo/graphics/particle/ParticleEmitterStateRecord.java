package cn.pokemmo.graphics.particle;

import f.*;

public class ParticleEmitterStateRecord {
    public static final boolean tW = !ParticleEmitterStateRecord.class.desiredAssertionStatus();
    public A50 gV;
    public int lr;

    public ParticleEmitterStateRecord() {
        this.gV = new A50(32);
        this.lr = 1;
    }

    public final void gu(int first, int second, int third, XL callback) {
        int index = 0;
        A50 node = this.gV;
        if (node.l1 <= 0) {
            return;
        }
        int depth = this.lr;
        int slotIndex;
        cw0_0 slot;
        while (true) {
            slotIndex = node.zd(first, 0, node.l1 - 1);
            slot = node.Sp0[slotIndex];
            depth--;
            if (depth <= 0) {
                break;
            }
            node = (A50) slot;
        }
        if (!tW && slot == null) {
            throw new AssertionError();
        }
        int diff = slot.pt0 - first;
        if (diff == 0) {
            diff = slot.Sr0;
        }
        if (diff < 0) {
            return;
        }
        while (node != null) {
            int len = node.l1;
            while (slotIndex < len) {
                cw0_0 value = node.Sp0[slotIndex];
                int position = value.pt0;
                if (position > second) {
                    return;
                }
                int end = value.Sr0;
                if (end >= 0 && end <= third) {
                    callback.cOm6(position, end, value);
                }
                slotIndex++;
            }
            slotIndex = 0;
            node = node.x50;
        }
    }

    public final void n0() {
        while (this.lr > 1 && this.gV.l1 == 1) {
            int depth = this.lr;
            A50 child = (A50) this.gV.Sp0[0];
            this.gV = child;
            child.uw = null;
            child.x50 = null;
            this.lr = depth - 1;
        }
        if (this.gV.l1 == 0) {
            this.lr = 1;
        }
    }
}
