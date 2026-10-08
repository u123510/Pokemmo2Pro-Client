package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PokedexEntryUpdatePacket extends GH {
    public CH0 xt;
    public int ge;
    public byte Qi0;
    public int fW;
    public short[] Zm0;
    public byte[] TD;
    public byte c80;
    public short yT;
    public byte L90;
    public short Ec;
    public byte Xg;
    public _volatile R70;
    public short Oz;
    public HashMap vo0;
    public short[] F3;
    public short sJ;
    public short LQ;
    public int L1;
    public int Bc0;
    public byte Sr0;
    public byte bz;
    public byte mR;
    public short vj;
    public short QH0;
    public byte Ly0;
    public QL gL;
    public QL[] Rt;
    public long bY;
    public short Te0;
    public int AF0;
    public byte A7;
    public short[] dk0;
    public short[] R0;
    public byte gt;
    public String Com4;
    public rz_0 u40;

    public PokedexEntryUpdatePacket(k20_0 owner, ByteBuffer buffer) {
        super(owner, buffer);
        this.xt = CH0.j1;
        this.Rt = QL.rn0;
        this.Com4 = "";
    }

    @Override
    public final void Oj0() {
        this.xt = this.pE();
        this.ge = this.Rj.getInt();
        if ((this.ge & 1) != 0) {
            this.Qi0 = this.Rj.get();
            this.fW = this.Rj.getInt();
        }
        if ((this.ge & 2) != 0) {
            this.vo0 = new HashMap();
            gc_2[] kinds = gc_2.Wp;
            for (gc_2 kind : kinds) {
                this.vo0.put(kind, Short.valueOf(this.Rj.getShort()));
            }
        }
        if ((this.ge & 4) != 0) {
            this.Zm0 = new short[4];
            this.TD = new byte[4];
            for (int i = 0; i < 4; i++) {
                this.Zm0[i] = this.Rj.getShort();
                this.TD[i] = this.Rj.get();
            }
            this.c80 = this.Rj.get();
        }
        if ((this.ge & 8) != 0) {
            this.yT = this.Rj.getShort();
        }
        if ((this.ge & 16) != 0) {
            this.L90 = this.Rj.get();
        }
        if ((this.ge & 32) != 0) {
            this.Ec = this.Rj.getShort();
            this.Xg = this.Rj.get();
        }
        if ((this.ge & 64) != 0) {
            this.R70 = (_volatile) _volatile.zs0.BM(this.Rj.get());
            this.Oz = this.Rj.getShort();
        }
        if ((this.ge & 128) != 0) {
            gc_2[] kinds = gc_2.Wp;
            this.F3 = new short[kinds.length];
            for (gc_2 kind : kinds) {
                this.F3[kind.v10] = this.Rj.getShort();
            }
        }
        if ((this.ge & 256) != 0) {
            this.sJ = this.Rj.getShort();
        }
        if ((this.ge & 512) != 0) {
            this.LQ = this.Rj.getShort();
        }
        if ((this.ge & 1024) != 0) {
            this.L1 = this.Rj.getInt();
            this.Bc0 = this.Rj.getInt();
            this.Sr0 = this.Rj.get();
            this.bz = this.Rj.get();
            this.mR = this.Rj.get();
        }
        if ((this.ge & 2048) != 0) {
            this.vj = this.Rj.getShort();
        }
        if ((this.ge & 4096) != 0) {
            this.QH0 = this.Rj.getShort();
        }
        if ((this.ge & 8192) != 0) {
            this.Ly0 = this.Rj.get();
        }
        if ((this.ge & 16384) != 0) {
            this.bY = this.Rj.getLong();
        }
        if ((this.ge & 2097152) != 0) {
            this.AF0 = this.Rj.getInt();
        }
        if ((this.ge & 32768) != 0) {
            this.dk0 = new short[4];
            for (int i = 0; i < 4; i++) {
                this.dk0[i] = this.Rj.getShort();
            }
            this.Com4 = this.q60();
        }
        if ((this.ge & 65536) != 0) {
            this.u40 = (rz_0) rz_0.RM.BM(this.Rj.get());
        }
        if ((this.ge & 131072) != 0) {
            this.A7 = this.Rj.get();
        }
        if ((this.ge & 262144) != 0) {
            this.R0 = new short[ib0_0.rl.length];
            for (int i = 0; i < this.R0.length; i++) {
                this.R0[i] = this.Rj.getShort();
            }
        }
        if ((this.ge & 524288) != 0) {
            this.gt = this.Rj.get();
        }
        if ((this.ge & 1048576) != 0) {
            this.Te0 = this.Rj.getShort();
        }
        if ((this.ge & 4194304) != 0) {
            int count = this.Rj.get();
            this.Rt = new QL[count];
            for (int i = 0; i < this.Rt.length; i++) {
                this.Rt[i] = QL.Q8(this.Rj.get());
            }
        }
        if ((this.ge & 8388608) != 0) {
            this.gL = QL.Q8(this.Rj.get());
        }
    }

    @Override
    public final void os0() {
        Ge0 scene = this.sr0();
        _volatile[] effects = _volatile.pG0;
        VU object = scene.FJ0(this.xt, effects);
        if (object == null) {
            return;
        }
        CE state = object.I8;
        _volatile effect = state.JF;
        Mj controller = scene.r1(effect);
        if (controller == null) {
            return;
        }

        if ((this.ge & 64) != 0) {
            if (this.R70 == effect) {
                state.ou0 = this.Oz;
                controller.rr0 = true;
                controller.jf = false;
            } else {
                int mode;
                switch (effect.Hf) {
                    case 0:
                        mode = 2;
                        break;
                    case 1:
                        mode = 1;
                        break;
                    case 2:
                        mode = 7;
                        break;
                    case 3:
                        mode = 4;
                        break;
                    case 4:
                        mode = 8;
                        break;
                    case 9:
                        mode = 6;
                        break;
                    case 10:
                        mode = 3;
                        break;
                    case 11:
                        mode = 5;
                        break;
                    default:
                        mode = 0;
                        break;
                }
                if (mode == 1 || mode == 2 || mode == 3 || mode == 4 || mode == 5 || mode == 6) {
                    controller.Qe(object.pu);
                } else if (mode == 7) {
                    Dm0 data = scene.bh;
                    if (data != null) {
                        Mj target = data.COM3[data.c80];
                        target.Qe(object.pu);
                    }
                }
            }
            if (this.R70 != effect) {
                effect = this.R70;
                controller = scene.r1(effect);
                state.JF = effect;
                state.ou0 = this.Oz;
                int mode;
                switch (effect.Hf) {
                    case 0:
                        mode = 2;
                        break;
                    case 1:
                        mode = 1;
                        break;
                    case 2:
                        mode = 7;
                        break;
                    case 3:
                        mode = 4;
                        break;
                    case 4:
                        mode = 8;
                        break;
                    case 9:
                        mode = 6;
                        break;
                    case 10:
                        mode = 3;
                        break;
                    case 11:
                        mode = 5;
                        break;
                    default:
                        mode = 0;
                        break;
                }
                if (mode == 1 || mode == 2 || mode == 3 || mode == 4 || mode == 5 || mode == 6) {
                    controller.hD(object);
                } else if (mode == 7) {
                    Dm0 data = scene.bh;
                    if (data != null) {
                        Mj target = data.COM3[data.c80];
                        target.hD(object);
                    }
                }
            }
        }

        for (int i = 0; i < effects.length; i++) {
            _volatile item = effects[i];
            Mj itemController = scene.r1(item);
            if (itemController == null) {
                continue;
            }
            if (item.vr0 || S.ZT(item, _volatile.VA)) {
                itemController.rr0 = true;
                itemController.jf = false;
            }
        }

        Dm0 data = scene.bh;
        if (data != null) {
            Mj target = data.COM3[data.c80];
            target.rr0 = true;
            target.jf = false;
        }

        if ((this.ge & 1) != 0) {
            a10_0 manager = tw0_0.PK0;
            if (manager == null || manager.nf == Cq.Jd) {
                state.wj = this.Qi0;
                state.Lr0 = this.fW;
            } else {
                LM pending = new LM(object, this.Qi0, this.fW);
                boolean replaced = false;
                Iterator iterator = manager.Tk0.iterator();
                while (iterator.hasNext()) {
                    Object value = iterator.next();
                    if (!(value instanceof LM)) {
                        continue;
                    }
                    LM existing = (LM) value;
                    CH0 existingChannel = existing.Rw0 == null ? CH0.j1 : existing.Rw0.pu;
                    CH0 pendingChannel = pending.Rw0 == null ? CH0.j1 : pending.Rw0.pu;
                    if (existingChannel.equals(pendingChannel)) {
                        existing.y30 = pending.y30;
                        existing.o70 = pending.o70;
                        replaced = true;
                        break;
                    }
                }
                if (!replaced) {
                    manager.Tk0.add(pending);
                }
            }
        }

        if ((this.ge & 2) != 0) {
            Iterator iterator = this.vo0.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                if (entry.getKey() != gc_2.RC) {
                    continue;
                }
                a10_0 manager = tw0_0.PK0;
                if (manager == null) {
                    continue;
                }
                CH0 channel = object.pu;
                short value = ((Short) entry.getValue()).shortValue();
                tb0_1 task = manager.yD0(channel);
                if (task == null) {
                    continue;
                }
                task.B3.Sj = value;
                task.Wb();
                PF packet = manager.nd0(channel);
                if (packet == null) {
                    continue;
                }
                jd0_1 action = tw0_0.LD0.he0.N10.Hi(packet);
                action.le0(packet, true, packet.uk());
            }
        }

        if ((this.ge & 4) != 0) {
            for (int i = 0; i < 4; i++) {
                CE target = object.I8;
                int value = this.Zm0[i];
                target.Gu[i] = (short) value;
                int amount = this.TD[i];
                if (amount < 0) {
                    amount = 0;
                } else if (amount > 100) {
                    amount = 100;
                }
                target.TC0[i] = (byte) amount;
            }
            object.I8.WH0 = this.c80;
        }

        if ((this.ge & 8) != 0) {
            object.I8.hB(this.yT);
            if (this.yT < 1) {
                object.I8.H1 = (byte) object.I8.H1;
            }
        }
        int flags = this.ge;
        if ((flags & 16) != 0) {
            object.I8.H1 = this.L90;
        }
        if ((flags & 32) != 0) {
            object.I8.Yb0 = this.Ec;
            object.I8.ZF0 = this.Xg;
            object.aG((cq_0) mp_1.vf0().k2.get(Short.valueOf(this.Ec)));
        }
        if ((flags & 128) != 0) {
            for (gc_2 kind : gc_2.ME) {
                if (!kind.j8) {
                    object.I8.QK((short) 0, kind);
                }
            }
            for (gc_2 kind : gc_2.ME) {
                if (!kind.j8) {
                    object.I8.QK(this.F3[kind.v10], kind);
                }
            }
        }
        if ((flags & 256) != 0) {
            object.I8.pQ = this.sJ;
            _volatile current = object.I8.JF;
            int mode;
            switch (current.Hf) {
                case 0:
                    mode = 2;
                    break;
                case 1:
                    mode = 1;
                    break;
                case 2:
                    mode = 7;
                    break;
                case 3:
                    mode = 4;
                    break;
                case 4:
                    mode = 8;
                    break;
                case 9:
                    mode = 6;
                    break;
                case 10:
                    mode = 3;
                    break;
                case 11:
                    mode = 5;
                    break;
                default:
                    mode = 0;
                    break;
            }
            if (mode == 1 || mode == 2 || mode == 3 || mode == 6 || mode == 8) {
                Mj itemController = scene.r1(current);
                if (itemController != null) {
                    itemController.rr0 = true;
                    itemController.jf = false;
                }
            }
        }
        if ((flags & 512) != 0) {
            int amount = this.LQ;
            if (amount < 0) {
                amount = 0;
            } else if (amount > 255) {
                amount = 255;
            }
            object.I8.bm = (short) amount;
        }
        if ((flags & 1024) != 0) {
            CE target = object.I8;
            target.vQ = this.L1;
            target.tI();
            target.t50 = this.Bc0;
            target.vO = this.Sr0;
            target.aJ0 = this.bz;
            int value = this.mR;
            if (value < 0 || value > 5) {
                value = 0;
            }
            target.dZ = (byte) value;
        }
        if ((flags & 2048) != 0) {
            object.I8.SW = this.vj;
        }
        if ((flags & 4096) != 0 && tw0_0.PK0 == null) {
            String[] values = new String[2];
            values[0] = sm0_0.c0(gu0.l2.lPT6(this.QH0).Nl);
            values[1] = object.na0();
            scene.qK(sm0_0.Bx(6009, values));
        }
        if ((flags & 8192) != 0) {
            CE target = object.I8;
            int value = this.Ly0;
            if (value < 0 || value > 24) {
                value = 3;
            }
            target.QQ = (byte) value;
        }
        if ((flags & 16384) != 0) {
            object.I8.gU = this.bY;
            Mj itemController = scene.r1(_volatile.BV);
            itemController.rr0 = true;
            itemController.jf = false;
        }
        int originalFlags = this.ge;
        if ((originalFlags & 2097152) != 0) {
            object.I8.al0 = this.AF0;
        }
        if ((originalFlags & 32768) != 0) {
            for (int i = 0; i < this.dk0.length; i++) {
                object.I8.V3[i] = this.dk0[i];
            }
        }
        object.I8.bj = this.Com4;
        Mj itemController = scene.r1(_volatile.BV);
        itemController.rr0 = true;
        itemController.jf = false;

        if ((originalFlags & 65536) != 0) {
            CE target = object.I8;
            int base = this.u40.f10;
            int low = target.vQ & 255;
            int high = target.vQ & Integer.MIN_VALUE;
            int offset = high == 0 ? 0 : 23;
            int value = (((((base - (low % 25) - offset) % 25 + 25) % 25) * 21) % 25) << 8;
            target.vQ = (value | high) + low;
            target.tI();
        }
        if ((originalFlags & 262144) != 0) {
            for (ib0_0 kind : ib0_0.rl) {
                int value = this.R0[kind.nH];
                CE target = object.I8;
                if (target.iB()) {
                    continue;
                }
                switch (kind.ku0 + 1) {
                    case 1:
                        target.sl = (byte) value;
                        break;
                    case 2:
                        target.GD0 = (byte) value;
                        break;
                    case 3:
                        target.Fe = (byte) value;
                        break;
                    case 4:
                        target.y8 = (byte) value;
                        break;
                    case 5:
                        target.zc = (byte) value;
                        break;
                    default:
                        break;
                }
            }
        }
        if ((originalFlags & 524288) != 0) {
            if (this.gt < 0) {
                object.I8.kQ = null;
            } else {
                object.I8.kQ = i40_0.MG0(this.gt);
            }
        }
        if ((originalFlags & 1048576) != 0) {
            object.I8.n7(this.Te0);
        }
        if ((originalFlags & 131072) != 0) {
            int value = this.A7;
            if (value < 0 || value > 2) {
                value = 0;
            }
            object.I8.Xn0 = (byte) value;
        }
        if ((originalFlags & 4194304) != 0) {
            object.I8.bG0 = this.Rt;
        }
        if ((originalFlags & 8388608) != 0 && object.I8.N00 != this.gL) {
            object.I8.N00 = this.gL;
        }
        if (controller != null) {
            controller.rr0 = true;
            controller.jf = false;
        }
        scene.CA(object);
    }
}
