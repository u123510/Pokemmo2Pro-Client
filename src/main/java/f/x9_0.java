package f;

import cn.pokemmo.io.stream.JsonIndentedWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.x9_0
 * 核心实现已迁移至 {@link cn.pokemmo.io.stream.JsonIndentedWriter}
 */
public final class x9_0 extends JsonIndentedWriter {
    public Writer Xi0;
    public es_1 cOm4;
    public lE G20;
    public boolean D60;
    public sg_1 R6;
    public boolean p8;

    public x9_0(Writer v1) {
        super(v1);
        this.Xi0 = this.writer;
        this.cOm4 = this.stack;
        this.R6 = this.outputType;
    }

    @Override
    public final x9_0 kH0(String v1) throws IOException {
        super.kH0(v1);
        this.G20 = this.currentItem;
        this.D60 = this.nameSet;
        return this;
    }

    @Override
    public final x9_0 Yg0(Object v1) throws IOException {
        this.p8 = this.quoteLongValues;
        super.Yg0(v1);
        this.G20 = this.currentItem;
        this.D60 = this.nameSet;
        return this;
    }
}
