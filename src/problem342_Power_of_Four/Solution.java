package problem342_Power_of_Four;

/**
 * Created by cristph on 2016/5/17.
 */
public class Solution {
    public boolean isPowerOfFour(int num) {
        String s0=Integer.toBinaryString(num);
        int length=s0.length();
        if(length%2==0){
            return false;
        }else{
            if(s0.charAt(0)=='0'){
                return false;
            }else{
                boolean res=true;
                int i=1;
                for(i=1;i<length;i++){
                    if(s0.charAt(i)=='1'){
                        res=false;
                        break;
                    }
                }
                return res;
            }
        }
    }

    public static void main(String args[]){
        Solution solution=new Solution();
        System.out.println(solution.isPowerOfFour(5));
        System.out.println(solution.isPowerOfFour(25));
        System.out.println(solution.isPowerOfFour(256));
    }
}
