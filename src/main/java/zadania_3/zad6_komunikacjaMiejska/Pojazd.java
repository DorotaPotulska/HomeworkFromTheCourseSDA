package zadania_3.zad6_komunikacjaMiejska;

public class Pojazd {
    protected Integer predkoscMaxNaH;

    public Pojazd(final Integer predkoscMaxNaH) {
        this.predkoscMaxNaH = predkoscMaxNaH;
    }

    public Integer getPredkoscMaxNaH() {
        return predkoscMaxNaH;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "predkoscMaxNaH=" + predkoscMaxNaH +
                '}';
    }
}
