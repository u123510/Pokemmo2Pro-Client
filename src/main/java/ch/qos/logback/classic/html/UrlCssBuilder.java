package ch.qos.logback.classic.html;

import ch.qos.logback.core.html.CssBuilder;

public class UrlCssBuilder implements CssBuilder {
    private String url = "http://logback.qos.ch/css/classic.css";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void addCss(StringBuilder output) {
        output.append("<link REL=StyleSheet HREF=\"")
                .append(url)
                .append("\" TITLE=\"Basic\" />");
    }
}
