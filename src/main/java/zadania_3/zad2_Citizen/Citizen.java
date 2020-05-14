package zadania_3.zad2_Citizen;

public abstract class Citizen {

    protected String imie;

    public Citizen(String imie) {
        this.imie = imie;
    }

    public abstract boolean canVote();
/*    Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'boolean canVote()'
            (może głosować) która zwraca true dla townsman'a i soldier'a, ale false dla chłopa i króla.*/
}
