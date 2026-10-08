package f;

import java.lang.reflect.Field;
import cn.pokemmo.util.reflection.ReflectionFieldDescriptor;

/**
 * 兼容垫片 (Shim) - 反射字段元数据属性描述符 (Reflection Field Descriptor)
 * 实际实现已迁移至 {@link ReflectionFieldDescriptor}
 */
public final class yr0_0 extends ReflectionFieldDescriptor {
    public yr0_0(Field field) {
        super(field);
    }
}
