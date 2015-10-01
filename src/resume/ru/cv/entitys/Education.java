package resume.ru.cv.entitys;

import resume.ru.cv.BaseEntity;
import resume.ru.cv.entitys.util.Institution;
import resume.ru.cv.entitys.util.Period;

import java.util.Map;
import java.util.Set;

public class Education extends BaseEntity {

    private Map<Institution, Set<Period>> content;

    public void setContent(Map<Institution, Set<Period>> content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        StringBuilder sb = new StringBuilder();
        content.keySet().forEach(key -> {
            content.get(key).stream().map(Period::getPeriod).forEachOrdered(sb::append);
            sb.append("          ").append(key).append("\n");
        });
        return sb.toString();
    }
}
