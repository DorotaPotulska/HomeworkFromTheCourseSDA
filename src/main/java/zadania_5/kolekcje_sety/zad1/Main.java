package zadania_5.kolekcje_sety.zad1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*1. Umieść wszystkie elementy tablicy {​10​,​12​,​10​,​3​,​4​,​12​,​12​,​300​,​12​,​40​,​55​} w zbiorze (HashSet) oraz:

        Konstruktor kopiujący elementy listy do setu: Set<Integer> liczby = ​new ​HashSet<>(Arrays.​asList ​ (​1​, ​2​ … ));
        a. Wypisz liczbę elementów na ekran (metoda size())
        b. Wypisz wszystkie zbioru elementy na ekran (forEach)
        c. Usuń elementy 10 i 12, wykonaj ponownie podpunkty a) i b)
        d. zmień implementacje na TreeSet (zamień HashSet na TreeSet przy tworzeniu instancji kolekcji)*/
public class Main {
    public static void main(String[] args) {
        Set<Integer> liczby= new HashSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));


        System.out.println("Liczba elementów "+liczby.size());

        for (Integer x : liczby) {
            System.out.println(x);
        }

        Set<Integer> liczby2= new TreeSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));


        System.out.println("Liczba elementów "+liczby2.size());

        for (Integer x : liczby2) {
            System.out.println(x);
        }


    }
}
