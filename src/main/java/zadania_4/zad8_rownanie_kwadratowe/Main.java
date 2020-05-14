package zadania_4.zad8_rownanie_kwadratowe;

import java.util.Scanner;

/*1. Równanie kwadratowe
        Stwórz program obliczający równanie kwadratowe (http:matematyka.pisz.pl/strona/54.html).
        Na wejściu użytkownik podaje wartość zmiennych A, B i C.
        Do działania programu stwórz klasę QuadraticEquation a w nim pola ‘a’, ‘b’, ‘c’.
        Zainicjuj wartości w konstruktorze.
        Stwórz metody do pobierania getX1 oraz getX2 które obliczają wartości i zwracają w wyniku.
        Jeśli delta ma niepoprawną wartość, to metoda rzuca wyjątek.*/
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int liczbaA;
        int liczbaB;
        int liczbaC;

        QuadraticEquation rownanie= new QuadraticEquation();
        System.out.println("Podaj A");
        rownanie.setLiczbaA(in.nextInt());
        System.out.println("Podaj B");
        rownanie.setLiczbaB(in.nextInt());
        System.out.println("Podaj C");
        rownanie.setLiczbaC(in.nextInt());

        //rownanie.obliczDelte(rownanie.getLiczbaA(),rownanie.getLiczbaB(),rownanie.getLiczbaC());
        try{
            System.out.println("Delta równa sie "+rownanie.obliczDelte());
            System.out.println("Rozwiązanie x1 wynosi: "+ rownanie.getX1());
            System.out.println("Rozwiązanie x2 wynosi: "+ rownanie.getX2());
        }catch (MinusDelta e) {
            System.out.println(e.getMessage());
        }catch (OneResult b){
            System.out.println(b.getMessage());
        }

    }
}
