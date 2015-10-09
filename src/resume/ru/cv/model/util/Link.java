package resume.ru.cv.model.util;

public class Link {

    public static final String HREF = "<a href='%s'>%s</a>";

    private final String name;
    private final String url;

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Link() {
        this(null, null);
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Link link = (Link) o;

        return name.equals(link.name) && !(url != null ? !url.equals(link.url) : link.url != null);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    public String toHtml(){
        return String.format(HREF, url, name);
    }
}