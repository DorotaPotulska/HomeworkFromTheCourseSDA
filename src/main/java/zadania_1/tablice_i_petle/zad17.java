package zadania_1.tablice_i_petle;
/*17. Napisz program, który weryfikuje czy podany PESEL jest prawdziwy
– skorzystaj z definicji na stronie http://pl.spoj.com/problems/JPESEL/*/

import java.util.Scanner;

/*Aby sprawdzić czy dany PESEL jest prawidłowy należy wykonać następujące działania:

        Pierwszą cyfrę mnożymy przez 1,
        drugą cyfrę mnożymy przez 3,
        trzecią cyfrę mnożymy przez 7,
        czwarta cyfrę mnożymy przez 9,
        piątą cyfrę mnożymy przez 1,
        szóstą cyfrę mnożymy przez 3,
        siódmą cyfrę mnożymy przez 7,
        ósmą cyfrę mnożymy przez 9,
        dziewiątą cyfrę mnożymy przez 1,
        dziesiątą cyfrę mnożymy przez 3,
        jedenastą cyfrę mnożymy przez 1.

        Tak uzyskane 11 iloczynów dodajemy do siebie. Jeśli ostatnia cyfra tej sumy jest zerem to podany PESEL jest prawidłowy.
        Przykład dla numeru PESEL 44051401458

        4*1 + 4*3 + 0*7 + 5*9 + 1*1 + 4*3 + 0*7 + 1*9 + 4*1 + 5*3 + 8*1 = 4 + 12 + 0 + 45 + 1 + 12 + 0 + 9 + 4 + 15 + 8 = 110*/
public class zad17 {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        System.out.println("Podaj numer pesel: ");
        long pesel = in.nextLong();

        int[] tablica=new int[11];
        System.out.println();
        int i =10;
        while(pesel!=0){

               tablica[i]= (int) (pesel%10);
               i--;
               pesel=pesel/10;

        }

        for(int x:tablica){
            System.out.println(x+", ");
        }
// mnoże od tyłu, mam tablice na odwrót
        int sumIlocznu= tablica[0]*1+tablica[1]*3+tablica[2]*7+tablica[3]*9+tablica[4]*1+tablica[5]*3+tablica[6]*7+tablica[7]*9+tablica[8]+tablica[9]*3+tablica[10];

        System.out.println(sumIlocznu);

        if (sumIlocznu%10==0){
            System.out.println("Pesel poprawny");
        }else{
            System.out.println("Pesel niepoprawny");
        }

    }
}
