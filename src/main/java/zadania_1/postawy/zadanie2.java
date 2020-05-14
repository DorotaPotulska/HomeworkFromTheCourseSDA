package zadania_1.postawy;

public class zadanie2 {
    /* Zadanie 2. Rozwinięcie poprzedniego zadania:
        Dopisz do poprzedniej aplikacji dodatkową zmienną - wiek. Jeśli osoba jest młodsza niż 10 lat,
        lub starsza niż 80, to nie może wejść na kolejkę.
        Dopisz/zmień do/w poprzedniej aplikacji - osoba może wejść na kolejkę jeśli jej wzrost jest od 150 do 220 cm wzrostu.
        Dopisz deskryptywne wyjasnienia.
    -Jesli osoba nie moze wejsc na kolejke, to wypisz na konsole odpowiedni komunikat dlaczego.
    np. “Nie możesz wejść na kolejkę ponieważ jesteś zbyt ciężki/a”
    -Jesli osoba nie moze wejsc z powodu wagi, to powinien sie wypisac komunikat ze nie moze wejsc bo przekracza limit wagowy
    -Jesli osoba nie moze wejsc z powodu wieku, to powinien sie wypisac INNY komunikat o tym ze nie moze wejsc z powodu wieku.
    */
    public static void main(String[] args) {
        float waga = 60;
        int wzrost = 185;
        int wiek = 66;

        if (
                wzrost > 150
                && wzrost < 220
                && waga < 180
                && wiek > 10
                && wiek < 80) {
            System.out.println("Możesz wejść na kolejkę");
        } else if (wzrost <= 150 || wzrost >= 220) {
            System.out.println("Nie możesz wejść na kolejkę ponieważ nie spełniasz warunku wzrostu”");
        } else if (waga >= 180) {
            System.out.println("Nie możesz wejść na kolejkę ponieważ nie spełniasz warunku wagi”");
        } else {
            System.out.println("Nie możesz wejść na kolejkę ponieważ nie spełniasz warunku wieku");
        }
    }

}
