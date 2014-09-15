package com.shushanfx.commons.configuration;

import org.apache.commons.configuration.*;

/**
 * Created by dengjianxin on 2014/9/15.
 */
public class Main {
    public static void main(String[] args) throws ConfigurationException {
        CompositeConfiguration config = new CompositeConfiguration();
        //System.out.println(System.getProperty("user.dir"));
        AbstractFileConfiguration temp1 = new PropertiesConfiguration("conf/application.properties");

        //System.out.println(temp1.getBasePath());
        config.addConfiguration(new SystemConfiguration());
        config.addConfiguration(temp1);

        System.out.println(config.getProperty("hello"));
        System.out.println(config.getProperty("world"));

    }
}
