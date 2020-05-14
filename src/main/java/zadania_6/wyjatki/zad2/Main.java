package zadania_6.wyjatki.zad2;

/*2.	Napisz program który pyta użytkownika o dwie liczby a następnie sprawdza czy druga liczba nie jest ==0.
        Jeśli jest, to wyrzuca wyjątek ‘CholeroException’ z komunikatem “Pamiętaj cholero, by nie dzielić przez zero!”.*/

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
        }catch (CholeroException e){
            System.out.println(e.getMessage());
        }

    }

    public static double podziel (int liczbaA, int liczbaB) throws CholeroException {
        double wynik;
        if(liczbaB==0){
            throw new CholeroException("Pamiętaj cholero, by nie dzielić przez zero!");
        }
        return liczbaA/liczbaB;
    }
}
