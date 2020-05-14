package zadania_6.operacjeNaPlikach.odczyt.zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*1. Stwórz aplikację która służy do odczytywania danych z plików które zapisaliśmy,
        stwórz main'a w którym sprawdzaj że w katalogu w którym uruchomiłeś program jest plik o nazwie 'output_1.txt'
        który posiada treść "Hello World!". Jeśli pliku nie ma lub posiada inną zawartość napisz odpowiedni komunikat.*/
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Podstawowa klasa, która pozwoli nam utworzyć obiekt przechowujący dane pliku to File.
        File plik= new File("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\output_1.txt");

        try{
            //Scanner odczyt = new Scanner(new File("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\output_1.txt"));
            Scanner odczyt = new Scanner(plik);
            String tekst = odczyt.nextLine();
            System.out.println(tekst);
            if(tekst.equals("Hello World!")){
                System.out.println("Plik ma poprawna treść");
            }else{
                System.out.println("Plik ma inną zawartość niż Hello World!");
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
