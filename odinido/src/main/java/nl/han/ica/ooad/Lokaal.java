package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public class Lokaal {

    public String lokaalCode;
    public Kennistoets teHoudenKennistoets;
    public List<Student> aangemeldeStudenten = new ArrayList<>();

    public void openVoorToets(Kennistoets toets) {
        teHoudenKennistoets = toets;
    }

    public void meldAan(Student student) {
        teHoudenKennistoets.startToets(student);
    }

    public String getLokaalCode() {
        return lokaalCode;
    }

    public void setLokaalCode(String lokaalCode) {
        this.lokaalCode = lokaalCode;
    }
}
