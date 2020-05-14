package zadania_5.klasa_String_wyr_reg.zad7_UpperLower;
/*7. Napisz aplikację która przyjmuje od użytkownika tekst, a następnie zamienia cały
        tekst na: a. same duże litery b. same małe litery*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst = in.nextLine();

        System.out.println(tekst.toUpperCase());
        System.out.println(tekst.toLowerCase());
    }
}
