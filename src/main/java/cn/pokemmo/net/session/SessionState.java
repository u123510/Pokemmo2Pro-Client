package cn.pokemmo.net.session;

/**
 * 网络会话连接生命周期状态 (Network Session Lifecycle State)
 * 
 * 职责:
 * 标示客户端与服务端网络 Socket 连接当前的认证与协议状态，
 * 驱动入站数据包路由器 (PacketRouteDispatcher) 选择对应的分发策略。
 * 
 * 原混淆类: f.az_2
 */
public enum SessionState {

    /** 正在建立底层 TCP 连接 (1) */
    CONNECTING(1, "CONNECTING"),

    /** TCP 连接已建立，正在进行密钥协商与协议握手 (2) */
    CONNECTED(2, "CONNECTED"),

    /** 身份凭据鉴权通过，已进入角色选择与大厅阶段 (3) */
    AUTHED(3, "AUTHED"),

    /** 准备就绪阶段 (4) */
    READY(4, "READY"),

    /** 已完全进入大世界场景与对战场景 (5) */
    IN_GAME(5, "IN_GAME"),

    /** 会话已断开或连接已关闭 (6) */
    DISCONNECTED(6, "DISCONNECTED");

    private final int id;
    private final String stateName;

    SessionState(int id, String stateName) {
        this.id = id;
        this.stateName = stateName;
    }

    public int getId() {
        return this.id;
    }

    public String getStateName() {
        return this.stateName;
    }

    /**
     * 根据数字状态 ID 获取标准状态名称
     */
    public static String getStateName(int id) {
        for (SessionState state : values()) {
            if (state.id == id) {
                return state.stateName;
            }
        }
        return "UNKNOWN";
    }

    /**
     * 根据数字状态 ID 转换枚举
     */
    public static SessionState fromId(int id) {
        for (SessionState state : values()) {
            if (state.id == id) {
                return state;
            }
        }
        return null;
    }
}
