package zadania_5.klasa_String_wyr_reg.zad10_zliczOstatniZnak;
/*10.Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie wyświetla
        informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.

        Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ ostatnim
        znakiem jest literka „a”, która występuje w podanym ciągu łącznie 4 razy.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków:");
        String znaki= in.nextLine();

        String[] tabZnakow=znaki.split("");

        String ostatni =tabZnakow[tabZnakow.length-1];
        int licznik=0;

        for(int i =0; i<tabZnakow.length;i++){
            if(tabZnakow[i].equals(ostatni)){
                licznik++;
            }
        }

        System.out.println("Elemen ostatni to "+ostatni+" i wystepuje "+licznik +" razy");

    }

}
