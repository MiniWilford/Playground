
/*

    All code is used for educational purposes only

 */
public class Main {
    private static int milesPerGallon = 20;
    private static int odometer = 0;
    private static double gallonsOfGas = 10.0;

    int milesDriven = 100;
    public static void main(String[] args) {
        System.out.println("Hello!");

        int milesDriven = 100;
        drive(milesDriven);

        milesDriven = 60;
        drive(milesDriven);

        drive(90);
    }

    private static void drive(int milesDriven) {
        gallonsOfGas = gallonsOfGas - (milesDriven /milesPerGallon); // same as -= (milesdriven/milespergallon)
        odometer = odometer + milesDriven; //same as += shorthand method

        System.out.println("Odometer: " + odometer);
        System.out.println("Gallons of gas: " + gallonsOfGas);
    }
}