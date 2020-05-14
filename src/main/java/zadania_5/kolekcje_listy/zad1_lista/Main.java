package zadania_5.kolekcje_listy.zad1_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*1. Stwórz listę Integerów. Wykonaj zadania:
        - dodaj do listy 5 elementów ze scannera
        - dodaj do listy 5 elementów losowych
        - wypisz elementy Sprawdź działanie aplikacji.*/
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Random rd = new Random();

        List<Integer> lista = new ArrayList<>();
        int i=0;
        do {
            System.out.println("Podaj element:");
            lista.add(in.nextInt());
            i++;
        }while (i<5);
        System.out.println(lista);

        i=0;
        do {
            lista.add(rd.nextInt(25));
            i++;
        }while (i<5);
        System.out.println(lista);

        for(int x:lista){
            System.out.println(x);
        }
    }
}
