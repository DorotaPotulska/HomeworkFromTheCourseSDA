package zadania_1.petle;

import java.util.Scanner;

/*13.Stwórz program który na wejściu przyjmuje liczbę N a następnie na wyjściu wypisuje
        tabliczkę mnożenia do tej liczny (tj. do NxN).*/
public class zad13 {
    public static void main(String[] args) {
        int liczba;
        Scanner podanaLiczba=new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        liczba=podanaLiczba.nextInt();

        /*for(int i=0;i<liczba;i++){
            System.out.println("Liczba"+ liczba +"*"+i+"="+i*liczba);

        }*/
        for (int j=1;j<=liczba;j++){
            for (int i = 1; i <= liczba; i++) {
                System.out.print(j+"*"+i+"="+i * j+" ");

            }
            System.out.println("");
        }
    }
}
