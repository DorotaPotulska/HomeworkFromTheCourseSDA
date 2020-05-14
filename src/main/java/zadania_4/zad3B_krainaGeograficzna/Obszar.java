package zadania_4.zad3B_krainaGeograficzna;

public class Obszar {
    private TypObszaru typObszaru;
    private ZakresObszaru zakresObszaru;
    private Wlodarze wlodarze;

    public Obszar(TypObszaru typObszaru, ZakresObszaru zakresObszaru, Wlodarze wlodarze) {
        this.typObszaru = typObszaru;
        this.zakresObszaru = zakresObszaru;
        this.wlodarze = wlodarze;
    }
}
