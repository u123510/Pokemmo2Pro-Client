package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class ConfigurationWatchList extends ContextAwareBase {
    URL mainURL;
    List fileWatchList;
    List lastModifiedList;

    public ConfigurationWatchList() {
        this.fileWatchList = new ArrayList();
        this.lastModifiedList = new ArrayList();
    }

    private void addAsFileToWatch(URL url) {
        File file = convertToFile(url);
        if (file != null) {
            this.fileWatchList.add(file);
            this.lastModifiedList.add(Long.valueOf(file.lastModified()));
        }
    }

    public ConfigurationWatchList buildClone() {
        ConfigurationWatchList clone = new ConfigurationWatchList();
        clone.mainURL = this.mainURL;
        clone.fileWatchList = new ArrayList(this.fileWatchList);
        clone.lastModifiedList = new ArrayList(this.lastModifiedList);
        return clone;
    }

    public void clear() {
        this.mainURL = null;
        this.lastModifiedList.clear();
        this.fileWatchList.clear();
    }

    public void setMainURL(URL url) {
        this.mainURL = url;
        if (url != null) {
            addAsFileToWatch(url);
        }
    }

    public void addToWatchList(URL url) {
        addAsFileToWatch(url);
    }

    public URL getMainURL() {
        return this.mainURL;
    }

    public List getCopyOfFileWatchList() {
        return new ArrayList(this.fileWatchList);
    }

    public boolean changeDetected() {
        int size = this.fileWatchList.size();
        for (int index = 0; index < size; index++) {
            long previous = ((Long) this.lastModifiedList.get(index)).longValue();
            long current = ((File) this.fileWatchList.get(index)).lastModified();
            if (previous != current) {
                return true;
            }
        }
        return false;
    }

    public File convertToFile(URL url) {
        if ("file".equals(url.getProtocol())) {
            return new File(URLDecoder.decode(url.getFile()));
        }
        addInfo("URL [" + String.valueOf(url) + "] is not of type file");
        return null;
    }
}
