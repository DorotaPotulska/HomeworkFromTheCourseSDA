package zadania_6.wyjatki.zad4;
/*4.	Stwórz aplikację i w niej załaduj od użytkownika datę i czas w przyszłości.
        Jeśli użytkowonik wpisze datę/czas w złym formacie lub w przeszłości każ mu powtórzyć czynność (użyj pętli).
        Po poprawnym wpisaniu daty oblicz ile czasu(w minutach) zostało do tamtej daty i wypisz na ekran.*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Date now= new Date();
        //System.out.println(now);
        SimpleDateFormat formatDaty = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String result;
        Date dataTeraz = new Date();
        String data;
        Date dataUsera = new Date();

        do{
            try{
                result =formatDaty.format(now);
                System.out.println(result);
                dataTeraz=formatDaty.parse(result);
                System.out.println(dataTeraz);
                System.out.println("Podaj czas w przyszłosci: w formacie dd-MM-yyyy hh:mm");
                data= in.nextLine();

                dataUsera=formatDaty.parse(data);
                System.out.println(dataUsera);

            }catch (ParseException a){
                System.out.println(a.getMessage());
                dataUsera = dataTeraz;
            }

        }while(!dataUsera.after(dataTeraz)||dataUsera.equals(dataTeraz));

        if(dataUsera.after(dataTeraz)) {
            long diff = dataUsera.getTime() - dataTeraz.getTime();
            long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
            System.out.println(minutes);
        }
       /*
       //ROZWIAZANIE DLA SAMEJ DATY
        Scanner in= new Scanner(System.in);
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter;
        String data;
        LocalDate date2 = LocalDate.now();
        do{
            try{
                System.out.println("Podaj czas w przyszłosci: w formacie yyyy MM dd");
                data= in.nextLine();
                date2=LocalDate.now();
                formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
                date = LocalDate.parse(data, formatter);
                System.out.println(date);
            }catch (DateTimeParseException a){
                a.getMessage();
            }

        }while(!date.isAfter(LocalDate.now())||date.isEqual(date2));*/
    }


}
