package nl.han.ica.ooad;

class MeerkeuzeAntwoord {
    private String alternatief;
    boolean juisteAntwoord;

    MeerkeuzeAntwoord(String alternatief, boolean juisteAntwoord) {
        this.alternatief = alternatief;
        this.juisteAntwoord = juisteAntwoord;
    }

    String getAlternatief() {
        return alternatief;
    }
}
