package f;

import cn.pokemmo.ui.chat.ChatFilterRuleRecord;

/**
 * 兼容垫片 (Shim) - 聊天频道过滤规则与敏感词记录 (Chat Filter Rule Record)
 * 实际实现已迁移至 {@link ChatFilterRuleRecord}
 */
public final class GV extends ChatFilterRuleRecord {
    public GV(int id, int code, boolean filtered, boolean enabled) {
        super(id, code, filtered, enabled);
    }
}
