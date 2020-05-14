package zadania_1.postawy;

import java.util.Scanner;

public class zadanie3 {
/*    Zadanie 3. Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych.
W programie zdefiniuj wartość dochód (double) na pewną wartość i po obliczeniu wypisywać na ekranie należny podatek.
Podatek obliczany jest wg. następujących reguł:
            do 85528 podatek wynosi 18% podstawy minus 556,02 PLN,
    od 85528 podatek wynosi 14839,02 zł + 32% nadwyżki ponad 85528,00*/

    public static void main(String[] args) {

        System.out.println("Podaj swój dochód:");

        Scanner podanyDochod = new Scanner(System.in);
        double dochod = podanyDochod.nextDouble();

        if (dochod > 0 && dochod < 85528) {
            System.out.println("Podatek wynosi:" + ((0.18 * dochod) - 556.02));
        } else if (dochod < 0) {
            System.out.println("Wprowadziłeś niepoprawny dochód");
        } else {
            System.out.println("Podatek wynosi:" + (14839.02 + 0.32 * (dochod - 85528)));
        }
    }
}
