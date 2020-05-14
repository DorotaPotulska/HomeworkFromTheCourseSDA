package zadania_1.petle;

import java.util.Scanner;

/*12.Napisać program, który sprawdza, czy podana liczba całkowita ​N jest większa od             zera,
        a następnie sprawdzająca czy liczba jest liczbą pierwszą.*/
public class zad12 {
    public static void main(String[] args) {
        int liczba;

        Scanner podanaLiczba=new Scanner(System.in);

        System.out.println("Podaj Liczbę: ");
        liczba=podanaLiczba.nextInt();
        if(liczba<0){
            System.out.println("Podana liczba jest mniejsza od zera");
            System.out.println("Podaj Liczbę: ");
            liczba=podanaLiczba.nextInt();
        }


        if(liczba==1 || liczba==2 || liczba==3){
            System.out.println("Liczba jest liczbą pierwsza");
        } else if(liczba%2==0 || liczba%3==0 ){
            System.out.println("Liczba nie jest liczbą pierwszą");

        }else{
            System.out.println("Liczba jest liczbą pierwsza");
        }

    }
}
