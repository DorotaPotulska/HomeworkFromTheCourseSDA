package zadania_2.klasy_metody.zad5_Wisielec;

import java.util.Scanner;

/*5. Napisz program ‘wisielec’ – użytkownik ma 5 żyć, użytkownik może podać jedynie 1 literę
– gdy poda więcej przegrywa grę.
        Jeśli poda literę spoza hasła, traci jedno życie,
        gdy zostanie bez żyć <0 przegrywa grę.
        a. Użytkownik sam wpisuje hasło dla przeciwnika
        b. * Hasło jest losowane z słownika czyli tablicy haseł
        c. ** Po zakończeniu gry – zapytanie do użytkownika czy chce kontynuować dalej grę (t/n)*/
public class Main {
    public static void main(String[] args) {
        String haslo =pobierzHaslo();
        int iloscZyc=5;
        do {
            System.out.println("Podaj litere: ");
            String litera = pobierzLitere();
            if (litera.length() > 1) {
                System.out.println("Podałeś wiecej znaków");
                System.out.println("Koniec gry");
                iloscZyc=0;
            } else {
                char znak = litera.charAt(0);
                boolean wynik =sprawdzLitereWhasle(haslo,znak);
                if(wynik==true){
                    System.out.println("Wygrałeś!!!");
                    iloscZyc=0;
                }else{
                    System.out.println("Litera nie znajduje się w haśle");
                    iloscZyc--;
                }
            }

        }while (iloscZyc>0);
    }

    private static String pobierzLitere() {
        Scanner in = new Scanner(System.in);
        String litera = in.nextLine();
        return litera.toLowerCase();
    }

    private static boolean sprawdzLitereWhasle(String haslo,char znak) {
        String[] tabHasla= haslo.split("");
        int ilosc =0;
        for (int i = 0; i < tabHasla.length; i++) {
            if(tabHasla[i].toLowerCase().charAt(0)==znak) {
               ilosc++;
            }
        }
        if(ilosc==0){
            return false;
        }else{
            return true;
        }
    }

    private static String pobierzHaslo() {
        Scanner in= new Scanner(System.in);
        System.out.println("Podaj hasło: ");
        String haslo=in.nextLine();
        return haslo;
    }
}
