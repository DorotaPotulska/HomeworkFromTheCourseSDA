package zadania_4.zad1;

public class Alarm implements IWylaczalny,IWlaczalny{
    boolean czyWlaczone;

    public Alarm(boolean czyWlaczone) {
        this.czyWlaczone = czyWlaczone;
    }

    @Override
    public void wlacz() {
        if(this.czyWlaczone ==true){
            System.out.println("Alarm jest juz włączony");
        }else{
            this.czyWlaczone=true;
            System.out.println("Włączyłem Alarm");
        }

    }

    @Override
    public boolean czyWlaczony() {
        if(this.czyWlaczone==true) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void wylacz() {
        if(this.czyWlaczone ==true){
            this.czyWlaczone=false;
            System.out.println("Wyłaczyłem Alarm");
        }else{
            System.out.println("Alarm jest wyłaczony");
        }
    }

    @Override
    public boolean czyWylaczony() {
        if(this.czyWlaczone==true) {
            return false;
        }else {
            return true;
        }
    }
}
