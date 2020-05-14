package zadania_2.oop_okrojone.zad3;


import java.util.Scanner;
/*
Zadanie 3
        Modyfikacja do zadania 2:
        Napisz w klasie student metodę "przedstawSię():void" która wypisuje wszystkie parametry w postaci ślicznego string'a. Np.:

        Cześć! Jestem Janek Kowalski, jestem mężczyzną i mój numer indeksu to: 666666.

        Na końcu maina (modyfikacja #1) użyj tej metody i wypisz powitanie.
*/


public class Main {
    public static void main(String[] args) {
        int nr=0;
        char plec ='L';

        Student_3 student = new Student_3();
            System.out.println("Witaj! Proszę podaj dane studenta:");
            System.out.println("Imię: ");
            student.setImie(pobierzString());
            System.out.println("Nazwisko: ");
            student.setNazwisko(pobierzString());
            do{
                System.out.println("Numer Indeksu (5-cyfrowy): ");
                nr= pobierzInt();
                student.setNrIndeksu(nr);
            }while(String.valueOf(nr).length()!=5);
            do{
                System.out.println("Płeć (K/M): ");
                plec = pobierzString().charAt(0);
                student.setPlec(plec);
            }while(Character.compare(plec,'K')!=0 && Character.compare(plec,'M')!=0 );

            System.out.println(student.getImie()+" "+student.getNazwisko()+" "+student.getNrIndeksu()+" "+student.getPlec());

            student.przedstawSie();


    }

    public static String pobierzString(){
        Scanner in=new Scanner(System.in);
        return in.nextLine();
    }

    public static int pobierzInt(){
        Scanner in=new Scanner(System.in);
        return in.nextInt();
    }

}
