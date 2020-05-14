package zadania_1.zbior;

import java.util.Scanner;

/*7. Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera, 5 liczb mniejszych
        od zera (łącznie 10) i potem wypisz ich sum*/
public class zad7 {
    public static void main(String[] args) {
        int liczba;
        int suma=0;
        Scanner podanaLiczba = new Scanner(System.in);

        int i=0;

        while(i<10){
            System.out.println("Podaj liczbę");
            liczba=podanaLiczba.nextInt();

            if (liczba!=0){
                suma+=liczba;
                i++;
            }

        }
        System.out.println(suma);


    }
}
