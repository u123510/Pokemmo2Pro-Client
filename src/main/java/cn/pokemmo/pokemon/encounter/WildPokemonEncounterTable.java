package cn.pokemmo.pokemon.encounter;

import f.*;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class WildPokemonEncounterTable {
    public static final Vv0 GU = new Vv0();
    public final ArrayList rc;
    public final ArrayList AE0;
    public int LS;

    public WildPokemonEncounterTable() {
        this.rc = new ArrayList();
        this.AE0 = new ArrayList();
    }

    public static Vv0 w9() {
        return GU;
    }

    public final void qm(sf0_2 message) {
        int limit;
        switch (dw_2.dk) {
            case 1:
                limit = 250;
                break;
            case 2:
                limit = 1000;
                break;
            case 3:
                limit = 2500;
                break;
            default:
                limit = 100;
                break;
        }
        if (lpt3__1.HY > 0) {
            limit = lpt3__1.HY;
        }

        synchronized (this.rc) {
            this.rc.add(message);
            while (this.rc.size() >= limit) {
                this.rc.remove(0);
            }

            if (message.hB0 == zo_0.YL
                    && message.Mp0.uI0()
                    && !message.At0.isEmpty()
                    && tw0_0.e60 != null
                    && !message.Mp0.equals(tw0_0.e60.dj0)) {
                this.AE0.remove(message.At0);
                this.AE0.add(0, message.At0);
                while (this.AE0.size() >= 10) {
                    this.AE0.remove(this.AE0.size() - 1);
                }
            }
        }

        if (lpt3__1.Ir0) {
            try {
                StringBuilder line = new StringBuilder("\r\n");
                String date = new SimpleDateFormat("dd-MM-yyy HH:mm:ss")
                        .format(Long.valueOf((long) message.k6 * 1000L));
                line.append("[").append(date).append("] ");
                line.append("[").append(sm0_0.c0(message.hB0.Yf)).append("]");
                if (message.hB0.bJ && message.Ww != null) {
                    line.append("[").append(message.Ww.na).append("]");
                }
                if (message.At0.length() > 0) {
                    line.append(message.At0).append(": ");
                }
                line.append(message.lw);

                FileWriter writer = new FileWriter("log/chat.log", true);
                writer.write(line.toString());
                writer.close();
            } catch (IOException ignored) {
            }
        }
    }

    public final String ZG(String query) {
        synchronized (this.rc) {
            if (this.AE0.isEmpty()) {
                return null;
            }
            if (query != null && !query.trim().isEmpty()) {
                for (int i = 0; i < this.AE0.size() - 1; i++) {
                    if (((String) this.AE0.get(i)).equalsIgnoreCase(query)) {
                        return (String) this.AE0.get(i + 1);
                    }
                }
            }
            return (String) this.AE0.get(0);
        }
    }

    public final synchronized void vY(int value) {
        if (value != this.LS) {
            this.LS = value;
            this.AE0.clear();
            this.rc.clear();
        }
    }
}
