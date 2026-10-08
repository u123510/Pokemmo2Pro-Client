package cn.pokemmo.graphics.particle;

import f.*;

import java.io.BufferedReader;
import java.io.IOException;

public class ParticleEmitterProfile {
    public final V60 eI0;
    public final AP ue0;
    public final V60 Xi;
    public final AP pB;
    public final WE uv;
    public final WE hz0;
    public final WE v3;
    public final WE A10;
    public final WE iE0;
    public final WE QK;
    public final WE kG0;
    public final WE sx0;
    public final WE Cv;
    public final K0 j60;
    public final WE YL;
    public final WE dm;
    public final WE bP;
    public final WE UB;
    public final cv_1 DY;
    public es_1 fo0;
    public GY zm0;
    public Ns0[] Pw;
    public int Dj0;
    public float O;
    public float TO;
    public String ic;
    public es_1 oD0;
    public boolean[] DK0;
    public boolean s10;

    public ParticleEmitterProfile() {
        this.eI0 = new V60();
        this.ue0 = new AP();
        this.Xi = new V60();
        this.pB = new AP();
        this.uv = new WE();
        this.hz0 = new WE();
        this.v3 = new WE();
        this.A10 = new WE();
        this.iE0 = new WE();
        this.QK = new WE();
        this.kG0 = new WE();
        this.sx0 = new WE();
        this.Cv = new WE();
        this.j60 = new K0();
        this.YL = new WE();
        this.dm = new WE();
        this.bP = new WE();
        this.UB = new WE();
        this.DY = new cv_1();
        this.zm0 = GY.ok0;
        this.Dj0 = 4;
        this.Cn0();
    }

    public ParticleEmitterProfile(BufferedReader reader) {
        this();
        this.jE0(reader);
    }

    public ParticleEmitterProfile(ParticleEmitterProfile other) {
        this();
        this.fo0 = new es_1(other.fo0);
        this.ic = other.ic;
        this.oD0 = new es_1(other.oD0);
        this.q30(other.Dj0);
        this.eI0.Q2(other.eI0);
        this.Xi.Q2(other.Xi);
        this.uv.P60(other.uv);
        this.pB.JC0(other.pB);
        this.ue0.JC0(other.ue0);
        this.hz0.P60(other.hz0);
        this.v3.P60(other.v3);
        this.A10.P60(other.A10);
        this.iE0.P60(other.iE0);
        this.QK.P60(other.QK);
        this.kG0.P60(other.kG0);
        this.sx0.P60(other.sx0);
        this.Cv.P60(other.Cv);
        this.j60.a20(other.j60);
        this.YL.Q2(other.YL);
        this.dm.Q2(other.dm);
        this.bP.P60(other.bP);
        this.UB.P60(other.UB);
        this.DY.I80(other.DY);
        this.s10 = other.s10;
        this.zm0 = other.zm0;
        this.GD0(other.bn0(), other.Jo0());
    }

    public static String xF(BufferedReader reader, String name) throws IOException {
        String line = reader.readLine();
        if (line == null) {
            throw new IOException(jj0_0.hw0("Missing value:", name));
        }
        return line.substring(line.indexOf(":") + 1).trim();
    }

    public final void Cn0() {
        this.fo0 = new es_1();
        this.oD0 = new es_1();
        this.Xi.jH0 = true;
        this.uv.jH0 = true;
        this.pB.jH0 = true;
        this.hz0.jH0 = true;
        this.Cv.jH0 = true;
        this.DY.jH0 = true;
        this.bP.jH0 = true;
        this.UB.jH0 = true;
    }

    public final void q30(int count) {
        this.Dj0 = count;
        this.DK0 = new boolean[count];
        this.Pw = new Ns0[count];
    }

    public final void GD0(float x, float y) {
        if (this.s10) {
            float dx = y - this.O;
            float dy = x - this.TO;
            for (int i = 0; i < this.DK0.length; i++) {
                if (this.DK0[i]) {
                    this.Pw[i].mI(dx, dy);
                }
            }
        }
        this.O = x;
        this.TO = y;
    }

    public final float bn0() {
        return this.O;
    }

    public final float Jo0() {
        return this.TO;
    }

    public final void jE0(BufferedReader reader) {
        try {
            this.ic = xF(reader, "name");
            reader.readLine();
            this.eI0.YN(reader);
            reader.readLine();
            this.Xi.YN(reader);
            reader.readLine();
            Integer.parseInt(xF(reader, "minParticleCount"));
            int max = Integer.parseInt(xF(reader, "maxParticleCount"));
            this.q30(max);
            reader.readLine();
            this.uv.YN(reader);
            reader.readLine();
            this.pB.YN(reader);
            reader.readLine();
            this.ue0.YN(reader);
            reader.readLine();
            this.YL.YN(reader);
            reader.readLine();
            this.dm.YN(reader);
            reader.readLine();
            this.DY.jt(reader);
            reader.readLine();
            this.bP.YN(reader);
            reader.readLine();
            this.UB.YN(reader);
            String line = reader.readLine();
            if (line.trim().equals("- Scale -")) {
                this.hz0.YN(reader);
                this.v3.L9 = false;
            } else {
                this.hz0.YN(reader);
                reader.readLine();
                this.v3.YN(reader);
            }
            reader.readLine();
            this.iE0.YN(reader);
            reader.readLine();
            this.QK.YN(reader);
            reader.readLine();
            this.A10.YN(reader);
            reader.readLine();
            this.kG0.YN(reader);
            reader.readLine();
            this.sx0.YN(reader);
            reader.readLine();
            this.j60.LPT9(reader);
            reader.readLine();
            this.Cv.YN(reader);
            reader.readLine();
            this.s10 = Boolean.parseBoolean(xF(reader, "attached"));
            xF(reader, "continuous");
            xF(reader, "aligned");
            xF(reader, "additive");
            xF(reader, "behind");
            line = reader.readLine();
            if (line.startsWith("premultipliedAlpha")) {
                line = reader.readLine();
            }
            if (line != null && line.startsWith("spriteMode")) {
                this.zm0 = GY.valueOf(line.substring(line.indexOf(":") + 1).trim());
                reader.readLine();
            }
            es_1 values = new es_1();
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                values.Ue0(line);
            }
            this.oD0 = values;
        } catch (RuntimeException exception) {
            if (this.ic == null) {
                throw exception;
            }
            throw new RuntimeException("Error parsing emitter: " + this.ic, exception);
        } catch (IOException exception) {
            if (this.ic == null) {
                throw new RuntimeException(exception);
            }
            throw new RuntimeException("Error parsing emitter: " + this.ic, exception);
        }
    }
}
