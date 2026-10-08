package cn.pokemmo.util.function;

/**
 * 实体过滤条件谓词接口
 */
public interface EntityFilterPredicate<T> {
    boolean filter(T entity);

    @SuppressWarnings("unchecked")
    default boolean Jf0(Object var1) {
        return filter((T) var1);
    }
}
