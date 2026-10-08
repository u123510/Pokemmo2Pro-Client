package cn.pokemmo.assets.loader.parameter;

public class SyncTaskParameter extends BaseAssetLoaderParameters {
    public final String fN;
    public final int s70;
    public final String[] Y0;

    public SyncTaskParameter() {
        super();
        this.fN = "i ";
        this.s70 = 1024;
        this.Y0 = new String[]{
            "png", "PNG", "jpeg", "JPEG", "jpg", "JPG",
            "cim", "CIM", "etc1", "ETC1", "ktx", "KTX", "zktx", "ZKTX"
        };
    }
}
