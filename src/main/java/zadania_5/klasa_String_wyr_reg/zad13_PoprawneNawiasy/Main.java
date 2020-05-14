package zadania_5.klasa_String_wyr_reg.zad13_PoprawneNawiasy;

import java.util.Scanner;

/*13.Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu
        arytmetycznym nawiasy są poprawnie sparowane. Wyrażenie podawane jest jako
        pojedynczy łańcuch znaków. Program powinien wyświetlić stosowny komunikat.
        Przykład a:
         "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))"
          Wynik:
          Błędne sparowanie nawiasów
          Przykład b:
          "(2 * (3.4 - (-7)/2)*(a-2)/(b-1))"
          Wynik:         OK */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String znaki = in.nextLine();
        String[] tabZnaki= znaki.split("");

        int licznik1=0;
        int licznik2=0;

        for(int i=0; i<tabZnaki.length;i++){
            if(tabZnaki[i].equals("(")){
                licznik1++;
            }else if(tabZnaki[i].equals(")")){
                licznik2++;
            }

        }

        if(licznik1==licznik2){
            System.out.println("OK");
        }else{
            System.out.println("Błędne sparowanie nawiasów");
        }

    }
}
