package com.shushanfx.commons.cli;

import org.apache.commons.cli.*;

import java.util.Scanner;

/**
 * Created by shushanfx-ubantu on 9/14/14.
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        CommandLineParser parser = new BasicParser( );
        Options options = new Options( );
        options.addOption("h", "help", false, "Print this usage information");
        options.addOption("v", "verbose", false, "Print out VERBOSE information" );
        options.addOption("f", "file", true, "File to save program output to");

        Scanner scanner = new Scanner(System.in);
        HelpFormatter formatter = new HelpFormatter();

        while(true){
            System.out.print("Please input a command => ");
            String line = scanner.nextLine();
            String[] lines = line.split(" ");
            // Parse the program arguments
            CommandLine commandLine = parser.parse( options, lines);
            // Set the appropriate variables based on supplied options
            boolean verbose = false;
            String file = "";

            if( commandLine.hasOption('h') ) {
                formatter.printHelp("type h to get the help information...", options);
            }
            if( commandLine.hasOption('v') ) {
                verbose = true;
            }
            if( commandLine.hasOption('f') ) {
                file = commandLine.getOptionValue('f');
                System.out.println("Get the file name : " + file);
            }
        }


    }
}
