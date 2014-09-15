package com.shushanfx.commons.beanutil;

/**
 * Created by dengjianxin on 2014/9/15.
 */
public class Month {
    private String name=null;
    private int value=0;
    private int[] days = null;

    public Month(String name, int value){
        this.name=name;
        this.value=value;
    }

    public Month(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int[] getDays() {
        return days;
    }

    public void setDays(int[] days) {
        this.days = days;
    }

    public String toString(){
        return name + ":" + value;
    }
}
