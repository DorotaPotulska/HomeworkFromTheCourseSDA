package zadania_1.zbior;

import java.util.Scanner;

/*4. Wczytaj jedną liczbę (`a`) i wypisz wynik działania `a` silnia - używaj tylko mnożenia (edited)*/
public class zad4 {
    public static void main(String[] args) {
        int liczbaA;
        int silnia;

        Scanner podanaLiczbaA=new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        liczbaA=podanaLiczbaA.nextInt();
        silnia=1;
        for(int i =1; i<=liczbaA;i++){
            silnia*=i;

        }
        System.out.println(silnia);
    }
}
