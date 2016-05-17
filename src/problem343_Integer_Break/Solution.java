package problem343_Integer_Break;

import java.util.ArrayList;

/**
 * Created by cristph on 2016/5/17.
 */
public class Solution {
    public int integerBreak(int n) {

        if(n==1||n==2){
            return 1;
        }

        if(n==3){
            return 2;
        }

        int max_nums=n/2;
        int i=max_nums;

        int max_value=1;
        ArrayList<Integer> list=new ArrayList<>();

        //分成i份
        while(i>=2){

            //每一份最小值
            int small_num=n/i;
            list.add(small_num);

            int rest_i=i-1;
            float rest_n=n-small_num;
            //加完剩余值
            while(rest_i>=1){
                small_num=Math.round(rest_n/rest_i);
                list.add(small_num);
                rest_i--;
                rest_n=rest_n-small_num;
            }

            int temp=1;
            for(Integer integer:list){
                temp=temp*integer;
            }
            if(temp>=max_value){
                max_value=temp;
            }
            i--;
            list.clear();
        }

        return max_value;
    }


    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.integerBreak(4));
    }
}
