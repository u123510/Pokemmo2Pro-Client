package cn.pokemmo.graphics.texture;

import f.ed_2;
import f.i4_0;
import f.ix0_0;

/**
 * LibGDX 纹理像素数据源接口 (Texture Data Source)
 * 对应 LibGDX 引擎规范: {@code com.badlogic.gdx.graphics.TextureData}
 * 原始接口: {@code f.E9}
 */
public interface TextureDataSource {

    /** 获取纹理数据类型 (静态 Pixmap 或自定义装载器) */
    ed_2 getType();

    /** 检查纹理数据是否已预加载/准备完成 */
    boolean xZ();

    /** 准备/加载纹理数据至内存缓存 */
    void Dx0();

    /** 提取并消耗像素位图对象 (Pixmap) */
    i4_0 JX();

    /** 检查是否在上传 GPU 显存后自动释放内存中的 Pixmap */
    boolean mZ();

    /** 针对自定义数据类型上传至 OpenGL 纹理管线 */
    void wJ(int target);

    /** 获取纹理像素宽度 */
    int Nx();

    /** 获取纹理像素高度 */
    int Af();

    /** 获取像素颜色格式 (RGBA8888, RGB565 等) */
    ix0_0 uv();

    /** 检查是否生成 Mipmap 多级纹理链 */
    boolean bm();

    /** 检查该纹理是否由图形资源管理器统一管理并在 OpenGL 上下文重建时重新加载 */
    boolean wx();
}
