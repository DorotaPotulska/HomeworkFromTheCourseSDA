package zadania_3.zad7_robot;

public class Robot {

    /*Stwórz klasę Robot która posiada pola:
             - poziom baterii ( wartość od 0 do 100)
             - nazwa robota
             - czy włączony
             stwórz metody:
             - poruszRobotem(RuchRobota):void - ktora porusza robotem jeśli robot posiada dostateczną ilość energii
             (oraz odejmuje zadaną ilość energii z robota)
             - naładujRobota():void - która zwiększa ilość % baterii do 100%
             - włączRobota():void - włącza robota
             - wyłączRobota():void - wyłącza robota*/
        String nazwaRobota;
        int poziomBaterii;
        boolean czyWlaczony;

        public Robot(String nazwaRobota, int poziomBaterii, boolean czyWlaczony) {
            this.nazwaRobota = nazwaRobota;
            this.poziomBaterii = poziomBaterii;
            this.czyWlaczony = czyWlaczony;
        }

        public void poruszRobotem(RuchRobota ruchRobota) {
            if (czyWlaczony) {

                switch (ruchRobota) {
                    case RUCH_REKA_LEWA:
                        if (poziomBaterii >= ruchRobota.RUCH_REKA_LEWA.getEnergia()) {
                            this.poziomBaterii = poziomBaterii - ruchRobota.RUCH_REKA_LEWA.getEnergia();
                            System.out.println("Ruszylem reka lewą, poziom bateri wynosi " + this.poziomBaterii);
                        } else {
                            System.out.println("Mam za mało energii");
                        }
                        break;
                    case RUCH_REKA_PRAWA:
                        if (poziomBaterii >= ruchRobota.RUCH_REKA_PRAWA.getEnergia()) {
                            this.poziomBaterii = poziomBaterii - ruchRobota.RUCH_REKA_PRAWA.getEnergia();
                            System.out.println("Ruszylem reka prawą, poziom bateri wynosi " + this.poziomBaterii);
                        } else {
                            System.out.println("Mam za mało energii");
                        }
                        break;
                    case KROK_LEWA:
                        if (poziomBaterii >= ruchRobota.KROK_LEWA.getEnergia()) {
                            this.poziomBaterii = poziomBaterii - ruchRobota.KROK_LEWA.getEnergia();
                            System.out.println("Zrobiłem krok lewą nogą, poziom bateri wynosi " + this.poziomBaterii);
                        } else {
                            System.out.println("Mam za mało energii");
                        }
                        break;
                    case KROK_PRAWA:
                        if (poziomBaterii >= ruchRobota.KROK_PRAWA.getEnergia()) {
                            this.poziomBaterii = poziomBaterii - ruchRobota.KROK_PRAWA.getEnergia();
                            System.out.println("Zrobiłem krok prawą nogą, poziom bateri wynosi " + this.poziomBaterii);
                        } else {
                            System.out.println("Mam za mało energii");
                        }
                        break;
                    case SKOK:
                        if (poziomBaterii >= ruchRobota.SKOK.getEnergia()) {
                            this.poziomBaterii = poziomBaterii - ruchRobota.SKOK.getEnergia();
                            System.out.println("Skoczyłem, poziom bateri wynosi " + this.poziomBaterii);
                        } else {
                            System.out.println("Mam za mało energii");
                        }
                        break;
                    default:
                        System.out.println("Wartość niepoprawna");
                        break;
                }

            } else {
                System.out.println("Robot jest wyłączony");
            }
            ;

        }

        public void naladujRobota() {
            if (this.czyWlaczony) {
                System.out.println("Robo włączony, ładowanie niemozliwe");
            } else {
                this.poziomBaterii = 100;
                System.out.println("Robot był wyłaczony i został naładowany");
            }


        }

        public void wlaczRobota() {
            if (czyWlaczony == false) {
                this.czyWlaczony = true;
                System.out.println("Włączyłem robota");
            } else {
                System.out.println("Robot był wlączony");
            }

        }

        public void wylaczRobota() {

            if (czyWlaczony == true) {
                this.czyWlaczony = false;
                System.out.println("Wyłączyłem robota");
            } else {
                System.out.println("Robot był wylączony");
            }
        }

        @Override
        public String toString() {
            return "Robot{" +
                    "nazwaRobota='" + nazwaRobota + '\'' +
                    ", poziomBaterii=" + poziomBaterii +
                    ", czyWlaczony=" + czyWlaczony +
                    '}';
        }
    }

