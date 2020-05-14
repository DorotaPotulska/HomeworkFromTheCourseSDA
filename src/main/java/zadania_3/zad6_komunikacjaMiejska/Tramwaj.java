package zadania_3.zad6_komunikacjaMiejska;

public class Tramwaj extends PojazdyKomunikacjiMiejskiej{

    private IloscWagonow iloscWagonow;

    public Tramwaj(final Integer predkoscMaxNaH, final Integer numerPojazdu, final IloscWagonow iloscWagonow) {
        super(predkoscMaxNaH, numerPojazdu);
        this.iloscWagonow = iloscWagonow;
    }

    public IloscWagonow getIloscWagonow() {
        return iloscWagonow;
    }

    @Override
    public String toString() {
        return "Tramwaj{" +
                "iloscWagonow=" + iloscWagonow +
                ", numerPojazdu=" + numerPojazdu +
                ", predkoscMaxNaH=" + predkoscMaxNaH +
                '}';
    }
}
