package nl.han.ica.ooad;

public class MeerkeuzeAntwoord {
    String alternatief;
    boolean juisteAntwoord;

    public MeerkeuzeAntwoord(String alternatief, boolean juisteAntwoord) {
        this.alternatief = alternatief;
        this.juisteAntwoord = juisteAntwoord;
    }

    public String getAlternatief() {
        return alternatief;
    }
}
