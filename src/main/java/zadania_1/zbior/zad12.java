package zadania_1.zbior;

import java.util.Arrays;
import java.util.Scanner;

/*12. Wczytaj 10 liczb i wypisz ich medianę*/
public class zad12 {
    public static void main(String[] args) {
        int liczba;
        int[] tablica=new int[10];
        int i=0;

        Scanner podanaLiczba=new Scanner(System.in);

        while (i<10){
            System.out.println("Podaj liczbę: ");
            liczba=podanaLiczba.nextInt();
            tablica[i]=liczba;
            i++;

        }
        for(int x:tablica)
        System.out.print(x+" ");

        Arrays.sort(tablica);

        for(int y:tablica)
        System.out.print(y);
        System.out.println("Mediana wynosi "+(tablica[4]+tablica[5])/2);
    }
}
