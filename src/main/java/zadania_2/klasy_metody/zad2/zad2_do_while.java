package zadania_2.klasy_metody.zad2;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

/*1. Napisz program, który wypisuje wszystkie liczby mniejsze od zadanej od użytkownika dopóki
        użytkownik wpisuje liczby większe od 0
        2. *Napisz program, który oblicza wartość pierwiastka z wprowadzonej przez użytkownika liczby,
        dopóki ta przyjmuje wartości większe od 0 (dla uproszczenia przyjmij że użytkownik wprowadza liczby całkowite)*/
public class zad2_do_while {

    public static void main(String[] args) {
        int liczba;
        int i;
        do{
            i=1;
            System.out.println("Podaj liczbę: ");
            liczba=wczytajLiczbę();

            while(i<=liczba){
                System.out.print(i+" ");
                i++;
            };
            System.out.println();
        }while (liczba>0);

        double pierwiastek;

        do{
            System.out.println("Podaj liczbę: ");
            liczba=wczytajLiczbę();

            pierwiastek=sqrt(liczba);
            System.out.println("Pierwiastek z liczby "+liczba+" wynosi "+pierwiastek);

        }while (liczba>0);

    }

    public static int wczytajLiczbę(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
