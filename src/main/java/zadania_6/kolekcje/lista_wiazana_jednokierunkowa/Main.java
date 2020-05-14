package zadania_6.kolekcje.lista_wiazana_jednokierunkowa;

public class Main {

    /*

     */
/*    Link do gita z kodem linkedlisty z webinaru: https://github.com/chodek/javagda34/tree/master/src/main/java/webinar1/myLinkedList

            1) Do kodu powyżej dorobić metodę remve(int index) - która usuwa z listy element o podanym indeksie.
            2) Przerobić listę tak, aby była generyczna - tj. można było ją typizować. (Przerobić również klasę Node)
            3) Dopisać/przerobić metody tak, aby spełniały poniższe wymagania:
    Wymagane metody:*//*


     */
/**
 * Zwraca true jeśli lista jest pusta.
 *//*

    boolean isEmpty();

    */
/**
 * Zwraca rozmiar listy (ilość elementów).
 *//*

    int size();

    */
/**
 * Zwraca pierwszy element listy.
 *
 * @throws NoSuchElementException jeśli lista jest pusta
 *//*

    T getFirst();

    */
/**
 * Zwraca ostatni element listy.
 *
 * @throws NoSuchElementException jeśli lista jest pusta
 *//*

    T getLast();

    */
/**
 * Pobiera element listy pod podanym indeksem.
 *
 * @throws IndexOutOfBoundsException jeśli indeks leży poza zakresem listy
 *//*

    T get(int index);

    */
/**
 * Usuwa wszystkie elementy z listy.
 *//*

    void clear();

    */
/**
 * Dodaje nowy element na początku listy.
 *//*

    void addFirst(T element);

    */
/**
 * Dodaje nowy element na końcu listy.
 *//*

    void addLast(T element);

    */
/**
 * Usuwa pierwszy element listy.
 *
 * @throws NoSuchElementException jeśli lista jest pusta
 *//*

    void removeFirst();

    */
/**
 * Usuwa ostatni element listy.
 *
 * @throws NoSuchElementException jeśli lista jest pusta
 *//*

    void removeLast();


    */
/**
 * Zamienia element pod podanym indeksem.
 *//*

    void setAt(int index, T element);

    */
/**
 * Dodaje nowy element pod wskazanym indeksem.
 *
 * @throws IndexOutOfBoundsException jeśli indeks leży poza zakresem listy
 *//*

    void addAt(int index, T element);

    */
/**
 * Usuwa element pod wskazanym indeksem.
 *
 * @throws IndexOutOfBoundsException jeśli indeks leży poza zakresem listy
 *//*

    void removeAt(int index);


    ////////////////////////////////////////////
    //                                        //
    // PONIŻEJ ZADANIA DODATKOWE DLA CHĘTNYCH //
    //                                        //
    ////////////////////////////////////////////

    */
/**
 * Zwraca iterator po elementach listy.
 *
 * @see Iterable
 *//*

    @Override
    Iterator<T> iterator();

*/
}
