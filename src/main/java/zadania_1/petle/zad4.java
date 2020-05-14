package zadania_1.petle;

import java.util.Scanner;

/*4. Napisać program w którym użytkownik podaje na początku dwie liczby:
        początekZakresu ​oraz ​koniecZakresu​.
        Upewnij się że ​początekZakresu <        koniecZakresu ​a następnie
        a. pobierz od użytkownika kolejną liczbę - ​dzielnik.
        Po pobraniu dzielnika          wypisz wszystkie liczby od ​początekZakresu ​do ​koniecZakresu
        które są         podzielne przez ​dzielnik​.
        b. *pobierz od użytkownika ​iloscDzielnikow​,
        a następnie wczytaj wszystkie        dzielniki.
        Po wczytaniu wszystkich dzielnikow wypisz wszystkie liczby od
        poczatekZakresu ​do ​koniecZakresu które są podzielne przez ​wszystkie        dzielniki.*/
public class zad4 {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int poczatekZakresu;
        int koniecZakresu;
        int dzielnik;
        int ilosc;

        System.out.println("Podaj poczatek zakresu: ");
        poczatekZakresu=in.nextInt();

        System.out.println("Podaj koniec zakresu: ");
        koniecZakresu=in.nextInt();

        while(koniecZakresu<=poczatekZakresu){
            System.out.println("Podałeś koniec zakresu mniejszy niż poczatek zakresu");
            System.out.println("Podaj koniec zakresu: ");
            koniecZakresu=in.nextInt();
        }

       /* System.out.println("Podaj dzielnik: ");
        dzielnik=in.nextInt();

        for (int i = poczatekZakresu;i<koniecZakresu;i++){
            if (i%dzielnik==0){
                System.out.print(""+i+" ");
            }

        }*/

        System.out.println("Podaj ilosc dzielników: ");
        ilosc=in.nextInt();

        int[] tablicaDzielnikow=new int [ilosc];

        for(int j=0;j<ilosc;j++){
            System.out.println("Podaj dzielnik: ");
            tablicaDzielnikow[j]=in.nextInt();
        }

        System.out.println("tablica dzielników");
        for(int x:tablicaDzielnikow){
            System.out.print(x+" ");

        }

        for(int k=poczatekZakresu;k<koniecZakresu;k++){
            for(int l=0;l<tablicaDzielnikow.length;l++){
                if(k%tablicaDzielnikow[l]==0){
                    System.out.println("Liczba " +k+"jest podzielna przez "+tablicaDzielnikow[l]);
                }

            }
        }

    }
}
