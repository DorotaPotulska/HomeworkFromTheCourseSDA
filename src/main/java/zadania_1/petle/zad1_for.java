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
public class zad1_for {
    public static void main(String[] args) {
        /*for (int i=0;i<100;i++){
            System.out.println(i+1);
        }*/

        /*for (int i=1000;i<=1020;i++){
            if(i<1020){
                System.out.print(i+", ");
            }else{
                System.out.print(i);
            }

        }
        System.out.println();
*/
        /*for (int i=-30;i<=1000;i++){
            if(i%5==0){
                System.out.println(i);
            }
        }*/

        /*for (int i=1;i<=100;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }*/

        /*for (int i=30;i<=300;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }*/

        /*for (int i=-300;i<=300;i++){
            if(i%2==1 ){
                System.out.print(i+"; ");
            }
        }*/


        /*for (char i='a';i<='z';i++){
            System.out.print(i+"; ");

        }
        System.out.println();*/
        /*for (char i='A';i<='Z';i++){
            System.out.print(i+"; ");

        }*/
        System.out.println();
        /*for (char i='A';i<='Z';i++){
            if(i%2==1){
                System.out.print(i+"; ");
            }

        }
        System.out.println();*/
        for (char i='a';i<='z';i++){
            if(i%2==0 && i%5==0){
                System.out.print(i+"; ");
            }

        }
        System.out.println();
        for (int i=1;i<=100;i++){

                System.out.println(i+". Hello World");


        }
    }
}
