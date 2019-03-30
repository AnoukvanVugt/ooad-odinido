package nl.han.ica.ooad;

/**
 * Hello world!
 *
 */
public class App 
{

    public static Docent docent = new Docent();
    public static Observer student = new Student("Anna");
    public static Lokaal lokaal = new Lokaal();

    public static void main( String[] args )
    {
        lokaal.setLokaalCode("Lokaal1");
        docent.lokalen.add(lokaal);

        docent.ditIsMijnLeerling(student);

        docent.houdKennistoets("ODI23644129", "Lokaal1");
    }
}
