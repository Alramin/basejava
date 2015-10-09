package resume.ru.cv.model;

import resume.ru.cv.AbstractSection;

import java.util.List;
import java.util.UUID;


public class Resume {

    private final String uuid;
    private final Employe employe;
   // private final Map<Section, AbstractSection> sections;

    private final List<AbstractSection> sections;

    public Resume(Employe employe, List<AbstractSection> sections)
    {
        this(UUID.randomUUID().toString(), employe, sections);
    }

    public Resume(String uuid, Employe employe, List<AbstractSection> sections) {
        this.uuid = uuid;
        this.employe = employe;
        this.sections = sections;
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

    public Employe getEmployee() {
        return employe;
    }

    public List<AbstractSection> getSections() {
        return sections;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "uuid='" + uuid + '\'' +
                ", employe=" + employe +
                ", sections=" + sections +
                '}';
    }




}
