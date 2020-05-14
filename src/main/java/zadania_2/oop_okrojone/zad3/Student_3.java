package zadania_2.oop_okrojone.zad3;

public class Student_3 {

        private String imie;
        private String nazwisko;
        private int nrIndeksu;
        private char plec;

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public int getNrIndeksu() {
            return nrIndeksu;
        }

        public void setNrIndeksu(int nrIndeksu) {
            this.nrIndeksu = nrIndeksu;
        }

        public char getPlec() {
            return plec;
        }

        public void setPlec(char plec) {
            this.plec = plec;
        }

    public void przedstawSie(){
            if(Character.compare(this.plec,'M')==0){
                System.out.println("Cześć! Jestem "+this.imie+" "+this.nazwisko+" jestem studentem o numerze indeksu "+this.nrIndeksu);
            }else{
                System.out.println("Cześć! Jestem "+this.imie+" "+this.nazwisko+" jestem studentką o numerze indeksu "+this.nrIndeksu);
            }

    }
}
