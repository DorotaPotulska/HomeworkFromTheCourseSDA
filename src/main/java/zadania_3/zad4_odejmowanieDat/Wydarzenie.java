package zadania_3.zad4_odejmowanieDat;

import java.time.LocalDate;
import java.time.Period;

public class Wydarzenie {

    protected MojaData dataWydarzenia;
    protected String nazwaWydarzenia;

    public Wydarzenie(MojaData dataWydarzenia, String nazwaWydarzenia) {
        this.dataWydarzenia = dataWydarzenia;
        this.nazwaWydarzenia = nazwaWydarzenia;
    }

    @Override
    public String toString() {
        return "Wydarzenie{" +
                "dataWydarzenia=" + dataWydarzenia.data() +
                ", nazwaWydarzenia='" + nazwaWydarzenia + '\'' +
                '}';
    }
    /*a. ileZostaloLat:int – zwraca czas w latach*/

    public int ileZostaloLat(){

        Period period = Period.between( LocalDate.now(),dataWydarzenia.data());
        //System.out.println(period.getYears());
        return period.getYears();


    }
   /*b. ileZostaloMiesiecy:int – zwraca czas w miesiacach*/
    public int ileZostaloMiesiecy(){
        Period period = Period.between(LocalDate.now(),dataWydarzenia.data());
        //System.out.println(period.getMonths());
        return period.getMonths();
    }
    /*c. ileZostaloDni:int – zwraca czas w dniach*/
    public int ileZostaloDni(){
        Period period = Period.between(LocalDate.now(),dataWydarzenia.data());
        //System.out.println(period.getDays());
        return period.getDays();


    }
}
