package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public class Meerkeuzevraag implements Vraag {
    private String vraag;
    private List<MeerkeuzeAntwoord> antwoorden = new ArrayList<>();

    Meerkeuzevraag(String vraag) {
        this.vraag = vraag;
    }

    void voegAlternatiefToe(String alternatief, boolean juisteAntwoord) {
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

    @Override
    public String getVraag() {
        String alternatieven = "";
        int i = 1;
        for(MeerkeuzeAntwoord antwoord : antwoorden) {
            alternatieven += i + ". " + antwoord.getAlternatief() + "\n";
            i++;
        }
        return vraag + "\n" + alternatieven;
    }
}
