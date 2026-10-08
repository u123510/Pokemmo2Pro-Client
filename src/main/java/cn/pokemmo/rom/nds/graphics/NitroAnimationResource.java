package cn.pokemmo.rom.nds.graphics;

import f.*;

import java.nio.ByteBuffer;

public class NitroAnimationResource {
    public final Ae Cb0;
    public final boolean Bu;
    public final Lw0 yG;
    public final Bp0 Oe;
    public final OD0 Ye;
    public final Bp0 Nx0;
    public final Bp0 vn;

    public NitroAnimationResource(Ae ae, boolean z) {
        this.yG = new Lw0();
        this.Oe = new Bp0();
        this.Ye = new OD0();
        this.Nx0 = new Bp0();
        this.vn = new Bp0();
        this.Cb0 = ae;
        this.Bu = z;
        to();
    }

    public static boolean t90(gl_1 gl, int index, OD0 od, short[] matrix, Bp0 bp) {
        if (index < 0 || index >= gl.Mi) {
            return false;
        }
        ac0_1 ac = gl.wz0[index].Sm;
        short vk = gl.Vk0;
        if (vk == 0) {
            od.VB = ac.DK0;
            if (matrix != null) {
                matrix[0] = 256;
                matrix[1] = 0;
                matrix[2] = 0;
                matrix[3] = 256;
            }
            return true;
        }
        if (vk == 1) {
            od.VB = ac.DK0;
            double angle = ((double) ac.WM * 6.2831853072) / 65536.0;
            int sin = (int) (Math.sin(angle) * 4096.0);
            int cos = (int) (Math.cos(angle) * 4096.0);
            if (matrix != null) {
                int cos256 = cos * 256;
                int tc = ac.tc0;
                matrix[0] = (short) (cos256 / tc);
                matrix[1] = (short) ((sin * 256) / tc);
                int uf = ac.uF;
                matrix[2] = (short) ((-sin * 256) / uf);
                matrix[3] = (short) (cos256 / uf);
            }
            bp.x = ac.Ng0;
            bp.y = ac.d80;
            return true;
        }
        if (vk == 2) {
            od.VB = ac.DK0;
            if (matrix != null) {
                matrix[0] = 256;
                matrix[1] = 0;
                matrix[2] = 0;
                matrix[3] = 256;
            }
            bp.x = ac.Ng0;
            bp.y = ac.d80;
            return true;
        }
        od.VB = 0;
        return true;
    }

    public final int yq0(int animIndex) {
        if (animIndex < 0 || animIndex >= this.yG.v3) {
            return -1;
        }
        gl_1 gl = this.yG.Sc[animIndex];
        iv_2[] frames = gl.wz0;
        int totalDuration = 0;
        for (int i = 0; i < gl.Mi; i++) {
            totalDuration += frames[i].tj;
        }
        return totalDuration;
    }

    public final int yz0(int time, short animIndex) {
        if (animIndex < 0 || animIndex >= this.yG.v3) {
            return -1;
        }
        gl_1 gl = this.yG.Sc[animIndex];
        iv_2[] frames = gl.wz0;
        short totalDuration = 0;
        for (int i = 0; i < gl.Mi; i++) {
            short duration = frames[i].tj;
            if (time < duration) {
                return i;
            }
            time -= duration;
            totalDuration = (short) (totalDuration + duration);
        }
        if (totalDuration == 0) {
            return 0;
        }
        time %= totalDuration;
        for (int i = 0; i < gl.Mi; i++) {
            short duration = frames[i].tj;
            if (time < duration) {
                return i;
            }
            time -= duration;
        }
        return 0;
    }

    public final boolean Hh0(short animIndex, int frameIndex, xt_0 xt, float offsetX, float offsetY) {
        if (animIndex < 0 || animIndex >= this.yG.v3) {
            return false;
        }
        gl_1 gl = this.yG.Sc[animIndex];
        U4 u4 = (U4) xt.jG0.obtain();
        if (frameIndex < 0 || frameIndex >= gl.Mi) {
            xt.jG0.free(u4);
            return false;
        }
        ac0_1 ac = gl.wz0[frameIndex].Sm;
        short vk = gl.Vk0;
        if (vk == 0) {
            u4.WU = ac.DK0;
        } else if (vk == 1) {
            u4.WU = ac.DK0;
            u4.N60 = ac;
            u4.Tt = ac.Ng0;
            u4.DJ = ac.d80;
        } else if (vk == 2) {
            u4.WU = ac.DK0;
            u4.Tt = ac.Ng0;
            u4.DJ = ac.d80;
        }
        u4.Tt = (int) (u4.Tt + offsetX);
        u4.DJ = (int) (u4.DJ + offsetY);
        xt.em.DX(u4.WU, this.Nx0, this.vn);
        u4.RI = this.vn.x - this.Nx0.x / 2.0f;
        u4.S6 = this.vn.y - this.Nx0.y / 2.0f;
        u4.DJ = -u4.DJ;
        xt.DA0.Ue0(u4);
        return true;
    }

    public final void to() {
        ByteBuffer buf = this.Cb0.MH(this.Bu);
        int magic = buf.getInt();
        buf.getShort();
        buf.getShort();
        buf.getInt();
        buf.getShort();
        buf.getShort();
        int[] validMagics = new int[] { 1312902738, 1313685842 };
        for (int i = 0; i < 2; i++) {
            if (magic == validMagics[i]) {
                byte[] unused4 = new byte[4];
                buf.get(unused4);
                buf.getInt();
                this.yG.v3 = buf.getShort();
                buf.getShort();
                buf.getInt();
                this.yG.Lpt3 = buf.getInt();
                this.yG.Wu = buf.getInt();
                buf.getLong();
                this.yG.Sc = new gl_1[this.yG.v3];
                for (int anim = 0; anim < this.yG.v3; anim++) {
                    buf.position(anim * 16 + 48);
                    gl_1 gl = new gl_1();
                    gl.Mi = buf.getInt();
                    gl.Vk0 = buf.getShort();
                    buf.getShort();
                    buf.getShort();
                    buf.getShort();
                    gl.Kd0 = buf.getInt();
                    gl.wz0 = new iv_2[gl.Mi];
                    for (int frame = 0; frame < gl.Mi; frame++) {
                        buf.position(frame * 8 + this.yG.Lpt3 + 24 + gl.Kd0);
                        iv_2 iv = new iv_2();
                        iv.g2 = buf.getInt();
                        iv.tj = buf.getShort();
                        buf.getShort();
                        buf.position(this.yG.Wu + 24 + iv.g2);
                        iv.Sm.DK0 = buf.getShort();
                        short vk = gl.Vk0;
                        if (vk == 0) {
                            buf.getShort();
                        } else if (vk == 1) {
                            iv.Sm.WM = buf.getShort();
                            iv.Sm.Rq = ((float) (iv.Sm.WM & 0xFFFF) / 65536.0f) * -360.0f;
                            iv.Sm.tc0 = buf.getInt();
                            iv.Sm.uF = buf.getInt();
                            Bp0 bp = new Bp0(px_1.Ei0(iv.Sm.tc0), px_1.Ei0(iv.Sm.uF));
                            if (bp.x < 0.0f) {
                                iv.Sm.ht = true;
                                bp.x = -bp.x;
                            }
                            if (bp.y < 0.0f) {
                                iv.Sm.instanceof$ = true;
                                bp.y = -bp.y;
                            }
                            iv.Sm.xd0 = bp;
                            iv.Sm.Ng0 = buf.getShort();
                            iv.Sm.d80 = buf.getShort();
                        } else if (vk == 2) {
                            buf.getShort();
                            iv.Sm.Ng0 = buf.getShort();
                            iv.Sm.d80 = buf.getShort();
                        }
                        gl.wz0[frame] = iv;
                    }
                    this.yG.Sc[anim] = gl;
                }
                return;
            }
        }
        throw new RuntimeException(yr_1.pG("Header magic mismatch = ", magic));
    }
}

