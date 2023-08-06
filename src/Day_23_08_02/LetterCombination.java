package Day_23_08_02;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinations(String digits) {
        return pad(digits,"",0);
    }

    public static List<String> pad(String digits,String p,int i){
        List<String> ans = new ArrayList<>();

        if(i == digits.length()){
            ans.add(p);
            return ans;
        }

        int digit = digits.charAt(i)-'0';

        int s = (digit-2)*3;
        int e = (digit-1)*3;

        if(digit==7){
            e++;
        }else if(digit==8){
            s++;e++;
        }else if(digit==9){
            s++;e+=2;
        }

        for(int j=s;j<e;j++){
            char ch = (char) ('a' + j);
            ans.addAll(pad(digits,p+ch,i+1));
        }
        return ans;
    }
}
