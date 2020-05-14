package zadania_1.dodatkowe;
/*7. Rozwinięcie poprzedniego zadania:
        a. Dopisz do poprzedniej aplikacji dodatkową zmienną - wiek. Jeśli osoba jest
        młodsza niż 10 lat, lub starsza niż 80, to nie może wejść na kolejkę.
        b. Dopisz/zmień do/w poprzedniej aplikacji - osoba może wejść na kolejkę jeśli
        jej wzrost jest od 150 do 220 cm wzrostu. c. Dopisz deskryptywne wyjasnienia.
        i. Jesli osoba nie moze wejsc na kolejke, to wypisz na konsole
        odpowiedni komunikat dlaczego. np. “Nie możesz wejść na
        kolejkę ponieważ jesteś zbyt ciężki/a”
        ii. Jesli osoba nie moze wejsc z powodu wagi, to powinien sie wypisac
        komunikat ze nie moze wejsc bo przekracza limit wagowy
        iii. Jesli osoba nie moze wejsc z powodu wieku, to powinien sie wypisac
        INNY komunikat o tym ze nie moze wejsc z powodu wieku.*/

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        int wiek, waga, wzrost;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj wiek ");
        wiek = in.nextInt();

        System.out.println("Podaj wagę ");
        waga = in.nextInt();

        System.out.println("Podaj wzrost ");
        wzrost = in.nextInt();

        if (wzrost > 150 && wzrost < 220 && wiek >= 10 && wiek <= 80 & waga >= 30 && waga <= 100) {
            System.out.println("Możesz wejść na kolejkę");
        } else if (wiek > 80) {
            System.out.println("Nie możesz wejść na kolejkę, masz za dużo lat");
        } else if (wiek < 10) {
            System.out.println("Nie możesz wejść na kolejkę, masz za mało lat");
        } else if (wzrost <= 150) {
            System.out.println("Nie możesz wejsc na kolejkę, masz za mało wzrostu");
        } else if (wzrost >= 220) {
            System.out.println("Nie możesz wejsc na kolejkę, masz za dużo wzrostu");
        } else if (waga < 30) {
            System.out.println("Nie możesz wejsc na kolejkę, za mało ważysz");
        } else if (waga > 100) {
            System.out.println("Nie możesz wejsc na kolejkę, za duzo ważysz");
        }
    }
}