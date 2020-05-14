package zadania_1.tablice;

import java.util.Arrays;
import java.util.Random;

/*2. Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10
        a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza się w tablicy.

        Przykład:
        Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
        Wystąpienia:
        1 - 1
        2 - 1
        3 - 3
        4 - 3
        5 - 3
        6 - 4
        7 - 1
        8 - 2
        9 - 0
        10 - 2*/
public class zad2 {
    public static void main(String[] args) {
        int[] table = new int[20];
        int[] sprawdzenie = new int[10];

        //tablica z liczbami od 1 do 10
        for (int j = 0; j < 10; j++) {
            sprawdzenie[j] = j + 1;
        }

        Random rd = new Random();

        for (int i = 0; i < table.length; i++) {
            table[i] = rd.nextInt(10) + 1;
        }

        for (int x : table) {
            System.out.print(x + " ");
        }
        System.out.println();
        int licznik = 0;

        Arrays.sort(table);
        /*for(int i=0;i<table.length;i++){
            for(int j=0;j<table.length;j++){

                if(table[i]==table[j]){
                    licznik++;
                }

            }
            if(i>0 && table[i-1]!=table[i]){
                System.out.println(table[i]+" - "+licznik);
            }else if (i==0){
                System.out.println(table[i]+" - "+licznik);
            }

            licznik=0;
        }*/


        for (int i = 0; i < sprawdzenie.length; i++) {
            for (int k = 0; k < table.length; k++) {
                if (sprawdzenie[i] == table[k]) {
                    licznik++;
                }
            }
            System.out.print(sprawdzenie[i] + "-" + licznik);
            licznik = 0;
            System.out.println();
        }
    }
}
