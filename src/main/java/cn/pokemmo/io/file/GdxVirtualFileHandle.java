package cn.pokemmo.io.file;

import f.*;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/**
 * 跨平台虚拟文件系统句柄 (GdxVirtualFileHandle)
 *
 * <p>原始混淆类：{@link f.Dn0}
 */
public class GdxVirtualFileHandle {
    public File Q50;
    public zv_1 a5;

    public GdxVirtualFileHandle() {
    }

    public GdxVirtualFileHandle(String path) {
        this(new File(path), zv_1.uq0);
    }

    public GdxVirtualFileHandle(File file) {
        this(file, zv_1.uq0);
    }

    public GdxVirtualFileHandle(String path, zv_1 type) {
        this(new File(path), type);
    }

    public GdxVirtualFileHandle(File file, zv_1 type) {
        this.Q50 = file;
        this.a5 = type;
    }

    public static void Jr(File file, boolean recursive) {
        if (!file.exists()) {
            return;
        }
        File[] children = file.listFiles();
        if (children == null) {
            return;
        }
        for (File child : children) {
            if (!child.isDirectory()) {
                child.delete();
            } else if (recursive) {
                Jr(child, true);
            } else {
                Jr(child, false);
                child.delete();
            }
        }
    }

    public static void pH0(GdxVirtualFileHandle source, GdxVirtualFileHandle destination) {
        try {
            destination.zt(source.uf0());
        } catch (Exception exception) {
            String message = "Error copying source file: "
                + source.Q50 + " (" + source.a5 + ")\nTo destination: "
                + destination.Q50 + " (" + destination.a5 + ")";
            throw new nf_1(message, exception);
        }
    }

    public static void li(GdxVirtualFileHandle source, GdxVirtualFileHandle destination) {
        source.A20();
        GdxVirtualFileHandle[] children = source.Ce0();
        for (GdxVirtualFileHandle child : children) {
            GdxVirtualFileHandle target = destination.wp(child.o30());
            if (child.RL()) {
                li(child, target);
            } else {
                pH0(child, target);
            }
        }
    }

    public final String el() {
        return this.Q50.getPath().replace('\\', '/');
    }

    public String o30() {
        return this.Q50.getName();
    }

    public final String BN() {
        String name = this.Q50.getName();
        int dot = name.lastIndexOf('.');
        if (dot == -1) {
            return "";
        }
        return name.substring(dot + 1);
    }

    public final String R20() {
        String name = this.Q50.getName();
        int dot = name.lastIndexOf('.');
        if (dot == -1) {
            return name;
        }
        return name.substring(0, dot);
    }

    public final zv_1 G0() {
        return this.a5;
    }

    public File l00() {
        if (this.a5 == zv_1.JJ) {
            lg_0.I70.getClass();
            return new File(os0_0.L10, this.Q50.getPath());
        }
        return this.Q50;
    }

    public InputStream uf0() {
        zv_1 type = this.a5;
        if (type != zv_1.Gi0) {
            if (type != zv_1.tt0 || this.l00().exists()) {
                if (this.a5 == zv_1.kE && !this.l00().exists()) {
                    String path = "/" + this.Q50.getPath().replace('\\', '/');
                    InputStream stream = GdxVirtualFileHandle.class.getResourceAsStream(path);
                    if (stream == null) {
                        throw new nf_1("File not found: " + this.Q50 + " (" + this.a5 + ")");
                    }
                    return stream;
                }
                try {
                    return new FileInputStream(this.l00());
                } catch (Exception exception) {
                    if (this.l00().isDirectory()) {
                        throw new nf_1(
                            "Cannot open a stream to a directory: "
                                + this.Q50 + " (" + this.a5 + ")",
                            exception
                        );
                    }
                    throw new nf_1(
                        "Error reading file: " + this.Q50 + " (" + this.a5 + ")",
                        exception
                    );
                }
            }
        }
        String path = "/" + this.Q50.getPath().replace('\\', '/');
        InputStream stream = GdxVirtualFileHandle.class.getResourceAsStream(path);
        if (stream == null) {
            throw new nf_1("File not found: " + this.Q50 + " (" + this.a5 + ")");
        }
        return stream;
    }

    public BufferedInputStream LpT7(int bufferSize) {
        return new BufferedInputStream(this.uf0(), bufferSize);
    }

    public final String uz() {
        return this.gd0(null);
    }

    public final String gd0(String charset) {
        int capacity = (int)this.Nm0();
        if (capacity == 0) {
            capacity = 512;
        }
        StringBuilder result = new StringBuilder(capacity);
        Reader reader = null;
        try {
            if (charset == null) {
                reader = new InputStreamReader(this.uf0());
            } else {
                reader = new InputStreamReader(this.uf0(), charset);
            }
            char[] buffer = new char[256];
            int count;
            while ((count = reader.read(buffer)) != -1) {
                result.append(buffer, 0, count);
            }
            return result.toString();
        } catch (java.io.IOException exception) {
            throw new nf_1("Error reading layout file: " + this, exception);
        } finally {
            KT.E1(reader);
        }
    }

    public byte[] kI0() {
        InputStream stream = null;
        try {
            stream = this.uf0();
            int capacity = (int)this.Nm0();
            if (capacity == 0) {
                capacity = 512;
            }
            return KT.Vc(stream, capacity);
        } finally {
            KT.E1(stream);
        }
    }

    public ByteBuffer zs0(FileChannel.MapMode mode) {
        if (this.a5 == zv_1.Gi0) {
            throw new nf_1("Cannot map a classpath file: " + this);
        }
        RandomAccessFile randomAccessFile = null;
        try {
            File file = this.l00();
            String access = mode == FileChannel.MapMode.READ_ONLY ? "r" : "rw";
            randomAccessFile = new RandomAccessFile(file, access);
            FileChannel channel = randomAccessFile.getChannel();
            long offset = 0L;
            long length = file.length();
            ByteBuffer buffer = channel.map(mode, offset, length);
            buffer.order(ByteOrder.nativeOrder());
            return buffer;
        } catch (Exception exception) {
            throw new nf_1(
                "Error memory mapping file: " + this + " (" + this.a5 + ")",
                exception
            );
        } finally {
            if (randomAccessFile != null) {
                KT.E1(randomAccessFile);
            }
        }
    }

    public GdxVirtualFileHandle[] Ce0() {
        if (this.a5 == zv_1.Gi0) {
            throw new nf_1("Cannot list a classpath directory: " + this.Q50);
        }
        String[] names = this.l00().list();
        if (names == null) {
            return new GdxVirtualFileHandle[0];
        }
        GdxVirtualFileHandle[] result = new GdxVirtualFileHandle[names.length];
        for (int i = 0; i < names.length; i++) {
            result[i] = this.wp(names[i]);
        }
        return result;
    }

    public GdxVirtualFileHandle[] WM(FilenameFilter filter) {
        if (this.a5 == zv_1.Gi0) {
            throw new nf_1("Cannot list a classpath directory: " + this.Q50);
        }
        File directory = this.l00();
        String[] names = directory.list();
        if (names == null) {
            return new GdxVirtualFileHandle[0];
        }
        GdxVirtualFileHandle[] result = new GdxVirtualFileHandle[names.length];
        int count = 0;
        for (String name : names) {
            if (filter.accept(directory, name)) {
                result[count++] = this.wp(name);
            }
        }
        if (count < names.length) {
            GdxVirtualFileHandle[] trimmed = new GdxVirtualFileHandle[count];
            System.arraycopy(result, 0, trimmed, 0, count);
            result = trimmed;
        }
        return result;
    }

    public GdxVirtualFileHandle[] gH0(String suffix) {
        if (this.a5 == zv_1.Gi0) {
            throw new nf_1("Cannot list a classpath directory: " + this.Q50);
        }
        String[] names = this.l00().list();
        if (names == null) {
            return new GdxVirtualFileHandle[0];
        }
        GdxVirtualFileHandle[] result = new GdxVirtualFileHandle[names.length];
        int count = 0;
        for (String name : names) {
            if (name.endsWith(suffix)) {
                result[count++] = this.wp(name);
            }
        }
        if (count < names.length) {
            GdxVirtualFileHandle[] trimmed = new GdxVirtualFileHandle[count];
            System.arraycopy(result, 0, trimmed, 0, count);
            result = trimmed;
        }
        return result;
    }

    public boolean RL() {
        if (this.a5 == zv_1.Gi0) {
            return false;
        }
        return this.l00().isDirectory();
    }

    public GdxVirtualFileHandle wp(String name) {
        if (this.Q50.getPath().length() == 0) {
            return new GdxVirtualFileHandle(new File(name), this.a5);
        }
        return new GdxVirtualFileHandle(new File(this.Q50, name), this.a5);
    }

    public GdxVirtualFileHandle xt(String name) {
        if (this.Q50.getPath().length() == 0) {
            throw new nf_1("Cannot get the sibling of the root.");
        }
        return new GdxVirtualFileHandle(new File(this.Q50.getParent(), name), this.a5);
    }

    public GdxVirtualFileHandle Br() {
        File parent = this.Q50.getParentFile();
        if (parent == null) {
            if (this.a5 == zv_1.uq0) {
                parent = new File("/");
            } else {
                parent = new File("");
            }
        }
        return new GdxVirtualFileHandle(parent, this.a5);
    }

    public final void A20() {
        zv_1 type = this.a5;
        if (type == zv_1.Gi0) {
            throw new nf_1("Cannot mkdirs with a classpath file: " + this.Q50);
        }
        if (type == zv_1.tt0) {
            throw new nf_1("Cannot mkdirs with an internal file: " + this.Q50);
        }
        this.l00().mkdirs();
    }

    public boolean os0() {
        int kind = vk_2.ZQ[this.a5.ordinal()];
        if (kind != 1 && kind != 2) {
            return this.l00().exists();
        }
        if (kind == 1 && this.l00().exists()) {
            return true;
        }
        String path = "/" + this.Q50.getPath().replace('\\', '/');
        return GdxVirtualFileHandle.class.getResource(path) != null;
    }

    public final boolean sf() {
        zv_1 type = this.a5;
        if (type == zv_1.Gi0) {
            throw new nf_1("Cannot delete a classpath file: " + this.Q50);
        }
        if (type == zv_1.tt0) {
            throw new nf_1("Cannot delete an internal file: " + this.Q50);
        }
        return this.l00().delete();
    }

    public final void WD0(GdxVirtualFileHandle destination) {
        if (!this.RL()) {
            if (destination.RL()) {
                destination = destination.wp(this.o30());
            }
            pH0(this, destination);
            return;
        }
        if (destination.os0()) {
            if (!destination.RL()) {
                throw new nf_1("Destination exists but is not a directory: " + destination);
            }
        } else {
            destination.A20();
            if (!destination.RL()) {
                throw new nf_1("Destination directory cannot be created: " + destination);
            }
        }
        li(this, destination.wp(this.o30()));
    }

    public final void jE0(GdxVirtualFileHandle destination) {
        int kind = vk_2.ZQ[this.a5.ordinal()];
        if (kind == 1) {
            throw new nf_1("Cannot move an internal file: " + this.Q50);
        }
        if (kind == 2) {
            throw new nf_1("Cannot move a classpath file: " + this.Q50);
        }
        if (kind == 3 || kind == 4) {
            if (this.l00().renameTo(destination.l00())) {
                return;
            }
        }
        this.WD0(destination);
        this.sf();
        if (this.os0() && this.RL()) {
            this.Jq();
        }
    }

    public long Nm0() {
        zv_1 type = this.a5;
        if (type != zv_1.Gi0 && !(type == zv_1.tt0 && !this.Q50.exists())) {
            return this.l00().length();
        }
        InputStream stream = this.uf0();
        try {
            return stream.available();
        } catch (Exception exception) {
            return 0L;
        } finally {
            KT.E1(stream);
        }
    }

    public long Uy0() {
        return this.l00().lastModified();
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof GdxVirtualFileHandle)) {
            return false;
        }
        GdxVirtualFileHandle other = (GdxVirtualFileHandle)object;
        return this.a5 == other.a5 && this.el().equals(other.el());
    }

    @Override
    public final int hashCode() {
        int result = (this.a5.hashCode() + 37) * 67;
        return result + this.el().hashCode();
    }

    @Override
    public final String toString() {
        return this.Q50.getPath().replace('\\', '/');
    }

    public final InputStreamReader IE0(String charset) {
        InputStream stream = this.uf0();
        try {
            return new InputStreamReader(stream, charset);
        } catch (UnsupportedEncodingException exception) {
            KT.E1(stream);
            throw new nf_1("Error reading file: " + this, exception);
        }
    }

    public void yM(byte[] bytes, int length) {
        InputStream stream = this.uf0();
        int offset = 0;
        try {
            int count;
            while ((count = stream.read(bytes, offset, length - offset)) > 0) {
                offset += count;
            }
        } catch (java.io.IOException exception) {
            throw new nf_1("Error reading file: " + this, exception);
        } finally {
            KT.E1(stream);
        }
    }

    public OutputStream OC0() {
        int append = 0;
        zv_1 type = this.a5;
        if (type == zv_1.Gi0) {
            throw new nf_1("Cannot write to a classpath file: " + this.Q50);
        }
        if (type == zv_1.tt0) {
            throw new nf_1("Cannot write to an internal file: " + this.Q50);
        }
        this.Br().A20();
        try {
            return new FileOutputStream(this.l00(), append != 0);
        } catch (Exception exception) {
            if (this.l00().isDirectory()) {
                throw new nf_1(
                    "Cannot open a stream to a directory: "
                        + this.Q50 + " (" + this.a5 + ")",
                    exception
                );
            }
            throw new nf_1(
                "Error writing file: " + this.Q50 + " (" + this.a5 + ")",
                exception
            );
        }
    }

    public final void zt(InputStream input) {
        String message = "Error stream writing to file: ";
        OutputStream output = null;
        try {
            output = this.OC0();
            byte[] buffer = new byte[4096];
            int count;
            while ((count = input.read(buffer)) != -1) {
                output.write(buffer, 0, count);
            }
            return;
        } catch (Exception exception) {
            throw new nf_1(message + this.Q50 + " (" + this.a5 + ")", exception);
        } finally {
            KT.E1(output);
            KT.E1(input);
        }
    }

    public final void Al0(byte[] bytes) {
        String message = "Error writing file: ";
        OutputStream output = this.OC0();
        try {
            output.write(bytes);
        } catch (java.io.IOException exception) {
            throw new nf_1(message + this.Q50 + " (" + this.a5 + ")", exception);
        } finally {
            KT.E1(output);
        }
    }

    public final void Jq() {
        zv_1 type = this.a5;
        if (type == zv_1.Gi0) {
            throw new nf_1("Cannot delete a classpath file: " + this.Q50);
        }
        if (type == zv_1.tt0) {
            throw new nf_1("Cannot delete an internal file: " + this.Q50);
        }
        File file = this.l00();
        Jr(file, false);
        file.delete();
    }

    public final OutputStreamWriter Fm(String charset) {
        int append = 0;
        zv_1 type = this.a5;
        if (type == zv_1.Gi0) {
            throw new nf_1("Cannot write to a classpath file: " + this.Q50);
        }
        if (type == zv_1.tt0) {
            throw new nf_1("Cannot write to an internal file: " + this.Q50);
        }
        this.Br().A20();
        OutputStream output = null;
        try {
            output = new FileOutputStream(this.l00(), append != 0);
            if (charset == null) {
                return new OutputStreamWriter(output);
            }
            return new OutputStreamWriter(output, charset);
        } catch (java.io.IOException exception) {
            if (this.l00().isDirectory()) {
                throw new nf_1(
                    "Cannot open a stream to a directory: "
                        + this.Q50 + " (" + this.a5 + ")",
                    exception
                );
            }
            throw new nf_1(
                "Error writing file: " + this.Q50 + " (" + this.a5 + ")",
                exception
            );
        }
    }

    public final void Ex0(String text, String charset) {
        String message = "Error writing file: ";
        OutputStreamWriter writer = null;
        try {
            writer = this.Fm(charset);
            writer.write(text);
            return;
        } catch (Exception exception) {
            throw new nf_1(message + this.Q50 + " (" + this.a5 + ")", exception);
        } finally {
            KT.E1(writer);
        }
    }
}
