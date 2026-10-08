package pro.pokemmo2.shop.service;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

import f.Uo;
import f.ie0_2;
import f.k20_0;
import f.lf0_2;
import f.tw0_0;
import pro.pokemmo2.shop.model.OpenMmoShopQuote;
import pro.pokemmo2.shop.protocol.OpenMmoShopCodec;
import pro.pokemmo2.shop.protocol.OpenMmoShopRequest;
import pro.pokemmo2.shop.state.OpenMmoShopState;

/**
 * Native-client bridge for the OpenMMO shop extension.
 *
 * <p>The visible window is still the original {@code f.Uo}. This class only
 * owns the quote, request lifecycle and the mapping from native shop data to
 * the current connection.</p>
 */
public final class ShopClient {
    private static final Map<k20_0, OpenMmoShopState> STATES = new ConcurrentHashMap<>();
    private static final Map<k20_0, Uo> WINDOWS = new ConcurrentHashMap<>();
    private static final Map<lf0_2, ShopContext> CONTEXTS =
            java.util.Collections.synchronizedMap(new WeakHashMap<>());

    private ShopClient() {
    }

    private record ShopContext(k20_0 connection, OpenMmoShopQuote quote) {
    }

    public static void onGameConnectionReady(k20_0 connection) {
        if (connection == null) {
            return;
        }
        OpenMmoShopState state = STATES.computeIfAbsent(connection,
                key -> new OpenMmoShopState());
        OpenMmoShopRequest hello = state.createHello();
        if (hello != null) {
            connection.uQ(hello);
        }
    }

    public static void onGameConnectionClosed(k20_0 connection) {
        if (connection == null) {
            return;
        }
        OpenMmoShopState state = STATES.remove(connection);
        WINDOWS.remove(connection);
        removeContext(connection);
        if (state != null) {
            state.disconnect();
        }
    }

    /**
     * Parses the extension tail and lets the original EL/Uo path continue.
     */
    public static boolean onNativeShopResponse(k20_0 connection, lf0_2 nativeShop,
                                               int flags, ByteBuffer extensionTail) {
        if ((flags & 0x80) == 0) {
            return false;
        }
        OpenMmoShopState state = STATES.computeIfAbsent(connection,
                key -> new OpenMmoShopState());
        try {
            OpenMmoShopQuote quote = OpenMmoShopCodec.readQuote(
                    connection, nativeShop, flags, extensionTail);
            if (!state.installQuote(quote)) {
                System.err.println("[PokeMMO2商店] 原版界面报价安装失败：连接已断开或报价正在关闭");
                return false;
            }
            CONTEXTS.put(nativeShop, new ShopContext(connection, quote));
        } catch (RuntimeException exception) {
            System.err.println("[PokeMMO2商店] 原版界面报价解析失败：" + exception.getMessage());
        }
        return false;
    }

    public static void onNativeShopResponse(k20_0 connection, lf0_2 nativeShop,
                                            OpenMmoShopQuote quote) {
        if (connection == null || nativeShop == null || quote == null) {
            return;
        }
        OpenMmoShopState state = STATES.computeIfAbsent(connection,
                key -> new OpenMmoShopState());
        if (!state.installQuote(quote)) {
            System.err.println("[PokeMMO2商店] 原版界面报价安装失败：连接已断开或报价正在关闭");
            return;
        }
        CONTEXTS.put(nativeShop, new ShopContext(connection, quote));
    }

    public static void onNativeShopOpened(Uo window) {
        if (window == null) {
            return;
        }
        ShopContext context = CONTEXTS.get(window.bo0);
        if (context != null) {
            WINDOWS.put(context.connection(), window);
        }
    }

    public static boolean onNativeShopClosed(k20_0 connection) {
        OpenMmoShopState state = STATES.get(connection);
        if (state != null) {
            state.closeFromNativePacket();
        }
        WINDOWS.remove(connection);
        removeContext(connection);
        // EL must continue into BU.ig() so the original Uo is closed.
        return false;
    }

    public static void onNativeShopCloseRequested(Uo window) {
        if (window == null) {
            return;
        }
        ShopContext context = CONTEXTS.get(window.bo0);
        if (context == null) {
            return;
        }
        OpenMmoShopState state = STATES.get(context.connection());
        if (state != null) {
            OpenMmoShopRequest request = state.beginClose();
            if (request != null) {
                context.connection().uQ(request);
            }
        }
        WINDOWS.remove(context.connection(), window);
    }

    public static void handleControl(k20_0 connection, OpenMmoShopCodec.Control control) {
        if (connection == null || control == null) {
            return;
        }
        OpenMmoShopState state = STATES.computeIfAbsent(connection,
                key -> new OpenMmoShopState());
        if (control.kind() == 0) {
            state.acknowledge();
            return;
        }
        if (control.kind() == 2) {
            if (state.closeFromServer(control.quoteId())) {
                Uo window = WINDOWS.remove(connection);
                if (window != null) {
                    window.xe0();
                }
                removeContext(connection);
            }
            return;
        }
        if (!state.complete(control)) {
            System.err.println("[PokeMMO2商店] 忽略不匹配的原版商店回执：quoteId="
                    + control.quoteId() + ", requestId=" + control.requestId());
            return;
        }
        Uo window = WINDOWS.get(connection);
        if (window != null) {
            window.XH0();
            if (control.action() == OpenMmoShopRequest.SELL) {
                // The selected inventory row may have been removed or split.
                window.pC0(null);
            } else {
                // Keep the selected buy item, matching the native item-shop flow.
                window.hA();
            }
            window.b5();
        }
        if (control.message() != null && !control.message().isBlank()
                && tw0_0.rl != null) {
            tw0_0.rl.qK(control.message());
        }
        if (control.status() == 2) {
            Uo removed = WINDOWS.remove(connection);
            if (removed != null) {
                removed.xe0();
            }
            removeContext(connection);
        }
    }

    public static boolean onNativeBuy(Uo window, int amount) {
        if (window == null || window.M5 == null) {
            return false;
        }
        ShopContext context = CONTEXTS.get(window.bo0);
        if (context == null) {
            return false;
        }
        return submit(context, OpenMmoShopRequest.BUY,
                window.M5.FE() & 0xFFFF, amount, window);
    }

    public static boolean onNativeSell(Uo window, int amount) {
        if (window == null || !(window.M5 instanceof ie0_2 item)) {
            return false;
        }
        ShopContext context = CONTEXTS.get(window.bo0);
        if (context == null) {
            return false;
        }
        long ownedItemId = item.implements$.nn.Br.Sa;
        return submit(context, OpenMmoShopRequest.SELL, ownedItemId, amount, window);
    }

    public static int nativeSellPrice(lf0_2 nativeShop, short itemId) {
        ShopContext context = CONTEXTS.get(nativeShop);
        return context == null ? 0 : context.quote().getSellPrice(itemId & 0xFFFF);
    }

    public static boolean nativeHasSellPrice(lf0_2 nativeShop, short itemId) {
        return nativeSellPrice(nativeShop, itemId) > 0;
    }

    public static OpenMmoShopState state(k20_0 connection) {
        return STATES.get(connection);
    }

    private static boolean submit(ShopContext context, int action, long targetId,
                                  int amount, Uo window) {
        if (amount < 1 || amount > OpenMmoShopRequest.MAX_AMOUNT) {
            return false;
        }
        OpenMmoShopState state = STATES.get(context.connection());
        if (state == null || !state.matches(context.quote())) {
            return false;
        }
        try {
            context.connection().uQ(state.begin(action, targetId, amount));
            window.Sv.pw0(false);
            return true;
        } catch (RuntimeException exception) {
            return false;
        }
    }

    private static void removeContext(k20_0 connection) {
        synchronized (CONTEXTS) {
            CONTEXTS.entrySet().removeIf(entry ->
                    entry.getValue().connection() == connection);
        }
    }
}
