package problems;

import java.util.HashMap;
import java.util.Map;

public class MinimumRoundaToCompleteAllTasks {
    public static void main(String[] args) {
        int[] tasks = {7,7,7,7,7,7};
        System.out.println(minimumRounds(tasks));
    }

    public static int minimumRounds(int[] tasks) {
        int count = 0; HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : tasks)
            map.put(x,map.getOrDefault(x,0)+1);
        for(int x : map.keySet())
            if(map.get(x)==1){
                return -1;
            }
            else{
                count+=map.get(x)/3;
                if(map.get(x)%3!=0){
                    count++;
                }
            }
        return count;
    }
}
