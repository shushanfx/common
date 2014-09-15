package com.shushanfx.commons.io;

import org.apache.commons.io.FileSystemUtils;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: dengjianxin
 * Date: 14-9-3
 * Time: обнГ4:10
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print(FileSystemUtils.freeSpaceKb("C:"));

    }
}
