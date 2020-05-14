package zadania_4.zad2A_pomieszczenia;

public class Pomieszczenie {
    public TypPomieszczenia typPomieszczenia;
    public TypUrzadzenia urzadzenie;
    public TypMebli mebel;

    public Pomieszczenie(TypPomieszczenia typPomieszczenia, TypUrzadzenia urzadzenie, TypMebli mebel) {
        this.typPomieszczenia = typPomieszczenia;
        this.urzadzenie = urzadzenie;
        this.mebel = mebel;
    }
}
