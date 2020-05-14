package zadania_6.operacjeNaPlikach.zapis.zad4;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*4. Napisz program, a w tym programie wczytaj jedną linię ze skanera od użytkownika.
        Poproś użytkownika o 'adres pliku'. Po wpisaniu zweryfikuj czy wybrany plik/katalog istnieje,
        czy jest plikiem/katalogiem, jaki jest jego: rozmiar, czas ostatniej modyfikacji
        i czy mamy prawa do odczytu/zapisu do tego pliku/katalogu.*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj adres pliku: ");
        String adres = in.nextLine();

        String nazwaPliku="output_4.txt";



            Path sciezka = Paths.get(adres,nazwaPliku);
            System.out.println(sciezka);
            System.out.println(sciezka.getFileName());





            /*Files.createFile(Paths.get(adres));
            BasicFileAttributeView attrView = Files.getFileAttributeView(Paths.get(adres), BasicFileAttributeView.class);
            BasicFileAttributes attributes = attrView.readAttributes();
            System.out.println(attributes.size()); //rozmiar w bajtach
            System.out.println(attributes.lastModifiedTime()); //ostatnia modyfikacja

            AclFileAttributeView aclAttrView =
                    Files.getFileAttributeView(Paths.get("C:/start/plik.txt"), AclFileAttributeView.class);
            List<AclEntry> acl = aclAttrView.getAcl();
            for (AclEntry aclEntry : acl) {
                aclEntry.flags().forEach(System.out::println);
                aclEntry.permissions().forEach(System.out::println);
                System.out.println(aclEntry.principal().getName());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException a)
            a.printStackTrace();
        }
*/
        }
    }