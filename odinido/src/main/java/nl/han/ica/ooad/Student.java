package nl.han.ica.ooad;

public class Student implements Observer {

    private String studentnaam;

    Student(String studentnaam) {
        this.studentnaam = studentnaam;
    }

    @Override
    public void update(Lokaal lokaal) {
        lokaal.meldAan(studentnaam);
    }

}
