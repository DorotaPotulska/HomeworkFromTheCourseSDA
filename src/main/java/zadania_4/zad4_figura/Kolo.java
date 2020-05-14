package zadania_4.zad4_figura;

public class Kolo implements Figura{

    private double r;
    private double pi=3.14;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return pi*this.r*this.r;
    }

    @Override
    public double obliczObwod() {
        return 2*pi*this.r;
    }

    @Override
    public void wypiszOpis() {
        System.out.println("Promien koła wynosi "+this.r);
    }
}
