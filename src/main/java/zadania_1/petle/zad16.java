package zadania_1.petle;

import java.util.Scanner;

/*16.Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.
 * Przykład:                 "Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
 * Wynik:                 6 */
public class zad16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tekst;
        int suma;
        suma=0;
        System.out.println("Podaj tekst");
        tekst=in.nextLine();

        String[] tabela=tekst.split("");

        for(String y:tabela){
            System.out.print(y+" ");
        }
        System.out.println();
        for(int x=0;x<tabela.length;x++){

            if(tabela[x].equals("0")||tabela[x].equals("1")||tabela[x].equals("2")||tabela[x].equals("3")||tabela[x].equals("4")||tabela[x].equals("5")||tabela[x].equals("6")||tabela[x].equals("7")||tabela[x].equals("8")||tabela[x].equals("9")){
                System.out.println("Sumuje "+tabela[x]);
                suma+=Integer.valueOf(tabela[x]);
            }


        }
        System.out.println(suma);

    }
}
