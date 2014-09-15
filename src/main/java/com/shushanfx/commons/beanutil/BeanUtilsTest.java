package com.shushanfx.commons.beanutil;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by dengjianxin on 2014/9/15.
 */
public class BeanUtilsTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Month month = new Month("Jan", 1);
        month.setDays(new int[]{1, 2, 3});

        Map map = BeanUtils.describe(month);

        Set keySet= map.keySet();
        for (Iterator iter = keySet.iterator(); iter.hasNext();) {
            Object element = iter.next();
            System.out.println("KeyClass:"+ element + ">" + element.getClass().getName());
            System.out.println("ValueClass:"+map.get(element).getClass().getName());
            System.out.print(element+"\t");
            System.out.print(map.get(element));
            System.out.println();
        }
    }
}
