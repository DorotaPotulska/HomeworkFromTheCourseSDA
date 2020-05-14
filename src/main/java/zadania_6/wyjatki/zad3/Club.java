package zadania_6.wyjatki.zad3;

public class Club {

private Person person;

    /*public Club(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }*/


    public void enter(Person person) throws NoAdultException {
        if(person.getWiek()<18){
            throw new NoAdultException("Osoba niepełnoletnia");
        }

    }


}
