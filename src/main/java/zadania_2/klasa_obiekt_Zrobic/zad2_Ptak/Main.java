package zadania_2.klasa_obiekt_Zrobic.zad2_Ptak;
/*2.	Stwórz klasę Ptak która posiada metodę ‘śpiewaj():void’ która wypisuje ‘ćwir ćwir’.

        a) stwórz klasę dziedziczącą Bocian która nadpisuje klasę ‘śpiewaj():void’ i wypisuje ‘kle kle’
        b) stwórz klasę dziedziczącą Kukułka która nadpisuje klasę ‘śpiewaj():void’ i wypisuje ‘kuku kuku’
        c) stwórz klasę dziedziczącą Sowa która nadpisuje klasę ‘śpiewaj():void’ i wypisuje ‘hu hu’


        Stwórz kilka instancji każdej klasy i przetestuj działanie metod ‘śpiewaj():void’*/

public class Main {
    public static void main(String[] args) {

        Ptak bocian = new Bocian();
        Ptak kukulka = new Kukulka();
        Ptak sowa =new Sowa();

        bocian.spiewaj();
        kukulka.spiewaj();
        sowa.spiewaj();
    }
}
