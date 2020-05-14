package zadania_2.klasa_obiekt_Zrobic.zad1_komputer;

public class Laptop extends Komputer{
    double wielkoscMatrycy;
    boolean czyPosiadaRetine;

    public Laptop(int potrzebnaMoc, String producent, TypProcesora typProcesora, double wielkoscMatrycy, boolean czyPosiadaRetine) {
        super(potrzebnaMoc, producent, typProcesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.czyPosiadaRetine = czyPosiadaRetine;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "wielkoscMatrycy=" + wielkoscMatrycy +
                ", czyPosiadaRetine=" + czyPosiadaRetine +
                ", potrzebnaMoc=" + potrzebnaMoc +
                ", producent='" + producent + '\'' +
                ", typProcesora=" + typProcesora +
                '}';
    }
}
