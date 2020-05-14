package zadania_1.petle;
/*1. Napisz aplikację która wypisuje:
a. liczby z zakresu 1 - 100 w nowych liniach
b. liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją
c. liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach
d. liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
e. liczby podzielne przez 3 oraz 5 z zakresu 30 - 300 w nowych liniach
f. liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
g. liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami
h. litery od 'a' do 'z'
i. litery od ‘A’ do ‘Z’
j. litery od ‘A’ do ‘Z’, tylko co drugą
k. litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest podzielny przez 5
l. ‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer           wypisania) np.

        1. Hello World 2. Hello World 3. Hello World 4. ….

Całą aplikację (wszystkie podpunkty) zrealizuj pętlą for ORAZ pętlą while.*/
public class zad1_while {
    public static void main(String[] args) {
        int i;
        /*i=1;

        while(i<=100){
            System.out.println(i);
            i+=1;
        }
*/
        /*i=1000;
        while(i<=1020){
            if(i<1020){
                System.out.print(i+", ");
            }else{
            System.out.print(i);}
            i+=1;
        }
        System.out.println();*/

        /*i=-30;
        while(i<=1000){
            if(i%5==0){
            System.out.println(i);
            }else {
            }

            i+=1;
        }

        System.out.println();*/
       /* i=1;
        while(i<=100){
            if(i%3==0){
                System.out.println(i);
            }else {
            }

            i+=1;
        }
*/
       /* i=30;
        while(i<=300){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }else {
            }

            i+=1;
        }*/

        /*i=-30;
        while(i<=30){
            if(i%2==1 ||i%2==-1){
                if(i<30){
                    System.out.print(i +"; ");
                }else{
                    System.out.print(i);
                }
            }else {
            }

            i+=1;
        }*/
        /*System.out.println();
        i=-30;
        while(i<=30){
            if(i%2!=0){
                if(i<30){
                    System.out.print(i +"; ");
                }else{
                    System.out.print(i);
                }
            }else {
            }

            i+=1;
        }*/

       /* System.out.println();
        i=-100;
        while(i<=100){
            if(i%2==0){
                if(i<100){
                    System.out.print(i +"; ");
                }else{
                    System.out.print(i);
                }
            }else {
            }

            i+=1;
        }*/

        /*System.out.println();
        char j;
        j='a';
        while(j<='z'){

            if(j!='z'){
                System.out.print(j +"; ");
            }else{
                System.out.print(j);
            }


            j+=1;
        }*/

        /*System.out.println();
        char j;
        j='A';
        while(j<='Z'){

            if(j!='Z'){
                System.out.print(j +"; ");
            }else{
                System.out.print(j);
            }


            j+=1;
        }
*/
        /*System.out.println();
        char j;
        j='A';
        while(j<='Z'){
            if(j%2!=0) {
                if (j != 'Z') {
                    System.out.print(j + "; ");
                } else {
                    System.out.print(j);
                }
            }

            j+=1;
        }*/

        /*System.out.println();
        char j;
        j='a';
        while(j<='z'){
            if(j%2==0 && j%5==0) {
                if (j != 'z') {
                    System.out.print(j + "; ");
                } else {
                    System.out.print(j);
                }
            }

            j+=1;
        }*/

        System.out.println();
        int j=1;
        while(j<=100){
            System.out.println(j + ". Hello World");



            j+=1;
        }



    }
}
