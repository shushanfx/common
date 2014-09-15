package com.shushanfx.commons.beanutil;

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by dengjianxin on 2014/9/15.
 */
public class PropertyUtilsTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Month month = new Month("Jan", 1);
        month.setDays(new int[] {1, 2, 3});

        System.out.println(PropertyUtils.getIndexedProperty(month, "days", 1));
    }
}
