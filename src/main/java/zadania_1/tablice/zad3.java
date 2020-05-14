package zadania_1.tablice;

import java.util.Scanner;

/*3. Napisać program, który wczytuje od użytkownika liczbę całkowitą,
        a następnie wyświetla jej reprezentację w kodzie binarnym (ZM).
        Podczas konwersji liczby należy kolejne jej bity zapisywać
        w pomocniczej tablicy liczb całk. o rozmiarze 32. Konwersji
        należy dokonać korzystając z operacji dzielenia całkowitego oraz operacji modulo.

        Przykład:
        Wejście:
        -75 (liczba podana przez użytkownika)
        Wynik:
        Liczba -75 binarnie: 1.1001011*/
public class zad3 {
    public static void main(String[] args) {

        int number =readNumber();
        viewNumber(number);

    }

    public static int readNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int number = in.nextInt();
        return  number;
    }

    public static void viewNumber(int number){
        int[] tabBinary=binaryNumber(Math.abs(number));
        int j = 0;
        for (int i = tabBinary.length-1; i >=0 ; i--) {
            if(tabBinary[i]>0){
                j=i;
                break;
            }
        }
        if (number>0){
            System.out.print("0.");
            viewTable(j,tabBinary);
        }else {
            System.out.print("1.");
            viewTable(j,tabBinary);
        }
    }

    private static int[] binaryNumber(int number){
        int BINARY_NUMBER = 2;
        int[] tabBinary = new int[32];
        int i=0;
        int restNumber;
        while (number>0){
            restNumber = number%BINARY_NUMBER;
            //System.out.println(restNumber);
            tabBinary[i]=restNumber;
            i++;
            number=number/BINARY_NUMBER;
        }
        return tabBinary;
    }

    private static void viewTable(int j, int[] table){
        for (int i = j; i >= 0; i--) {
            System.out.print(table[i]);
        }
    }
}
