package zadania_1.petle;

import java.util.Scanner;

/*6. Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n,
        a           następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana            liczba.
        Przykładowo, dla liczby 71 program powinien wyświetlić:     1 2 4 8 16 32 64*/
public class zad6 {
    public static void main(String[] args) {
        int n;

        Scanner podanaN =new Scanner(System.in);

        System.out.println("Podaj liczbę n: ");
        n=podanaN.nextInt();

        while (n<0){
            System.out.println("Liczba n musi być liczbą całkowitą dodatnią");
            System.out.println("Podaj liczbę n: ");
            n=podanaN.nextInt();
        }
        double potega;
        int i=0;
        while(i<=n){
            potega = Math.pow(2,i);
            if (potega<=n){
                System.out.print( (int)potega+" ");
            }
            i++;

        }
    }
}
