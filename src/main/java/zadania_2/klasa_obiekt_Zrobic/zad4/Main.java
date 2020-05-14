package zadania_2.klasa_obiekt_Zrobic.zad4;
/*
4.
        Stwórz aplikację, a w niej klasę Dziennik. Stwórz również klasę Student. Klasa Student powinna:
        - posiadać listę ocen studenta (List<Double>)
        - posiadać (pole) numer indeksu studenta (String)
        - posiadać (pole) imię studenta
        - posiadać (pole) nazwisko studenta
        Dziennik powinna:
        - posiadać (jako pole) listę Studentów.
        - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
        - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
        - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
        - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta,
        a w wyniku zwraca konkretnego studenta.
        - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta i zwraca średnią ocen studenta.
        - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
        * posiadać metodę 'posortujStudentówPoIndeksie():List<Student>'
        - która sortuje listę studentów po numerach indeksów, a następnie zwraca posortowaną listę.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1= new Student(new ArrayList<>(Arrays.asList(2.0,2.0,2.0)),"99204","Dorota","Potulska");
        Student student2= new Student(new ArrayList<>(Arrays.asList(3.0,3.0,3.0)),"99205","Ania","Potulska");
        Student student3= new Student(new ArrayList<>(Arrays.asList(3.0,3.0,4.0)),"99206","Zosia","Potulska");
        Student student4= new Student(new ArrayList<>(Arrays.asList(1.0,2.0,1.0)),"99207","Kasia","Potulska");

        Dziennik dziennik = new Dziennik(new ArrayList<>(Arrays.asList(student1,student2,student3,student4)));

        System.out.println(dziennik);

        //DODAJ STUDENTA
        //Student student5= new Student(new ArrayList<>(Arrays.asList(3.0,4.0,1.0)),"443322","Maks","Potulski");
        //dziennik.dodajStudenta(student5);
        dziennik.dodajStudenta(new Student(new ArrayList<>(Arrays.asList(3.0,4.0,1.0)),"443322","Maks","Potulski"));

        System.out.println(dziennik);

        //USUN STUDENTA

        dziennik.usunStudenta(new Student(new ArrayList<>(Arrays.asList(3.0,3.0,3.0)),"99205","Ania","Potulska"));

        System.out.println(dziennik);

        //USUN STUDENTA PO NUMERZE INDEKSU

        dziennik.usunStudenta("99204");

        System.out.println(dziennik);

//       Znajdz Studenta po numerze indeksu

        System.out.println(dziennik.zwrocStudenta("99207"));
//        Podaj średnią danego studenta
        System.out.println(dziennik.podajŚredniąStudenta("443322"));
        System.out.println(dziennik.podajŚredniąStudenta("99207"));
        System.out.println(dziennik.podajŚredniąStudenta("99206"));
//        podaj studentów zagrozonych

        System.out.println(dziennik.podajStudentówZagrożonych());

        //posortuj po indeksie
        System.out.println(dziennik.posortujStudentówPoIndeksie());
    }
}
