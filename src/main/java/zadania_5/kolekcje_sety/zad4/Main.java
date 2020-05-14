package zadania_5.kolekcje_sety.zad4;

import java.util.*;

/*Zadanie 1: Stwórz aplikację która przyjmuje od użytkownika ciąg znaków (dowolny).
        Podziel ciąg (split) na pojedyncze litery.
        Twoim zadaniem jest stworzenie aplikacji która wypisze tylko unikalne litery frazy wpisanej przez użytkownika.
        Pomyśl o wykorzystaniu cechy zbioru - pamiętaj, że zbiór sam usuwa duplikaty.

        Zadanie 1b: Stwórz aplikację która dzieli zdanie na słowa, a następnie wypisuje tylko unikalne słowa.
        *Dla chętnych zliczanie słów. Wynikiem ma być Map<String, Long>*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj tekst: ");
        String tekst= in.nextLine();

        String[] tabLiter=tekst.split("");

        Set<String> SetLiter= new HashSet<>(Arrays.asList(tabLiter));

        /*for (String s : SetLiter) {
            System.out.println(s);
        }*/

        String[] tabSlow= tekst.split(" ");
        Set<String> SetSlow= new TreeSet<>(Arrays.asList(tabSlow));

       /* for (String s : SetSlow) {
            System.out.println(s);
        }*/

        System.out.println(SetLiter);
        System.out.println(SetSlow);

        System.out.println(zliczSlowa("ala ma kota ala ma psa"));
    }

    public static Map<String,Long> zliczSlowa (String tekst){
        String[] tabSlow= tekst.split(" ");

        Map<String,Long> mapaSlow= new HashMap<>();

        Set<String> setSlow= new HashSet<>(Arrays.asList(tabSlow));
        int licznik=0;

        for (String s : setSlow) {
            for (int j = 0; j < tabSlow.length; j++) {

                if (s.equals(tabSlow[j])){
                    licznik++;
                }

            }
            mapaSlow.put(s, (long) licznik);
            licznik=0;
        }


        return mapaSlow;
    }
}
