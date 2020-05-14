package zadania_6.operacjeNaPlikach.zapis.zad3;
/*3. Należy napisać aplikację która w pętli while czyta ze Scannera wejście użytkownika z konsoli,
        a następnie linia po linii wypisuje tekst do pliku 'output_3.txt'.
        Aplikacja ma się zamykać po wpisaniu przez użytkownika komendy "quit".

        Pętla powinna być w try a nie try w pętli.*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        PrintWriter plik = null;
        String tekst = "";
        try {
            plik = new PrintWriter("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\output_3.txt");

            while(!tekst.equals("quit")){
                System.out.println("Podaj tekst lub wpisz 'quit' zeby zakończyć");
                tekst = in.nextLine();
                if(!tekst.equals("quit")){
                    plik.println(tekst);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        plik.close();

    }
}
