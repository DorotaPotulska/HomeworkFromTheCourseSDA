package zadania_1.tablice_i_petle;

import java.util.Scanner;

/*5. Napisz program, który oblicza sumę liczb cyfry
        tj. dla liczby 52 suma jej pojedynczych cyfr wynosi ‘5’ + ‘2’ -> ‘7’.
        Podpowiedź: Użyj metody split na obiekcie typu String 6*/
public class zad5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int suma=0;

        System.out.println("Podaj liczbę: ");
        int liczba=in.nextInt();

        String Liczba=""+liczba;

        System.out.println(Liczba);

        String [] wynik=Liczba.split("");

        System.out.println("Wynik działania split(\" \")");
        for(int i=0; i<wynik.length; i++){
            System.out.println(wynik[i]);
            suma+= Integer.valueOf(wynik[i]);//zamian Stringa na inta
        }

        System.out.println("Suma "+ suma);
    }
}
