package zadania_2.klasy_metody.zad7_Spammer;

import java.util.Scanner;

/*7. Spammer – program pyta użytkownika o słowo oraz ilość powtórzeń wg której ma wyświetlić zadane słowa
        a. Metoda void
        b. 2 argumentowa – Słowo, ilośc powtórzeń
        c. Do…while (wprowadzone słowo !equals(„”);*/
public class Main {
    public static void main(String[] args) {
        String slowo2="AB";
        do{
            slowo2=slowo();
            if(!slowo2.equals("")){
            spammer(slowo2,ilosc());
            }
        }while(!slowo2.equals(""));
        System.out.println("END");
    }

   public static String slowo(){
       Scanner in = new Scanner(System.in);
       System.out.println("Podaj słowo: ");
       return in.nextLine();
   }

   public static int ilosc(){
        Scanner in=new Scanner(System.in);
       System.out.println("Podaj ilość powtorzeń: ");
       return in.nextInt();
   }

   public static void spammer( String slowo, int ilosc){
      for(int i=0;i<ilosc;i++) {
          System.out.println(slowo);
      }
   }
}
