package f;

import cn.pokemmo.net.packet.Modern_Net_Gf;
import java.nio.ByteBuffer;
import java.util.Collection;

/**
 * JNI 原生方法绑定类 - 原始混淆类: f.Gf
 * <p>
 * 警告：JNI 函数符号在客户端 C/C++ 动态链接库中硬编码为 "Java_f_Gf_<method>"。
 * JVM 在进行本地方法动态链接时严格匹配包名与类名，因此所有 native 方法必须在此类直接声明。
 */
public abstract class Gf extends Modern_Net_Gf {
    public static native int TJ();
    public static native boolean Vb();
    public static native boolean dH();
    public static native long jb(int i);
    public static native String SH();
    public static native boolean mb();
    public static native boolean pH();
    public static native String Mb();
    public static native String PH();
    public static native boolean RH();
    public static native long Ib();
    public static native int fH();
    public static native long Lb();
    public static native int Ub(Class clazz, Collection collection);
    public static native int cH(Class clazz, Collection collection);
    public static native ByteBuffer kc(ByteBuffer buffer, int i, String str, long j);
}

