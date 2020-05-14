package zadania_5.klasa_String_wyr_reg.zad5_zliczLiteryFor;

import java.util.Scanner;

/*5. Napisz program który zlicza wystąpienia liter w tekście. Posłuż się do tego pętlami
        for/while. (spróbuj zaimplementować na dwa sposoby).
        a. sposób 1/wskazówka 1: wykorzystaj kody ascii liter i iteruj tekst tyle razy, ile
        mamy liter w alfabecie i porównuj litery z kodami ascii
        b. *sposób 2/wskazówka 2: wykorzystaj do zliczania dodatkową tablicę.*/
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String tekst = in.nextLine();

        char znak=' ';
        int kod_ascii;
        int licznik=0;

        for(int j=0; j<128;j++){
            for(int i=0; i<tekst.length(); i++){
                znak=tekst.charAt(i);
                kod_ascii=(int)znak;
                if(j==kod_ascii){
                    licznik++;
                }
            }
            if(licznik>0){
                System.out.println((char) j+" "+licznik);
            }

            licznik=0;

        }



    }
}
