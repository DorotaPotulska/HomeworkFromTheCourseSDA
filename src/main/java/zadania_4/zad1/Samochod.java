package zadania_4.zad1;

public class Samochod implements IOpenable, IWlaczalny,IWylaczalny{

    boolean czyOtwarte;
    boolean czyWlaczone;

    public Samochod(boolean czyOtwarte, boolean czyWlaczone) {
        this.czyOtwarte = czyOtwarte;
        this.czyWlaczone = czyWlaczone;
    }

    @Override
    public boolean czyOtwarty() {
        return this.czyOtwarte;
    }

    @Override
    public void otworz() {
        if(this.czyOtwarte ==true){
            System.out.println("Samochód już jest otwarty");
        }else{
            this.czyOtwarte =true;
            System.out.println("Otworzyłem samochód");
        }

    }

    @Override
    public void wlacz() {
        if(this.czyWlaczone ==true){
            System.out.println("Samochód jest juz włączony");
        }else{
            this.czyWlaczone=true;
            System.out.println("Włączyłem samochód");
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
            System.out.println("Wyłaczyłem samochód");
        }else{
            System.out.println("Samochód jest wyłaczony");
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

    @Override
    public void zamknij() {
        if(this.czyOtwarte ==true){
            this.czyOtwarte =false;
            System.out.println("Zamknąłem samochód");
        }else{
            System.out.println("Samochód jest zamkniety");
        }

    }
}
