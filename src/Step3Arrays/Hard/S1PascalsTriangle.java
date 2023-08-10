package Step3Arrays.Hard;

import java.util.*;

public class S1PascalsTriangle {
    public static void main(String[] args) {

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(1);

        for(int i=1;i<numRows;i++){
            list.add(new ArrayList<>());
            list.get(i).add(1);

            for(int j=1;j<list.get(i-1).size();j++){
                int ele1 = list.get(i-1).get(j-1);
                int ele2 = list.get(i-1).get(j);

                list.get(i).add(ele1+ele2);
            }

            list.get(i).add(1);
        }

        return list;
    }
}
