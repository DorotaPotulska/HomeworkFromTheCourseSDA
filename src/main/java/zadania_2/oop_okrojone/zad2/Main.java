package zadania_2.oop_okrojone.zad2;
/*Zadanie 2
        Modyfikacja do zadania 1:

        Stwórz oddzielną klasę (np. Main) w której użytkownik korzystający z aplikacji 'kreuje' obiekt studenta.
        Czyli: uruchamiam aplikację i ona pyta mnie o imie, nazwisko, numer indeksu (6 cyfrowa liczba) i płeć (1 char).
        Jeśli podałem złe dane, to poproś użytkownika o powtórzenie. Kiedy wszystkie dane są poprawne stwórz
        obiekt Studenta.

        Następnie wypisz wszystkie informacje o studencie.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ilu studentów chcesz wpisać do bazy?");
        int ilosc= pobierzInt();
        int nr=0;
        char plec ='L';
        Student[] tablicaStudentow=new Student[ilosc];
        int i=0;
        while(i<tablicaStudentow.length){
            Student student =new Student();
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
           tablicaStudentow[i]=student;
            i++;
        }

        for(int j=0;j<tablicaStudentow.length;j++){
            System.out.println(tablicaStudentow[j].getImie()+" "+tablicaStudentow[j].getNazwisko()+" "+tablicaStudentow[j].getNrIndeksu()+" "+tablicaStudentow[j].getPlec());
        }

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
