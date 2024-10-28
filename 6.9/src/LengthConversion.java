/*
6.9 (CONVERSIONS BETWEEN FEET AND METERS) Write a class that contains the following two methods:
public static double footToMeter(double foot)

Formulas:
meter = 0.305 * foot
foot = 3.279 * meter

 */


public class LengthConversion {
    public static double footToMeter(double foot) {

        // Return converted value in meters
        return 0.305 * foot;
    }

    public static double meterToFoot(double meters) {

        // Return converted value in feet
        return 3.280 * meters;
    }



    public static void main(String[] args) {


        System.out.println("Feet     Meters     |     Meters     Feet");
        System.out.println("-------------------------------------------");

        // Declare feet
        double feet = 1.0;

        // Declare meter
        double meters = 20.0;

        // Call footToMeter and return the result in meters
        double metersResult = footToMeter(feet);
        double feetResult = meterToFoot(meters);


        System.out.println(String.format("%4.1f", feet) + "      " + String.format("%.3f", metersResult)
            + "     |     " + String.valueOf(meters) + "       " + String.format("%.3f", feetResult));

        // Declare feet
        feet = 2.0;

        // Declare meter
        meters = 25.0;

        // Call footToMeter and return the result in meters
        metersResult = footToMeter(feet);
        feetResult = meterToFoot(meters);


        System.out.println(String.format("%4.1f", feet) + "      " + String.format("%.3f", metersResult)
                + "     |     " + String.valueOf(meters) + "       " + String.format("%.3f", feetResult));

        // Declare feet
        feet = 3.0;

        // Declare meter
        meters = 30.0;

        // Call footToMeter and return the result in meters
        metersResult = footToMeter(feet);
        feetResult = meterToFoot(meters);


        System.out.println(String.format("%4.1f", feet) + "      " + String.format("%.3f", metersResult)
                + "     |     " + String.valueOf(meters) + "       " + String.format("%.3f", feetResult));
        // Declare feet
        feet = 4.0;

        // Declare meter
        meters = 35.0;

        // Call footToMeter and return the result in meters
        metersResult = footToMeter(feet);
        feetResult = meterToFoot(meters);


        System.out.println(String.format("%4.1f", feet) + "      " + String.format("%.3f", metersResult)
                + "     |     " + String.valueOf(meters) + "       " + String.format("%.3f", feetResult));

        // Declare feet
        feet = 5.0;

        // Declare meter
        meters = 40.0;

        // Call footToMeter and return the result in meters
        metersResult = footToMeter(feet);
        feetResult = meterToFoot(meters);


        System.out.println(String.format("%4.1f", feet) + "      " + String.format("%.3f", metersResult)
                + "     |     " + String.valueOf(meters) + "       " + String.format("%.3f", feetResult));

        // Declare feet
        feet = 6.0;

        // Declare meter
        meters = 45.0;

        // Call footToMeter and return the result in meters
        metersResult = footToMeter(feet);
        feetResult = meterToFoot(meters);


        System.out.println(String.format("%4.1f", feet) + "      " + String.format("%.3f", metersResult)
                + "     |     " + String.valueOf(meters) + "       " + String.format("%.3f", feetResult));

        // Declare feet
        feet = 7.0;

        // Declare meter
        meters = 50.0;

        // Call footToMeter and return the result in meters
        metersResult = footToMeter(feet);
        feetResult = meterToFoot(meters);


        System.out.println(String.format("%4.1f", feet) + "      " + String.format("%.3f", metersResult)
                + "     |     " + String.valueOf(meters) + "       " + String.format("%.3f", feetResult));

        // Declare feet
        feet = 8.0;

        // Declare meter
        meters = 55.0;

        // Call footToMeter and return the result in meters
        metersResult = footToMeter(feet);
        feetResult = meterToFoot(meters);


        System.out.println(String.format("%4.1f", feet) + "      " + String.format("%.3f", metersResult)
                + "     |     " + String.valueOf(meters) + "       " + String.format("%.3f", feetResult));

        // Declare feet
        feet = 9.0;

        // Declare meter
        meters = 60.0;

        // Call footToMeter and return the result in meters
        metersResult = footToMeter(feet);
        feetResult = meterToFoot(meters);


        System.out.println(String.format("%4.1f", feet) + "      " + String.format("%.3f", metersResult)
                + "     |     " + String.valueOf(meters) + "       " + String.format("%.3f", feetResult));

        // Declare feet
        feet = 10.0;

        // Declare meter
        meters = 65.0;

        // Call footToMeter and return the result in meters
        metersResult = footToMeter(feet);
        feetResult = meterToFoot(meters);


        System.out.println(String.format("%4.1f", feet) + "      " + String.format("%.3f", metersResult)
                + "     |     " + String.valueOf(meters) + "       " + String.format("%.3f", feetResult));



        // Declare i at 0 and transfer the value of i to the footToMeter method
//        for (double i = 0.0; i < 10; i++) {
//
//            // Display the returned value for foot to meter conversion
////            System.out.print("Feet     Meters " + footToMeter(i));
//        }

        // Declare i at 0 and transfer the value of i to the footToMeter method
//        for (double i = 20.0; i < 10; i++) {
//
//            // Display the returned value for foot to meter conversion
////            System.out.println("foot is " + Metertofoot(i));
//        }


    }
}