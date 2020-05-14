package zadania_3.zad7_robot;
/*
Zadanie 7
        Stwórz enum RuchRobota która posiada wartości:
        KROK_LEWA, KROK_PRAWA, RUCH_REKA_LEWA, RUCH_REKA_PRAWA, SKOK
        każdy z ruchów posiada również dodatkową informację (liczbową) która reprezentuje ile % baterii robota
        jest potrzebne do wykonania podanego ruchu.

        Stwórz klasę Robot która posiada pola:
        - poziom baterii ( wartość od 0 do 100)
        - nazwa robota
        - czy włączony
        stwórz metody:
        - poruszRobotem(RuchRobota):void - ktora porusza robotem jeśli robot posiada dostateczną ilość energii (oraz odejmuje zadaną ilość energii z robota)
        - naładujRobota():void - która zwiększa ilość % baterii do 100%
        - włączRobota():void - włącza robota
        - wyłączRobota():void - wyłącza robota

        UWAGI:
        Robot nie może się poruszać kiedy jest wyłączony!
        Robot może być ładowany tylko gdy jest wyłączony!


        Dodaj obsługę komend wpisywanych w konsoli:
        ruch RUCH
        naladuj
        wlacz
        wylacz
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot("Zenek",90,true);

        Scanner in = new Scanner(System.in);
        String wybor;
        boolean wyjscie= false;
        System.out.println(robot);
        do{

            System.out.println("Co chcesz zrobić? [ruch, wlacz, wylacz, naladuj, quit]");
            wybor=in.nextLine();

            switch (wybor){
                case "ruch":
                    System.out.println("Co chcesz poruszyć? [RL, RP, KL, KP, S]");
                    String wybor2 = in.nextLine();
                    RuchRobota ruchRobota;
                    switch (wybor2.toUpperCase()){
                        case "RL":
                            ruchRobota= RuchRobota.RUCH_REKA_LEWA;
                            break;
                        case "RP":
                            ruchRobota= RuchRobota.RUCH_REKA_PRAWA;
                            break;
                        case "KL":
                            ruchRobota= RuchRobota.KROK_LEWA;
                            break;
                        case "KP":
                            ruchRobota= RuchRobota.KROK_PRAWA;
                            break;
                        case "S":
                            ruchRobota= RuchRobota.SKOK;
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + wybor2.toUpperCase());
                    }

                    robot.poruszRobotem(ruchRobota);
                    break;
                case "wlacz":
                    robot.wlaczRobota();
                    break;
                case "wylacz":
                    robot.wylaczRobota();
                    break;
                case "naladuj":
                    robot.naladujRobota();
                    break;
                case "quit":
                    wyjscie=true;
                    break;
                default:
                    System.out.println("Wybrano złą opcje");
                    break;
            }

        }while (wyjscie==false);

    }
}
