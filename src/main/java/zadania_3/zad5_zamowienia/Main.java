package zadania_3.zad5_zamowienia;
/*
Zadanie 5
        Napisać program do obsługi zamówień.
        Program powinien składać się z klas Zamowienie oraz Pozycja.
        Zamowienie ma pole pozycje (Pozycje[]),
        maksRozmiar oraz konstruktor(maxRozmiar) i konstruktor bezargumentowy (gdzie maksRozmiar=10),
         a także metody dodajPozycje(Pozycja) i obliczWartosc():double, toString() zwraca spis pozycji zamówienia.
        Pozycja posiada 3 pola: nazwaTowaru, iloscSztuk, cenaSztuki, oraz metody: obliczWartosc() i toString().
        Przykładowy wynik działania programu:

        Zamówienie:
        Chleb        2.00 zł        2 szt.         4.00 zł
        Banany        6.00zł        1 szt.        6.00 zł
        Razem: 10.00 zł

*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pozycja> pozycje= new ArrayList<>(10);

        pozycje.add(0,new Pozycja("Chleb",2,3));
        pozycje.add(0,new Pozycja("Banany",1,6));
        pozycje.add(0,new Pozycja("Ser",3,9));

        Zamowienie zamowienie = new Zamowienie(pozycje);
        //System.out.println(pozycje);
        System.out.println(zamowienie);

    }
}
