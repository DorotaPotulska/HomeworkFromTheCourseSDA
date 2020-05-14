package zadania_6.operacjeNaPlikach.odczyt.zad8;
/*8.*** Przygotuj DWIE aplikacje. Celem zadania będzie przekazanie danych z jednej aplikacji do drugiej.
Ponieważ jeszcze nie dotarliśmy do komunikacji między aplikacjami, spróbujemy zrobić to w "łopatologiczny"
sposób - czyli posługując się własnym mechanizmem pliku wymiany.

Chcemy aby jedna z aplikacji pozwalała na pisanie danych, a druga odbierała te dane.
W tym celu stworzymy plik wymiany danych.

---
Pierwsza aplikacja będzie czytała ze Scanner'a dane, które będzie od razu zapisywała do pliku.
Po każdym zapisaniu linii do pliku wypisz na konsolę komunikat:
Przesłano: XYZ
gdzie XYZ jest zawartością linii, która została umieszczona w pliku. Powtarzaj wykonanie tej czynności
w pętli while - dopóki użytkownik nie wpisze komendy "quit".

Dodatkowo - dodaj obsługę dodatkowej komendy:
SET_FILE nazwa_pliku

po wpisaniu takiej linii do konsoli aplikacja powinna otwierać nowy plik o nazwie nazwa_pliku.
Czyli - próbujemy zaimplementować funkcjonalność przełączania zapisu do różnych plików.


---
Druga aplikacja odpowiada za czytanie pliku.

Po odczytaniu linii z pliku aplikacja będzie przetwarzać tą linię. Na początku zróbmy
proste przetwarzanie - po każdym odczycie wypisz linię na ekran:
Odebrano linię: XYZ
gdzie XYZ jest linią z pliku.
Nie czyść pliku po odczycie. Wykonuj odczyty tylko gdy:
a) zmieniła się wielkość pliku oraz czas ostatniej modyfikacji
b) zmieniła się ostatnia odczytana linia z pliku.

Dodatkowo - spróbuj dodać opóźnienie czytania z pliku.
Zwróć uwagę na to, że po uruchomieniu aplikacji pętla czytająca plik stale wykonuje odczyt i zużywa bardzo dużo zasobów
(spójrz na zużycie procesora). W pętli powinniśmy dopisać "odsypianie" określoną ilość czasu,
aby nie obciążać tak bardzo procesora.
Możemy to zrobić, ponieważ nie ma potrzeby czytania pliku (w zależności od procesora) tysiące razy na sekundę,
wystarczy to zrobić raz, a następnie odczekać chwilę.

Dodatkowo - podobnie jak w pierwszej aplikacji zaimplementuj obsługę komendy:
SET_FILE nazwa_pliku

po wpisaniu tej linii do konsoli aplikacja powinna otwierać nowy plik z którego następnie czyta kolejne linie.
*/
public class Main {
}
