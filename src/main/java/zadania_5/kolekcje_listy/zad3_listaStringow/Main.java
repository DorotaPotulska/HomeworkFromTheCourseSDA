package zadania_5.kolekcje_listy.zad3_listaStringow;

import java.util.ArrayList;
import java.util.Arrays;

/*3.  Stwórz oddzielnego maina, a w nim kolejną listę ​String'ów​. Wykonaj zadania:
        - dodaj do listy elementy 10030, 3004, 4000, 12355, 12222, 67888, 111200, 225355, 2222, 1111,
        3546, 138751, 235912 (jako stringi) (dodaj je posługując się metodą Arrays.asList())

        Przykład użycia Arrays.asList():
        ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(23, 32, 44, 55, 677, 11, 33));
Podany przykład to tylko demonstracja metody Arrays.asList, zadanie należy wykonać na liście String’ów.

        - określ indeks elementu 138751 posługując się metodą indexOf
        - sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)
        - sprawdź czy istnieje na liście obiekkt 67889 metodą contains (wynik wypisz na ekran)
        - usuń z listy obiekt 67888 oraz 67889 (metoda remove)
        - wykonaj ponownie powyższe sprawdzenia.
        - iteruj całą listę, wypisz elementy na ekran (a. w jednej linii, b. każdy element w oddzielnej linii).
        Sprawdź działanie aplikacji.*/
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaStringow = new ArrayList<>(Arrays.asList("10030", "3004", "4000", "12355", "12222", "67888",
                "111200", "225355", "2222", "1111", "3546", "138751", "235912"));

        System.out.println("Indeks elsmentu 138751 wynosi "+ listaStringow.indexOf("138751"));

        System.out.println("Czy lista zawiera element 67888? "+listaStringow.contains("67888"));
        System.out.println("Czy lista zawiera element 67889? "+listaStringow.contains("67889"));

        listaStringow.remove("67888");
        listaStringow.remove("67889");
        System.out.println("Czy lista zawiera element 67888? "+listaStringow.contains("67888"));
        System.out.println("Czy lista zawiera element 67889? "+listaStringow.contains("67889"));

        for(String x:listaStringow){
            System.out.print(x+" ");
        }

        for(String x:listaStringow){
            System.out.println(x);
        }

    }
}
