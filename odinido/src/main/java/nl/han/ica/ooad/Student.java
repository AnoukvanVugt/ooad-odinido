package nl.han.ica.ooad;

public class Student implements Observer {

    public String studentnaam;

    public Student(String studentnaam) {
        this.studentnaam = studentnaam;
    }

    @Override
    public void update(Lokaal lokaal) {
        lokaal.meldAan(this);
    }

    public String geefAntwoord() {

        return("abc");
    }

    public String getStudentnaam() {
        return studentnaam;
    }

}
