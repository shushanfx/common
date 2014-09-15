package com.shushanfx.commons.beanutil;

import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by dengjianxin on 2014/9/15.
 */
public class ConstructorUtilsTest {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Object obj=  ConstructorUtils.invokeConstructor(Month.class, new Object[]{ "Jan", new Integer(1)});
        System.out.println(PropertyUtils.getProperty(obj, "name"));
    }
}
