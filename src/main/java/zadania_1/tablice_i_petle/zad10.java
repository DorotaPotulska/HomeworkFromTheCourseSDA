package zadania_1.tablice_i_petle;

import java.util.Arrays;
import java.util.Scanner;

/*10. Utwórz program, który przyjmuje tablicę od użytkownika w postaci liczb całkowitych odseparowanych przecinkiem,
        a następnie na tej tablicy usuwa wszystkie zduplikowane elementy i wyświetla tablicę bez duplikacji.*/
public class zad10 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Podaj liczby całkowite:");
        String liczby=in.nextLine();
        System.out.println();
        String[] wynik=liczby.split(",");

        for(String x:wynik){
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(wynik);
        for(String x:wynik){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print(wynik[0]+" ");
        for(int i=1;i<wynik.length;i++){
            if(!wynik[i-1].equals(wynik[i])){
                System.out.print(wynik[i]+" ");
            }

        }



    }
}
