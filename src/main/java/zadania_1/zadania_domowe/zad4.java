package zadania_1.zadania_domowe;

import java.util.Scanner;

/*Zadanie dotyczące pracy ze Stringami:

        1. Używając metod dostępnych dla Stringów, których się nauczyłeś napisz program,
        który:
        • Pyta użytkownika o imię
        • Sprawdza czy to prawdopodobie kobiece imię (kończące się na 'a')
        • Wypisuje ile znaków ma imię i sprawdza czy imię zostało napisane
        wielką literą
        • Zaimplementuj własną metodę sprawdzającą zakończenie
        imienia na dowolną literę bez użycia metody endsWith
        • Uwaga! Można stosować method chaining tzn wywoływać metodę na
        wyniku innej metody:
        " js ".trim().toUpperCase().charAt(0); // zwróci "J"*/
public class zad4 {
    public static void main(String[] args) {
      /*  //Pyta użytkownika o imię
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = in.nextLine();

        //Sprawdza czy to prawdopodobie kobiece imię (kończące się na 'a')
        String[] tablica=imie.split("");

        for(int i=0;i<tablica.length;i++){
            System.out.println(tablica[i]);
        }

        if(tablica[tablica.length-1].equals("a")){
            System.out.println("Prawdopodobnie jest to kobieta");
        }else{
            System.out.println("Prawdopodobnie jest to mężczyzna");
        }

        //Wypisuje ile znaków ma imię i sprawdza czy imię zostało napisane
        //        wielką literą

        System.out.println("Imię ma "+tablica.length+" znaków");

        if(tablica[0].equals(tablica[0].toUpperCase())){
            System.out.println("Imię zostało napisane wielką literą");

        }else{
            System.out.println("Imie zostało napisane małą literą");
        }

        */
        ///////////////rozwiązanie na metodach

        Scanner in=new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String imie=in.nextLine();
        char ostatniZnak=imie.charAt(imie.length()-1);
        if(Character.compare(ostatniZnak,'a')==0){
            System.out.println("Prawdopodobnie jest to kobieta");
        }else{
            System.out.println("Prawdopodobnie jest to mężczyzna");
        }

        System.out.println("Imię ma "+imie.length()+" znaków");


        if(Character.compare(imie.charAt(0),imie.toUpperCase().charAt(0))==0){
            System.out.println("Imię zostało napisane wielką literą");

        }else{
            System.out.println("Imie zostało napisane małą literą");
        }

    }

}
