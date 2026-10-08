package cn.pokemmo.graphics.model;

import f.*;

public class ModelBoneTransformTrack {
    public final cf_2 O8;
    public final am_2 Com2;
    public final es_1 p40;
    public final es_1 Tq;
    public final float Hm0;

    public ModelBoneTransformTrack(am_2 data, es_1 entries) {
        this.O8 = new cf_2();
        this.Com2 = data;
        this.p40 = null;
        this.Tq = entries;
        this.Hm0 = 0.01752F;
        String[] prefix = ((pv_0)data.ib0.k00(((SJ)entries.get(0)).T2)).QW.split("\\.");
        int index = 0;
        us0_0 names = data.mw.mC0().x10();
        while (names.hasNext()) {
            String name = (String)names.next();
            String[] parts = name.split("\\.");
            if (!parts[0].equalsIgnoreCase(prefix[0])) {
                continue;
            }
            String key = parts[0];
            if (!this.O8.Vd(key)) {
                this.O8.n3(key, new Ka(name));
            }
            Ka group = (Ka)this.O8.Ip(key);
            group.YO.Ue0(name);
            group.Sr.Ue0(data.J80.ch0().get(index));
            ++index;
        }
    }

    public ModelBoneTransformTrack(String name, am_2 data, es_1 entries, float scale) {
        this.O8 = new cf_2();
        this.Com2 = data;
        this.p40 = entries;
        this.Hm0 = scale;
        Ka group = new Ka(name);
        this.O8.n3(name, group);
        I2 names = data.mw.ch0().ZD();
        while (names.hasNext()) {
            String value = (String)names.next();
            group.YO.Ue0(value);
            group.Sr.Ue0(data.J80.ch0().get(0));
        }
        this.Tq = null;
    }
}
