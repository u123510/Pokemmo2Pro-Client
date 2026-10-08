package cn.pokemmo.net.packet;

/**
 * 服务器系统通知事件回调接口
 */
public interface ServerNotificationCallback {
    void onNotification(byte type, int code, String message);

    default void ZE(byte var1, int var2, String var3) {
        onNotification(var1, var2, var3);
    }
}
