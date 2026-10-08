/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.diagnostic.system;

import f.*;

import f.Cq0;
import f.Dn0;
import f.T00;
import f.TI0;
import f.UE;
import f.Up0;
import f.VE;
import f.dl_1;
import f.lg_0;
import f.lpt9__1;
import f.mh0_2;
import f.mu_1;
import f.nf0_0;
import f.rw0;
import f.sm0_0;
import f.tw0_0;
import f.yx_1;
import f.zg0_1;
import f.zv_1;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.TreeMap;
import java.util.regex.Pattern;

public abstract class ClientSystemEnvironmentDiagnosticCollector {
    public static final dl_1 iC = Cq0.E1(ClientSystemEnvironmentDiagnosticCollector.class);
    public static final TreeMap j1 = new TreeMap();
    public static final String eP = "log/console.log";
    public static final String Ka0 = "log/mods.log";

    public static void S2() {
        lg_0.I70.getClass();
        for (Dn0 dn0 : new VE(".", zv_1.kE).WM((file, string) -> string.startsWith("hs_err_pid") && string.endsWith(".log"))) {
            if (!ClientSystemEnvironmentDiagnosticCollector.ac0(dn0)) {
                dn0.sf();
                continue;
            }
            tw0_0.uV.Qu(sm0_0.c0(nf0_0.go), sm0_0.c0(nf0_0.OC), UE.iC, new zg0_1(dn0), new mu_1(dn0), false);
        }
        lg_0.I70.getClass();
        for (Dn0 dn0 : new VE(".", zv_1.kE).WM((file, string) -> string.startsWith("pokemmo_crash_") && string.endsWith(".log"))) {
            if (!ClientSystemEnvironmentDiagnosticCollector.ac0(dn0)) {
                dn0.sf();
                continue;
            }
            tw0_0.uV.Qu(sm0_0.c0(nf0_0.go), sm0_0.c0(nf0_0.OC), UE.iC, new lpt9__1(dn0), new Up0(dn0), false);
        }
    }

    public static boolean ac0(Dn0 dn0) {
        if (System.currentTimeMillis() - dn0.Uy0() > 172800000L) {
            dn0.sf();
            return false;
        }
        try {
            return !dn0.gd0("UTF-8").contains("There is insufficient memory for the Java Runtime Environment to continue");
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public static VE Cp(Throwable object) {
        StringWriter stringWriter = new StringWriter();
        object.printStackTrace(new PrintWriter((Writer)stringWriter, true));
        return ClientSystemEnvironmentDiagnosticCollector.ix0(stringWriter.getBuffer().toString(), null);
    }

    /*
     * Exception decompiling
     */
    public static VE ix0(String var0, String var1_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [13 : 157->160)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static void Sx0(Dn0 object, boolean bl) {
        if (object == null) {
            return;
        }
        iC.info("Submitting error report: {}", (Object)object.o30());
        String body = object.gd0("UTF-8");
        try {
            object.sf();
        } catch (Exception ignored) {
        }
        if (body.isEmpty()) {
            return;
        }
        T00 request = new T00("POST");
        request.UA0 = "https://api.pokemmo.com/submit-error-report/?base64=true";
        request.Sc0.put("Content-Type", "application/json");
        request.Wr0 = TI0.Ga(body.getBytes(StandardCharsets.UTF_8));
        request.KE = 60000;
        iC.info("Submitting error report...");
        try {
            lg_0.lv0.Ls0(request, new rw0(bl));
        } catch (Exception exception) {
            iC.error("Error submitting error report", exception);
        }
    }

    public static void coM8() {
        mh0_2 mh0_22 = tw0_0.Ht0;
        mh0_22.FU((byte)6, System.getProperty("java.vendor"));
        mh0_22.FU((byte)7, System.getProperty("java.version"));
        ClientSystemEnvironmentDiagnosticCollector.bL0("java_vendor", System.getProperty("java.vendor"), "Java Vendor", false);
        ClientSystemEnvironmentDiagnosticCollector.bL0("java_version", System.getProperty("java.version"), "Java Version", false);
        ClientSystemEnvironmentDiagnosticCollector.bL0("java_home", System.getProperty("java.home"), "Java Home", true);
        ClientSystemEnvironmentDiagnosticCollector.bL0("client_home", System.getProperty("user.dir"), "Client Home", true);
        mh0_22.FU((byte)3, System.getProperty("os.name"));
        mh0_22.FU((byte)4, System.getProperty("os.version"));
        mh0_22.FU((byte)5, System.getProperty("os.arch"));
        ClientSystemEnvironmentDiagnosticCollector.bL0("os_name", System.getProperty("os.name"), "OS name", false);
        ClientSystemEnvironmentDiagnosticCollector.bL0("os_version", System.getProperty("os.version"), "OS version", false);
        ClientSystemEnvironmentDiagnosticCollector.bL0("os_arch", System.getProperty("os.arch"), "OS arch", false);
        ClientSystemEnvironmentDiagnosticCollector.bL0("os_abi", System.getProperty("sun.arch.abi"), "OS abi", false);
        mh0_22.FU((byte)8, System.getProperty("java.runtime.name"));
        mh0_22.FU((byte)9, System.getProperty("java.vm.version"));
        ClientSystemEnvironmentDiagnosticCollector.bL0("jvm_arch", System.getProperty("sun.arch.data.model"), "JVM arch", false);
        ClientSystemEnvironmentDiagnosticCollector.bL0("jvm_runtime", System.getProperty("java.runtime.name"), "JVM Runtime", false);
        ClientSystemEnvironmentDiagnosticCollector.bL0("jvm_version", System.getProperty("java.vm.version"), "JVM version", false);
        Runtime runtime = Runtime.getRuntime();
        ClientSystemEnvironmentDiagnosticCollector.bL0("heap_memory_max", runtime.maxMemory() / 0x100000L + " MB", "Max Heap Memory", false);
        ClientSystemEnvironmentDiagnosticCollector.bL0("locale", Locale.getDefault().toString(), "Locale", false);
        ClientSystemEnvironmentDiagnosticCollector.bL0("file_encoding", System.getProperty("file.encoding"), "File Encoding", false);
        ClientSystemEnvironmentDiagnosticCollector.bL0("libgdx_version", "1.12.1", "Gdx version", false);
    }

    public static void ly(String string) {
        ClientSystemEnvironmentDiagnosticCollector.bL0("jvm_arguments", string, "JVM Arguments", false);
    }

    public static void bL0(String string, Object object, String string2, boolean bl) {
        if (object == null) {
            return;
        }
        object = object.toString();
        if (bl) {
            object = ClientSystemEnvironmentDiagnosticCollector.lF0((String)object);
        }
        iC.info("{}: {}", (Object)string2.trim(), object);
        j1.put(string, object);
    }

    public static String lF0(String string) {
        return string.replaceAll("([\\\\/])" + Pattern.quote(System.getProperty("user.name")) + "([\\\\/])", "$1%OS_USERNAME%$2").replaceAll("(gdx)" + Pattern.quote(System.getProperty("user.name")) + "([\\\\/])", "$1%OS_USERNAME%$2").replaceAll("(USERNAME=)" + Pattern.quote(System.getProperty("user.name")), "$1%OS_USERNAME%");
    }
}

