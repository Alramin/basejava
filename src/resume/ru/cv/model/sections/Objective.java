package resume.ru.cv.model.sections;

import resume.ru.cv.AbstractSection;

public class Objective extends AbstractSection {

    private String content;

    @Override
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
