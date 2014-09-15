package com.shushanfx.commons.compress;

import com.shushanfx.commons.cli.CLIUtils;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.ParseException;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by dengjianxin on 2014/9/15.
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        while(true){
            CommandLine line = CLIUtils.commandLine("us>t>b");
            String src = null, dst=null;
            boolean isZip = true;
            if(line.hasOption('b')){
                System.out.println("See you next time!");
                break;
            }
            if(line.hasOption('u')){
                isZip = false;
            }
            if(line.hasOption('s')){
                src = line.getOptionValue('s');
            }
            if(line.hasOption('t')){
                dst = line.getOptionValue('t');
            }
            if(StringUtils.isNotBlank(src)
                    && StringUtils.isNotBlank(dst)){
                if(isZip){
                    File file = new File(src);
                    ZipUtils.compressFiles2Zip(file.listFiles(new FileFilter() {
                        @Override
                        public boolean accept(File pathname) {
                            if(pathname.isDirectory()){
                                return false;
                            }
                            return true;
                        }
                    }), dst);
                }
                else{
                    ZipUtils.decompressZip(src, dst);
                }
            }
        }
    }
}
