package zadania_4.zad8_rownanie_kwadratowe;

public class QuadraticEquation {

    private int liczbaA;
    private int liczbaB;
    private int liczbaC;

   /* public QuadraticEquation(int liczbaA, int liczbaB, int liczbaC) {
        this.liczbaA = liczbaA;
        this.liczbaB = liczbaB;
        this.liczbaC = liczbaC;
    }*/

    public void setLiczbaA(int liczbaA) {
        this.liczbaA = liczbaA;
    }

    public void setLiczbaB(int liczbaB) {
        this.liczbaB = liczbaB;
    }

    public void setLiczbaC(int liczbaC) {
        this.liczbaC = liczbaC;
    }

    public int getLiczbaA() {
        return liczbaA;
    }

    public int getLiczbaB() {
        return liczbaB;
    }

    public int getLiczbaC() {
        return liczbaC;
    }

    public int obliczDelte() throws MinusDelta {
        int delta;
        delta= liczbaB*liczbaB- 4*liczbaA*liczbaC;
        if(delta<0){
            throw new MinusDelta("delta mniejsza od zera");
        }
        return delta;

    }

    public double getX1() throws MinusDelta {
        double x1 = (-liczbaB- Math.sqrt(obliczDelte()))/(2*liczbaA);
        return x1;
    }

    public double getX2() throws OneResult, MinusDelta {
        double x2;
        if(obliczDelte()==0){
            throw new OneResult("Delta równa zero - istnieje tylko jedno rozwiazania");
        }else{
            x2 = (-liczbaB+ Math.sqrt(obliczDelte()))/(2*liczbaA);
        }

        return x2;
    }
}
