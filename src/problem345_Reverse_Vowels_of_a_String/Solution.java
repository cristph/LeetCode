package problem345_Reverse_Vowels_of_a_String;

import java.util.ArrayList;

/**
 * Created by cristph on 2016/5/17.
 */
public class Solution {

    private char[] vowels={'a','e','i','o','u'};

    public String reverseVowels(String s) {

        ArrayList<Integer> poslist=new ArrayList<>();
        ArrayList<Character> charlist=new ArrayList<>();

        int length=s.length();
        int i=0;
        char cha='q';
        for(i=0;i<length;i++){
            cha=s.charAt(i);
            if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u'
                    ||cha=='A'||cha=='E'||cha=='I'||cha=='O'||cha=='U'){
                poslist.add(i);
                charlist.add(cha);
            }
        }

        char[] list=s.toCharArray();
        int num=poslist.size();
        int j=0;
        for(i=num-1;i>=0;i--){
            list[poslist.get(j)]=charlist.get(i);
            j++;
        }

        String res=new String(list);
        return res;
    }

    public static  void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.reverseVowels("hello"));
        System.out.println(solution.reverseVowels("leetcode"));
    }
}
