package zadania_1.petle;

import java.util.Random;
import java.util.Scanner;

/*9. Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100,
        a gracz                  (użytkownik) ma za zadanie odgadnąć,
        co to za liczba poprzez podawanie kolejnych            wartości.
        Jeżeli podana wartość jest:
        a. większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
        b. mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
        c. identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra się           kończy.*/
public class zad9 {
    public static void main(String[] args) {


        Random liczba = new Random();
        int n = liczba.nextInt(5) + 1;//od 1 do 5
        System.out.println(n);
        System.out.println("Podaj wynik:");
        Scanner wynik = new Scanner(System.in);
        int w = wynik.nextInt();

        while (n!=w){
            if(n<w){
                System.out.println("Podałeś za dużą wartość");
                System.out.println("Podaj kolejny wynik:");
                w = wynik.nextInt();;
            }else{
                System.out.println("Podałeś za małą wartość");
                System.out.println("Podaj kolejny wynik:");
                w = wynik.nextInt();;
            }
        }

            System.out.println("Gratulacje");
    }
}
