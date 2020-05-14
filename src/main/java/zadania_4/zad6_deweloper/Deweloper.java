package zadania_4.zad6_deweloper;

import java.util.ArrayList;

/* Developer posiada pola:
         - nazwa: String
         - oferty: Budynek[]
         - kapitał zakładowy: double
         - ocena developera: double
         metody:
         - wypiszOfertyBudynków():void (wypisuje opisy budynków w nowych liniach, ale bez opisów mieszkań)
         - wypiszOfertyMieszkań():void (wypisuje opisy budynków w nowych liniach i opisów mieszkań)
         - podajŁącznąWartośćInwestycjiBrutto():double - zwraca sume brutto wartości budynków
         - podajŁącznąWartośćInwestycjiNetto():double - zwraca sume netto wartości budynków*/
public class Deweloper {
    private String nazwa;
    private ArrayList<Budynek> oferty;
    private double kapitalZakladowy;
    private double ocenaDewelopera;

    public void wypiszOfertyBudynków(){

        for(Budynek x:oferty) {
            x.wypiszOfertę();
        }
    }

    public void wypiszOfertyMieszkań(){
        for(Budynek x:oferty) {
            x.wypiszOfertę2();
        }
    }

    public double podajŁącznąWartośćInwestycjiBrutto(){
        double cena = 0.0;
        for (Budynek x : oferty) {
            cena += x.podajŁącznąWartośćBudynkuBrutto();

        }
        return cena;
    }

    public double podajŁącznąWartośćInwestycjiNetto(){
        double cena = 0.0;
        for (Budynek x : oferty) {
            cena += x.podajŁącznąWartośćBudynkuNetto();

        }
        return cena;
    }
}
