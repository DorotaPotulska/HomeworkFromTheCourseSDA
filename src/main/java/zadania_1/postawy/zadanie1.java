package zadania_1.postawy;

public class zadanie1 {
    /* Zadanie 1. Zadeklaruj dwie zmienne - 'waga' oraz 'wzrost'.
    Przypisz do nich jakieś wartości. Stwórz instrukcję warunkową ('if') który sprawdza czy osoba
    (np. taka która  na kolejkę/rollercoaster) jest wyższa niż 150 cm wzrostu i nie przekracza wagą 180 kg.
     Wypisz finalnie komunikat:
     "Możesz wejść na kolejkę" lub "Nie możesz wejść na kolejkę"
     w zależności od tego czy osoba może lub nie może wejść na kolejkę*/
    public static void main(String[] args) {
        float waga;
        int wzrost;

        waga = 60;
        wzrost = 185;

        if (wzrost > 150 && waga < 180) {
            System.out.println("Możesz wejść na kolejkę");
        } else {
            System.out.println("Nie możesz wejść na kolejkę");
        }

    }

}
