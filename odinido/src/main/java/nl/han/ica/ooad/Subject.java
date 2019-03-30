package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    public List<Observer> studenten = new ArrayList<>();

    void ditIsMijnLeerling(Observer student) {
        studenten.add(student);
    }

    void toetsIsGestart(Lokaal lokaal) {
        for(Observer student : studenten) {
            student.update(lokaal);
        }
    }
}
