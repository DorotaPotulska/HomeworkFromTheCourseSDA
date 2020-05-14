package zadania_3.zad6_komunikacjaMiejska;

public class PojazdyKomunikacjiMiejskiej extends Pojazd {

    protected Integer numerPojazdu;



    public PojazdyKomunikacjiMiejskiej(final Integer predkoscMaxNaH, final Integer numerPojazdu) {
        super(predkoscMaxNaH);
        this.numerPojazdu = numerPojazdu;
    }

    public Integer getNumerPojazdu() {
        return numerPojazdu;
    }

    @Override
    public String toString() {
        return "PojazdyKomunikacjiMiejskiej{" +
                "numerPojazdu=" + numerPojazdu +
                ", predkoscMaxNaH=" + predkoscMaxNaH +
                '}';
    }
}
