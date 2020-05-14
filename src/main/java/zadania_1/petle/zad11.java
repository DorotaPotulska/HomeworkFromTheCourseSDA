package zadania_1.petle;

import java.util.Scanner;

/*11.Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki.
        Przykładowo,          dla liczby 21 dzielniki to: 1, 3, 7, 21*/
public class zad11 {
    public static void main(String[] args) {
        int liczba;
        Scanner podanaLiczba=new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        liczba=podanaLiczba.nextInt();

        int dzielnik;
        dzielnik =1;

        while(liczba>=dzielnik){
            if(liczba%dzielnik==0){
                System.out.print(dzielnik+" ");
            }
            dzielnik+=1;
        }

    }
}
