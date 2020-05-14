package zadania_6.objektowosc.zad3;

import java.time.LocalTime;

public class Zgłoszenie {

    protected TypZgloszenia typ;
    protected String tresc;
    protected LocalTime czas;

    public Zgłoszenie(final TypZgloszenia typ, final String tresc, final LocalTime czas) {
        this.typ = typ;
        this.tresc = tresc;
        this.czas = czas;
    }
}
