package zadania_3.zad1_komputer;

public class Komputer {
    protected int potrzebnaMoc;
    protected String producent;
    protected TypProcesora typProcesora;


    public Komputer(int potrzebnaMoc, String producent, TypProcesora typProcesora) {
        this.potrzebnaMoc = potrzebnaMoc;
        this.producent = producent;
        this.typProcesora = typProcesora;
    }

    @Override
    public String toString(){
        return "Komputer "+this.producent+" o mocy "+ this.potrzebnaMoc+" procesor "+ this.typProcesora;
    }
}
