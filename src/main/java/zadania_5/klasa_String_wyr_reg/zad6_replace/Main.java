package zadania_5.klasa_String_wyr_reg.zad6_replace;

import java.util.Scanner;

/*6. Napisz program który wczytuje od użytkownika tekst, a następnie dla tego tekstu
        zamienia wszystkie wystąpienia przecinków (“, “) na słowo “makarena”. (replaceAll)*/
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst= in.nextLine();

        System.out.println(tekst.replaceAll(", ", "makarena"));
    }
}
