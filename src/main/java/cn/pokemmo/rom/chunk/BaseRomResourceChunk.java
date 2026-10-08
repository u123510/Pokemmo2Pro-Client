package cn.pokemmo.rom.chunk;

import f.be0_1;
import java.nio.ByteBuffer;

/**
 * ROM 二进制资源块解析统一抽象基类
 * 对应 PokeMMO 从 GBA / NDS 核心卡带二进制流中切片解析的各种数据块
 */
public abstract class BaseRomResourceChunk extends be0_1 {
    public BaseRomResourceChunk() {
        super();
    }

    public int getChunkId() {
        return this.a00;
    }

    public void setChunkId(int id) {
        this.a00 = id;
    }

    public String getChunkName() {
        return this.QW;
    }

    public void setChunkName(String name) {
        this.QW = name;
    }
}
