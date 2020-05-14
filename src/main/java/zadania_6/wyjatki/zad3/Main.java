package zadania_6.wyjatki.zad3;
/*3.	Napisz klasę Person, Club, NoAdultException.
        Klasa Person powinna zawierać, imię, nazwisko i wiek.
        Klasa Club powinna zawierać metodę enter(Person person),
        która wyrzuca wyjątek NoAdultException, jeżeli osoba jest niepełnoletnia.*/
public class Main {
    public static void main(String[] args) throws NoAdultException {

        Person person1= new Person("Dorota","Potulska",16);

        Club club1= new Club();

       try {
           club1.enter(person1);
           System.out.println("Osoba pełnoletnia");
       }catch (NoAdultException a){
           System.out.println(a.getMessage());
       }

    }
}
