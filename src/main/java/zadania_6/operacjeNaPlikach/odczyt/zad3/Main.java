package zadania_6.operacjeNaPlikach.odczyt.zad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*3. Stwórz aplikację która czyta plik 'output_3.txt' i zlicza słowa i linie w tym pliku.*/
public class Main {
    public static void main(String[] args) {
        File plik = new File("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\output_3.txt");
        int licznikLini=0;
        int licznikSlow=0;
        try {
            Scanner odczyt = new Scanner(plik);
            String tekst = "";
            while (odczyt.hasNext()){
                String linia=odczyt.nextLine();
                String[] tabSlow= linia.split(" ");
                licznikSlow+=tabSlow.length;
                tekst=tekst+linia+"\n";
                licznikLini++;
            }
            System.out.println(tekst);
            System.out.println("W pliku są "+licznikLini+" linie");
            System.out.println("W pliku jest "+licznikSlow+" słów");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
