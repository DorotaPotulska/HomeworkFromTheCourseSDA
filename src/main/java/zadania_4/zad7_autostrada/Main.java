package zadania_4.zad7_autostrada;
/*
Zadanie 7:
        Stwórz aplikację Autodstrada. Celem zadania będzie implementacja systemu autostrady.
        Do tej implementacji będzie nam potrzebny klasa Highway która reprezentuje autostradę,
        oraz klasa VehicleInfo która reprezentuje zbiór informacji o pojeździe - tam będziemy przechowywać
        takie dane jak jego rejestracja, jego typ(ciezarowka czy osobowy) i datę i godzinę wjazdu -
        po której będziemy rozliczać pojazdy wyjezdzające z autostrady.
        1. Stwórz enum CarType, który posiada typy TRUCK, CAR, MOTORCYCLE.
        2. Stwórz klasę VehicleInfo, która powinna posiadać numer rejestracyjny pojazdu (String),
        typ pojazdu (CarType), oraz datę WJAZDU na autostradę.
        3. Stwórz klasę Highway która będzie posiadać :
        - kolekcję wszystkich pojazdów
        - metodę vehicleEntry(String numer_rejestracyjny, oraz CarType type) - która dodaje do kolekcji nową instancję
        VehicleInfo oraz wypisuje do konsoli komunikat. Metoda nic nie zwraca.
        - metodę searchVehicle(String numer_rejestracyjny) - która szuka pojazdu i wypisuje jego informacje jeśli
        wciąż znajduje się na autostradzie
        - metodę wyjazdu - vehicleLeave(String numer_rejestracyjny) - która usuwa samochód z kolekcji, wypisuje
        komunikat, oraz na podstawie czasu jaki samochód znajdował się na autostradzie oblicza jej kwotę do zapłaty
        i wypisuje ją do konsoli.
        Przyjmij pewną stałą kwotę do zapłaty za czas spędzony na autostradzie. Jest to zabawna autostrada, bo zachęca
        do szybkiej jazdy. Im szybciej wyjedziemy tym mniej zapłacimy.
        4. Stwórz main który przyjmuje komendy
        - wjazd NR_REJESTRACYJNY TYP
        - wyjazd NR_REJESTRACYJNY
        - sprawdz NR_REJESTRACYJNY
        i wykonuje odpowiednie akcje na instancji klasy highway.
        UWAGI:
        - kwota naliczania powinna być od każdej sekundy spędzonej na autostradzie.
        - zwróć uwagę że czas wjazdu powinien być ustawiany w momencie wjazdu
        - kwota naliczania dla samochodów osobowych i ciężarówek powinna być inna.
        *- NA AUTOSTRADZIE NIE POWINIEN SIĘ ZNAJDOWAĆ DRUGI SAMOCHÓD O TEJ SAMEJ REJESTRACJI. Jeśli samochód o pewnej
        rejestracji wjechał już na autostradę rzuć Exception. Stwórz własny exception,
        nazwij go "VehicleAlreadyOnHighwayException". Niech jest to wyjątek niejawny.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws VehicleAlreadyOnHighwayException {
        ArrayList<VehicleInfo> pojazdy = new ArrayList<>();
        Highway autostrada = new Highway(pojazdy);

        Scanner in = new Scanner(System.in);
        boolean wyjscie =false;
        CarType rodzaj;
        do {
            System.out.println("Co chcesz zrobic? [wjazd, wyjazd, sprawdz, print, quit]");
            String decyzja = in.nextLine();

            switch (decyzja) {
                case "wjazd":

                    System.out.println("Podaj numer rejestracyjny");
                    String rejestracja = in.nextLine();
                    System.out.println("Podaj typ pojazdu [TRUCK, CAR, MOTORCYCLE ]");
                    rodzaj = CarType.valueOf(in.nextLine());

               /* if(typ.equalsIgnoreCase("TRUCK")){
                    rodzaj = CarType.TRUCK;
                }else if (typ.equalsIgnoreCase("CAR")){
                    rodzaj = CarType.CAR;
                }else if (typ.equalsIgnoreCase("MOTORCYCLE")){
                    rodzaj = CarType.MOTORCYCLE;
                }else {
                    System.out.println("Pomyłka");
                }
                */
               try {
                   autostrada.vehicleEntry(rejestracja, rodzaj);
               } catch(VehicleAlreadyOnHighwayException e){
                   System.out.println(e.getMessage());
               }
                    break;
                case "wyjazd":
                    System.out.println("Podaj numer rejestracyjny");
                    rejestracja = in.nextLine();
                    autostrada.vehicleLeave(rejestracja);
                    break;
                case "sprawdz":
                    System.out.println("Podaj numer rejestracyjny");
                    rejestracja = in.nextLine();
                    autostrada.searchVehicle(rejestracja);
                    break;
                case "print":
                    for(VehicleInfo x:pojazdy){
                        System.out.println(x);
                    }
                    break;
                case "quit":
                    wyjscie = true;
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
                    break;
            }}
            while (wyjscie == false) ;


        }

    }

