package zadania_1.dodatkowe;

import java.util.Random;
import java.util.Scanner;

/*16.Napisz aplikację, która losuje liczbę A. Następnie zadaj użytkownikowi pytanie: “Czy
        liczba A > 100”. Użytkownik musi odpowiedzieć “Tak” lub “Nie”. Po udzieleniu
        odpowiedzi przez użytkownika zweryfikuj ją (sprawdź czy jest poprawna) i wypisz
        komunikat: “Ta odpowiedź jest poprawna”, lub “Ta odpowiedź nie jest poprawna”.*/
public class zad16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rd= new Random();
        int liczba =rd.nextInt();
        System.out.println(liczba);


        System.out.println("Czy liczba A>100? Wpisz Tak lub Nie");
        String odpowiedz= in.nextLine();

        if(odpowiedz.equals("Tak")&& liczba>100 ||odpowiedz.equals("Nie") && liczba<=100){
            System.out.println("Podano poprawną odpowiedz");
        }else if(odpowiedz.equals("Tak") || odpowiedz.equals("Nie")){
            System.out.println("Podano niepoprawną odpowiedz");
        }else{
            System.out.println("Wpisano błedną wartość");
        }




    }
}
