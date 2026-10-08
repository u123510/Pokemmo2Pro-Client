package f;

import cn.pokemmo.net.packet.router.PacketRouteDispatcher;
import java.nio.ByteBuffer;

/**
 * 兼容垫片 (Shim) - PacketRouteDispatcher
 * 职责: 客户端网络入站协议路由分发器
 * 原始混淆类: f.ho_1
 * 现代实现: cn.pokemmo.net.packet.router.PacketRouteDispatcher
 */
public abstract class ho_1 {
    public static final dl_1 ss = PacketRouteDispatcher.LOGGER;
    public static final ByteBuffer I70 = PacketRouteDispatcher.INFLATION_INPUT_BUFFER;
    public static final ByteBuffer cW = PacketRouteDispatcher.INFLATION_OUTPUT_BUFFER;

    public static GH tS(ByteBuffer var0, k20_0 var1, boolean var2) {
        return PacketRouteDispatcher.dispatch(var0, var1, var2);
    }

    public static void dk0(int var0, int var1, ByteBuffer var2) {
        PacketRouteDispatcher.logUnexpectedOpcode(var0, var1, var2);
    }
}
