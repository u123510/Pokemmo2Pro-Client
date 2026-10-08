package cn.pokemmo.net.security;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

public abstract class DiffieHellmanKeyAgreement {
    public static ECParameterSpec G00;

    public static void NR() throws GeneralSecurityException {
        if (G00 == null) {
            try {
                AlgorithmParameters parameters = AlgorithmParameters.getInstance("EC");
                parameters.init(new ECGenParameterSpec("secp256r1"));
                G00 = parameters.getParameterSpec(ECParameterSpec.class);
            } catch (NoSuchAlgorithmException error) {
                KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");
                generator.initialize(new ECGenParameterSpec("secp256r1"));
                G00 = ((ECPublicKey)generator.generateKeyPair().getPublic()).getParams();
            }
            if (KeyAgreement.getInstance("ECDH") == null) {
                throw new RuntimeException();
            }
        }
    }

    public static ECPublicKey OW(byte[] encoded) throws GeneralSecurityException {
        if (G00 == null) {
            DiffieHellmanKeyAgreement.NR();
        }
        ECParameterSpec parameters = G00;
        int offset = 1;
        if (encoded[0] != 4) {
            throw new GeneralSecurityException(
                "Invalid uncompressedPoint encoding, no uncompressed point indicator");
        }
        int coordinateLength = (parameters.getOrder().bitLength() + 7) / 8;
        if (encoded.length != coordinateLength * 2 + 1) {
            throw new GeneralSecurityException(
                "Invalid uncompressedPoint encoding, not the correct size");
        }
        BigInteger x = new BigInteger(
            1,
            Arrays.copyOfRange(encoded, offset, offset + coordinateLength));
        offset += coordinateLength;
        BigInteger y = new BigInteger(
            1,
            Arrays.copyOfRange(encoded, offset, offset + coordinateLength));
        ECPoint point = new ECPoint(x, y);
        ECPublicKeySpec keySpec = new ECPublicKeySpec(point, parameters);
        return (ECPublicKey)KeyFactory.getInstance("EC").generatePublic(keySpec);
    }

    public static byte[] Av0(ECPublicKey key) {
        int coordinateLength = (key.getParams().getOrder().bitLength() + 7) / 8;
        byte[] encoded = new byte[coordinateLength * 2 + 1];
        int offset = 1;
        encoded[0] = 4;

        byte[] x = key.getW().getAffineX().toByteArray();
        if (x.length <= coordinateLength) {
            int destination = offset + coordinateLength - x.length;
            System.arraycopy(x, 0, encoded, destination, x.length);
        } else if (x.length == coordinateLength + 1 && x[0] == 0) {
            System.arraycopy(x, 1, encoded, offset, coordinateLength);
        } else {
            throw new IllegalStateException("x value is too large");
        }

        offset += coordinateLength;
        byte[] y = key.getW().getAffineY().toByteArray();
        if (y.length <= coordinateLength) {
            int destination = offset + coordinateLength - y.length;
            System.arraycopy(y, 0, encoded, destination, y.length);
        } else if (y.length == coordinateLength + 1 && y[0] == 0) {
            System.arraycopy(y, 1, encoded, offset, coordinateLength);
        } else {
            throw new IllegalStateException("y value is too large");
        }
        return encoded;
    }
}
