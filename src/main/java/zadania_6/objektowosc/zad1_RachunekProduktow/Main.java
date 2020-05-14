package zadania_6.objektowosc.zad1_RachunekProduktow;
/*
Zadanie 1:
        Stworzymy koszyk zakupowy z produktami. Nasz koszyk będzie przechowywał zamówienie
        które możemy złożyć w pizzerii lub restauracji (lub sklepie).

        Stwórz enum PodatekProduktu i dodaj wartości:
        VAT8
        VAT23
        VAT5
        NO_VAT

        Stwórz klasę Produkt. Dodaj w niej pola:
        - nazwa produktu
        - cena produktu (netto)
        - ilość podatku (PodatekProduktu)

        Dodaj w klasie produkt metody:
        - gettery oraz settery do wszystkich pól
        - metodę podajCeneBrutto():double - która oblicza cenę brutto na podstawie ceny netto i nałożonego podatku

        Stwórz klasę Rachunek który jako pola posiada:
        - listę zakupionych produktów

        Dodaj w klasie Rachunek metody:
        - getter do listy zakupionych produktów
        - metodę dodajProdukt(Produkt):void - która dodaje produkt podany w parametrze (metoda niezbędna do testowania aplikacji z Main’a.
        - wypiszRachunek():void - metoda która wypisuje do konsoli wszystkie produkty z listy jeden pod drugim.
        - podsumujRachunekNetto():double - która oblicza sumę cen netto i ZWRACA tą wartość
        - podsumujRachunekBrutto():double - która oblicza sumę cen brutto i ZWRACA tą wartość
        - zwróćWartośćPodatku():double - która ZWRACA różnicę między cenami netto i brutto

        Dodatkowe:
        ** - stwórz metodę która zwróci informację o tym ile kosztowałyby wszystkie produkty gdyby posiadały podatek 8%, oraz gdyby posiadały podatek 23%.


        Wskazówka: do enuma dodaj wartość liczbową reprezentującą wartość (procentowo) podatku.
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produkt pizza1 = new Produkt("margerita",10.0,PodatekProduktu.VAT23);
        Produkt pizza2 = new Produkt("wiejska",20.0,PodatekProduktu.VAT5);
        Produkt pizza3 = new Produkt("grecka",30.0,PodatekProduktu.VAT8);

        Rachunek rachunek= new Rachunek(new ArrayList<>());

        rachunek.wypiszRachunek();
        rachunek.dodajProdukt(pizza1);
        rachunek.wypiszRachunek();
        rachunek.dodajProdukt(pizza2);
        rachunek.dodajProdukt(pizza3);
        System.out.println("------------------");
        rachunek.wypiszRachunek();
        System.out.println("------------------");
        System.out.println("Suma cen netto : "+ rachunek.podsumujRachunekNetto());
        System.out.println("------------------");
        System.out.println("Suma cen brutto: "+ rachunek.podsumujRachunekBrutto());
        System.out.println("------------------");
        System.out.println("Wartość podatku: "+ rachunek.zwrocWartoscPodatku());
        System.out.println("------------------");
        rachunek.cenaVat8OrazVat23();
    }
}
