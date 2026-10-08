/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.nds.audio;

import f.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * NDS SDAT 二进制分块段抽象基类 (SDAT Block Section)
 * 
 * 职责:
 * 为任天堂 NDS SDAT 音频归档内部的各个分块 (SYMB, INFO, FAT, FILE) 提供切片流式访问能力。
 * 
 * 原混淆类: f.qe0_0
 */

import f.AT;
import f.hx_2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.Qe0
 */
public class SdatBlockSection {
    public final hx_2 XE0;
    public final int Z90;
    public final int com6;

    public SdatBlockSection(hx_2 hx_22, int n, int n2) {
        this.XE0 = hx_22;
        this.Z90 = n;
        this.com6 = n2;
    }

    public final ByteBuffer X60() {
        ByteBuffer byteBuffer = this.XE0.OX();
        byteBuffer.position(this.Z90);
        if (this.com6 > 0) {
            int n = byteBuffer.limit();
            AT.i20(this.Z90, this.com6, n, byteBuffer);
        }
        return byteBuffer.slice().order(ByteOrder.LITTLE_ENDIAN);
    }

    public final int Gk() {
        return this.com6;
    }
}

