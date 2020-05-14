package zadania_1.zbior;

import java.util.Scanner;

/*2. Wczytaj ilość liczb do wczytania, potem wczytaj tyle liczb ile podał użytkownik i wypisz ich sume*/
public class zad2 {
    public static void main(String[] args) {
        int ilosc;
        int liczba;
        int suma;
        suma = 0;

        Scanner podanaIlosc = new Scanner(System.in);
        Scanner podanaLiczba = new Scanner(System.in);

        System.out.println("Podaj ilosc liczb: ");
        ilosc = podanaIlosc.nextInt();

        for (int i = 0; i < ilosc; i++) {
            System.out.println("Podaj liczbę ");
            liczba = podanaLiczba.nextInt();
            suma += liczba;

        }

        System.out.println("Suma liczb wynosi " + suma);
    }
}
