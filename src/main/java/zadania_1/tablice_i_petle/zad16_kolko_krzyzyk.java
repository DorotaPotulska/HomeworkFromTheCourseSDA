package zadania_1.tablice_i_petle;

import java.util.Scanner;

public class zad16_kolko_krzyzyk {
    public static void main(String[] args) {
        char[][] tablica = {{'0', '1', '2'}, {'3', '4', '5'}, {'6', '7', '8'}};

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                System.out.print(tablica[i][j] + " | ");
            }
            System.out.println();
            System.out.println("------------");
        }

        System.out.println("Zaczynamy grę w kółko i krzyżyk");
        char znak = pobierzZnak();

        char znak2;

        if (znak == 'X') {
            znak2 = 'O';
        } else {
            znak2 = 'X';
        }

        char miejsce;

        int iloscProb = 0;
        while (iloscProb < 9) {
            if ((tablica[0][0] == tablica[0][1] && tablica[0][1] == tablica[0][2]) ||
                    (tablica[1][0] == tablica[1][1] && tablica[1][1] == tablica[1][2]) ||
                    (tablica[2][0] == tablica[2][1] && tablica[2][1] == tablica[2][2]) ||
                    (tablica[0][0] == tablica[1][0] && tablica[1][0] == tablica[2][0]) ||
                    (tablica[0][1] == tablica[1][1] && tablica[1][1] == tablica[2][1]) ||
                    (tablica[0][2] == tablica[1][2] && tablica[1][2] == tablica[2][2]) ||
                    (tablica[0][0] == tablica[1][1] && tablica[1][1] == tablica[2][2]) ||
                    (tablica[0][2] == tablica[1][1] && tablica[1][1] == tablica[2][0])) {
                System.out.println("Koniec Gry");
                if(iloscProb%2==0){
                    System.out.println("Wygrywa " + znak2);
                    break;
                }else{
                    System.out.println("Wygrywa " + znak);
                    break;
                }


            } else {
                if ((iloscProb + 1) % 2 != 0) {
                    System.out.println("Wskaż gdzie postawić " + znak);
                    miejsce = pobierzLiczbe();
                    for (int i = 0; i < tablica.length; i++) {
                        for (int j = 0; j < tablica.length; j++) {
                            if (tablica[i][j] == miejsce) {
                                if (tablica[i][j] != znak && tablica[i][j] != znak2 ) {
                                    tablica[i][j] = znak;
                                    iloscProb++;
                                    break;
                                }

                            }

                        }


                    }

                    for (int i = 0; i < tablica.length; i++) {
                        for (int j = 0; j < tablica.length; j++) {
                            System.out.print(tablica[i][j] + " | ");
                        }
                        System.out.println();
                        System.out.println("------------");
                    }


                } else {
                    System.out.println("Wskaż gdzie postawić " + znak2);
                    miejsce = pobierzLiczbe();
                    for (int i = 0; i < tablica.length; i++) {
                        for (int j = 0; j < tablica.length; j++) {
                            if (tablica[i][j] == miejsce) {
                                if (tablica[i][j] != znak && tablica[i][j] != znak2) {
                                    tablica[i][j] = znak2;
                                    iloscProb++;
                                    break;
                                }
                            }
                        }

                    }

                    for (int i = 0; i < tablica.length; i++) {
                        for (int j = 0; j < tablica.length; j++) {
                            System.out.print(tablica[i][j] + " | ");
                        }
                        System.out.println();
                        System.out.println("------------");
                    }

                }
            }
        }


    }

    public static char pobierzZnak() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj znak: O lub X");
        return in.nextLine().charAt(0);
    }

    public static char pobierzLiczbe() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj miejsce znaku");
        return in.nextLine().charAt(0);
    }
}
