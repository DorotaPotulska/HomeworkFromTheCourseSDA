package zadania_6.objektowosc.zad3;

import java.time.LocalTime;
import java.util.Map;

public class Dyspozytornia {

    protected Map<String,Zgłoszenie> mapaZgloszen;

    public void dodajZgloszenie(String tresc, TypZgloszenia typ){

        Zgłoszenie zgłoszenie= new Zgłoszenie(typ,tresc, LocalTime.now());

    }
}


/*
  dodaj do klasy Dyspozytornia metody:
          - dodajZgloszenie(String tresc, TypZgloszenia typ):void -
          która tworzy nową instancję "Zgłoszenia" i dodaje je do mapy (spróbuj wymyślić unikalny identyfikator zgłoszenia)
          Wskazówka:  http://www.baeldung.com/java-uuid
          - zwróćNajaktualniejszeZgłoszenia(int ilosc):List<Zgłoszenie> - metoda która sortuje zgłoszenia po czasie i zwraca 'ilość' zgłoszeń z parametru.
        - zwróćZgłoszeniaTypu(TypZgłoszenia typ):List<Zgłoszenie> - metoda znajduje w mapie tylko zgłoszenia podanego typu i zwraca je wszystkie POSORTOWANE PO CZASIE DODANIA
*/
