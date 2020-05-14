package zadania_4.zad3A_komputer;
/*KlasaZadanie 3:
        Zadanie (podobnie jak wyżej) polega na przemyśleniu kiedy używać kompozycji,
        a kiedy dziedziczenia. W tym zadaniu postaraj się zaimplementować klasy.
        (nie zapomnij, że niektóre elementy mogą występować wielokrotnie w jednym obiekcie.
        np. w województwie może być wiele miast, w tej sytuacji zaprezentuj je w postaci tabeli).-
        3 a. Komputer, Procesor, DyskTwardy, PamięćRAM, Wentylator, UkładObliczeniowy, PodzespółKomputerowy,
        Zasilacz, Wentylator, UPS, ŹródłoZasilania, MagazynDanych, PłytaGłówna
        3b. Państwo, Województwo, Powiat, Gmina, Miasto, Sołtys, Prezydent, Obszar, ObszarGeograficzny,
        ObszarPolityczny, KrainaGeograficzna
        3c. Planeta, Ziemia, Mars, Słońce, Gwiazda, CzarnaDziura,
        CiałoNiebieskie, Księżyc, Pluton, Atmosfera, Grawitacja*/


import zadania_4.zad3B_krainaGeograficzna.*;
import zadania_4.zad3C_planeta.*;


public class Main {
    public static void main(String[] args) {
        Komputer[] tabKomputerow ={
                new Komputer(new PodzespolKomputerowy("super wentylator","nowa plyta",
                                    new MagazynDanych("super dysk"),
                                    new ZrodloZasilania("nowe","65w"),
                                    new UkladObliczeniowy("procesor","800")))
        };


        KrainaGeograficzna[] tabKrain={
                new KrainaGeograficzna(new Obszar(TypObszaru.POLITYCZNY, ZakresObszaru.PANSTWO, Wlodarze.PREZYDENT)),
                new KrainaGeograficzna(new Obszar(TypObszaru.POLITYCZNY, ZakresObszaru.MIASTO, Wlodarze.SOLTYS)),

        };
        CialaNiebieskie[] tabCialNiebieskich={
                new Ziemia("ziemska","9G"),
                new Slonce(),
                new Gwiazda(),
                new CzarnaDziura()
        };
    }
}
