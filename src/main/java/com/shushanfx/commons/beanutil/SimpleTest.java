package com.shushanfx.commons.beanutil;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by dengjianxin on 2014/9/15.
 */
public class SimpleTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        long start = System.currentTimeMillis();
        Month month = new Month("Jan", 1);
        System.out.println(BeanUtils.getProperty(month, "value"));
        System.out.println(month);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        Month month1 = new Month();
        BeanUtils.copyProperties(month1, month);
        System.out.println(month1);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        Month month2 = (Month) BeanUtils.cloneBean(month);
        System.out.println(month2);
        System.out.println(System.currentTimeMillis() - start);
    }
}
