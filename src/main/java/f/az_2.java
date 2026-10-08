package f;

import cn.pokemmo.net.session.SessionState;

/**
 * 兼容垫片 (Shim) - SessionState
 * 职责: 网络会话状态枚举名称解析器
 * 原始混淆类: f.az_2
 * 现代实现: cn.pokemmo.net.session.SessionState
 */
public abstract class az_2 {

    public static String Id(int n) {
        return SessionState.getStateName(n);
    }
}
