package zadania_6.operacjeNaPlikach.odczyt.zad2;
/*2. Stwórz aplikację która odczyta plik 'output_2.txt' i wczyta z niego linię,
        a następnie wypisze ją na ekran: 1 raz "toUpperCase", 1 raz "toLowerCase", 1 raz "trim".*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File plik = new File("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\output_2.txt");

        try {
            Scanner odczyt = new Scanner(plik);
            String tekst =odczyt.nextLine();

            System.out.println(tekst.toUpperCase());
            System.out.println(tekst.toLowerCase());
            System.out.println(tekst.trim());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
