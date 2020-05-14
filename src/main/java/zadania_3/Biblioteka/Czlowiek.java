package zadania_3.Biblioteka;

public abstract class Czlowiek {

    protected String imie;
    protected String nazwisko;
    protected String dataUrodzenia;
    protected String dataSmierci;
    protected long pesel;
    protected char plec;

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }


}
