package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public class Meerkeuzevraag implements Vraag {
    public String vraag;
    public List<MeerkeuzeAntwoord> antwoorden = new ArrayList<>();

    public Meerkeuzevraag(String vraag) {
        this.vraag = vraag;
    }

    public void voegAlternatiefToe(String alternatief, boolean juisteAntwoord) {
        antwoorden.add(new MeerkeuzeAntwoord(alternatief, juisteAntwoord));
    }

    @Override
    public List<String> getAntwoorden() {
        List<String> antwoordenAsString = new ArrayList<>();
        for(MeerkeuzeAntwoord antwoord : antwoorden) {
            if(antwoord.juisteAntwoord) {
                antwoordenAsString.add(antwoord.getAlternatief());
            }
        }
        return antwoordenAsString;
    }
}
