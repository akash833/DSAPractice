package ComparatorOperator;

import java.util.ArrayList;
import java.util.Collections;

public class Dish implements Comparable<Dish>{
    private String type;
    private String name;
    private int price;
    private int quantity;

    Dish(String type,String name,int price,int quantity){
        this.type = type;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Dish o) {
        return this.price - o.price;
    }

    public String toString(){
        return "["+type+", "+name+", "+price+", "+quantity+" ]";
    }
}
