package resume.ru.cv.model.sections;

import resume.ru.cv.AbstractSection;
import resume.ru.cv.model.util.Institution;
import resume.ru.cv.model.util.Period;

import java.util.Map;
import java.util.Set;

public class Education extends AbstractSection {

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
