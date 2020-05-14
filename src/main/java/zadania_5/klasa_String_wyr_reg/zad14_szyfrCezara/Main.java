package zadania_5.klasa_String_wyr_reg.zad14_szyfrCezara;

import java.util.Scanner;

/*14.Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy użyciu
        szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego
        monoalfabetycznego. Użytkownik program podaje tekst do zaszyfrowania oraz liczbę
        n, o którą przesunięty jest alfabet za pomocą którego szyfrujemy tekst. Dla
        uproszczenia można przyjąć, że łańuch wejściowy składa się tylko z małych liter
        alfabetu angielskiego, tj. ’a’ – ’z’ (26 znaków) oraz spacji.

        Przykład 1.
        Podaj łańcuch znaków do zaszyfrowania: abrakadabraz
        Podaj przesunięcie: 2
        Zaszyfrowany tekst: cdtcmcfcdtcb
        Przykład 2.
        Podaj łańcuch znaków do zaszyfrowania: cdtcmcfcdtcb
        Podaj przesunięcie: -2
        Zaszyfrowany tekst: abrakadabraz*/
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj tekst do zaszyfrowania:");
        String tekst= in.nextLine();

        System.out.println("Podaj przesunięcie:");
        int przesuniecie= in.nextInt();
        char znak;
        int kod_ascii;
        //String[] tabZnakow=tekst.split("");

        for(int i=0; i<tekst.length();i++){
            znak=tekst.charAt(i);
            //System.out.println(znak);
            kod_ascii=(int)znak;
            //System.out.println(kod_ascii);
            kod_ascii=(int)znak+przesuniecie;
            //System.out.println(kod_ascii);
            znak=(char)kod_ascii;
            System.out.print(znak);

        }

    }
}
