package resume.ru.cv.entitys;

import resume.ru.cv.BaseEntity;

import java.util.Set;

public class Achivement extends BaseEntity {

    private Set<String> content;

    @Override
    public String getContent() {
        StringBuilder sb = new StringBuilder();
        content.forEach(s -> sb.append(s).append("\n"));
        return sb.toString();
    }

    public void setContent(Set<String> content) {
        this.content = content;
    }
}
