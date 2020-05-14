package zadania_1.tablice_i_petle;

import java.util.Arrays;
import java.util.Scanner;

/*2. Napisz program, który dla zadanej tablicy typu int zwraca:
        a. Największą wartość
        b. Najmniejszą wartość
        c. Sumę wszystkich wartości
        d. *Wartość średnią
        e. *Medianę*/
public class zad2 {
    public static void main(String[] args) {
        int[] tablica=new int[6];
        int liczba;
        int suma=0;
        Scanner podanaLiczba=new Scanner(System.in);

        for(int i=0;i<tablica.length;i++){
            System.out.println("Podaj liczbę: ");
            liczba=podanaLiczba.nextInt();
            tablica[i]=liczba;

        }

        Arrays.sort(tablica);

        System.out.println("MIN "+tablica[0]);
        System.out.println("MAX "+tablica[5]);

        for (int j=0;j<6;j++){
            suma+=tablica[j];
        }
        System.out.println("Suma "+suma);

        System.out.println("Srednia " + (float)(suma/tablica.length));

        System.out.println("Mediana "+(float)((tablica[2]+tablica[3])/2));
    }
}
