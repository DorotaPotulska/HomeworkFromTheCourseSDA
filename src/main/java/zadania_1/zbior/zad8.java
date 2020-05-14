package zadania_1.zbior;

import java.util.Scanner;

/*8. Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera,
        5 liczb mniejszych od zera (łącznie 10) i potem wypisz największą i najmniejszą z nich*/
public class zad8 {
    public static void main(String[] args) {
        int liczba;
        int maxLiczba;
        int minLiczba;
        int i = 0;
        Scanner podanaLiczba=new Scanner(System.in);
        maxLiczba=0;
        minLiczba=0;
        while(i<10){
            System.out.println("Podaj liczbę: ");
            liczba=podanaLiczba.nextInt();
            if (i==0){
                maxLiczba=liczba;
                minLiczba=liczba;
            }

            if(liczba!=0){
                if(liczba>=maxLiczba){
                    maxLiczba=liczba;
                }

                if(liczba<=minLiczba){
                    minLiczba=liczba;
                }
                i++;
            }

        }
        System.out.println("Maksymalna liczba: "+maxLiczba);
        System.out.println("Minimalna liczba: "+minLiczba);
    }
}
