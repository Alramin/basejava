package resume.ru.cv.entitys;

import resume.ru.cv.BaseEntity;

public class Objective extends BaseEntity {

    private String content;

    @Override
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
