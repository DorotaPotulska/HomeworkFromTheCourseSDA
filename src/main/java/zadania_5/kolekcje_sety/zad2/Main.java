package zadania_5.kolekcje_sety.zad2;

import java.util.HashSet;
import java.util.Set;

/*2. Napisz statyczną metodę sprawdzającą, czy w tekście nie powtarzają się litery z wykorzystaniem zbioru.
        (boolean zawieraDuplikaty(String text))*/
public class Main {
    public static void main(String[] args) {

        System.out.println(zawieraDuplikaty("DOROTA"));

    }

    public static boolean zawieraDuplikaty(String text){

        Set<String> SetLiter =new HashSet<>();
        String[] litery = text.split("");

        for (int i = 0; i < litery.length; i++) {
            SetLiter.add(litery[i]);

        }

        if(litery.length ==SetLiter.size()){
            return false;
        }else{
            return true;
        }
    }
}
