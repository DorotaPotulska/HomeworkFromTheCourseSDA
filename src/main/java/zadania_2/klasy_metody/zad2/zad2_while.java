package zadania_2.klasy_metody.zad2;

import java.util.Scanner;

/*1. Napisz program, który oblicza sumę wszystkich liczb poprzedzających zadaną przez użytkownika liczbę
– dla liczby 100 będzie to suma liczb od 0 do 100 czyli 5050
        2. *Napisz program, który oblicza silnię dla zadanej liczby przez użytkownika
        (do n=12) korzystając z pętli while https://pl.wikipedia.org/wiki/Silnia*/
public class zad2_while {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        int liczba=wczytajLiczbę();
        int i=0;
        int suma=0;
        while(i<=liczba){
            suma+=i;
            i++;

        }
        System.out.println("Suma liczb od 0 do "+liczba+" wynosi "+suma);

        //silnia
        int j=1;
        int silnia=1;

        while (j<=liczba){
            silnia*=j;
            j++;
        }
        System.out.println("Silnia liczby "+liczba+" wynosi "+silnia);
    }

    public static int wczytajLiczbę(){
        Scanner in =new Scanner(System.in);
        return in.nextInt();
    }
}
