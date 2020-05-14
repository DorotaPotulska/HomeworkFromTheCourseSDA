package zadania_1.zadania_domowe;

import java.util.Scanner;

/*Zadanie 2

        stworz metode rysujaca wiezowiec o zadanej liczbie pieter, liczba pieter nie
        moze byc wyzsza niz 10 ani mniejsza niz 2 liczba pieter powinna zostac podana
        przez uzytkownika (Scanner + System.in)

        przykladowy rysunek dla 2 pieter
        _____________
        |  _   _  |
        | |_| |_| |
        |  _   _  |
        | |_| |_| |
        |         |
        ^^^^^^^^^^^^^*/
public class zad2 {
    public static void main(String[] args) {
        rysujPietro(pobierzIloscPieter());

    }
    public static int pobierzIloscPieter() {
        Scanner in = new Scanner(System.in);
        int ilosc = 0;
        do {
            System.out.println("Podaj ile pięter ma posiadać budynek:");
            ilosc = in.nextInt();
        } while (ilosc <= 2 || ilosc >= 10);

        return ilosc;
    }
    public static void rysujPietro(int ilosc){
        System.out.println("_____________");
        for(int i=0;i<ilosc;i++) {
            System.out.println("|  _   _  |");
            System.out.println("| |_| |_| |");
        }
        System.out.println("|         |");
        System.out.println("^^^^^^^^^^^^^");
    }
}
