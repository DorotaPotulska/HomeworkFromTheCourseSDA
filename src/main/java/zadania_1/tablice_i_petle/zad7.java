package zadania_1.tablice_i_petle;

import java.util.Arrays;
import java.util.Scanner;

/*7. Napisz program zliczający wystąpienia liter, spacji,
        liczb i innych znaków z zmiennej typu String wprowadzonej przez użytkownika.
        Wynik wyświetl w następującej postaci:
        a. Podany tekst : „{Tekst}” zawiera: X liter Y spacji Z liczb P innych znaków
        b. Gdzie X,Y,Z,P to liczby całkowite reprezentujące wystąpienia znaków w tekście*/
public class zad7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Podaj zdanie: ");
        String zdanie=in.nextLine();

        String[] wynik=zdanie.split("");

        Arrays.sort(wynik);

        for(String x: wynik){
            System.out.print(x+" ");
        }
        System.out.println();
        int ilosc;
        ilosc=0;

        for(int y=0;y<wynik.length;y++){
            for(int z=0;z<wynik.length;z++){
                if(wynik[y].equals(wynik[z])){
                    ilosc++;
                }
            }

            if(y>0 && !wynik[y-1].equals(wynik[y])){
                System.out.println(wynik[y]+" - "+ilosc);
            }else if (y==0){
                System.out.println(wynik[y]+" - "+ilosc);
            }
            ilosc=0;
        }

    }
}
