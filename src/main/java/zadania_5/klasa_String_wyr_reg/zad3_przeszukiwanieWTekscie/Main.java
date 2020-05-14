package zadania_5.klasa_String_wyr_reg.zad3_przeszukiwanieWTekscie;

import java.util.Scanner;

/*3. Wczytaj od użytkownika jedną linię tekstu i przypisz ją do zmiennej ​text a następnie
        wczytaj od użytkownika słowo i przypisz je do zmiennej ​searched​ . Następnie
        przeszukaj tekst w poszukiwaniu słowa przypisanego do zmiennej ​searched*/
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Podaj tekst");
        String text =in.nextLine();
        System.out.println("Podaj szukane słowo");
        String searched = in.nextLine();

        if(text.toLowerCase().contains(searched.toLowerCase())){
            System.out.println("Tekst zawiera słowo "+searched);
        }else{
            System.out.println("Tekst nie zawiera słowa "+searched);
        }
    }
}
