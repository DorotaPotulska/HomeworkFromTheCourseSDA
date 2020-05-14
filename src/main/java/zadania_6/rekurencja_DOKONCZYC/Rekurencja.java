package zadania_6.rekurencja_DOKONCZYC;

import java.util.Set;

/**
 * Zaimplementuj poniższe metody Z WYKORZYSTANIEM REKURENCJI.
 */
public class Rekurencja {

    /**
     * Oblicza silnię argumentu n. Zwraca 1 dla n = 0.
     */
    public int factorial(int n) {return n>0 ? n*factorial(n-1):1;}

    /**
     * Oblicza sumę wszystkich liczb w podanej tablicy.
     * Uwaga: aby policzyć sumę rekurencyjnie, potrzebna będzie dodatkowa metoda.
     */
    public int sum(int[] numbers) {return sumTab( numbers,0); }

    public int sumTab(int[] numbers,int i){return i<numbers.length? numbers[i]+sumTab(numbers,i+1):0;}
    /**
     * Odwraca podany napis, np. dla "test" zwraca "tset".
     */
    public String reverse(String text) {
        return text.length()>0 ? reverse(text.substring(1))+text.charAt(0):text;
        /*if(text.length()<=1){
            return text;
        }else{
            return reverse(text.substring(1))+text.charAt(0);
        }*/
    }

    /**
     * Oblicza NWW (najmniejszą wspólną wielokrotnosć) podanych argumentów.
     *
     * (po angielsku LCM - Least Common Multiple)
     *
     * Podpowiedź:
     * NWW(a, b) = a * b / NWD(a, b)
     * NWW(a1, a2, ..., an) = NWW(a1, NWW(a2, a3, ..., an))
     *
     * @throws IllegalArgumentException jeśli któryś z argument jest ujemny lub gdy nie podano żadnych argumentów
     */
    public int lcm(int... numbers) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static int nww(int a, int b,int i) {
        int aa=1,bb=1;
        if (i==1) {
            aa=a;
            bb=b;
        }
        i++;
        return b != 0 ?(nww(b, a % b,i)):(aa * bb)/a;
    }

    ////////////////////////////////////////////
    //                                        //
    // PONIŻEJ ZADANIA DODATKOWE DLA CHĘTNYCH //
    //                                        //
    ////////////////////////////////////////////

    /**
     * Zwraca wszystkie możliwe permutacje podanego ciągu (różnych) znaków.
     * Np. dla "123" zwraca ["123", "132", "213", "231", "312", "321"].
     */
    public Set<String> permutations(String string) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}