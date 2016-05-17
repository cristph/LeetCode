package problem344_Reverse_String;

/**
 * Created by cristph on 2016/5/17.
 */
public class Solution {
    public String reverseString(String s) {
        char[] list=s.toCharArray();
        int i=0;
        int j=list.length-1;
        char temp='q';
        while(i<j){
            temp=list[i];
            list[i]=list[j];
            list[j]=temp;
            i++;
            j--;
        }
        String res=new String(list);
        return res;
    }

    public static void main(String [] args){
        Solution solution=new Solution();
        System.out.println(solution.reverseString("hello"));
    }
}
