package zadania_3.zad2_Citizen;

public class Soldier extends Citizen {


    public Soldier(String imie){
        super(imie);
    }

    @Override
    public boolean canVote(){
        return true;
    };
}
