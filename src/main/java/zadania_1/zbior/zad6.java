package zadania_1.zbior;

import java.util.Scanner;

/*6. Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera i potem wypisz
        największą i najmniejszą z nich uwzględniając podane liczby ujemne*/
public class zad6 {
    public static void main(String[] args) {
        int liczba;
        Scanner podanaLiczba=new Scanner(System.in);
        int i=0;
        int maxliczba=0;
        int minliczba=0;

        System.out.println("Podaj liczbę:");
        liczba=podanaLiczba.nextInt();
        maxliczba=liczba;
        minliczba=liczba;
        if(liczba>0){
            while(i<4) {
                System.out.println("Podaj liczbę:");
                liczba = podanaLiczba.nextInt();
                if (liczba > 0) {
                    if (liczba >= maxliczba) {
                        maxliczba = liczba;
                    }
                    if (liczba <= minliczba) {
                        minliczba = liczba;
                    }
                    i++;
                }

            }
            }else{
                while(i<5){
                    System.out.println("Podaj liczbę:");
                    liczba=podanaLiczba.nextInt();

                    if(liczba>0){
                        if (liczba>=maxliczba) {
                            maxliczba = liczba;
                        }
                        if(liczba<=minliczba){
                            minliczba=liczba;
                        }
                        i++;
                    }

                }

            }



        System.out.println("Max"+maxliczba);
        System.out.println("Min"+minliczba);
    }
}
