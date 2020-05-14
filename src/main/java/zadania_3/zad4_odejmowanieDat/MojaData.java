package zadania_3.zad4_odejmowanieDat;

import java.time.LocalDate;

public class MojaData {

        protected int dzien;
        protected int miesiac;
        protected int rok;

        public MojaData(int dzien, int miesiac, int rok) {
            this.dzien = dzien;
            this.miesiac = miesiac;
            this.rok = rok;
        }

    public LocalDate data(){
        String data;
        if(this.dzien<10 && this.miesiac<10){
            //System.out.println(this.rok+"-0"+this.miesiac+"-0"+this.dzien);
            data=this.rok+"-0"+this.miesiac+"-0"+this.dzien;
        }else if(this.dzien<10){
            //System.out.println(this.rok+"-"+this.miesiac+"-0"+this.dzien);
            data=this.rok+"-0"+this.miesiac+"-"+this.dzien;
        }else if(this.miesiac<10){
            //System.out.println(this.rok+"-0"+this.miesiac+"-"+this.dzien);
            data=this.rok+"-0"+this.miesiac+"-"+this.dzien;
        }else{
            //System.out.println(this.rok+"-"+this.miesiac+"-"+this.dzien);
            data=this.rok+"-"+this.miesiac+"-"+this.dzien;
        }

        return LocalDate.parse(data);
    }
    public void wyswietlDate(){

            System.out.println(this.dzien+"."+this.miesiac+"."+this.rok);

            if(this.dzien<10){
                System.out.println("0"+this.dzien+"."+this.miesiac+"."+this.rok);
            }

            switch (miesiac){
                case 1:
                    System.out.println(this.dzien+" sty "+this.rok);
                    break;
                case 2:
                    System.out.println(this.dzien+" lut "+this.rok);
                    break;
                case 3:
                    System.out.println(this.dzien+" mar "+this.rok);
                    break;
                case 4:
                    System.out.println(this.dzien+" kwi "+this.rok);
                    break;
                case 5:
                    System.out.println(this.dzien+" maj "+this.rok);
                    break;
                case 6:
                    System.out.println(this.dzien+" cze "+this.rok);
                    break;
                case 7:
                    System.out.println(this.dzien+" lip "+this.rok);
                    break;
                case 8:
                    System.out.println(this.dzien+" sie "+this.rok);
                    break;
                case 9:
                    System.out.println(this.dzien+" wrz "+this.rok);
                    break;
                case 10:
                    System.out.println(this.dzien+" paź"+this.rok);
                    break;
                case 11:
                    System.out.println(this.dzien+" lis "+this.rok);
                    break;
                case 12:
                    System.out.println(this.dzien+" gru "+this.rok);
                    break;
                default:
                    break;
            }

        }


}
