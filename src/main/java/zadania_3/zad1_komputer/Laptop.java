package zadania_3.zad1_komputer;

public class Laptop extends Komputer{
    double wielkoscMatrycy;
    boolean czyPosiadaRetine;

    public Laptop(int potrzebnaMoc, String producent, TypProcesora typProcesora, double wielkoscMatrycy, boolean czyPosiadaRetine) {
        super(potrzebnaMoc, producent, typProcesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.czyPosiadaRetine = czyPosiadaRetine;
    }

    @Override
    public String toString(){
        return "Laptop "+this.producent
                +" o mocy " + this.potrzebnaMoc
                +" procesor "+ this.typProcesora
                +" o wielkosci matrycy "+this.wielkoscMatrycy;
    }
}
