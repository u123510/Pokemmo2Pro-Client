package cn.pokemmo.rom.nds.audio;

import f.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * NDS SDAT 音频归档主模型 (Nintendo DS Sound Data Archive)
 * 
 * 职责:
 * 解析任天堂 NDS ROM 中的 SDAT 归档头 (Magic 0x53444154 "SDAT"),
 * 管理 SYMB 符号块、INFO 信息块、FAT 与 FILE 音频资源块。
 * 
 * 原混淆类: f.hx_2
 */

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class NdsSdatArchive {
    public final int is;
    public final int Wo;
    public final int oH0;
    public final int ym;
    public final int ze0;
    public Uz0 YZ;
    public final ByteBuffer gU;
    public final po0_0 y60;
    public final M2 ZO;

    public NdsSdatArchive(Ae resource) {
        this.YZ = null;
        this.gU = resource.j90();
        ByteBuffer data = this.OX();
        Rz0 header = new Rz0(data);
        header.Kn(1413563475);
        this.is = data.getInt();
        this.Wo = data.getInt();
        this.oH0 = data.getInt();
        this.ym = data.getInt();
        this.ze0 = data.getInt();
        data.getInt();
        int objectOffset = data.getInt();
        data.getInt();
        data.position(data.position() + 16);
        data.position(this.oH0);
        this.y60 = new po0_0(asBridge());
        this.ZO = new M2(asBridge());
        data.position(objectOffset);
        data.get(new byte[4]);
        data.getInt();
        data.getInt();
        data.position(data.position() + 4);
    }

    public final hx_2 asBridge() {
        return (hx_2) (Object) this;
    }

    public final ByteBuffer OX() {
        ByteBuffer result = this.gU.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        result.position(0);
        return result;
    }
}
