package cn.pokemmo.net.session;

import f.lp_1;

/**
 * 客户端登录与网络连接参数档案 (Client Login & Connection Parameters)
 * <p>
 * 封装客户端与服务器连接所需的大区协议版本、用户名、认证令牌密钥、
 * 角色名、角色/账号 ID、连接通道与子服务器信息。
 * <p>
 * 原始混淆类: {@code f.np_0}
 */
public class ClientLoginParameters {
    /** 游戏大区 / 协议版本 ID */
    public final byte rg;
    /** 用户名 / 账号标识 */
    public final String sz0;
    /** 认证令牌密钥数据 */
    public byte[] kF0;
    /** 角色昵称 */
    public String YH;
    /** 角色或账号数字 ID */
    public int Lq;
    /** 通道 ID (Channel ID) */
    public final int at0;
    /** 子服务器 / 端口序号 */
    public final int eg;
    /** 是否已启用 SSL / 安全连接 */
    public final boolean Td;
    /** 可选服务器列表 */
    public lp_1[] ub = new lp_1[0];

    public ClientLoginParameters(byte rg, String username, byte[] token, String characterName, int accountId, int channelId, int subServerPort, boolean sslEnabled) {
        this.rg = rg;
        this.sz0 = username;
        this.kF0 = token;
        this.YH = characterName;
        this.Lq = accountId;
        this.at0 = channelId;
        this.eg = subServerPort;
        this.Td = sslEnabled;
    }

    public byte getRegion() {
        return this.rg;
    }

    public String getUsername() {
        return this.sz0;
    }

    public byte[] getToken() {
        return this.kF0;
    }

    public String getCharacterName() {
        return this.YH;
    }

    public int getAccountId() {
        return this.Lq;
    }

    public int getChannelId() {
        return this.at0;
    }

    public int getSubServerPort() {
        return this.eg;
    }

    public boolean isSslEnabled() {
        return this.Td;
    }

    public lp_1[] getChannels() {
        return this.ub;
    }
}
