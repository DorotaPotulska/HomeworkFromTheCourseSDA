package zadania_5.klasa_String_wyr_reg.zad1_string;

import java.util.Scanner;

/*1. Zadeklaruj zmienną tekstową text i przypisz do niej jakąś wartość (Przyjmij ze            scannera).
        a. sprawdź czy w tekście występuje słowo “ania” - contains
        b. sprawdź czy tekst zaczyna się od słowa “ania” - startsWith
        c. sprawdź czy tekst kończy się słowem “ania” - endsWith
        d. sprawdź czy tekst równa się słowu “ania” - equals
        e. sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania”            toLowerCase + contains
        f. zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w         tekście - indexOf*/
public class Main {
    public static void main(String[] args) {
        String text;
        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz tekst: ");
        text = in.nextLine();

        /*CONTAINS - sprawdza czy w tekście występuje ciag znaków */
        if(text.contains("ania")){
            System.out.println("a.tekst zawiera ciąg znaków \"ania\" ");
           // System.out.println("tekst zawiera ciąg znaków 'ania' ");
        }else{
            System.out.println("a.Tekst nie zawiera ciąg znaków \"ania\"");
        }

        /*STARTSWITH - sprawdza czy tekst zaczyna się od danego ciagu znaków*/
        if(text.startsWith("ania")){
            System.out.println("b.tekst zaczyna się od ciągu znaków \"ania\" ");
            //System.out.println("tekst zaczyna się od ciągu znaków 'ania' ");
        }else{
            System.out.println("b.Tekst nie zaczyna się od ciągu znaków \"ania\"");
        }

        /*ENDSWITH - sprawdza czy tekst kończy się ciągiem znaków */
        if(text.endsWith("ania")){
            System.out.println("c.tekst kończy się ciągiem znaków \"ania\" ");
            //System.out.println("tekst kończy się ciągiem znaków  'ania' ");
        }else{
            System.out.println("c.Tekst nie kończy się ciągiem znaków  \"ania\"");
        }

        /*EQUALS -sprawdza czy tekst równa się słowu “ania”*/
        if(text.equals("ania")){
            System.out.println("d.tekst jest słowem \"ania\" ");
        }else{
            System.out.println("d.Tekst nie jest słowem \"ania\"");
        }
        /*e. sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania”            toLowerCase + contains*/
        if(text.toLowerCase().contains("ania")){
            System.out.println("e.tekst zawiera ciąg znaków \"ania\" ");
        }else{
            System.out.println("e.tekst zawiera ciąg znaków \"ania\" ");
        }
        /*f. zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w         tekście - indexOf*/
        if(text.indexOf("ania")>=0){
            System.out.println("f.Indeks słowa \"ania\" to "+text.indexOf("ania"));
        }else{
            System.out.println("f.Słowa \"ania\" nie ma w tekscie");
        }

    }

}
