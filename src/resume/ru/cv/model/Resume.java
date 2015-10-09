package resume.ru.cv.model;

import resume.ru.cv.AbstractSection;

import java.util.Map;
import java.util.UUID;

public class Resume {

    private final String uuid;
    private final User employee;
    private final Map<SectionType, AbstractSection> sections;

    public Resume(User employee, Map<SectionType, AbstractSection> sections) {
        this(UUID.randomUUID().toString(), employee, sections);
    }

    public Resume(String uuid, User employee, Map<SectionType, AbstractSection> sections) {
        this.uuid = uuid;
        this.sections = sections;
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Resume resume = (Resume) o;

        return uuid.equals(resume.uuid)
                && sections.equals(resume.sections);

    }

    @Override
    public int hashCode() {
        int result = uuid.hashCode();
        result = 31 * result + sections.hashCode();
        return result;
    }

    public String getUuid() {
        return uuid;
    }

    public User getEmployee() {
        return employee;
    }

    public Map<SectionType, AbstractSection> getSections() {
        return sections;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sections.forEach((type, value) -> sb
                .append(type.getTitle())
                .append(": ")
                .append(value)
                .append("\n"));


        return "Resume\n" +
                "\nuuid='" + uuid + "\'\n" +
                "\nemployee:\n" + employee + '\n' +
                "\n" + sb;
    }
}
