package Day_23_08_01;

import java.util.ArrayList;

public class PermutationOfString {
    public static void main(String[] args) {
        permutation("","abc");
        System.out.println(permutationRet("","abc"));
    }
    public static ArrayList<String> permutationRet(String p, String up){
        ArrayList<String> list = new ArrayList<>();

        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        for(int i=0;i<p.length()+1;i++){
            String str  = p.substring(0,i)+up.charAt(0)+p.substring(i);
            list.addAll(permutationRet(str,up.substring(1)));
        }

        return list;
    }

    public static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        for(int i=0;i<p.length()+1;i++){
            String str  = p.substring(0,i)+up.charAt(0)+p.substring(i);
            permutation(str,up.substring(1));
        }
    }
}
