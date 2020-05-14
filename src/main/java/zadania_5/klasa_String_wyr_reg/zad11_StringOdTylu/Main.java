package zadania_5.klasa_String_wyr_reg.zad11_StringOdTylu;

import java.util.Scanner;

/*11.Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie tworzy
        łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
        Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.*/
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Podaj ciąg znaków:");
        String ciagZnakow= in.nextLine();

        String[] tabZnakow= ciagZnakow.split("");

        for(int i=tabZnakow.length-1;i>=0;i--){
            System.out.print(tabZnakow[i]);
        }
    }
}
