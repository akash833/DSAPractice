package Step3Arrays.Hard;

import java.util.*;

public class S2MajorityElementNby3 {
    public static void main(String[] args) {

    }

    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                list.add(key);
            }
        }

        return list;
    }
}
