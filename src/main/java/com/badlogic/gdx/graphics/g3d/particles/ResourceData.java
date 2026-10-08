package com.badlogic.gdx.graphics.g3d.particles;

import f.I2;
import f.Nn0;
import f.VD0;
import f.cr_2;
import f.dy0_0;
import f.es_1;
import f.gp_1;
import f.nb_2;
import f.nf_1;
import f.oe_0;
import f.xn_1;

public class ResourceData implements VD0 {
    private nb_2 uniqueData;
    private es_1 data;
    es_1 sharedAssets;
    private int currentLoadIndex;
    public Object resource;

    public ResourceData() {
        this.uniqueData = new nb_2();
        this.data = new es_1(true, 3, SaveData.class);
        this.sharedAssets = new es_1();
        this.currentLoadIndex = 0;
    }

    public ResourceData(Object resource) {
        this();
        this.resource = resource;
    }

    public int getAssetData(String filename, Class type) {
        int i = 0;
        I2 iterator = this.sharedAssets.ZD();
        while (iterator.hasNext()) {
            AssetData assetData = (AssetData)iterator.next();
            if (assetData.filename.equals(filename) && assetData.type.equals(type)) return i;
            ++i;
        }
        return -1;
    }

    public es_1 getAssetDescriptors() {
        es_1 descriptors = new es_1();
        I2 iterator = this.sharedAssets.ZD();
        while (iterator.hasNext()) {
            AssetData data = (AssetData)iterator.next();
            descriptors.Ue0(new cr_2(data.filename, data.type));
        }
        return descriptors;
    }

    public es_1 getAssets() {
        return this.sharedAssets;
    }

    public SaveData createSaveData() {
        SaveData saveData = new SaveData(this);
        this.data.Ue0(saveData);
        return saveData;
    }

    public SaveData createSaveData(String key) {
        SaveData saveData = new SaveData(this);
        if (this.uniqueData.fl(key)) throw new RuntimeException("Key already used, data must be unique, use a different key");
        this.uniqueData.WK0(key, saveData);
        return saveData;
    }

    public SaveData getSaveData() {
        return (SaveData)this.data.get(this.currentLoadIndex++);
    }

    public SaveData getSaveData(String key) {
        return (SaveData)this.uniqueData.Wk0(key);
    }

    @Override
    public void write(gp_1 json) {
        json.A2("unique", this.uniqueData, nb_2.class, null);
        json.A2("data", this.data, es_1.class, SaveData.class);
        json.A2("assets", this.sharedAssets.Mo0(AssetData.class), AssetData[].class, null);
        json.A2("resource", this.resource, null, null);
    }

    @Override
    public void read(gp_1 json, oe_0 jsonData) {
        this.uniqueData = (nb_2)json.b20(nb_2.class, SaveData.class, jsonData.Is("unique"));
        if (this.uniqueData == null) this.uniqueData = new nb_2();
        for (Object o : this.uniqueData.u9()) {
            ((SaveData)((xn_1)o).kM).resources = this;
        }

        this.data = (es_1)json.b20(es_1.class, SaveData.class, jsonData.Is("data"));
        if (this.data == null) this.data = new es_1(true, 3, SaveData.class);
        I2 dataIterator = this.data.ZD();
        while (dataIterator.hasNext()) {
            ((SaveData)dataIterator.next()).resources = this;
        }

        this.sharedAssets = new es_1();
        Object assets = json.b20(AssetData[].class, AssetData.class, jsonData.Is("assets"));
        if (assets instanceof Object[]) this.sharedAssets.G6((Object[])assets, 0, ((Object[])assets).length);
        this.resource = json.b20(null, null, jsonData.Is("resource"));
        this.currentLoadIndex = 0;
    }

    public static interface Configurable {
        void save(f.hd0_2 manager, ResourceData resources);

        void load(f.hd0_2 manager, ResourceData resources);
    }

    public static class AssetData implements VD0 {
        public String filename;
        public Class type;

        public AssetData() {
        }

        public AssetData(String filename, Class type) {
            this.filename = filename;
            this.type = type;
        }

        @Override
        public void write(gp_1 json) {
            json.A2("filename", this.filename, null, null);
            json.A2("type", this.type.getName(), null, null);
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            this.filename = (String)json.b20(String.class, null, jsonData.Is("filename"));
            String className = (String)json.b20(String.class, null, jsonData.Is("type"));
            try {
                this.type = Class.forName(className);
            } catch (ClassNotFoundException e) {
                throw new nf_1("Class not found: " + className, e);
            }
        }
    }

    public static class SaveData implements VD0 {
        nb_2 data;
        Nn0 assets;
        private int loadIndex;
        protected ResourceData resources;

        public SaveData() {
            this.data = new nb_2();
            this.assets = new Nn0();
            this.loadIndex = 0;
        }

        public SaveData(ResourceData resources) {
            this();
            this.resources = resources;
        }

        public void saveAsset(String filename, Class type) {
            int i = this.resources.getAssetData(filename, type);
            if (i == -1) {
                this.resources.sharedAssets.Ue0(new AssetData(filename, type));
                i = this.resources.sharedAssets.KB - 1;
            }
            this.assets.ja0(i);
        }

        public void save(String key, Object value) {
            this.data.WK0(key, value);
        }

        public cr_2 loadAsset() {
            if (this.loadIndex == this.assets.Ml) return null;
            AssetData data = (AssetData)this.resources.sharedAssets.get(this.assets.X8(this.loadIndex++));
            return new cr_2(data.filename, data.type);
        }

        public Object load(String key) {
            return this.data.Wk0(key);
        }

        @Override
        public void write(gp_1 json) {
            json.A2("data", this.data, nb_2.class, null);
            json.A2("indices", this.assets.Ni(), int[].class, null);
        }

        @Override
        public void read(gp_1 json, oe_0 jsonData) {
            this.data = (nb_2)json.b20(nb_2.class, null, jsonData.Is("data"));
            if (this.data == null) this.data = new nb_2();
            int[] indices = (int[])json.b20(int[].class, null, jsonData.Is("indices"));
            this.assets = new Nn0();
            if (indices != null) {
                for (int index : indices) this.assets.ja0(index);
            }
            this.loadIndex = 0;
        }
    }
}
