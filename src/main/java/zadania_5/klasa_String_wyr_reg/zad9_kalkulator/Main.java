package zadania_5.klasa_String_wyr_reg.zad9_kalkulator;

import java.util.Scanner;

/*9. Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na
        wykonywanie operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch
        liczbach rzeczywistych. Program ma identykować sytuację wprowadzenia błędnego
        symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję if else do
            wykonania odpowiedniego działania w zależności od wprowadzonego symbolu
        operacji. Scenariusz działania programu:
        a. Program wyświetla informację o swoim przeznaczeniu.
        b. Wczytuje pierwszą liczbę.
        c. Wczytuje symbol operacji arytmetycznej: +, -, *, /.
        d. Wczytuje drugą liczbę.
        e. Wyświetla wynik lub - w razie konieczności - informację o niemożności           wykonania działania.*/
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Program kalkulator");
        boolean wyjscie=false;
        do {

            System.out.println("Podaj liczbę a: ");
            int liczbaA = in.nextInt();
            String xx=in.nextLine();
            System.out.println("Podaj działanie jakie chcesz wykonać? [+, -, *, /, %, q]");
            String znak = in.nextLine();
            char symbol =znak.charAt(0);
            System.out.println("Podaj liczbę b: ");
            int liczbaB = in.nextInt();


            switch (symbol) {
                case '+':
                    int suma = liczbaA + liczbaB;
                    System.out.println("a + b = " + suma);
                    break;
                case '-':
                    int roznica = liczbaA - liczbaB;
                    System.out.println("a - b = " + roznica);
                    break;
                case '*':
                    int iloczyn = liczbaA * liczbaB;
                    System.out.println("a * b = " + iloczyn);
                    break;
                case '/':
                    if (liczbaB != 0) {
                        int iloraz = liczbaA / liczbaB;
                        System.out.println("a / b = " + iloraz);
                    } else {
                        System.out.println("Nie ma dzielenia przez zero");
                    }
                    break;
                case '%':
                    if (liczbaB != 0) {
                        int iloraz = liczbaA % liczbaB;
                        System.out.println("a % b = " + iloraz);
                    } else {
                        System.out.println("Nie ma dzielenia przez zero");
                    }
                    break;
                case 'q':
                    wyjscie=true;
                    break;
                default:
                    System.out.println("Wybrano złą operacje");
                    break;
            }
        }while (wyjscie==false);

    }
}
