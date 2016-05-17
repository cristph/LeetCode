package problem347_Top_K_Frequent_Elements;

import java.util.*;

/**
 * Created by cristph on 2016/5/10.
 */
public class Solution {

    public List<Integer> topKFrequent(int[] nums, int k) {

        int length=nums.length;
        ArrayList<Integer> list=new ArrayList<>();

        for(Integer i:nums){
            list.add(i);
        }

        Collections.sort(list);

        for(Integer i:list){
            System.out.print(" "+i);
        }
        System.out.println();

        Map<Integer,Integer> map=new HashMap<Integer, Integer>() ;
        int pre=0;
        int pos=0;

        int num=0;
        int number=0;
        while(pre<=length-1){

            boolean sign=false;
            number=list.get(pre);
            while(number==list.get(pos)){
                if(pos<=length-1){
                    pos++;
                    if(pos==length-1){

                        if(pos==pre+1){
                            if(number!=list.get(pos)){
                                map.put(number,1);
                                map.put(list.get(pos),1);
                                sign=true;
                                break;
                            }
                        }

                        num=pos-pre+1;
                        map.put(number,num);
                        sign=true;
                        break;
                    }
                }
            }
            if(sign){
                break;
            }

            num=pos-pre;
            map.put(number,num);

            pre=pos;
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println("number:"+entry.getKey()+"  num:"+entry.getValue());
        }

        Map<Integer,Integer> res=new HashMap<Integer, Integer>() ;
        ArrayList<Map.Entry<Integer,Integer>> ress=new ArrayList<>();
        int i=1;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(i<=k){
                res.put(key,value);
                ress.add(entry);
            }
            if(i==k){

            }


        }





        return null;
    }

    public static  void main(String[] args){
        int[] nums={1,3,5,4,7,6,1,1,2,2,3};
        Solution solution=new Solution();
        solution.topKFrequent(nums,3);
    }

}
