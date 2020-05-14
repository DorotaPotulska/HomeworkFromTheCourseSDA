package zadania_2.klasy_metody.zad4;

import java.util.Arrays;
import java.util.Scanner;

/*4. Utworzenie klasy, opisującej statystyki dla tablicy typu liczbowego
        a. Utworzenie 2 metod:
        i. Psvm
            1. Zadeklarowana na sztywno tablica z wartościami początkowymi
            np. int[] tablica = new int[]{2,5,1,-3,5,22,21,66,21,54}
            2. Przesłanie tablicy do metody drukujOpisTablicy

        ii. drukujOpisTablicy

            1. Metoda drukuje następujące parametry:
                a. Minimalna wartość w tablicy
                b. Maksymalna wartość w tablicy
                c. Średnia wartość tablicy
                d. Ilość Elementów
            2. Dla w/w przykładu oczekujemy poniższego tekstu:
                Min wartość: -3
                Max wartość: 66
                Średnia wartość: 19.4
                Ilość elementów: 10


        b. Rozszerzenie o podawanie tablicy z palca przez użytkownika (pętla for) –
        np. iloelementową tablicę chcesz utworzyć? Pobrać wartość i zadeklarować tablicę,
        która następnie można uzupełnić w pętli for
        c. Po wypisaniu podsumowania tablicy zapytać użytkownika czy chce kontynuować (tak/nie)
        – jeśli tak ponownie wczytać i wyświetlić parametry tablicy
        d. Jeśli użytkownik poda wartość spoza zakresu zadać pytanie ponownie
        i wyświetlić tekst: „Podano nieprawidłową odpowiedź, proszę wpisać ‘tak’ lub ‘nie’. */
public class zad4 {
/*    public static void main(String[] args) {
        int[] tablica=new int[]{2,5,1,-3,5,22,21,66,21,54};
        drukujOpisTablicy(tablica);
    }

    public static void drukujOpisTablicy(int[] tablica){
        Arrays.sort(tablica);
        System.out.println("Min wartość: "+ tablica[0]);
        System.out.println("Max wartość: "+ tablica[tablica.length-1]);

        int suma=0;

        for(int i=0;i<tablica.length;i++){
            suma+=tablica[i];
        }
        System.out.println("Srednia wartość: "+(suma/tablica.length));
        System.out.println("Ilosc elementów tablicy: "+ tablica.length);


    }*/

    public static void main(String[] args) {
        int opcja=1;
        do {
            System.out.println("Podaj ilosc elementów tablicy: ");
            int ilosc = wczytaLiczbe();

            int[] tablica = new int[ilosc];
            for (int i = 0; i < ilosc; i++) {
                System.out.println("Podaj wartosc " + (i + 1) + " elementu tablicy");
                tablica[i] = wczytaLiczbe();
            }
            drukujOpisTablicy(tablica);


            System.out.println("Czy chcesz kontynuowac:");
            System.out.println("Tak - wpisz 1");
            System.out.println("Nie - wpisz 2");
            opcja = wczytaLiczbe();

            while(opcja!=1 && opcja!=2){
                System.out.println("Podano nieprawidłową odpowiedz. Proszę wpisać 1- tak lub 2 - nie");
                opcja=wczytaLiczbe();
            }
        }while(opcja==1);
    }

    public static void drukujOpisTablicy(int[] tablica){
        Arrays.sort(tablica);
        System.out.println("Min wartość: "+ tablica[0]);
        System.out.println("Max wartość: "+ tablica[tablica.length-1]);

        int suma=0;

        for(int i=0;i<tablica.length;i++){
            suma+=tablica[i];
        }
        System.out.println("Srednia wartość: "+(suma/tablica.length));
        System.out.println("Ilosc elementów tablicy: "+ tablica.length);


    }

    public static int wczytaLiczbe(){
        Scanner in =new Scanner(System.in);
        return in.nextInt();
    }
}
