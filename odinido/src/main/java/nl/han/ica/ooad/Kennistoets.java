package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Kennistoets {
    private String toetsCode;
    private String naam;
    private List<Vraag> vragen = new ArrayList<>();
    private float teBehalenPunten;

    Kennistoets(String toetsCode, String naam) {
        this.toetsCode = toetsCode;
        this.naam = naam;
    }

    void voegVraagToe(Vraag vraag) {
        vragen.add(vraag);
    }

    void startToets(String studentnaam) {
        int aantalPunten = 0;
        System.out.println("De toets start nu!");
        for(Vraag vraag : vragen) {
            teBehalenPunten++;
            System.out.println("Vraag: " + vraag.getVraag());
            List<String> juisteAntwoorden = vraag.getAntwoorden();
            String gegevenAntwoord = geefAntwoord();
            aantalPunten += controleerAntwoord(juisteAntwoorden, gegevenAntwoord);
        }
        System.out.println("Dat was de laatste vraag, de toets is nu over!");
        berekenScore(studentnaam, aantalPunten);
    }

    private int controleerAntwoord(List<String> juisteAntwoorden, String gegevenAntwoord) {
        int aantalPunten = 0;
        boolean correct = false;
        for(String juistAntwoord : juisteAntwoorden) {
            if(gegevenAntwoord.equals(juistAntwoord)) {
                aantalPunten++;
                System.out.println("Dat is correct! \n");
                correct = true;
            }
        }
        if(!correct) {
            System.out.println("Dat is niet correct! :( \n\nHet correcte antwoord was: ");
            for(String juistAntwoord : juisteAntwoorden) {
                System.out.println(juistAntwoord + "\n");
                break;
            }
        }
        return aantalPunten;
    }

    String geefAntwoord() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        String gegevenAntwoord = scanner.nextLine();  // Read user input
        System.out.println("\nGegeven antwoord: " + gegevenAntwoord);  // Output user input
        return gegevenAntwoord;
    }

    private void berekenScore(String studentnaam, float behaaldePunten) {
        Score score = new Score(studentnaam);
        score.setScore(Math.round((behaaldePunten/teBehalenPunten)*100));
        System.out.println("Je score is: "  + score.getScore() + "%!");
    }
}
