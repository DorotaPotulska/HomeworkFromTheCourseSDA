package zadania_3.Biblioteka;

import java.util.Arrays;

public class Biblioteka {
    private String adres;
    private String nazwa;
    private Egzemplarz[] egzemplarz;

    public Biblioteka(String adres, String nazwa, Egzemplarz[] egzemplarz) {
        this.adres = adres;
        this.nazwa = nazwa;
        this.egzemplarz = egzemplarz;

    }
    //////////////////////SZUKAJ PO TYTULE////////////////////////////////////////////////////////

   public Egzemplarz[] szukajPoTytule(String tytul){

       Egzemplarz[] znalezioneEgzemplarze=new Egzemplarz[1];
       int licznik=0;

       for(int i=0; i<this.egzemplarz.length;i++){
          if (this.egzemplarz[i].tytul.equals(tytul)){
              if(znalezioneEgzemplarze.length==licznik) {
                  znalezioneEgzemplarze = Arrays.copyOf(znalezioneEgzemplarze, znalezioneEgzemplarze.length + 1);
              }
              System.out.println("znaleziono "+i);

              znalezioneEgzemplarze[licznik]=this.egzemplarz[i];
              licznik++;
          }else{
              System.out.println("nie znaleziono");
          }

       }

       return znalezioneEgzemplarze;
   }

   ///////////////////////////////////////SZUKAJ PO AUTORZE/////////////////////////////
    public Egzemplarz[] szukajPoAutorze(String autor){

        Egzemplarz[] znalezioneEgzemplarze=new Egzemplarz[1];
        int licznik=0;

        for(int i=0; i<this.egzemplarz.length;i++){
            String autorEgz=egzemplarz[i].autor.imie+" "+egzemplarz[i].autor.nazwisko;
            if (autorEgz.equals(autor)){
                if(znalezioneEgzemplarze.length==licznik) {
                    znalezioneEgzemplarze = Arrays.copyOf(znalezioneEgzemplarze, znalezioneEgzemplarze.length + 1);
                }
                System.out.println("znaleziono "+i);

                znalezioneEgzemplarze[licznik]=this.egzemplarz[i];
                licznik++;
            }else{
                System.out.println("nie znaleziono");
            }

        }

        return znalezioneEgzemplarze;
    }

    //////////////////////////////////SZYKAJ PO FRAZIE/////////////////////////////////////////
    public Egzemplarz[] szukajPoFrazie(String fraza) {

        Egzemplarz[] znalezioneEgzemplarze = new Egzemplarz[1];
        int licznik = 0;

        for (int i = 0; i < this.egzemplarz.length; i++) {

            if (egzemplarz[i].autor.imie.equals(fraza) || egzemplarz[i].autor.nazwisko.equals(fraza) || this.egzemplarz[i].tytul.equals(fraza)) {
                if (znalezioneEgzemplarze.length == licznik) {
                    znalezioneEgzemplarze = Arrays.copyOf(znalezioneEgzemplarze, znalezioneEgzemplarze.length + 1);
                }
                System.out.println("znaleziono " + i);

                znalezioneEgzemplarze[licznik] = this.egzemplarz[i];
                licznik++;
                } else {
                System.out.println("nie znaleziono");

            }

        }

        return znalezioneEgzemplarze;
    }

    ///////////////////////////znajdzAutoraONajwiekszymDorobku(): Autor///////////////

        public Autor znajdzAutoraONajwiekszymDorobku() {

            Autor autorMAX = new Autor("imie","nazwisko");
            int ilosc = 0;
            int maxIlosc=0;

            for (int i = 0; i < egzemplarz.length; i++) {
                System.out.println("sprawdzam po autorze "+i);
                String autor = egzemplarz[i].autor.imie + " " + egzemplarz[i].autor.nazwisko;
                System.out.println("szukam "+autor);
                for (int j = 0; j < egzemplarz.length; j++) {

                    if (autor.equals(egzemplarz[j].autor.imie + " " + egzemplarz[j].autor.nazwisko)) {
                        System.out.println("znaleziono takiego samego autora");
                        ilosc++;
                        System.out.println(ilosc);
                    }

                }

                if(ilosc>maxIlosc){
                    System.out.println("przypisuje max ilosc");
                    maxIlosc=ilosc;
                    System.out.println(ilosc);
                    System.out.println("przypisuje autora");
                    autorMAX.imie = egzemplarz[i].autor.imie;
                    autorMAX.nazwisko=egzemplarz[i].autor.nazwisko;
                    System.out.println("nowy max autor to "+autorMAX.imie+ " "+autorMAX.nazwisko);
                    ilosc=0;
                }else{
                    System.out.println("zaczynam szukac od nowa ");
                    ilosc=0;
                }
            }

            return autorMAX ;
        }

}



