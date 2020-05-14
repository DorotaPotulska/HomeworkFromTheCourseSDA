package zadania_1.tablice_i_petle;

import java.util.Scanner;

/*15. Napisz program, który dla zadanych dwóch liczb zwraca największy wspólny dzielnik
        np.  a. 12 i 48 -> 12
        b. 5 i 1 -> 1
        c. 35 i 10 -> 5*/
public class zad15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int liczba1;
        int liczba2;

        System.out.println("Podaj liczbę:");
        liczba1=in.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        liczba2=in.nextInt();
        int dzielnik=1;

        if(liczba1==liczba2) {
            dzielnik=liczba1;
        }else if(liczba1>liczba2){
                for(int i=1;i<=liczba2;i++){
                    if(liczba1%i==0 && liczba2%i==0){
                        dzielnik*=i;
                        liczba1=liczba1/i;
                        liczba2=liczba2/i;
                        i=1;
                    }
                }
            }else {

            for(int i=1;i<=liczba1;i++){
                if(liczba1%i==0 && liczba2%i==0){
                    dzielnik*=i;
                    liczba1=liczba1/i;
                    liczba2=liczba2/i;
                    i=1;
                }
            }
        }

        System.out.println("Największy wspólny dzielnik "+ dzielnik);
    }



}

