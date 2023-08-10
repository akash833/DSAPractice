package D1_Oops.SetDemo;

import java.util.Comparator;

public class ComparatorName implements Comparator<Student> {

    @Override
    public int compare(Student s1,Student s2) {
        if(s1.name.equals(s2.name)){
            return s1.id - s2.id;
        }
        return s1.name.compareTo(s2.name);
    }
}
