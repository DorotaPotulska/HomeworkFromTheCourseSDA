package zadania_3.Biblioteka;
    /*    1. Utwórz następujące klasy:
            1. Biblioteka
            2. Egzemplarz
            3. Książka
            4. Czasopismo
            5. Człowiek
            6. Autor
        2. Jakie pola i metody należy przypisać każdej z powyższych klas?
        3. Utwórz następujące metody dla klasy Biblioteka:
            1. szukajPoTytule (String tytuł):Egzemplarz[] – metoda zwracająca wszystkie egzemplarze
            znajdujące się w bibliotece pasujące do zadanego tytułu
            2. szukajPoAutorze(String autor):Egzemplarz[] – metoda zwracająca wszystkie egzemplarze
            znajdujące się w bibliotece, wśród których jest autor
        3. * szukajPoAutorzeLubTytule(String fraza):Egzemplarz[]
        4. * znajdzAutoraONajwiekszymDorobku(): Autor*/
public class Main {
        public static void main(String[] args) {

            Egzemplarz[] egzemplarz = {new Ksiazka(new Autor("Piotr","Potulski"),"Masterchef",'K'),
                    new Ksiazka(new Autor("Piotr","Potulski"),"Samoobrona",'K'),
                    new Ksiazka(new Autor("Dorota","Potulska"),"Kochane dzieci",'K'),
                    new Ksiazka(new Autor("Piotr","Potulski"),"Masterchef",'K'),
                    new Czasopismo(new Autor("Piotr","Potulski"),"Masterchef",'C'),
                    new Czasopismo(new Autor("Piotr","Potulski"),"Samoobrona",'C'),
                    new Czasopismo(new Autor("Piotr","Potulski"),"Kochane dzieci",'C'),
                    new Czasopismo(new Autor("Dorota","Potulska"),"Masterchef",'C')};

            Biblioteka biblioteka =new Biblioteka("Współczesna","Potulscy",egzemplarz);

            for(int i=0;i<egzemplarz.length;i++){
                System.out.println(egzemplarz[i].toString());
            }

            ////////////////////////////////////////////////////////////////////////////////

            System.out.println("Szukam po TYTULE");
            Egzemplarz[] znalezione = biblioteka.szukajPoTytule("Masterchef");

            for(int i=0;i<znalezione.length;i++){
            System.out.println(znalezione[i].toString());
            }

            ////////////////////////////////////////////////////////////////////////////////

            System.out.println("Szukam po AUTORZE");
            Egzemplarz[] znalezioneA = biblioteka.szukajPoAutorze("Dorota Potulska");

            for(int i=0;i<znalezioneA.length;i++){
                System.out.println(znalezioneA[i].toString());
            }

            ///////////////////////////////////////////////////////////////////////////////
            System.out.println("Szukam po FRAZIE");
            Egzemplarz[] znalezioneC = biblioteka.szukajPoFrazie("Masterchef");

            for(int i=0;i<znalezioneC.length;i++){
                System.out.println(znalezioneC[i].toString());
            }

            System.out.println("Szukam po FRAZIE");
            Egzemplarz[] znalezioneD = biblioteka.szukajPoFrazie("Potulski");

            for(int i=0;i<znalezioneD.length;i++){
                System.out.println(znalezioneD[i].toString());
            }


            System.out.println("Szukam po DOROBKU");
            System.out.println(biblioteka.znajdzAutoraONajwiekszymDorobku().toString());

        }
}
