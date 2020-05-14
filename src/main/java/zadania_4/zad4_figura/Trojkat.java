package zadania_4.zad4_figura;

public class Trojkat implements Figura {

    private double a;
    private double b;
    private double c;

    public Trojkat(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double obliczPole() {
        double liczba = Math.sqrt((this.a+this.b+this.c)*(this.a+this.b-this.c)*(this.a-this.b+this.c)*(-this.a+this.b+this.c));
        return liczba/4;

    }

    @Override
    public double obliczObwod() {
        return this.a+this.b+this.c;
    }

    @Override
    public void wypiszOpis() {
        System.out.println("Długości boków trójkąta wynoszą: a="+this.a+
                " b="+this.b+
                " c="+this.c);
    }
}
