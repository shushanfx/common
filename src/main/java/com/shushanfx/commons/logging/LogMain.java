package com.shushanfx.commons.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: dengjianxin
 * Date: 14-9-4
 * Time: ионГ11:11
 * To change this template use File | Settings | File Templates.
 */
public class LogMain {
    private static Logger logger = Logger.getLogger("com.shushanfx.commons.logging.LogMain");
    static {
        logger.addHandler(new ConsoleHandler());
        //logger.setLevel(Level.FINE);
    }

    public static void main(String[] args) {
        logger.log(Level.INFO, "hello");
    }
}
