package zadania_1.dodatkowe;

import java.util.Scanner;

/*8. Napisz aplikację której zadaniem jest liczenie srednich ocen z kilku przedmiotów.
        - ocena_matematyka
        - ocena_chemia
        - ocena_j_polski
        - ocena_j_angielski
        - ocena_wos
        - ocena_informatyka

        - Aplikacja ma wyliczac średnią wszystkich ocen, srednią ocen z przedmiotów
        ścisłych (matematyka, chemia, informatyka), oraz średnią z ocen
        przedmiotów humanistycznych (pozostałe).
        - Wszystkie trzy średnie mają być wypisane na ekran. Zwróć uwagę na
        zaokrąglenia.  - Jeśli którakolwiek z ocen jest niedostateczna, lub średnia z ocen z którejś
        części jest niedostateczna, to wyświetl napis:

        Ocena z [część] jest niedostateczna.*/
public class zad8 {
    public static void main(String[] args) {

        String[] tablicaPrzedmiotów = {"ocena_matematyka", "ocena_chemia", "ocena_j_polski", " ocena_j_angielski",
                "ocena_wos", "ocena_informatyka"};
        int[] tablicaOcen = new int[6];

        for (int i = 0; i < tablicaPrzedmiotów.length; i++) {
            System.out.println("Podaj " + tablicaPrzedmiotów[i]);
            tablicaOcen[i] = pobierzOcene();
        }


        int suma = 0;

        for (int i = 0; i < tablicaOcen.length; i++) {
            System.out.println(tablicaOcen[i]);
            suma += tablicaOcen[i];
            if (tablicaOcen[i] == 1) {
                System.out.println(tablicaPrzedmiotów[i] + " jest niedostateczne!");
            }
        }

        float srednia = 0;

        srednia = suma / tablicaOcen.length;
        if (srednia == 1) {
            System.out.println("Srednia ocen jest niedostateczna!!!");
        } else {
            System.out.println("Srednia ocen wynosi: " + srednia);
        }
        suma = tablicaOcen[0] + tablicaOcen[1] + tablicaOcen[5];
        srednia = suma / 3;
        if (srednia == 1) {
            System.out.println("Srednia ocen z przedmiotów scisłych jest niedostateczna!!!");
        } else {
            System.out.println("srednią ocen z przedmiotów ścisłych wynosi: " + srednia);
        }

        suma = tablicaOcen[2] + tablicaOcen[3] + tablicaOcen[4];
        srednia = suma / 3;
        if (srednia == 1) {
            System.out.println("Srednia ocen z przedmiotów humanistycznych jest niedostateczna!!!");
        } else {
            System.out.println("średnią z ocen przedmiotów humanistycznych wynosi: " + srednia);
        }
    }

    public static int pobierzOcene() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
