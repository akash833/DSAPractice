package Day_23_08_01;

import java.util.ArrayList;

public class SubsetOfString {
    public static void main(String[] args) {
        subset("","abc");
    }

    public static ArrayList<String> subsetRet(String p,String up){
        ArrayList<String> list = new ArrayList<>();

        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        list.addAll(subsetRet(p+ch,up.substring(1)));
        list.addAll(subsetRet(p,up.substring(1)));

        return list;
    }

    public static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }
}
