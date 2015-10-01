package resume.ru.cv.entitys.util;

import java.time.LocalDate;

public class Period {

    LocalDate start;
    LocalDate end;

    public String getPeriod(){
        return start + " - " + end;
    }
}
