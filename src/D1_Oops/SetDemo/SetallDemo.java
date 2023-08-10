package D1_Oops.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetallDemo {
    public static void main(String[] args) {
        // Unordered
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("Avdesh",23,"CSE",2300));
        set.add(new Student("Abhishek",43,"ECE",5300));
        set.add(new Student("Gopal",3,"EEE",5600));
        set.add(new Student("Preet",18,"ME",8700));
        System.out.println(set);

        // Order maintain
        LinkedHashSet<Student> lset = new LinkedHashSet<>();
        lset.add(new Student("Avdesh",23,"CSE",2300));
        lset.add(new Student("Abhishek",43,"ECE",5300));
        lset.add(new Student("Gopal",3,"EEE",5600));
        lset.add(new Student("Preet",18,"ME",8700));
        System.out.println(lset);


        // Sorted
        TreeSet<Student> tset = new TreeSet<>(new ComparatorName());
        tset.add(new Student("Avdesh",23,"CSE",2300));
        tset.add(new Student("Avdesh",33,"CSE",2300));
        tset.add(new Student("Abhishek",43,"ECE",5300));
        tset.add(new Student("Gopal",3,"EEE",5600));
        tset.add(new Student("Gopal",30,"EEE",5600));
        tset.add(new Student("Preet",18,"ME",8700));
        tset.add(new Student("Preet",28,"ME",8700));
        System.out.println(tset);
    }
}
