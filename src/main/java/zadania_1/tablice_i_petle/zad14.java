package zadania_1.tablice_i_petle;

import java.util.Random;
import java.util.Scanner;

/*14. Napisz program symulujący pracę dystrybutora paliwa,
        gdzie użytkownik otrzymuje informację o ilości wlanego paliwa
        oraz o cenie jaką musi zapłacić.
        Aplikacja pyta użytkownika czy chce kontynuować napełnianie baku
        a. ‘t’ oznacza kontynuację
        b. ‘n’ oznacza zakończenie tankowania
        Po zakończeniu procesu tankowania wyświetlone zostaje sprawozdanie zawierające ilość przelanego paliwa
        oraz cenę za paliwo liczoną w złotówkach. Wykorzystaj double do przechowania ceny paliwa.
        Dodatkowo użyj random, aby przy kolejnej iteracji dolać do zbiornika losową ilość paliwa,
        która wygeneruje odpowiedni dodatek do rachunku.*/
public class zad14 {
    public static void main(String[] args) {
        double cena =4.92;
        Random rd=new Random();
        int iloscZatankowanegoPaliwa = 0;
        double rachunek=0;
        Scanner in =new Scanner(System.in);
        String decyzja;
        System.out.println("Zaczynamy tankowanie paliwa");
        do{
            //ilosc dolanego paliwa
            iloscZatankowanegoPaliwa+=rd.nextInt(7)+1;
            rachunek=iloscZatankowanegoPaliwa*cena;

            System.out.println("Zatankowano "+iloscZatankowanegoPaliwa+" l paliwa, do zapłaty "+rachunek+" zł");
            System.out.println("Czy kontynuować takowanie? Wpisz t -tak lub n-nie");
            decyzja=in.nextLine();
        }while(decyzja.equals("t"));


    }

}
