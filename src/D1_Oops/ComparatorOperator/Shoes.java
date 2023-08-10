package D1_Oops.ComparatorOperator;

import java.util.*;

class ShoesPriceComparator implements Comparator<Shoes>{
    public int compare(Shoes s1,Shoes s2){
        return s1.price - s2.price;
    }
}
class ShoesPriceDecComparator implements Comparator<Shoes>{
    public int compare(Shoes s1,Shoes s2){
        return s2.price - s1.price;
    }
}

class ShoesSizeComparator implements Comparator<Shoes>{
    public int compare(Shoes s1,Shoes s2){
        return s1.size - s2.size;
    }
}

public class Shoes {
    int price;
    int size;
    String name;
    String color;

    Shoes(int price,int size,String name,String color){
        this.price = price;
        this.size = size;
        this.name = name;
        this.color = color;
    }

    public String toString(){
        return "\n  Shoes [price = " +price + ", size = "+size +", name = "+name+", color = "+color+" ]";
    }

    public static void main(String[] args) {
        ArrayList<Shoes> a = new ArrayList<>();
        a.add(new Shoes(15000,10,"Adidas","Blue"));
        a.add(new Shoes(12000,8,"Jordan","Grey"));
        a.add(new Shoes(1000,10,"Puma","Black"));
        a.add(new Shoes(500,3,"Sparx","White"));
        a.add(new Shoes(3000,6,"Reebook","Brown"));

        System.out.println(a);
        Collections.sort(a,new ShoesPriceComparator());
        System.out.println(a);
        Collections.sort(a,new ShoesSizeComparator());
        System.out.println(a);
        Collections.sort(a,new ShoesPriceDecComparator());
        System.out.println(a);
    }
}
