package zadania_6.objektowosc.zad2;

import java.time.LocalTime;

public class Klient {
    protected String imie;
    protected LocalTime czasPrzybycia;
    protected boolean czyJestPriorytetem;

    public Klient(final String imie, final LocalTime czasPrzybycia, final boolean czyJestPriorytetem) {
        this.imie = imie;
        this.czasPrzybycia = LocalTime.now();
        this.czyJestPriorytetem = czyJestPriorytetem;
    }
}

