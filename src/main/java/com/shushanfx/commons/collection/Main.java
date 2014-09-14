package com.shushanfx.commons.collection;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.map.LinkedMap;

/**
 * Created by shushanfx-ubantu on 9/14/14.
 */
public class Main {
    public static void main(String[] args) {
        IterableMap map = new HashedMap();
        for (int i = 0; i < 10; i++) {
            map.put("key" + i, "value" + i);
        }
        MapIterator it = map.mapIterator();
        int count = 0;
        while (it.hasNext()) {
            Object key = it.next();
            Object value = it.getValue();

            System.out.println(key + ":" + value);
            count ++ ;

            it.setValue(count);
            System.out.println("new value -> " + key + ":" + it.getValue());
        }

        orderedMap();
        bags();
    }

    public static void orderedMap(){
        System.out.println("Ordered Map =======>");
        OrderedMap map = new LinkedMap();
        map.put("FIVE", "5");
        map.put("SIX", "6");
        map.put("SEVEN", "7");
        System.out.println(map.firstKey());  // returns "FIVE"
        System.out.println(map.nextKey("FIVE"));  // returns "SIX"
        //map.nextKey("SIX");  // returns "SEVEN"


    }

    public static void bags(){
        System.out.println("Bags =======>");

        Bag bag = new HashBag();
        bag.add("ONE", 6);  // add 6 copies of "ONE"
        bag.remove("ONE", 2);  // removes 2 copies of "ONE"
        System.out.println(bag.getCount("ONE"));  // returns 4, the number of copies in the bag (6 - 2)
    }
}
