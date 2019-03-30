package nl.han.ica.ooad;

import java.util.ArrayList;
import java.util.List;

public class Docent extends Subject{

    public List<Lokaal> lokalen = new ArrayList<>();
    public OdinidoToetsbank toetsbank = new OdinidoToetsbank();;
    public boolean kennistoetsGestart = false;

    public void houdKennistoets(String toetscode, String lokaalcode) {
        Kennistoets toets = toetsbank.selecteerToets(toetscode);
        for(Lokaal lokaal : lokalen) {
            if(lokaal.getLokaalCode().equals(lokaalcode)) {
                lokaal.openVoorToets(toets);
                setKennistoetsGestart(lokaal);
            }
        }
    }

    public void setKennistoetsGestart(Lokaal lokaal) {
        kennistoetsGestart = true;
        this.toetsIsGestart(lokaal);
    }

}
