package cn.pokemmo.net.security;

import f.TI0;
import f.YB0;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/**
 * 客户端公钥管理与数字签名校验器 (Client Public Key Manager & Crypto Signature Verifier)
 * <p>
 * 对应原始混淆类: f.YB0
 * 职责：
 * 1. 加载并管理客户端与服务端的 ECDSA 椭圆曲线公钥（游戏公钥 game.public 与 聊天公钥 chat.public）；
 * 2. 校验网络会话握手、密钥交换与资源包的数字签名（SHA256withECDSA）；
 * 3. 解析 X.509 编码的公钥字节序列。
 */
public abstract class PublicKeyManager {

    /**
     * 获取游戏核心服务端公钥 (au)
     */
    public static final PublicKey au() {
        return getGamePublicKey();
    }

    /**
     * 现代命名：获取游戏核心服务端公钥
     */
    public static final PublicKey getGamePublicKey() {
        return YB0.QG0(TI0.Kd("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE6r+AANqoLQS3IxRNFHlUuxLTnOKzH/e8Xl5CuUkQGx3ufdz2Tsa5RY++5uY9SNBgC0XXa43oqjVbNxSmQmBorg=="), "EC");
    }

    /**
     * 获取聊天服务端公钥 (XP)
     */
    public static final PublicKey XP() {
        return getChatPublicKey();
    }

    /**
     * 现代命名：获取聊天服务端公钥
     */
    public static final PublicKey getChatPublicKey() {
        // chat.public
        return YB0.QG0(TI0.Kd("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE+R9SxCjnERGQ1cBIXVM7nQU2b+8y35Pnxq3NliqIJpglW/NzbUDpg57wqgrnVoDWclnW7xLcKOHVUan3WIF3ZQ=="), "EC");
    }

    /**
     * 校验数字签名 (Yd0)
     *
     * @param data 数据原文
     * @param signatureBytes 签名数据
     * @param publicKey 验证公钥
     * @param algorithm 算法名称，如 "SHA256withECDSA"
     * @return 签名是否有效
     */
    public static boolean Yd0(byte[] data, byte[] signatureBytes, PublicKey publicKey, String algorithm) {
        return verifySignature(data, signatureBytes, publicKey, algorithm);
    }

    /**
     * 现代命名：校验数字签名
     */
    public static boolean verifySignature(byte[] data, byte[] signatureBytes, PublicKey publicKey, String algorithm) {
        Signature signature;
        try {
            signature = Signature.getInstance(algorithm);
        } catch (Exception exception) {
            System.out.println("Exception verifying " + algorithm + " signature.");
            exception.printStackTrace();
            return false;
        }
        try {
            signature.initVerify(publicKey);
            signature.update(data);
            return signature.verify(signatureBytes);
        } catch (Exception exception) {
            System.out.println("Exception verifying " + algorithm + " signature.");
            exception.printStackTrace();
            return false;
        }
    }

    /**
     * 解析 X.509 编码的公钥 (QG0)
     *
     * @param keyBytes 公钥字节数组
     * @param algorithm 密钥算法，如 "EC"
     * @return 解析后的 PublicKey 对象
     */
    public static PublicKey QG0(byte[] keyBytes, String algorithm) {
        return parsePublicKey(keyBytes, algorithm);
    }

    /**
     * 现代命名：解析公钥
     */
    public static PublicKey parsePublicKey(byte[] keyBytes, String algorithm) {
        try {
            return KeyFactory.getInstance(algorithm).generatePublic(new X509EncodedKeySpec(keyBytes));
        } catch (InvalidKeySpecException | NoSuchAlgorithmException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
