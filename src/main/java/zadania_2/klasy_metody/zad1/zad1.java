package zadania_2.klasy_metody.zad1;

import java.util.Scanner;

/*1. Rozbudowa klasy Kalkulator z zajęć
        a. Dodanie dodatkowej operacji modulo, w sytuacji gdy użytkownik wpisze ‘%’
        b. Zmiana wyświetlania wyników, tak aby były drukowane na ekranie w następujący sposób:
        {liczba1} {działanie} {liczba2} = {wynik}, np. 5-3=2*/
public class zad1 {
    public static void main(String[] args) {
        int[] tablicaLiczb = pobierzLiczby();
        char znak = pobierzZnak();

        System.out.println("Otrzymany wynik " +tablicaLiczb[0]+" "+ znak +" "+tablicaLiczb[1]+ " wynosi: " + Kalkulator(znak,tablicaLiczb[0],tablicaLiczb[1]));

        //w tym przypadku nie ma to sensu bo bedziemy 2 razy wywływac metodę pobierzLiczby() i pobierac raz 0 element a za drugim razem 1
        //System.out.println("Otrzymany wynik " +tablicaLiczb[0]+" "+ znak +" "+tablicaLiczb[1]+ " wynosi: " + Kalkulator(znak,pobierzLiczby()[0],pobierzLiczby()[1]));

    }


    public static char pobierzZnak() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj rodzaj działania : *,+,-,/,%");
        char znak = in.nextLine().charAt(0);
        return znak;

    }

    public static int[] pobierzLiczby() {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe 1: ");
        int licznik = in.nextInt();

        System.out.println("Podaj liczbe 2: ");
        int mianownik=in.nextInt();

        int[] tablicaDanych=new int[]{licznik,mianownik};

        return tablicaDanych;
    }

    public static float Kalkulator(char znak, int liczba1,int liczba2) {
        float wynik=0;
        switch (znak) {
            case '+':
                wynik = liczba1+liczba2;
                break;
            case '-':
                wynik = liczba1-liczba2;
                break;
            case '*':
                wynik = liczba1*liczba2;
                break;
            case '/':
                wynik = liczba1/liczba2;
                break;
            case '%':
                wynik = liczba1%liczba2;
                break;
            default:
                System.out.println("Podano błedne dane");
                break;

        }
        return wynik;
    }
}
