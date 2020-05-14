package zadania_4.zad2A_pomieszczenia;
/*
Zadanie 2:
        Zaprojektuj w postaci schematu (podobnie jak w prezentacji) odpowiednio oznaczając strzałki dziedziczenia i kompozycji,
        oraz zaimplementuj kod.
        Spróbuj zaimplementować klasy z odpowiednimi rozszerzeniami (slowko extends lub obiekty jako pole).
        W miejscach gdzie występuje kompozycja stwórz chociaż jedno pole odpowiadające tej kompozycji.
        Np. W Kuchni jest lodówka (więc lodówka będzie polem).
        - 2a.:Pomieszczenie, Kuchnia, Salon, Łazienka, Pokój, Mebel, Fotel, Lodówka, Urządzenie, Kuchenka, Kanapa, Telewizor
        - 2b.:Pojazd, Samochód, Okręt, Koła, Stery, Silnik, Nazwa, Marka, Samolot, Fotel, Prom
        - 2c.:Szkoła podstawowa, Liceum, Politechnika, Uczelnia, Instytucja edukacyjna, Uczeń, Nauczyciel, Człowiek, Klasa
*/


import zadania_4.zad2B_pojazdy.Element;
import zadania_4.zad2B_pojazdy.Pojazd;
import zadania_4.zad2B_pojazdy.TypPojazdu;
import zadania_4.zad2C_szkola.*;

public class Main {
    public static void main(String[] args) {
        Pomieszczenie[] tabPomieszczen= {
            new Pomieszczenie(TypPomieszczenia.KUCHNIA, TypUrzadzenia.LODOWKA, TypMebli.BRAK),
            new Pomieszczenie(TypPomieszczenia.SALON, TypUrzadzenia.TELEWIZOR, TypMebli.FOTEL)
        };

        Pojazd[] pojazd = {
                new Pojazd(TypPojazdu.SAMOCHOD,"Asia","Opel", Element.KOLO),
                new Pojazd(TypPojazdu.OKRET,"Omega","Jacht", Element.STERY),
                new Pojazd(TypPojazdu.SAMOLOT,"Rainer","Being", Element.FOTEL)
        };

        InstytucjaEdukacyjna[] instytucje= {
                new InstytucjaEdukacyjna(TypUczelni.LICEUM, new Klasa(45), new Nauczyciel("Jan","Kowalski")),
                new InstytucjaEdukacyjna(TypUczelni.SZKOLA_PODSTAWOWA, new Klasa(45), new Uczen("Janina","Kowalska"))
        };
    }
}
