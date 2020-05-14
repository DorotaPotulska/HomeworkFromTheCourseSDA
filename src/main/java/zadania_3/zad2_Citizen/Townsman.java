package zadania_3.zad2_Citizen;

public class Townsman extends Citizen {

    public Townsman(String imie){
        super(imie);
    }

    @Override
    public boolean canVote(){
        return true;
    };
}
