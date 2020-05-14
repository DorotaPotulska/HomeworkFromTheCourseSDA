package zadania_1.petle;

import java.util.Scanner;

/*8. *Napisać program, który pobiera od użytkownika ciąg liczb całkowitych.
        Pobieranie danych kończone jest podaniem wartości 0 (nie wliczana do danych).
        W następnej            kolejności program powinien wyświetlić sumę największej oraz
        najmniejszej z         podanych liczb oraz ich średnią arytmetyczną.
        a. Spróbuj zadanie zrealizować z tablicą oraz bez tablicy
        b. Pamiętaj! ​Czytaj liczby tak długo aż wczytana liczba nie jest 0!.*/
public class zad8 {
   /* public static void main(String[] args) {
        int liczba;
        int maxLiczba=0;
        int minLiczba=0;
        Scanner podanaLiczba=new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        liczba=podanaLiczba.nextInt();
        maxLiczba=liczba;
        minLiczba=liczba;
        if (liczba!=0) {
            while (liczba != 0) {
                System.out.println("Podaj liczbę: ");
                liczba = podanaLiczba.nextInt();

                if (maxLiczba < liczba) {
                    maxLiczba = liczba;
                }
                if (minLiczba > liczba) {
                    minLiczba = liczba;
                }
            }
            System.out.println("Suma " + (maxLiczba + minLiczba));
            System.out.println("Avg " + (float)((maxLiczba + minLiczba) / 2));
        }else{
            System.out.println("Nie podano liczb!");
        }
    }*/
   public static void main(String[] args) {
       int[]tablica=new int[2];
       int liczba;

       Scanner podanaLiczba=new Scanner(System.in);

       System.out.println("Podaj liczbę ");
       liczba=podanaLiczba.nextInt();

       tablica[0]=liczba;
       tablica[1]=liczba;

       if(liczba!=0){
           while (liczba!=0){
               System.out.println("Podaj liczbę ");
               liczba=podanaLiczba.nextInt();

               if (tablica[0]<liczba){
                   tablica[0]=liczba;
               }
               if(tablica[1]>liczba){
                   tablica[1]=liczba;
               }
           }
           System.out.println("Suma "+(tablica[0]+tablica[1]));
           System.out.println("AVG "+(float)((tablica[0]+tablica[1])/2));

       }else{
           System.out.println("Nie podano żadnych liczb");
       }



   }
}
