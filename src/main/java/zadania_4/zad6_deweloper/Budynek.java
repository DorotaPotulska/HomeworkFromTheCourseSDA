package zadania_4.zad6_deweloper;

import java.util.ArrayList;

/*       Klasa Budynek posiada pola:
               - nazwa osiedla: String
               - ilość ofert: int
               - adres/lokalizacja: string
               - etap budowy: int
               - planowana data 'oddania': int (rok)
               - planowana data 'oddania': int (kwartał)
               - dystans do centrum: double (w km)
               - etap osiedla: int
               - oferty mieszkań: Mieszkanie[]
               metody:
               - podajŁącznąWartośćBudynkuBrutto():double (cene brutto)
               - podajŁącznąWartośćBudynkuNetto():double (cene netto)
               - wypiszOfertę():void (wypisz opis budynku wraz z jego parametrami, ale bez mieszkań.*/
public class Budynek extends Mieszkanie {

    private String nazwaOsiedla;
    private int iloscOfert;
    private String adresLokalizacja;
    private int etapBudowy;
    private int planowanyRokOddania;
    private int planowanyKwartalOddania;
    private double dystansDoCentrum; // w km
    private int etapOsiedla;
    private ArrayList<Mieszkanie> mieszkania;

    public Budynek(double powierzchnia, double cenaZaMetrNetto, int iloscPokoi, int iloscLazienek, double[] powierzchniaPomieszczen, SunGeograpgicalLocation stonaSwiata, String nazwaOsiedla, int iloscOfert, String adresLokalizacja, int etapBudowy, int planowanyRokOddania, int planowanyKwartalOddania, double dystansDoCentrum, int etapOsiedla, ArrayList<Mieszkanie> mieszkania) {
        super(powierzchnia, cenaZaMetrNetto, iloscPokoi, iloscLazienek, powierzchniaPomieszczen, stonaSwiata);
        this.nazwaOsiedla = nazwaOsiedla;
        this.iloscOfert = iloscOfert;
        this.adresLokalizacja = adresLokalizacja;
        this.etapBudowy = etapBudowy;
        this.planowanyRokOddania = planowanyRokOddania;
        this.planowanyKwartalOddania = planowanyKwartalOddania;
        this.dystansDoCentrum = dystansDoCentrum;
        this.etapOsiedla = etapOsiedla;
        this.mieszkania = mieszkania;
    }

    public double podajŁącznąWartośćBudynkuBrutto() {
        double cena = 0.0;
        for (Mieszkanie x : mieszkania) {
            cena += x.obliczCeneBrutto();

        }
        return cena;
    }


    public double podajŁącznąWartośćBudynkuNetto() {
        double cena = 0.0;
        for (Mieszkanie x : mieszkania) {
            cena += x.obliczCeneNetto();

        }
        return cena;
    }


    public void wypiszOfertę() {
        System.out.println("Budynek{" +
                "nazwaOsiedla='" + nazwaOsiedla + '\'' +
                ", iloscOfert=" + iloscOfert +
                ", adresLokalizacja='" + adresLokalizacja + '\'' +
                ", etapBudowy=" + etapBudowy +
                ", planowanyRokOddania=" + planowanyRokOddania +
                ", planowanyKwartalOddania=" + planowanyKwartalOddania +
                ", dystansDoCentrum=" + dystansDoCentrum +
                ", etapOsiedla=" + etapOsiedla +
                '}');
    }

    public void wypiszOfertę2() {
        System.out.println("Budynek{" +
                "nazwaOsiedla='" + nazwaOsiedla + '\'' +
                ", iloscOfert=" + iloscOfert +
                ", adresLokalizacja='" + adresLokalizacja + '\'' +
                ", etapBudowy=" + etapBudowy +
                ", planowanyRokOddania=" + planowanyRokOddania +
                ", planowanyKwartalOddania=" + planowanyKwartalOddania +
                ", dystansDoCentrum=" + dystansDoCentrum +
                ", etapOsiedla=" + etapOsiedla +
                ", mieszkania=" + mieszkania +
                '}');
    }

}



