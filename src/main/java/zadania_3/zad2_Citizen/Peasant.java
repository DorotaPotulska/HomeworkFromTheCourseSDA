package zadania_3.zad2_Citizen;

public class Peasant extends Citizen {

    public Peasant(String imie){
        super(imie);
    }

    @Override
    public boolean canVote(){
        return false;
    };
}
