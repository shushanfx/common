package com.shushanfx.commons.math3;

import org.apache.commons.math3.random.RandomDataGenerator;
import org.apache.commons.math3.stat.Frequency;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.regression.SimpleRegression;

/**
 * Created with IntelliJ IDEA.
 * User: dengjianxin
 * Date: 14-8-28
 * Time: обнГ12:12
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        int[] inputArray = new int[10];
        for(int i=1; i<=10; i++){
            inputArray[i-1]=i;
        }
        // Get a DescriptiveStatistics instance
        DescriptiveStatistics stats = new DescriptiveStatistics();

        // Add the data from the array
        for( int i = 0; i < inputArray.length; i++) {
            stats.addValue(inputArray[i]);
        }

        // Compute some statistics
        double mean = stats.getMean();
        double std = stats.getStandardDeviation();
        double median = stats.getPercentile(50);
        System.out.println(mean);
        System.out.println(std);
        System.out.println(median);


        System.out.println("---------Test for Frequency ..");
        Frequency f = new Frequency();
        f.addValue("one");
        f.addValue("One");
        f.addValue("oNe");
        f.addValue("Z");
        f.addValue("Z");
        System.out.println(f.getUniqueCount()); // displays 1
        System.out.println(f.getCumPct("Z"));  // displays 0.5
        System.out.println(f.getCumPct("Ot")); // displays 0.25



        System.out.println("-------------Test for SimpleExpression ..");
        double[][] data = { { 1, 3 }, {2, 5 }, {3, 7 }, {4, 14 }, {5, 11 }};
        SimpleRegression regression = new SimpleRegression(false);
//the argument, false, tells the class not to include a constant
        regression.addData(data);

        System.out.println(regression.getIntercept());
// displays intercept of regression line, since we have constrained the constant, 0.0 is returned

        System.out.println(regression.getSlope());
// displays slope of regression line

        System.out.println(regression.getSlopeStdErr());
// displays slope standard error

        System.out.println(regression.getInterceptStdErr() );
// will return Double.NaN, since we constrained the parameter to zero


        System.out.println("________________________________Test for random ..");
        RandomDataGenerator randomData = new RandomDataGenerator();
        for (int i = 0; i < 1000; i++) {
            //RandomDataGenerator randomData = new RandomDataGenerator();
            long value = randomData.nextLong(1, 1000000);
            System.out.println("random long: " + value);
        }

        System.out.println(randomData.nextHexString(10));
        System.out.println(randomData.nextSecureHexString(10));
        System.out.println(randomData.nextWeibull(1.1, 2.2));
    }
}
