package problems;

import java.util.HashMap;
import java.util.Map;

public class GoodStrings {

    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"},"usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp"));
        System.out.println(countCharacters(new String[]{"hello","world","leetcode"},"welldonehoneyr"));
        System.out.println(countCharacters(new String[]{"cat","bt","hat","tree"},"atach"));
    }
    public static int countCharacters(String[] words, String chars) {
        int result =0;
        Map<Character, Integer> countsMap = new HashMap<>();
        for(char ch: chars.toCharArray()){
            countsMap.put(ch,countsMap.getOrDefault(ch,0)+1);
        }
        for(String word : words){
            if(isConsistentString(chars,word,countsMap)){
                result = result+word.length();
            }
        }

        return result;
    }

    static Boolean isConsistentString(String str1,String str2, Map<Character, Integer> charsMap){
        Map<Character, Integer> countsMap = new HashMap<>();
        for(int i=0;i<str2.length();i++){
            if(!str1.contains(String.valueOf(str2.charAt(i))) || charsMap.get(str2.charAt(i))>charsMap.get(str2.charAt(i)) ){
                return false;
            }
            countsMap.put(str2.charAt(i),1);
        }
        return true;
    }
}
