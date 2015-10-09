package resume.ru.cv.model.sections;

import resume.ru.cv.AbstractSection;
import resume.ru.cv.model.util.Job;
import resume.ru.cv.model.util.Period;

import java.util.Map;
import java.util.Set;

public class Experience extends AbstractSection {

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
