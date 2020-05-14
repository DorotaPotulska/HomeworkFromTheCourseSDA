package zadania_5.kolekcje_listy.zad4_listaStringow;

import java.util.ArrayList;
import java.util.Random;

/*4.  Stwórz oddzielnego maina, a w nim kolejną listę String'ów.
        Wykonaj zadania:
        - dodaj do listy losowe 100 elementów z zakresu 0-100. (​konwersja int na string to String.valueOf())
        - oblicz średnią liczb
        - usuń wszystkie liczby powyżej średniej
        - wypisz wszystkie liczby
        - wykonaj kopię listy do tablicy

        Sprawdź działanie aplikacji.*/
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaStringow = new ArrayList<>();
        Random rd = new Random();

        for(int i =0; i<100; i++){
            listaStringow.add(String.valueOf(rd.nextInt(100)));
        }

        System.out.println(listaStringow);
        System.out.println(listaStringow.size());
        int liczba;
        int suma=0;
        int srednia;
        for(String x:listaStringow){
            liczba =Integer.valueOf(x);
            suma+=liczba;

        }
        srednia=suma/listaStringow.size();
        System.out.println("Srednia wynosi "+srednia);

        for(int i =0; i<listaStringow.size();i++){
            if(Integer.valueOf(listaStringow.get(i))>srednia){
                listaStringow.remove(listaStringow.get(i));
                i=0;
            }
        }

        System.out.println(listaStringow);

        String[] tabStringow = new String[listaStringow.size()];

        for(int j=0; j<listaStringow.size();j++){
            tabStringow[j]=listaStringow.get(j);
        }

        for(String x:tabStringow){
            System.out.println(x);
        }
    }
}
