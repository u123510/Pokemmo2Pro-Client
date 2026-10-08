package cn.pokemmo.rom.nds.fs;

import cn.pokemmo.rom.nds.base.AbstractNdsRom;
import f.Ae;
import f.J5;
import f.VG;
import f.fp0_0;
import f.ko_1;
import f.mi0_0;
import f.vh_1;
import f.wm_1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * NitroFS 虚拟文件系统
 * 解析 NDS 的 FAT (文件分配表) 与 FNT (文件名表)，构建虚拟目录树。
 * 原混淆类: f.no0_0
 */
public class NitroFileSystem {
    public final AbstractNdsRom rom;
    public final HashMap directoryMap;
    public final HashMap fileMap;

    // 兼容混淆字段别名
    public final AbstractNdsRom vh;
    public final HashMap oc0;
    public final HashMap dg;

    public NitroFileSystem(AbstractNdsRom rom) {
        this.rom = rom;
        this.vh = rom;
        this.directoryMap = new HashMap();
        this.oc0 = this.directoryMap;
        this.fileMap = new HashMap();
        this.dg = this.fileMap;

        ko_1[] fatEntries = parseFat(rom.getHeader().fatOffset, rom.getHeader().fatSize);
        parseFnt(rom.getHeader().fntOffset, fatEntries);
    }

    public final NitroFileEntry getFile(String path) {
        return (NitroFileEntry) this.fileMap.get(path);
    }

    public final Ae COM7(String path) {
        return (Ae) this.dg.get(path);
    }

    public final ko_1[] parseFat(int offset, int size) {
        int count = size / 8;
        ko_1[] entries = new ko_1[count];
        ByteBuffer order = this.rom.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        ((Buffer) order).position(offset);
        for (int i = 0; i < count; i++) {
            ko_1 entry = new ko_1();
            entries[i] = entry;
            entry.Wk = order.getInt();
            entry.bq0 = order.getInt() - entry.Wk;
        }
        return entries;
    }

    public final ko_1[] jy(int offset, int size) {
        return parseFat(offset, size);
    }

    public final void parseFnt(int fntOffset, ko_1[] fatEntries) {
        wm_1[] overlayArray;
        String prefix;
        ByteBuffer order = this.rom.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        ((Buffer) order).position(fntOffset + 6);
        short totalDirs = order.getShort();
        ((Buffer) order).position(fntOffset);
        HashMap dirTable = new HashMap();

        for (int i = 0; i < totalDirs; i++) {
            mi0_0 dir = new mi0_0();
            dir.pS = order.getInt();
            dir.qP = order.getShort();
            order.getShort();
            int currentPos = ((Buffer) order).position();
            ((Buffer) order).position(dir.pS + fntOffset);
            short fileId = dir.qP;
            byte[] nameBuf = new byte[127];

            while (true) {
                byte flag = order.get();
                if (flag == 0) break;
                boolean isFile = (flag & 128) == 0;
                byte nameLen = (byte) (flag & 127);
                order.get(nameBuf, 0, nameLen);
                String name = new String(nameBuf, 0, nameLen);

                if (isFile) {
                    dir.Mh0.Xa0.add(new Ae(this.rom, name, fatEntries[fileId].Wk, fatEntries[fileId].bq0, fileId));
                    fileId = (short) (fileId + 1);
                } else {
                    vh_1 subDir = new vh_1();
                    subDir.xX = name;
                    subDir.qS = order.getShort() & 65535;
                    dir.Mh0.Ec.add(subDir);
                }
            }
            ((Buffer) order).position(currentPos);
            dirTable.put(Integer.valueOf(i), dir);
        }

        vh_1 rootDir = za0(dirTable, 0, "", "");
        ArrayList subDirs = rootDir.Ec;
        AbstractNdsRom ndsRom = this.rom;
        vh_1 overlayDir = new vh_1();
        overlayDir.xX = "ftc";
        overlayDir.qS = 61440;

        for (int pass = 0; pass < 2; pass++) {
            if (pass == 0) {
                overlayArray = ndsRom.getHeader().arm9Overlays;
            } else {
                overlayArray = ndsRom.getHeader().arm7Overlays;
            }
            for (wm_1 overlay : overlayArray) {
                prefix = pass != 0 ? "7" : "9";
                String uD = fp0_0.uD(new StringBuilder("overlay").append(prefix).append("_"), overlay.sk, ".bin");
                ko_1 fat = fatEntries[overlay.Sh0];
                J5 j5 = new J5(ndsRom, uD, fat.Wk, fat.bq0, (short) overlay.Sh0);
                overlay.G3 = j5;
                overlayDir.Xa0.add(j5);
            }
        }
        Re(overlayDir, "/");
        subDirs.add(overlayDir);
        o4(rootDir);
    }

    public final void nE(int fntOffset, ko_1[] fatEntries) {
        parseFnt(fntOffset, fatEntries);
    }

    public final void o4(vh_1 dir) {
        if (dir != null) {
            if (this.directoryMap.put(Integer.valueOf(dir.qS & 65535), dir) == null) {
                ArrayList subDirs = dir.Ec;
                if (subDirs != null) {
                    Iterator it = subDirs.iterator();
                    while (it.hasNext()) {
                        o4((vh_1) it.next());
                    }
                }
                return;
            }
            throw new RuntimeException("replacing " + dir.qS);
        }
    }

    public final vh_1 za0(HashMap dirMap, int dirId, String dirName, String parentPath) {
        mi0_0 dir = (mi0_0) dirMap.get(Integer.valueOf(dirId & 4095));
        vh_1 node = new vh_1();
        node.xX = dirName;
        node.qS = (short) dirId;
        node.Xa0 = dir.Mh0.Xa0;
        String curPath = parentPath + dirName + "/";
        Iterator it = dir.Mh0.Ec.iterator();
        while (it.hasNext()) {
            vh_1 subDir = (vh_1) it.next();
            node.Ec.add(za0(dirMap, subDir.qS, subDir.xX, curPath));
        }
        Iterator it2 = node.Xa0.iterator();
        while (it2.hasNext()) {
            Ae file = (Ae) it2.next();
            String fullPath = curPath + file.k9;
            file.kd = fullPath;
            file.fullPath = fullPath;
            this.fileMap.put(fullPath, file);
        }
        return node;
    }

    public final void Re(vh_1 dir, String parentPath) {
        String curPath = VG.Mq(new StringBuilder(parentPath), dir.xX, "/");
        Iterator it = dir.Ec.iterator();
        while (it.hasNext()) {
            Re((vh_1) it.next(), curPath);
        }
        Iterator it2 = dir.Xa0.iterator();
        while (it2.hasNext()) {
            Ae file = (Ae) it2.next();
            String fullPath = curPath + file.k9;
            file.kd = fullPath;
            file.fullPath = fullPath;
            this.fileMap.put(fullPath, file);
        }
    }
}
