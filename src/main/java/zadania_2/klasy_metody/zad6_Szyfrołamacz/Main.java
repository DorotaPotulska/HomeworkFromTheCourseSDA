package zadania_2.klasy_metody.zad6_Szyfrołamacz;

import java.util.Random;
import java.util.Scanner;

/*6. Szyfrołamacz – użytkownik musi odgadnąć 4 cyfrowe hasło, ma 5 żyć,
        po podaniu hasła program informuje go czy podany kod był większy lub mniejszy od hasła.
        Po utracie wszystkich żyć program kończy działanie

        a. Po utracie wszystkich żyć program pyta użytkownika czy chce spróbować ponownie
        b. Użytkownik może raz w ciągu gry poprosić o podpowiedź która odsłoni jedno z 4 cyfr tajnego hasła*/
public class Main {
    public static void main(String[] args) {
        int[]hasloTab=hasloTab();
        int hasloInt=hasloInt(hasloTab);

        int podpowiedz=0;
        int zycie=5;

        do{
            System.out.println("Podaj 4 cyfrowe hasło:" );
            int podaneHaslo=pobierzLiczbę();
            if(podaneHaslo<hasloInt){
                System.out.println("Podane hasło jest mniejsze");
                zycie--;
            }else if(podaneHaslo>hasloInt){
                System.out.println("Podane hasło jest większe");
                zycie--;
            }else {
                System.out.println("Zgadłeś hasło!!!");
                czyJeszczeRaz();
                zycie=wybor(pobierzLiczbę());
                if(zycie>0){
                    hasloTab=hasloTab();
                    hasloInt=hasloInt(hasloTab);
                    podpowiedz=0;
                }

            }


            if(podpowiedz==0 && zycie>0 && zycie<5){
                System.out.println("Czy chcesz podpowiedz?");
                System.out.println("TAK=1, Nie=2");
                int wybor =pobierzLiczbę();
                switch (wybor){
                    case 1:
                        System.out.println("Którą cyfrę chcesz poznać?");
                        int i =pobierzLiczbę();
                        System.out.println(hasloTab[i-1]);
                        podpowiedz++;
                        break;
                    case 2:
                        break;
                    default:
                        break;
                }

            }
            if(zycie==0){
                System.out.println("Straciłeś wszystkie życia :(");
                czyJeszczeRaz();
                zycie=wybor(pobierzLiczbę());
                if(zycie>0){
                hasloTab=hasloTab();
                hasloInt=hasloInt(hasloTab);
                podpowiedz=0;
                }

            }

        }while(zycie>0);

        System.out.println("KONIEC");

    }
public static int[]hasloTab(){
    int[] hasloTab=new int[4];
    for(int i=0;i<hasloTab.length;i++){
        hasloTab[i]=losowanieLiczby();
    }
    for(int i=0;i<hasloTab.length;i++){
        System.out.print(hasloTab[i]+" ");

    }
    return hasloTab;
}
    public static int hasloInt(int[] hasloTab){
        System.out.println();
        String hasloString=hasloTab[0]+""+hasloTab[1]+""+hasloTab[2]+""+hasloTab[3];
        System.out.println(hasloString);
        System.out.println();
        System.out.println(Integer.valueOf(hasloString));
        return Integer.valueOf(hasloString);
    }

    public static int losowanieLiczby(){
        Random rd =new Random();
        return rd.nextInt(10);
    }

    public static int pobierzLiczbę(){
        Scanner in=new Scanner(System.in);
        return in.nextInt();
    }

    public static void czyJeszczeRaz() {
        System.out.println("Czy chcesz spróbować jeszcze raz?");
        System.out.println("Tak=1; Nie =2");
    }


    public static int wybor(int wybor) {
        switch (wybor){
            case 1:
                return 5;
            case 2:
                System.out.println("End");
                return 0;
            default:
                System.out.println("Zła wartość");
                return 0;
        }
    }
}
