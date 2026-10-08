package f;

import cn.pokemmo.io.buffer.MappedFileBufferResource;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.wc_2
 * 核心逻辑已迁移至 cn.pokemmo.io.buffer.MappedFileBufferResource
 */
public class wc_2 extends MappedFileBufferResource {

    public wc_2(W70 w70) {
        super(w70);
    }

}
