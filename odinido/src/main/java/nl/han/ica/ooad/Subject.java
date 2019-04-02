package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {

    private List<Observer> studenten = new ArrayList<>();

    void ditIsMijnLeerling(Observer student) {
        studenten.add(student);
    }

    void toetsIsGestart(Lokaal lokaal) {
        for(Observer student : studenten) {
            student.update(lokaal);
        }
    }
}
