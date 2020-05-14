package zadania_1.tablice_i_petle;

import java.util.Scanner;

/*12. Napisz program, który przyjmuje od użytkownika liczbę w zakresie od 1 do 20.
        A następnie rysuje trójkąt z liczb : 1 12 123 1234 …*/
public class zad12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int liczba;

        System.out.println("Podaj liczbę od 1 do 20: ");
        liczba=in.nextInt();
        if(liczba>0 && liczba <21){
            for(int i=1;i<=liczba;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }

        }
    }
}
