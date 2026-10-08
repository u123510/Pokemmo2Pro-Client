package cn.pokemmo.lifecycle;

/**
 * 客户端核心生命周期资源释放接口
 * 对应 LibGDX Disposable 标准规范
 */
public interface Disposable {
    public void dispose();
}
