package zadania_1.zbior;

import java.util.Scanner;

/*11. Wczytuj liczby tak długo aż ich suma będzie równa 0*/
public class zad11 {
    public static void main(String[] args) {
        int liczba;
        int suma;

        Scanner podanaLiczba=new Scanner(System.in);

        suma=0;

        System.out.println("Podaj liczbę: ");
        liczba=podanaLiczba.nextInt();
        suma+=liczba;

        while(suma!=0){

            System.out.println("Podaj liczbę: ");
            liczba=podanaLiczba.nextInt();
            suma+=liczba;

        }
        System.out.println("Suma równa się zero");
    }
}
