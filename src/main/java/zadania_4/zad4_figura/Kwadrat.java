package zadania_4.zad4_figura;

public class Kwadrat implements Figura {

    protected double a;

    public Kwadrat(double a) {
        this.a = a;
    }



    @Override
    public double obliczPole() {
        return this.a*this.a;
    }

    @Override
    public double obliczObwod() {
        return 4*this.a;
    }

    @Override
    public void wypiszOpis() {
        System.out.println("Bok kwadratu wynosi "+this.a);

    }
}
