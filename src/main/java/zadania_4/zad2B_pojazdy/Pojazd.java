package zadania_4.zad2B_pojazdy;

public class Pojazd {
    public TypPojazdu typPojazdu;
    public String nazwa;
    public String marka;
    public Element element;

    public Pojazd(TypPojazdu typPojazdu, String nazwa, String marka, Element element) {
        this.typPojazdu = typPojazdu;
        this.nazwa = nazwa;
        this.marka = marka;
        this.element = element;
    }
}
