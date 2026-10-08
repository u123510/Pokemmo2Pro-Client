package cn.pokemmo.rom.gba.sprite;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public class GbaSpritePaletteLoader {
    public static final PO Ue0 = new PO();
    public static final GbaSpritePaletteLoader Py = new GbaSpritePaletteLoader();
    public final bm0_1 s10;
    public final bm0_1 cd;

    public GbaSpritePaletteLoader() {
        this.s10 = new bm0_1();
        this.cd = new bm0_1();
        for (byte type = 0; type < 5; type++) {
            this.cd.gE0(type, new i8_0[46]);
            this.s10.gE0(type, new to_0());
        }
        this.cd.gE0((byte) 10, new i8_0[46]);
        this.s10.gE0((byte) 10, new to_0());
    }

    public static GbaSpritePaletteLoader KH0() {
        return Py;
    }

    public final void ny0(qa0_1 data) {
        if (data == null) {
            return;
        }
        ByteBuffer buf = data.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        buf.position(data.EZ.V(br_2.ZV));
        byte type = data.rt0();
        i8_0[] entries = (i8_0[]) this.cd.BM(type);

        for (int index = 0; index < entries.length - 2; index++) {
            int size = G90.GF0(buf.getInt());
            if (size < 1) {
                break;
            }
            byte entry = buf.get();
            buf.getShort();
            buf.get();
            entries[entry] = da_0.Ic.tv(XG0.hi0, size,
                    data.VL0.slice().order(ByteOrder.LITTLE_ENDIAN), data.rt0());
        }

        buf.position(data.EZ.V(br_2.BJ0));
        while (true) {
            int size = G90.GF0(buf.getInt());
            if (size < 1) {
                break;
            }
            int entry = buf.get() + 26;
            buf.getShort();
            buf.get();
            if (entry >= 0 && entry < entries.length) {
                entries[entry] = da_0.Ic.tv(XG0.hi0, size,
                        data.VL0.slice().order(ByteOrder.LITTLE_ENDIAN), data.rt0());
            }
        }

        for (int index = 0; index < entries.length; index++) {
            if (entries[index] == null) {
                entries[index] = entries[0];
            }
        }

        buf.position(data.EZ.V(br_2.rK));
        ArrayList<Integer> boundaries = new ArrayList<>();
        ArrayList<PO> panels = new ArrayList<>();
        boolean secondSection = false;
        int record = 0;
        while (true) {
            int size = G90.GF0(buf.getInt());
            if (size < 1) {
                if (secondSection) {
                    to_0 target = (to_0) this.s10.BM(type);
                    for (PO panel : panels) {
                        int next = 0;
                        for (Integer boundary : boundaries) {
                            int value = boundary;
                            if ((next == 0 || value < next) && value > panel.Jb0) {
                                next = value;
                            }
                        }
                        panel.ow = next;
                        byte panelType = panel.on.rt0();
                        panel.mR = ((i8_0[]) this.cd.BM(panelType))[panel.qM];
                        byte panelIndex = panel.qM;
                        boolean special = false;
                        for (int i = 0; i < 4; i++) {
                            if (Bg.e50.bL0(Bg.fz0(panelType, i, panelIndex, 0))) {
                                special = true;
                                break;
                            }
                        }
                        if (!special) {
                            w7_0 ignored = Bg.Li;
                        }
                        panel.zd0 = special;
                        ByteBuffer panelBuf = panel.on.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
                        panelBuf.position(panel.Jb0);
                        panel.ph0 = 0;
                        while ((next < 1 || panelBuf.position() < next)
                                && G90.GF0(panelBuf.getInt()) >= 1) {
                            panelBuf.getShort();
                            panelBuf.getShort();
                            panel.ph0++;
                        }
                        target.Dp(panel.AA, panel, false);
                    }
                    return;
                }
                secondSection = true;
            } else {
                PO panel = new PO(record, size, data);
                if (panel.sp && panel.qM >= 0) {
                    panels.add(panel);
                    boundaries.add(panel.Jb0);
                }
            }
            record++;
        }
    }

    public final ht_0 t00(byte type, int index) {
        return this.kN(type, index, false);
    }

    public final ht_0 kN(byte type, int index, boolean alternate) {
        to_0 table = (to_0) this.s10.BM(type);
        if (table == null) {
            return Ue0;
        }
        ht_0 value = (ht_0) (alternate ? table.Zm0.get(index) : table.X80.get(index));
        return value == null ? Ue0 : value;
    }

    public final void W10(short index, boolean alternate, IH value) {
        ((to_0) this.s10.BM((byte) 10)).Dp(index, value, alternate);
    }
}
