package zadania_2.klasa_obiekt_Zrobic.zad4;

import java.util.Comparator;

public class StudentNumberIndeksComparator implements Comparator<Student> {
    @Override
    public int compare(final Student s1, final Student s2) {
        return Integer.valueOf(s1.getNrIndeksu()).compareTo(Integer.valueOf(s2.getNrIndeksu()));
    }
}
