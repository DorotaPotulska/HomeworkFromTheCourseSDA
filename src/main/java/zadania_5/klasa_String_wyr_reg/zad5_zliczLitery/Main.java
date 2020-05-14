package zadania_5.klasa_String_wyr_reg.zad5_zliczLitery;

import java.util.ArrayList;
import java.util.Arrays;
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
        String tekst=in.nextLine();

        String[]tabLiter=tekst.split("");

        Arrays.sort(tabLiter);

        ArrayList<String> tablica=new ArrayList<>();
        for(int i=0; i<tabLiter.length-1;i++){
            if(!tabLiter[i].equals(tabLiter[i+1])){
                tablica.add(tabLiter[i]);
            }
        }
        tablica.add(tabLiter[tabLiter.length-1]);
        System.out.println(tablica);

        int licznik=0;

        for(int i=0; i<tablica.size();i++){
            for(int j=0; j<tabLiter.length;j++){
                if(tablica.get(i).equals(tabLiter[j])){
                    licznik++;
                }
            }
            System.out.println(tablica.get(i)+" wystepuje "+licznik);
            licznik=0;
        }

    }
}
