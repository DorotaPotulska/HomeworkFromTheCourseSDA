package zadania_5.klasa_String_wyr_reg.zad8_zliczSlowa;
/*8. Napisz aplikację która przyjmuje od użytkownika tekst,
 a następnie dzieli go na poszczególne słowa.
 Następnie aplikacja zlicza ilości wystąpień słów. Np. dla tekstu

        ala lubi koty, ale ala nie jest przez koty lubiana

        ala - 2
        lubi - 1
        koty - 2
        ale - 1
        nie - 1
        jest - 1
        przez - 1
        lubiana - 1*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Podaj tekst:");
        String tekst= in.nextLine();

        String[] tabTekst=tekst.split(" ");

        //System.out.println(tabTekst);
        ArrayList<String> slowa=new ArrayList<>();

        for(String x:tabTekst){
            System.out.println(x);
           //slowa.add();
        }

        Arrays.sort(tabTekst);

        for(String x:tabTekst){
            System.out.println(x);
            //slowa.add();
        }

        for(int i=0;i<tabTekst.length-1;i++){
            if(!tabTekst[i].equals(tabTekst[i+1])){
                slowa.add(tabTekst[i]);
            }
        }
        slowa.add(tabTekst[tabTekst.length-1]);
        System.out.println(slowa);
        int licznik=0;

        for(int i=0;i<slowa.size();i++){
            for(int j=0;j<tabTekst.length;j++){
                if(slowa.get(i).equals(tabTekst[j])){
                    licznik++;
                }
            }
            System.out.println(slowa.get(i)+"-"+licznik);
            licznik=0;
        }
    }
}
