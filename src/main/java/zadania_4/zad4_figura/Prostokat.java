package zadania_4.zad4_figura;

public class Prostokat implements Figura {

    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obliczPole() {
        return this.a*this.b;
    }

    @Override
    public double obliczObwod() {
        return 2*this.a + 2*this.b;
    }

    @Override
    public void wypiszOpis() {
        System.out.println("Długości boków wynoszą : a ="+ this.a+" oraz b="+this.b);
    }
}
