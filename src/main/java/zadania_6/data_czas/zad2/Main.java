package zadania_6.data_czas.zad2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*Napisz aplikację, która wyświetli datę (wpisaną ze scannera) sprzed 10 dni i datę za dziesięć dni.
        Wskazówka: skorzystaj z metody plusDays() na obiekcie LocalDate.*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj datę: dd.MM.yyyy");
        String date = in.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println("-10 days: " + localDate.minus(Period.ofDays(10)));
        System.out.println("+10 days: " + localDate.plus(Period.ofDays(10)));
    }
}
