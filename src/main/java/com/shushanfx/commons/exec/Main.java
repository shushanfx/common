package com.shushanfx.commons.exec;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.environment.EnvironmentUtils;

import java.io.IOException;
import java.util.Map;

/**
 * Created by dengjianxin on 2014/9/15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String line = "java -version";
        CommandLine cmdLine = CommandLine.parse(line);
        DefaultExecutor executor = new DefaultExecutor();
        //executor.setExitValue(1);
        //ExecuteWatchdog watchdog = new ExecuteWatchdog(60000);
        //executor.setWatchdog(watchdog);
        int exitValue = executor.execute(cmdLine);

        Map<String, String> map = EnvironmentUtils.getProcEnvironment();
        for(String key : map.keySet()){
            System.out.println(key + "=" + map.get(key));
        }
    }
}
