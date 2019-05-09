package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionColl {

    public static void main(String[] args){

            Collection<String> myColl = new ArrayList<String>();
        myColl.add("aaa");
        myColl.add("bbbb");
        myColl.add("cccccc");
        System.out.println(myColl);
        int sizeOfColl = myColl.size();
        System.out.println(sizeOfColl);
        myColl.clear();
        System.out.println(myColl);

        Collection<String> myColl1 = new ArrayList<String>();
        myColl1.add("aaabbb");
        myColl1.add("bbbbcccc");
        myColl1.add("ccccccdddddd");
        Object[] myArrObj = myColl1.toArray();
        String[] myArrStr = myColl1.toArray(new String[3]);
        System.out.println(Arrays.toString(myArrObj));
        System.out.println(Arrays.toString(myArrStr));
        Iterator<String> itrac = myColl1.iterator();
        while (itrac.hasNext()) {
            String element = itrac.next();
            System.out.println(element + "");

            myColl.add("aaa");
            myColl.add("bbbb");
            myColl.add("cccccc");
            myColl.add("dddd");
            System.out.println(myColl);
            Iterator<String> itr = myColl.iterator();
            while (itr.hasNext()) {
               itr.next();
               itr.remove();
            }
            System.out.println(myColl);
        }
    }
}


