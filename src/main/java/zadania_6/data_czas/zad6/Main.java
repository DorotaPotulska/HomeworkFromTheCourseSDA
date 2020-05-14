package zadania_6.data_czas.zad6;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

/*Napisz aplikację która po odpowiedzi użytkownika na pytania:
        1) Podaj datę urodzenia w formacie: yyyy-MM-dd":
        2) Kobieta, czy mężczyzna (k/m) - mężczyźni żyją średnio o 10 lat krócej
        3) Czy palisz papierosy? y/n   (palący żyją średnio 9 lat i 3 miesiące krócej)
        4) Czy żyjesz w stresie? (jeśli tak, istnieje 10% prawdopodobieństwo, że umrzesz na zawał serca w wieku 60 lat)

        Wskazówka dot. ‘prawdopodobieństwa’:

        Random generator = new Random();
        int losowaLiczba = generator.nextInt(100);
        if (losowaLiczba < 10) {
        // 10 %
        }

        ...poda użytkownikowi przybliżoną datę śmierci. Załóż, że "startowa" długość życia to 100 lat.
        Aplikacja ma podawać datę z        dokładnością do miesiąca. Możesz dodać dodatkowe warunki.
        Możesz użyc klasy java.time.Period
        * Wyświetl na końcu, ile użytkownik stracił czasu na bezsensownym sprawdzaniu daty śmierci
        **(+300pkt) Dodaj nowe dodatkowe warunki i randomizuj niektóre wartości
*/
public class Main {
    public static void main(String[] args) {
        LocalDateTime dateStart =LocalDateTime.now();

        LocalDate date=LocalDate.now();

        Scanner in= new Scanner(System.in);
        System.out.println("Podaj datę urodzenia w formacie: dd.MM.yyyy");
        String dateBorn=in.nextLine();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDateBorn = LocalDate.parse(dateBorn,formatter);
        System.out.println("localDateBorn"+localDateBorn);

        LocalDate dateDead =localDateBorn.plusYears(100);
        System.out.println("dateDead"+dateDead);

        System.out.println("Kobieta, czy mężczyzna (k/m)");
        String gender=in.nextLine();
        if(gender.equals("m")){
            dateDead=dateDead.minusYears(10);
        }
        System.out.println("dateDead"+dateDead);

        System.out.println("Czy palisz papierosy? y/n");
        String cigaretes =in.nextLine();
        if(cigaretes.equals("y")){
            dateDead=dateDead.minusYears(9);
            dateDead=dateDead.minusMonths(3);
        }

        System.out.println("Czy żyjesz w stresie? y/n");
        String life = in.nextLine();

        Period ageNow = Period.between(localDateBorn,date);
        int monthCountAgeNow=ageNow.getYears()*12+ageNow.getMonths();
        System.out.println("monthCountAgeNow"+monthCountAgeNow);

        Period ageDead= Period.between(localDateBorn,dateDead);
        int monthCountAgeDead=ageDead.getYears()*12+ageDead.getMonths();
        System.out.println("monthCountAgeDead"+monthCountAgeDead);

        if(life.equals("y")){
            Random generator = new Random();
            int losowaLiczba = generator.nextInt(100);
            System.out.println("losowaLiczba"+losowaLiczba);
            if (losowaLiczba < 10) {
               if(monthCountAgeNow<monthCountAgeDead){
                   dateDead=localDateBorn.plusYears(60);
               }
            }
        }

        System.out.println("dateDead"+dateDead);

        if(dateDead.isAfter(date)){
            System.out.println("dateDead"+dateDead);
        }else{
            System.out.println("Żyj długo i szczęśliwie");
        }
        LocalDateTime dateEnd = LocalDateTime.now();
        Duration duration= Duration.between(dateStart,dateEnd);
        System.out.println("Straciłeś "+duration.getSeconds() +" sekund");
    }
}
