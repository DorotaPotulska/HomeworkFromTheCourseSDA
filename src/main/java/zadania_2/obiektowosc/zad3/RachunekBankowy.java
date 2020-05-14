package zadania_2.obiektowosc.zad3;
/*zad 3 Stwórz klasę RachunekBankowy która posiada pola:
        - numer konta
        - ilość środków na koncie
        - imie i nazwisko właściciela
        stwórz w klasie metody: - gettery do wszystkich pól (nie settery - wiesz dlaczego?)
        - wykonajPrzelewPrzychodzący(double kwota):void
        - wykonajPrzelewWychodzący(double kwota):void
        (metody odejmują lub dodają na konto podaną ilość pieniędzy)

        Stwórz klasę Bank która posiada jako pola:
        - nazwę banku
        - tablicę kont bankowych stwórz w klasie metody:
        - wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwotaPrzelewu)*/
public class RachunekBankowy {

    String numerKonta;
    double stanKonta;
    String imie;
    String nazwisko;

    public RachunekBankowy(String numerKonta, double stanKonta, String imie, String nazwisko){
        this.numerKonta=numerKonta;
        this.stanKonta=stanKonta;
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void wykonajPrzelewPrzychodzacy(double kwota){
        stanKonta+=kwota;
        System.out.println(stanKonta);
    }

    public void wykonajPrzelewWychodzacy(double kwota){
        stanKonta-=kwota;
        System.out.println(stanKonta);
    }


    @Override
    public String toString() {
        return "RachunekBankowy{" +
                "numerKonta='" + numerKonta + '\'' +
                ", stanKonta=" + stanKonta +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
