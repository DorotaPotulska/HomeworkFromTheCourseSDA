package zadania_3.zad2_Citizen;

public class Town {

    private Citizen[] tabCitizen;

    public Town(Citizen[] tabCitizen) {
        this.tabCitizen = tabCitizen;
    }

    public int howManyCanVote(Citizen[] tabCitizen){
        int ilosc =0;
        for(int i=0;i<tabCitizen.length; i++){
            if(tabCitizen[i].canVote()==true){
                ilosc++;
            }
        }

        return ilosc;
    }

    public void whoCanVote(Citizen[] tabCitizen){

        for(int i=0;i<tabCitizen.length; i++){
            if(tabCitizen[i].canVote()==true){
                System.out.println(tabCitizen[i].imie);
            }
        }

    }

}
