package zadania_1.tablice_i_petle;

import java.util.Random;
import java.util.Scanner;

/*1. Napisz program symulujący grę w Lotto:
        a. Użytkownik typuje 6 cyfr
        b. Program losuje 6 cyfr z liczb od 1 do 49
        c. Program wypisuje na ekranie wytypowane przez użytkownika cyfry
        d. Program wypisuje na ekranie wylosowane cyfry
        e. Program wyświetla wynik użytkownika w poniższej formie:
            i. Trafiono n z 6 cyfr
        f. *Upewnij się że użytkownik podaje 6 różnych liczb
        g. *Upewnij się, że maszyna losująca generuje 6 różnych liczb
        h. ! Skorzystaj z klasy java.util.Random*/

public class zad1 {
   public static void main(String[] args) {

        int[] liczba = new int[6];
        int[] wyniki = new int[6];
        int licznik=0;

        Scanner in = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Podaj 6 liczb: ");

        for (int i = 0; i < liczba.length; i++) {
            liczba[i] = in.nextInt();
            if (liczba[i] > 0 && liczba[i] < 50) {
                if (i > 0) {
                    for (int j = 0; j < i; j++) {
                        if (liczba[j] == liczba[i]) {
                            i--;
                        }
                    }
                }

            } else {
                System.out.println("Podaj liczbę z przedziału od 1 do 49: ");
                i--;
            }
        }

        for (int x : liczba) {
            System.out.print(x + " ");
        }

        for (int k = 0; k < wyniki.length; k++) {
            wyniki[k] = rd.nextInt(49)+1;
            if (k> 0) {
                for (int j = 0; j < k; j++) {
                    if (wyniki[j] == wyniki[k]) {
                        k--;
                    }
                }
            }
        }
        System.out.println();

        for (int x : wyniki) {
            System.out.print(x + " ");
        }

        for(int m=0;m<liczba.length;m++){
            for(int n=0;n<wyniki.length;n++){
                if(liczba[m]==wyniki[n]){
                    licznik++;
                }
            }
        }
        System.out.println();
        System.out.println("Trafiono " + licznik+" z 6 cyfr");
    }
}

