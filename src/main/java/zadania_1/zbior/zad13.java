package zadania_1.zbior;

import java.util.Arrays;
import java.util.Scanner;

/*13. Wczytaj 5 liczb i wypisz je usuwając duplikaty (tj. dla liczby, która występuje więcej niż                raz wypisz ją raz)*/
public class zad13 {
    public static void main(String[] args) {
        int liczba;
        int i=0;
        int[] tablica=new int[5];

        Scanner podanaLiczba=new Scanner(System.in);

        while (i<5){
            System.out.println("Podaj liczbę: ");
            liczba=podanaLiczba.nextInt();

            tablica[i]=liczba;
            i++;

        }

        Arrays.sort(tablica);
        int y;
        y=tablica[4];

        if(y==tablica[0]){
            System.out.println(tablica[0]);
        }else{
            for(int x: tablica){
                if (y!=x){
                    System.out.print(x+" ");
                    y=x;
                }


            }

        }

       // int[] unikatowa = Arrays.stream(tablica).distinct().toArray();
       // System.out.println(unikatowa);


    }
}
