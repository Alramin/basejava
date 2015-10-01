package resume.ru.cv;

import java.util.List;

public class Resume {

    private List<resume.ru.cv.BaseEntity> baseentitys;
    private resume.ru.cv.Employee employee;

    public List<BaseEntity> getSections() {
        return baseentitys;
    }

    public void setSections(List<BaseEntity> sections) {
        this.baseentitys = sections;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
