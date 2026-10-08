package ch.qos.logback.core.recovery;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public class ResilientFileOutputStream extends ResilientOutputStreamBase {
    private File file;
    private FileOutputStream fos;

    public ResilientFileOutputStream(File file, boolean append, long bufferSize) throws IOException {
        this.file = file;
        fos = new FileOutputStream(file, append);
        os = new BufferedOutputStream(fos, (int) bufferSize);
        presumedClean = true;
    }

    public FileChannel getChannel() { return os == null ? null : fos.getChannel(); }
    public File getFile() { return file; }
    public String getDescription() { return "file [" + file + "]"; }

    @Override
    public OutputStream openNewOutputStream() throws IOException {
        fos = new FileOutputStream(file, true);
        return new BufferedOutputStream(fos);
    }

    @Override
    public String toString() { return "c.q.l.c.recovery.ResilientFileOutputStream@" + System.identityHashCode(this); }
}
