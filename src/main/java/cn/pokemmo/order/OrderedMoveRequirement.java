package cn.pokemmo.order;

import f.*;

public class OrderedMoveRequirement implements Comparable<OrderedMoveRequirement> {
    public final byte wD0;
    public final byte Tv0;
    public final tc_1 Bx;
    public final byte Ks0;
    public final byte yi0;
    public final byte vp;
    public final short ON;
    public final byte cc;
    public final byte f50;

    public OrderedMoveRequirement(byte wD0, byte Tv0, tc_1 Bx, byte Ks0, byte yi0, byte vp,
               short ON, byte cc, byte f50) {
        this.wD0 = wD0;
        this.Tv0 = Tv0;
        this.Bx = Bx;
        this.Ks0 = Ks0;
        this.yi0 = yi0;
        this.vp = vp;
        this.ON = ON;
        this.cc = cc;
        this.f50 = f50;
    }

    public final boolean COM5() {
        if (this.E50((byte)1) && this.E50((byte)2) && this.E50((byte)4)) {
            return false;
        }
        return this.E50((byte)1) || this.E50((byte)2) || this.E50((byte)4);
    }

    public final boolean E50(byte value) {
        return (this.yi0 & value) != 0;
    }

    public final boolean CV(short value) {
        return (this.ON & value) != 0;
    }

    public final int kz(OrderedMoveRequirement value) {
        int result = this.wD0 - value.wD0;
        if (result != 0) {
            return result;
        }

        String left = sm0_0.hL0(this.wD0 * 1000 + 140000 + (this.Tv0 & 255), "???");
        String right = sm0_0.hL0(value.wD0 * 1000 + 140000 + (value.Tv0 & 255), "???");
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < left.length() && rightIndex < right.length()) {
            String leftPart = gv_0.mG0(left.length(), leftIndex, left);
            leftIndex += leftPart.length();
            String rightPart = gv_0.mG0(right.length(), rightIndex, right);
            rightIndex += rightPart.length();

            int partResult;
            if (gv_0.G10(leftPart.charAt(0)) && gv_0.G10(rightPart.charAt(0))) {
                int lengthResult = leftPart.length() - rightPart.length();
                if (lengthResult == 0) {
                    int i = 0;
                    while (i < leftPart.length()) {
                        lengthResult = leftPart.charAt(i) - rightPart.charAt(i);
                        if (lengthResult != 0) {
                            break;
                        }
                        i++;
                    }
                }
                partResult = lengthResult;
            } else {
                partResult = leftPart.compareTo(rightPart);
            }

            if (partResult != 0) {
                return partResult;
            }
        }

        int resultLength = left.length() - right.length();
        if (resultLength != 0) {
            return resultLength;
        }

        int resultRegion = Integer.compare(this.Bx.Rl0, value.Bx.Rl0);
        if (resultRegion != 0) {
            return resultRegion;
        }

        boolean leftComposite = this.COM5();
        boolean rightComposite = value.COM5();
        if (leftComposite != rightComposite) {
            return leftComposite ? 1 : -1;
        }
        return Integer.compare(this.cc, value.cc);
    }

    @Override
    public final int compareTo(OrderedMoveRequirement value) {
        return this.kz(value);
    }

}
