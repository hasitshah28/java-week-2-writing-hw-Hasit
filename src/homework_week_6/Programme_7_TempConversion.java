package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenhit : ");
        float temp = scanner.nextFloat();
        //Object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTempToDegreeCelcius(temp);
        //Closing scanner
        scanner.close();
    }
    //Temperaure conversion method
    public void convertTempToDegreeCelcius(float temp){
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The Temperature " + temp + " fahrenhit is equal to " + c + " celcious ");

    }
}
