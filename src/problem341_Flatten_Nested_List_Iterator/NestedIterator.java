package problem341_Flatten_Nested_List_Iterator;

import java.util.*;

/**
 * Created by cristph on 2016/5/18.
 */
public class NestedIterator implements Iterator<Integer> {

    private  List<Integer> list=new ArrayList<>();
    private int size;

    private int cursor=0;
    private int lastRet = -1;

    public NestedIterator(List<NestedInteger> nestedList) {
        list.clear();
        for(NestedInteger nestedInteger:nestedList){
            addElement(nestedInteger);
        }
        size=list.size();
    }

    private void addElement(NestedInteger nestedInteger){
        if(nestedInteger.isInteger()){
            list.add(nestedInteger.getInteger());
        }else{
            List<NestedInteger> nestedIntegerArrayList=nestedInteger.getList();
            for(NestedInteger nestedInteger1:nestedIntegerArrayList){
                addElement(nestedInteger1);
            }
        }
    }

    @Override
    public Integer next() {

        int i = cursor;    //记录索引位置
//        if (i >= size)    //如果获取元素大于集合元素个数，则抛出异常
//            throw new NoSuchElementException();
        Object[] elementData = list.toArray();
//        if (i >= elementData.length)
//            throw new ConcurrentModificationException();
        cursor = i + 1;      //cursor + 1
        return (Integer) elementData[lastRet = i];  //lastRet + 1 且返回cursor处元素

    }

    @Override
    public boolean hasNext() {
        return cursor!=size;
    }

}
