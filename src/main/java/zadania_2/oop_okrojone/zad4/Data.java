package zadania_2.oop_okrojone.zad4;

public class Data {

    private int dzien;
    private int miesiac;
    private int rok;


    public Data(int dzien,int miesiac,int rok){
        this.dzien=dzien;
        this.miesiac=miesiac;
        this.rok=rok;
    }

    public void wyswietlDate(){
        System.out.println(this.dzien+"."+this.miesiac+"."+this.rok);
    }

    public void wyswietlDate2(){
        if(this.dzien<10){
            System.out.println("0"+this.dzien+"."+this.miesiac+"."+this.rok);
        }else {
            System.out.println(this.dzien + "." + this.miesiac + "." + this.rok);
        }
    }

    public void wyswietlDate3(){
        String[] miesiace=new String[12];
        miesiace[0]="sty";
        miesiace[1]="lut";
        miesiace[2]="mar";
        miesiace[3]="kwi";
        miesiace[4]="maj";
        miesiace[5]="cze";
        miesiace[6]="lip";
        miesiace[7]="sie";
        miesiace[8]="wrz";
        miesiace[9]="paz";
        miesiace[10]="lis";
        miesiace[11]="gru";

        System.out.println(this.dzien+"."+miesiace[this.miesiac-1]+"."+this.rok);
    }

   /* public int pobierzInt(){
        Scanner in=new Scanner(System.in);
        return in.nextInt();
    }*/
}
