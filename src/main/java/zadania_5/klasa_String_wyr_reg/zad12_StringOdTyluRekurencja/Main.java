package zadania_5.klasa_String_wyr_reg.zad12_StringOdTyluRekurencja;

import java.util.Scanner;

/*12.**Spróbuj odwrócić ciąg stosując rekurencję.*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków");
        String znaki= in.nextLine();
        String[] tabZnakow=znaki.split("");

        wyswietlTablice(tabZnakow,tabZnakow.length-1);

    }
public  static String[] wyswietlTablice(String[] tablica,int i){
    System.out.print(tablica[i]);
        i--;
    return i>=0?wyswietlTablice(tablica, i):tablica;
}



}
