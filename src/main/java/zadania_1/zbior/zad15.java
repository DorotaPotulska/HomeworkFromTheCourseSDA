package zadania_1.zbior;

import java.util.Arrays;
import java.util.Scanner;

/*15. Wczytaj ciąg liczb. Znajdź zawarty w nim inny ciąg o największej sumie liczb i długości
        od `1` do `długość ciągu "dużego" - 1` . Wypisz ciąg o największej sumie.
        Na przykład, ciąg  `[1, 5, 8, 2]` ma pod-ciągi `[1]`, `[5]`, `[8]`, `[2]`, `[1, 5]`, `[5, 8]`, `[8, 2]`, `[1, 5, 8]`, `[5, 8, 2]`.
        Największą sumę spośród nich ma `[5, 8, 2]`. Pamiętaj, że w ciągu mogą pojawić się liczby ujemne.*/
public class zad15 {
    public static void main(String[] args) {

        int[]tablicaLiczb=wczytajTablice(pobierzIlosc());

        wyswietlTablice(tablicaLiczb);
        Arrays.sort(tablicaLiczb);
        System.out.println();
        znajdzMaxSume(tablicaLiczb);
    }


    public static int pobierzIlosc(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj długości ciągu liczb");
        return in.nextInt();
    }

    public static int[] wczytajTablice(int ilosc){
        Scanner in = new Scanner(System.in);
        int[] tablicaLiczb = new int[ilosc];

        for (int i = 0; i < ilosc; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę: ");
            tablicaLiczb[i] = in.nextInt();
        }
        return tablicaLiczb;
    }


    public static void wyswietlTablice(int[] tablica){
        for(int i=0;i<tablica.length;i++){
            System.out.print(tablica[i]+" ");
        }
    }

    public static void znajdzMaxSume(int[] tablica){
        int max_sum=tablica[tablica.length-1];
        int j =tablica.length-1;
       // System.out.println("sum "+ max_sum);
       // System.out.println("j "+j);
        if(tablica.length<3){
            System.out.println(tablica[tablica.length-1]);
        }else {
            for (int i = tablica.length - 2; i > 0; i--) {
                if (max_sum < (max_sum + tablica[i])) {
                    max_sum += tablica[i];
                    System.out.println("sum " + max_sum);
                    j = i;
                    System.out.println("j " + j);
                } else {
                    break;
                }

            }
        }
        //System.out.println("sum "+max_sum);
        System.out.println();

        for(int i=j;i<tablica.length;i++){
            System.out.print(tablica[i]+" ");
        }
    }

}
