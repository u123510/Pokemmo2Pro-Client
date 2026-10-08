package cn.pokemmo.ui.layout.twl;

import f.*;
import java.util.Arrays;
import java.util.Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SequentialGroup extends ya_1 {
    public final DialogLayout oc;

    public SequentialGroup(DialogLayout container) {
        super(container);
        this.oc = container;
    }

    @Override
    public final int zR(int axis) {
        int total = 0;
        int size = this.U0.size();
        for (int index = 0; index < size; index++) {
            is0_0 child = (is0_0)this.U0.get(index);
            if (this.oc.gI || child.D4()) {
                total += child.zR(axis);
            }
        }
        return total;
    }

    @Override
    public final int Kn(int axis) {
        int total = 0;
        int size = this.U0.size();
        for (int index = 0; index < size; index++) {
            is0_0 child = (is0_0)this.U0.get(index);
            if (this.oc.gI || child.D4()) {
                total += child.Kn(axis);
            }
        }
        return total;
    }

    @Override
    public final int e4(int axis) {
        int total = 0;
        boolean hasPositive = false;
        int size = this.U0.size();
        for (int index = 0; index < size; index++) {
            is0_0 child = (is0_0)this.U0.get(index);
            if (this.oc.gI || child.D4()) {
                int value = child.e4(axis);
                if (value > 0) {
                    total += value;
                    hasPositive = true;
                } else {
                    total += child.Kn(axis);
                }
            }
        }
        return hasPositive ? total : 0;
    }

    @Override
    public final void u70() {
        if (this.U0.size() > 1) {
            boolean previousSpecial = true;
            int index = 0;
            while (index < this.U0.size()) {
                is0_0 child = (is0_0)this.U0.get(index);
                if (this.oc.gI || child.D4()) {
                    boolean special = child instanceof NH || child instanceof al_1;
                    if (!special && !previousSpecial) {
                        this.U0.add(index, new NH(this.oc, -4, -4, -4, true));
                        index++;
                    }
                    previousSpecial = special;
                }
                index++;
            }
        }
        super.u70();
    }

    @Override
    public final void od(int axis, int offset, int target) {
        int preferred = this.Kn(axis);
        if (target == preferred) {
            Iterator<?> iterator = this.U0.iterator();
            while (iterator.hasNext()) {
                is0_0 child = (is0_0)iterator.next();
                if (this.oc.gI || child.D4()) {
                    int childSize = child.Kn(axis);
                    child.od(axis, offset, childSize);
                    offset += childSize;
                }
            }
            return;
        }

        int childCount = this.U0.size();
        if (childCount == 1) {
            ((is0_0)this.U0.get(0)).od(axis, offset, target);
            return;
        }
        if (childCount <= 1) {
            return;
        }

        int remaining = target - preferred;
        boolean reverse = remaining < 0;
        if (reverse) {
            remaining = -remaining;
        }

        rq_0[] capacities = new rq_0[childCount];
        int capacityCount = 0;
        for (int index = 0; index < childCount; index++) {
            is0_0 child = (is0_0)this.U0.get(index);
            if (this.oc.gI || child.D4()) {
                int capacity = reverse
                    ? child.Kn(axis) - child.zR(axis)
                    : child.e4(axis) - child.Kn(axis);
                if (capacity > 0) {
                    capacities[capacityCount++] = new rq_0(index, capacity);
                }
            }
        }

        if (capacityCount > 0) {
            if (capacityCount > 1) {
                Arrays.sort(capacities, 0, capacityCount);
            }
            int[] adjustments = new int[childCount];
            int slot = 0;
            int slotsRemaining = capacityCount;
            while (slot < capacityCount) {
                rq_0 capacity = capacities[slot];
                int adjustment = Math.min(remaining / slotsRemaining, capacity.z);
                int remainder = remaining - adjustment;
                slotsRemaining--;
                if (reverse) {
                    adjustment = -adjustment;
                }
                adjustments[capacity.aQ] = adjustment;
                slot++;
                remaining = remainder;
            }

            for (int index = 0; index < childCount; index++) {
                is0_0 child = (is0_0)this.U0.get(index);
                if (this.oc.gI || child.D4()) {
                    int childSize = child.Kn(axis) + adjustments[index];
                    child.od(axis, offset, childSize);
                    offset += childSize;
                }
            }
            return;
        }

        Iterator<?> iterator = this.U0.iterator();
        while (iterator.hasNext()) {
            is0_0 child = (is0_0)iterator.next();
            if (this.oc.gI || child.D4()) {
                int childSize;
                if (reverse) {
                    childSize = child.zR(axis);
                } else {
                    childSize = child.e4(axis);
                    if (childSize == 0) {
                        childSize = child.Kn(axis);
                    }
                }
                child.od(axis, offset, childSize);
                offset += childSize;
            }
        }
    }
}
