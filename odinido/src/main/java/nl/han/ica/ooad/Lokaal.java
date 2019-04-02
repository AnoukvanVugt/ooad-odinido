package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public class Lokaal {

    private String lokaalCode;
    private Kennistoets teHoudenKennistoets;
    public List<Student> aangemeldeStudenten = new ArrayList<>();

    void openVoorToets(Kennistoets toets) {
        teHoudenKennistoets = toets;
    }

    void meldAan(String studentnaam) {
        teHoudenKennistoets.startToets(studentnaam);
    }

    String getLokaalCode() {
        return lokaalCode;
    }

    void setLokaalCode(String lokaalCode) {
        this.lokaalCode = lokaalCode;
    }
}
