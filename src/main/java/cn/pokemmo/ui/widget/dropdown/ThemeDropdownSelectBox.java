package cn.pokemmo.ui.widget.dropdown;

import f.*;

public class ThemeDropdownSelectBox extends DY {
public static final float[] ZM = new float[]{
        Float.intBitsToFloat(0x33e4b43e),
        Float.intBitsToFloat(0x33f39109),
        Float.intBitsToFloat(0x3401b28b),
        Float.intBitsToFloat(0x340a203c),
        Float.intBitsToFloat(0x34131a23),
        Float.intBitsToFloat(0x341ca960),
        Float.intBitsToFloat(0x3426d7a7),
        Float.intBitsToFloat(0x3431af4b),
        Float.intBitsToFloat(0x343d3b50),
        Float.intBitsToFloat(0x34498770),
        Float.intBitsToFloat(0x3456a023),
        Float.intBitsToFloat(0x346492b8),
        Float.intBitsToFloat(0x34736d55),
        Float.intBitsToFloat(0x34819f88),
        Float.intBitsToFloat(0x348a0bfc),
        Float.intBitsToFloat(0x34930493),
        Float.intBitsToFloat(0x349c9269),
        Float.intBitsToFloat(0x34a6bf32),
        Float.intBitsToFloat(0x34b1953f),
        Float.intBitsToFloat(0x34bd1f93),
        Float.intBitsToFloat(0x34c969e4),
        Float.intBitsToFloat(0x34d680ad),
        Float.intBitsToFloat(0x34e47136),
        Float.intBitsToFloat(0x34f349a6),
        Float.intBitsToFloat(0x35018c88),
        Float.intBitsToFloat(0x3509f7c0),
        Float.intBitsToFloat(0x3512ef06),
        Float.intBitsToFloat(0x351c7b76),
        Float.intBitsToFloat(0x3526a6c0),
        Float.intBitsToFloat(0x35317b37),
        Float.intBitsToFloat(0x353d03da),
        Float.intBitsToFloat(0x35494c5e),
        Float.intBitsToFloat(0x3556613b),
        Float.intBitsToFloat(0x35644fb9),
        Float.intBitsToFloat(0x357325fc),
        Float.intBitsToFloat(0x3581798a),
        Float.intBitsToFloat(0x3589e386),
        Float.intBitsToFloat(0x3592d97c),
        Float.intBitsToFloat(0x359c6485),
        Float.intBitsToFloat(0x35a68e52),
        Float.intBitsToFloat(0x35b16133),
        Float.intBitsToFloat(0x35bce825),
        Float.intBitsToFloat(0x35c92edc),
        Float.intBitsToFloat(0x35d641ce),
        Float.intBitsToFloat(0x35e42e41),
        Float.intBitsToFloat(0x35f30257),
        Float.intBitsToFloat(0x3601668f),
        Float.intBitsToFloat(0x3609cf4f),
        Float.intBitsToFloat(0x3612c3f5),
        Float.intBitsToFloat(0x361c4d98),
        Float.intBitsToFloat(0x362675e8),
        Float.intBitsToFloat(0x36314732),
        Float.intBitsToFloat(0x363ccc74),
        Float.intBitsToFloat(0x3649115e),
        Float.intBitsToFloat(0x36562265),
        Float.intBitsToFloat(0x36640cce),
        Float.intBitsToFloat(0x3672deb8),
        Float.intBitsToFloat(0x36815397),
        Float.intBitsToFloat(0x3689bb1c),
        Float.intBitsToFloat(0x3692ae72),
        Float.intBitsToFloat(0x369c36af),
        Float.intBitsToFloat(0x36a65d81),
        Float.intBitsToFloat(0x36b12d35),
        Float.intBitsToFloat(0x36bcb0c7),
        Float.intBitsToFloat(0x36c8f3e4),
        Float.intBitsToFloat(0x36d60301),
        Float.intBitsToFloat(0x36e3eb60),
        Float.intBitsToFloat(0x36f2bb1e),
        Float.intBitsToFloat(0x370140a2),
        Float.intBitsToFloat(0x3709a6eb),
        Float.intBitsToFloat(0x371298f1),
        Float.intBitsToFloat(0x371c1fc9),
        Float.intBitsToFloat(0x3726451e),
        Float.intBitsToFloat(0x3731133d),
        Float.intBitsToFloat(0x373c951e),
        Float.intBitsToFloat(0x3748d66f),
        Float.intBitsToFloat(0x3755e3a2),
        Float.intBitsToFloat(0x3763c9f7),
        Float.intBitsToFloat(0x37729789),
        Float.intBitsToFloat(0x37812daf),
        Float.intBitsToFloat(0x378992be),
        Float.intBitsToFloat(0x37928374),
        Float.intBitsToFloat(0x379c08e6),
        Float.intBitsToFloat(0x37a62cbe),
        Float.intBitsToFloat(0x37b0f947),
        Float.intBitsToFloat(0x37bc7979),
        Float.intBitsToFloat(0x37c8b8fe),
        Float.intBitsToFloat(0x37d5c447),
        Float.intBitsToFloat(0x37e3a892),
        Float.intBitsToFloat(0x37f273f8),
        Float.intBitsToFloat(0x38011ac0),
        Float.intBitsToFloat(0x38097e93),
        Float.intBitsToFloat(0x38126df9),
        Float.intBitsToFloat(0x381bf206),
        Float.intBitsToFloat(0x38261462),
        Float.intBitsToFloat(0x3830df56),
        Float.intBitsToFloat(0x383c5dd8),
        Float.intBitsToFloat(0x38489b92),
        Float.intBitsToFloat(0x3855a4f2),
        Float.intBitsToFloat(0x38638733),
        Float.intBitsToFloat(0x3872506e),
        Float.intBitsToFloat(0x388107d3),
        Float.intBitsToFloat(0x38896a6b),
        Float.intBitsToFloat(0x38925882),
        Float.intBitsToFloat(0x389bdb2a),
        Float.intBitsToFloat(0x38a5fc09),
        Float.intBitsToFloat(0x38b0c568),
        Float.intBitsToFloat(0x38bc423b),
        Float.intBitsToFloat(0x38c87e29),
        Float.intBitsToFloat(0x38d585a0),
        Float.intBitsToFloat(0x38e365d9),
        Float.intBitsToFloat(0x38f22ce8),
        Float.intBitsToFloat(0x3900f4e9),
        Float.intBitsToFloat(0x39095646),
        Float.intBitsToFloat(0x3912430e),
        Float.intBitsToFloat(0x391bc451),
        Float.intBitsToFloat(0x3925e3b5),
        Float.intBitsToFloat(0x3930ab7f),
        Float.intBitsToFloat(0x393c26a2),
        Float.intBitsToFloat(0x394860c5),
        Float.intBitsToFloat(0x39556653),
        Float.intBitsToFloat(0x39634483),
        Float.intBitsToFloat(0x39720968),
        Float.intBitsToFloat(0x3980e201),
        Float.intBitsToFloat(0x39894224),
        Float.intBitsToFloat(0x39922d9d),
        Float.intBitsToFloat(0x399bad7b),
        Float.intBitsToFloat(0x39a5cb63),
        Float.intBitsToFloat(0x39b09199),
        Float.intBitsToFloat(0x39bc0b0d),
        Float.intBitsToFloat(0x39c84366),
        Float.intBitsToFloat(0x39d5470b),
        Float.intBitsToFloat(0x39e32332),
        Float.intBitsToFloat(0x39f1e5ed),
        Float.intBitsToFloat(0x3a00cf1d),
        Float.intBitsToFloat(0x3a092e05),
        Float.intBitsToFloat(0x3a121830),
        Float.intBitsToFloat(0x3a1b96a9),
        Float.intBitsToFloat(0x3a25b315),
        Float.intBitsToFloat(0x3a3077b7),
        Float.intBitsToFloat(0x3a3bef7c),
        Float.intBitsToFloat(0x3a48260a),
        Float.intBitsToFloat(0x3a5527c7),
        Float.intBitsToFloat(0x3a6301e6),
        Float.intBitsToFloat(0x3a71c278),
        Float.intBitsToFloat(0x3a80bc3b),
        Float.intBitsToFloat(0x3a8919e9),
        Float.intBitsToFloat(0x3a9202c6),
        Float.intBitsToFloat(0x3a9b7fdb),
        Float.intBitsToFloat(0x3aa59acb),
        Float.intBitsToFloat(0x3ab05dd8),
        Float.intBitsToFloat(0x3abbd3ef),
        Float.intBitsToFloat(0x3ac808b3),
        Float.intBitsToFloat(0x3ad50888),
        Float.intBitsToFloat(0x3ae2e09f),
        Float.intBitsToFloat(0x3af19f07),
        Float.intBitsToFloat(0x3b00a95c),
        Float.intBitsToFloat(0x3b0905d0),
        Float.intBitsToFloat(0x3b11ed5e),
        Float.intBitsToFloat(0x3b1b690f),
        Float.intBitsToFloat(0x3b258284),
        Float.intBitsToFloat(0x3b3043fd),
        Float.intBitsToFloat(0x3b3bb867),
        Float.intBitsToFloat(0x3b47eb61),
        Float.intBitsToFloat(0x3b54e94d),
        Float.intBitsToFloat(0x3b62bf5d),
        Float.intBitsToFloat(0x3b717b9c),
        Float.intBitsToFloat(0x3b80967f),
        Float.intBitsToFloat(0x3b88f1ba),
        Float.intBitsToFloat(0x3b91d7f9),
        Float.intBitsToFloat(0x3b9b5247),
        Float.intBitsToFloat(0x3ba56a41),
        Float.intBitsToFloat(0x3bb02a27),
        Float.intBitsToFloat(0x3bbb9ce2),
        Float.intBitsToFloat(0x3bc7ce12),
        Float.intBitsToFloat(0x3bd4ca17),
        Float.intBitsToFloat(0x3be29e20),
        Float.intBitsToFloat(0x3bf15835),
        Float.intBitsToFloat(0x3c0083a6),
        Float.intBitsToFloat(0x3c08dda7),
        Float.intBitsToFloat(0x3c11c298),
        Float.intBitsToFloat(0x3c1b3b82),
        Float.intBitsToFloat(0x3c255201),
        Float.intBitsToFloat(0x3c301054),
        Float.intBitsToFloat(0x3c3b8161),
        Float.intBitsToFloat(0x3c47b0c8),
        Float.intBitsToFloat(0x3c54aae5),
        Float.intBitsToFloat(0x3c627ce8),
        Float.intBitsToFloat(0x3c7134d4),
        Float.intBitsToFloat(0x3c8070cf),
        Float.intBitsToFloat(0x3c88c996),
        Float.intBitsToFloat(0x3c91ad3a),
        Float.intBitsToFloat(0x3c9b24c0),
        Float.intBitsToFloat(0x3ca539c5),
        Float.intBitsToFloat(0x3caff685),
        Float.intBitsToFloat(0x3cbb65e5),
        Float.intBitsToFloat(0x3cc79382),
        Float.intBitsToFloat(0x3cd48bb9),
        Float.intBitsToFloat(0x3ce25bb4),
        Float.intBitsToFloat(0x3cf11179),
        Float.intBitsToFloat(0x3d005dfb),
        Float.intBitsToFloat(0x3d08b589),
        Float.intBitsToFloat(0x3d1197df),
        Float.intBitsToFloat(0x3d1b0e02),
        Float.intBitsToFloat(0x3d25218d),
        Float.intBitsToFloat(0x3d2fdcb9),
        Float.intBitsToFloat(0x3d3b4a6d),
        Float.intBitsToFloat(0x3d477640),
        Float.intBitsToFloat(0x3d546c91),
        Float.intBitsToFloat(0x3d623a85),
        Float.intBitsToFloat(0x3d70ee22),
        Float.intBitsToFloat(0x3d804b2a),
        Float.intBitsToFloat(0x3d88a17f),
        Float.intBitsToFloat(0x3d918288),
        Float.intBitsToFloat(0x3d9af748),
        Float.intBitsToFloat(0x3da50958),
        Float.intBitsToFloat(0x3dafc2f2),
        Float.intBitsToFloat(0x3dbb2ef8),
        Float.intBitsToFloat(0x3dc75903),
        Float.intBitsToFloat(0x3dd44d6d),
        Float.intBitsToFloat(0x3de2195c),
        Float.intBitsToFloat(0x3df0cad1),
        Float.intBitsToFloat(0x3e00385b),
        Float.intBitsToFloat(0x3e088d77),
        Float.intBitsToFloat(0x3e116d33),
        Float.intBitsToFloat(0x3e1ae090),
        Float.intBitsToFloat(0x3e24f127),
        Float.intBitsToFloat(0x3e2fa92e),
        Float.intBitsToFloat(0x3e3b1387),
        Float.intBitsToFloat(0x3e473bca),
        Float.intBitsToFloat(0x3e542e4d),
        Float.intBitsToFloat(0x3e61f837),
        Float.intBitsToFloat(0x3e70a784),
        Float.intBitsToFloat(0x3e80258f),
        Float.intBitsToFloat(0x3e887973),
        Float.intBitsToFloat(0x3e9157e2),
        Float.intBitsToFloat(0x3e9ac9dc),
        Float.intBitsToFloat(0x3ea4d8f9),
        Float.intBitsToFloat(0x3eaf8f6d),
        Float.intBitsToFloat(0x3ebaf81b),
        Float.intBitsToFloat(0x3ec71e95),
        Float.intBitsToFloat(0x3ed40f33),
        Float.intBitsToFloat(0x3ee1d717),
        Float.intBitsToFloat(0x3ef0843d),
        Float.intBitsToFloat(0x3f0012c6),
        Float.intBitsToFloat(0x3f086572),
        Float.intBitsToFloat(0x3f114293),
        Float.intBitsToFloat(0x3f1ab32b),
        Float.intBitsToFloat(0x3f24c0ce),
        Float.intBitsToFloat(0x3f2f75b1),
        Float.intBitsToFloat(0x3f3adcb2),
        Float.intBitsToFloat(0x3f470165),
        Float.intBitsToFloat(0x3f53f01d),
        Float.intBitsToFloat(0x3f61b5fb),
        Float.intBitsToFloat(0x3f7060fb),
        Float.intBitsToFloat(0x3f800000)
    };

    public ThemeDropdownSelectBox() {
        super();
    }

    public final Object Pl(i30_0 v1, IH0 v2) {
        int ignoredMax = 0;
        int maxLevel = -1;
        UL0 ul = new UL0();
        ul.tW = v2.IQ(5);
        for (int i = 0; i < ul.tW; i++) {
            ul.ni[i] = v2.IQ(4);
            if (ul.ni[i] > maxLevel) {
                maxLevel = ul.ni[i];
            }
        }
        for (int level = 0; level < maxLevel + 1; level++) {
            ul.dc0[level] = v2.IQ(3) + 1;
            ul.nj[level] = v2.IQ(2);
            if (ul.nj[level] < 0) {
                ul.gB0();
                return null;
            }
            if (ul.nj[level] != 0) {
                ul.nl0[level] = v2.IQ(8);
            }
            int codebook = ul.nl0[level];
            if (codebook < 0 || codebook >= v1.LT) {
                ul.gB0();
                return null;
            }
            int entries = 1 << ul.nj[level];
            for (int entry = 0; entry < entries; entry++) {
                ul.t90[level][entry] = v2.IQ(8) - 1;
                int value = ul.t90[level][entry];
                if (value < -1 || value >= v1.LT) {
                    ul.gB0();
                    return null;
                }
            }
        }
        ul.ER = v2.IQ(2) + 1;
        int bitCount = v2.IQ(4);
        int total = 0;
        for (int i = 0; i < ul.tW; i++) {
            total += ul.dc0[ul.ni[i]];
        }
        for (int i = 0; i < total; i++) {
            int value = v2.IQ(bitCount);
            ul.BP[i + 2] = value;
            if (value < 0 || value >= (1 << bitCount)) {
                ul.gB0();
                return null;
            }
        }
        ul.BP[0] = 0;
        ul.BP[1] = 1 << bitCount;
        return ul;
    }

    public final Object d9(Lz0 ignored1, d4_0 ignored2, Object object) {
        UL0 ul = (UL0) object;
        int[] order = new int[65];
        gp_0 gp = new gp_0();
        gp.Eo = ul;
        gp.i4 = ul.BP[1];
        int total = 0;
        for (int i = 0; i < ul.tW; i++) {
            total += ul.dc0[ul.ni[i]];
        }
        int count = total + 2;
        gp.C4 = count;
        for (int i = 0; i < count; i++) {
            order[i] = i;
        }
        for (int i = 0; i < total + 1; i++) {
            for (int j = i; j < count; j++) {
                if (ul.BP[order[i]] > ul.BP[order[j]]) {
                    int swap = order[i];
                    order[i] = order[j];
                    order[j] = swap;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            gp.Xk[i] = order[i];
        }
        for (int i = 0; i < count; i++) {
            gp.E7[gp.Xk[i]] = i;
        }
        for (int i = 0; i < count; i++) {
            gp.Dy0[i] = ul.BP[gp.Xk[i]];
        }
        switch (ul.ER) {
            case 1:
                gp.b20 = 256;
                break;
            case 2:
                gp.b20 = 128;
                break;
            case 3:
                gp.b20 = 86;
                break;
            case 4:
                gp.b20 = 64;
                break;
            default:
                gp.b20 = -1;
                break;
        }
        for (int i = 0; i < total; i++) {
            int lowIndex = 0;
            int highIndex = 1;
            int lowValue = 0;
            int maxValue = gp.i4;
            int target = ul.BP[i + 2];
            for (int j = 0; j < i + 2; j++) {
                int value = ul.BP[j];
                if (value > lowValue && value < target) {
                    lowValue = value;
                    lowIndex = j;
                }
                if (value < maxValue && value > target) {
                    maxValue = value;
                    highIndex = j;
                }
            }
            gp.zu[i] = lowIndex;
            gp.ts0[i] = highIndex;
        }
        return gp;
    }

    public final void tX() {
    }

    public final Object T80(w90_0 stream, Object object, Object stateObject) {
        gp_0 gp = (gp_0) object;
        UL0 ul = gp.Eo;
        DP[] codebooks = stream.cq0.xY;
        if (stream.bj0.IQ(1) != 1) {
            return null;
        }
        int[] state = stateObject instanceof int[] ? (int[]) stateObject : null;
        if (state == null || state.length < gp.C4) {
            state = new int[gp.C4];
        } else {
            for (int i = 0; i < state.length; i++) {
                state[i] = 0;
            }
        }
        int bits = MB.iY(gp.b20 - 1);
        state[0] = stream.bj0.IQ(bits);
        state[1] = stream.bj0.IQ(bits);
        int offset = 2;
        for (int sequence = 0; sequence < ul.tW; sequence++) {
            int level = ul.ni[sequence];
            int dimensions = ul.dc0[level];
            int codeBits = ul.nj[level];
            int range = 1 << codeBits;
            int code = 0;
            if (codeBits != 0) {
                code = codebooks[ul.nl0[level]].FP(stream.bj0);
                if (code == -1) {
                    return null;
                }
            }
            for (int dimension = 0; dimension < dimensions; dimension++) {
                int codebookIndex = ul.t90[level][code & (range - 1)];
                code >>>= codeBits;
                if (codebookIndex < 0) {
                    state[offset + dimension] = 0;
                } else {
                    int value = codebooks[codebookIndex].FP(stream.bj0);
                    state[offset + dimension] = value;
                    if (value == -1) {
                        return null;
                    }
                }
            }
            offset += dimensions;
        }
        for (int target = 2; target < gp.C4; target++) {
            int segment = target - 2;
            int lowerIndex = gp.zu[segment];
            int lowerPosition = ul.BP[lowerIndex];
            int upperIndex = gp.ts0[segment];
            int upperPosition = ul.BP[upperIndex];
            int lowerValue = state[lowerIndex] & 32767;
            int upperValue = state[upperIndex] & 32767;
            int targetPosition = ul.BP[target];
            int delta = upperValue - lowerValue;
            int denominator = upperPosition - lowerPosition;
            int quotient = (targetPosition - lowerPosition) * Math.abs(delta) / denominator;
            int interpolated = delta < 0 ? lowerValue - quotient : lowerValue + quotient;
            int complement = gp.b20 - interpolated;
            int bound = complement < interpolated ? complement : interpolated;
            int threshold = bound << 1;
            int current = state[target];
            if (current == 0) {
                state[target] = interpolated | 32768;
            } else {
                if (current >= threshold) {
                    if (complement > interpolated) {
                        current = current - interpolated;
                    } else {
                        current = -1 - (current - complement);
                    }
                } else if ((current & 1) != 0) {
                    current = -((current + 1) >>> 1);
                } else {
                    current >>= 1;
                }
                interpolated += current;
                state[target] = interpolated;
                state[lowerIndex] &= 32767;
                state[upperIndex] &= 32767;
            }
        }
        return state;
    }

    public final int TG0(w90_0 stream, Object object, Object stateObject, float[] output) {
        gp_0 gp = (gp_0) object;
        UL0 ul = gp.Eo;
        int half = stream.cq0.sg.u5[stream.Nm] / 2;
        if (stateObject != null) {
            int[] state = (int[]) stateObject;
            int start = 0;
            int previousPosition = 0;
            int previousValue = state[0] * ul.ER;
            for (int i = 1; i < gp.C4; i++) {
                int stateIndex = gp.Xk[i];
                int stateValue = state[stateIndex];
                int magnitude = stateValue & 32767;
                if (stateValue == magnitude) {
                    int runValue = magnitude * ul.ER;
                    int currentValue = ul.BP[stateIndex];
                    int delta = runValue - previousValue;
                    int span = currentValue - previousPosition;
                    int step = delta / span;
                    int correction = delta < 0 ? step - 1 : step + 1;
                    int residual = Math.abs(delta) - Math.abs(step * span);
                    int remainder = 0;
                    output[previousPosition] *= ZM[previousValue];
                    while (++previousPosition < currentValue) {
                        remainder += residual;
                        if (remainder >= span) {
                            int oldValue = previousValue;
                            previousValue = remainder - span;
                            remainder = oldValue + correction;
                            int swap = remainder;
                            remainder = previousValue;
                            previousValue = swap;
                        } else {
                            previousValue += step;
                        }
                        output[previousPosition] *= ZM[previousValue];
                    }
                    previousValue = runValue;
                    previousPosition = currentValue;
                    start = currentValue;
                }
            }
            while (start < half) {
                if (start == 0) {
                    output[start] = 0.0f;
                } else {
                    output[start] *= output[start - 1];
                }
                start++;
            }
            return 1;
        }
        for (int i = 0; i < half; i++) {
            output[i] = 0.0f;
        }
        return 0;
    }
}
