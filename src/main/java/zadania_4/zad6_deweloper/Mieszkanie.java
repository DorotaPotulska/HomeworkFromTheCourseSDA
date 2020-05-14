package zadania_4.zad6_deweloper;

import java.util.Arrays;

/*Mieszkanie ma pola:
        - powierzchnię:double
        - cenę za metr netto:double
        - ilość pokoi: int
        - ilość łazienek : int
        - powierzchnie pomieszczeń: double[]
        - orientacja mieszkania względem słońca (enum SunGeograpgicalLocation)
        [pole mówi od której strony skierowana jest 'główna' ściana mieszkania,
        albo raczej po której stronie budynku znajduje się mieszkanie). (8 kierunków w enumie)
        metody:
        - obliczCeneBrutto():double (za całość mieszkania)
        - obliczCeneZaMetrBrutto():double
        - obliczCeneNetto():double (za całość mieszkania)*/
public class Mieszkanie {
    private double powierzchnia;
    private double cenaZaMetrNetto;
    private int iloscPokoi;
    private int iloscLazienek;
    private double[] powierzchniaPomieszczen;
    private SunGeograpgicalLocation stonaSwiata;

    public Mieszkanie(double powierzchnia, double cenaZaMetrNetto, int iloscPokoi, int iloscLazienek, double[] powierzchniaPomieszczen, SunGeograpgicalLocation stonaSwiata) {
        this.powierzchnia = powierzchnia;
        this.cenaZaMetrNetto = cenaZaMetrNetto;
        this.iloscPokoi = iloscPokoi;
        this.iloscLazienek = iloscLazienek;
        this.powierzchniaPomieszczen = powierzchniaPomieszczen;
        this.stonaSwiata = stonaSwiata;
    }

    public double obliczCeneBrutto(){
        return this.powierzchnia*this.cenaZaMetrNetto*1.23;
    }
    public double obliczCeneZaMetrBrutto(){
        return this.cenaZaMetrNetto*1.23;
    }

    public double obliczCeneNetto(){
        return this.cenaZaMetrNetto*this.powierzchnia;
    }

    @Override
    public String toString() {
        return "Mieszkanie{" +
                "powierzchnia=" + powierzchnia +
                ", cenaZaMetrNetto=" + cenaZaMetrNetto +
                ", iloscPokoi=" + iloscPokoi +
                ", iloscLazienek=" + iloscLazienek +
                ", powierzchniaPomieszczen=" + Arrays.toString(powierzchniaPomieszczen) +
                ", stonaSwiata=" + stonaSwiata +
                '}';
    }
}
