package resume.ru.cv.model.sections;

import resume.ru.cv.AbstractSection;

import java.util.Map;

public class Qualification extends AbstractSection {

    private Map<String, String> content;

    @Override
    public String getContent() {
        StringBuilder sb = new StringBuilder();
        content.keySet().stream().map(key -> key + " : " + content.get(key)).forEach(sb::append);
        return sb.toString();
    }

    public void setContent(Map<String, String> content) {
        this.content = content;
    }
}
