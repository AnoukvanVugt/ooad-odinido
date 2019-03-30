package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public class Kortantwoordvraag implements Vraag {

    public String vraag;
    public List<KortAntwoord> antwoorden = new ArrayList<>();

    public Kortantwoordvraag(String vraag) {
        this.vraag = vraag;
    }

    public void voegAntwoordToe(String antwoord) {
        antwoorden.add(new KortAntwoord(antwoord));
    }

    @Override
    public List<String> getAntwoorden() {
        List<String> antwoordenAsStrings = new ArrayList<>();
        for(KortAntwoord antwoord : antwoorden) {
            antwoordenAsStrings.add(antwoord.getAntwoord());
        }
        return antwoordenAsStrings;
    }
}
