package zadania_4.zad1;

public class Czajnik implements IOpenable, IWlaczalny,IWylaczalny{
    boolean czyOtwarte;
    boolean czyWlaczone;

    public Czajnik(boolean czyOtwarte, boolean czyWlaczone) {
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
            System.out.println("Czajnik już jest otwarty");
        }else{
            this.czyOtwarte =true;
            System.out.println("Otworzyłem Czajnik");
        }

    }

    @Override
    public void wlacz() {
        if(this.czyWlaczone ==true){
            System.out.println("Czajnik jest juz włączony");
        }else{
            this.czyWlaczone=true;
            System.out.println("Włączyłem Czajnik");
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
            System.out.println("Wyłaczyłem Czajnik");
        }else{
            System.out.println("Czajnik jest wyłaczony");
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
            System.out.println("Zamknąłem Czajnik");
        }else{
            System.out.println("Czajnik jest zamkniety");
        }

    }
}
