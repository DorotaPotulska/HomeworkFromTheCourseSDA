package zadania_1.tablice_i_petle;

import java.util.Scanner;

/*4. Napisz program, który przyjmuje tablicę dzielników oraz liczbę całkowitą,
        a następnie zwraca wszystkie liczby mniejsze od zadanej liczby całkowitej
        podzielne przez elementy z tablicy dzielników np.:
        a. Dla Tablicy: {2,3} i liczba:  10 otrzymujemy {2,3,4,6,8,9}
        b. * Program wypisuje na ekranie wszystkie liczby mniejsze od zadanej i podzielne przez dany element tablicy :
        Dla liczby 10 i dzielników [2,3] znaleziono: Liczby podzielne przez 2: {2,4,6,8} Liczby podzielne przez 3: {3,6,9}*/
public class zad4 {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        System.out.println("Podaj liczbę: ");

        int liczba = in.nextInt();

        System.out.println("Podaj ilość dzielników: ");

        int ilosc = in.nextInt();

        int[] dzielniki = new int[ilosc];
        int i=0;

        while(i<ilosc){
            System.out.println("Podaj dzielnik: ");

            dzielniki[i] = in.nextInt();
            i++;
        }
        for(int x:dzielniki){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int z=1;z<liczba;z++){
            for (int j=0;j<ilosc;j++) {
                if (z % dzielniki[j] == 0) {
                    System.out.print(z + " ");

                }
            }
        }
        System.out.println();
        for (int j=0;j<ilosc;j++) {
            System.out.print(dzielniki[j]+" {");
            for(int z=1;z<liczba;z++){

                    if (z % dzielniki[j] == 0) {
                        System.out.print(z + " ");

                    }

            }
            System.out.println("}");
        }




    }
}
