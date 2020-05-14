package zadania_3.zad2_Citizen;
/*
Zadanie 2
        Stwórz klasę abstrakcyjną Citizen(Obywatel) oraz klasy dziedziczące:
        Peasant(Chłop),
        Townsman(Mieszczanin),
        King(Król),
        Soldier(Żołnierz)
        Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować to pole - podpowiedz: w klasie Citizen).
        Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'boolean canVote()' (może głosować) która zwraca true dla townsman'a i soldier'a, ale false dla chłopa i króla.
        Stwórz klasę Town która posiada tablicę Citizenów. Town nie dziedziczy po Citizen.
        Dodaj do niej kilku citizenów (różnych w mainie) i stwórz metody howManyCanVote które zwracają ilość osób które mogą głosować.
        Stwórz w klasie Town metodę "whoCanVote" która wypisuje imiona osób które mogą głosować.

        *Dla chetnych metoda whoCanVote():Citizen[] - zwraca podtablicę osób które mogą głosować.

        WSKAZÓWKA: żeby dodać do Town citizenów, stwórzcie citizenów jako pole w mieście, a następnie przekaż ich w konstruktorze. Tworząc miasto w main’ie przekaż przygotowaną wcześniej tablicę obywateli (citizenów).
        howmanycanvote - pętlą liczymy ilość obywateli którzy mogą głosować.

*/


public class Main {
    public static void main(String[] args) {
        Citizen[] tabCitizen ={
                new King("Ryszard"),
                new Soldier("Jan"),
                new Townsman("Zenek"),
                new Peasant("Roman")
        };

        Town gdansk =new Town(tabCitizen);

        System.out.println("W Gdańsku może głosować "+gdansk.howManyCanVote(tabCitizen)+" obywateli");

        gdansk.whoCanVote(tabCitizen);

    }
}