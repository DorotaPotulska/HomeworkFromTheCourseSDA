package zadania_2.klasa_obiekt_Zrobic.zad5;
/*
5.
        Stwórz klasę SalaKonferencyjna która posiada pola:
        numerSali
        stanSali (wolna/zajęta)
        pojemnośćSali (ile ma miejsc)
        cenaSali

        Stwórz klasę CentrumKonferencyjne które posiada jako pola:
        stanCentrum (otwarte/zamknięte - enum lub boolean)
        saleKonferencyjne - lista obiektów typu 'SalaKonferencyjna'

        - stwórz metodę 'dodajSalęKonferencyjną(SalaKonferencyjna):boolean' która dodaje podaną
        w parametrze salę do listy, a następnie zwraca true jeśli się udało, lub false jeśli się nie udało.
        Dodanie sali może się nie udać jeśli w liście istnieje już sala o podanym numerze.
        Stwórz instancję CentrumKonferencyjne oraz dodaj do Centrum kilka sal konferencyjnych.
*/

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        SalaKonferencyjna salaKonferencyjna1 = new SalaKonferencyjna(10,true,12,20.0);
        SalaKonferencyjna salaKonferencyjna2 = new SalaKonferencyjna(12,false,20,30.0);
        SalaKonferencyjna salaKonferencyjna3 = new SalaKonferencyjna(15,false,30,30.0);
        SalaKonferencyjna salaKonferencyjna4 = new SalaKonferencyjna(16,true,30,40.0);
        SalaKonferencyjna salaKonferencyjna5 = new SalaKonferencyjna(17,false,30,20.0);
        SalaKonferencyjna salaKonferencyjna6 = new SalaKonferencyjna(13,true,30,30.0);

        List<SalaKonferencyjna>salaKonferencyjna = new ArrayList<>();
        salaKonferencyjna.add(salaKonferencyjna1);
        salaKonferencyjna.add(salaKonferencyjna2);
        salaKonferencyjna.add(salaKonferencyjna3);
        salaKonferencyjna.add(salaKonferencyjna4);
        salaKonferencyjna.add(salaKonferencyjna5);
        salaKonferencyjna.add(salaKonferencyjna6);

        CentrumKonferencyjne centrumKonferencyjne = new CentrumKonferencyjne(StanCentrum.OTWARTE,salaKonferencyjna);

        SalaKonferencyjna salaKonferencyjna7 = new SalaKonferencyjna(33,false,20,5.0);

        System.out.println(centrumKonferencyjne.dodajSaleKonferencyjna(salaKonferencyjna7));

        SalaKonferencyjna salaKonferencyjna8 = new SalaKonferencyjna(17,false,30,30.0);

        System.out.println(centrumKonferencyjne.dodajSaleKonferencyjna(salaKonferencyjna8));

        centrumKonferencyjne.wylistujWszystkieSale();
        System.out.println("Najtańsza sala z odpowiednią ilosćią miejsc: ");
        System.out.println(centrumKonferencyjne.znajdzNajtanszaSale(30));

        System.out.println("Najtańsza sala: ");
        System.out.println(centrumKonferencyjne.znajdzNajtanszaSale());

        System.out.println("Rezerwacja sali 13- zajętej : ");
        System.out.println(centrumKonferencyjne.zarezerwujSale(13));

        System.out.println("Rezerwacja sali 33- wolnej: ");
        System.out.println(centrumKonferencyjne.zarezerwujSale(33));

        centrumKonferencyjne.wylistujWszystkieSale();
        System.out.println("------------------------------------------");
        System.out.println("Wolne sale:");
        centrumKonferencyjne.wylistujWolneSale();
        System.out.println("------------------------------------------");
        System.out.println("Zwalniam sale 13");
        System.out.println(centrumKonferencyjne.zwolnijSale(13));
        System.out.println("Zwalniam sale 17");
        System.out.println(centrumKonferencyjne.zwolnijSale(17));
        centrumKonferencyjne.wylistujWszystkieSale();

        System.out.println("------------------------------------------");
        System.out.println("Wypisuje stan sali nr 10");
        centrumKonferencyjne.wypiszStanSali(10);


        ParsowanieOpcji parsowanieOpcji= new ParsowanieOpcji();

        parsowanieOpcji.parsowanieOpcji(centrumKonferencyjne);


    }

}
