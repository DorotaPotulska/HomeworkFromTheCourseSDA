package zadania_1.dodatkowe;

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
public class zad13_Math_dokoncz {
    public static void main(String[] args) {
        //Rozwiązanie klasą Math

        Scanner in= new Scanner(System.in);
        System.out.println("Podaj liczbę N: ");
        int liczbaN=in.nextInt();
        //do konsultacji , przedział nie działa
        /*int min =liczbaN;
        int max =100; // sama ograniczam górnym zakresem
        int range= max-min;
        for (int i = 0; i < liczbaN; i++) {
            System.out.println("Wylosowana liczba "+(i+1)+" wynosi "+(int)(Math.random()*range)+min);//dolny zakres to liczba N, 100 sama ograniczyłam
        }*/
        double minD =liczbaN;
        double maxD =100.0; // sama ograniczam górnym zakresem
        double rangeD= maxD-minD;
        for (int i = 0; i < liczbaN; i++) {
            System.out.println("Wylosowana liczba "+(i+1)+" wynosi "+(double)(Math.random()*rangeD)+minD);
        }



        System.out.println("Podaj zakres dolny losowanych liczb: ");
        int zakresDolny=in.nextInt();
        System.out.println("Podaj zakres górny losowanych liczb: ");
        int zakresGorny=in.nextInt();

        for (int i = 0; i < liczbaN; i++) {
            int wylosowana = (int) (Math.random()*(zakresGorny-zakresDolny)+zakresDolny);
            System.out.println("Wylosowana liczba "+(i+1)+" wynosi "+wylosowana);
        }

        int j=0;
        while (j<liczbaN){
            double wylosowana = (double) (Math.random()*(zakresGorny-zakresDolny)+zakresDolny);
            if(wylosowana>=zakresDolny && wylosowana<=zakresGorny) {
                System.out.println("Wylosowana liczba " + (j + 1) + " wynosi " + wylosowana);
                j++;
            }
        }
    }
}
