package problems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MinimumIndexSumofTwoLists {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"})));
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},new String[]{"KFC","Shogun","Burger King"})));
        System.out.println(Arrays.toString(findRestaurant(new String[]{"happy","sad","good"},new String[]{"sad","happy","good"})));
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},new String[]{"sad","happy","good"})));


    }

    public  static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> stringCount = new LinkedHashMap<>();
        for(int i=0;i<list1.length;i++){
            stringCount.put(list1[i],i);
        }
        int index = Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            if(stringCount.containsKey(list2[i])){
                if(stringCount.get(list2[i])+i < index){
                    index = stringCount.get(list2[i])+i;
                }
                stringCount.put(list2[i],stringCount.get(list2[i])+i );
            }
        }
        String result ="";

        for(int i=0;i<list2.length;i++){
            if(stringCount.containsKey(list2[i])){
                if(stringCount.get(list2[i]) == index){
                    result = result+"&&"+ list2[i];
                }

            }
        }
        if(result.startsWith("&&")){
            return result.substring(2).split("&&");
        }
        else{
            return new String[]{};
        }

    }
}
