package zadania_6.wyjatki.zad3;


public class Person {
    private String imie;
    private String nazwisko;
    private int wiek;

    public Person(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }
}
