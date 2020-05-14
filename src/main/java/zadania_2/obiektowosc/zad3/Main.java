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
        - tablicę kont bankowych
        stwórz w klasie metody:
        - wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwotaPrzelewu)*/
public class Main {
    public static void main(String[] args) {
        RachunekBankowy rach1 = new RachunekBankowy("1234",100.00,"Dorota","Chajewska");
        RachunekBankowy rach2 = new RachunekBankowy("5678",200.00,"Piotr","Potulski");

        Bank bank1= new Bank("mBank",new RachunekBankowy[]{rach1,rach2});

        System.out.println(bank1);
        bank1.wykonajPrzelew("5678","1234",50);
        System.out.println(bank1);
        bank1.wykonajPrzelew("5678","1234",50);
        System.out.println(bank1);
        bank1.wykonajPrzelew("5678","1234",50);
        System.out.println(bank1);
    }
}
