package zadania_4.zad4_figura;
/*Zadanie 4:
        Stwórz interfejs Figura, zaimplementuj w nim metody:
        - obliczPole():double
        - obliczObwód():double
        - wypiszOpis():void (metoda wypisuje jakie sa parametry (dlugosci bokow) itp)
        Stwórz klasę:
        Koło, Wielokąt, Trójkąt, Prostokąt
        Implementuj interfejs Figura, napisz wszystkie metody.
        Stwórz w klasie Main parser który obsługuje komendy użytkownika.
        Użytkownik może wpisać kształt jaki chciałby "pomierzyć", a następnie aplikacja pyta o wartości niezbędnych pól.
        Przykład działania.:Jaki kształt?
        kwadrat
        Podaj długość boku A:
        5.0
        Co chciałbyś obliczyć? [pole, obwód, wypis]
        pole
        Wynik: 25.0
        Jaki kształt?
        koło
        Podaj promień R:
        5.0
        Co chciałbyś obliczyć? [pole, obwód, wypis]
        obwód
        Wynik: 31.415926536
        Jaki kształt?
        quit
        Kończę pracę*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i=0;

        while(i<6){
        pobranieBokow(wybierzKsztalt());
        i++;
        }

    }

    public static int wybierzKsztalt(){
        Scanner in=new Scanner(System.in);
        int wybor;
        System.out.println("Jaki kształt? Wybierz, który:");
        System.out.println("1 - Kwadrat ");
        System.out.println("2 - Prostokąt");
        System.out.println("3 - Trojkąt");
        System.out.println("4 - Koło");

        wybor=in.nextInt();

        return wybor;
    }

    public static int wyborObliczen(){
        Scanner in=new Scanner(System.in);
        int wybor2;
        System.out.println("Co chciałbyś obliczyć? Wybierz opcję: ");
        System.out.println("1 - Pole");
        System.out.println("2 - Obwód");
        System.out.println("3 - Wypis");
        wybor2=in.nextInt();
        return wybor2;
    }

    public static void pobranieBokow(int wyborKsztaltu){
        Scanner in=new Scanner(System.in);
        double bokA;
        double bokB;
        double bokC;
        double promien;
        int wyborObliczen;
        switch (wyborKsztaltu){
            case 1:
                System.out.println("Podaj długośc boku a=");
                bokA= in.nextDouble();
                Figura kwadrat= new Kwadrat(bokA);
                wyborObliczen= wyborObliczen();
                if(wyborObliczen==1) {
                    System.out.println("Pole wynosi "+kwadrat.obliczPole());
                }else if (wyborObliczen==2){
                    System.out.println("Obwód wynosi "+kwadrat.obliczObwod());
                }else if(wyborObliczen==3){
                    kwadrat.wypiszOpis();
                }
                break;
            case 2:
                System.out.println("Podaj długośc boku a=");
                bokA= in.nextDouble();
                System.out.println("Podaj długośc boku b=");
                bokB= in.nextDouble();
                Figura prostokat= new Prostokat(bokA,bokB);
                wyborObliczen= wyborObliczen();
                if(wyborObliczen==1) {
                    System.out.println("Pole wynosi "+prostokat.obliczPole());
                }else if (wyborObliczen==2){
                    System.out.println("Obwód wynosi "+prostokat.obliczObwod());
                }else if(wyborObliczen==3){
                    prostokat.wypiszOpis();
                }
                break;
            case 3:
                System.out.println("Podaj długośc boku a=");
                bokA= in.nextDouble();
                System.out.println("Podaj długośc boku b=");
                bokB= in.nextDouble();
                System.out.println("Podaj długośc boku c=");
                bokC= in.nextDouble();
                Figura trojkat= new Trojkat(bokA,bokB,bokC);
                wyborObliczen= wyborObliczen();
                if(wyborObliczen==1) {
                    System.out.println("Pole wynosi "+trojkat.obliczPole());
                }else if (wyborObliczen==2){
                    System.out.println("Obwód wynosi "+trojkat.obliczObwod());
                }else if(wyborObliczen==3){
                    trojkat.wypiszOpis();
                }
                break;
            case 4:
                System.out.println("Podaj długośc promienia r=");
                promien= in.nextDouble();
                Figura kolo= new Kolo(promien);
                wyborObliczen= wyborObliczen();
                if(wyborObliczen==1) {
                    System.out.println("Pole wynosi "+kolo.obliczPole());
                }else if (wyborObliczen==2){
                    System.out.println("Obwód wynosi "+kolo.obliczObwod());
                }else if(wyborObliczen==3){
                    kolo.wypiszOpis();
                }
                break;
            default:
                System.out.println("Podales zla wartość");
                break;
        }
    }



}
