package zadania_4.zad9_wesele;

public class Zaproszenie {
    private String imie;
    private String nazwisko;
    private TypZaproszenia typZaproszenia;

   /* public Zaproszenie(String imie, String nazwisko, TypZaproszenia typZaproszenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.typZaproszenia = typZaproszenia;
    }*/

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setTypZaproszenia(TypZaproszenia typZaproszenia) {
        this.typZaproszenia = typZaproszenia;
    }

    public TypZaproszenia getTypZaproszenia() {
        return typZaproszenia;
    }
}
