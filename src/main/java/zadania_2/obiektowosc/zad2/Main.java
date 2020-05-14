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
public class Main {
    public static void main(String[] args) {
        Samochod Opel = new Samochod("Opel",40);
        Samochod BMV = new Samochod("BMV",100);

        Samochod[] tablicaAut = new Samochod[]{Opel,BMV};

        for(int i=0;i<tablicaAut.length;i++){
            tablicaAut[i].wypiszInformacjeOSamochodzie();
            tablicaAut[i].przyspieszO5km();
            tablicaAut[i].zwolnijO5km();
        }

        for(int i=0;i<tablicaAut.length;i++){

            tablicaAut[i].przyspieszO5km();
            tablicaAut[i].wypiszInformacjeOSamochodzie();

        }

        for(int i=0;i<tablicaAut.length;i++){
            tablicaAut[i].zwolnijO5km();
            tablicaAut[i].wypiszInformacjeOSamochodzie();

        }
    }


}
