package zadania_2.klasy_metody.zad2;

import java.util.Scanner;

/*2. Samodzielne wykonanie zadań z pętlami bez patrzenia na rozwiązanie ( w ramach przypomnienia)
– slajdy z zadaniami to : 74(pętla for), 78(pętla while), 82(do while)*/
public class zad2_for {
    public static void main(String[] args) {
        /*1. Napisz program, który przyjmuje od użytkownika dzielnik oraz liczbę,
        a następnie drukuje na ekranie wszystkie liczby mniejsze od zadanej liczby
        podzielne przez zadany dzielnik
        2. * Napisz program wyznaczający potęgę liczby n i m – obie zadane przez
        użytkownika i drukujący w czytelny sposób wynik na ekranie konsoli*/
        int liczba;
        int dzielnik;

        System.out.println("Podaj liczbę: ");
        liczba=wczytajLiczbę();
        System.out.println("Podaj dzielnik: ");
        dzielnik=wczytajLiczbę();

        for(int i=0;i<liczba;i++){
            if(i%dzielnik==0){
                System.out.println("Liczba podzielna przez "+dzielnik+" to " +i);
            }
        }

        int n;
        int m;
        int potega=1;
        System.out.println("Podaj liczbę n: ");
        n=wczytajLiczbę();
        System.out.println("Podaj liczbę m: ");
        m=wczytajLiczbę();

        for(int i=1;i<=m;i++){
            potega*=n;
        }
        System.out.println("Potega liczby "+n+"^"+m+" wynosi "+potega);
    }

    public static int wczytajLiczbę(){
        Scanner in= new Scanner(System.in);
        return in.nextInt();
    }
}
