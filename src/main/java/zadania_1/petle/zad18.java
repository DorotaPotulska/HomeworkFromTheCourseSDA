package zadania_1.petle;

import java.util.Random;
import java.util.Scanner;

/*18.Stwórz pętle do...while w której :
        a. pytaj użytkownika o liczbę z zadanego przedziału (przedział od-do wylosuj).
        Dopóki użytkownik będzie podawał liczbę z poza przedziału powtarzaj pętle*/
public class zad18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int liczba;

        int poczatekZakresu = rd.nextInt(10) + 1;
        int koniecZakresu = rd.nextInt(15) + 1;
        System.out.println("Początek zakresu "+poczatekZakresu);
        System.out.println("Koniec zakresu "+koniecZakresu);
        while (koniecZakresu < poczatekZakresu) {
            koniecZakresu = rd.nextInt(15) + 1;
        }
        System.out.println();
        System.out.println("Koniec zakresu "+koniecZakresu);
        System.out.println("Podaj liczbę: ");
        liczba = in.nextInt();


        do {
            System.out.println("Podaj liczbę: ");
            liczba = in.nextInt();
        } while (liczba < poczatekZakresu || liczba > koniecZakresu);

    }
}
