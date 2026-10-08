package cn.pokemmo.net.security;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import javax.crypto.KeyAgreement;

/*
 * Login/key-agreement packet. Rebuilt from CFR output + javap because CFR
 * emitted illegal identifiers (transient) and lost this/object flow.
 */
public class KeyExchangeClientHelloPacket extends uf_0 {
    public static final dl_1 eL = Cq0.E1(KeyExchangeClientHelloPacket.class);
    public byte[] Py0;
    public ECPublicKey transient$ = null;
    public byte[] z9;
    public byte K30 = (byte)4;

    public KeyExchangeClientHelloPacket(int id) {
        super(id);
    }

    @Override
    public final void Oj0() {
        byte[] publicKeyBytes = new byte[this.Rj.getShort() & 0xFFFF];
        this.Rj.get(publicKeyBytes);
        this.Py0 = publicKeyBytes;
        try {
            this.transient$ = Mw0.OW(publicKeyBytes);
        } catch (GeneralSecurityException error) {
            eL.error("", error);
        }

        byte[] signature = new byte[this.Rj.getShort() & 0xFFFF];
        this.Rj.get(signature);
        this.z9 = signature;
        this.K30 = this.Rj.get();
    }

    @Override
    public final void os0() {
        if (this.transient$ == null) {
            RuntimeException ex = new RuntimeException();
            eL.error("Failed to load public key.", ex);
            ((ky_2)this.uk).yK0();
            return;
        }

        ky_2 connection = (ky_2)this.uk;
        try {
            if (!YB0.Yd0(this.Py0, this.z9, connection.Fg0, "SHA256withECDSA")) {
                RuntimeException ex = new RuntimeException();
                eL.error("Failed to verify signature.", ex);
                connection.yK0();
                return;
            }

            KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");
            generator.initialize(new ECGenParameterSpec("secp256r1"));
            KeyPair keyPair = generator.generateKeyPair();
            ECPublicKey publicKey = (ECPublicKey)keyPair.getPublic();

            KeyAgreement agreement = KeyAgreement.getInstance("ECDH");
            agreement.init(keyPair.getPrivate());
            agreement.doPhase(this.transient$, true);

            connection.v2(new Tw0(Mw0.Av0(publicKey)));
            byte[] secret = agreement.generateSecret();
            connection.m3.Jz = this.K30;
            if (secret.length * 8 < 128) {
                throw new RuntimeException();
            }
            connection.m3.mn0 = ej0_2.XH0(secret, ej0_2.ZL);
            connection.m3.Pt = ej0_2.XH0(secret, ej0_2.x40);
            connection.m3.CD();
            connection.Dm = true;
            if (!connection.const$) {
                connection.jt0();
            }
        } catch (GeneralSecurityException e) {
            eL.error("", e);
        }
    }
}


