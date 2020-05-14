package zadania_1.dodatkowe;

import java.util.Random;
import java.util.Scanner;

/*18.Napisz aplikację, która losuje liczbę A i liczbę B.
        Następnie zadaje użytkownikowi
        pytanie: “Czy A > B?”. Użytkownik musi odpowiedzieć “Tak” lub “Nie”. Po udzieleniu
        odpowiedzi przez użytkownika zweryfikuj ją (sprawdź czy jest poprawna) i wypisz
        komunikat: “Ta odpowiedź jest poprawna”, lub “Ta odpowiedź nie jest poprawna”.*/
public class zad18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rd= new Random();
        int liczbaA =rd.nextInt(200);
        System.out.println("Liczba A: "+ liczbaA);
        int liczbaB =rd.nextInt(200);
        System.out.println("Liczba B: "+ liczbaB);

        System.out.println("Czy liczba A>B? Wpisz Tak lub Nie");
        String odpowiedz= in.nextLine();

        if(odpowiedz.equalsIgnoreCase("Tak")&& liczbaA>liczbaB ||odpowiedz.equalsIgnoreCase("Nie") && liczbaA<=liczbaB){
            System.out.println("Podano poprawną odpowiedz");
        }else if(odpowiedz.equalsIgnoreCase("Tak") || odpowiedz.equalsIgnoreCase("Nie")){
            System.out.println("Podano niepoprawną odpowiedz");
        }else{
            System.out.println("Wpisano błedną wartość");
        }




    }
}
