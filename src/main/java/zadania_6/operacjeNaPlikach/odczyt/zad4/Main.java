package zadania_6.operacjeNaPlikach.odczyt.zad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*4. Napisz aplikację która czyta plik 'output_form.txt' i wypisuje zawartość formularzy.*/
public class Main {
    public static void main(String[] args) {
        File plik= new File("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\output_form.txt");
        try {
            Scanner odczyt = new Scanner(plik);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
