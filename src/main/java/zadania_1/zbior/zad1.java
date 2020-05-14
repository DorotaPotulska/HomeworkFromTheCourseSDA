package zadania_1.zbior;

import java.util.Scanner;

/*1. Wczytaj 5 liczb i wypisz ich sumę*/
public class zad1 {
    public static void main(String[] args) {
        int liczba;
        int suma = 0;
        Scanner podanaLiczba = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbę");
            liczba = podanaLiczba.nextInt();
            suma += liczba;
        }
        System.out.println("Suma liczb wynosi " + suma);
    }
}
