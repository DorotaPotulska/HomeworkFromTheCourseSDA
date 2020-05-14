package zadania_6.data_czas.zad5;
/*•	Napisz aplikację, która obliczy twój wiek. Podaj wiek w formacie:
        •	Masz X lat, Y miesięcy, Z dni. (użyj Period)
        •	Masz XYZ sekund. (użyj Duration)*/

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate dateNow= LocalDate.now();
        String dateBorn="04.02.1985";

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate dateBorn2=LocalDate.parse(dateBorn,formatter);

        Period period = Period.between(dateBorn2,dateNow);

        System.out.println("Years "+period.getYears()+ " Months "+period.getMonths()+" Days "+period.getDays());

        ////
        LocalDateTime dateTimeNow = LocalDateTime.now();

        String dateTimeBorn="04.02.1985 00::00::00";
        DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("dd.MM.yyyy HH::mm::ss");
        LocalDateTime dateBorn3=LocalDateTime.parse(dateTimeBorn,formatter2);

        System.out.println(Duration.between(dateBorn3,dateTimeNow).getSeconds()+" sekund");

    }
}
