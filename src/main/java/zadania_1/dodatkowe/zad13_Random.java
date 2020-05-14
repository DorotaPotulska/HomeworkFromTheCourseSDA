package zadania_1.dodatkowe;

import java.util.Random;
import java.util.Scanner;

/*13.Napisz aplikację która pobiera od użytkownika (liczbę) ​N​​a nastepnie:
        a. losuje ​N ​​liczb całkowitych (dowolny zakres) i wypisuje je na ekran
        b. losuje ​N ​​liczb zmiennoprzecinkowych i wypisuje je na ekran
        c. losuje ​N​​ razy wartość boolean i wypisuje je na ekran
        d. pobiera kolejne dwa parametry ​poczatekZakresui​koniecZakresui losuje​N
        liczb całkowitych z tego zakresu, a następnie wypisuje je na ekran
        e. pobiera kolejne dwa parametry ​poczatekZakresui​koniecZakresui losuje​N
        liczb zmiennoprzecinkowych z tego zakresu, a następnie wypisuje je na ekran

        Rozwiąż to zadanie wykorzystując mechanizm losowania liczb z klasyRandom oraz z
        klasy Math (metoda random()).*/
public class zad13_Random {
    public static void main(String[] args) {
        //Rozwiązanie z klasą Random
        Scanner in= new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Podaj liczbę N: ");
        int liczbaN=in.nextInt();


        for (int i = 0; i < liczbaN; i++) {
            System.out.println("Wylosowana liczba "+(i+1)+" wynosi "+rd.nextInt(100)+liczbaN);//dolny zakres to liczba N, 100 sama ograniczyłam
        }

        for (int i = 0; i < liczbaN; i++) {
            System.out.println("Wylosowana liczba "+(i+1)+" wynosi "+rd.nextDouble());
        }

        for (int i = 0; i < liczbaN; i++) {
            System.out.println("Wylosowana liczba "+(i+1)+" wynosi "+rd.nextBoolean());
        }

        System.out.println("Podaj zakres dolny losowanych liczb: ");
        int zakresDolny=in.nextInt();
        System.out.println("Podaj zakres górny losowanych liczb: ");
        int zakresGorny=in.nextInt();

        for (int i = 0; i < liczbaN; i++) {
            int wylosowana = rd.nextInt(zakresGorny-zakresDolny)+zakresDolny;
            System.out.println("Wylosowana liczba "+(i+1)+" wynosi "+wylosowana);
        }

        int j=0;
        while (j<liczbaN){
            double wylosowana = rd.nextDouble();
            if(wylosowana>=zakresDolny && wylosowana<=zakresGorny) {
                System.out.println("Wylosowana liczba " + (j + 1) + " wynosi " + wylosowana);
                j++;
            }
        }
    }
}
