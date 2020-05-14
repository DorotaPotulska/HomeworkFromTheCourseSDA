package zadania_2.obiektowosc.zad2;
/*zad 2 Stwórz klasę Samochód.
        Dodaj do klasy dwa pola:
        String nazwa;
        int predkosc;

        stwórz trzy metody w klasie samochód:
        wypiszInformacjeOSamochodzie():void - która wypisuje informacje o samochodzie (prędkość, nazwę itd.)
        przyspieszO5kmh():void - która ma zwiększać wartość prędkości samochodu o 5km/h
        zwolnijO5kmh():void - która ma zmniejszać wartość prędkości samochodu o 5km/h

        przetestuj napisane rozwiaznie*/
public class Samochod {

    String nazwa;
    int predkosc;

    public Samochod(String nazwa,int predkosc){
        this.nazwa=nazwa;
        this.predkosc=predkosc;
    }

    public void wypiszInformacjeOSamochodzie(){
        System.out.println("Nazwa samochodu to "+nazwa+" jedzie z predkoscią "+predkosc+"km/h");
    }

    public void przyspieszO5km(){
        predkosc+=5;
    }

    public void zwolnijO5km(){
        predkosc-=5;
    }
}
