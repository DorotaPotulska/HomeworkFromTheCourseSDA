package zadania_1.petle;

import java.util.Scanner;

/*15.Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie
        sprawdza, czy podany ciąg jest palindromem*/
public class zad15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Podaj ciąg znaków:");
        String ciagZnakow=in.nextLine();

        String[] tablica=ciagZnakow.split("");

        for(String x:tablica){
            System.out.print(x+" ");
        }
        System.out.println();
        boolean czyPalindrom= true;
        for (int i = 0; i < tablica.length; i++) {

            if(!tablica[i].equals(tablica[tablica.length-1-i])){
                czyPalindrom=false;
                break;
            }

        }

        if(czyPalindrom==false) {
            System.out.println("Podany tekst nie jest palindormem");
        }else{
            System.out.println("Podany tekst jest palindromem");
        }

    }
}
