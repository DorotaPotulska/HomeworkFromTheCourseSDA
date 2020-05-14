package zadania_5.kolekcje_listy.zad6_DOKONCZ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*6. Stwórz aplikację, a w niej klasę Dziennik i student .
        Stwórz również klasę Student. Klasa Student powinna:
        - posiadać listę ocen studenta (List<Double>)
        - posiadać (pole) numer indeksu studenta (String)
        - posiadać (pole) imię studenta
        - posiadać (pole) nazwisko studenta

        Klasa Dziennik powinna:
        - posiadać (jako pole) listę Studentów.
        - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
        - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
        - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
        - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta,
        a w wyniku zwraca konkretnego studenta.
        - posiadać metodę 'podajŚredniąStudenta(String):double'
        która przyjmuje indeks studenta i zwraca średnią ocen studenta.
        - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
        - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>'
        - która sortuje listę studentów po numerach indeksów, a następnie zwraca posortowaną listę.


        Polecenia VarArgs:
        - dodanie kilku studentów - usunięcie kilku studentów
        - wyszukiwanie studentów (i zwrócenie znalezionych w liście)
        - dodanie/usuwanie ocen studentom
        Wszystkie polecenia zrealizowane jako VarArgs.*/
public class Main {
    public static void main(String[] args) {

        List<Student> studenci = new ArrayList<>();

        Dziennik dziennik=new Dziennik(studenci);


        Student student1=new Student(Arrays.asList(2.0,4.0,6.0),"99204","Dorota","Potulska");
        Student student2=new Student(Arrays.asList(5.0,4.0,6.0),"99111","Piotr","Potulski");
        Student student3=new Student(Arrays.asList(2.0,1.0,1.0),"99222","Maks","Potulski");
        Student student4=new Student(Arrays.asList(2.0,4.0,6.0,2.0),"99333","Nastka","Potulska");
      /*  dziennik.dodajStudenta(student1);
        dziennik.dodajStudenta(student2);
        dziennik.dodajStudenta(student3);
        dziennik.dodajStudenta(student4);*/



        //System.out.println(dziennik);

       // dziennik.usunStudenta(student1);

        //System.out.println(dziennik);

        ///dziennik.usunStudenta("99333");
       /* System.out.println(dziennik);



        System.out.println(dziennik.zwrocStudenta("99111"));
        System.out.println(dziennik.podajŚredniąStudenta("99111"));

        System.out.println(dziennik.podajStudentowZagrozonych());

        System.out.println(dziennik.posortujStudentówPoIndeksie());*/


        //////////////////VarARGS

        dziennik.dodajStudenta2(student1,student2,student3,student4);
        System.out.println(dziennik);

        dziennik.usunStudenta2(student1,student4);
        System.out.println(dziennik);

        System.out.println(dziennik.zwrocStudenta2("99111", "99222"));
        System.out.println(dziennik);
        dziennik.dodajOcene("99111",5.0,6.0,4.0,3.5);
        System.out.println(dziennik);
    }
}
