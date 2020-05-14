package zadania_1.dodatkowe;

import java.util.Scanner;

/*14.Napisz aplikację która dla podanej wartości przez użytkownika:
        a. zwraca jej wartość bezwzględną.
        b. zwraca jej wartość przeciwną
        c. zwraca jej wartość odwrotną*/
public class zad14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę");
        //dla int
        int liczba = in.nextInt();

        if(liczba>=0){
            System.out.println("Wartość bezwzgledna liczby "+ liczba+" wynosi "+ liczba);

        }else{
            System.out.println("Wartość bezwzgledna liczby "+ liczba+" wynosi "+ (-liczba));
        }


        System.out.println("Wartość przeciwna liczby "+liczba+" wynosi "+(-liczba));

        double odwrotna=(1/(double)liczba);

        System.out.println("Wartość odwrotna liczby "+liczba+ " wynosi "+ odwrotna);
    }
}
