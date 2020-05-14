package zadania_1.tablice;
/*1. Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie:
        a. wypełnij je losowymi wartościami z przedziału -10 - 10
        b. wypisz na ekranie zawartość tablicy
        c. wyznacz najmniejszy oraz największy element tablicy (wypisz je)
        d. wypisz średnią arytmetyczną tablicy (*spróbuj zrobić to samo z tablicą liczb zmiennoprzecinkowych)
        e. wypisz ilość elementów większych/mniejszych od średniej
        f. wypisz tablicę w odwrotnej kolejności
        g. **wyznacz medianę  - > posortuj tablicę używając Arrays.sort() a następnie określ medianę

        Przykład: Wylosowane liczby:                 -3 9 2 -10 -3 -4 -1 -5 -10 8
        Min: -10, max: 9
        Średnia: -1,00
        Mniejszych od śr.: 6
        Większych od śr.: 3
        Liczby w odwrotnej kolejności:                 8 -10 -5 -1 -4 -3 -10 2 9 -3*/

import java.util.Arrays;
import java.util.Random;

public class zad1 {
    public static void main(String[] args) {
        int[] tablica=new int[10];
        int suma=0;

        Random rd =new Random();
// a = r.nextInt(y-x+1)+x;
        for (int i=0;i<tablica.length;i++){
            tablica[i]=rd.nextInt(21)-10;
        }
        System.out.println();
        for(int x:tablica){
            System.out.print(x+" ");
        }
        int[] kopia = tablica.clone();

        System.out.println();
        Arrays.sort(tablica);
        System.out.println("MIN "+ tablica[0]);
        System.out.println("MAX "+tablica[tablica.length-1]);

        for(int z:tablica){
            suma+=z;
        }

        float avg=(suma/tablica.length);
        System.out.println("Srednia "+avg);
        System.out.println("Mniejsze od sredniej ");
        for(int z:kopia){
            if(z<avg){
                System.out.print(z+" ");
            }

        }
        System.out.println();
        System.out.println("Większe od sredniej ");
        for(int z:kopia){
            if(z>avg){
                System.out.print(z+" ");
            }

        }
        System.out.println();

        for(int i=kopia.length-1;i>=0;i--){
            System.out.print(kopia[i]+" ");
        }
        System.out.println();

        System.out.println("Mediana "+(float)(tablica[4]+tablica[5])/2);





    }
}
