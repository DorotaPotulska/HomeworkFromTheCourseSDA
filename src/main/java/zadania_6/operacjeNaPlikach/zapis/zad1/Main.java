package zadania_6.operacjeNaPlikach.zapis.zad1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*1. Napisz aplikację która otwiera plik 'output_1.txt', zapisuje do niego "Hello World!" a następnie zamyka plik.*/
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Tworze plik");
        PrintWriter plik = new PrintWriter("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\output_1.txt");
        System.out.println("Zapisuje do pliku tekst");
        plik.println("Hello World!");
        System.out.println("Zamykam plik");
        plik.close();
    }
}
