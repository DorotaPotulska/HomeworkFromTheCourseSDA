package zadania_1.petle;

import java.util.Scanner;

/*3. Napisz program, który wypisuje “Hello World” dopóki użytkownik podaje liczby          większe od 0.*/
public class zad3 {
    public static void main(String[] args) {
        int ilosc;
        Scanner podanailosc=new Scanner(System.in);
        System.out.println("Podaj ilosc:");
        ilosc=podanailosc.nextInt();

        while(ilosc>0){
            System.out.println("Hello World");
            System.out.println("Podaj ilosc:");
            ilosc=podanailosc.nextInt();

        }
        System.out.println("Podano liczbe mniejsza równa zero");
    }
}
