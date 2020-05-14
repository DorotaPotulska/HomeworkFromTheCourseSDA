package zadania_1.dodatkowe;

/*6. Zadeklaruj dwie zmienne - 'waga' oraz 'wzrost'. Przypisz do nich jakieś wartości.
        Stwórz instrukcję warunkową ('if') który sprawdza czy osoba (np. taka która na
        kolejkę/rollercoaster) jest wyższa niż 150 cm wzrostu i nie przekracza wagą 180 kg.*/
public class zad6 {
    public static void main(String[] args) {
        int waga;
        int wzrost;

        waga = 60;
        wzrost = 170;

        if (waga < 180 && wzrost > 150) {
            System.out.println("Możesz wejsc na rollercoaster");
        } else {
            System.out.println("Nie możesz wejsc na kolejkę rollercoster");
        }
    }
}
