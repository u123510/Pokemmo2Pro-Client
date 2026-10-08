package cn.pokemmo.graphics.gl;

import f.*;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.IntBuffer;

public class MultiVertexAttributeArray implements cc0_2 {
    public final int kf0;
    public final int Nj;
    public final lq_2[] G6;
    public final int[] S;
    public final int Pr0;
    public boolean Nh;
    public final B90 s20;
    public int Oy0;

    public MultiVertexAttributeArray(int value) {
        this(value, 0);
    }

    public MultiVertexAttributeArray(int value, int count) {
        this(value, count, -1);
    }

    public MultiVertexAttributeArray(int unit, int offset, int count) {
        this.s20 = new B90();
        this.Oy0 = 0;
        int limit = Math.min(J(), 32);
        if (count < 0) {
            count = limit - offset;
        }
        if (offset < 0 || count < 0 || offset + count > limit) {
            throw new nf_1("Illegal arguments");
        }
        this.Pr0 = unit;
        this.kf0 = offset;
        this.Nj = count;
        this.G6 = new lq_2[count];
        this.S = unit == 1 ? new int[count] : null;
        if (this.S != null) {
            for (int i = 0; i < count; i++) {
                this.S[i] = i;
            }
        }
    }

    public static int J() {
        IntBuffer buffer = BufferUtils.yD0(16);
        lg_0.OH0.glGetIntegerv(34930, buffer);
        return buffer.get(0);
    }

    public final int d30(B90 state) {
        lq_2 texture = state.uj;
        this.Nh = false;
        int active = this.Pr0;
        if (active != 0) {
            if (active != 1) {
                return -1;
            }
            active = this.kf0;
            int slot = 0;
            int length;
            while (slot < (length = this.Nj)) {
                lq_2 current = this.G6[this.S[slot]];
                if (current == texture) {
                    this.Nh = true;
                    break;
                }
                if (current == null) {
                    break;
                }
                slot++;
            }
            if (slot >= length) {
                slot = length - 1;
            }
            int index = this.S[slot];
            while (slot > 0) {
                this.S[slot] = this.S[slot - 1];
                slot--;
            }
            this.S[0] = index;
            if (!this.Nh) {
                this.G6[index] = texture;
                texture.bind(this.kf0 + index);
            }
            active += index;
        } else {
            active = this.kf0;
            int slot = 0;
            int length;
            int index = -1;
            while (slot < (length = this.Nj)) {
                index = (this.Oy0 + slot) % length;
                if (this.G6[index] == texture) {
                    this.Nh = true;
                    break;
                }
                slot++;
            }
            if (!this.Nh) {
                index = (this.Oy0 + 1) % length;
                this.Oy0 = index;
                this.G6[index] = texture;
                texture.bind(this.kf0 + index);
            }
            active += index;
        }
        if (this.Nh) {
            lg_0.OH0.glActiveTexture(active + 33984);
        }
        texture.unsafeSetWrap(state.Zk0, state.HH);
        texture.unsafeSetFilter(state.xQ, state.Rb0);
        return active;
    }
}
