package zadania_6.data_czas.zad4;
/*
Pobierz od użytkownika dwie daty. Jedna w formacie:
        yyyy::MM::dd

        oraz druga w formacie:
        MM::yyyy::dd

        Wypisz wynik różnicy dat w formacie:
        Minęło: X lat, Y miesięcy, Z dni.

        Do wypisania dni/lat/miesięcy z Period, wykorzystaj jego gettery.
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj datę w formacie: yyyy::MM::dd");
        String date1= in.nextLine();

        System.out.println("Podaj datę w formacie: MM::yyyy::dd");
        String date2= in.nextLine();

        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("yyyy::MM::dd");
        DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("MM::yyyy::dd");

        LocalDate localDate1 = LocalDate.parse(date1,formatter1);
        LocalDate localDate2 = LocalDate.parse(date2,formatter2);
        Period period;
        if(localDate2.isAfter(localDate1)) {

            period = Period.between(localDate1, localDate2);
        }else{
            period = Period.between(localDate2, localDate1);
        }

        System.out.println("Days "+period.getDays()+" Months "+period.getMonths()+" Years "+period.getYears());
    }
}
