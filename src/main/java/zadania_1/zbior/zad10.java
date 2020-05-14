package zadania_1.zbior;

import java.util.Scanner;

/*10. Wczytuj liczby tak długo aż ich suma będzie równa 10 (edited)*/
public class zad10 {
    public static void main(String[] args) {
        int liczba;
        int suma=0;
        int brakuje=10;

        Scanner podanaLiczba=new Scanner(System.in);

        while (suma!=10){
            System.out.println("Podaj liczbę: ");
            liczba=podanaLiczba.nextInt();

            if(liczba<=brakuje){
                suma+=liczba;
                brakuje=10-suma;
            }




        }
        System.out.println("Suma równa się 10");
    }
}
