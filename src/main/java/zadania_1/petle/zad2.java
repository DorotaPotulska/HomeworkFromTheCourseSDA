package zadania_1.petle;

import java.util.Scanner;

/*2. Napisz aplikację która przyjmuje parametr (ilość powtórzeń) ze scannera,
        a          następnie zadaną ilość razy wypisuje na ekran “Hello World” - pętlą for i while*/
public class zad2 {
    public static void main(String[] args) {
        int ileRazy;

        Scanner podanaIlosc = new Scanner(System.in);
        System.out.println("Podaj ilość powtórzeń:");
        ileRazy = podanaIlosc.nextInt();


       /* for (int i = 0; i < ileRazy; i++) {
            System.out.println("Hello World");
        }*/
        int i=0;
        while (i < ileRazy) {
            System.out.println("Hello World !");
            i+=1;
        }

    }

}
