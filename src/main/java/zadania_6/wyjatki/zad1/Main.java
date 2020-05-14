package zadania_6.wyjatki.zad1;
/*1.	Napisz program, który prosi użytkownika o dwie liczby(całkowite) a i b,
        i wyświetla wynik dzielenia a/b.
        Jeżeli b jest ujemne program powinien wyświetlić odpowiedni komunikat.
        a.	Wariant 1: Zastosuj instrukcję if
        b.	Wariant 2: Zastosuj instrukcję try-catch*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int liczbaA;
        int liczbaB;
        System.out.println("Podaj liczbę całkowitą A");
        liczbaA = in.nextInt();
        System.out.println("Podaj liczbę całkowitą B");
        liczbaB = in.nextInt();

        System.out.println("Komunikat z instrukcji if");
        if(liczbaB==0){
            System.out.println("Dzielenie przez zero nie jest możliwe");
        }else {
            System.out.println("a/b = "+(double)liczbaA/liczbaB);
        }

        System.out.println("Komunikat z instrukcji try{}catch");
        try {
            System.out.println("a/b = "+podziel(liczbaA,liczbaB));
        }catch (Mianownik e){
            System.out.println(e.getMessage());
        }

    }

    public static double podziel (int liczbaA, int liczbaB) throws Mianownik {
        double wynik;
        if(liczbaB==0){
            throw new Mianownik("Dzielenie przez zero nie jest możliwe");
        }
        return liczbaA/liczbaB;
    }
}
