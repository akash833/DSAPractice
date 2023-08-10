package ComparatorOperator;

import java.util.ArrayList;
import java.util.Collections;

public class DemoDish {
    public static void main(String[] args) {
        ArrayList<Dish> list = new ArrayList<>();
        list.add(new Dish("Non-veg","sandwich",200,2));
        list.add(new Dish("veg","jalibe",100,2));
        list.add(new Dish("veg","chowmin",50,2));
        list.add(new Dish("Non-veg","maggie",100,1));
        list.add(new Dish("veg","momos",100,6));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        String rem = "sandwich";
        int idx = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().equals(rem)){
                idx = i;
            }
        }
//        list.remove(idx);

        System.out.println(list);

        for(int i=0;i<list.size();i++){
            int pr = list.get(i).getPrice();
            if(pr<100){
                list.get(i).setPrice(pr+10);
            }else if(pr>=100 && pr<=200){
                list.get(i).setPrice(pr+20);
            }else{
                list.get(i).setPrice(pr+30);
            }
        }

        System.out.println(list);

        for(int i=0;i<list.size();i++){
            if(list.get(i).getType().equals("veg")){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }
}
