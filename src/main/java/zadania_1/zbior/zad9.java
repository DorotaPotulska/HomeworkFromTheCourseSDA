package zadania_1.zbior;

import java.util.Scanner;

/*9. Wczytuj liczby tak długo aż użytkownik poda 5 liczb i potem wypisz ich średnią arytmetyczną*/
public class zad9 {
    public static void main(String[] args) {
        int liczba;
        float suma=0;
        int i=0;

        Scanner podanaLiczba=new Scanner(System.in);

        while (i<5){
            System.out.println("Podaj liczbę: ");
            liczba=podanaLiczba.nextInt();
            suma+=liczba;
            i++;
        }

        System.out.println("Srednia arytmetyczna podanych liczb wynosi "+(suma/5));
    }
}
