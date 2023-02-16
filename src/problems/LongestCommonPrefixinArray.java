package problems;

public class LongestCommonPrefixinArray {
    public static void main(String[] args) {
        int n=4;
        String arr[] = {"geeksforgeeks", "geeks", "geek",
                "geezer"};
        System.out.println(longestCommonPrefix(arr,n));

    }
    public static String longestCommonPrefix(String arr[], int n){
        int len = Integer.MAX_VALUE;
        String output ="";
        for(String str : arr){
            if(str.length()<len){
                len = str.length();
                output = str;
            }
        }
        int j=1;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i=0;i<n;i++){
                if(!arr[i].startsWith(output)){
                    output = output.substring(0,len-j);
                    j++;
                    flag = true;
                    break;
                }
            }
        }
        if(output.length()<1){
            output ="-1";
        }
        return output;
    }
}
