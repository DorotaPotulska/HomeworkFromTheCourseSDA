package zadania_2.klasa_obiekt_Zrobic.zad5;

public class SalaKonferencyjna {
    private int numerSali;
    private boolean czyZajeta;
    private int pojemnoscSali;
    private double cenaSali;

    public SalaKonferencyjna(int numerSali, boolean czyZajeta, int pojemnoscSali, double cenaSali) {
        this.numerSali = numerSali;
        this.czyZajeta = czyZajeta;
        this.pojemnoscSali = pojemnoscSali;
        this.cenaSali = cenaSali;
    }

    public SalaKonferencyjna(){

    }

    public int getNumerSali() {
        return numerSali;
    }

    public boolean getCzyZajeta() {
        return czyZajeta;
    }

    public int getPojemnoscSali() {
        return pojemnoscSali;
    }

    public double getCenaSali() {
        return cenaSali;
    }

    public void setCzyZajeta(final boolean czyZajeta) {
        this.czyZajeta = czyZajeta;
    }

    @Override
    public String toString() {
        return "SalaKonferencyjna{" +
                "numerSali=" + numerSali +
                ", czyZajeta=" + czyZajeta +
                ", pojemnoscSali=" + pojemnoscSali +
                ", cenaSali=" + cenaSali +
                '}';
    }
}
