package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public class Kennistoets {
    public String toetsCode;
    public String naam;
    public List<Vraag> vragen = new ArrayList<>();

    public Kennistoets(String toetsCode, String naam) {
        this.toetsCode = toetsCode;
        this.naam = naam;
    }

    public void voegVraagToe(Vraag vraag) {
        vragen.add(vraag);
    }

    public void startToets(Student student) {
        for(Vraag vraag : vragen) {
            List<String> juisteAntwoorden = new ArrayList<>();
            juisteAntwoorden.addAll(vraag.getAntwoorden());
            String gegevenAntwoord = student.geefAntwoord();
            controleerAntwoord(juisteAntwoorden, gegevenAntwoord);
        }
    }

    private void controleerAntwoord(List<String> juisteAntwoorden, String gegevenAntwoord) {
        for(String juistAntwoord : juisteAntwoorden) {
            if(gegevenAntwoord.equals(juistAntwoord)) {
                //Implement what happens next
            }
        }
    }
}
