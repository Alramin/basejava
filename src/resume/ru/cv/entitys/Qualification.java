package resume.ru.cv.entitys;

import resume.ru.cv.BaseEntity;

import java.util.Map;

public class Qualification extends BaseEntity {

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
