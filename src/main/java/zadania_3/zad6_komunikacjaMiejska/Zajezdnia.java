package zadania_3.zad6_komunikacjaMiejska;

import java.util.List;

public class Zajezdnia <T>{

    private String nazwaZajezdni;
    private List<PojazdyKomunikacjiMiejskiej> pojazdyKomunikacjiMiejskiejList;
    private TypZajezdni typZajezdni;

    public Zajezdnia(final String nazwaZajezdni, final List<PojazdyKomunikacjiMiejskiej> pojazdyKomunikacjiMiejskiejList, final TypZajezdni typZajezdni) {
        this.nazwaZajezdni = nazwaZajezdni;
        this.pojazdyKomunikacjiMiejskiejList = pojazdyKomunikacjiMiejskiejList;
        this.typZajezdni = typZajezdni;
    }

    public String getNazwaZajezdni() {
        return nazwaZajezdni;
    }

    public List<PojazdyKomunikacjiMiejskiej> getPojazdyKomunikacjiMiejskiejList() {
        return pojazdyKomunikacjiMiejskiejList;
    }

    public TypZajezdni getTypZajezdni() {
        return typZajezdni;
    }

    @Override
    public String toString() {
        return "Zajezdnia{" +
                "nazwaZajezdni='" + nazwaZajezdni + '\'' +
                ", pojazdyKomunikacjiMiejskiejList=" + pojazdyKomunikacjiMiejskiejList +
                ", typZajezdni=" + typZajezdni +" "+ this.suma()+
                '}';
    }

    public String suma() {
        int sumaZuzyciaPaliwa = 0;
        int sumaWagonow = 0;

        for (int i = 0; i < pojazdyKomunikacjiMiejskiejList.size(); i++) {
            if (pojazdyKomunikacjiMiejskiejList.get(i) instanceof Autobus) {
                sumaZuzyciaPaliwa += ((Autobus) pojazdyKomunikacjiMiejskiejList.get(i)).getIloscLitrowZuzytegoPaliwa();
            } else if (pojazdyKomunikacjiMiejskiejList.get(i) instanceof Tramwaj) {
                // jest obiektem typu Tramwaj
                sumaWagonow += ((Tramwaj) pojazdyKomunikacjiMiejskiejList.get(i)).getIloscWagonow().getIlosc();
            } else {
                System.out.println("Niekompatybilny typ obiektu");
            }
        }
        return  "suma zuzycia paliwa (wszystkie autobusy) = " + sumaZuzyciaPaliwa + ", suma zuzycia paliwa (wszystkie tramwaje) = " + sumaWagonow;

    }
}
