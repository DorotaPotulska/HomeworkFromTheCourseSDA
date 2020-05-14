package zadania_3.zad6_komunikacjaMiejska;

public class Autobus extends PojazdyKomunikacjiMiejskiej {

    protected int iloscLitrowZuzytegoPaliwa;

    public Autobus(final Integer predkoscMaxNaH, final Integer numerPojazdu, final int iloscLitrowZuzytegoPaliwa) {
        super(predkoscMaxNaH, numerPojazdu);
        this.iloscLitrowZuzytegoPaliwa = iloscLitrowZuzytegoPaliwa;
    }

    public int getIloscLitrowZuzytegoPaliwa() {
        return iloscLitrowZuzytegoPaliwa;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "iloscLitrowZuzytegoPaliwa=" + iloscLitrowZuzytegoPaliwa +
                ", numerPojazdu=" + numerPojazdu +
                ", predkoscMaxNaH=" + predkoscMaxNaH +
                '}';
    }
}
