package zadania_1.tablice_i_petle;

import java.util.Scanner;

/*6. Napisz program, który odwraca wprowadzony tekst (AntyEcho  ) – podpowiedź analogiczna do punktu 5*/
public class zad6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Podaj ciąg znaków: ");
        String zdanie=in.nextLine();

        System.out.println(zdanie);

        String [] wynik=zdanie.split("");

        for(int x=wynik.length-1; x>=0;x--){

            System.out.print(wynik[x]);
        }


    }
}
