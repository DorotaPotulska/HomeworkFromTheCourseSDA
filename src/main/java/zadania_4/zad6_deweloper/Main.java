package zadania_4.zad6_deweloper;
/*
quitZadanie 6:
        Stwórz klasę Developer (budowalny). Developer ma (pole) Oferty (tablica budynków).
        Oferta to Budynek. Budynki mają Mieszkania (tablica mieszkań).

        Mieszkanie ma pola:
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
        - obliczCeneNetto():double (za całość mieszkania)

        Klasa Budynek posiada pola:
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
        - wypiszOfertę():void (wypisz opis budynku wraz z jego parametrami, ale bez mieszkań.

        Developer posiada pola:
        - nazwa: String
        - oferty: Budynek[]
        - kapitał zakładowy: double
        - ocena developera: double
        metody:
        - wypiszOfertyBudynków():void (wypisuje opisy budynków w nowych liniach, ale bez opisów mieszkań)
        - wypiszOfertyMieszkań():void (wypisuje opisy budynków w nowych liniach i opisów mieszkań)
        - podajŁącznąWartośćInwestycjiBrutto():double - zwraca sume brutto wartości budynków
        - podajŁącznąWartośćInwestycjiNetto():double - zwraca sume netto wartości budynków
*/

public class Main {
    public static void main(String[] args) {



    }
}
