package zadania_2.klasy_metody.zad8_StatystykiSlow;

import java.util.HashMap;
import java.util.Scanner;

/*8. Statystyki użytych słów – program pobiera od użytkownika tekst.
        Następnie oblicza statystyki:
        a. Ilość użytych słów
        b. Średnia długość słowa
        c. **Najczęstsze słowo
        d. **Najrzadsze słowo*/
public class Main {
    public static void main(String[] args) {
        String tekst = pobierzTekst();
        System.out.println("Ilosc słów w tekście : " + zliczSlowa(tekst));
        System.out.println("Srednia długość słowa: " + iloscLiter(tekst) / zliczSlowa(tekst));
        System.out.println("Najczęstsze słowo to: " + najczestszeSlowo(tekst));
        System.out.println("Najrzadsze słowo to: " + najrzadszeSlowo(tekst));
    }

    private static int iloscLiter(String tekst) {
        String[] tabSlow = podzielTekst(tekst);
        int iloscLiter = 0;

        for (int i = 0; i < tabSlow.length; i++) {
            iloscLiter += tabSlow[i].length();

        }
        return iloscLiter;
    }

    private static String pobierzTekst() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String tekst = in.nextLine();
        return tekst;
    }


    private static String[] podzielTekst(String tekst) {
        String[] tabSlow = tekst.split(" ");
        return tabSlow;
    }

    private static int zliczSlowa(String tekst) {
        String[] tabSlow = podzielTekst(tekst);

        return tabSlow.length;
    }

    private static String najczestszeSlowo(String tekst) {
        String[] tabSlow = podzielTekst(tekst);
        HashMap<String, Integer> mapaSlow = new HashMap<>();
        mapaSlow = zliczSlowa(tabSlow);
        String slowo = "";
        int ilosc = 0;

        for (String key : mapaSlow.keySet()) {

            if (mapaSlow.get(key) > ilosc) {
                slowo = key;
                ilosc = mapaSlow.get(key);
            }

        }


        return slowo;
    }

    private static String najrzadszeSlowo(String tekst) {
        String[] tabSlow = podzielTekst(tekst);
        HashMap<String, Integer> mapaSlow = new HashMap<>();
        mapaSlow = zliczSlowa(tabSlow);
        String slowo = "";
        int ilosc = 0;
        int i = 0;
        for (String key : mapaSlow.keySet()) {
            if (i == 0) {
                ilosc = mapaSlow.get(key) + 1;
                i++;
            }
            if (mapaSlow.get(key) < ilosc) {
                slowo = key;
                ilosc = mapaSlow.get(key);
            }

        }
        return slowo;
    }

    public static HashMap<String, Integer> zliczSlowa(String[] tabSlow) {
        int ilosc = 0;
        HashMap<String, Integer> mapaSlow = new HashMap<>();
        for (int i = 0; i < tabSlow.length; i++) {
            for (int j = 0; j < tabSlow.length; j++) {
                if (tabSlow[i].equals(tabSlow[j])) {
                    ilosc++;
                }
            }

            if (mapaSlow.isEmpty() || !mapaSlow.containsKey(tabSlow[i])) {
                mapaSlow.put(tabSlow[i], ilosc);
            }
            ilosc = 0;
        }

        for (String key : mapaSlow.keySet()) {
            Integer value = mapaSlow.get(key);
            System.out.println("Key = " + key + " , value = " + value);
        }

        return mapaSlow;
    }


}
