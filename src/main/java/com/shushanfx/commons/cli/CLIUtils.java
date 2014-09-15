package com.shushanfx.commons.cli;

import org.apache.commons.cli.*;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by dengjianxin on 2014/9/15.
 */
public final class CLIUtils {
    private static Map<String, Options> map = new ConcurrentHashMap<String, Options>(20);

    private static final Scanner scanner = new Scanner(System.in);
    private static final String userDir = System.getProperty("user.dir") + " > ";
    private static final CommandLineParser parser = new BasicParser();

    public static CommandLine commandLine(String pattern) throws ParseException {
        Options options = map.get(pattern);
        if(options==null){
            options = PatternOptionBuilder.parsePattern(pattern);
            map.put(pattern, options);
        }
        System.out.print(userDir);
        String str = scanner.nextLine();
        return parser.parse(options, str.split(" "));
    }

    public static void showHelper(CommandLine commandLine){
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        for(Option option : commandLine.getOptions()){
            options.addOption(option);
        }
        formatter.printHelp("The help string -> ", options);
    }
}
