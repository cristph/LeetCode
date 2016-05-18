package problem338_Counting_Bits;

/**
 * Created by cristph on 2016/5/18.
 */
public class Solution {

    public int[] countBits(int num) {
        int i;
        int[] array=new int[num+1];
        for(i=0;i<=num;i++){
            int j=i;
            String str=Integer.toBinaryString(j);
            char[] char_array=str.toCharArray();
            int count=0;
            for(Character character:char_array){
                if(character=='1'){
                    count++;
                }
            }
            array[j]=count;
        }
        return array;
    }

    public static void main(String[] args){
        Solution solution=new Solution();
        int[] res=solution.countBits(5);
        for(Integer integer:res){
            System.out.print(integer+" ");
        }
    }
}
