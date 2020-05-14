package zadania_2.klasa_obiekt_Zrobic.zad5;

import java.util.Scanner;

public class ParsowanieOpcji {

    public void parsowanieOpcji(CentrumKonferencyjne centrumKonferencyjne) {
        int option;
        int iloscMiejsc;

        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Wybierz opcję: ");
            System.out.println("1 - Listuj ");
            System.out.println("2 - Listuj wolne sale");
            System.out.println("3 - Znajdz najtańszą sale");
            System.out.println("4 - Znajdz najtańszą sale z określoną ilością miejsc");
            System.out.println("5 - Zarezerwuj salę");
            System.out.println("6 - Zwolnij sale");
            System.out.println("7 - Wypisz stan sali");
            System.out.println("8 - Quit");
            option = in.nextInt();

            switch (option) {
                case 1:
                    centrumKonferencyjne.wylistujWszystkieSale();
                    break;
                case 2:
                    centrumKonferencyjne.wylistujWolneSale();
                    break;
                case 3:
                    System.out.println(centrumKonferencyjne.znajdzNajtanszaSale());
                    break;
                case 4:
                    System.out.println("Podaj ilość potrzebnych miejsc");
                    iloscMiejsc=in.nextInt();
                    System.out.println(centrumKonferencyjne.znajdzNajtanszaSale(iloscMiejsc));
                    break;
                case 5:
                    if(centrumKonferencyjne.zarezerwujSale(pobierzNumerSali())==true){
                        System.out.println("Sala została zarezerwowana");
                    }else{
                        System.out.println("Sala jest juz zajęta, nie udało się jej zarezerwować");
                    };
                    break;
                case 6:
                    if(centrumKonferencyjne.zwolnijSale(pobierzNumerSali())==true){
                        System.out.println("Sala została zwolniona");
                    }else {
                        System.out.println("Sala nie była zajęta");
                    };
                    break;
                case 7:
                    centrumKonferencyjne.wypiszStanSali(pobierzNumerSali());
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Podano błedną wartość");

            }

        } while (option != 8);
    }

    private int pobierzNumerSali(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj numer sali");
        int numerSali= in.nextInt();
        return numerSali;
    }


}
