package zadania_1.dodatkowe;

import java.util.Random;
import java.util.Scanner;

/*17.Aktualizuj poprzednie rozwiązanie - dodaj ograniczenie do losowania.*/
public class zad17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rd= new Random();
        int liczba =rd.nextInt(200);
        System.out.println(liczba);


        System.out.println("Czy liczba A>100? Wpisz Tak lub Nie");
        String odpowiedz= in.nextLine();

        if(odpowiedz.equalsIgnoreCase("Tak")&& liczba>100 ||odpowiedz.equalsIgnoreCase("Nie") && liczba<=100){
            System.out.println("Podano poprawną odpowiedz");
        }else if(odpowiedz.equalsIgnoreCase("Tak") || odpowiedz.equalsIgnoreCase("Nie")){
            System.out.println("Podano niepoprawną odpowiedz");
        }else{
            System.out.println("Wpisano błedną wartość");
        }




    }
}
