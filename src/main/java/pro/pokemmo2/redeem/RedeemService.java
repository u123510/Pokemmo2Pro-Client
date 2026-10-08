package pro.pokemmo2.redeem;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * 卡密兑换服务：处理卡密逻辑核验与反馈。
 */
public class RedeemService {

    // 模拟测试卡密库
    private static final Map<String, String> CODE_DATABASE = new HashMap<>();

    static {
        CODE_DATABASE.put("POKEMMO2", "【新手礼包】：金币 x 50,000，高级球 x 30，神奇糖果 x 10！");
        CODE_DATABASE.put("TEST-8888", "【特权礼包】：闪光护符(3天) x 1，百变怪(5V) x 1！");
        CODE_DATABASE.put("VIP-666", "【VIP特权礼包】：大师球 x 1，特性胶囊 x 5！");
    }

    /**
     * 验证卡密
     * @param code 用户输入的卡密
     * @param callback 回调函数: (是否成功, 提示消息)
     */
    public static void redeemCode(String code, BiConsumer<Boolean, String> callback) {
        if (code == null || code.trim().isEmpty()) {
            callback.accept(false, "卡密不能为空，请输入正确的兑换码！");
            return;
        }

        String formatted = code.trim().toUpperCase();

        if (CODE_DATABASE.containsKey(formatted)) {
            String reward = CODE_DATABASE.get(formatted);
            callback.accept(true, "兑换成功！获得: " + reward);
        } else {
            callback.accept(false, "兑换失败：无效或已过期的卡密兑换码！");
        }
    }
}
