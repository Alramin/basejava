package resume.ru.cv.entitys;

import resume.ru.cv.BaseEntity;
import resume.ru.cv.entitys.util.Job;
import resume.ru.cv.entitys.util.Period;

import java.util.Map;
import java.util.Set;

public class Experience extends BaseEntity {

    private Map<Job, Set<Period>> content;

    @Override
    public String getContent() {
        StringBuilder sb = new StringBuilder();
        content.keySet().forEach(key -> {
            content.get(key).stream().map(Period::getPeriod).forEachOrdered(sb::append);
            sb.append("          ").append(key).append("\n");
        });
        return sb.toString();
    }

    public void setContent(Map<Job, Set<Period>> content) {
        this.content = content;
    }
}
