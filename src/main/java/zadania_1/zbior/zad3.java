package zadania_1.zbior;

import java.util.Scanner;

/*3. Wczytaj dwie liczby (`a` i `b`) i wypisz wynik działania `a` do potęgi `b`
        - używaj tylko mnożenia, a nie wbudowanej w javę funkcji potęga.
        Przyjmijmy dla ułatwienia, że `b` jest większe lub równe 0 (nie obsługujemy ujemnych potęg) (edited)*/
public class zad3 {
    public static void main(String[] args) {
        int liczbaA;
        int liczbaB;
        int potega;

        Scanner podanaLiczbaA=new Scanner(System.in);
        Scanner podanaLiczbaB=new Scanner(System.in);

        System.out.println("Podaj liczbę A:");
        liczbaA=podanaLiczbaA.nextInt();
        System.out.println("Podaj liczbę B:");
        liczbaB=podanaLiczbaB.nextInt();
        potega=1;
        for(int i=0;i<liczbaB;i++){
            potega*=liczbaA;
        }

        System.out.println(potega);
    }
}
