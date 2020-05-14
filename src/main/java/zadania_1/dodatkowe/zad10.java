package zadania_1.dodatkowe;

import java.util.Arrays;
import java.util.Scanner;

/*10.Zadeklaruj trzy zmienne (liczby). Wypisz na ekran wszystkie z nich, a następnie
        wypisz na ekran największą oraz najmniejszą z nich.*/
public class zad10 {
    public static void main(String[] args) {
        int[] tablica = new int[3];
        tablica = podajLiczby();
        wyswietlTablice(tablica);

        Arrays.sort(tablica);
        System.out.println("Najmniejsza wartość wynosi " + tablica[0]);
        System.out.println("Najwieksza wartosc wynosi " + tablica[tablica.length - 1]);

    }

    public static int[] podajLiczby() {
        int[] tablica = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj 3 liczby");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj liczbę " + (i + 1));
            tablica[i] = in.nextInt();
        }
        return tablica;
    }

    public static void wyswietlTablice(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}
