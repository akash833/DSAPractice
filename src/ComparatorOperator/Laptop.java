package ComparatorOperator;

import java.util.*;

public class Laptop implements Comparable{
    int price;
    int ram;
    int storage;

    Laptop(int price,int ram,int storage){
        this.price = price;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public int compareTo(Object obj) {
        Laptop o = (Laptop) obj;
//        if(price==o.price)
//            return 0;
//        else if(price>o.price)
//            return 1;
//        else
//            return -1;
        return this.price - o.price;
    }

    @Override
    public String toString(){
        return "Price ="+price+",Ram ="+ram+ ",Storage ="+storage;
    }

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(new Laptop(2300,4,500));
        a.add(new Laptop(2500,8,1000));
        a.add(new Laptop(2600,16,200));
        a.add(new Laptop(2100,2,100));

        for(int i=0;i<a.size();i++){
            Laptop lp =(Laptop) a.get(i);
            System.out.println(lp.price);
        }

        ArrayList a2 = new ArrayList(a);

        Collections.sort(a);

        for(int i=0;i<a.size();i++){
            Laptop lp =(Laptop) a.get(i);
            System.out.println(lp);
        }

        ArrayList list = new ArrayList();
        list.add(8.34);
        list.add(1.34);
        list.add(3.34);
        list.add(2.34);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
    }
}