package resume.ru.cv.model.util;

public enum Contact {

    MOBILE_PHONE("Моб.", ""),

    EMAIL("Email", "mailto:"),

    LINKEDIN("LinkedIn", "https://www.linkedin.com/profile/"),

    GITHUB("GitHub", "https://github.com/");

    private String title;
    private String prefix;

    Contact(String title, String prefix) {
        this.title = title;
        this.prefix = prefix;
    }

    public String getTitle() {
        return title;
    }

    public String getPrefix() {
        return prefix;
    }

    public String toHtml(String value) {
        if (prefix.isEmpty())
            return title + ": " + value;
        return String.format(Link.HREF, prefix+value, title);
    }
}
