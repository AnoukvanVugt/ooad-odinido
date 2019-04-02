package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

class Docent extends Subject{

    List<Lokaal> lokalen = new ArrayList<>();
    private OdinidoToetsbank toetsbank = new OdinidoToetsbank();;
    private boolean kennistoetsGestart = false;

    void houdKennistoets(String toetscode, String lokaalcode) {
        Kennistoets toets = toetsbank.selecteerToets(toetscode);
        for(Lokaal lokaal : lokalen)
            if (lokaal.getLokaalCode().equals(lokaalcode)) {
                lokaal.openVoorToets(toets);
                setKennistoetsGestart(lokaal);
            }
    }

    private void setKennistoetsGestart(Lokaal lokaal) {
        kennistoetsGestart = true;
        this.toetsIsGestart(lokaal);
    }

}
