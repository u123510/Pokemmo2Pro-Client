/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;

public class RenameUtil
extends ContextAwareBase {
    static String RENAMING_ERROR_URL = "http://logback.qos.ch/codes.html#renamingError";

    public void rename(String string, String string2) {
        if (string.equals(string2)) {
            this.addWarn("Source and target files are the same [" + string + "]. Skipping.");
            return;
        }
        File file = new File(string);
        if (file.exists()) {
            File file3 = new File(string2);
            this.createMissingTargetDirsIfNecessary(file3);
            this.addInfo("Renaming file [" + String.valueOf(file) + "] to [" + String.valueOf(file3) + "]");
            if (!file.renameTo(file3)) {
                this.addWarn("Failed to rename file [" + String.valueOf(file) + "] as [" + String.valueOf(file3) + "].");
                if (Boolean.TRUE.equals(this.areOnDifferentVolumes(file, file3))) {
                    this.addWarn("Detected different file systems for source [" + string + "] and target [" + string2 + "]. Attempting rename by copying.");
                    this.renameByCopying(string, string2);
                    return;
                }
                this.addWarn("Please consider leaving the [file] option of " + "RollingFileAppender" + " empty.");
                this.addWarn("See also " + RENAMING_ERROR_URL);
            }
            return;
        }
        throw new RolloverFailure("File [" + string + "] does not exist.");
    }

    public Boolean areOnDifferentVolumes(File file, File file2) {
        boolean bl;
        if (!EnvUtil.isJDK7OrHigher()) {
            return Boolean.FALSE;
        }
        File file3 = file2.getAbsoluteFile().getParentFile();
        if (file3 == null) {
            this.addWarn("Parent of target file [" + String.valueOf(file2) + "] is null");
            return null;
        }
        if (!file3.exists()) {
            this.addWarn("Parent of target file [" + String.valueOf(file2) + "] does not exist");
            return null;
        }
        try {
            bl = !FileStoreUtil.areOnSameFileStore(file, file3);
        }
        catch (RolloverFailure rolloverFailure) {
            this.addWarn("Error while checking file store equality", rolloverFailure);
            return null;
        }
        return bl;
    }

    public void renameByCopying(String string, String string2) {
        new FileUtil(this.getContext()).copy(string, string2);
        if (!new File(string).delete()) {
            this.addWarn("Could not delete " + string);
        }
    }

    public void createMissingTargetDirsIfNecessary(File file) {
        if (FileUtil.createMissingParentDirectories(file)) {
            return;
        }
        throw new RolloverFailure("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
    }

    public String toString() {
        return "c.q.l.co.rolling.helper.RenameUtil";
    }
}