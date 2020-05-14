package zadania_1.tablice_i_petle;

import java.util.Arrays;
import java.util.Scanner;

/*8. ** Napisz program sortujący wprowadzone liczby przez użytkownika
        a. Rosnąco
        b. Malejąco*/
public class zad8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ilosc liczb: ");
        int ilosc=in.nextInt();
        int [] liczby = new int[ilosc];

        for(int i=0;i<ilosc;i++){
            System.out.println("Podaj liczbę: ");
            liczby[i]=in.nextInt();
        }

        for(int x: liczby){
            System.out.print(x+" ");
        }
        Arrays.sort(liczby);

        System.out.println();
        for(int x: liczby){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x=liczby.length-1;x>=0;x--){
            System.out.print(liczby[x]+" ");
        }
    }
}
