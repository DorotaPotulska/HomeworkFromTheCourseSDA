package zadania_5.kolekcje_listy.zad2_sortowanie_clone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*2. Stwórz oddzielnego maina, a w nim kolejną listę integerów. Wykonaj zadania:
        - dodaj do listy 10 liczb losowych
        - oblicz sumę elementów na liście (wypisz ją)
        - oblicz średnią elementów na liście (wypisz ją)
        - ​stwórz kopię listy i ją posortuj​:  (Collections.sort( listaDoPosortowania)- sortuje listę)
        (przykład użycia Collections.sort(lista): ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(5); liczby.add(10); liczby.add(15);
        Collections.sort(liczby);

        - podaj medianę elementów na liście posortowanej (wypisz ją)
        - znajdź największy i najmniejszy element na liście która nie była sortowana. Zrób to pętlą for
        - po znalezieniu elementu znajdź index elementu maksymalnego używając kolejnej pętli for
        - po znalezieniu elementów (największy i najmniejszy) znajdź index posługując się metodą indexof

        Sprawdź działanie aplikacji.*/
public class Main {
    public static void main(String[] args) {

        List<Integer> lista= new ArrayList<>();
        Random rd = new Random();
        int suma=0;

        for(int i=0; i<10; i++){
            lista.add(rd.nextInt(10));
        }

        System.out.println(lista);

        for(int x:lista){
            suma+=x;
        }

        System.out.println("Suma wynosi "+ suma);

        int srednia = suma/lista.size();
        System.out.println("Srednia wynioni " +srednia);

        ArrayList<Integer> lista2= (ArrayList<Integer>) ((ArrayList<Integer>) lista).clone();

        System.out.println(lista);
        System.out.println(lista2);
        //////////////////SORTOWANIE
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(lista2);


        //////////////////MEDIANA
        double mediana;
        int liczba;
        if(lista.size()%2==0){
            liczba=lista.size()/2;
            //System.out.println(liczba);
            //System.out.println(lista2.get(liczba-1));
            //System.out.println(lista2.get(liczba));
            mediana=(double) (lista.get(liczba-1)+lista.get(liczba))/2;
        }else{
            liczba=(lista.size()+1)/2;
            mediana=lista.get(liczba);
        }

        System.out.println("Mediana wynosi "+mediana);

        ////////////////NAJMNIEJSZY ELEMENT i NAJWIEKSZY ELEMENT
        System.out.println(lista2);
        int najmniejszy= lista2.get(0);
        int najwiekszy= lista2.get(0);
        for(int i=0; i<lista2.size();i++){

            if(najmniejszy>lista2.get(i)){
                najmniejszy=lista2.get(i);
            }

            if(najwiekszy<lista2.get(i)){
                najwiekszy=lista2.get(i);
            }
        }

        System.out.println("Najmniejszy element listy wynosi "+najmniejszy);

        System.out.println("Najwiekszy element listy wynosi "+najwiekszy);

        for(int j=0; j<lista2.size();j++){
            if(najwiekszy==lista2.get(j)){
                System.out.println("Indeks najwiekszego elementu wynosi "+ j);
            }
        }

        System.out.println(lista2);
        System.out.println("Indeks najmniejszego elementu "+lista2.indexOf(najmniejszy));
        System.out.println("Indeks najwiekszego elementu "+lista2.indexOf(najwiekszy));
    }
}
