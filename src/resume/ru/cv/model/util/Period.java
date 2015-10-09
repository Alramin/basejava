package resume.ru.cv.model.util;

import java.time.LocalDate;

public class Period {

    LocalDate start;
    LocalDate end;

    public String getPeriod(){
        return start + " - " + end;
    }
}
