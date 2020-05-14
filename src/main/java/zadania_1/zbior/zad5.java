package zadania_1.zbior;

import java.util.Scanner;

/*5. Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera i potem wypisz największą z nich*/
public class zad5 {
    public static void main(String[] args) {
        int liczba;
        int maxliczba=0;
        int i = 0;

        Scanner podanaLiczba = new Scanner(System.in);

        while (i < 5) {
            System.out.println("Podaj liczbę");
            liczba = podanaLiczba.nextInt();


            if (liczba > 0) {
                if (liczba >= maxliczba) {
                    maxliczba = liczba;
                    //System.out.println(maxliczba);
                }
                i++;
            }

        }

        System.out.println(maxliczba);

    }
}
