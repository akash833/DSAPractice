package Step3Arrays.Hard;

import java.util.*;

public class S3_3Sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSumB(arr));
    }
    public static List<List<Integer>> threeSumB(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        System.out.println(map);

        for(int i=0;i<n;i++){
            int num1 = nums[i];
            // write code of two sum
            for(int j=i+1;j<n;j++){
                int num2 = nums[j];
                int rem = -(num1+num2);
                if(map.containsKey(rem) && map.get(rem)!=i && map.get(rem)!=j){
                    List<Integer> list = new ArrayList<>();
                    list.add(num1);
                    list.add(num2);
                    list.add(rem);
                    Collections.sort(list);
                    set.add(list);
                }
            }
        }

        return new ArrayList<>(set);
    }
    public List<List<Integer>> threeSumF2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            int num1 = nums[i];
            for(int j=i+1;j<n;j++){
                int num2 = nums[j];
                for(int k=j+1;k<n; k++){
                    int num3 = nums[k];
                    List<Integer> list = new ArrayList<>();
                    list.add(num1);
                    list.add(num2);
                    list.add(num3);
                    if(num1+num2+num3 == 0 && !set.contains(list)){
                        ans.add(list);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }

        return ans;
    }

    public List<List<Integer>> threeSumF1(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0;i<n;i++){
            int num1 = nums[i];
            for(int j=i+1;j<n;j++){
                int num2 = nums[j];
                for(int k=j+1;k<n; k++){
                    int num3 = nums[k];
                    if(num1+num2+num3 == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(num1);
                        list.add(num2);
                        list.add(num3);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
