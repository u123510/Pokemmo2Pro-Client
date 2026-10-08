package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode063Packet extends GH {
    public final boolean[][] pH0;
    public final boolean[][] S70;
    public final int[][] y90;

    public ServerOpcode063Packet(k20_0 context, ByteBuffer buffer) {
        super(context, buffer);
        this.pH0 = new boolean[2][];
        this.S70 = new boolean[2][];
        this.y90 = new int[2][];
    }

    public final void Oj0() {
        byte group = 0;
        while (group < 2) {
            byte count = this.Rj.get();
            this.pH0[group] = new boolean[count];
            this.S70[group] = new boolean[count];
            this.y90[group] = new int[count];

            int index = 0;
            while (index < count) {
                this.pH0[group][index] = this.Rj.get() == 1;
                if (this.pH0[group][index]) {
                    this.S70[group][index] = this.Rj.get() == 1;
                    this.y90[group][index] = this.Rj.getShort();
                }
                index++;
            }

            group = (byte) (group + 1);
        }
    }

    public final void os0() {
        if (tw0_0.PK0 == null) {
            return;
        }

        byte group = 0;
        while (group < this.pH0.length) {
            byte index = 0;
            while (true) {
                boolean[] present = this.pH0[group];
                if (index >= present.length) {
                    break;
                }

                if (present[index]) {
                    dl_2 state = tw0_0.PK0.Qt0(group, index);
                    if (state != null) {
                        boolean enabled = this.S70[group][index];
                        int value = this.y90[group][index];
                        state.Ui0 = enabled;
                        state.VS = value;

                        if (enabled) {
                            state.V1 = (int) (System.currentTimeMillis() / 1000L);

                            int remaining;
                            if (state.Ui0) {
                                remaining = state.VS
                                        - (int) (System.currentTimeMillis() / 1000L - (long) state.V1);
                                if (remaining < 0) {
                                    remaining = 0;
                                }

                                int limit = state.EG;
                                if (limit > 0 && remaining > limit) {
                                    remaining = limit;
                                }
                            } else {
                                remaining = state.VS;
                                if (remaining < 0) {
                                    remaining = 0;
                                }
                            }

                            state.EG = remaining - 1;
                        } else {
                            state.EG = -1;
                        }
                    }
                }

                index = (byte) (index + 1);
            }

            group = (byte) (group + 1);
        }
    }
}
