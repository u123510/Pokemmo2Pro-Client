/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import f.prn__2;
import f.tw0_0;
import f.zo_0;

/*
 * Renamed from f.jb0
 */
public class SysGcSlashCommand
extends BaseSlashCommand {
    public SysGcSlashCommand() {
        super("/sysgc");
    }

    @Override
    public void sr0(String[] stringArray) {
        Object object = zo_0.Dd;
        tw0_0.rl.jC("--- 已启动系统内存垃圾回收 ---", (zo_0)((Object)object));
        System.gc();
        tw0_0.rl.jC("--- 系统内存垃圾回收已完成 ---", (zo_0)((Object)object));
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
