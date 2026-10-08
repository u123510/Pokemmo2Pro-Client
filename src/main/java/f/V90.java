package f;

import cn.pokemmo.util.function.EntityFilterPredicate;

/**
 * 实体过滤谓词门面
 * @see cn.pokemmo.util.function.EntityFilterPredicate
 */
public interface V90 extends EntityFilterPredicate<Object> {
    @Override
    boolean Jf0(Object var1);

    @Override
    default boolean filter(Object entity) {
        return Jf0(entity);
    }
}
