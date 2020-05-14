package zadania_1.postawy;

import java.util.Scanner;

public class zadanie5 {
    /*Zadanie 5. Stwórz aplikację która prosi użytkownika o imie.
    Wypisz komunikat z prośbą o imie.
    Po wpisaniu sprawdź czy imie *równa się Ania* - jeśli tak, wypisz komunikat "Siema szefowa!"
    jeśli nie, wypisz komunikat "Witaj {Imie}!" zastąp imie wartością zmiennej (wczytanej ze scannera od użytkownika).*/
    public static void main(String[] args) {
        String imie;

        Scanner podaneImie=new Scanner(System.in);

        System.out.println("Wpisz swoje imię: ");
        imie=podaneImie.nextLine();

        if(imie.equals("Ania")){
            System.out.println("Siema szefowa!");
        }else{
            System.out.println("Witaj "+ imie+ "!");
        }
    }
}
