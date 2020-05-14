package zadania_1.dodatkowe;

import java.util.Scanner;

/*11.Napisać program obliczający należny podatek dochodowy od osób zycznych. W
        programie zdefiniuj wartość dochód (double) na pewną wartość i po obliczeniu
        wypisywać na ekranie należny podatek. Podatek obliczany jest wg. następujących
        reguł:
        a. do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
        b. od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00*/
public class zad11 {
    public static void main(String[] args) {
        double dochod;

        dochod = pobierzDochod();

        if (dochod == 0) {
            System.out.println("Nie masz dochodu, to nie masz podatku");
        } else if (dochod < 85528.00) {
            System.out.println("Podatek wyniesie " + ((dochod * 0.18) - 556.02) + " PLN");
        } else {
            System.out.println("Podate wyniesie " + (14839.02 + (0.32 * (dochod - 85528.00))) + " PLN");
        }


    }

    public static double pobierzDochod() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dochód");
        return in.nextInt();
    }
}
