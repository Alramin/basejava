package resume.ru.cv.model.sections;

import resume.ru.cv.AbstractSection;

import java.util.Set;

public class Achivement extends AbstractSection {

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
