package Day_23_08_01;

public class SkipChar {
    public static void main(String[] args) {
        String str = "aappbdubaappleadubappleappabaanda";
        System.out.println(skipChar("",str));
    }

    public static String removeString (String s , String ans)
    {
        if(s.isEmpty())
        {
            return ans;
        }

        char ch = s.charAt(0);
        if(ch == 'a')
        {
            return removeString(s.substring(1) , ans);
        }
        return removeString(s.substring(1) , ans+ch);
    }

    public static String skipWord(String p,String up){
        if(up.isEmpty()){
            return p;
        }
        if(up.length()>4){
            if(!up.startsWith("apple") && up.startsWith("app")){
                return skipChar(p,up.substring(3));
            }
        }

        return skipChar(p+up.charAt(0),up.substring(1));
    }

    public static String skipChar(String p,String up){
        if(up.isEmpty()){
            return p;
        }

        if(up.charAt(0)=='a'){
            return skipChar(p,up.substring(1));
        }

        return skipChar(p+up.charAt(0),up.substring(1));
    }

    public static String removeA(String s, String ans) {

        if(s.isEmpty()) {
            return ans;
        }

        char ch = s.charAt(0);
        if(ch=='a') {
            return removeA(s.substring(1),ans);
        }

        return removeA(s.substring(1),ans+ch);
    }


}
