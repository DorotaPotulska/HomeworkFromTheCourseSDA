package zadania_1.postawy;

import java.util.Scanner;

public class zadanie4 {
/*    Zadanie 4. Stwórz aplikację która prosi użytkownika o imie komunikatem:

            "Wpisz swoje imie:"

    następnie prosi użytkownika o nazwisko podobnym komunikatem. Wartości wpisane przez użytkownika przypisz do zmiennych a następnie wypisz komunikat z przywitaniem:

            "Witaj {Imie} {Nazwisko}"

    Zamiast klamerek i słowa imie/nazwisko wpisz wartości wpisane przez użytkownika.*/
public static void main(String[] args) {
    String imie;
    String nazwisko;

    Scanner podaneImie=new Scanner(System.in);
    Scanner podaneNazwisko=new Scanner(System.in);

    System.out.println("Wpisz swoje imie: " );
    imie=podaneImie.nextLine();
    System.out.println("Wpisz swoje nazwisko: ");
    nazwisko = podaneNazwisko.nextLine();

    System.out.println("Witaj "+imie+" "+nazwisko+"!");
}
}
