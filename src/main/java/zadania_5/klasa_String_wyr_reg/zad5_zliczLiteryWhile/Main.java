package zadania_5.klasa_String_wyr_reg.zad5_zliczLiteryWhile;

import java.util.Scanner;

/*5. Napisz program który zlicza wystąpienia liter w tekście. Posłuż się do tego pętlami
        for/while. (spróbuj zaimplementować na dwa sposoby).
        a. sposób 1/wskazówka 1: wykorzystaj kody ascii liter i iteruj tekst tyle razy, ile
        mamy liter w alfabecie i porównuj litery z kodami ascii
        b. *sposób 2/wskazówka 2: wykorzystaj do zliczania dodatkową tablicę.*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst = in.nextLine();
        int i=0;
        int j=0;
        char znak;
        int kod_ascii;
        int licznik=0;

        while (i<128){
            while (j<tekst.length()){
                znak =tekst.charAt(j);
                kod_ascii=(int)znak;
                if(i==kod_ascii){
                    licznik++;
                }

                j++;
            }
            if(licznik>0) {
                System.out.println((char) i + " wystepuje " + licznik);
            }
            licznik=0;
            i++;
            j=0;
        }
    }
}
