package zadania_4.zad7_autostrada;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Highway {
    private ArrayList<VehicleInfo>pojazdy;

    public Highway(ArrayList<VehicleInfo> pojazdy) {
        this.pojazdy = pojazdy;
    }

    public void vehicleEntry(String numerRejestracyjnyPojazdu,CarType carType) throws VehicleAlreadyOnHighwayException {

        VehicleInfo pojazd=new VehicleInfo(numerRejestracyjnyPojazdu, carType);
            for(VehicleInfo x:pojazdy){
                if(x.getNumerRejestracyjnyPojazdu().equalsIgnoreCase(numerRejestracyjnyPojazdu)){
                    throw new VehicleAlreadyOnHighwayException("Pojazd jest juz na autostradzie");
                }
            }
        this.pojazdy.add(pojazd);
        System.out.println(pojazd);


    }

    public void searchVehicle(String numerRejestracyjnyPojazdu){
        int licznik =0 ;
        for(VehicleInfo x:pojazdy){
            if(x.getNumerRejestracyjnyPojazdu().equalsIgnoreCase(numerRejestracyjnyPojazdu)){
                System.out.println(x);
                System.out.println("--------");
                x.toString();
                licznik++;
                break;
            }
        }
        if(licznik==0){
            System.out.println("Nie odnaleziono pojazdu");
        }
    }

    public void vehicleLeave(String numerRejestracyjnyPojazdu){
        LocalDateTime now =LocalDateTime.now();
        int licznik =0;
        for(VehicleInfo x:pojazdy){
            if(x.getNumerRejestracyjnyPojazdu().equalsIgnoreCase(numerRejestracyjnyPojazdu)){
                LocalDateTime wjazd =x.getDataWjazdu();
                Timestamp tWjazd = Timestamp.valueOf(wjazd);
                Timestamp tWyjazd = Timestamp.valueOf(now);
                Long roznica = tWyjazd.getTime()-tWjazd.getTime();
                pojazdy.remove(x);
                System.out.println("Pojazd usuniety");
                System.out.println("--------");
                x.toString();

                long doZaplaty;
               /* if(x.getCarType().equals(CarType.TRUCK)) {
                    doZaplaty=CarType.TRUCK.getMnoznik() * (roznica / 1000 );
                }else if(x.getCarType().equals(CarType.MOTORCYCLE)){
                    doZaplaty=CarType.MOTORCYCLE.getMnoznik() * (roznica / 1000 );
                }else{
                    doZaplaty=CarType.CAR.getMnoznik() * (roznica / 1000 );
                }*/
                doZaplaty=x.getCarType().getMnoznik() * (roznica / 1000 );
                System.out.println("Czas spędzony na autostradzie " + roznica / 1000 + " sekund, do zapłaty jest " + doZaplaty + " PLN");
                licznik++;
                break;
            }
        }

        if(licznik==0){
            System.out.println("Nie odnaleziono pojazdu");
        }
    }

}
