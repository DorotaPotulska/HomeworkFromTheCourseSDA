package zadania_5.kolekcje_listy.zad6_DOKONCZ;

import java.util.Comparator;

public class SortujPoNrIndeksu  implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return Integer.parseInt(student.getNrIndeksu())- Integer.parseInt(t1.getNrIndeksu());
    }
}
