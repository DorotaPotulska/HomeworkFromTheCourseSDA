package zadania_1.zadania_domowe;

import java.util.Random;

/*Zadania domowe dotyczące tablic i pętli:
        Do realizacji zadań proszę zaznajomić się z bilbioteką Math a dokładnie funkcją random() ( czego uzyc, co googlować: Math.random() )
        Dzieki tej funkcji łatwo możemy zapełnić sobie tablice losowymi wartościami :)

        Przy realizacji poniższych zadań starajcie się trzymać tego co się do tej poru nauczyliśmy,
        tj. prawidłowych konwencji nazewnictwa klas, metod, zmiennych, package'y itp.

        Zadanie 1
        * stworz nowa tablice ze 100 intami, uzupelnij ja losowymi liczbami i wypisz:
        a) co drugi element
        b) parzyste elementy
        c) liczby podzielne jednoczsnie przez 2 i 3
        d) liczby pierwsze
        e) sume liczb nieparzystych
        f) iloczyn wszystkich liczb podzielnych przez 5*/
public class zad1 {
    public static void main(String[] args) {
      /*  Random rd=new Random();
        int wylosowanyInt=rd.nextInt();
        System.out.println(wylosowanyInt);*/

      int[] tablica=new int[100];
      Random losowa=new Random();
      int wylosowana;

      for(int i=0;i<100;i++){
          tablica[i]=losowa.nextInt();
      }
      for(int x:tablica){
          System.out.println(x);
      }
      System.out.println("Co drugi element: ");
      for(int i=0;i<tablica.length;i+=2){
            System.out.println(tablica[i]);
      }
      System.out.println("Parzyste elementy:");
      for(int j=0;j<tablica.length;j++){
          if (tablica[j]%2==0){
              System.out.println(tablica[j]);
          }
      }
      System.out.println("Podzielne przez 2 i 3");
      for (int k=0;k<tablica.length;k++){
          if (tablica[k]%2==0 && tablica[k]%3==0){
              System.out.println(tablica[k]);
          }
      }

        System.out.println("Liczby pierwsze");
        for (int k=0;k<tablica.length;k++){
            if (tablica[k]==1 || tablica[k]==2||tablica[k]==3){
                System.out.println(tablica[k]);
            }
            if (tablica[k]%2!=0 && tablica[k]%3!=0){
                System.out.println(tablica[k]);
            }
        }
        System.out.println("Suma liczb nieparzystych");
        int suma=0;
        for (int k=0;k<tablica.length;k++){

            if (tablica[k]%2!=0){
                suma+=tablica[k];
            }
        }
        System.out.println(suma);

        System.out.println("Iloczyn wszystkich liczb podzielnych przez 5");
        int iloczyn=1;
        for (int k=0;k<tablica.length;k++){

            if (tablica[k]%5==0){
                iloczyn*=tablica[k];
            }
        }
        System.out.println(iloczyn);
    }
}
