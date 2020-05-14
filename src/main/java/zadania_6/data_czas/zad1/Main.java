package zadania_6.data_czas.zad1;
/*•	Stwórz aplikację która w pętli przyjmuje polecenie:
        - wpisanie ‘date’ wypisuje obecny LocalDate
        - wpisanie ‘time’ wypisuje obecny LocalTime
        - wpisanie ‘datetime’ wypisuje obecny LocalDateTime
        (W wybranym przez Ciebie formacie)
    Jeśli użytkownik wpisze 'quit' to zakoncz program.

    Daty, podpowiedzi:
Sposób na czas (Java8):
        LocalDateTime czasWjazd = LocalDateTime.now();
        Timestamp tWjazd = Timestamp.valueOf(czasWjazd);

        LocalDateTime czasWyjazd = LocalDateTime.now();
        Timestamp tWyjazd = Timestamp.valueOf(czasWyjazd);

        Long roznicaT = tWyjazd.getTime() - tWjazd.getTime();

Wypisywanie daty w odpowiednim formacie:
        LocalDate data = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy / MM / dd"); // < - format
        System.out.println(data.format(formatter));

Dostępne znaki dla DateTimeFormatter'a:
https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String choice;
        Scanner in = new Scanner(System.in);


        do{

            System.out.println("Options: date|time|datetime|quit");
            choice = in.nextLine();
            switch (choice){
                case "date":
                    printDate();
                    break;
                case"time":
                    printTime();
                    break;
                case "datetime":
                    printDateTime();
                    break;
                case "quit":
                    break;
                default:
                    System.out.println("wrong option!");
                    break;
            }

        }while(!choice.equals("quit"));
    }

    private static void printDateTime() {
        LocalDateTime dateTimeNow=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println(dateTimeNow.format(formatter));
    }

    private static void printTime() {
        LocalTime timeNow=LocalTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(timeNow.format(formatter));
    }

    private static void printDate() {
        LocalDate dateNow= LocalDate.now();
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd / MM / yyyy");
        System.out.println(dateNow.format(formatter));
    }


}
