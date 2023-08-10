package D1_Oops.SetDemo;

import java.util.*;

public class Student implements Comparable<Student>{
    String name;
    int id;
    String branch;
    int salExpectation;

    Student(String name,int id,String branch,int salExpectation){
        this.name = name;
        this.id = id;
        this.branch  = branch;
        this.salExpectation = salExpectation;
    }

    public String toString(){
        return name + " "+ id+" "+branch+" "+salExpectation;
    }

    public int hashCode(){
        return Objects.hash(this.name,this.id,this.branch,this.salExpectation);
    }

    public boolean equals(Student s){
        if(this.hashCode() == s.hashCode()){
            return true;
        }

        return false;
    }

    public int compareTo(Student o) {
        return this.id-o.id;
    }
}
