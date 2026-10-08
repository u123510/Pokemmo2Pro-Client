package cn.pokemmo.pokemon.battle;

import cn.pokemmo.net.security.PublicKeyManager;

/**
 * @deprecated 历史误命名类。f.YB0 的真实语义为客户端公钥与加密签名校验器，属于安全与网络模块。
 * 现代规范实现请使用 {@link PublicKeyManager}，向下兼容垫片请使用 {@link f.YB0}。
 */
@Deprecated
public abstract class BattleTurnDamageResolver extends PublicKeyManager {
}
