package zadania_2.obiektowosc.zad3;

import java.util.Arrays;

/*zad 3 Stwórz klasę RachunekBankowy która posiada pola:
        - numer konta
        - ilość środków na koncie
        - imie i nazwisko właściciela
        stwórz w klasie metody:
        - gettery do wszystkich pól (nie settery - wiesz dlaczego?)
        - wykonajPrzelewPrzychodzący(double kwota):void
        - wykonajPrzelewWychodzący(double kwota):void
        (metody odejmują lub dodają na konto podaną ilość pieniędzy)

        Stwórz klasę Bank która posiada jako pola:
        - nazwę banku
        - tablicę kont bankowych
        stwórz w klasie metody:
        - wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwotaPrzelewu)*/
public class Bank {

       String nameBank;
       RachunekBankowy[] tableAccounts;

    public Bank(final String nameBank, final RachunekBankowy[] tableAccounts) {
        this.nameBank = nameBank;
        this.tableAccounts = tableAccounts;
    }

    public void wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwotaPrzelewu){

           for (int i = 0; i < tableAccounts.length; i++) {

               if(tableAccounts[i].numerKonta.equals(numerKontaZ)){
                   tableAccounts[i].wykonajPrzelewWychodzacy(kwotaPrzelewu);
               }

               if(tableAccounts[i].numerKonta.equals(numerKontaNa)){
                   tableAccounts[i].wykonajPrzelewPrzychodzacy(kwotaPrzelewu);
               }

           }

    }

    @Override
    public String toString() {
        return "Bank{" +
                "nameBank='" + nameBank + '\'' +
                ", tableAccounts=" + Arrays.toString(tableAccounts) +
                '}';
    }
}
