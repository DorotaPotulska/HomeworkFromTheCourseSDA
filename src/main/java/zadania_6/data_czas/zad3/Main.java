package zadania_6.data_czas.zad3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*Napisz aplikację, która wyświetli "różnicę" dwóch dat w formacie: "years: , months: , days: "
        Wskazówka: skorzystaj z klasy Period:
        Period period = Period.between(data_start, data_stop);*/
public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date1=LocalDate.parse("05.06.1984",formatter);
        LocalDate date2=LocalDate.parse("04.02.1985",formatter);

        Period period= Period.between(date1,date2);

        System.out.println("Days "+ period.getDays()+ " Month "+period.getMonths()+" Years "+period.getYears());
    }

}
