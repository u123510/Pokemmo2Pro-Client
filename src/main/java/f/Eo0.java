package f;

import cn.pokemmo.net.packet.ServerNotificationCallback;

/**
 * 服务器通知回调门面
 * @see cn.pokemmo.net.packet.ServerNotificationCallback
 */
public interface Eo0 extends ServerNotificationCallback {
    @Override
    void ZE(byte var1, int var2, String var3);

    @Override
    default void onNotification(byte type, int code, String message) {
        ZE(type, code, message);
    }
}
