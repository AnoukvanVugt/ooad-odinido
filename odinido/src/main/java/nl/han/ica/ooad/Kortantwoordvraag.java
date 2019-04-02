package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public class Kortantwoordvraag implements Vraag {

    private String vraag;
    private List<KortAntwoord> antwoorden = new ArrayList<>();

    Kortantwoordvraag(String vraag) {
        this.vraag = vraag;
    }

    void voegAntwoordToe(String antwoord) {
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

    @Override
    public String getVraag() {
        return vraag;
    }
}
